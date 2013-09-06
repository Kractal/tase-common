/**
 * 
 */
package com.softsec.tase.common.domain.schedule;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.job.JobDistributionMode;
import com.softsec.tase.common.rpc.domain.job.JobExecutionMode;
import com.softsec.tase.common.rpc.domain.job.JobLifecycle;
import com.softsec.tase.common.rpc.domain.job.JobOperationRequirement;
import com.softsec.tase.common.rpc.domain.job.JobParameter;
import com.softsec.tase.common.rpc.domain.job.JobPhase;
import com.softsec.tase.common.rpc.domain.job.JobPriority;
import com.softsec.tase.common.rpc.domain.job.JobResourceRequirement;
import com.softsec.tase.common.rpc.domain.job.JobReturnMode;
import com.softsec.tase.common.rpc.domain.job.JobStatus;

/**
 * 任务类
 * @author yanwei
 * @date 2012-12-25 下午3:12:26
 * 
 */
public class Job implements Comparable<Job> {

	private int submitterId;
	
	private long jobId;
	
	private JobDistributionMode jobDistributionMode;
	
	private JobPriority jobPriority;
	
	private List<JobOperationRequirement> jobOperationRequirementList;
	
	private List<JobResourceRequirement> jobResourceRequirementList;
	
	private List<JobParameter> jobParameterList;
	
	private int jobStatus;
	
	private long impatienceTime;
	
	private long committedTime;
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Job job) {
		if (jobPriority.getValue() == job.getJobPriority().getValue()) {
			return Long.valueOf(committedTime).compareTo(job.getCommittedTime());
		}
		return Integer.valueOf(jobPriority.getValue()).compareTo(job.getJobPriority().getValue());
	}

	public int getSubmitterId() {
		return submitterId;
	}

	public void setSubmitterId(int submitterId) {
		this.submitterId = submitterId;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public JobDistributionMode getJobDistributionMode() {
		return jobDistributionMode;
	}

	public void setJobDistributionMode(JobDistributionMode jobDistributionMode) {
		this.jobDistributionMode = jobDistributionMode;
	}

	public JobPriority getJobPriority() {
		return jobPriority;
	}

	public void setJobPriority(JobPriority jobPriority) {
		this.jobPriority = jobPriority;
	}

	public List<JobOperationRequirement> getJobOperationRequirementList() {
		return jobOperationRequirementList;
	}

	public void setJobOperationRequirementList(
			List<JobOperationRequirement> jobOperationRequirementList) {
		this.jobOperationRequirementList = jobOperationRequirementList;
	}

	public List<JobResourceRequirement> getJobResourceRequirementList() {
		return jobResourceRequirementList;
	}

	public void setJobResourceRequirementList(
			List<JobResourceRequirement> jobResourceRequirementList) {
		this.jobResourceRequirementList = jobResourceRequirementList;
	}

	public List<JobParameter> getJobParameterList() {
		return jobParameterList;
	}

	public void setJobParameterList(List<JobParameter> jobParameterList) {
		this.jobParameterList = jobParameterList;
	}

	public int getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(int jobStatus) {
		this.jobStatus = jobStatus;
	}

	public long getImpatienceTime() {
		return impatienceTime;
	}

	public void setImpatienceTime(long impatienceTime) {
		this.impatienceTime = impatienceTime;
	}

	public long getCommittedTime() {
		return committedTime;
	}

	public void setCommittedTime(long committedTime) {
		this.committedTime = committedTime;
	}
}
