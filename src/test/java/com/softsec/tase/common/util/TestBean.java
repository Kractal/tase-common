/**
 * 
 */
package com.softsec.tase.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@author yanwei
 *@time: 2012-11-6 下午8:56:20
 *@description MUST SEE this website ==> http://json-lib.sourceforge.net/faq.html#inner_bean
 *
 */
/**
 * json <- -> bean 测试用 ignore me
 * include inner class : InnerClass
 */
public class TestBean {

	/**
	 * object must contain complete getters and setters
	 */
	public int id = 0;
	public String name = "lalala";
	public List<String> testList = new ArrayList<String>();
	public Map<String, Object> testMap = new HashMap<String, Object>();
	public InnerClass innerBean = new InnerClass();
	
	/**
	 * 
	 */
	public TestBean() {
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the testList
	 */
	public List<String> getTestList() {
		return testList;
	}
	/**
	 * @param testList the testList to set
	 */
	public void setTestList(List<String> testList) {
		this.testList = testList;
	}
	/**
	 * @return the testMap
	 */
	public Map<String, Object> getTestMap() {
		return testMap;
	}
	/**
	 * @param testMap the testMap to set
	 */
	public void setTestMap(Map<String, Object> testMap) {
		this.testMap = testMap;
	}
	/**
	 * @return the innerBean
	 */
	public InnerClass getInnerBean() {
		return innerBean;
	}
	/**
	 * @param innerBean the innerBean to set
	 */
	public void setInnerBean(InnerClass innerBean) {
		this.innerBean = innerBean;
	}

	/**
	 * the inner class
	 * must be declared as "public & static"
	 */
	public static class InnerClass {
		private int id = 0;
		private String name = "ajsdfjaf";
		private List<String> testListAgain = new ArrayList<String>();
		private InnerClassAgain innerClassAgain = new InnerClassAgain();
		/**
		 * 
		 */
		public InnerClass() {
		}
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the testListAgain
		 */
		public List<String> getTestListAgain() {
			return testListAgain;
		}
		/**
		 * @param testListAgain the testListAgain to set
		 */
		public void setTestListAgain(List<String> testListAgain) {
			this.testListAgain = testListAgain;
		}
		/**
		 * @return the innerClassAgain
		 */
		public InnerClassAgain getInnerClassAgain() {
			return innerClassAgain;
		}
		/**
		 * @param innerClassAgain the innerClassAgain to set
		 */
		public void setInnerClassAgain(InnerClassAgain innerClassAgain) {
			this.innerClassAgain = innerClassAgain;
		}
	}
	
	public static class InnerClassAgain {
		private String name = "我次奥";
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
	}
}
