package com.cayti.terranova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cayti.terranova.model.User;
import com.cayti.terranova.repository.UserRepository;

@SpringBootApplication
public class TerranovaBackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TerranovaBackApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Angel Ivan", "Manoatl Hdez", "ivanmanoatl@live.com.mx"));
		this.userRepository.save(new User("Angeles", "Pineda", "angelespineda@live.com.mx"));
		this.userRepository.save(new User("Itzel", "Manoatl", "angelesmanoatl@live.com.mx"));

		
	}

}
