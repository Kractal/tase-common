/**
 * 
 */
package com.softsec.tase.common.dto.app.ipa;

import java.io.Serializable;

import com.softsec.tase.common.dto.app.FileMetadata;

/**
 * Ipa.java
 * @author yanwei
 * @date 2013-2-2 下午8:10:11
 * @description
 */
public class Ipa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7138334108888164623L;

	private String executableMd5;
	
	private String executableMagicNumber;
	
	private boolean duplicated;
	
	private FileMetadata fileMetadata;
	
	private IpaInfo ipaInfo;
	
	private IpaItunesMetadata ipaItunesMetadata;

	public String getExecutableMd5() {
		return executableMd5;
	}

	public void setExecutableMd5(String executableMd5) {
		this.executableMd5 = executableMd5;
	}
	
	public String getExecutableMagicNumber() {
		return executableMagicNumber;
	}
	
	public void setExecutableMagicNumber(String executableMagicNumber) {
		this.executableMagicNumber = executableMagicNumber;
	}

	public boolean isDuplicated() {
		return duplicated;
	}
	
	public void setDuplicated(boolean duplicated) {
		this.duplicated = duplicated;
	}

	public FileMetadata getFileMetadata() {
		return fileMetadata;
	}

	public void setFileMetadata(FileMetadata fileMetadata) {
		this.fileMetadata = fileMetadata;
	}

	public IpaInfo getIpaInfo() {
		return ipaInfo;
	}

	public void setIpaInfo(IpaInfo ipaInfo) {
		this.ipaInfo = ipaInfo;
	}

	public IpaItunesMetadata getIpaItunesMetadata() {
		return ipaItunesMetadata;
	}

	public void setIpaItunesMetadata(IpaItunesMetadata ipaItunesMetadata) {
		this.ipaItunesMetadata = ipaItunesMetadata;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}