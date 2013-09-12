/**
 * 
 */
package com.softsec.tase.common.domain.schedule;

import com.softsec.tase.common.rpc.domain.job.JobOperationRequirement;
import com.softsec.tase.common.rpc.domain.job.JobParameter;
import com.softsec.tase.common.rpc.domain.job.JobPhase;
import com.softsec.tase.common.rpc.domain.job.JobPriority;
import com.softsec.tase.common.rpc.domain.job.JobResourceRequirement;
import com.softsec.tase.common.rpc.domain.job.JobStatus;

/**
 * Task.java
 * @author yanwei
 * @date 2013-3-12 下午6:11:57
 * @description
 */
public class Task implements Comparable<Task>{

	private long taskId;
	
	private JobPriority taskPriority;
	
	private JobPhase jobPhase;
	
	private JobOperationRequirement taskOperationRequirement;
	
	private JobResourceRequirement taskResourceRequirement;
	
	private JobParameter taskParameter;
	
	private JobStatus taskStatus;
	
	private long programId;
	
	private String executorId;
	
	private long loadedTime;
	
	private int schedulingTime;
	
	public Task() {
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Task task) {
		if (taskPriority.getValue() == task.getTaskPriority().getValue()) {
			return Long.valueOf(loadedTime).compareTo(task.getLoadedTime());
		}
		return Integer.valueOf(taskPriority.getValue()).compareTo(task.getTaskPriority().getValue());
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public JobPriority getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(JobPriority taskPriority) {
		this.taskPriority = taskPriority;
	}

	public JobPhase getJobPhase() {
		return jobPhase;
	}

	public void setJobPhase(JobPhase jobPhase) {
		this.jobPhase = jobPhase;
	}
	
	public JobOperationRequirement getTaskOperationRequirement() {
		return taskOperationRequirement;
	}
	
	public void setTaskOperationRequirement(JobOperationRequirement taskOperationRequirement) {
		this.taskOperationRequirement = taskOperationRequirement;
	}

	public JobResourceRequirement getTaskResourceRequirement() {
		return taskResourceRequirement;
	}

	public void setTaskResourceRequirement(
			JobResourceRequirement taskResourceRequirement) {
		this.taskResourceRequirement = taskResourceRequirement;
	}

	public JobParameter getTaskParameter() {
		return taskParameter;
	}

	public void setTaskParameter(JobParameter taskParameter) {
		this.taskParameter = taskParameter;
	}

	public JobStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(JobStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	public long getProgramId() {
		return programId;
	}

	public void setProgramId(long programId) {
		this.programId = programId;
	}

	public String getExecutorId() {
		return executorId;
	}

	public void setExecutorId(String executorId) {
		this.executorId = executorId;
	}

	public long getLoadedTime() {
		return loadedTime;
	}

	public void setLoadedTime(long loadedTime) {
		this.loadedTime = loadedTime;
	}
	
	public int getSchedulingTime() {
		return schedulingTime;
	}
	
	public void setSchedulingTime(int schedulingTime) {
		this.schedulingTime = schedulingTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (loadedTime ^ (loadedTime >>> 32));
		result = prime * result
				+ ((executorId == null) ? 0 : executorId.hashCode());
		result = prime * result
				+ ((jobPhase == null) ? 0 : jobPhase.hashCode());
		result = prime * result + (int) (programId ^ (programId >>> 32));
		result = prime * result + (int) (taskId ^ (taskId >>> 32));
		result = prime
				* result
				+ ((taskOperationRequirement == null) ? 0
						: taskOperationRequirement.hashCode());
		result = prime * result
				+ ((taskParameter == null) ? 0 : taskParameter.hashCode());
		result = prime * result
				+ ((taskPriority == null) ? 0 : taskPriority.hashCode());
		result = prime
				* result
				+ ((taskResourceRequirement == null) ? 0
						: taskResourceRequirement.hashCode());
		result = prime * result
				+ ((taskStatus == null) ? 0 : taskStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (loadedTime != other.loadedTime)
			return false;
		if (executorId == null) {
			if (other.executorId != null)
				return false;
		} else if (!executorId.equals(other.executorId))
			return false;
		if (jobPhase != other.jobPhase)
			return false;
		if (programId != other.programId)
			return false;
		if (taskId != other.taskId)
			return false;
		if (taskOperationRequirement == null) {
			if (other.taskOperationRequirement != null)
				return false;
		} else if (!taskOperationRequirement
				.equals(other.taskOperationRequirement))
			return false;
		if (taskParameter == null) {
			if (other.taskParameter != null)
				return false;
		} else if (!taskParameter.equals(other.taskParameter))
			return false;
		if (taskPriority != other.taskPriority)
			return false;
		if (taskResourceRequirement == null) {
			if (other.taskResourceRequirement != null)
				return false;
		} else if (!taskResourceRequirement
				.equals(other.taskResourceRequirement))
			return false;
		if (taskStatus != other.taskStatus)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskPriority=" + taskPriority
				+ ", jobPhase=" + jobPhase + ", taskOperationRequirement="
				+ taskOperationRequirement + ", taskResourceRequirement="
				+ taskResourceRequirement + ", taskParameter=" + taskParameter
				+ ", taskStatus=" + taskStatus + ", programId=" + programId
				+ ", executorId=" + executorId + ", loadedTime=" + loadedTime
				+ "]";
	}
}
