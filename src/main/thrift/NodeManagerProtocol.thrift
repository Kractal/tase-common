#
# Interface definition for Node Manager
#

include	"App.thrift"
include "Container.thrift"
include "Exception.thrift"
include "Job.thrift"
include "Node.thrift"

namespace java com.softsec.tase.common.rpc.service.node
namespace php com.softsec.tase.common.rpc.service.node

# API version (NOT the product version)
# VERSION = "0.2.0"
# AUTHOR = yanwei

#
# service api
#

/** Task Service response for RPCs from task manager */
service TaskService{
	
	/** 
	 * execute context
	 * @param	context
	 * @return	succeed or not
	 */
	i32 submitContext	(
		1:	required	Container.Context		context
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.TimeoutException			te
	),
					
	/**
	 * terminate specific context
	 * @param	jobId
	 * @return	succeed or not
	 */
	i32	terminateContext	(
		1:	required	string					taskId
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.NotFoundException			nfe,
		4:	Exception.TimeoutException			te
	),
	
	/**
	 * update program
	 * @param	program name
	 * @return	succeed or not
	 */		
	i32	updateProgram	(
		1:	required	string					programName
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.NotFoundException			nfe,
		4:	Exception.TimeoutException			te
	),
					
	/**
	 * update node config and status
	 * @param
	 * @return Node.Node
	 */
	Node.NodeInfo	updateNodeInfo	(
	)	throws	(
		1:	Exception.UnavailableException		ue,
		2:	Exception.TimeoutException			te
	),
}

/** Node Client Service responses for RPCs from clients */
service NodeClientService {
	
	/** 
	 * obtaining queue information
	 * @param
	 * @return queue information in json
	 */
	string obtainQueueInfo(
	)	throws	(
		1:	Exception.UnavailableException		ue,
		2:	Exception.TimeoutException			te
	),
} 

/** Program Service response for RPCs from all programs */
service ProgramTrackerService {

	/** 
	 * upload result from program to its node manager
	 * @param	jobLifecycle
	 * @param	resultType
	 * @param	content
	 * @param	identifier for appId or jobId
	 * @return	succeed or not
	 */
	i32 transferResult	(
		1:	required	App.AppType				appType,
		2:	required	Job.JobLifecycle		jobLifecycle,
		3:	required	Job.JobPhase			resultType,
		4:	required	binary					content,
		5:	required	i64						taskId,
		6:	optional	string					identifier
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.TimeoutException			te
	),
	
	/**
	 * fetch app file from ftp
	 * @param	sourceFileName fileName
	 * @param	destinationFilePath
	 * @return	0 if succeed, <0 if failed
	 */
	i32 fetchApp		(
		1:	required	string					repository,
		2:	required	string					sourceFileName,
		3:	required	string					destinationFilePath
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.TimeoutException			te
	),
}