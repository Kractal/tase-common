/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;
import java.util.List;

/**
 * ApkManifest.java
 * <p></p>
 * @author yanwei
 * @since 2013-4-24 下午1:05:53
 * @version
 */
public class ApkManifest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7557949769321820543L;
	/**
	 * Defines the Android namespace. 
	 * This attribute should always be set to "http://schemas.android.com/apk/res/android".
	 */
	private String xmlns;
	/**
	 * A full Java-language-style package name for the application. 
	 * The name should be unique. The name may contain uppercase or lowercase letters ('A' through 'Z'), 
	 * numbers, and underscores ('_'). However, individual package name parts may only start with letters.
	 * 
	 * To avoid conflicts with other developers, you should use Internet domain ownership 
	 * as the basis for your package names (in reverse). For example, applications published 
	 * by Google start with com.google. You should also never use the com.example namespace when publishing your applications.
	 * 
	 * The package name serves as a unique identifier for the application. 
	 * It's also the default name for the application process 
	 * (see the <application> element's process process attribute) 
	 * and the default task affinity of an activity (see the <activity> element's taskAffinity attribute).
	 */
	private String packageName;
	/**
	 * The name of a Linux user ID that will be shared with other applications. 
	 * By default, Android assigns each application its own unique user ID. 
	 * However, if this attribute is set to the same value for two or more applications, 
	 * they will all share the same ID — provided that they are also signed by the same certificate. 
	 * Application with the same user ID can access each other's data and, if desired, run in the same process.
	 */
	private String sharedUserId;
	/**
	 * A user-readable label for the shared user ID. 
	 * The label must be set as a reference to a string resource; it cannot be a raw string.
	 * 
	 * This attribute was introduced in API Level 3. It is meaningful only if the sharedUserId attribute is also set.
	 */
	private String sharedUserLabel;
	/**
	 * An internal version number. 
	 * This number is used only to determine whether one version is more recent than another, 
	 * with higher numbers indicating more recent versions. 
	 * This is not the version number shown to users; that number is set by the versionName attribute.
	 * The value must be set as an integer, such as "100".
	 */
	private long versionCode;
	/**
	 * The version number shown to users. 
	 * This attribute can be set as a raw string or as a reference to a string resource. 
	 * The string has no other purpose than to be displayed to users. 
	 * The versionCode attribute holds the significant version number used internally.
	 */
	private String versionName;
	/**
	 * The default install location for the application.
	 * internalOnly | auto | preferExternal
	 */
	private String installLocation;
	
	private ApkUsesSdk apkUsesSdk;
	
	private List<ApkActivity> apkActivityList;
	
	private List<ApkIntentFilterAction> apkIntentFilterActionList;
	
	private List<ApkIntentFilterData> apkIntentFileterDataList;
	
	private List<ApkPermission> apkPermissionList;
	
	private List<ApkUsesFeature> apkUsesFeatureList;
	
	private List<ApkUsesLibrary> apkUsesLibraryList;
	
	private List<ApkUsesPermission> apkUsesPermissionList;

	/**
	 * @return the xmlns
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * @param xmlns the xmlns to set
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * @return the sharedUserId
	 */
	public String getSharedUserId() {
		return sharedUserId;
	}

	/**
	 * @param sharedUserId the sharedUserId to set
	 */
	public void setSharedUserId(String sharedUserId) {
		this.sharedUserId = sharedUserId;
	}

	/**
	 * @return the sharedUserLabel
	 */
	public String getSharedUserLabel() {
		return sharedUserLabel;
	}

	/**
	 * @param sharedUserLabel the sharedUserLabel to set
	 */
	public void setSharedUserLabel(String sharedUserLabel) {
		this.sharedUserLabel = sharedUserLabel;
	}

	/**
	 * @return the versionCode
	 */
	public long getVersionCode() {
		return versionCode;
	}

	/**
	 * @param versionCode the versionCode to set
	 */
	public void setVersionCode(long versionCode) {
		this.versionCode = versionCode;
	}

	/**
	 * @return the versionName
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * @param versionName the versionName to set
	 */
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	/**
	 * @return the installLocation
	 */
	public String getInstallLocation() {
		return installLocation;
	}

	/**
	 * @param installLocation the installLocation to set
	 */
	public void setInstallLocation(String installLocation) {
		this.installLocation = installLocation;
	}

	/**
	 * @return the apkUsesSdk
	 */
	public ApkUsesSdk getApkUsesSdk() {
		return apkUsesSdk;
	}

	/**
	 * @param apkUsesSdk the apkUsesSdk to set
	 */
	public void setApkUsesSdk(ApkUsesSdk apkUsesSdk) {
		this.apkUsesSdk = apkUsesSdk;
	}

	/**
	 * @return the apkActivityList
	 */
	public List<ApkActivity> getApkActivityList() {
		return apkActivityList;
	}

	/**
	 * @param apkActivityList the apkActivityList to set
	 */
	public void setApkActivityList(List<ApkActivity> apkActivityList) {
		this.apkActivityList = apkActivityList;
	}

	/**
	 * @return the apkIntentFilterActionList
	 */
	public List<ApkIntentFilterAction> getApkIntentFilterActionList() {
		return apkIntentFilterActionList;
	}

	/**
	 * @param apkIntentFilterActionList the apkIntentFilterActionList to set
	 */
	public void setApkIntentFilterActionList(
			List<ApkIntentFilterAction> apkIntentFilterActionList) {
		this.apkIntentFilterActionList = apkIntentFilterActionList;
	}

	/**
	 * @return the apkIntentFileterDataList
	 */
	public List<ApkIntentFilterData> getApkIntentFileterDataList() {
		return apkIntentFileterDataList;
	}

	/**
	 * @param apkIntentFileterDataList the apkIntentFileterDataList to set
	 */
	public void setApkIntentFileterDataList(
			List<ApkIntentFilterData> apkIntentFileterDataList) {
		this.apkIntentFileterDataList = apkIntentFileterDataList;
	}

	/**
	 * @return the apkPermissionList
	 */
	public List<ApkPermission> getApkPermissionList() {
		return apkPermissionList;
	}

	/**
	 * @param apkPermissionList the apkPermissionList to set
	 */
	public void setApkPermissionList(List<ApkPermission> apkPermissionList) {
		this.apkPermissionList = apkPermissionList;
	}

	/**
	 * @return the apkUsesFeatureList
	 */
	public List<ApkUsesFeature> getApkUsesFeatureList() {
		return apkUsesFeatureList;
	}

	/**
	 * @param apkUsesFeatureList the apkUsesFeatureList to set
	 */
	public void setApkUsesFeatureList(List<ApkUsesFeature> apkUsesFeatureList) {
		this.apkUsesFeatureList = apkUsesFeatureList;
	}

	/**
	 * @return the apkUsesLibraryList
	 */
	public List<ApkUsesLibrary> getApkUsesLibraryList() {
		return apkUsesLibraryList;
	}

	/**
	 * @param apkUsesLibraryList the apkUsesLibraryList to set
	 */
	public void setApkUsesLibraryList(List<ApkUsesLibrary> apkUsesLibraryList) {
		this.apkUsesLibraryList = apkUsesLibraryList;
	}

	/**
	 * @return the apkUsesPermissionList
	 */
	public List<ApkUsesPermission> getApkUsesPermissionList() {
		return apkUsesPermissionList;
	}

	/**
	 * @param apkUsesPermissionList the apkUsesPermissionList to set
	 */
	public void setApkUsesPermissionList(
			List<ApkUsesPermission> apkUsesPermissionList) {
		this.apkUsesPermissionList = apkUsesPermissionList;
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
		return "ApkManifest [xmlns=" + xmlns + ", packageName=" + packageName
				+ ", sharedUserId=" + sharedUserId + ", sharedUserLabel="
				+ sharedUserLabel + ", versionCode=" + versionCode
				+ ", versionName=" + versionName + ", installLocation="
				+ installLocation + ", apkUsesSdk=" + apkUsesSdk
				+ ", apkActivityList=" + apkActivityList
				+ ", apkIntentFilterActionList=" + apkIntentFilterActionList
				+ ", apkIntentFileterDataList=" + apkIntentFileterDataList
				+ ", apkPermissionList=" + apkPermissionList
				+ ", apkUsesFeatureList=" + apkUsesFeatureList
				+ ", apkUsesLibraryList=" + apkUsesLibraryList
				+ ", apkUsesPermissionList=" + apkUsesPermissionList + "]";
	}
}
