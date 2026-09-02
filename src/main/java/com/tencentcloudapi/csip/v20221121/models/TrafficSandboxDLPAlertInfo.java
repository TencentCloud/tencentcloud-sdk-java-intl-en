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

public class TrafficSandboxDLPAlertInfo extends AbstractModel {

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
    * <p>Cluster ID<br>Input parameter limitation: returned only for container alarms</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Container ID<br>Input limit: Returned only for container alarms</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Container name<br>Input parameter limit: returned only for container alarms</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Process exe path</p>
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * <p>Process command line parameters</p>
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * <p>Destination address.</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>Matching scope<br>Enumeration values:<br>req_head: Request header<br>req_body: Request body<br>rsp_head: Response header<br>rsp_body: Response body</p>
    */
    @SerializedName("MatchScope")
    @Expose
    private String MatchScope;

    /**
    * <p>Complete match_content submitted by the agent<br>Input limit: up to 256 bytes; the first half of characters are masked</p>
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
    * <p>Actual matching fragment that triggers the rule<br>Input limit: the first half of characters is masked; when the rule is missing or not hit, it degenerates into the same as MatchContent</p>
    */
    @SerializedName("MatchContentSample")
    @Expose
    private String MatchContentSample;

    /**
    * <p>UGC upload protocol</p>
    */
    @SerializedName("UpProto")
    @Expose
    private String UpProto;

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File type</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>File size</p><p>Unit: Byte</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

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
    * <p>First alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
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
     * Get <p>Cluster ID<br>Input parameter limitation: returned only for container alarms</p> 
     * @return ClusterId <p>Cluster ID<br>Input parameter limitation: returned only for container alarms</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID<br>Input parameter limitation: returned only for container alarms</p>
     * @param ClusterId <p>Cluster ID<br>Input parameter limitation: returned only for container alarms</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Container ID<br>Input limit: Returned only for container alarms</p> 
     * @return ContainerId <p>Container ID<br>Input limit: Returned only for container alarms</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container ID<br>Input limit: Returned only for container alarms</p>
     * @param ContainerId <p>Container ID<br>Input limit: Returned only for container alarms</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Container name<br>Input parameter limit: returned only for container alarms</p> 
     * @return ContainerName <p>Container name<br>Input parameter limit: returned only for container alarms</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name<br>Input parameter limit: returned only for container alarms</p>
     * @param ContainerName <p>Container name<br>Input parameter limit: returned only for container alarms</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
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
     * Get <p>Process command line parameters</p> 
     * @return Param <p>Process command line parameters</p>
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set <p>Process command line parameters</p>
     * @param Param <p>Process command line parameters</p>
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get <p>Destination address.</p> 
     * @return Target <p>Destination address.</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Destination address.</p>
     * @param Target <p>Destination address.</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>Matching scope<br>Enumeration values:<br>req_head: Request header<br>req_body: Request body<br>rsp_head: Response header<br>rsp_body: Response body</p> 
     * @return MatchScope <p>Matching scope<br>Enumeration values:<br>req_head: Request header<br>req_body: Request body<br>rsp_head: Response header<br>rsp_body: Response body</p>
     */
    public String getMatchScope() {
        return this.MatchScope;
    }

    /**
     * Set <p>Matching scope<br>Enumeration values:<br>req_head: Request header<br>req_body: Request body<br>rsp_head: Response header<br>rsp_body: Response body</p>
     * @param MatchScope <p>Matching scope<br>Enumeration values:<br>req_head: Request header<br>req_body: Request body<br>rsp_head: Response header<br>rsp_body: Response body</p>
     */
    public void setMatchScope(String MatchScope) {
        this.MatchScope = MatchScope;
    }

    /**
     * Get <p>Complete match_content submitted by the agent<br>Input limit: up to 256 bytes; the first half of characters are masked</p> 
     * @return MatchContent <p>Complete match_content submitted by the agent<br>Input limit: up to 256 bytes; the first half of characters are masked</p>
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set <p>Complete match_content submitted by the agent<br>Input limit: up to 256 bytes; the first half of characters are masked</p>
     * @param MatchContent <p>Complete match_content submitted by the agent<br>Input limit: up to 256 bytes; the first half of characters are masked</p>
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    /**
     * Get <p>Actual matching fragment that triggers the rule<br>Input limit: the first half of characters is masked; when the rule is missing or not hit, it degenerates into the same as MatchContent</p> 
     * @return MatchContentSample <p>Actual matching fragment that triggers the rule<br>Input limit: the first half of characters is masked; when the rule is missing or not hit, it degenerates into the same as MatchContent</p>
     */
    public String getMatchContentSample() {
        return this.MatchContentSample;
    }

    /**
     * Set <p>Actual matching fragment that triggers the rule<br>Input limit: the first half of characters is masked; when the rule is missing or not hit, it degenerates into the same as MatchContent</p>
     * @param MatchContentSample <p>Actual matching fragment that triggers the rule<br>Input limit: the first half of characters is masked; when the rule is missing or not hit, it degenerates into the same as MatchContent</p>
     */
    public void setMatchContentSample(String MatchContentSample) {
        this.MatchContentSample = MatchContentSample;
    }

    /**
     * Get <p>UGC upload protocol</p> 
     * @return UpProto <p>UGC upload protocol</p>
     */
    public String getUpProto() {
        return this.UpProto;
    }

    /**
     * Set <p>UGC upload protocol</p>
     * @param UpProto <p>UGC upload protocol</p>
     */
    public void setUpProto(String UpProto) {
        this.UpProto = UpProto;
    }

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File type</p> 
     * @return FileType <p>File type</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type</p>
     * @param FileType <p>File type</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>File size</p><p>Unit: Byte</p> 
     * @return FileSize <p>File size</p><p>Unit: Byte</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size</p><p>Unit: Byte</p>
     * @param FileSize <p>File size</p><p>Unit: Byte</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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
     * Get <p>First alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return FirstAlertTime <p>First alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getFirstAlertTime() {
        return this.FirstAlertTime;
    }

    /**
     * Set <p>First alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param FirstAlertTime <p>First alarm time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
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

    public TrafficSandboxDLPAlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPAlertInfo(TrafficSandboxDLPAlertInfo source) {
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
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
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
        if (source.MatchScope != null) {
            this.MatchScope = new String(source.MatchScope);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
        if (source.MatchContentSample != null) {
            this.MatchContentSample = new String(source.MatchContentSample);
        }
        if (source.UpProto != null) {
            this.UpProto = new String(source.UpProto);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "MatchScope", this.MatchScope);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "MatchContentSample", this.MatchContentSample);
        this.setParamSimple(map, prefix + "UpProto", this.UpProto);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FirstAlertTime", this.FirstAlertTime);
        this.setParamSimple(map, prefix + "LastAlertTime", this.LastAlertTime);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

