/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;
import java.util.List;

import com.softsec.tase.common.dto.app.FileMetadata;

/**
 * Apk.java
 * @author yanwei
 * @date 2013-2-2 下午7:18:17
 * @description
 */
public class Apk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8261765932030982214L;

	private String bundleChecksum;
	
	private String bundleMagicNumber;
	
	private boolean duplicated;
	
	private FileMetadata fileMetadata;
	
	private ApkManifest apkManifest;
	
	private ApkSignature apkSignature;
	
	private List<FileMetadata> imageMetadataList;
	
	private FileMetadata logoMetadata;

	/**
	 * @return the bundleChecksum
	 */
	public String getBundleChecksum() {
		return bundleChecksum;
	}

	/**
	 * @param bundleChecksum the bundleChecksum to set
	 */
	public void setBundleChecksum(String bundleChecksum) {
		this.bundleChecksum = bundleChecksum;
	}

	/**
	 * @return the bundleMagicNumber
	 */
	public String getBundleMagicNumber() {
		return bundleMagicNumber;
	}

	/**
	 * @param bundleMagicNumber the bundleMagicNumber to set
	 */
	public void setBundleMagicNumber(String bundleMagicNumber) {
		this.bundleMagicNumber = bundleMagicNumber;
	}

	/**
	 * @return the duplicated
	 */
	public boolean isDuplicated() {
		return duplicated;
	}

	/**
	 * @param duplicated the duplicated to set
	 */
	public void setDuplicated(boolean duplicated) {
		this.duplicated = duplicated;
	}

	/**
	 * @return the fileMetadata
	 */
	public FileMetadata getFileMetadata() {
		return fileMetadata;
	}

	/**
	 * @param fileMetadata the fileMetadata to set
	 */
	public void setFileMetadata(FileMetadata fileMetadata) {
		this.fileMetadata = fileMetadata;
	}

	/**
	 * @return the apkManifest
	 */
	public ApkManifest getApkManifest() {
		return apkManifest;
	}

	/**
	 * @param apkManifest the apkManifest to set
	 */
	public void setApkManifest(ApkManifest apkManifest) {
		this.apkManifest = apkManifest;
	}

	/**
	 * @return the apkSignature
	 */
	public ApkSignature getApkSignature() {
		return apkSignature;
	}

	/**
	 * @param apkSignature the apkSignature to set
	 */
	public void setApkSignature(ApkSignature apkSignature) {
		this.apkSignature = apkSignature;
	}

	/**
	 * @return the imageMetadataList
	 */
	public List<FileMetadata> getImageMetadataList() {
		return imageMetadataList;
	}

	/**
	 * @param imageMetadataList the imageMetadataList to set
	 */
	public void setImageMetadataList(List<FileMetadata> imageMetadataList) {
		this.imageMetadataList = imageMetadataList;
	}

	/**
	 * @return the logoMetadata
	 */
	public FileMetadata getLogoMetadata() {
		return logoMetadata;
	}

	/**
	 * @param logoMetadata the logoMetadata to set
	 */
	public void setLogoMetadata(FileMetadata logoMetadata) {
		this.logoMetadata = logoMetadata;
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
		return "Apk [bundleChecksum=" + bundleChecksum + ", bundleMagicNumber="
				+ bundleMagicNumber + ", duplicated=" + duplicated
				+ ", fileMetadata=" + fileMetadata + ", apkManifest="
				+ apkManifest + ", apkSignature=" + apkSignature
				+ ", imageMetadataList=" + imageMetadataList
				+ ", logoMetadata=" + logoMetadata + "]";
	}
}
