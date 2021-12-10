package com.juracoding.ujian.limabelas.termomter.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juracoding.ujian.limabelas.termomter.fungsi.CelciusConverter;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestCelciusConcverter {
	CelciusConverter celciusConverter;

	@Before
	public void setUp() throws Exception {
		celciusConverter = new CelciusConverter();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/termometerirsyad.csv")
	public void testFahreinheitConvCelcius(double fah,double cel) {
		assertEquals(cel, celciusConverter.FahreinheitConvCelcius(fah),0);	
		}

}
