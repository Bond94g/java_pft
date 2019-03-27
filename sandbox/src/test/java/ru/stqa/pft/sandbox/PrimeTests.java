package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
  @Test
  public void testPrimes() {
    Assert.assertTrue(Primes.isPrime2(Integer.MAX_VALUE));
  }

  @Test
  public void testPrimes1() {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE -2 ));
  }

  @Test(enabled = false)
  public void testPrimes1ong() {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
}
