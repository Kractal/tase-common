/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkIntentFilterData
 * <p> </p>
 * @author yanwei
 * @since 2013-5-22 上午11:45:03
 * @version
 */
public class ApkIntentFilterData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1139608500231705108L;

	private String host;
	
	private String mimeType;
	
	private String path;
	
	private String pathPattern;
	
	private String pathPrefix;
	
	private int port;
	
	private String scheme;
	
	public ApkIntentFilterData() {
	}
	
	public ApkIntentFilterData(String scheme) {
		this.scheme = scheme;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the pathPattern
	 */
	public String getPathPattern() {
		return pathPattern;
	}

	/**
	 * @param pathPattern the pathPattern to set
	 */
	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}

	/**
	 * @return the pathPrefix
	 */
	public String getPathPrefix() {
		return pathPrefix;
	}

	/**
	 * @param pathPrefix the pathPrefix to set
	 */
	public void setPathPrefix(String pathPrefix) {
		this.pathPrefix = pathPrefix;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the scheme
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * @param scheme the scheme to set
	 */
	public void setScheme(String scheme) {
		this.scheme = scheme;
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
		return "ApkIntentFilterData [host=" + host + ", mimeType=" + mimeType
				+ ", path=" + path + ", pathPattern=" + pathPattern
				+ ", pathPrefix=" + pathPrefix + ", port=" + port + ", scheme="
				+ scheme + "]";
	}
}
