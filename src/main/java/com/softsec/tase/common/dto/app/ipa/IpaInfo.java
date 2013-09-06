/**
 * 
 */
package com.softsec.tase.common.dto.app.ipa;

import java.io.Serializable;

/**
 * IpaInfo.java
 * <p></p>
 * @author yanwei
 * @since 2013-4-24 下午1:40:21
 * @version
 */
public class IpaInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 932947043201683042L;

	private String cfBundleName; //CutTheRope
	
	private String cfBundleDisplayName; //Cut the Rope
	
	private String cfBundleIdentifier; //com.chillingo.cuttherope
	
	private String cfBundleVersion; //1.7.1

	public String getCfBundleName() {
		return cfBundleName;
	}

	public void setCfBundleName(String cfBundleName) {
		this.cfBundleName = cfBundleName;
	}

	public String getCfBundleDisplayName() {
		return cfBundleDisplayName;
	}

	public void setCfBundleDisplayName(String cfBundleDisplayName) {
		this.cfBundleDisplayName = cfBundleDisplayName;
	}

	public String getCfBundleIdentifier() {
		return cfBundleIdentifier;
	}

	public void setCfBundleIdentifier(String cfBundleIdentifier) {
		this.cfBundleIdentifier = cfBundleIdentifier;
	}

	public String getCfBundleVersion() {
		return cfBundleVersion;
	}

	public void setCfBundleVersion(String cfBundleVersion) {
		this.cfBundleVersion = cfBundleVersion;
	}
}
