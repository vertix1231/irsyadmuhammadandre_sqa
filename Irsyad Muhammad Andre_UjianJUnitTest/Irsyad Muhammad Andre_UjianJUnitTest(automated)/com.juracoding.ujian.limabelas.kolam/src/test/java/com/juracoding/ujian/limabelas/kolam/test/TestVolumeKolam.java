package com.juracoding.ujian.limabelas.kolam.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import com.juracoding.ujian.limabelas.kolam.fungsi.VolumeKolam;

@RunWith(JUnitParamsRunner.class)
public class TestVolumeKolam {
	
	VolumeKolam volumeKolam;

	@Before
	public void setUp() throws Exception {
		volumeKolam = new VolumeKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/volumekolamirsyad.csv")
	public void testHitungVolumegKolam(double panjang,double lebar,double tinggi,double hasilvolume) {
		assertEquals(hasilvolume, volumeKolam.HitungVolumegKolam(panjang, lebar, tinggi),0);
	}

}
