#
# Data structures for job
#

include "App.thrift"
include "Node.thrift"

namespace java com.softsec.tase.common.rpc.domain.job
namespace php com.softsec.tase.common.rpc.domain.job


/** job life cycle enumeration */
enum JobLifecycle {
	ANALYSIS,
	REINFORCE,
}

/** job type enumeration */
enum JobPhase {

	# crawl
	INITIALIZE = 1,
	# keyword detect
	VALIDATE,
	# download
	GENERATE,
	# anti-virus
	PREPARE,
	PROCESS,
	PRE_STATIC,
	# static detection
	ON_STATIC,
	POST_STATIC,
	TEST,
	EVALUATE,
	PRE_DYNAMIC,
	# static detection
	ON_DYNAMIC,
	POST_DYNAMIC,
	INTEGRATE,
	# manual review
	VERIFY,
	# signature
	PACKAGE,
	DEPLOY,
}

/** job distribution mode enumeration */
enum JobDistributionMode {

	SERIAL,
	PARALLEL,
}

/** job execution mode enumeration */
enum JobExecutionMode {
	
	CONCURRENT,
	EXCLUSIVE,	
}

enum JobReturnMode {

	PASSIVE,
	ACTIVE,
}

/** job status enumeration */
enum JobStatus {

	COMMITTED,
	SCHEDULING_FAILED,
	SCHEDULED,
	ISSUE_FAILED,
	ISSUED,
	RUNNING,
	INTERRUPTED,
	KILLED,
	TIMEOUT,
	FAILURE,
	FINISHED,
}

/** job priority enumeration */
enum JobPriority {
	HIGHER = 1,
	HIGH,
	MEDIUM,
	LOW,
	LOWER,
}

/** job operation requirement */
struct JobOperationRequirement {

	1:	required	JobLifecycle		jobLifecycle,
	2:	required 	JobPhase			jobPhase,
	3:	optional 	JobExecutionMode 	jobExecutionMode,
	4:	optional 	JobReturnMode 		jobReturnMode,
	5:	optional	i64 				timeout,
}

/** job resource requirement */
struct JobResourceRequirement {

	1:	required	JobLifecycle		jobLifecycle,
	2:	required 	JobPhase 			jobPhase,
	3:	optional	i64 				programId,
	4:	optional	string 				executorId,
	5:	optional 	Node.ClusterType 	clusterType,
	6:	optional	Node.NodeType 		nodeType,
}

/** container context parameter */
struct ContextParameter {
	
	1:	required	i32						sequenceNum,
	2:	optional	string					opt,
	3:	optional	string					content,
	4:	required	bool					needDownload,
}

/** job parameter */
struct JobParameter {

	1:	required	JobPhase				jobPhase,
	2:	optional 	list<ContextParameter>	contextParameterList,
}

/** job reinforce request */
struct JobReinforceRequest {
	
	1:	optional	i32 							userId,
	2:	required 	App.AppType 					appType,
	3:	required 	JobLifecycle 					jobLifecycle,
	4:	required 	list<JobPhase> 					jobPhaseList,
	5:	required 	JobDistributionMode 			jobDistributionMode,
	6:	required 	JobPriority 					jobPriority,
	7:	required 	list<JobOperationRequirement>	jobOperationRequirementList,
	8:	optional 	list<JobResourceRequirement>	jobResourceRequirementList,
	9:	optional 	list<JobParameter>				jobParameterList,
	10:	optional 	i64 							impatienceTime,
	12:	required	string							appPath,
	13:	optional	binary							appInfo,
}