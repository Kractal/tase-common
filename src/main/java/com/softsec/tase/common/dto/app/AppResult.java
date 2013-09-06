/**
 * 
 */
package com.softsec.tase.common.dto.app;

import java.io.Serializable;
import java.util.List;

/**
 * ApkDownloaded
 * <p> </p>
 * @author yanwei
 * @since 2013-8-9 下午9:46:44
 * @version
 */
public class AppResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1074280990324861989L;

	private String apkPath;
	
	private List<String> imagePathList;
	
	private String logoPath;
	
	private String attachmentPath;
	
	/**
	 * 
	 */
	public AppResult() {
	}
	
	public AppResult(String apkPath) {
		this.apkPath = apkPath;
	}
	
	public AppResult(String apkPath, String attachmentPath) {
		this.apkPath = apkPath;
		this.attachmentPath = attachmentPath;
	}

	/**
	 * @return the apkPath
	 */
	public String getApkPath() {
		return apkPath;
	}

	/**
	 * @param apkPath the apkPath to set
	 */
	public void setApkPath(String apkPath) {
		this.apkPath = apkPath;
	}

	/**
	 * @return the imagePathList
	 */
	public List<String> getImagePathList() {
		return imagePathList;
	}

	/**
	 * @param imagePathList the imagePathList to set
	 */
	public void setImagePathList(List<String> imagePathList) {
		this.imagePathList = imagePathList;
	}

	/**
	 * @return the logoPath
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * @param logoPath the logoPath to set
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	
	/**
	 * @return the attachmentPath
	 */
	public String getAttachmentPath() {
		return attachmentPath;
	}

	/**
	 * @param attachmentPath the attachmentPath to set
	 */
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
