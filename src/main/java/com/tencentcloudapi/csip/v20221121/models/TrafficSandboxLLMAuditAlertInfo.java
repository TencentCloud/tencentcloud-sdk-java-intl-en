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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxLLMAuditAlertInfo extends AbstractModel {

    /**
    * <p>Alarm record ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>ID of the hit user rule</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>Name of the hit user rule</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Name of the hit LLM audit system rule</p>
    */
    @SerializedName("SystemRuleName")
    @Expose
    private String SystemRuleName;

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Container ID</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Container name</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Risk description of the hit</p>
    */
    @SerializedName("HitPayload")
    @Expose
    private String HitPayload;

    /**
    * <p>Hit action<br>Enumeration values:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>Alarm level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Processing status<br>Enumeration values:<br>PENDING: unprocessed<br>HANDLED: processed<br>IGNORE: ignored<br>PASS: allowlisted<br>BLOCK: blocked</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>First alarm time</p>
    */
    @SerializedName("FirstAlertTime")
    @Expose
    private String FirstAlertTime;

    /**
    * <p>Last alarm time</p>
    */
    @SerializedName("LastAlertTime")
    @Expose
    private String LastAlertTime;

    /**
     * Get <p>Alarm record ID</p> 
     * @return ID <p>Alarm record ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Alarm record ID</p>
     * @param ID <p>Alarm record ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p> 
     * @return BelongAssetType <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     * @param BelongAssetType <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>ID of the hit user rule</p> 
     * @return RuleID <p>ID of the hit user rule</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>ID of the hit user rule</p>
     * @param RuleID <p>ID of the hit user rule</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>Name of the hit user rule</p> 
     * @return RuleName <p>Name of the hit user rule</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Name of the hit user rule</p>
     * @param RuleName <p>Name of the hit user rule</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Name of the hit LLM audit system rule</p> 
     * @return SystemRuleName <p>Name of the hit LLM audit system rule</p>
     */
    public String getSystemRuleName() {
        return this.SystemRuleName;
    }

    /**
     * Set <p>Name of the hit LLM audit system rule</p>
     * @param SystemRuleName <p>Name of the hit LLM audit system rule</p>
     */
    public void setSystemRuleName(String SystemRuleName) {
        this.SystemRuleName = SystemRuleName;
    }

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Container ID</p> 
     * @return ContainerId <p>Container ID</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container ID</p>
     * @param ContainerId <p>Container ID</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Container name</p> 
     * @return ContainerName <p>Container name</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name</p>
     * @param ContainerName <p>Container name</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Risk description of the hit</p> 
     * @return HitPayload <p>Risk description of the hit</p>
     */
    public String getHitPayload() {
        return this.HitPayload;
    }

    /**
     * Set <p>Risk description of the hit</p>
     * @param HitPayload <p>Risk description of the hit</p>
     */
    public void setHitPayload(String HitPayload) {
        this.HitPayload = HitPayload;
    }

    /**
     * Get <p>Hit action<br>Enumeration values:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p> 
     * @return RuleAction <p>Hit action<br>Enumeration values:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>Hit action<br>Enumeration values:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
     * @param RuleAction <p>Hit action<br>Enumeration values:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>Alarm level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p> 
     * @return Level <p>Alarm level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
     * @param Level <p>Alarm level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Processing status<br>Enumeration values:<br>PENDING: unprocessed<br>HANDLED: processed<br>IGNORE: ignored<br>PASS: allowlisted<br>BLOCK: blocked</p> 
     * @return Status <p>Processing status<br>Enumeration values:<br>PENDING: unprocessed<br>HANDLED: processed<br>IGNORE: ignored<br>PASS: allowlisted<br>BLOCK: blocked</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Processing status<br>Enumeration values:<br>PENDING: unprocessed<br>HANDLED: processed<br>IGNORE: ignored<br>PASS: allowlisted<br>BLOCK: blocked</p>
     * @param Status <p>Processing status<br>Enumeration values:<br>PENDING: unprocessed<br>HANDLED: processed<br>IGNORE: ignored<br>PASS: allowlisted<br>BLOCK: blocked</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>First alarm time</p> 
     * @return FirstAlertTime <p>First alarm time</p>
     */
    public String getFirstAlertTime() {
        return this.FirstAlertTime;
    }

    /**
     * Set <p>First alarm time</p>
     * @param FirstAlertTime <p>First alarm time</p>
     */
    public void setFirstAlertTime(String FirstAlertTime) {
        this.FirstAlertTime = FirstAlertTime;
    }

    /**
     * Get <p>Last alarm time</p> 
     * @return LastAlertTime <p>Last alarm time</p>
     */
    public String getLastAlertTime() {
        return this.LastAlertTime;
    }

    /**
     * Set <p>Last alarm time</p>
     * @param LastAlertTime <p>Last alarm time</p>
     */
    public void setLastAlertTime(String LastAlertTime) {
        this.LastAlertTime = LastAlertTime;
    }

    public TrafficSandboxLLMAuditAlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxLLMAuditAlertInfo(TrafficSandboxLLMAuditAlertInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SystemRuleName != null) {
            this.SystemRuleName = new String(source.SystemRuleName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.HitPayload != null) {
            this.HitPayload = new String(source.HitPayload);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FirstAlertTime != null) {
            this.FirstAlertTime = new String(source.FirstAlertTime);
        }
        if (source.LastAlertTime != null) {
            this.LastAlertTime = new String(source.LastAlertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "SystemRuleName", this.SystemRuleName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "HitPayload", this.HitPayload);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FirstAlertTime", this.FirstAlertTime);
        this.setParamSimple(map, prefix + "LastAlertTime", this.LastAlertTime);

    }
}

