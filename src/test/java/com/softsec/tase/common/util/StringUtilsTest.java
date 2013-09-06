/**
 * 
 */
package com.softsec.tase.common.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import junit.framework.TestCase;

import org.junit.Test;

import com.softsec.tase.common.util.StringUtils;

/**
 * 
 * @author yanwei
 * @date 2012-12-20 下午5:46:40
 * 
 */
public class StringUtilsTest extends TestCase {

	@Test
	public void testIsEmpty () {
		String nullString = null;
		assertTrue(StringUtils.isEmpty(nullString));
		String notNullString = " ";
		assertFalse(StringUtils.isEmpty(notNullString));
	}
	
	@Test
	public void testMd5Encode (){
		String testString = "www.bupt.edu.cn";
		String supposedString = "5622627192ff26d1149cdcf6505f1b94";
		try {
			assertEquals(StringUtils.md5Encode(testString), supposedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
