package kosta.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() { //static�޼ҵ�
		String today = DateUtil.getCurrentDate();
		assertEquals("20180223", today);
	//	assertNotNull(today);
	}

}
