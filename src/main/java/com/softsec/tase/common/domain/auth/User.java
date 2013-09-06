/**
 * 
 */
package com.softsec.tase.common.domain.auth;

/**
 * User.java
 * @author yanwei
 * @date 2013-3-4 下午3:49:09
 * @description
 */
public class User {
	
	private int userId;

	private String username;
	
	private int userCount;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getUserCount() {
		return userCount;
	}
	
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
}