/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkSdk
 * <p> </p>
 * @author yanwei
 * @since 2013-5-8 下午2:39:49
 * @version
 */
public class ApkUsesSdk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6096845145839387981L;

	private int minSdkVersion;
	
	private int targetSdkVersion;
	
	private int maxSdkVersion;

	/**
	 * @return the minSdkVersion
	 */
	public int getMinSdkVersion() {
		return minSdkVersion;
	}

	/**
	 * @param minSdkVersion the minSdkVersion to set
	 */
	public void setMinSdkVersion(int minSdkVersion) {
		this.minSdkVersion = minSdkVersion;
	}

	/**
	 * @return the targetSdkVersion
	 */
	public int getTargetSdkVersion() {
		return targetSdkVersion;
	}

	/**
	 * @param targetSdkVersion the targetSdkVersion to set
	 */
	public void setTargetSdkVersion(int targetSdkVersion) {
		this.targetSdkVersion = targetSdkVersion;
	}

	/**
	 * @return the maxSdkVersion
	 */
	public int getMaxSdkVersion() {
		return maxSdkVersion;
	}

	/**
	 * @param maxSdkVersion the maxSdkVersion to set
	 */
	public void setMaxSdkVersion(int maxSdkVersion) {
		this.maxSdkVersion = maxSdkVersion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApkUsesSdk [minSdkVersion=" + minSdkVersion
				+ ", targetSdkVersion=" + targetSdkVersion + ", maxSdkVersion="
				+ maxSdkVersion + "]";
	}
}
