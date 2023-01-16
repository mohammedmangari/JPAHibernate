# JAP _ Hibernate


  This is a simple example of how to use the Java Persistence API (JPA) to interact with a relational database. The example creates an EntityManagerFactory and an EntityManager, which are used to interact with the database.

  The first line of the main method creates an EntityManagerFactory with the persistence unit name "myPU". A persistence unit defines a set of related mappings and configurations for a specific database.

  The second line creates an EntityManager, which is the main object used to interact with the database.

  The EntityManager's find method is used to fetch a developer object from the database using the primary key value of 1. The developer object's name and language properties are then printed to the console.

  The example then creates a new developer object, sets its properties, and uses the EntityManager's persist method to insert the new developer object into the database. This will insert a new row into the developer table.

  The code then starts a new transaction, persists the new developer object into the database, and commits the transaction. This way we can insert new rows in to the table.
