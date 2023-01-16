package com.med.jpaExample;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args )
    {

    	developer dev1 = new developer();

    	// for example we use this data developer [id=5,name="mohammed",langauge="C"]
    	dev1.setId(5);
    	dev1.setName("mohammed");
    	dev1.setLangauge("C");


    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    	EntityManager em =  emf.createEntityManager();


       //we use find for fitch data from database
      //developer dv = em.find(developer.class, 1);
      //System.out.println(dv.getName());

    	//we use persist method for insert data to data base

    	em.getTransaction().begin();
    	em.persist(dev1);
    	em.getTransaction().commit();

    	// you run this application and check your database
    	// now you well see that new ligne are creted in your table developer



    }
}
