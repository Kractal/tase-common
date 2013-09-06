/**
 * 
 */
package com.softsec.tase.common.domain.schedule;

import java.util.HashSet;
import java.util.Set;

import com.softsec.tase.common.rpc.domain.node.NodeType;

/**
 * 
 * @author yanwei
 * @date 2013-1-7 下午2:58:22
 * 
 */
public class Node {

	private String nodeId;

	private int nodeType;
	
	private float cpuUsedPerc;
	// memSize - memUsed
	private int memAvail;
	// fsSize - fsUsed
	private int fsAvail;

	private String osName;

	private String jvmVersion;
	
	private int residualQuota;
	
	private long configUpdated;
	
	private long payloadUpdated;
	
	private boolean isValid;
	
	public static boolean isNodeTypeMember(String nodeType) {
		NodeType[] nodeTypes = NodeType.values();
		for (NodeType type : nodeTypes) {
			if (type.name().equals(nodeType)) {
				return true;
			}
		}
		return false;
	}
	
	public static Set<NodeType> getNodeTypeSet(int nodeTypeCode) {
		Set<NodeType> nodeTypeSet = new HashSet<NodeType>();
		for (NodeType nodeType : NodeType.values()) {
			if ((nodeTypeCode & nodeType.getValue()) == nodeType.getValue()) {
				nodeTypeSet.add(nodeType);
			}
		}
		return nodeTypeSet;
	}
	
	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public int getNodeType() {
		return nodeType;
	}

	public void setNodeType(int nodeType) {
		this.nodeType = nodeType;
	}

	public float getCpuUsedPerc() {
		return cpuUsedPerc;
	}

	public void setCpuUsedPerc(float cpuUsedPerc) {
		this.cpuUsedPerc = cpuUsedPerc;
	}

	public int getMemAvail() {
		return memAvail;
	}

	public void setMemAvail(int memAvail) {
		this.memAvail = memAvail;
	}

	public int getFsAvail() {
		return fsAvail;
	}

	public void setFsAvail(int fsAvail) {
		this.fsAvail = fsAvail;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getJvmVersion() {
		return jvmVersion;
	}

	public void setJvmVersion(String jvmVersion) {
		this.jvmVersion = jvmVersion;
	}

	public int getResidualQuota() {
		return residualQuota;
	}

	public void setResidualQuota(int residualQuota) {
		this.residualQuota = residualQuota;
	}

	public long getConfigUpdated() {
		return configUpdated;
	}

	public void setConfigUpdated(long configUpdated) {
		this.configUpdated = configUpdated;
	}

	public long getPayloadUpdated() {
		return payloadUpdated;
	}

	public void setPayloadUpdated(long payloadUpdated) {
		this.payloadUpdated = payloadUpdated;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
