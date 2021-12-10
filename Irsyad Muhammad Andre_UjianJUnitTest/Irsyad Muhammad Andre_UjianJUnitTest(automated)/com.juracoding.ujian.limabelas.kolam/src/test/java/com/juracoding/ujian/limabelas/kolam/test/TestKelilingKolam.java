package com.juracoding.ujian.limabelas.kolam.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import com.juracoding.ujian.limabelas.kolam.fungsi.KelilingKolam;


@RunWith(JUnitParamsRunner.class)
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
	@FileParameters("src/test/resources/kelilingkolamirsyad.csv")
	public void testHitungKelilingKolam(double panjang,double lebar,double tinggi,double keliling) {
		assertEquals(keliling, kelilingKolam.HitungKelilingKolam(panjang, lebar, tinggi),0.000001);
	}
	

}
