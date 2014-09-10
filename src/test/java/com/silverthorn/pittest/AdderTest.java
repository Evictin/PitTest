package com.silverthorn.pittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:**/META-INF/applicationContext*.xml"})
public class AdderTest {

	@Autowired
	private Adder adder;
	
	@Test
	public void testAdd() {
		assertEquals(2, adder.add(1, 1));
	}

	@Test
	public void testAddAgain() {
		assertEquals(4, adder.add(2, 2));
	}

}
