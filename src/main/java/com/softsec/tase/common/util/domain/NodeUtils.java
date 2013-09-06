/**
 * 
 */
package com.softsec.tase.common.util.domain;

import java.util.HashSet;
import java.util.Set;

import com.softsec.tase.common.rpc.domain.node.NodeType;

/**
 * NodeUtils
 * <p> </p>
 * @author yanwei
 * @since 2013-8-5 下午3:15:12
 * @version
 */
public class NodeUtils {
	
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
}
