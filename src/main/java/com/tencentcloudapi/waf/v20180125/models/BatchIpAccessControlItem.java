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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchIpAccessControlItem extends AbstractModel {

    /**
    * MongoDB Table Auto-increment ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Blocklist 42 or allowlist 40
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * IP of the blocklist/allowlist
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Remarks
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Path addition
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Modification time
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * Timeout period
    */
    @SerializedName("ValidTs")
    @Expose
    private Long ValidTs;

    /**
    * Domain name list
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 55101145
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * IP list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * Creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Scheduled task type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Periodic task type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * Scheduled task configuration details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * Effective status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
     * Get MongoDB Table Auto-increment ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id MongoDB Table Auto-increment ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set MongoDB Table Auto-increment ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id MongoDB Table Auto-increment ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Blocklist 42 or allowlist 40 
     * @return ActionType Blocklist 42 or allowlist 40
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Blocklist 42 or allowlist 40
     * @param ActionType Blocklist 42 or allowlist 40
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get IP of the blocklist/allowlist 
     * @return Ip IP of the blocklist/allowlist
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP of the blocklist/allowlist
     * @param Ip IP of the blocklist/allowlist
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Remarks 
     * @return Note Remarks
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Remarks
     * @param Note Remarks
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Path addition 
     * @return Source Path addition
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Path addition
     * @param Source Path addition
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Modification time 
     * @return TsVersion Modification time
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set Modification time
     * @param TsVersion Modification time
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get Timeout period 
     * @return ValidTs Timeout period
     */
    public Long getValidTs() {
        return this.ValidTs;
    }

    /**
     * Set Timeout period
     * @param ValidTs Timeout period
     */
    public void setValidTs(Long ValidTs) {
        this.ValidTs = ValidTs;
    }

    /**
     * Get Domain name list 
     * @return Hosts Domain name list
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Domain name list
     * @param Hosts Domain name list
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 55101145
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId 55101145
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 55101145
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId 55101145
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get IP list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpList IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpList IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get Creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Scheduled task type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobType Scheduled task type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Scheduled task type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobType Scheduled task type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get Periodic task type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CronType Periodic task type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set Periodic task type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CronType Periodic task type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get Scheduled task configuration details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobDateTime Scheduled task configuration details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set Scheduled task configuration details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobDateTime Scheduled task configuration details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get Effective status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidStatus Effective status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set Effective status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidStatus Effective status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public BatchIpAccessControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchIpAccessControlItem(BatchIpAccessControlItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.ValidTs != null) {
            this.ValidTs = new Long(source.ValidTs);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.CronType != null) {
            this.CronType = new String(source.CronType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "ValidTs", this.ValidTs);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

