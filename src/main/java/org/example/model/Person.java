package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator_person")
    @SequenceGenerator(name = "seq_generator_person", sequenceName = "person_id_sec", allocationSize = 1)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
    }
}
