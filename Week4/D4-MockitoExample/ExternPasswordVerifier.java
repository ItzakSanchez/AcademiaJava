package com.edgaritzak.mockito;

public interface ExternPasswordVerifier {

	boolean verifyPassword(String password, boolean lowercase, boolean uppercase, boolean digit);
}
