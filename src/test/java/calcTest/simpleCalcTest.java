package calcTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleCalcTest {

	@Test
	public void testAdd() {
		simpleCalc calc = new simpleCalc();
		
		calc.add(10,20);
		
		assertEquals(30, calc.getResult());
		
	}
	
	@Test
	public void testSub() {
		simpleCalc calc = new simpleCalc();
		
		calc.sub(10,20);
		
		assertEquals(-10, calc.getResult());
		
	}
	
	@Test
	public void testMul() {
		simpleCalc calc = new simpleCalc();
		
		calc.mul(10,20);
		
		assertEquals(200, calc.getResult());
	}

	@Test
	public void testDiv() {
		simpleCalc calc = new simpleCalc();
		
		calc.div(100,20);
		
		assertEquals(5, calc.getResult());	
	}
	
	@Test
	public void testInc() {
		simpleCalc calc = new simpleCalc();
		
		calc.inc(100);
		assertEquals(100, calc.getResult());

		calc.inc(200);
		assertEquals(300, calc.getResult());
	}

}
