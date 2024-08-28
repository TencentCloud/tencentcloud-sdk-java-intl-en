/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BashEvent extends AbstractModel {

    /**
    * Data ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWPP ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Server ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host private IP address
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * Username for execution
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Platform type
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * Executed commands
    */
    @SerializedName("BashCmd")
    @Expose
    private String BashCmd;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule level: 1 - high-risk 2 - medium-risk; 3 - low-risk
    */
    @SerializedName("RuleLevel")
    @Expose
    private Long RuleLevel;

    /**
    * Processing status: 0 - pending; 1 - processed; 2 - allowlisted; 3 - ignored
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Occurrence time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 0: bash log; 1: real-time monitoring (thunder edition)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

    /**
    * Process ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * Process name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * Processing time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Rule category: 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * Automatically generated regular expression\nNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegexBashCmd")
    @Expose
    private String RegexBashCmd;

    /**
    * Host HostName
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get Data ID 
     * @return Id Data ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Data ID
     * @param Id Data ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWPP ID 
     * @return Uuid CWPP ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP ID
     * @param Uuid CWPP ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Server ID 
     * @return Quuid Server ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server ID
     * @param Quuid Server ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host private IP address 
     * @return Hostip Host private IP address
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set Host private IP address
     * @param Hostip Host private IP address
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Get Username for execution 
     * @return User Username for execution
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username for execution
     * @param User Username for execution
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Platform type 
     * @return Platform Platform type
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set Platform type
     * @param Platform Platform type
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Executed commands 
     * @return BashCmd Executed commands
     */
    public String getBashCmd() {
        return this.BashCmd;
    }

    /**
     * Set Executed commands
     * @param BashCmd Executed commands
     */
    public void setBashCmd(String BashCmd) {
        this.BashCmd = BashCmd;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule level: 1 - high-risk 2 - medium-risk; 3 - low-risk 
     * @return RuleLevel Rule level: 1 - high-risk 2 - medium-risk; 3 - low-risk
     */
    public Long getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set Rule level: 1 - high-risk 2 - medium-risk; 3 - low-risk
     * @param RuleLevel Rule level: 1 - high-risk 2 - medium-risk; 3 - low-risk
     */
    public void setRuleLevel(Long RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get Processing status: 0 - pending; 1 - processed; 2 - allowlisted; 3 - ignored 
     * @return Status Processing status: 0 - pending; 1 - processed; 2 - allowlisted; 3 - ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing status: 0 - pending; 1 - processed; 2 - allowlisted; 3 - ignored
     * @param Status Processing status: 0 - pending; 1 - processed; 2 - allowlisted; 3 - ignored
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Occurrence time 
     * @return CreateTime Occurrence time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Occurrence time
     * @param CreateTime Occurrence time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Server name 
     * @return MachineName Server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
     * @param MachineName Server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 0: bash log; 1: real-time monitoring (thunder edition)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectBy 0: bash log; 1: real-time monitoring (thunder edition)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set 0: bash log; 1: real-time monitoring (thunder edition)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectBy 0: bash log; 1: real-time monitoring (thunder edition)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    /**
     * Get Process ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pid Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pid Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Process name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Exe Process name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Process name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Exe Process name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get Processing time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Processing time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Processing time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Processing time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Rule category: 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleCategory Rule category: 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set Rule category: 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleCategory Rule category: 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get Automatically generated regular expression\nNote: This field may return null, indicating that no valid values can be obtained. 
     * @return RegexBashCmd Automatically generated regular expression\nNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegexBashCmd() {
        return this.RegexBashCmd;
    }

    /**
     * Set Automatically generated regular expression\nNote: This field may return null, indicating that no valid values can be obtained.
     * @param RegexBashCmd Automatically generated regular expression\nNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegexBashCmd(String RegexBashCmd) {
        this.RegexBashCmd = RegexBashCmd;
    }

    /**
     * Get Host HostName
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Host HostName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host HostName
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Host HostName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    public BashEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashEvent(BashEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.BashCmd != null) {
            this.BashCmd = new String(source.BashCmd);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new Long(source.RuleLevel);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.DetectBy != null) {
            this.DetectBy = new Long(source.DetectBy);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.RegexBashCmd != null) {
            this.RegexBashCmd = new String(source.RegexBashCmd);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "BashCmd", this.BashCmd);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "DetectBy", this.DetectBy);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "RegexBashCmd", this.RegexBashCmd);
        this.setParamSimple(map, prefix + "HostName", this.HostName);

    }
}

