/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkActivity
 * <p> </p>
 * @author yanwei
 * @since 2013-5-21 下午7:33:42
 * @version
 */
public class ApkActivity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119987121819435305L;
	
	public ApkActivity(String activityName) {
		this.activityName = activityName;
	}

	private String activityName;

	/**
	 * @return the activityName
	 */
	public String getActivityName() {
		return activityName;
	}

	/**
	 * @param activityName the activityName to set
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
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
		return "ApkActivity [activityName=" + activityName + "]";
	}
}
