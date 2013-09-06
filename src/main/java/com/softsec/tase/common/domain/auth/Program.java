/**
 * 
 */
package com.softsec.tase.common.domain.auth;

import java.text.DecimalFormat;

import com.softsec.tase.common.rpc.domain.app.AppType;
import com.softsec.tase.common.rpc.domain.job.JobLifecycle;
import com.softsec.tase.common.rpc.domain.job.JobPhase;
import com.softsec.tase.common.rpc.domain.node.NodeType;
import com.softsec.tase.common.util.domain.JobUtils;

/**
 * 程序类
 * @author yanwei
 * @date 2012-12-25 下午2:58:46
 * 
 */
public class Program {

	private long programId;
	
	private String programName;
	
	private int committerId; //TODO replace with User.java
	
	private NodeType nodeType;
	
	private String scriptName;
	
	private String scriptPath;
	
	private String scriptMd5;
	
	private String executableName;
	
	private String executablePath;
	
	private String executableMd5;
	
	private String envVariables;
	
	private String description;
	
	private int minMem;
	
	private long registerTime;
	
	/**
	 * 
	 */
	public Program() {
	}
	
	public long getProgramId() {
		return programId;
	}

	public void setProgramId(long programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public int getCommitterId() {
		return committerId;
	}

	public void setCommitterId(int committerId) {
		this.committerId = committerId;
	}

	public NodeType getNodeType() {
		return nodeType;
	}

	public void setNodeType(NodeType nodeType) {
		this.nodeType = nodeType;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public String getScriptPath() {
		return scriptPath;
	}

	public void setScriptPath(String scriptPath) {
		this.scriptPath = scriptPath;
	}

	public String getScriptMd5() {
		return scriptMd5;
	}

	public void setScriptMd5(String scriptMd5) {
		this.scriptMd5 = scriptMd5;
	}

	public String getExecutableName() {
		return executableName;
	}

	public void setExecutableName(String executableName) {
		this.executableName = executableName;
	}

	public String getExecutablePath() {
		return executablePath;
	}

	public void setExecutablePath(String executablePath) {
		this.executablePath = executablePath;
	}

	public String getExecutableMd5() {
		return executableMd5;
	}

	public void setExecutableMd5(String executableMd5) {
		this.executableMd5 = executableMd5;
	}

	public String getEnvVariables() {
		return envVariables;
	}

	public void setEnvVariables(String envVariables) {
		this.envVariables = envVariables;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinMem() {
		return minMem;
	}

	public void setMinMem(int minMem) {
		this.minMem = minMem;
	}

	public long getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(long registerTime) {
		this.registerTime = registerTime;
	}
}
