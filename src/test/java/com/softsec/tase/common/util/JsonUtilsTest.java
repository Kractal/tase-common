/**
 * 
 */
package com.softsec.tase.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

import com.softsec.tase.common.util.JsonUtils;

/**
 *@author yanwei
 *@time: 2012-11-5 下午5:35:40
 *@description 
 *
 */
/**
 *
 */
public class JsonUtilsTest extends TestCase{
	
//	@Test
//	public void testDeserializeEnum() {
//		@SuppressWarnings("unused")
//		JobOperationRequirement request = new JobOperationRequirement();
//	}
	
	@Test
	public void testSerialize() {
		System.out.println(JsonUtils.serialize(new TestBean()));
	}
	
	@Test
	public void testDeserialize() {
		String jsonString = "{id:1, name:\"yanwei\", testList : []}";
		System.out.println(((TestBean)JsonUtils.deserialize(jsonString, TestBean.class)).getName() + "... kekeke ...");
	}
	
	/**
	 * 三层的无压力，你麻痹
	 */
	@Test
	public void testDeserializeMultiDepts() {
		String jsonString = "{testBean:{id:2, testList : [], testMap : {\"lalala\": \"whatsthefuck\"}, innerBean:{id:33, name:\"我的个天呐 。。。\", testListAgain:[], innerClassAgain:{name:\"颤动吧！卑微的地球人！！！\"}}}}";
		Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
		classMap.put("testBean", TestBean.class);
		classMap.put("innerBean", TestBean.InnerClass.class);
		classMap.put("innerClassAgain", TestBean.InnerClassAgain.class);
		System.out.println(((TestBean2)JsonUtils.deserialize(jsonString, TestBean2.class, classMap)).getTestBean().getTestMap().get("lalala") + " ...kekeke... ");
	}
	
	@Test
	public void testMapToJson() {
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("lalala", "hehehe");
		System.out.println(JsonUtils.mapToJson(testMap).getString("lalala"));
	}
	
	@Test
	public void testListToJson() {
		List<String> testList = new ArrayList<String>();
		testList.add("hahaha");
		testList.add("lalala");
		System.out.println(JsonUtils.listToJson(testList));
	}
}
