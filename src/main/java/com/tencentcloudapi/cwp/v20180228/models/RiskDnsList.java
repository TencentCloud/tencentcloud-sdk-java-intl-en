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

public class RiskDnsList extends AbstractModel {

    /**
    * External access domain name
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Access count
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process MD5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * Whether the rule is global. 0: no; 1: yes.
    */
    @SerializedName("GlobalRuleId")
    @Expose
    private Long GlobalRuleId;

    /**
    * User rule ID
    */
    @SerializedName("UserRuleId")
    @Expose
    private Long UserRuleId;

    /**
    * Status. 0: pending; 2: added to allowlist; 3: untrusted; 4: processed; 5: ignored.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * First access time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last access Time
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * Unique QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Reference
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Command line
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Process ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Recommended solution
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Tag Features
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host online status. OFFLINE: offline; ONLINE: online; UNKNOWN: unknown.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
     * Get External access domain name 
     * @return Url External access domain name
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set External access domain name
     * @param Url External access domain name
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Access count 
     * @return AccessCount Access count
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set Access count
     * @param AccessCount Access count
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Process MD5 
     * @return ProcessMd5 Process MD5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set Process MD5
     * @param ProcessMd5 Process MD5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get Whether the rule is global. 0: no; 1: yes. 
     * @return GlobalRuleId Whether the rule is global. 0: no; 1: yes.
     */
    public Long getGlobalRuleId() {
        return this.GlobalRuleId;
    }

    /**
     * Set Whether the rule is global. 0: no; 1: yes.
     * @param GlobalRuleId Whether the rule is global. 0: no; 1: yes.
     */
    public void setGlobalRuleId(Long GlobalRuleId) {
        this.GlobalRuleId = GlobalRuleId;
    }

    /**
     * Get User rule ID 
     * @return UserRuleId User rule ID
     */
    public Long getUserRuleId() {
        return this.UserRuleId;
    }

    /**
     * Set User rule ID
     * @param UserRuleId User rule ID
     */
    public void setUserRuleId(Long UserRuleId) {
        this.UserRuleId = UserRuleId;
    }

    /**
     * Get Status. 0: pending; 2: added to allowlist; 3: untrusted; 4: processed; 5: ignored. 
     * @return Status Status. 0: pending; 2: added to allowlist; 3: untrusted; 4: processed; 5: ignored.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: pending; 2: added to allowlist; 3: untrusted; 4: processed; 5: ignored.
     * @param Status Status. 0: pending; 2: added to allowlist; 3: untrusted; 4: processed; 5: ignored.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get First access time 
     * @return CreateTime First access time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First access time
     * @param CreateTime First access time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last access Time 
     * @return MergeTime Last access Time
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Last access Time
     * @param MergeTime Last access Time
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get Unique QUUID 
     * @return Quuid Unique QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Unique QUUID
     * @param Quuid Unique QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host IP 
     * @return HostIp Host IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP
     * @param HostIp Host IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Alias 
     * @return Alias Alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias
     * @param Alias Alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Reference 
     * @return Reference Reference
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference
     * @param Reference Reference
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Command line 
     * @return CmdLine Command line
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command line
     * @param CmdLine Command line
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Process ID 
     * @return Pid Process ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
     * @param Pid Process ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get UUID 
     * @return Uuid UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set UUID
     * @param Uuid UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Recommended solution 
     * @return SuggestScheme Recommended solution
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set Recommended solution
     * @param SuggestScheme Recommended solution
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get Tag Features 
     * @return Tags Tag Features
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag Features
     * @param Tags Tag Features
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineWanIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineWanIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Host online status. OFFLINE: offline; ONLINE: online; UNKNOWN: unknown.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineStatus Host online status. OFFLINE: offline; ONLINE: online; UNKNOWN: unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host online status. OFFLINE: offline; ONLINE: online; UNKNOWN: unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineStatus Host online status. OFFLINE: offline; ONLINE: online; UNKNOWN: unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    public RiskDnsList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDnsList(RiskDnsList source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.GlobalRuleId != null) {
            this.GlobalRuleId = new Long(source.GlobalRuleId);
        }
        if (source.UserRuleId != null) {
            this.UserRuleId = new Long(source.UserRuleId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "GlobalRuleId", this.GlobalRuleId);
        this.setParamSimple(map, prefix + "UserRuleId", this.UserRuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);

    }
}

