/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkUsesPermission
 * <p> </p>
 * @author yanwei
 * @since 2013-5-10 下午3:15:31
 * @version
 */
public class ApkUsesPermission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -533871995737296438L;

	/**
	 * Requests a permission that the application must be granted 
	 * in order for it to operate correctly. 
	 * 
	 * Permissions are granted by the user when the application 
	 * is installed, not while it's running.
	 */
	private String usesPermissionName;
	
	public ApkUsesPermission() {
	}
	
	public ApkUsesPermission(String usesPermissionName) {
		this.usesPermissionName = usesPermissionName;
	}

	/**
	 * @return the usesPermissionName
	 */
	public String getUsesPermissionName() {
		return usesPermissionName;
	}

	/**
	 * @param usesPermissionName the usesPermissionName to set
	 */
	public void setUsesPermissionName(String usesPermissionName) {
		this.usesPermissionName = usesPermissionName;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApkUsesPermission [usesPermissionName=" + usesPermissionName
				+ "]";
	}
}
