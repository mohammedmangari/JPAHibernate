package com.med.jpaExample;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args )
    {


    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    	EntityManager em =  emf.createEntityManager();

        developer dv = em.find(developer.class, 1);
        System.out.println(dv.getName()+ " " +dv.getLangauge());

        developer dev1 = new developer();
    	dev1.setId(5);
    	dev1.setName("mohammed");
    	dev1.setLangauge("C");



    	em.getTransaction().begin();
    	em.persist(dev1);
    	em.getTransaction().commit();





    }
}
