/**
 * 
 */
package com.softsec.tase.common.rpc.service.task;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

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
import com.softsec.tase.common.rpc.domain.node.ClusterType;

/**
 * @author yanwei
 * @time 2013-4-26 下午3:02:34
 * @description
 *
 */
public class TaskClientServiceTest extends TestCase {

	public void testSubmitJob() {
//		TaskClientService.Client receiver = null;
//		
//		String domainOrIp = 192.168.1.191;
//		int port = 6010;
//		int timeout = 5000; // ms
//		int retryTimes = 10;
//		
//		
//		receiver = RpcUtils.getReceiver(domainOrIp, port, timeout, retryTimes);
		int userId = 10;
		
		// assign app platform
		AppType appType = AppType.APK;
		
		// assign job life cycle
		JobLifecycle lifecycle = JobLifecycle.ANALYSIS;
		
		// define job procedure : 1st job phase --> 2nd job phase --> ... --> last job phase
		List<JobPhase> jobPhaseList = new ArrayList<JobPhase>();
		jobPhaseList.add(JobPhase.ON_STATIC);
		
		// assign job distribution mode
		JobDistributionMode distribution = JobDistributionMode.SERIAL;
		
		// assign job priority
		JobPriority priority = JobPriority.MEDIUM;
		
		// control each job phase 's operation
		List<JobOperationRequirement> operationList = new ArrayList<JobOperationRequirement>();
		JobOperationRequirement operation = new JobOperationRequirement();
		operation.setJobPhase(JobPhase.ON_STATIC);
		operation.setJobExecutionMode(JobExecutionMode.EXCLUSIVE); // serial execution
		operation.setJobReturnMode(JobReturnMode.ACTIVE);
		operation.setTimeout(30 * 60 * 1000); // 30 minutes
		operationList.add(operation);
		
		// control each job phase 's scheduling
		List<JobResourceRequirement> resourceList = new ArrayList<JobResourceRequirement>();
		JobResourceRequirement resource = new JobResourceRequirement();
		resource.setJobPhase(JobPhase.ON_STATIC);
		resource.setClusterType(ClusterType.DEDICATED); // 集群分为专用集群与通用集群
		resource.setExecutorId("192.168.1.195:7010"); // optional : assign specific node for specific job phase
		resource.setProgramId(100000); // optional : assign specific program for specific job phase
		resourceList.add(resource);
		
		// assign parameters
		List<JobParameter> paramList = new ArrayList<JobParameter>();
		JobParameter param = new JobParameter();
		
		// total execution time
		long impatienceTime = 1 * 24 * 60 * 60 * 1000;
		
//		receiver.submitJob(userId,
//							appType,
//							lifecycle,
//							jobPhaseList,
//							distribution,
//							priority,
//							operationList,
//							resourceList,
//							paramList,
//							impatienceTime);
	}
}
