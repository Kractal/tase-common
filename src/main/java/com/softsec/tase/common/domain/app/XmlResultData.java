package com.softsec.tase.common.domain.app;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *@author nancy
 *@version 2013-5-21上午10:34:26
 */
public class XmlResultData implements Serializable{
	private  String ApkName;
	private  String ApkDescription;
	private  String MD5;
	private  List<String> highlightList = new LinkedList<String>();
	private  List<String> JFQList = new LinkedList<String>();
	private List<ResultData> rdList = new ArrayList<ResultData>();
	private List<String> txtList =new LinkedList<String>();
	public List<String> getTxtList() {
		return txtList;
	}
	public void setTxtList(List<String> txtList) {
		this.txtList = txtList;
	}
	public String getApkName() {
		return ApkName;
	}
	public void setApkName(String apkName) {
		ApkName = apkName;
	}
	public String getApkDescription() {
		return ApkDescription;
	}
	public void setApkDescription(String apkDescription) {
		ApkDescription = apkDescription;
	}
	public String getMD5() {
		return MD5;
	}
	public void setMD5(String mD5) {
		MD5 = mD5;
	}
	public List<String> getHighlightList() {
		return highlightList;
	}
	public void setHighlightList(List<String> highlightList) {
		this.highlightList = highlightList;
	}
	public List<String> getJFQList() {
		return JFQList;
	}
	public void setJFQList(List<String> jFQList) {
		JFQList = jFQList;
	}
	public List<ResultData> getRdList() {
		return rdList;
	}
	public void setRdList(List<ResultData> rdList) {
		this.rdList = rdList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "XmlResultData [ApkName=" + ApkName + ", ApkDescription="
				+ ApkDescription + ", MD5=" + MD5 + ", highlightList="
				+ highlightList + ", JFQList=" + JFQList + ", rdList=" + rdList
				+ ", txtList=" + txtList + "]" + "\n";
	}
}
