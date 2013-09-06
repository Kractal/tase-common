/**
 * 
 */
package com.softsec.tase.common.domain.result;

import java.util.Date;
import java.util.List;

import com.softsec.tase.common.domain.rule.AndroidStaticRule;

/**
 *@author yanwei
 *@time: 2012-11-6 下午4:22:15
 *@description Android静态检测结果类
 *
 */
/**
 *
 */
public class AndroidStaticResult {

	private AppBrief appBrief;
	private List<ResultDetail> resultDetailList;
	/**
	 * 
	 */
	public AndroidStaticResult() {
	}
	/**
	 * @return the appBrief
	 */
	public AppBrief getAppBrief() {
		return appBrief;
	}
	/**
	 * @param appBrief the appBrief to set
	 */
	public void setAppBrief(AppBrief appBrief) {
		this.appBrief = appBrief;
	}
	/**
	 * @return the resultDetailList
	 */
	public List<ResultDetail> getResultDetailList() {
		return resultDetailList;
	}
	/**
	 * @param resultDetailList the resultDetailList to set
	 */
	public void setResultDetailList(List<ResultDetail> resultDetailList) {
		this.resultDetailList = resultDetailList;
	}
	/**
	 * Inner Class
	 * about app brief info
	 */
	public static class AppBrief {
		private String appId;
		private String appName;
		private String appPath;
		private String appDesc;
		private String missionId;
		private String md5;
		private Date commitTime;
		private Date finishTime = new Date();
		private long elapseTime;
		/**
		 * 
		 */
		public AppBrief() {
		}
		/**
		 * @return the appId
		 */
		public String getAppId() {
			return appId;
		}
		/**
		 * @param appId the appId to set
		 */
		public void setAppId(String appId) {
			this.appId = appId;
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
		 * @return the appPath
		 */
		public String getAppPath() {
			return appPath;
		}
		/**
		 * @param appPath the appPath to set
		 */
		public void setAppPath(String appPath) {
			this.appPath = appPath;
		}
		/**
		 * @return the appDesc
		 */
		public String getAppDesc() {
			return appDesc;
		}
		/**
		 * @param appDesc the appDesc to set
		 */
		public void setAppDesc(String appDesc) {
			this.appDesc = appDesc;
		}
		/**
		 * @return the missionId
		 */
		public String getMissionId() {
			return missionId;
		}
		/**
		 * @param missionId the missionId to set
		 */
		public void setMissionId(String missionId) {
			this.missionId = missionId;
		}
		/**
		 * @return the md5
		 */
		public String getMd5() {
			return md5;
		}
		/**
		 * @param md5 the md5 to set
		 */
		public void setMd5(String md5) {
			this.md5 = md5;
		}
		/**
		 * @return the commitTime
		 */
		public Date getCommitTime() {
			return commitTime;
		}
		/**
		 * @param commitTime the commitTime to set
		 */
		public void setCommitTime(Date commitTime) {
			this.commitTime = commitTime;
		}
		/**
		 * @return the finishTime
		 */
		public Date getFinishTime() {
			return finishTime;
		}
		/**
		 * @param finishTime the finishTime to set
		 */
		public void setFinishTime(Date finishTime) {
			this.finishTime = finishTime;
		}
		/**
		 * @return the elapseTime
		 */
		public long getElapseTime() {
			return elapseTime;
		}
		/**
		 * @param elapseTime the elapseTime to set
		 */
		public void setElapseTime(long elapseTime) {
			this.elapseTime = elapseTime;
		}
		/**
		 * set elapseTime with finishTime and commitTime
		 */
		public void setElapseTime() {
			this.elapseTime = this.finishTime.getTime() - this.commitTime.getTime();
		}
	}
	
	/**
	 * Inner Class
	 * about analysis result including rule info and code reference info
	 */
	public static class ResultDetail {
		//location
		private String fileName;
		private int rowNum;
		private int ColumnNum;
		
		private AndroidStaticRule ruleInfo;
		/**
		 * 
		 */
		public ResultDetail() {
		}
		/**
		 * @return the fileName
		 */
		public String getFileName() {
			return fileName;
		}
		/**
		 * @param fileName the fileName to set
		 */
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		/**
		 * @return the rowNum
		 */
		public int getRowNum() {
			return rowNum;
		}
		/**
		 * @param rowNum the rowNum to set
		 */
		public void setRowNum(int rowNum) {
			this.rowNum = rowNum;
		}
		/**
		 * @return the columnNum
		 */
		public int getColumnNum() {
			return ColumnNum;
		}
		/**
		 * @param columnNum the columnNum to set
		 */
		public void setColumnNum(int columnNum) {
			ColumnNum = columnNum;
		}
		/**
		 * @return the ruleInfo
		 */
		public AndroidStaticRule getRuleInfo() {
			return ruleInfo;
		}
		/**
		 * @param ruleInfo the ruleInfo to set
		 */
		public void setRuleInfo(AndroidStaticRule ruleInfo) {
			this.ruleInfo = ruleInfo;
		}
	}
}
