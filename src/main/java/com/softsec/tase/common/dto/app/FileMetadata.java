/**
 * 
 */
package com.softsec.tase.common.dto.app;

import java.io.Serializable;

/**
 * FileMetadata.java
 * <p></p>
 * @author yanwei
 * @since 2013-4-24 上午11:48:08
 * @version
 */
public class FileMetadata implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6496242283192330687L;

	private String fileName;
	
	private String filePath;
	
	private String fileChecksum;

	private String extension;
	
	private long length;

	private long createdTime;
	
	private long modifiedTime;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileChecksum() {
		return fileChecksum;
	}

	public void setFileChecksum(String fileChecksum) {
		this.fileChecksum = fileChecksum;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileMetadata [fileName=" + fileName + ", filePath=" + filePath
				+ ", fileChecksum=" + fileChecksum + ", extension=" + extension
				+ ", length=" + length + ", createdTime=" + createdTime
				+ ", modifiedTime=" + modifiedTime + "]";
	}
	
}