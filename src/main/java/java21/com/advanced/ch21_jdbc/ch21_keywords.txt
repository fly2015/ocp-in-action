Data is information -
	-> A database is an organized collection of data
JDBC 
	-> Java Database Connectivity Language
	
Java Persistence API (JPA)
	-> Accesses data through Java objects using a concept called object‐relational mapping (ORM)

Structured Query Language (SQL)
JDBC works by sending a SQL
command to the database and then processing the response.

NoSQL database
graph‐based databases

in‐memory database

Five key interfaces of JDBC
 - Driver -> Establishes a connection to the database
 - Connection -> Sends commands to a database
 - PreparedStatement -> Executes a SQL query
 - Callable Statement -> Executes commands stored in the database
 - ResultSet -> Reads results of a query
 
Connecting to a Database
	BUILDING A JDBC URL
	Protocol:Subprotocol(Product/Vendor name):Subname(DB specific connection details)
	E.g. jdbc:derby:zoo
	- A location can be localhost or an IP address or a domain name
	
GETTING A DATABASE CONNECTION
	 There are two main ways to get a Connection: DriverManager or DataSource.
Using a DataSource
	 - In real applications, you should use a DataSource rather than DriverManager to get a Connection
	 + DataSource do not reveal password.
	 + DataSource maintains a connection pool so that you can keep reusing the same
	connection rather than needing to get a new one each time.
	* DriverManager.getConnection(url);
	
USING CLASS.FORNAME()
	It was required with older drivers (that were designed for older versions of JDBC) before getting a Connection	

Working with a PreparedStatement
	Statement 
	PreparedStatement ->  takes parameters
	
	PreparedStatement is far superior for the following reasons:
	- Performance: cache
	- Security:  against SQL injection
	- Readability: not deal with string concatenation
	- Future use: update sql later using parameters

OBTAINING A PREPAREDSTATEMENT
		* Conn.prepareStatement(sql)
		- Passing a SQL statement when creating the object is mandatory
		- There are overloaded signatures that allow you to specify a ResultSet type and concurrency mode

EXECUTING A PREPAREDSTATEMENT
Modifying Data with ps.executeUpdate()  
	DELETE/INSERT/UPDATE
	- It returns the number of rows that were inserted, deleted, or changed. 
	
Reading Data with ps.executeQuery()
	SELECT
	
Processing Data with ps.execute()
			ps.getResultSet()
			ps.getUpdateCount()
	DELETE/INSERT/UPDATE/SELECT	
			
* if we use the wrong method for a SQL statement-> 	SQLException	
We can't get a compiler error since the SQL is a String

WORKING WITH PARAMETERS
	- A bind variable is a placeholder that lets you specify the actual values at runtime
	*** the bind variables are counted starting with 1 rather than 0
	- set the parameters out of order is OK
	- if you don't set all the bind variables -> SQLException
	- set more values than you have as bind variables -> SQLException
	** Notice the setObject() method works with any Java type
	- If you pass a primitive, it will be autoboxed into a wrapper type

COMPILE VS. RUNTIME ERROR WHEN EXECUTING	
	- Remember that PreparedStatement extends Statement 
	The Statement interface does accept a SQL statement at the time of execution, so the code compiles.
	- PreparedStatement.executeUpdate(sql) ->  SQLException at runtime
	
UPDATING MULTIPLE TIMES
	->  PreparedStatement retain already set parameter after the first execute
	
BATCHING STATEMENTS
	- run multiple statements in fewer trips to the database
	(save network call)
	 addBatch()
	 int[] result = executeBatch()
	 
	- you should call executeBatch() at a set interval, such as every 10,000 records (rather than after ten million).

Getting Data from a ResultSet
	- A ResultSet has a cursor, which points to the current location in the data	
	- get value from index or column name
	- Attempting to access a column name or index that does not
	exist throws a SQLException
	
	- Always use an if statement or while loop when calling rs.next().
	- Column indexes begin with 1
	
GETTING DATA FOR A COLUMN
	No getByte(), getChar(), getFloat()
	The getObject() method can return any type.	For a primitive, it
	uses the wrapper class
	
USING BIND VARIABLES
	- we can nest try‐with‐resources to handle both ps with binding and rs

Calling a CallableStatement
	A stored procedure is code that is compiled in advance and stored in the database
	- Using a stored procedure reduces network round‐trips
	- It also allows database experts to own that part of the code
	- stored procedures are database‐specific and introduce complexity of maintaining your application

CALLING A PROCEDURE WITHOUT PARAMETERS
	String sql = "{call read_e_names()}";
	- CallableStatement cs = conn.prepareCall(sql)

PASSING AN IN PARAMETER
	var sql = "{call read_names_by_letter(?)}";	
	- CallableStatement cs = conn.prepareCall(sql)
	We can use either the parameter number(starting with 1) or the parameter name.

RETURNING AN OUT PARAMETER
	var sql = "{?= call magic_number(?) }";
	?= This is optional since we have the OUT parameter, but it does aid in readability.
	- CallableStatement cs = conn.prepareCall(sql)
	cs.registerOutParameter(1, Types.INTEGER);
	
WORKING WITH AN INOUT PARAMETER
	
COMPARING CALLABLE STATEMENT PARAMETERS		
	
Closing Database Resources
	** Closing a JDBC resource should close any resources that it created.
	- Closing a Connection also closes PreparedStatement (or CallableStatement) and ResultSet.
	- Closing a PreparedStatement (or CallableStatement) also closes the ResultSet.
	
WRITING A RESOURCE LEAK
	- Avoid bad code
	- JDBC automatically closes a ResultSet when you run another SQL statement from
	the same Statement	

DEALING WITH EXCEPTIONS
	 getMessage() method returns a human‐ readable message as to what went wrong
	 getSQLState() method returns a code as to what went wrong	
	 getErrorCode() is a database‐specific code
	 
	

Using Additional Options
	ResultSet.TYPE_FORWARD_ONLY			 ->  Can go through the ResultSet only one row at a time
	ResultSet.TYPE_SCROLL_INSENSITIVE	 ->  Can go through the ResultSet in any
											 order but will not see changes made to the underlying database table	
	ResultSet.TYPE_SCROLL_SENSITIVE		 ->  Can go through the ResultSet in any order
											 and will see changes made to the underlying database table
	
	ResultSet.CONCUR_READ_ONLY           ->  The ResultSet cannot be updated.
	ResultSet.CONCUR_UPDATABLE			 ->  The ResultSet can be updated.
	

Controlling Data with Transactions
	Autocommit Edge Cases
	- setAutoCommit(true)  -> each statement is automatically committed
	- setAutoCommit(false) -> close connection without action, the behavior is unpredict(commit/roll back) 	
	
Bookmarking with Savepoints
		