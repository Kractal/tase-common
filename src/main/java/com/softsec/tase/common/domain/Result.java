/**
 * 
 */
package com.softsec.tase.common.domain;

import java.nio.ByteBuffer;
import java.util.Arrays;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.job.JobLifecycle;
import com.softsec.tase.common.rpc.domain.job.JobPhase;

/**
 * Result
 * @author yanwei
 * @date 2013-1-17 下午3:27:05
 * 
 */
public class Result {
	
	private long taskId;
	
	private AppType appType;
	
	private JobLifecycle jobLifecycle;
	
	private JobPhase resultType;
	
	private ByteBuffer content;
	
	/**
	 * the md5 of byte array result
	 */
	private String md5;
	
	private String identifier;

	/**
	 * @return the taskId
	 */
	public long getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the appType
	 */
	public AppType getAppType() {
		return appType;
	}

	/**
	 * @param appType the appType to set
	 */
	public void setAppType(AppType appType) {
		this.appType = appType;
	}

	/**
	 * @return the jobLifecycle
	 */
	public JobLifecycle getJobLifecycle() {
		return jobLifecycle;
	}

	/**
	 * @param jobLifecycle the jobLifecycle to set
	 */
	public void setJobLifecycle(JobLifecycle jobLifecycle) {
		this.jobLifecycle = jobLifecycle;
	}

	/**
	 * @return the resultType
	 */
	public JobPhase getResultType() {
		return resultType;
	}

	/**
	 * @param resultType the resultType to set
	 */
	public void setResultType(JobPhase resultType) {
		this.resultType = resultType;
	}

	/**
	 * @return the content
	 */
	public ByteBuffer getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(ByteBuffer content) {
		this.content = content;
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
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
