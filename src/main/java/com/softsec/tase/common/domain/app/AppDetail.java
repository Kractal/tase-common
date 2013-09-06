package com.softsec.tase.common.domain.app;

import java.util.Date;

public class AppDetail {

	public static String OS_ANDROID = "Android";
	public static String OS_IOS = "iOS";

	public static final int LOADED = 1;
	public static final int NOT_LOADED = 0;
	
	public static final int RISK = 1;

	private String wrapperId;
	private String wrapperName;

	private String appID; // 应用唯一标识
	private String url; // 链接地址
	private String title; // 应用名称
	private Date updateTime; // 更新时间
	private String version;// 版本
	private String size; // 大小
	private String developer;// 开发者
	private String downUrl; // 下载链接地址
	private String description; // 应用描述
	private String imageUrl;// 应用截图链接
	private int downNum;// 下载次数
	private String subject; // 应用分类
	private String storeNode; // 存储应用节点标识
	private String appPath; // 应用存储相对路径
	private String osVersion; // 适用系统版本
	private String os; // 适用系统
	private int isAPKLoaded; // APK是否下载标记
	private int isImageLoaded; // 图片是否下载标记

	private int checkValue; // app是否被检测过(以何种方式检测过)
	private int risk; //是否高危

	public AppDetail() {
	}

	public AppDetail(String wrapperId, String url, String version) {
		this.wrapperId = wrapperId;
		this.url = url;
		this.version = version;
	}

	/**
	 * @return the wrapperId
	 */
	public String getWrapperId() {
		return wrapperId;
	}

	/**
	 * @param wrapperId
	 *            the wrapperId to set
	 */
	public void setWrapperId(String wrapperId) {
		this.wrapperId = wrapperId;
	}

	/**
	 * @return the wrapperName
	 */
	public String getWrapperName() {
		return wrapperName;
	}

	/**
	 * @param wrapperName
	 *            the wrapperName to set
	 */
	public void setWrapperName(String wrapperName) {
		this.wrapperName = wrapperName;
	}

	/**
	 * @return the downUrl
	 */
	public String getDownUrl() {
		return downUrl;
	}

	/**
	 * @param downUrl
	 *            the downUrl to set
	 */
	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * 
	 * @return the developer
	 */
	public String getDeveloper() {
		return developer;
	}

	/**
	 * 
	 * @param set
	 *            the developer of the app
	 */
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	/**
	 * @return the downloadUrl
	 */
	public String getDownloadUrl() {
		return downUrl;
	}

	/**
	 * @param downloadUrl
	 *            the downloadUrl to set
	 */
	public void setDownloadUrl(String downUrl) {
		this.downUrl = downUrl;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the osVersion
	 */
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * @param osVersion
	 *            the osVersion to set
	 */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}

	/**
	 * @param os
	 *            the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return the url of the images
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * 
	 * @param imageUrl
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * 
	 * @return the number of the download
	 */

	public int getDownNum() {
		return downNum;
	}
	
	/**
	 * 
	 * @param downNum
	 */

	public void setDownNum(String downNum) {
		this.downNum = Integer.parseInt(downNum);
	}
	
	public void setDownNum(int downNum) {
		this.downNum = downNum;
	}

	/**
	 * @return the storeNode
	 */
	public String getStoreNode() {
		return storeNode;
	}

	/**
	 * @param storeNode
	 *            the storeNode to set
	 */
	public void setStoreNode(String storeNode) {
		this.storeNode = storeNode;
	}

	/**
	 * @return the appID
	 */
	public String getAppID() {
		return appID;
	}

	/**
	 * @param appID
	 *            the appID to set
	 */
	public void setAppID(String appID) {
		this.appID = appID;
	}

	/**
	 * @return the appPath
	 */
	public String getAppPath() {
		return appPath;
	}

	/**
	 * @param appPath
	 *            the appPath to set
	 */
	public void setAppPath(String appPath) {
		this.appPath = appPath;
	}

	/**
	 * @return the isAPKLoaded
	 */
	public int getIsAPKLoaded() {
		return isAPKLoaded;
	}

	/**
	 * @param isAPKLoaded
	 *            the isAPKLoaded to set
	 */
	public void setIsAPKLoaded(int isAPKLoaded) {
		this.isAPKLoaded = isAPKLoaded;
	}

	/**
	 * @return the isImageLoaded
	 */
	public int getIsImageLoaded() {
		return isImageLoaded;
	}

	/**
	 * @param isImageLoaded
	 *            the isImageLoaded to set
	 */
	public void setIsImageLoaded(int isImageLoaded) {
		this.isImageLoaded = isImageLoaded;
	}

	// --------------------------------------------------------

	/**
	 * @return the checkValue
	 */
	public int getCheckValue() {
		return checkValue;
	}

	/**
	 * @param checkValue
	 *            the checkValue to set
	 */
	public void setCheckValue(int checkValue) {
		this.checkValue = checkValue;
	}

	// --------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + ((wrapperId == null) ? 0 : wrapperId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppDetail other = (AppDetail) obj;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (wrapperId == null) {
			if (other.wrapperId != null)
				return false;
		} else if (!wrapperId.equals(other.wrapperId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppDetail [wrapperId=" + wrapperId + ", wrapperName=" + wrapperName + ", appID=" + appID + ", url=" + url + ", title=" + title + ", updateTime=" + updateTime + ", version=" + version + ", size=" + size + ", developer=" + developer + ", downUrl=" + downUrl + ", description=" + description + ", imageUrl=" + imageUrl + ", downNum=" + downNum + ", subject=" + subject + ", storeNode=" + storeNode + ", osVersion=" + osVersion + ", os=" + os + "]";
	}

	/**
	 * @return the risk
	 */
	public int getRisk() {
		return risk;
	}

	/**
	 * @param risk the risk to set
	 */
	public void setRisk(int risk) {
		this.risk = risk;
	}

}
