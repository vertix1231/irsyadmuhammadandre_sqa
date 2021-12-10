package com.juaracoding.ujian.limabelas.irsyadma.kolam.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.ujian.limabelas.irsyadma.kolam.KelilingKolam;

public class TestKelilingKolam {
	KelilingKolam kelilingKolam;

	@Before
	public void setUp() throws Exception {
		kelilingKolam = new KelilingKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHitungKelilingKolam() {
		assertEquals(82, kelilingKolam.HitungKelilingKolam(5.5, 12, 3),0);
	}
	
	@Test
	public void testHitungKelilingKolamBukanAngka() {
		assertEquals(82, kelilingKolam.HitungKelilingKolam("asa", 'a', "@"),0);
	}
	
	@Test
	public void testHitungKelilingKolamNegatifAngka() {
		assertEquals(82, kelilingKolam.HitungKelilingKolam(-5.5, -12, -3),0);
	}
	
	@Test
	public void testHitungKelilingKolamTakAdaInput() {
		assertEquals(82, kelilingKolam.HitungKelilingKolam(),0);
	}

}
