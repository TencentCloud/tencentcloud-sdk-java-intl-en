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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTamperEvent extends AbstractModel {

    /**
    * Machine Name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Machine IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Occurrence time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last occurrence time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * cvm id
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Event Type/Action. 0 - Alarm
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Process path
    */
    @SerializedName("ProcessExe")
    @Expose
    private String ProcessExe;

    /**
    * Process parameter
    */
    @SerializedName("ProcessArgv")
    @Expose
    private String ProcessArgv;

    /**
    * Target file path
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Event Occurrences
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

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
    * Event Details: JSON Format
    */
    @SerializedName("Pstree")
    @Expose
    private String Pstree;

    /**
    * Rule Type. 0 - System Rule; 1 - Custom Rule
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * Host Online Information: ONLINE, OFFLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Severity description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Remediation Suggestions
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Process permission
    */
    @SerializedName("ExePermission")
    @Expose
    private String ExePermission;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User group
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * Process name
    */
    @SerializedName("ExeMd5")
    @Expose
    private String ExeMd5;

    /**
    * Process File Size
    */
    @SerializedName("ExeSize")
    @Expose
    private Long ExeSize;

    /**
    * Process Execution Duration
    */
    @SerializedName("ExeTime")
    @Expose
    private Long ExeTime;

    /**
    * Target file size
    */
    @SerializedName("TargetSize")
    @Expose
    private Long TargetSize;

    /**
    * Target File Permissions
    */
    @SerializedName("TargetPermission")
    @Expose
    private String TargetPermission;

    /**
    * Target File Update Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetModifyTime")
    @Expose
    private String TargetModifyTime;

    /**
    * Target File Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetCreatTime")
    @Expose
    private String TargetCreatTime;

    /**
    * Process PID
    */
    @SerializedName("ExePid")
    @Expose
    private Long ExePid;

    /**
    * File name
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Reference link
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Process name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExeName")
    @Expose
    private String ExeName;

    /**
    *  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * File threat behavior
<li>read: read file</li>
<li>write: modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

    /**
     * Get Machine Name 
     * @return HostName Machine Name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Machine Name
     * @param HostName Machine Name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Machine IP 
     * @return HostIp Machine IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Machine IP
     * @param HostIp Machine IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
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
     * Get Last occurrence time 
     * @return ModifyTime Last occurrence time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last occurrence time
     * @param ModifyTime Last occurrence time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get cvm id 
     * @return Quuid cvm id
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm id
     * @param Quuid cvm id
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Event Type/Action. 0 - Alarm 
     * @return Type Event Type/Action. 0 - Alarm
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Event Type/Action. 0 - Alarm
     * @param Type Event Type/Action. 0 - Alarm
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Process path 
     * @return ProcessExe Process path
     */
    public String getProcessExe() {
        return this.ProcessExe;
    }

    /**
     * Set Process path
     * @param ProcessExe Process path
     */
    public void setProcessExe(String ProcessExe) {
        this.ProcessExe = ProcessExe;
    }

    /**
     * Get Process parameter 
     * @return ProcessArgv Process parameter
     */
    public String getProcessArgv() {
        return this.ProcessArgv;
    }

    /**
     * Set Process parameter
     * @param ProcessArgv Process parameter
     */
    public void setProcessArgv(String ProcessArgv) {
        this.ProcessArgv = ProcessArgv;
    }

    /**
     * Get Target file path 
     * @return Target Target file path
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target file path
     * @param Target Target file path
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed 
     * @return Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     * @param Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Event Occurrences 
     * @return EventCount Event Occurrences
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Event Occurrences
     * @param EventCount Event Occurrences
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
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
     * Get Event Details: JSON Format 
     * @return Pstree Event Details: JSON Format
     */
    public String getPstree() {
        return this.Pstree;
    }

    /**
     * Set Event Details: JSON Format
     * @param Pstree Event Details: JSON Format
     */
    public void setPstree(String Pstree) {
        this.Pstree = Pstree;
    }

    /**
     * Get Rule Type. 0 - System Rule; 1 - Custom Rule 
     * @return RuleCategory Rule Type. 0 - System Rule; 1 - Custom Rule
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set Rule Type. 0 - System Rule; 1 - Custom Rule
     * @param RuleCategory Rule Type. 0 - System Rule; 1 - Custom Rule
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get Host Online Information: ONLINE, OFFLINE 
     * @return MachineStatus Host Online Information: ONLINE, OFFLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host Online Information: ONLINE, OFFLINE
     * @param MachineStatus Host Online Information: ONLINE, OFFLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Severity description 
     * @return Description Severity description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Severity description
     * @param Description Severity description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Remediation Suggestions 
     * @return Suggestion Remediation Suggestions
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Remediation Suggestions
     * @param Suggestion Remediation Suggestions
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Process permission 
     * @return ExePermission Process permission
     */
    public String getExePermission() {
        return this.ExePermission;
    }

    /**
     * Set Process permission
     * @param ExePermission Process permission
     */
    public void setExePermission(String ExePermission) {
        this.ExePermission = ExePermission;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User group 
     * @return UserGroup User group
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set User group
     * @param UserGroup User group
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get Process name 
     * @return ExeMd5 Process name
     */
    public String getExeMd5() {
        return this.ExeMd5;
    }

    /**
     * Set Process name
     * @param ExeMd5 Process name
     */
    public void setExeMd5(String ExeMd5) {
        this.ExeMd5 = ExeMd5;
    }

    /**
     * Get Process File Size 
     * @return ExeSize Process File Size
     */
    public Long getExeSize() {
        return this.ExeSize;
    }

    /**
     * Set Process File Size
     * @param ExeSize Process File Size
     */
    public void setExeSize(Long ExeSize) {
        this.ExeSize = ExeSize;
    }

    /**
     * Get Process Execution Duration 
     * @return ExeTime Process Execution Duration
     */
    public Long getExeTime() {
        return this.ExeTime;
    }

    /**
     * Set Process Execution Duration
     * @param ExeTime Process Execution Duration
     */
    public void setExeTime(Long ExeTime) {
        this.ExeTime = ExeTime;
    }

    /**
     * Get Target file size 
     * @return TargetSize Target file size
     */
    public Long getTargetSize() {
        return this.TargetSize;
    }

    /**
     * Set Target file size
     * @param TargetSize Target file size
     */
    public void setTargetSize(Long TargetSize) {
        this.TargetSize = TargetSize;
    }

    /**
     * Get Target File Permissions 
     * @return TargetPermission Target File Permissions
     */
    public String getTargetPermission() {
        return this.TargetPermission;
    }

    /**
     * Set Target File Permissions
     * @param TargetPermission Target File Permissions
     */
    public void setTargetPermission(String TargetPermission) {
        this.TargetPermission = TargetPermission;
    }

    /**
     * Get Target File Update Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetModifyTime Target File Update Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetModifyTime() {
        return this.TargetModifyTime;
    }

    /**
     * Set Target File Update Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetModifyTime Target File Update Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetModifyTime(String TargetModifyTime) {
        this.TargetModifyTime = TargetModifyTime;
    }

    /**
     * Get Target File Creation Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetCreatTime Target File Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetCreatTime() {
        return this.TargetCreatTime;
    }

    /**
     * Set Target File Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetCreatTime Target File Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetCreatTime(String TargetCreatTime) {
        this.TargetCreatTime = TargetCreatTime;
    }

    /**
     * Get Process PID 
     * @return ExePid Process PID
     */
    public Long getExePid() {
        return this.ExePid;
    }

    /**
     * Set Process PID
     * @param ExePid Process PID
     */
    public void setExePid(Long ExePid) {
        this.ExePid = ExePid;
    }

    /**
     * Get File name 
     * @return TargetName File name
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set File name
     * @param TargetName File name
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Reference link 
     * @return Reference Reference link
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference link
     * @param Reference Reference link
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk 
     * @return Level Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     * @param Level Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Process name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExeName Process name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExeName() {
        return this.ExeName;
    }

    /**
     * Set Process name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExeName Process name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExeName(String ExeName) {
        this.ExeName = ExeName;
    }

    /**
     * Get  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get File threat behavior
<li>read: read file</li>
<li>write: modify file</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileAction File threat behavior
<li>read: read file</li>
<li>write: modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set File threat behavior
<li>read: read file</li>
<li>write: modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileAction File threat behavior
<li>read: read file</li>
<li>write: modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
    }

    public FileTamperEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperEvent(FileTamperEvent source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ProcessExe != null) {
            this.ProcessExe = new String(source.ProcessExe);
        }
        if (source.ProcessArgv != null) {
            this.ProcessArgv = new String(source.ProcessArgv);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Pstree != null) {
            this.Pstree = new String(source.Pstree);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.ExePermission != null) {
            this.ExePermission = new String(source.ExePermission);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.ExeMd5 != null) {
            this.ExeMd5 = new String(source.ExeMd5);
        }
        if (source.ExeSize != null) {
            this.ExeSize = new Long(source.ExeSize);
        }
        if (source.ExeTime != null) {
            this.ExeTime = new Long(source.ExeTime);
        }
        if (source.TargetSize != null) {
            this.TargetSize = new Long(source.TargetSize);
        }
        if (source.TargetPermission != null) {
            this.TargetPermission = new String(source.TargetPermission);
        }
        if (source.TargetModifyTime != null) {
            this.TargetModifyTime = new String(source.TargetModifyTime);
        }
        if (source.TargetCreatTime != null) {
            this.TargetCreatTime = new String(source.TargetCreatTime);
        }
        if (source.ExePid != null) {
            this.ExePid = new Long(source.ExePid);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ExeName != null) {
            this.ExeName = new String(source.ExeName);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProcessExe", this.ProcessExe);
        this.setParamSimple(map, prefix + "ProcessArgv", this.ProcessArgv);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Pstree", this.Pstree);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "ExePermission", this.ExePermission);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "ExeMd5", this.ExeMd5);
        this.setParamSimple(map, prefix + "ExeSize", this.ExeSize);
        this.setParamSimple(map, prefix + "ExeTime", this.ExeTime);
        this.setParamSimple(map, prefix + "TargetSize", this.TargetSize);
        this.setParamSimple(map, prefix + "TargetPermission", this.TargetPermission);
        this.setParamSimple(map, prefix + "TargetModifyTime", this.TargetModifyTime);
        this.setParamSimple(map, prefix + "TargetCreatTime", this.TargetCreatTime);
        this.setParamSimple(map, prefix + "ExePid", this.ExePid);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ExeName", this.ExeName);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);

    }
}

