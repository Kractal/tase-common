#
# Data structures for app info
#

namespace java com.softsec.tase.common.rpc.domain.app
namespace php com.softsec.tase.common.rpc.domain.app

enum AppType {

	COMMON,
	APK,
	IPA,
}

enum OriginType {
	
	OFFICIAL_STORE,
	UNOFFICIAL_STORE,
	USER,
	DEVICE,
}

/** app resource status enumeration */
enum AppStatus {

	# crawled
	INITIALIZED,
	# keywords-detected
	PREPROCESSED,
	# downloaded
	GENERATED,
	
}

/** app file status enumeration */
enum FileStatus {
	
	# anti-virus
	EVALUATED,
	STATICED,
	DYNAMICED,
	PACKAGED,
	DEPLOYED
	
}

/** App Advertiser Info */
struct AppAdvertiser {

	1:	optional	string			advertiserName,
	2:	optional	string			advertiserWebsite,
	3:	optional	string			advertiserEmail,
}

/** App Comment Info */
struct AppComment {
	
	1:	optional	string			userName,
	2:	optional	string			content,
	3:	optional	i64				commentTime,
}

/** App External Link Info */
struct AppExternalLink {

	1:	optional	string			externalStoreName,
	2:	optional	string			externalUrl,
}

/** App Permission Info */
struct AppPermission {

	1:	optional	string			permissionGroup,
	2:	optional	string			permissionDesc,
	3:	optional	string			permissionDescFull,
}

/** App Antivirus Info */
struct AppAntivirus {

	1:	optional	string			antivirusVendor,
	2:	optional	string			antivirusResult,
}

/** App Web Info */
struct AppWeb {

	# basic
	1:	required	AppType			appType,
	2:	required	OriginType		originType,

	# store
	3:	required	string			storeName,
	4:	optional	string			storeDisplayName,
	5:	optional	string			storeUrl,
	6:	optional	i32				storeType,
	7:	required	string			category,

	# basic
	8:	required	string			appName,
	9:	optional	string			innerId,

	# version
	10:	required	string			appVersion,
	11:	required	i64				updatedTime,
	12:	required 	i64				collectedTime,
	13:	optional 	string			updateHistory,

	# platform
	14:	optional 	string			platform,
	15:	optional 	string			osType,
	16:	optional 	string			osVersion,
	17:	optional	string			device,

	# misc
	18:	optional 	string			country,
	19:	optional 	string			language,
	20:	optional 	string			description,
	21:	optional 	string			size,
	22:	optional 	string			price,

	# resource
	23:	required 	string			url,
	24:	required 	string			downloadUrl,
	25:	optional 	list<string>	snapshotUrlList,
	26:	optional 	string			logoUrl,

	# developer
	27:	optional 	string			developerName,
	28:	optional 	string			developerWebsite,
	29:	optional 	string			developerEmail,
	30:	optional	string			privacyPolicy,
	
	# statistic
	31:	optional 	i64				downloadFloor,
	32:	optional 	i64				downloadCeiling,
	33:	optional 	double			rating,
	34:	optional 	i64				ratingCount,
	35:	optional 	string			review,
	36:	optional 	string			contentRating,

	# web list
	37:	optional	list<AppAdvertiser>		appAdvertiserList,
	38:	optional 	list<AppAntivirus>		appAntivirusList,
	39:	optional	list<AppComment>		appCommentList,
	40:	optional 	list<AppExternalLink> 	appExternalLinkList,
	41:	optional 	list<AppPermission> 	appPermissionList,
	
	42:	required	string		appChecksum,
}

/** app data move */
struct AppTransfer {
	1:	required	string			appChecksum,
	
	2:	optional	string			appName,
	3:	optional	string			wrapperId,
	4:	optional	string			wrapperName,
	5:	optional	string			subject,
	6:	optional	string			version,
	7:	optional	i64				updateTime,
	8:	optional	i64				savedTime,
	9:	optional	string			size,
	10:	optional	string			description,
	
	11:	optional	string			country,
	12:	optional	string			price,
	13:	optional	string			developer,
	14:	optional	string			device,
	15:	optional	string			os,
	16:	optional	string			osVersion,
	
	17:	optional	string			url,
	18:	optional	string			downUrl,
	19:	optional	string			downloadId,
	20:	optional	list<string>	snapshotUrlList,
	21:	optional	i32				downloadNum,
	22:	optional	i32				isImageLoaded,
	23:	optional	i32				isApkLoaded,
	24:	optional	string			appPath,
	
	25:	optional	i32				checkValue,
	26:	optional	i32				risk,
}
