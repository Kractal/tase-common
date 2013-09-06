/**
 * 
 */
package com.softsec.tase.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @author yanwei
 * @date 2012-12-20 下午5:25:31
 * 
 */
public class StringUtils {

	public static boolean isEmpty (String input) {
		if (input == null || input.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String byteArrayToHexString(byte[] byteArray) {
		StringBuilder sbuilder = new StringBuilder();
		for (int i = 0 ; i < byteArray.length; i++) {
			String hex = Integer.toHexString(0xff & byteArray[i]);
			if ( hex.length() == 1 ) {
				sbuilder.append('0');
			}
			sbuilder.append(hex);
		}
		return sbuilder.toString();
	}
	
	public static String md5Encode(String rawString) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		byte[] rawBytes;
		rawBytes = rawString.getBytes("UTF-8");
		if (rawBytes == null | rawBytes.length == 0) {
			rawBytes = rawString.getBytes();
		}
		MessageDigest messageDigest;
		messageDigest = MessageDigest.getInstance("MD5");
		String output = byteArrayToHexString(messageDigest.digest(rawBytes));
		return output;
	}
}
