#
# Data structures for user
#

namespace java com.softsec.tase.common.rpc.domain.user
namespace php com.softsec.tase.common.rpc.domain.user

struct User {
	1:	required	string		userId,
	2:	required 	string 		groupId,
	3:	required 	string 		username,
	4:	optional 	string		password,
	5:	optional 	string 		authToken,
}

struct Group {
	1:	required	string 		groupId,
}