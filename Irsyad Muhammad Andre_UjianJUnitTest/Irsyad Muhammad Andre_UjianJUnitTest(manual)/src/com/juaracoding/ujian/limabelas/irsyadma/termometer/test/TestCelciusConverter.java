package com.juaracoding.ujian.limabelas.irsyadma.termometer.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.ujian.limabelas.irsyadma.termometer.CelciusConverter;

public class TestCelciusConverter {
	CelciusConverter celciusConverter;

	@Before
	public void setUp() throws Exception {
		celciusConverter = new CelciusConverter();
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFahreinheitConvCelcius() {
		assertEquals(-5, celciusConverter.FahreinheitConvCelcius(23),0);
	}
	
//	@Test
//	public void testFahreinheitConvCelciusBukanAngka() {
//		assertEquals(-5, celciusConverter.FahreinheitConvCelcius("adadad"),0);
//	}
//	
//	@Test
//	public void testFahreinheitConvCelciusAngkaNegatif() {
//		assertEquals(-5, celciusConverter.FahreinheitConvCelcius(-23),0);
//	}
//	
//	@Test
//	public void testFahreinheitConvCelciusTakAdaInput() {
//		assertEquals(-5, celciusConverter.FahreinheitConvCelcius(),0);
//	}
	
	

}
