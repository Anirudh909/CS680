package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
    public void testeAreEqual() {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        assertSame(x,y);

}
	
	@Test
	public void testNotNull() {
		Singleton p = Singleton.getInstance();
		Assertions.assertNotNull(p);
	}
	@Test
    public void testUsingHashCode() {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        assertEquals(a.hashCode(),b.hashCode());

	}	
}