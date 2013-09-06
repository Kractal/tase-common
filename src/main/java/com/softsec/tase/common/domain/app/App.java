/**
 * 
 */
package com.softsec.tase.common.domain.app;

import java.util.List;

import com.softsec.tase.common.rpc.domain.app.AppAdvertiser;
import com.softsec.tase.common.rpc.domain.app.AppAntivirus;
import com.softsec.tase.common.rpc.domain.app.AppComment;
import com.softsec.tase.common.rpc.domain.app.AppExternalLink;
import com.softsec.tase.common.rpc.domain.app.AppPermission;
import com.softsec.tase.common.rpc.domain.app.AppWeb;

/**
 * 
 * @author yanwei
 * @date 2013-1-16 上午11:27:16
 * 
 */
public class App {

	private long appId;
	
	private String storeName;
	private String storeDisplayName;
	private String storeUrl;
	private int storeType;
	private	String category;
	
	private String appName;
	private String innerId;
	
	private String platform;
	private String osType;
	private String osVersion;
	private String device;
	
	private String country;
	private String language;
	private String description;
	private String size;
	private String currencyUnit;
	private double price;
	
	private String appVersion;
	private long updatedTime;
	private long collectedTime;
	private String updateHistory;
	private long majorVersion;
	private long minorVersioin;
	private long revisionVersion;
	private long buildVersion;
	private long extraVersion;
	
	private String url;
	private String downloadUrl;
	private List<String> snapshotUrlList;
	private String logoUrl;
	
	private long downloadFloor;
	private long downloadCeiling;
	private double rating;
	private long ratingCount;
	private String review;
	private String contentRating;
	
	private String developerName;
	private String developerWebsite;
	private String developerEmail;
	private String privacyPolicy;
	
	private List<AppAdvertiser> 	appAdvertiserList;
	private List<AppAntivirus> 		appAntivirusList;
	private List<AppComment>		appCommentList;
	private List<AppExternalLink> 	appExternalLinkList;
	private List<AppPermission> 	appPermissionList;
	
	private String appChecksum;
	
	public App() {
	}
	
	public App(AppWeb appWeb) {
		
		this.storeName = appWeb.getStoreName();
		this.storeDisplayName = appWeb.getStoreDisplayName();
		this.storeUrl = appWeb.getStoreUrl();
		this.storeType = appWeb.getStoreType();
		this.storeUrl = appWeb.getStoreUrl();
		this.category = appWeb.getCategory();
		
		this.appName = appWeb.getAppName();
		this.innerId = appWeb.getInnerId();
		
		this.platform = appWeb.getPlatform();
		this.osType = appWeb.getOsType();
		this.osVersion = appWeb.getOsVersion();
		this.device = appWeb.getDevice();
		
		this.appVersion = appWeb.getAppVersion();
		this.updatedTime = appWeb.getUpdatedTime();
		this.updateHistory = appWeb.getUpdateHistory();
		
		this.country = appWeb.getCountry();
		this.language = appWeb.getLanguage();
		this.description = appWeb.getDescription();
		this.size = appWeb.getSize();
		
		this.url = appWeb.getUrl();
		this.downloadUrl = appWeb.getDownloadUrl();
		this.snapshotUrlList = appWeb.getSnapshotUrlList();
		this.logoUrl = appWeb.getLogoUrl();
		
		this.developerName = appWeb.getDeveloperName();
		this.developerWebsite = appWeb.getDeveloperWebsite();
		this.developerEmail = appWeb.getDeveloperEmail();
		this.privacyPolicy = appWeb.getPrivacyPolicy();
		
		this.downloadFloor = appWeb.getDownloadFloor();
		this.downloadCeiling = appWeb.getDownloadCeiling();
		this.rating = appWeb.getRating();
		this.ratingCount = appWeb.getRatingCount();
		this.review = appWeb.getReview();
		this.contentRating = appWeb.getContentRating();
		
		this.appAdvertiserList = appWeb.getAppAdvertiserList();
		this.appAntivirusList = appWeb.getAppAntivirusList();
		this.appCommentList = appWeb.getAppCommentList();
		this.appExternalLinkList = appWeb.getAppExternalLinkList();
		this.appPermissionList = appWeb.getAppPermissionList();
		
		this.appChecksum = appWeb.getAppChecksum();
		this.collectedTime = appWeb.getCollectedTime();
	}

