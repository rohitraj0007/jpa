package com.senseofcode.demo.jpademo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senseofcode.demo.jpademo.entity.Person;
import com.senseofcode.demo.jpademo.repository.PersonJpaRepository;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner {

	@Autowired
	PersonJpaRepository jpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// System.out.println(personJdbcDao.findAll());
		System.out.println(jpaRepository.findById(10002));
		 jpaRepository.deleteById(10002);
		 System.out.println(jpaRepository.update(new Person(
		 "Siyaldah", "Amit", new Date())));
		 System.out.println(jpaRepository.update(new Person(1, "Siyalda",
		 "Amit Chowdhary", new Date())));
		// System.out.println(personJdbcDao.findByIdUsingCustomeRowMapper(10004));
		 System.out.println(jpaRepository.findAll());

	}

}
