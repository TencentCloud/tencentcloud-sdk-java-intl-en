/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalEventInfo extends AbstractModel {

    /**
    * <p>Hit rule name.</p>
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * <p>Hit rule type.</p>
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * <p>Alarm level.</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster running status: CSR_RUNNING, CSR_EXCEPTION, and CSR_CREATING</p>
    */
    @SerializedName("ClusterRunningStatus")
    @Expose
    private String ClusterRunningStatus;

    /**
    * <p>Initial generation time.</p>
    */
    @SerializedName("FirstCreateTime")
    @Expose
    private String FirstCreateTime;

    /**
    * <p>Last generation time.</p>
    */
    @SerializedName("LastCreateTime")
    @Expose
    private String LastCreateTime;

    /**
    * <p>Number of alarms.</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>Status.<br>&quot;EVENT_UNDEAL&quot;: unhandled<br>&quot;EVENT_DEALED&quot;: handled<br>&quot;EVENT_IGNORE&quot;: ignored<br>&quot;EVENT_DEL&quot;: deleted<br>&quot;EVENT_ADD_WHITE&quot;: allowlisted</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Cluster master IP address.</p>
    */
    @SerializedName("ClusterMasterIP")
    @Expose
    private String ClusterMasterIP;

    /**
    * <p>K8s version.</p>
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * <p>Runtime component.</p>
    */
    @SerializedName("RunningComponent")
    @Expose
    private String [] RunningComponent;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>Suggestion.</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>Request information.</p>
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("MatchRuleID")
    @Expose
    private String MatchRuleID;

    /**
    * <p>Array of highlighted fields.</p>
    */
    @SerializedName("HighLightFields")
    @Expose
    private String [] HighLightFields;

    /**
    * <p>Hit rule.</p>
    */
    @SerializedName("MatchRule")
    @Expose
    private K8sApiAbnormalRuleScopeInfo MatchRule;

    /**
    * <p>Hit rule content corresponding to highlighted fields (JSON string, such as {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>Parameter format: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
    */
    @SerializedName("HighLightFieldsVal")
    @Expose
    private String HighLightFieldsVal;

    /**
    * <p>Rule type.</p>
    */
    @SerializedName("RuleTypeZH")
    @Expose
    private String RuleTypeZH;

    /**
     * Get <p>Hit rule name.</p> 
     * @return MatchRuleName <p>Hit rule name.</p>
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set <p>Hit rule name.</p>
     * @param MatchRuleName <p>Hit rule name.</p>
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get <p>Hit rule type.</p> 
     * @return MatchRuleType <p>Hit rule type.</p>
     */
    public String getMatchRuleType() {
        return this.MatchRuleType;
    }

    /**
     * Set <p>Hit rule type.</p>
     * @param MatchRuleType <p>Hit rule type.</p>
     */
    public void setMatchRuleType(String MatchRuleType) {
        this.MatchRuleType = MatchRuleType;
    }

    /**
     * Get <p>Alarm level.</p> 
     * @return RiskLevel <p>Alarm level.</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Alarm level.</p>
     * @param RiskLevel <p>Alarm level.</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterID <p>Cluster ID.</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterID <p>Cluster ID.</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Cluster running status: CSR_RUNNING, CSR_EXCEPTION, and CSR_CREATING</p> 
     * @return ClusterRunningStatus <p>Cluster running status: CSR_RUNNING, CSR_EXCEPTION, and CSR_CREATING</p>
     */
    public String getClusterRunningStatus() {
        return this.ClusterRunningStatus;
    }

    /**
     * Set <p>Cluster running status: CSR_RUNNING, CSR_EXCEPTION, and CSR_CREATING</p>
     * @param ClusterRunningStatus <p>Cluster running status: CSR_RUNNING, CSR_EXCEPTION, and CSR_CREATING</p>
     */
    public void setClusterRunningStatus(String ClusterRunningStatus) {
        this.ClusterRunningStatus = ClusterRunningStatus;
    }

    /**
     * Get <p>Initial generation time.</p> 
     * @return FirstCreateTime <p>Initial generation time.</p>
     */
    public String getFirstCreateTime() {
        return this.FirstCreateTime;
    }

    /**
     * Set <p>Initial generation time.</p>
     * @param FirstCreateTime <p>Initial generation time.</p>
     */
    public void setFirstCreateTime(String FirstCreateTime) {
        this.FirstCreateTime = FirstCreateTime;
    }

    /**
     * Get <p>Last generation time.</p> 
     * @return LastCreateTime <p>Last generation time.</p>
     */
    public String getLastCreateTime() {
        return this.LastCreateTime;
    }

    /**
     * Set <p>Last generation time.</p>
     * @param LastCreateTime <p>Last generation time.</p>
     */
    public void setLastCreateTime(String LastCreateTime) {
        this.LastCreateTime = LastCreateTime;
    }

    /**
     * Get <p>Number of alarms.</p> 
     * @return AlarmCount <p>Number of alarms.</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>Number of alarms.</p>
     * @param AlarmCount <p>Number of alarms.</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>Status.<br>&quot;EVENT_UNDEAL&quot;: unhandled<br>&quot;EVENT_DEALED&quot;: handled<br>&quot;EVENT_IGNORE&quot;: ignored<br>&quot;EVENT_DEL&quot;: deleted<br>&quot;EVENT_ADD_WHITE&quot;: allowlisted</p> 
     * @return Status <p>Status.<br>&quot;EVENT_UNDEAL&quot;: unhandled<br>&quot;EVENT_DEALED&quot;: handled<br>&quot;EVENT_IGNORE&quot;: ignored<br>&quot;EVENT_DEL&quot;: deleted<br>&quot;EVENT_ADD_WHITE&quot;: allowlisted</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.<br>&quot;EVENT_UNDEAL&quot;: unhandled<br>&quot;EVENT_DEALED&quot;: handled<br>&quot;EVENT_IGNORE&quot;: ignored<br>&quot;EVENT_DEL&quot;: deleted<br>&quot;EVENT_ADD_WHITE&quot;: allowlisted</p>
     * @param Status <p>Status.<br>&quot;EVENT_UNDEAL&quot;: unhandled<br>&quot;EVENT_DEALED&quot;: handled<br>&quot;EVENT_IGNORE&quot;: ignored<br>&quot;EVENT_DEL&quot;: deleted<br>&quot;EVENT_ADD_WHITE&quot;: allowlisted</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Cluster master IP address.</p> 
     * @return ClusterMasterIP <p>Cluster master IP address.</p>
     */
    public String getClusterMasterIP() {
        return this.ClusterMasterIP;
    }

    /**
     * Set <p>Cluster master IP address.</p>
     * @param ClusterMasterIP <p>Cluster master IP address.</p>
     */
    public void setClusterMasterIP(String ClusterMasterIP) {
        this.ClusterMasterIP = ClusterMasterIP;
    }

    /**
     * Get <p>K8s version.</p> 
     * @return K8sVersion <p>K8s version.</p>
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set <p>K8s version.</p>
     * @param K8sVersion <p>K8s version.</p>
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get <p>Runtime component.</p> 
     * @return RunningComponent <p>Runtime component.</p>
     */
    public String [] getRunningComponent() {
        return this.RunningComponent;
    }

    /**
     * Set <p>Runtime component.</p>
     * @param RunningComponent <p>Runtime component.</p>
     */
    public void setRunningComponent(String [] RunningComponent) {
        this.RunningComponent = RunningComponent;
    }

    /**
     * Get <p>Description.</p> 
     * @return Desc <p>Description.</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>Description.</p>
     * @param Desc <p>Description.</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>Suggestion.</p> 
     * @return Suggestion <p>Suggestion.</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>Suggestion.</p>
     * @param Suggestion <p>Suggestion.</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>Request information.</p> 
     * @return Info <p>Request information.</p>
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set <p>Request information.</p>
     * @param Info <p>Request information.</p>
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get <p>Rule ID.</p> 
     * @return MatchRuleID <p>Rule ID.</p>
     */
    public String getMatchRuleID() {
        return this.MatchRuleID;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param MatchRuleID <p>Rule ID.</p>
     */
    public void setMatchRuleID(String MatchRuleID) {
        this.MatchRuleID = MatchRuleID;
    }

    /**
     * Get <p>Array of highlighted fields.</p> 
     * @return HighLightFields <p>Array of highlighted fields.</p>
     */
    public String [] getHighLightFields() {
        return this.HighLightFields;
    }

    /**
     * Set <p>Array of highlighted fields.</p>
     * @param HighLightFields <p>Array of highlighted fields.</p>
     */
    public void setHighLightFields(String [] HighLightFields) {
        this.HighLightFields = HighLightFields;
    }

    /**
     * Get <p>Hit rule.</p> 
     * @return MatchRule <p>Hit rule.</p>
     */
    public K8sApiAbnormalRuleScopeInfo getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set <p>Hit rule.</p>
     * @param MatchRule <p>Hit rule.</p>
     */
    public void setMatchRule(K8sApiAbnormalRuleScopeInfo MatchRule) {
        this.MatchRule = MatchRule;
    }

    /**
     * Get <p>Hit rule content corresponding to highlighted fields (JSON string, such as {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>Parameter format: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p> 
     * @return HighLightFieldsVal <p>Hit rule content corresponding to highlighted fields (JSON string, such as {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>Parameter format: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
     */
    public String getHighLightFieldsVal() {
        return this.HighLightFieldsVal;
    }

    /**
     * Set <p>Hit rule content corresponding to highlighted fields (JSON string, such as {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>Parameter format: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
     * @param HighLightFieldsVal <p>Hit rule content corresponding to highlighted fields (JSON string, such as {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;})</p><p>Parameter format: {&quot;field1&quot;:&quot;value1&quot;,&quot;field2&quot;:&quot;value2&quot;}</p>
     */
    public void setHighLightFieldsVal(String HighLightFieldsVal) {
        this.HighLightFieldsVal = HighLightFieldsVal;
    }

    /**
     * Get <p>Rule type.</p> 
     * @return RuleTypeZH <p>Rule type.</p>
     */
    public String getRuleTypeZH() {
        return this.RuleTypeZH;
    }

    /**
     * Set <p>Rule type.</p>
     * @param RuleTypeZH <p>Rule type.</p>
     */
    public void setRuleTypeZH(String RuleTypeZH) {
        this.RuleTypeZH = RuleTypeZH;
    }

    public K8sApiAbnormalEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalEventInfo(K8sApiAbnormalEventInfo source) {
        if (source.MatchRuleName != null) {
            this.MatchRuleName = new String(source.MatchRuleName);
        }
        if (source.MatchRuleType != null) {
            this.MatchRuleType = new String(source.MatchRuleType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterRunningStatus != null) {
            this.ClusterRunningStatus = new String(source.ClusterRunningStatus);
        }
        if (source.FirstCreateTime != null) {
            this.FirstCreateTime = new String(source.FirstCreateTime);
        }
        if (source.LastCreateTime != null) {
            this.LastCreateTime = new String(source.LastCreateTime);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterMasterIP != null) {
            this.ClusterMasterIP = new String(source.ClusterMasterIP);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.RunningComponent != null) {
            this.RunningComponent = new String[source.RunningComponent.length];
            for (int i = 0; i < source.RunningComponent.length; i++) {
                this.RunningComponent[i] = new String(source.RunningComponent[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.MatchRuleID != null) {
            this.MatchRuleID = new String(source.MatchRuleID);
        }
        if (source.HighLightFields != null) {
            this.HighLightFields = new String[source.HighLightFields.length];
            for (int i = 0; i < source.HighLightFields.length; i++) {
                this.HighLightFields[i] = new String(source.HighLightFields[i]);
            }
        }
        if (source.MatchRule != null) {
            this.MatchRule = new K8sApiAbnormalRuleScopeInfo(source.MatchRule);
        }
        if (source.HighLightFieldsVal != null) {
            this.HighLightFieldsVal = new String(source.HighLightFieldsVal);
        }
        if (source.RuleTypeZH != null) {
            this.RuleTypeZH = new String(source.RuleTypeZH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "MatchRuleType", this.MatchRuleType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterRunningStatus", this.ClusterRunningStatus);
        this.setParamSimple(map, prefix + "FirstCreateTime", this.FirstCreateTime);
        this.setParamSimple(map, prefix + "LastCreateTime", this.LastCreateTime);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterMasterIP", this.ClusterMasterIP);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamArraySimple(map, prefix + "RunningComponent.", this.RunningComponent);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "MatchRuleID", this.MatchRuleID);
        this.setParamArraySimple(map, prefix + "HighLightFields.", this.HighLightFields);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);
        this.setParamSimple(map, prefix + "HighLightFieldsVal", this.HighLightFieldsVal);
        this.setParamSimple(map, prefix + "RuleTypeZH", this.RuleTypeZH);

    }
}

