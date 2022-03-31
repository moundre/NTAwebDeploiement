package com.example.NTA;

import com.example.NTA.Enumeration.Etat;
import com.example.NTA.Enumeration.Genre;
import com.example.NTA.Model.Admin;

import com.example.NTA.Service.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NtaApplication implements CommandLineRunner{
	@Autowired
	AdminServiceImp adminServiceImp;

	public static void main(String[] args) {
		SpringApplication.run(NtaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Admin adm = new Admin(null, "Modibo SAMAKE", "moundresamake@gmail.com", "moundre1996", "van", 74765475L, "", Genre.homme, Etat.active);
		adminServiceImp.postadmin(adm);
	}

}
