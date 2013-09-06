/**
 * 
 */
package com.softsec.tase.common.dto.app.ipa;

import java.io.Serializable;

/**
 * IpaItunesMetadata.java
 * <p></p>
 * @author yanwei
 * @since 2013-4-24 下午1:39:01
 * @version
 */
public class IpaItunesMetadata implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6975236178978956246L;

	private String appleId; //steve@rim.jobs
	
	private long artistId; //286038741
	
	private String artistName; //Chillingo Ltd

	public String getAppleId() {
		return appleId;
	}

	public void setAppleId(String appleId) {
		this.appleId = appleId;
	}

	public long getArtistId() {
		return artistId;
	}

	public void setArtistId(long artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
}
