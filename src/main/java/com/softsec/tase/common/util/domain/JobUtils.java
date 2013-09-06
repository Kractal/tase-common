/**
 * 
 */
package com.softsec.tase.common.util.domain;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.job.JobExecutionMode;
import com.softsec.tase.common.rpc.domain.job.JobLifecycle;
import com.softsec.tase.common.rpc.domain.job.JobPhase;
import com.softsec.tase.common.rpc.domain.job.JobPriority;
import com.softsec.tase.common.rpc.domain.job.JobReturnMode;
import com.softsec.tase.common.rpc.domain.job.JobStatus;

/**
 * JobUtils
 * <p> </p>
 * @author yanwei
 * @since 2013-8-5 下午2:44:18
 * @version
 */
public class JobUtils {

	/**
	 * check if a member of job life cycle
	 * @param jobType
	 * @return
	 */
	public static boolean isJobLifecycleMember(JobLifecycle jobLifecycle) {
		JobLifecycle[] jobLifecycles = JobLifecycle.values();
		for (JobLifecycle lifecycle : jobLifecycles) {
			if (lifecycle.equals(jobLifecycle)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * check if a member of job phase
	 * @param jobStatus
	 * @return
	 */
	public static boolean isJobPhaseMember(JobPhase jobPhase) {
		JobPhase[] jobPhases = JobPhase.values();
		for (JobPhase phase : jobPhases) {
			if (phase.equals(jobPhase)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * check if a member of job execution mode
	 * @param jobExecutionMode
	 * @return
	 */
	public static boolean isJobExecutionModeMember(JobExecutionMode jobExecutionMode) {
		JobExecutionMode[] jobExecutionModes = JobExecutionMode.values();
		for (JobExecutionMode executionMode : jobExecutionModes) {
			if (executionMode.equals(jobExecutionMode)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * check if a member of job return mode
	 * @param jobReturnMode
	 * @return
	 */
	public static boolean isJobReturnModeMember(JobReturnMode jobReturnMode) {
		JobReturnMode[] jobReturnModes = JobReturnMode.values();
		for (JobReturnMode returnMode : jobReturnModes) {
			if (returnMode.equals(jobReturnMode)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * check if a member of job status
	 * @param jobStatus
	 * @return
	 */
	public static boolean isJobStatusMember(JobStatus jobStatus) {
		JobStatus[] jobStatuses = JobStatus.values();
		for (JobStatus status : jobStatuses) {
			if (status.equals(jobStatus)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * check if a member of job priority
	 * @param jobPriority
	 * @return
	 */
	public static boolean isJobPriorityMember(JobPriority jobPriority) {
		JobPriority[] jobPriorities = JobPriority.values();
		for (JobPriority priority : jobPriorities) {
			if (priority.equals(jobPriority)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * get job phase code from job phase list
	 * @param jobPhaseList
	 * @return
	 */
	public static int getJobPhaseCode(List<JobPhase> jobPhaseList) {
		int jobPhaseCode = 0;
		int initiateCode = 1;
		for (JobPhase jobPhase : jobPhaseList) {
			jobPhaseCode += initiateCode << (jobPhase.getValue() - 1);
		}
		return jobPhaseCode;
	}
	
	/**
	 * get job phase code from job phase
	 * @param jobPhase
	 * @return
	 */
	public static int getJobPhaseCode(JobPhase jobPhase) {
		int initiateCode = 1;
		return initiateCode << (jobPhase.getValue() - 1);
	}
	
	/**
	 * get first job phase from job phase code
	 * @param jobPhaseCode
	 * @return
	 */
	public static JobPhase getFirstJobPhase(int jobPhaseCode) {
		for (JobPhase jobPhase : JobPhase.values()) {
			if ((jobPhaseCode & jobPhase.getValue()) == jobPhase.getValue()) {
				return jobPhase;
			}
		}
		return null;
	}
	
	/**
	 * get next job phase
	 * @param jobId
	 * @param currentJobPhase
	 * @return
	 */
	public static JobPhase getNextJobPhase(long jobId, JobPhase currentJobPhase) {
		List<JobPhase> jobPhaseList = getJobPhaseList(jobId);
		if (jobPhaseList.indexOf(currentJobPhase) >= jobPhaseList.size() - 1) {
			return null;
		} else {
			return jobPhaseList.get(jobPhaseList.indexOf(currentJobPhase) + 1);
		}
	}
	
	/**
	 * get job type
	 * @param appType
	 * @param jobLifecycle
	 * @param jobPhaseCode
	 * @return
	 */
	public static long getJobType(AppType appType, JobLifecycle jobLifecycle, int jobPhaseCode) {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(appType.getValue());
		sbuilder.append(jobLifecycle.getValue());
		sbuilder.append(new DecimalFormat("000000").format(jobPhaseCode));
		return Long.parseLong(sbuilder.toString());
	}
	
	/**
	 * get job phase list from job id
	 * @param jobId
	 * @return
	 */
	public static List<JobPhase> getJobPhaseList(long jobId) {
		List<JobPhase> jobPhaseList = new ArrayList<JobPhase>();
		int jobPhaseCode = Integer.parseInt(String.valueOf(jobId).substring(2, 8));
		for (JobPhase jobPhase : JobPhase.values()) {
			int jobPhaseValue = 1 << (jobPhase.getValue() - 1);
			if ((jobPhaseCode & jobPhaseValue) == jobPhaseValue) {
				jobPhaseList.add(jobPhase);
			}
		}
		return jobPhaseList;
	}
	
	/**
	 * get job status code by job phase and job status
	 * @param jobPhase
	 * @param jobStatus
	 * @return
	 */
	public static int getJobStatusCode(JobPhase jobPhase, JobStatus jobStatus) {
		return (jobPhase.getValue() * 100) + jobStatus.getValue();
	}
	
	/**
	 * get job phase by job status code
	 * @param jobStatusCode
	 * @return
	 */
	public static JobPhase getJobPhase(int jobStatusCode) {
		return JobPhase.findByValue(jobStatusCode / 100);
	}
	
	/**
	 * get job status by job status code
	 * @param jobStatusCode
	 * @return
	 */
	public static JobStatus getJobStatus(int jobStatusCode) {
		return JobStatus.findByValue(jobStatusCode % 100);
	}
	
	/**
	 * get job lifecycle from jobId
	 * @param jobId
	 * @return
	 */
	public static JobLifecycle getJobLifecycle(long jobId) {
		return JobLifecycle.findByValue(Integer.parseInt(String.valueOf(jobId).substring(1, 2)));
	}
	
	
	
//	/**
//	 * get job operation requirement from string
//	 * @param jobRequest
//	 * @return
//	 */
//	public static JobOperationRequirement getJobOperationRequirement(String jobRequest) {
//		Map<String, Object> classMap = new HashMap<String, Object>();
//		classMap.put("taskOperationRequirement", TaskOperationRequirement.class);
//		classMap.put("jobPhase", JobPhase.class);
//		classMap.put("executionMode", JobExecutionMode.class);
//		classMap.put("returnMode", JobReturnMode.class);
//		return (JobOperationRequirement) JsonUtils.deserialize(jobRequest, JobOperationRequirement.class, classMap);
//	}
//	
//	/**
//	 * get job resource requirement from string
//	 * @param resourceRequest
//	 * @return
//	 */
//	public static JobResourceRequirement getJobResourceRequirement(String resourceRequest) {
//		Map<String, Object> classMap = new HashMap<String, Object>();
//		classMap.put("taskResourceRequirement", TaskResourceRequirement.class);
//		classMap.put("jobPhase", JobPhase.class);
//		classMap.put("clusterType", ClusterType.class);
//		classMap.put("nodeType", NodeType.class);
//		return (JobResourceRequirement) JsonUtils.deserialize(resourceRequest, JobResourceRequirement.class, classMap);
//	}
//	
//	public static JobParameter getParameterList(String parameters) {
//		Map<String, Object> classMap = new HashMap<String, Object>();
//		classMap.put("taskParameter", TaskParameter.class);
//		return (JobParameter)JsonUtils.deserialize(parameters, JobParameter.class, classMap);
//	}
}
