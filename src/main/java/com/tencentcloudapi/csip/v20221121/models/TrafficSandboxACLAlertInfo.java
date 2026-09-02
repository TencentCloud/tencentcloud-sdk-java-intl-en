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

public class TrafficSandboxACLAlertInfo extends AbstractModel {

    /**
    * <p>Alarm record ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>Hit user rule ID.</p>
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
    * <p>Agent UUID</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

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
    * <p>Process exe path</p>
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * <p>Process command line parameters<br>Input parameter limit: maximum 4096 bytes. May be truncated if overly long</p>
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * <p>Target address, such as GET http://xxxx or ip:port</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>Protocol type<br>Enumeration values:<br>http<br>https</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Alarm level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Processing status<br>Enumeration values:<br>PENDING: Unprocessed<br>HANDLED: Processed<br>IGNORE: Ignored<br>PASS: Allowlisted<br>BLOCK: Blocked</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Number of alarms</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>Initial alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("FirstAlertTime")
    @Expose
    private String FirstAlertTime;

    /**
    * <p>Last alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("LastAlertTime")
    @Expose
    private String LastAlertTime;

    /**
    * <p>Hit action<br>Enumeration values:<br>PASS: Allowlist<br>BLOCK: Block and alarm<br>MONITOR: Alarm</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

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
     * Get <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p> 
     * @return BelongAssetType <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     * @param BelongAssetType <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>Hit user rule ID.</p> 
     * @return RuleID <p>Hit user rule ID.</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>Hit user rule ID.</p>
     * @param RuleID <p>Hit user rule ID.</p>
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
     * Get <p>Agent UUID</p> 
     * @return UUID <p>Agent UUID</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>Agent UUID</p>
     * @param UUID <p>Agent UUID</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
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
     * Get <p>Process exe path</p> 
     * @return Exe <p>Process exe path</p>
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set <p>Process exe path</p>
     * @param Exe <p>Process exe path</p>
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get <p>Process command line parameters<br>Input parameter limit: maximum 4096 bytes. May be truncated if overly long</p> 
     * @return Param <p>Process command line parameters<br>Input parameter limit: maximum 4096 bytes. May be truncated if overly long</p>
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set <p>Process command line parameters<br>Input parameter limit: maximum 4096 bytes. May be truncated if overly long</p>
     * @param Param <p>Process command line parameters<br>Input parameter limit: maximum 4096 bytes. May be truncated if overly long</p>
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get <p>Target address, such as GET http://xxxx or ip:port</p> 
     * @return Target <p>Target address, such as GET http://xxxx or ip:port</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Target address, such as GET http://xxxx or ip:port</p>
     * @param Target <p>Target address, such as GET http://xxxx or ip:port</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>Protocol type<br>Enumeration values:<br>http<br>https</p> 
     * @return Protocol <p>Protocol type<br>Enumeration values:<br>http<br>https</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Protocol type<br>Enumeration values:<br>http<br>https</p>
     * @param Protocol <p>Protocol type<br>Enumeration values:<br>http<br>https</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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
     * Get <p>Processing status<br>Enumeration values:<br>PENDING: Unprocessed<br>HANDLED: Processed<br>IGNORE: Ignored<br>PASS: Allowlisted<br>BLOCK: Blocked</p> 
     * @return Status <p>Processing status<br>Enumeration values:<br>PENDING: Unprocessed<br>HANDLED: Processed<br>IGNORE: Ignored<br>PASS: Allowlisted<br>BLOCK: Blocked</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Processing status<br>Enumeration values:<br>PENDING: Unprocessed<br>HANDLED: Processed<br>IGNORE: Ignored<br>PASS: Allowlisted<br>BLOCK: Blocked</p>
     * @param Status <p>Processing status<br>Enumeration values:<br>PENDING: Unprocessed<br>HANDLED: Processed<br>IGNORE: Ignored<br>PASS: Allowlisted<br>BLOCK: Blocked</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Number of alarms</p> 
     * @return Count <p>Number of alarms</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of alarms</p>
     * @param Count <p>Number of alarms</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>Initial alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return FirstAlertTime <p>Initial alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getFirstAlertTime() {
        return this.FirstAlertTime;
    }

    /**
     * Set <p>Initial alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param FirstAlertTime <p>Initial alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setFirstAlertTime(String FirstAlertTime) {
        this.FirstAlertTime = FirstAlertTime;
    }

    /**
     * Get <p>Last alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return LastAlertTime <p>Last alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getLastAlertTime() {
        return this.LastAlertTime;
    }

    /**
     * Set <p>Last alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param LastAlertTime <p>Last alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setLastAlertTime(String LastAlertTime) {
        this.LastAlertTime = LastAlertTime;
    }

    /**
     * Get <p>Hit action<br>Enumeration values:<br>PASS: Allowlist<br>BLOCK: Block and alarm<br>MONITOR: Alarm</p> 
     * @return RuleAction <p>Hit action<br>Enumeration values:<br>PASS: Allowlist<br>BLOCK: Block and alarm<br>MONITOR: Alarm</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>Hit action<br>Enumeration values:<br>PASS: Allowlist<br>BLOCK: Block and alarm<br>MONITOR: Alarm</p>
     * @param RuleAction <p>Hit action<br>Enumeration values:<br>PASS: Allowlist<br>BLOCK: Block and alarm<br>MONITOR: Alarm</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    public TrafficSandboxACLAlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxACLAlertInfo(TrafficSandboxACLAlertInfo source) {
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
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.FirstAlertTime != null) {
            this.FirstAlertTime = new String(source.FirstAlertTime);
        }
        if (source.LastAlertTime != null) {
            this.LastAlertTime = new String(source.LastAlertTime);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
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
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FirstAlertTime", this.FirstAlertTime);
        this.setParamSimple(map, prefix + "LastAlertTime", this.LastAlertTime);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

