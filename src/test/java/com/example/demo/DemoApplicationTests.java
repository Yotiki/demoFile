package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.security.SecureRandom;

public class DemoApplicationTests {

	@Test
	public void contextLoads() throws Exception {
		Robot robot = new Robot();
		SecureRandom random = new SecureRandom();
		while (true) {
			robot.mouseMove(random.nextInt(400), random.nextInt(400));
			Thread.sleep(0);
		}
	}

}

