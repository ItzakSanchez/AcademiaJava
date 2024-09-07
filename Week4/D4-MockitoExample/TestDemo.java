package com.edgaritzak.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class TestDemo {

	@Mock
	ExternPasswordVerifier externService;
	Verifier verifier;
	
	@BeforeEach
	void setUp() throws Exception {
		externService = mock(ExternPasswordVerifier.class);
		verifier = new Verifier(externService);
	}

	@Test
	void testPasswordVerifierNoUppercase() {
		when(externService.verifyPassword("a1", true, true, true)).thenReturn(false);
		
		boolean result = verifier.verifyPassword("a1", true, true, true);
		assertEquals(false, result);
		verify(externService).verifyPassword("a1", true, true, true);
	}
	
	@Test
	void testPasswordVerifierNoLowercase() {
		when(externService.verifyPassword("1A", true, true, true)).thenReturn(false);
		boolean result = verifier.verifyPassword("1A", true, true, true);
		assertEquals(false, result);
		verify(externService).verifyPassword("1A", true, true, true);
	}
	
	@Test
	void testPasswordVerifierNoDigit() {
		when(externService.verifyPassword("Aa", true, true, true)).thenReturn(false);
		boolean result = verifier.verifyPassword("Aa", true, true, true);
		assertEquals(false, result);
		verify(externService).verifyPassword("Aa", true, true, true);
	}
	
	@Test
	void testPasswordVerifierValidPassword() {
		when(externService.verifyPassword("1Aa", true, true, true)).thenReturn(true);
		boolean result = verifier.verifyPassword("1Aa", true, true, true);
		assertEquals(true, result);
		verify(externService).verifyPassword("1Aa", true, true, true);
	}

}
