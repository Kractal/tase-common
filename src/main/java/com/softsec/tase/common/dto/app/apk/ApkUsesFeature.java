/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkFeature
 * <p> </p>
 * @author yanwei
 * @since 2013-5-8 下午4:15:29
 * @version
 */
public class ApkUsesFeature implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2030815120092915683L;

	/**
	 * Declares a single hardware or software feature that is used by the application.
	 * 
	 * The purpose of a <uses-feature> declaration is to inform any external entity of 
	 * the set of hardware and software features on which your application depends. 
	 * The element offers a required attribute that lets you specify whether your application 
	 * requires and cannot function without the declared feature, or whether it prefers to have 
	 * the feature but can function without it. Because feature support can vary across Android devices, 
	 * the <uses-feature> element serves an important role in letting an application describe the 
	 * device-variable features that it uses.
	 */
	private String featureName;
		
	private boolean required;
		
	private String glEsVersion;
	
	public ApkUsesFeature(String featureName, boolean required, String glEsVersion) {
		this.featureName = featureName;
		this.required = required;
		this.glEsVersion = glEsVersion;
	}
	
	public ApkUsesFeature(String featureName, boolean required) {
		this.featureName = featureName;
		this.required = required;
	}
	
	public ApkUsesFeature(String featureName) {
		this.featureName = featureName;
	}
	
	public ApkUsesFeature() {
	}

	/**
	 * @return the featureName
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * @param featureName the featureName to set
	 */
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * @return the glEsVersion
	 */
	public String getGlEsVersion() {
		return glEsVersion;
	}

	/**
	 * @param glEsVersion the glEsVersion to set
	 */
	public void setGlEsVersion(String glEsVersion) {
		this.glEsVersion = glEsVersion;
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
		return "ApkUsesFeature [featureName=" + featureName + ", required="
				+ required + ", glEsVersion=" + glEsVersion + "]";
	}
}
