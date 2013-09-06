/**
 * 
 */
package com.softsec.tase.common.util.domain;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.app.OriginType;

/**
 * AppUtils
 * <p> </p>
 * @author yanwei
 * @since 2013-8-5 下午2:45:45
 * @version
 */
public class AppUtils {

	/**
	 * is a member of AppType
	 * @param appType
	 * @return
	 */
	public static boolean isAppTypeMember(AppType appType) {
		AppType[] appTypes = AppType.values();
		for (AppType type : appTypes) {
			if (type.equals(appType)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * get appType by appId
	 * @param appId
	 * @return
	 */
	public static AppType getAppTypeByAppId(Long appId) {
		return AppType.findByValue(Integer.parseInt(String.valueOf(appId).substring(0, 1)));
	}
	/**
	 * get originType by appId
	 * @param appId
	 * @return
	 */
	public static OriginType getOriginTypeByAppId(Long appId) {
		return OriginType.findByValue(Integer.parseInt(String.valueOf(appId).substring(1, 2)));
	}
}
