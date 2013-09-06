/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkAction
 * <p> </p>
 * @author yanwei
 * @since 2013-5-22 上午11:42:25
 * @version
 */
public class ApkIntentFilterAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1663945800656979135L;
	
	private String actionName;
	
	public ApkIntentFilterAction(){
	}
	
	public ApkIntentFilterAction(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * @return the actionName
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * @param actionName the actionName to set
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
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
		return "ApkIntentFilterAction [actionName=" + actionName + "]";
	}
	
}
