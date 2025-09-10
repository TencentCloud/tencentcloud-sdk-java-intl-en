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

public class OwaspWhiteRule extends AbstractModel {

    /**
    * Rule ID of the allowlist.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ID list of allowlisted rules.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Allowlist rule state. valid values: 0 (disabled), 1 (enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Allowlist type. valid values: 0 (allowlisting by specific rule ID), 1 (allowlisting by rule type).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Rule-Based matching policy list.
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Scheduled task type
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Scheduled task configuration
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * Periodic task granularity.
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * Whether there is currently valid.
    */
    @SerializedName("ValidStatus")
    @Expose
    private Boolean ValidStatus;

    /**
     * Get Rule ID of the allowlist. 
     * @return RuleId Rule ID of the allowlist.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID of the allowlist.
     * @param RuleId Rule ID of the allowlist.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule Name 
     * @return Name Rule Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule Name
     * @param Name Rule Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ID list of allowlisted rules. 
     * @return Ids ID list of allowlisted rules.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set ID list of allowlisted rules.
     * @param Ids ID list of allowlisted rules.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Allowlist rule state. valid values: 0 (disabled), 1 (enabled). 
     * @return Status Allowlist rule state. valid values: 0 (disabled), 1 (enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Allowlist rule state. valid values: 0 (disabled), 1 (enabled).
     * @param Status Allowlist rule state. valid values: 0 (disabled), 1 (enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Allowlist type. valid values: 0 (allowlisting by specific rule ID), 1 (allowlisting by rule type). 
     * @return Type Allowlist type. valid values: 0 (allowlisting by specific rule ID), 1 (allowlisting by rule type).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Allowlist type. valid values: 0 (allowlisting by specific rule ID), 1 (allowlisting by rule type).
     * @param Type Allowlist type. valid values: 0 (allowlisting by specific rule ID), 1 (allowlisting by rule type).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Rule-Based matching policy list. 
     * @return Strategies Rule-Based matching policy list.
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set Rule-Based matching policy list.
     * @param Strategies Rule-Based matching policy list.
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return UpdateTime Modification time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time
     * @param UpdateTime Modification time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Scheduled task type 
     * @return JobType Scheduled task type
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Scheduled task type
     * @param JobType Scheduled task type
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get Scheduled task configuration 
     * @return JobDateTime Scheduled task configuration
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set Scheduled task configuration
     * @param JobDateTime Scheduled task configuration
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get Periodic task granularity. 
     * @return CronType Periodic task granularity.
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set Periodic task granularity.
     * @param CronType Periodic task granularity.
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get Whether there is currently valid. 
     * @return ValidStatus Whether there is currently valid.
     */
    public Boolean getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set Whether there is currently valid.
     * @param ValidStatus Whether there is currently valid.
     */
    public void setValidStatus(Boolean ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public OwaspWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwaspWhiteRule(OwaspWhiteRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.CronType != null) {
            this.CronType = new String(source.CronType);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Boolean(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

