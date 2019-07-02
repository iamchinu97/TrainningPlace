package com.sapient.week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PrimeTest {

	@Test
	void test() {
		Assert.assertEquals(true, PrimeNumber.checkPrime(2));
	}
	@Test
	void test2() {
		Assert.assertEquals(false, PrimeNumber.checkPrime(4));
	}

}
