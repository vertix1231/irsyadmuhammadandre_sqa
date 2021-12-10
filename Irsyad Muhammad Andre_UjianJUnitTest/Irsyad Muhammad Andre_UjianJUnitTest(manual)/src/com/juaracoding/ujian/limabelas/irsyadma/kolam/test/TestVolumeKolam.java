package com.juaracoding.ujian.limabelas.irsyadma.kolam.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.ujian.limabelas.irsyadma.kolam.VolumeKolam;

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
	public void testHitungVolumeKolam() {
		assertEquals(198, volumeKolam.HitungVolumegKolam(5.5, 12, 3),0);
	}
	
	@Test
	public void testHitungVolumeKolamBukanAngka() {
		assertEquals(198, volumeKolam.HitungVolumegKolam("aa", "adad", "adsad"),0);
	}
	
	@Test
	public void testHitungVolumeKolamNegatif() {
		assertEquals(198, volumeKolam.HitungVolumegKolam(-5.5, -12, -3),0);
	}
	
	@Test
	public void testHitungVolumeKolamTakAdaInputAngka() {
		assertEquals(198, volumeKolam.HitungVolumegKolam(),0);
	}

}
