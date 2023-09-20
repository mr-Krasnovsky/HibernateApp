package org.example.HibernateApp;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
	Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.getCurrentSession();
	try {
	    session.beginTransaction();

//	    List<Person> people = session.createQuery("From Person").getResultList();						-  выбрать все PERSON
//
//	    for(Person per: people) {
//		System.out.println(per);
//	    }

//	    List<Person> people = session.createQuery("From Person WHERE age > 30").getResultList();				-  выбрать все PERSON чей AGE > 30
//	    for (Person per : people) {
//		System.out.println(per);
//	    }

//	    List<Person> people = session.createQuery(" update Person SET name = 'Test' WHERE name Like 'T%'").getResultList();	- обновить имена PERSON чьё name начинается на T
//
//	    for (Person per : people) {
//		System.out.println(per);
//	    }

//	    session.createQuery("update Person set name = 'Test' WHERE age < 30").executeUpdate();				- обновить имена PERSON чей AGE < 30

//	    session.createQuery("delete from Person where age < 30").executeUpdate();						- удалить все PERSON чей AGE < 30

	    session.getTransaction().commit();

	} finally {
	    sessionFactory.close();
	}
    }
}
