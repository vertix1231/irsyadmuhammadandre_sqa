package com.juaracoding.tigabelas.tugaspostest.kecepatanrata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.tigabelas.tugaspostest.kecepatanrata.KecepatanRata;

public class TestKecepatanRata {
	KecepatanRata kecepatanRata;

	@Before
	public void setUp() throws Exception {
		kecepatanRata = new KecepatanRata();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKecRata() {
		assertEquals(40.0, kecepatanRata.kecRata(-200, -5),0.0);
	}

}
