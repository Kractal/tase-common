/**
 * 
 */
package com.softsec.tase.common.domain.rule;

import com.softsec.tase.common.domain.CodeRef;


/**
 *@author yanwei
 *@time: 2012-11-6 上午10:08:33
 *@description Android检测规则类
 *
 */
/**
 *
 */
public class AndroidStaticRule {
	//rule info
	private RuleBrief ruleBrief;
	//code info
	private CodeRef codeRef;
	/**
	 * 
	 */
	public AndroidStaticRule() {
	}
	/**
	 * @return the ruleBrief
	 */
	public RuleBrief getRuleBrief() {
		return ruleBrief;
	}
	/**
	 * @param ruleBrief the ruleBrief to set
	 */
	public void setRuleBrief(RuleBrief ruleBrief) {
		this.ruleBrief = ruleBrief;
	}
	/**
	 * @return the codeRef
	 */
	public CodeRef getCodeRef() {
		return codeRef;
	}
	/**
	 * @param codeRef the codeRef to set
	 */
	public void setCodeRef(CodeRef codeRef) {
		this.codeRef = codeRef;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AndroidStaticRule [ruleBrief=" + ruleBrief + ", codeRef="
				+ codeRef + "]";
	}
	/**
	 * Inner Class
	 * rule info
	 */
	public static class RuleBrief {
		private String ruleId;
		private String ruleName;
		private String ruleDesc;
		private String prevRuleId;
		private int riskLevel;
		private String ruleType;
		/**
		 * 
		 */
		public RuleBrief() {
		}
		/**
		 * @return the ruleId
		 */
		public String getRuleId() {
			return ruleId;
		}
		/**
		 * @param ruleId the ruleId to set
		 */
		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}
		/**
		 * @return the ruleName
		 */
		public String getRuleName() {
			return ruleName;
		}
		/**
		 * @param ruleName the ruleName to set
		 */
		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
		/**
		 * @return the ruleDesc
		 */
		public String getRuleDesc() {
			return ruleDesc;
		}
		/**
		 * @param ruleDesc the ruleDesc to set
		 */
		public void setRuleDesc(String ruleDesc) {
			this.ruleDesc = ruleDesc;
		}
		/**
		 * @return the prevRuleId
		 */
		public String getPrevRuleId() {
			return prevRuleId;
		}
		/**
		 * @param prevRuleId the prevRuleId to set
		 */
		public void setPrevRuleId(String prevRuleId) {
			this.prevRuleId = prevRuleId;
		}
		/**
		 * @return the riskLevel
		 */
		public int getRiskLevel() {
			return riskLevel;
		}
		/**
		 * @param riskLevel the riskLevel to set
		 */
		public void setRiskLevel(int riskLevel) {
			this.riskLevel = riskLevel;
		}
		/**
		 * @return the ruleType
		 */
		public String getRuleType() {
			return ruleType;
		}
		/**
		 * @param ruleType the ruleType to set
		 */
		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "RuleBrief [ruleId=" + ruleId + ", ruleName=" + ruleName
					+ ", ruleDesc=" + ruleDesc + ", prevRuleId=" + prevRuleId
					+ ", riskLevel=" + riskLevel + ", ruleType=" + ruleType
					+ "]";
		}
	}
}
