#
# Data structures for resource node
#

namespace java com.softsec.tase.common.rpc.domain.node
namespace php com.softsec.tase.common.rpc.domain.node

enum ClusterType {
	
	DEDICATED,
	GENERAL,
}

enum NodeType {

	BASIC					=	0,
	INTERNET_ACCESSIBLE		=	1,
	ANTIVIRUS				=	2,
	ANDROID_ACCESSIBLE		=	4,
	IOS_ACCESSIBLE			=	8,
}

struct NodeRuntime {

	1:	required i32				cpuCount,
	2:	required i32				cpuCores,
	3:	required i32				cpuMhz,
	4:	required double				cpuUsedPerc,
	5:	required i64				freeMem,
	6:	required i64				jvmFreeMem,
}

struct NodePayload {

	1:	required string				nodeId,
	2:	required ClusterType		clusterType,
	3:	required set<NodeType> 		nodeTypeList,
	
	4:	required NodeRuntime		nodeRuntime,
	
	5:	required i32 				queueLimit,
	6:	required i32 				queueNum,
	7:	required i64 				expectedDelay,
	8:	required list<i32> 			preferredProgramTypeList,
	9:	required list<i64> 			preferredProgramIdList,
}

/** node info */
struct NodeInfo {
	
	1:	required string				nodeId,

	# hardware
	2:	required string 			cpuVendor,
	3:	required string 			cpuModel,
	4:	required i32 				cpuCores,
	5:	required i32 				cpuMhz,
	6:	required i32 				memSize,
	7:	required string 			fsName,
	8:	required string 			fsType,
	9:	required string 			fsFormat,
	10:	required i32 				fsSize,
	
	# software
	11:	required string 			osArch,
	12:	required string 			osName,
	13:	required string 			osDesc,
	14:	required string 			osVersion,
	15:	required string 			jvmName,
	16:	required string 			jvmVersion,
	17:	required i32 				jvmMaxMem,
	18:	required NodeType 			nodeType,
	19:	required i32 				queueLimit,

	# network
	20:	required string 			domain,
	21:	required string 			macAddress,
	22:	required i32 				internetConnectivity,
	23:	required string 			ipAddress,
	24:	required i32 				rpcPort,
	
	# process
	25:	required i32 				pid,
	26:	required string 			user,
	27:	required string 			startTime,
	28:	required string 			procName,
	29:	required list<i64> 			programIdList,
	
	# payload
	30:	required double 			cpuPerc,
	31:	required i32 				memUsed,
	32:	required i32 				jvmAllocMem,
	33:	required i32 				jvmFreeMem,
	34:	required i32 				fsAvail,
	35:	required i32 				fsUsed,
	36:	required double 			fsUsedPerc,
	37:	required i32 				queueNum,

	# validation
	38:	required i64 				configUpdated,
	39:	required i64 				payloadUpdated,
}