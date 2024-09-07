package com.edgaritzak.mockito;

public class Verifier {
	
	private ExternPasswordVerifier externService;

	public Verifier(ExternPasswordVerifier externService) {
		this.externService = externService;
	}
	
	public boolean verifyPassword(String password, boolean lowercase, boolean uppercase, boolean digit) {
		return externService.verifyPassword(password, lowercase, uppercase, digit);
	}
}
