/**
 * 
 */
package com.softsec.tase.common.domain;

import junit.framework.TestCase;

import org.junit.Test;

import com.softsec.tase.common.util.domain.AppUtils;

/**
 * AppTest.java
 * @author yanwei
 * @date 2013-2-1 下午1:16:15
 * @description
 */
public class AppUtilsTest extends TestCase {

	@Test
	public void testAppId() {
		long appId = 12000700000045L;
		String appIdString = String.valueOf(appId);
		int digits = appIdString.length();
		assertEquals(appIdString.substring(digits - 12, digits -8), "0007");
		System.out.println(AppUtils.getAppTypeByAppId(appId));
		System.out.println(AppUtils.getOriginTypeByAppId(appId));
	}
	
	@Test
	public void testGetCategoryId() {
		Long appId = 1101000200000006L;
		System.out.println(Integer.parseInt(String.valueOf(appId).substring(4, 8)));
	}
}
