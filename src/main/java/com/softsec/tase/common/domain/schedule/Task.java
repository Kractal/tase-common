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

	private Long taskId;
	
	private JobPriority taskPriority;
	
	private JobPhase jobPhase;
	
	private JobOperationRequirement taskOperationRequirement;
	
	private JobResourceRequirement taskResourceRequirement;
	
	private JobParameter taskParameter;
	
	private JobStatus taskStatus;
	
	private Long programId;
	
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
		if (task != null && task.getTaskId() != 0L && task.getTaskId() == taskId) {
			return 0;
		}
		if (taskPriority.getValue() == task.getTaskPriority().getValue()) {
			return Long.valueOf(loadedTime).compareTo(task.getLoadedTime());
		}
		return Integer.valueOf(taskPriority.getValue()).compareTo(task.getTaskPriority().getValue());
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
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

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
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
		result = prime * result + (int) (taskId ^ (taskId >>> 32));
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
		if (taskId != other.taskId)
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
