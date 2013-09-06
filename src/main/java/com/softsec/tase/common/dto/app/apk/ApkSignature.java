/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkSignature.java
 * <p></p>
 * @author yanwei
 * @since 2013-4-24 下午1:15:52
 * @version
 * 
 * add the items of signature
 * @update xuxiaodong
 * @since 2013-4-25
 */
public class ApkSignature implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1881115378157534300L;
	
	private String certificateType = null;//证书类型
	
	private String publicKeyModulus = null;//公钥大整数
	
	private Long   publicKeyExponent = 0L;//公钥大素数
	
	private String algorithm = null;//使用的算法
	
	private int certificateHashCode = 0;//证书的hash码

	/**
	 * @return the certificateType
	 */
	public String getCertificateType() {
		return certificateType;
	}

	/**
	 * @param certificateType the certificateType to set
	 */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	/**
	 * @return the publicKeyModulus
	 */
	public String getPublicKeyModulus() {
		return publicKeyModulus;
	}

	/**
	 * @param publicKeyModulus the publicKeyModulus to set
	 */
	public void setPublicKeyModulus(String publicKeyModulus) {
		this.publicKeyModulus = publicKeyModulus;
	}

	/**
	 * @return the publicKeyExponent
	 */
	public Long getPublicKeyExponent() {
		return publicKeyExponent;
	}

	/**
	 * @param publicKeyExponent the publicKeyExponent to set
	 */
	public void setPublicKeyExponent(String publicKeyExponent) {
		this.publicKeyExponent = Long.parseLong(publicKeyExponent);
	}

	/**
	 * @return the algorithm
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm the algorithm to set
	 */
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * @return the certificateHashCode
	 */
	public int getCertificateHashCode() {
		return certificateHashCode;
	}

	/**
	 * @param certificateHashCode the certificateHashCode to set
	 */
	public void setCertificateHashCode(int certificateHashCode) {
		this.certificateHashCode = certificateHashCode;
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
		return "ApkSignature [certificateType=" + certificateType
				+ ", publicKeyModulus=" + publicKeyModulus
				+ ", publicKeyExponent=" + publicKeyExponent + ", algorithm="
				+ algorithm + ", certificateHashCode=" + certificateHashCode
				+ "]";
	}
	
}