	/**
	 * @return the appId
	 */
	public long getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(long appId) {
		this.appId = appId;
	}

	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * @return the storeDisplayName
	 */
	public String getStoreDisplayName() {
		return storeDisplayName;
	}

	/**
	 * @param storeDisplayName the storeDisplayName to set
	 */
	public void setStoreDisplayName(String storeDisplayName) {
		this.storeDisplayName = storeDisplayName;
	}

	/**
	 * @return the storeUrl
	 */
	public String getStoreUrl() {
		return storeUrl;
	}

	/**
	 * @param storeUrl the storeUrl to set
	 */
	public void setStoreUrl(String storeUrl) {
		this.storeUrl = storeUrl;
	}

	/**
	 * @return the storeType
	 */
	public int getStoreType() {
		return storeType;
	}

	/**
	 * @param storeType the storeType to set
	 */
	public void setStoreType(int storeType) {
		this.storeType = storeType;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * @return the innerId
	 */
	public String getInnerId() {
		return innerId;
	}

	/**
	 * @param innerId the innerId to set
	 */
	public void setInnerId(String innerId) {
		this.innerId = innerId;
	}

	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * @return the osType
	 */
	public String getOsType() {
		return osType;
	}

	/**
	 * @param osType the osType to set
	 */
	public void setOsType(String osType) {
		this.osType = osType;
	}

	/**
	 * @return the osVersion
	 */
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * @param osVersion the osVersion to set
	 */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	/**
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the currencyUnit
	 */
	public String getCurrencyUnit() {
		return currencyUnit;
	}

	/**
	 * @param currencyUnit the currencyUnit to set
	 */
	public void setCurrencyUnit(String currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * @param appVersion the appVersion to set
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	/**
	 * @return the updatedTime
	 */
	public long getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * @param updatedTime the updatedTime to set
	 */
	public void setUpdatedTime(long updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * @return the collectedTime
	 */
	public long getCollectedTime() {
		return collectedTime;
	}

	/**
	 * @param collectedTime the collectedTime to set
	 */
	public void setCollectedTime(long collectedTime) {
		this.collectedTime = collectedTime;
	}

	/**
	 * @return the updateHistory
	 */
	public String getUpdateHistory() {
		return updateHistory;
	}

	/**
	 * @param updateHistory the updateHistory to set
	 */
	public void setUpdateHistory(String updateHistory) {
		this.updateHistory = updateHistory;
	}

	/**
	 * @return the majorVersion
	 */
	public long getMajorVersion() {
		return majorVersion;
	}

	/**
	 * @param majorVersion the majorVersion to set
	 */
	public void setMajorVersion(long majorVersion) {
		this.majorVersion = majorVersion;
	}

	/**
	 * @return the minorVersioin
	 */
	public long getMinorVersioin() {
		return minorVersioin;
	}

	/**
	 * @param minorVersioin the minorVersioin to set
	 */
	public void setMinorVersioin(long minorVersioin) {
		this.minorVersioin = minorVersioin;
	}

	/**
	 * @return the revisionVersion
	 */
	public long getRevisionVersion() {
		return revisionVersion;
	}

	/**
	 * @param revisionVersion the revisionVersion to set
	 */
	public void setRevisionVersion(long revisionVersion) {
		this.revisionVersion = revisionVersion;
	}

	/**
	 * @return the buildVersion
	 */
	public long getBuildVersion() {
		return buildVersion;
	}

	/**
	 * @param buildVersion the buildVersion to set
	 */
	public void setBuildVersion(long buildVersion) {
		this.buildVersion = buildVersion;
	}

	/**
	 * @return the extraVersion
	 */
	public long getExtraVersion() {
		return extraVersion;
	}

	/**
	 * @param extraVersion the extraVersion to set
	 */
	public void setExtraVersion(long extraVersion) {
		this.extraVersion = extraVersion;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the downloadUrl
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * @param downloadUrl the downloadUrl to set
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * @return the snapshotUrlList
	 */
	public List<String> getSnapshotUrlList() {
		return snapshotUrlList;
	}

	/**
	 * @param snapshotUrlList the snapshotUrlList to set
	 */
	public void setSnapshotUrlList(List<String> snapshotUrlList) {
		this.snapshotUrlList = snapshotUrlList;
	}

	/**
	 * @return the logoUrl
	 */
	public String getLogoUrl() {
		return logoUrl;
	}

	/**
	 * @param logoUrl the logoUrl to set
	 */
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	/**
	 * @return the downloadFloor
	 */
	public long getDownloadFloor() {
		return downloadFloor;
	}

	/**
	 * @param downloadFloor the downloadFloor to set
	 */
	public void setDownloadFloor(long downloadFloor) {
		this.downloadFloor = downloadFloor;
	}

	/**
	 * @return the downloadCeiling
	 */
	public long getDownloadCeiling() {
		return downloadCeiling;
	}

	/**
	 * @param downloadCeiling the downloadCeiling to set
	 */
	public void setDownloadCeiling(long downloadCeiling) {
		this.downloadCeiling = downloadCeiling;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * @return the ratingCount
	 */
	public long getRatingCount() {
		return ratingCount;
	}

	/**
	 * @param ratingCount the ratingCount to set
	 */
	public void setRatingCount(long ratingCount) {
		this.ratingCount = ratingCount;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	/**
	 * @return the contentRating
	 */
	public String getContentRating() {
		return contentRating;
	}

	/**
	 * @param contentRating the contentRating to set
	 */
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}

	/**
	 * @return the developerName
	 */
	public String getDeveloperName() {
		return developerName;
	}

	/**
	 * @param developerName the developerName to set
	 */
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	/**
	 * @return the developerWebsite
	 */
	public String getDeveloperWebsite() {
		return developerWebsite;
	}

	/**
	 * @param developerWebsite the developerWebsite to set
	 */
	public void setDeveloperWebsite(String developerWebsite) {
		this.developerWebsite = developerWebsite;
	}

	/**
	 * @return the developerEmail
	 */
	public String getDeveloperEmail() {
		return developerEmail;
	}

	/**
	 * @param developerEmail the developerEmail to set
	 */
	public void setDeveloperEmail(String developerEmail) {
		this.developerEmail = developerEmail;
	}

	/**
	 * @return the privacyPolicy
	 */
	public String getPrivacyPolicy() {
		return privacyPolicy;
	}

	/**
	 * @param privacyPolicy the privacyPolicy to set
	 */
	public void setPrivacyPolicy(String privacyPolicy) {
		this.privacyPolicy = privacyPolicy;
	}

	/**
	 * @return the appAdvertiserList
	 */
	public List<AppAdvertiser> getAppAdvertiserList() {
		return appAdvertiserList;
	}

	/**
	 * @param appAdvertiserList the appAdvertiserList to set
	 */
	public void setAppAdvertiserList(List<AppAdvertiser> appAdvertiserList) {
		this.appAdvertiserList = appAdvertiserList;
	}

	/**
	 * @return the appAntivirusList
	 */
	public List<AppAntivirus> getAppAntivirusList() {
		return appAntivirusList;
	}

	/**
	 * @param appAntivirusList the appAntivirusList to set
	 */
	public void setAppAntivirusList(List<AppAntivirus> appAntivirusList) {
		this.appAntivirusList = appAntivirusList;
	}

	/**
	 * @return the appCommentList
	 */
	public List<AppComment> getAppCommentList() {
		return appCommentList;
	}

	/**
	 * @param appCommentList the appCommentList to set
	 */
	public void setAppCommentList(List<AppComment> appCommentList) {
		this.appCommentList = appCommentList;
	}

	/**
	 * @return the appExternalLinkList
	 */
	public List<AppExternalLink> getAppExternalLinkList() {
		return appExternalLinkList;
	}

	/**
	 * @param appExternalLinkList the appExternalLinkList to set
	 */
	public void setAppExternalLinkList(List<AppExternalLink> appExternalLinkList) {
		this.appExternalLinkList = appExternalLinkList;
	}

	/**
	 * @return the appPermissionList
	 */
	public List<AppPermission> getAppPermissionList() {
		return appPermissionList;
	}

	/**
	 * @param appPermissionList the appPermissionList to set
	 */
	public void setAppPermissionList(List<AppPermission> appPermissionList) {
		this.appPermissionList = appPermissionList;
	}

	/**
	 * @return the appChecksum
	 */
	public String getAppChecksum() {
		return appChecksum;
	}

	/**
	 * @param appChecksum the appChecksum to set
	 */
	public void setAppChecksum(String appChecksum) {
		this.appChecksum = appChecksum;
	}
	
}
