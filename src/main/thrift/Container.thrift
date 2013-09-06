#
# Data structures for container and program
#

include "App.thrift"
include "Job.thrift"
include "Node.thrift"

namespace java com.softsec.tase.common.rpc.domain.container
namespace php com.softsec.tase.common.rpc.domain.container

enum BundleType {

	ZIP	=	1,
	JAR,
}

/** programme data */
struct Programme {

	# TODO authority
	1:	required	string					committer,
	2:	required	string					programmeName,
	3:	required	App.AppType				appType,
	4:	required	Job.JobLifecycle		jobLifecycle,
	5:	required	Job.JobPhase			jobPhase,
	6:	required	Node.NodeType			nodeType,
	
	7:	required	string					scriptName,
	8:	required	binary					script,
	9:	required	string					scriptMd5,
	10:	required	string					executableName,
	11:	required	binary					executable,
	12:	required	string					executableMd5,
	# "key1=value1,key2=value2"
	13:	optional	string					envVariables,
	
	14:	optional	string					description,
	15:	optional	i32						minMem,
	16:	optional	i32						minFs,
}

/** container context info */
struct Context {

	1:	required	i64						taskId,
	2:	required	Job.JobPriority			priority,
	3:	required	Job.JobExecutionMode	jobExecutionMode,
	4:	required	Job.JobReturnMode 		jobReturnMode,
	5:	optional	i64						timeout,
	
	6:	required	i64						programId,
	7:	required	BundleType				bundleType,
	8:	required	string					programName,
	9:	required	string					scriptName,
	10:	required	string					scriptPath,
	11:	required	string					scriptMd5,
	12:	required	string					executableName,
	13:	required 	string 					executablePath,
	14:	required 	string 					executableMd5,
	15:	optional	string 					envVariables,
	
	16:	optional 	Job.JobParameter	 	parameter,
	17:	optional 	string 					resultAddress,
}