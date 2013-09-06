/**
 * 
 */
package com.softsec.tase.common.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

import junit.framework.TestCase;

import com.softsec.tase.common.domain.schedule.Job;
import com.softsec.tase.common.rpc.domain.job.JobPhase;
import com.softsec.tase.common.rpc.domain.job.JobPriority;
import com.softsec.tase.common.rpc.domain.job.JobStatus;
import com.softsec.tase.common.util.domain.JobUtils;

/**
 * MissionTest.java
 * @author yanwei
 * @date 2013-1-28 下午5:13:31
 * @description
 */
public class JobUtilsTest extends TestCase {

	public void testJobPriority() {
		Job jobA = new Job();
		Job jobB = new Job();
		
		jobA.setJobId(1L);
		jobA.setJobPriority(JobPriority.MEDIUM);
		jobA.setCommittedTime(System.currentTimeMillis());
		
		jobB.setJobId(2L);
		jobB.setJobPriority(JobPriority.HIGH);
		jobB.setCommittedTime(System.currentTimeMillis() + 100000);
		
		PriorityBlockingQueue<Job> queue = new PriorityBlockingQueue<Job>();
		queue.add(jobA);
		queue.add(jobB);
		
		Iterator<Job> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(((Job)iterator.next()).getJobId());
		}
	}
	
	public void testGetJobPhaseCode() {
		List<JobPhase> jobPhaseList = new ArrayList<JobPhase>();
		for (JobPhase jobPhase : JobPhase.values()) {
			jobPhaseList.add(jobPhase);
		}
		System.out.println(JobUtils.getJobPhaseCode(jobPhaseList));
		for (JobPhase jobPhase : JobPhase.values()) {
			System.out.println(jobPhase);
		}
	}
	
	public void testGetJobStatusCode() {
		int jobStatusCode = JobUtils.getJobStatusCode(JobPhase.ON_STATIC, JobStatus.FINISHED); 
		System.out.println(jobStatusCode);
		System.out.println(JobUtils.getJobPhase(jobStatusCode));
		System.out.println(JobUtils.getJobStatus(jobStatusCode));
	}
	
	public void testGetJobPhaseList() {
		long jobId = 100021170000004L;
		System.out.println(JobUtils.getJobPhaseList(jobId));
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
}
