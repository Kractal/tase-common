#
# Interface definition for Task Manager
#

include "App.thrift"
include "Container.thrift"
include "Exception.thrift"
include "Job.thrift"
include "Node.thrift"

namespace java com.softsec.tase.common.rpc.service.task
namespace php com.softsec.tase.common.rpc.service.task

# API version (NOT the product version)
# VERSION = "0.2.0"
# AUTHOR = yanwei

#
# service api
#

/** Task Client Service response for RPCs from clients */
service TaskClientService {

	/** check network connectivity manually */
	string ping(
	)	throws	(
			1:Exception.UnavailableException ue,
			2:Exception.TimeoutException te
	),

	/**
	 * job submission
	 * @param	userId
	 * @param	appType
	 * @param	jobLifecycle
	 * @param	jobPhaseList
	 * @param	jobDistributionMode
	 * @param	priority
	 * @param	jobOperationRequirementList
	 * @param	jobResourceRequirementList
	 * @param	parameterList
	 * @param	impatienceTime
	 * @return	jobId
	 */
	i64 submitJob	(
		1:	required	i32 								userId,
		2:	required 	App.AppType 						appType,
		3:	required 	Job.JobLifecycle 					jobLifecycle,
		4:	required 	list<Job.JobPhase> 					jobPhaseList,
		5:	required 	Job.JobDistributionMode 			jobDistributionMode,
		6:	required 	Job.JobPriority 					jobPriority,
		7:	required 	list<Job.JobOperationRequirement>	jobOperationRequirementList,
		8:	optional 	list<Job.JobResourceRequirement>	jobResourceRequirementList,
		9:	optional 	list<Job.JobParameter>				parameterList,
		10:	optional 	i64 								impatienceTime
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/** 
	 * job termination
	 * @param	jobIdList
	 * @return	succeed or not
	 */
	i32 terminateJobs	(
			1:required list<i64>							jobIdList
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.NotFoundException 					nfe,
		4:	Exception.TimeoutException 						te
	),
	
	/** 
	 * obtaining queue information
	 * @return queue information in json
	 */
	string obtainQueueInfo(
	)	throws	(
		1:Exception.UnavailableException					ue,
		2:Exception.TimeoutException						te
	),
	
	/** 
	 * obtaining cluster statistics
	 * @param
	 * @return cluster statistic in json
	 */
	string obtainClusterStat(
	)	throws	(
		1:	Exception.UnavailableException					ue,
		2:	Exception.TimeoutException						te
	),
}

/** Admin Service response for RPCs from admin */
service AdminService {

	/**
	 * check network connectivity manually
	 */
	string ping(
	)	throws	(
		1:	Exception.UnavailableException					ue,
		2:	Exception.TimeoutException						te
	),
					
	/**
	 * check program 's duplication
	 * @param	scriptMd5
	 * @param	executableMd5
	 * @return	programId
	 */
	i64 checkProgramDuplication(
		1:	required	string 								scriptMd5,
		2:	required	string 								executableMd5
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),

	/** 
	 * refreshing node list
	 * @param	nodeIdList
	 * @return	node list in json
	 */
	string refreshNodeList	(
		1:	optional	list<string> 						nodeIdList
	)	throws	(
		1:	Exception.UnavailableException 					ue,
		2:	Exception.TimeoutException 						te
	),
	
	/** 
	 * refreshing queue config
	 * @param
	 * @return queue config in json 
	 */
	string refreshQueueConfig(
	)	throws	(
		1:	Exception.UnavailableException					ue,
		2:	Exception.TimeoutException						te
	),
}

/** Node Tracker Service response for RPCs from all nodes */
service NodeTrackerService {
	
	/** 
	 * registration of new node
	 * @param	nodeInfo
	 * @return	succeed or not
	 */
	i32 registerNode(
		1:	required	Node.NodeInfo						nodeInfo
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/** 
	 * report node heart beat
	 * @param nodePayload
	 * @return succeed or not 
	 */
	i32 reportHeartbeat	(
		1:	required	Node.NodePayload					nodePayload
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),

	/**
	 * report task execution status
	 * @param	taskId
	 * @param	taskStatus
	 * @return	succeed or not
	 */
	i32 reportTaskExecutionStatus (
		1:	required	string								nodeId,
		2:	required	i64 								taskId,
		3:	required	Job.JobPhase						jobPhase,
		4:	required	Job.JobStatus						taskStatus
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/**
	 * check app duplication
	 * @param	appChecksum
	 *		MD5(storeName + url + version)
	 * @return	appId or 0L
	 */			
	i64 checkAppDuplication	(
		1:	required	App.AppType							appType,
		2:	required	App.OriginType						originType,
		3:	required	string								appChecksum
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/**
	 * check file duplication
	 * @param fileChecksum
	 * @return md5 or null
	 */
	string checkFileDuplication	(
		1:	required	App.AppType							appType,
		2:	required	string								fileChecksum
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException					ue,
		3:	Exception.TimeoutException						te
	),
	
	/**
	 * receive result
	 * @param	resultType
	 * @param	content
	 * @param	md5
	 * @param	identifier appId or jobId
	 * @return	succeed or not
	 */
	i32 submitResult (
		1:	required	App.AppType							appType,
		2:	required	Job.JobLifecycle					jobLifecycle,
		3:	required	Job.JobPhase 						resultType,
		4:	required	binary 								content,
		5:	required	string 								resultChecksum,
		6:	required	i64 								taskId,
		7:	optional	string 								identifier
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException					ue,
		3:	Exception.TimeoutException						te
	),
	
	/**
	 * transfer data into new db
	 * @param	appType
	 * @param	appInfo
	 * @param	apkInfo
	 * @param	imageList
	 * @param	result
	 */
	i32 transferData(
		1:	required	App.AppType							appType,
		2:	required	App.AppTransfer						appInfo,
		3:	optional	binary								apkInfo,
		4:	optional	list<binary>						imageList,
		5:	optional	binary								result,								
	) throws (
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
}