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

public class ModifyCustomWhiteRuleRequest extends AbstractModel {

    /**
    * Edited domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Edited rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Edited rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Whether to continue executing other check logics when bypassing, continue executing regional ban protection - geoip; continue executing CC policy protection - cc; continue executing WEB application protection: owasp; continue executing AI engine protection - ai; continue executing information leakage protection - antileakage. If multiple items are selected, concatenate with commas (,).
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Matching condition array
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

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
     * Get Edited domain 
     * @return Domain Edited domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Edited domain
     * @param Domain Edited domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Edited rule ID 
     * @return RuleId Edited rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Edited rule ID
     * @param RuleId Edited rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Edited rule name 
     * @return RuleName Edited rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Edited rule name
     * @param RuleName Edited rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Whether to continue executing other check logics when bypassing, continue executing regional ban protection - geoip; continue executing CC policy protection - cc; continue executing WEB application protection: owasp; continue executing AI engine protection - ai; continue executing information leakage protection - antileakage. If multiple items are selected, concatenate with commas (,). 
     * @return Bypass Whether to continue executing other check logics when bypassing, continue executing regional ban protection - geoip; continue executing CC policy protection - cc; continue executing WEB application protection: owasp; continue executing AI engine protection - ai; continue executing information leakage protection - antileakage. If multiple items are selected, concatenate with commas (,).
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set Whether to continue executing other check logics when bypassing, continue executing regional ban protection - geoip; continue executing CC policy protection - cc; continue executing WEB application protection: owasp; continue executing AI engine protection - ai; continue executing information leakage protection - antileakage. If multiple items are selected, concatenate with commas (,).
     * @param Bypass Whether to continue executing other check logics when bypassing, continue executing regional ban protection - geoip; continue executing CC policy protection - cc; continue executing WEB application protection: owasp; continue executing AI engine protection - ai; continue executing information leakage protection - antileakage. If multiple items are selected, concatenate with commas (,).
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule. 
     * @return SortId Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.
     * @param SortId Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time. 
     * @return ExpireTime Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.
     * @param ExpireTime Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Matching condition array 
     * @return Strategies Matching condition array
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set Matching condition array
     * @param Strategies Matching condition array
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
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

    public ModifyCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomWhiteRuleRequest(ModifyCustomWhiteRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);

    }
}

