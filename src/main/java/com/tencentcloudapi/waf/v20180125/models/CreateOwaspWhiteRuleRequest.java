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

public class CreateOwaspWhiteRuleRequest extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule-Based matching policy list.
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * ID list of allowlisted rules.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Allowlist type. valid values: 0 (allowlisting by specific rule ID), 1 (allowlisting by rule type).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Rule execution mode: TimedJob indicates scheduled execution. CronJob indicates periodic execution.
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
    * If the JobDateTime field is not set, this field is used. 0 means permanent, other values indicate the cutoff time for scheduled effect (unit: seconds).
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Rule status. valid values: 0 (disabled), 1 (enabled). enabled by default.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get Rule execution mode: TimedJob indicates scheduled execution. CronJob indicates periodic execution. 
     * @return JobType Rule execution mode: TimedJob indicates scheduled execution. CronJob indicates periodic execution.
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Rule execution mode: TimedJob indicates scheduled execution. CronJob indicates periodic execution.
     * @param JobType Rule execution mode: TimedJob indicates scheduled execution. CronJob indicates periodic execution.
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
     * Get If the JobDateTime field is not set, this field is used. 0 means permanent, other values indicate the cutoff time for scheduled effect (unit: seconds). 
     * @return ExpireTime If the JobDateTime field is not set, this field is used. 0 means permanent, other values indicate the cutoff time for scheduled effect (unit: seconds).
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set If the JobDateTime field is not set, this field is used. 0 means permanent, other values indicate the cutoff time for scheduled effect (unit: seconds).
     * @param ExpireTime If the JobDateTime field is not set, this field is used. 0 means permanent, other values indicate the cutoff time for scheduled effect (unit: seconds).
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Rule status. valid values: 0 (disabled), 1 (enabled). enabled by default. 
     * @return Status Rule status. valid values: 0 (disabled), 1 (enabled). enabled by default.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. valid values: 0 (disabled), 1 (enabled). enabled by default.
     * @param Status Rule status. valid values: 0 (disabled), 1 (enabled). enabled by default.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CreateOwaspWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOwaspWhiteRuleRequest(CreateOwaspWhiteRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

