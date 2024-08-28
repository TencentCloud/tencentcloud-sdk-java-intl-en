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

public class BashEventsInfoNew extends AbstractModel {

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
    * Host ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host private IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

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
    * Rule ID equals 0 indicating that the rule has been deleted or the effective scope has been modified.
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
    * Processing status: 0: Pending; 1: Processed; 2: Whitelisted; 3: Ignored
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
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

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
    * Rule category. 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * Automatically generated regular expression
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegexBashCmd")
    @Expose
    private String RegexBashCmd;

    /**
    * Process tree json  pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: command execution; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

    /**
    * Recommended solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Reference link
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("References")
    @Expose
    private String [] References;

    /**
    * Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host online status: OFFLINE; ONLINE
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Log-in user
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Process ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * 0: normal; 1: professional version; 2: ultimate edition
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineType")
    @Expose
    private Long MachineType;

    /**
    * Source of Detection: 0: bash log; 1: real-time monitoring
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

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
     * Get Host ID 
     * @return Quuid Host ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host ID
     * @param Quuid Host ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host private IP address 
     * @return HostIp Host private IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host private IP address
     * @param HostIp Host private IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
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
     * Get Rule ID equals 0 indicating that the rule has been deleted or the effective scope has been modified. 
     * @return RuleId Rule ID equals 0 indicating that the rule has been deleted or the effective scope has been modified.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID equals 0 indicating that the rule has been deleted or the effective scope has been modified.
     * @param RuleId Rule ID equals 0 indicating that the rule has been deleted or the effective scope has been modified.
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
     * Get Processing status: 0: Pending; 1: Processed; 2: Whitelisted; 3: Ignored 
     * @return Status Processing status: 0: Pending; 1: Processed; 2: Whitelisted; 3: Ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing status: 0: Pending; 1: Processed; 2: Whitelisted; 3: Ignored
     * @param Status Processing status: 0: Pending; 1: Processed; 2: Whitelisted; 3: Ignored
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
     * Get Host name 
     * @return MachineName Host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
     * @param MachineName Host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
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
     * Get Rule category. 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleCategory Rule category. 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set Rule category. 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleCategory Rule category. 0 - system rule; 1 - user rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get Automatically generated regular expression
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegexBashCmd Automatically generated regular expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegexBashCmd() {
        return this.RegexBashCmd;
    }

    /**
     * Set Automatically generated regular expression
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegexBashCmd Automatically generated regular expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegexBashCmd(String RegexBashCmd) {
        this.RegexBashCmd = RegexBashCmd;
    }

    /**
     * Get Process tree json  pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: command execution; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PsTree Process tree json  pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: command execution; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set Process tree json  pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: command execution; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PsTree Process tree json  pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: command execution; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
    }

    /**
     * Get Recommended solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuggestScheme Recommended solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set Recommended solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuggestScheme Recommended solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HarmDescribe Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HarmDescribe Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Reference link
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return References Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getReferences() {
        return this.References;
    }

    /**
     * Set Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     * @param References Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReferences(String [] References) {
        this.References = References;
    }

    /**
     * Get Host public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineWanIp Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineWanIp Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Host online status: OFFLINE; ONLINE
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineStatus Host online status: OFFLINE; ONLINE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host online status: OFFLINE; ONLINE
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineStatus Host online status: OFFLINE; ONLINE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Log-in user
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return User Log-in user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Log-in user
Note: This field may return null, indicating that no valid values can be obtained.
     * @param User Log-in user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
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
     * Get 0: normal; 1: professional version; 2: ultimate edition
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineType 0: normal; 1: professional version; 2: ultimate edition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 0: normal; 1: professional version; 2: ultimate edition
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineType 0: normal; 1: professional version; 2: ultimate edition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineType(Long MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Source of Detection: 0: bash log; 1: real-time monitoring
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectBy Source of Detection: 0: bash log; 1: real-time monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set Source of Detection: 0: bash log; 1: real-time monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectBy Source of Detection: 0: bash log; 1: real-time monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    public BashEventsInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashEventsInfoNew(BashEventsInfoNew source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
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
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.References != null) {
            this.References = new String[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new String(source.References[i]);
            }
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.MachineType != null) {
            this.MachineType = new Long(source.MachineType);
        }
        if (source.DetectBy != null) {
            this.DetectBy = new Long(source.DetectBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "BashCmd", this.BashCmd);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "RegexBashCmd", this.RegexBashCmd);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "DetectBy", this.DetectBy);

    }
}

