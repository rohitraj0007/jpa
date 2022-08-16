package com.senseofcode.demo.jpademo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senseofcode.demo.jpademo.entity.Person;
import com.senseofcode.demo.jpademo.repository.PersonJdbcDao;
import com.senseofcode.demo.jpademo.repository.PersonPureJdbcDao;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner {

	@Autowired
	PersonJdbcDao personJdbcDao;

	@Autowired
	PersonPureJdbcDao personPureJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(personJdbcDao.findAll());
		System.out.println(personJdbcDao.findById(10002));
		System.out.println(personJdbcDao.deleteById(10002));
		System.out.println(personJdbcDao.insertIntoPerson(new Person(10004, "Siyaldah", "Amit", new Date())));
		System.out.println(personJdbcDao.updatePerson(new Person(10004, "Siyalda", "Amit Chowdhary", new Date())));
		System.out.println(personJdbcDao.findByIdUsingCustomeRowMapper(10004));
		System.out.println(personPureJdbcDao.findAll());

	}

}
