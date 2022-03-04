/*
 * SerialCloneHelper.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package hng;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SerialCloneHelper
{
    private static class CloneInput extends ObjectInputStream {

        private final CloneOutput output;

        protected Class resolveClass(ObjectStreamClass osc) throws IOException, ClassNotFoundException {
            Class c = (Class) output.classQueue.poll();
            String expected = osc.getName();
            String found = null;
            if (c != null)
                found = c.getName();
            if (!expected.equals(found))
                throw new InvalidClassException((new StringBuilder()).append("Classes desynchronized: found ")
                        .append(found).append(" when expecting ").append(expected).toString());
            else
                return c;
        }

        protected Class resolveProxyClass(String interfaceNames[]) throws IOException, ClassNotFoundException {
            return (Class) output.classQueue.poll();
        }

        CloneInput(InputStream in, CloneOutput output) throws IOException {
            super(in);
            this.output = output;
        }
    }

    private static class CloneOutput extends ObjectOutputStream {

        private Queue classQueue;

        protected void annotateClass(Class c) {
            classQueue.add(c);
        }

        protected void annotateProxyClass(Class c) {
            classQueue.add(c);
        }

        CloneOutput(OutputStream out) throws IOException {
            super(out);
            classQueue = new LinkedList();
        }
    }

    private SerialCloneHelper() {
    }

    public static Object clone(Object x) {
        try {
            return cloneX(x);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static Object cloneX(Object x) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        CloneOutput cout = new CloneOutput(bout);
        cout.writeObject(x);
        byte bytes[] = bout.toByteArray();
        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        CloneInput cin = new CloneInput(bin, cout);
        Object clone = cin.readObject();
        cin.close();
        return clone;
    }
}



/*
 * Changes:
 * $Log: $
 */