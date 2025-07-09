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

public class AddCustomWhiteRuleRequest extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Priority
    */
    @SerializedName("SortId")
    @Expose
    private String SortId;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Policy details
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * Domain name for adding policy
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Details of release
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

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
     * Get Priority 
     * @return SortId Priority
     */
    public String getSortId() {
        return this.SortId;
    }

    /**
     * Set Priority
     * @param SortId Priority
     */
    public void setSortId(String SortId) {
        this.SortId = SortId;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Policy details 
     * @return Strategies Policy details
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set Policy details
     * @param Strategies Policy details
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get Domain name for adding policy 
     * @return Domain Domain name for adding policy
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name for adding policy
     * @param Domain Domain name for adding policy
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Details of release 
     * @return Bypass Details of release
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set Details of release
     * @param Bypass Details of release
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
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

    public AddCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomWhiteRuleRequest(AddCustomWhiteRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);

    }
}

