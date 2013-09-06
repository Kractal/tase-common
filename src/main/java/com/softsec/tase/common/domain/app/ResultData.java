package com.softsec.tase.common.domain.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class ResultData implements Serializable{
private String Filename;
private int RiskLevel;
private int LineNum;
private int ColumnNum;
private String APIName;
private String RuleId;
private String Catagory;
private String Discription;
private String  modifyTime;
private List<String> FlowPath;
private List<String> FlowPathAnalysis;
public List<String> getFlowPath() {
	return FlowPath;
}
public void setFlowPath(List<String> flowPath) {
	FlowPath = flowPath;
}
public List<String> getFlowPathAnalysis() {
	return FlowPathAnalysis;
}
public void setFlowPathAnalysis(List<String> flowPathAnalysis) {
	FlowPathAnalysis = flowPathAnalysis;
}


public String getFilename() {
	return Filename;
}
public void setFilename(String filename) {
	Filename = filename;
}
public int getRiskLevel() {
	return RiskLevel;
}
public void setRiskLevel(int riskLevel) {
	RiskLevel = riskLevel;
}
public int getLineNum() {
	return LineNum;
}
public void setLineNum(int lineNum) {
	LineNum = lineNum;
}
public int getColumnNum() {
	return ColumnNum;
}
public void setColumnNum(int columnNum) {
	ColumnNum = columnNum;
}
public String getAPIName() {
	return APIName;
}
public void setAPIName(String aPIName) {
	APIName = aPIName;
}
public String getRuleId() {
	return RuleId;
}
public void setRuleId(String ruleId) {
	RuleId = ruleId;
}
public String getCatagory() {
	return Catagory;
}
public void setCatagory(String catagory) {
	Catagory = catagory;
}
public String getDiscription() {
	return Discription;
}
public void setDiscription(String discription) {
	Discription = discription;
}
public String getModifyTime() {
	return modifyTime;
}
public void setModifyTime(String modifyTime) {
	this.modifyTime = modifyTime;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "ResultData [Filename=" + Filename + ", RiskLevel=" + RiskLevel
			+ ", LineNum=" + LineNum + ", ColumnNum=" + ColumnNum
			+ ", APIName=" + APIName + ", RuleId=" + RuleId + ", Catagory="
			+ Catagory + ", Discription=" + Discription + ", modifyTime="
			+ modifyTime + ", FlowPath=" + FlowPath + ", FlowPathAnalysis="
			+ FlowPathAnalysis + "]" + "\n";
}

	

	
}

 	
	


