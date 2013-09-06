/**
 * 
 */
package com.softsec.tase.common.util.domain;

import java.text.DecimalFormat;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.job.JobLifecycle;
import com.softsec.tase.common.rpc.domain.job.JobPhase;

/**
 * ProgramUtils
 * <p> </p>
 * @author yanwei
 * @since 2013-8-5 下午2:49:16
 * @version
 */
public class ProgramUtils {

	/**
	 * get program type by app type & job lifecycle & job phase
	 * @param appType
	 * @param jobLifecycle
	 * @param jobPhase
	 * @return
	 */
	public static int getProgramType(AppType appType, JobLifecycle jobLifecycle, JobPhase jobPhase) {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(appType.getValue());
		sbuilder.append(jobLifecycle.getValue());
		sbuilder.append(new DecimalFormat("000000").format(jobPhase.getValue()));
		return Integer.parseInt(sbuilder.toString());
	}
	
	/**
	 * get program type by task id & status
	 * @param taskId
	 * @param taskStatusCode
	 * @return
	 */
	public static int getProgramType(Long taskId, JobPhase jobPhase) {
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(String.valueOf(taskId).substring(0, 2));
		sbuilder.append(JobUtils.getJobPhaseCode(jobPhase));
		return Integer.parseInt(sbuilder.toString());
	}
	
	/**
	 * get program type by program id
	 * @param programId
	 * @return
	 */
	public static int getProgramType(Long programId) {
		return Integer.parseInt(String.valueOf(programId).substring(0, 8));
	}
}
