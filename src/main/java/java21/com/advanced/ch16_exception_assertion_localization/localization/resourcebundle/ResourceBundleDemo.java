/*
 * ResourceBundleDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch16_exception_assertion_localization.localization.resourcebundle;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ResourceBundleDemo
{
    public static void printWelcomeMessage(Locale locale) throws MalformedURLException
    {
        String absolutePath = java.nio.file.FileSystems.getDefault().getPath("").toAbsolutePath() + "\\data";
        File file = new File(absolutePath);
        URL[] urls = {file.toURI().toURL()};
        ClassLoader loader = new URLClassLoader(urls);
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale, loader);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }


    public static void main(String[] args) throws MalformedURLException
    {
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");
        printWelcomeMessage(us); // Hello, The zoo is open
        printWelcomeMessage(france); // Bonjour, Le zoo estouvert
    }
}


/*
 * Changes:
 * $Log: $
 */