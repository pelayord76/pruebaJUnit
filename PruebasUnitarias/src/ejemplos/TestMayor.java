package ejemplos;

import junit.framework.TestCase;

public class TestMayor extends TestCase {

	public void testSimple() {

		assertEquals(9, Mayor.mayor(new int[] { 7, 8, 9 }));
	}

	public void testOrder() {

		assertEquals(9, Mayor.mayor(new int[] { 9, 8, 7 }));
		assertEquals(9, Mayor.mayor(new int[] { 7, 9, 8 }));
		assertEquals(9, Mayor.mayor(new int[] { 7, 8, 9 }));
	}

	public void testNegative() {

		int[] negList = new int[] { -9, -8, -7 };
		assertEquals(-7, Mayor.mayor(negList));
	}

	public void testEmpty() {

		try {

			Mayor.mayor(new int[] {});
			fail("Deberia lanzar una excepcion");
		} catch (RuntimeException e) {

			assertTrue(true);
		}
	}
}
