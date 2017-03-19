package util;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class KuniUtilTest {

	@Test
	public void test() {
		fail("sippai");
		
		//KuniUtils actual = new KuniUtils();
        assertThat(KuniUtils.getMsg("abcde"), is("abcde"));
	}

}
