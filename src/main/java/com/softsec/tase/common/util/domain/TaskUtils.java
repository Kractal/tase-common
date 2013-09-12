/**
 * 
 */
package com.softsec.tase.common.util.domain;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.job.JobLifecycle;

/**
 * TaskUtils
 * <p> </p>
 * @author yanwei
 * @since 2013-8-5 下午3:14:52
 * @version
 */
public class TaskUtils {

	/**
	 * get job type from task id
	 * @param taskId
	 * @return
	 */
	public static int getJobType(long taskId) {
		return (int)(taskId / 100000000);
	}
	
	/**
	 * get app type from task id
	 * @param taskId
	 * @return
	 */
	public static AppType getAppType(long taskId) {
		return AppType.findByValue(Integer.parseInt(String.valueOf(taskId).substring(0, 1)));
	}
	
	/**
	 * get job life cycle from task id
	 * @param taskId
	 * @return
	 */
	public static JobLifecycle getJobLifecycle(long taskId) {
		return JobLifecycle.findByValue(Integer.parseInt(String.valueOf(taskId).substring(1, 2)));
	}
	
}
