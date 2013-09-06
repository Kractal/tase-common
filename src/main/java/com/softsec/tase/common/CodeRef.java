/**
 * 
 */
package com.softsec.tase.common;

import java.util.List;

/**
 *@author yanwei
 *@time: 2012-11-7 下午2:46:04
 *@description 代码参考类
 *
 */
/**
 *
 */
public class CodeRef {
	//class info
	private String className;
	private String classType; //classic or interface
	private String classModifier; //abstract or final
	private String packageName;
	private String superClassName;
	private List<String> interfaceList;
	//method info
	private String methodName;
	private String methodType; //static or instance or constructor
	private String methodModifier; //classic or abstract or final
	private String statement;
	//parameter info
	private int paramNum;
	private boolean isParamCheck;
	private List<Param> paramList;
	/**
	 * 
	 */
	public CodeRef() {
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the classType
	 */
	public String getClassType() {
		return classType;
	}
	/**
	 * @param classType the classType to set
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}
	/**
	 * @return the classModifier
	 */
	public String getClassModifier() {
		return classModifier;
	}
	/**
	 * @param classModifier the classModifier to set
	 */
	public void setClassModifier(String classModifier) {
		this.classModifier = classModifier;
	}
	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}
	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	/**
	 * @return the superClassName
	 */
	public String getSuperClassName() {
		return superClassName;
	}
	/**
	 * @param superClassName the superClassName to set
	 */
	public void setSuperClassName(String superClassName) {
		this.superClassName = superClassName;
	}
	/**
	 * @return the interfaceList
	 */
	public List<String> getInterfaceList() {
		return interfaceList;
	}
	/**
	 * @param interfaceList the interfaceList to set
	 */
	public void setInterfaceList(List<String> interfaceList) {
		this.interfaceList = interfaceList;
	}
	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}
	/**
	 * @param methodName the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	/**
	 * @return the methodType
	 */
	public String getMethodType() {
		return methodType;
	}
	/**
	 * @param methodType the methodType to set
	 */
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	/**
	 * @return the methodModifier
	 */
	public String getMethodModifier() {
		return methodModifier;
	}
	/**
	 * @param methodModifier the methodModifier to set
	 */
	public void setMethodModifier(String methodModifier) {
		this.methodModifier = methodModifier;
	}
	/**
	 * @return the statement
	 */
	public String getStatement() {
		return statement;
	}
	/**
	 * @param statement the statement to set
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}
	/**
	 * @return the paramNum
	 */
	public int getParamNum() {
		return paramNum;
	}
	/**
	 * @param paramNum the paramNum to set
	 */
	public void setParamNum(int paramNum) {
		this.paramNum = paramNum;
	}
	/**
	 * @return the isParamCheck
	 */
	public boolean isParamCheck() {
		return isParamCheck;
	}
	/**
	 * @param isParamCheck the isParamCheck to set
	 */
	public void setParamCheck(boolean isParamCheck) {
		this.isParamCheck = isParamCheck;
	}
	/**
	 * @return the paramList
	 */
	public List<Param> getParamList() {
		return paramList;
	}
	/**
	 * @param paramList the paramList to set
	 */
	public void setParamList(List<Param> paramList) {
		this.paramList = paramList;
	}
	/**
	 * Inner Class
	 * parameter info
	 */
	public static class Param {
		private int paramIndex;
		private String paramType;
		private String paramModifier;
		private String paramRegex;
		/**
		 * 
		 */
		public Param() {
		}
		/**
		 * @return the paramIndex
		 */
		public int getParamIndex() {
			return paramIndex;
		}
		/**
		 * @param paramIndex the paramIndex to set
		 */
		public void setParamIndex(int paramIndex) {
			this.paramIndex = paramIndex;
		}
		/**
		 * @return the paramType
		 */
		public String getParamType() {
			return paramType;
		}
		/**
		 * @param paramType the paramType to set
		 */
		public void setParamType(String paramType) {
			this.paramType = paramType;
		}
		/**
		 * @return the paramModifier
		 */
		public String getParamModifier() {
			return paramModifier;
		}
		/**
		 * @param paramModifier the paramModifier to set
		 */
		public void setParamModifier(String paramModifier) {
			this.paramModifier = paramModifier;
		}
		/**
		 * @return the paramRegex
		 */
		public String getParamRegex() {
			return paramRegex;
		}
		/**
		 * @param paramRegex the paramRegex to set
		 */
		public void setParamRegex(String paramRegex) {
			this.paramRegex = paramRegex;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CodeRef [className=" + className + ", classType=" + classType
				+ ", classModifier=" + classModifier + ", packageName="
				+ packageName + ", superClassName=" + superClassName
				+ ", interfaceList=" + interfaceList + ", methodName="
				+ methodName + ", methodType=" + methodType
				+ ", methodModifier=" + methodModifier + ", statement="
				+ statement + ", paramNum=" + paramNum + ", isParamCheck="
				+ isParamCheck + ", paramList=" + paramList + "]";
	}
}
