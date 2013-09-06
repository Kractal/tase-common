/**
 * 
 */
package com.softsec.tase.common.util;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *@author yanwei
 *@time: 2012-11-5 上午10:17:12
 *@description Json工具类
 *
 */
/**
 *
 */
public class JsonUtils {

	private final static Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);
	
	/**
	 * bean to string
	 * @param object
	 * @return
	 * @throws JSONException
	 */
	public static String serialize(Object object) throws JSONException {
		String jsonString = null;
		try {
			jsonString = JSONObject.fromObject(object).toString();
		} catch (JSONException je) {
			LOGGER.error("Failed to convert " + object.toString() + " to string : " + je.getMessage(), je);
		}
		return jsonString;
	}
	
	/**
	 * convert string to bean
	 * @param jsonString
	 * @param beanClass
	 * @return
	 * @throws JSONException
	 */
	public static Object deserialize(String jsonString, Class<?> beanClass) throws JSONException {
		JSONObject json = JSONObject.fromObject(jsonString);
		Object object = null;
		try {
			object = JSONObject.toBean(json, beanClass);
		} catch (JSONException je) {
			LOGGER.error("Failed to convert " + jsonString + " to " + beanClass.getName() + " : " + je.getMessage(), je);
		}
		return object;
	}
	
	/**
	 * convert string to bean including inner class
	 * @param jsonString
	 * @param beanClass
	 * @param classMap
	 * 		every key must be an String : the beanClass 's attribute
	 * 		every value must be a Class : the target inner class
	 * @return
	 * @throws JSONException
	 */
	@SuppressWarnings("rawtypes")
	public static Object deserialize(String jsonString, Class<?> beanClass, Map classMap) throws JSONException {
		JSONObject json = null;
		Object object = null;
		try {
			json = JSONObject.fromObject(jsonString);
			object = JSONObject.toBean(json, beanClass, classMap);
		} catch (JSONException je) {
			LOGGER.error("Failed to convert " + jsonString + " to " + beanClass.getName() + " : " + je.getMessage(), je);
		}
		return object;
	}
	
	/**
	 * convert map to json object
	 * @param map
	 * @return
	 * @throws JSONException
	 */
	@SuppressWarnings("rawtypes")
	public static JSONObject mapToJson(Map map) throws JSONException {
		JSONObject json = null;
		try {
			json = JSONObject.fromObject(map); 
		} catch (JSONException je) {
			LOGGER.error("Failed to convert " + map.toString() + " to JSONObject : " + je.getMessage(), je);
		}
		return json;
	}
	
	/**
	 * convert list to json array
	 * @param list
	 * @return
	 * @throws JSONException
	 */
	@SuppressWarnings("rawtypes")
	public static JSONArray listToJson(List list) throws JSONException {
		JSONArray json = null;
		try {
			json = JSONArray.fromObject(list); 
		} catch (JSONException je) {
			LOGGER.error("Failed to convert " + list.toString() + " to JSONArray : " + je.getMessage(), je);
		}
		return json;
	}
}
