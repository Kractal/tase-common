/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * @author yanwei
 * @time 2013-4-26 下午5:08:32
 * @description
 *
 */
public class ApkPermission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4104220780634351076L;
	
	/**
	 * Declares a security permission that can be used to limit access 
	 * to specific components or features of this or other applications. 
	 * 
	 * See the Permissions section in the introduction, and the Security 
	 * and Permissions document for more information on how permissions work.
	 * protectionLevel=["normal" | "dangerous" | "signature" | "signatureOrSystem"]
	 */
	private String permissionName;
	
	private String protectionLevel;
	
	public ApkPermission() {
	}
	
	public ApkPermission(String permissionName) {
		this.permissionName = permissionName;
	}
	
	public ApkPermission(String permissionName, String protectionLevel) {
		this.permissionName = permissionName;
		this.protectionLevel = protectionLevel;
	}

	/**
	 * @return the permissionName
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * @param permissionName the permissionName to set
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * @return the protectionLevel
	 */
	public String getProtectionLevel() {
		return protectionLevel;
	}

	/**
	 * @param protectionLevel the protectionLevel to set
	 */
	public void setProtectionLevel(String protectionLevel) {
		this.protectionLevel = protectionLevel;
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
		return "ApkPermission [permissionName=" + permissionName
				+ ", protectionLevel=" + protectionLevel + "]";
	}
}
