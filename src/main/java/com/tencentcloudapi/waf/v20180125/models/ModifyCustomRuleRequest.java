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

public class ModifyCustomRuleRequest extends AbstractModel {

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
    * Executed actions: 0-allow, 1-block, 2-CAPTCHA, 3-observe, 4-redirect
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Matching condition array
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Redirected URL when action is set to redirect, / by default
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * Whether to continue executing other check logic upon allowing. geoip: continue region blocking protection; cc: continue CC policy protection; owasp: continue web application protection; ai: continue AI engine protection; antileakage: continue information leakage prevention. If multiple values are entered, separate them with commas (,).
The default value is "geoip,cc,owasp,ai,antileakage".
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.

The default value is 100.
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.

The default value is 0.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

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
    * Rule source. This parameter checks whether the rule source is mini program.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Enabling status. Pass the value for rules of mini program risk control.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ID of the blocked page
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

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
     * Get Executed actions: 0-allow, 1-block, 2-CAPTCHA, 3-observe, 4-redirect 
     * @return RuleAction Executed actions: 0-allow, 1-block, 2-CAPTCHA, 3-observe, 4-redirect
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Executed actions: 0-allow, 1-block, 2-CAPTCHA, 3-observe, 4-redirect
     * @param RuleAction Executed actions: 0-allow, 1-block, 2-CAPTCHA, 3-observe, 4-redirect
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
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
     * Get Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default. 
     * @return Edition Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
     * @param Edition Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Redirected URL when action is set to redirect, / by default 
     * @return Redirect Redirected URL when action is set to redirect, / by default
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set Redirected URL when action is set to redirect, / by default
     * @param Redirect Redirected URL when action is set to redirect, / by default
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get Whether to continue executing other check logic upon allowing. geoip: continue region blocking protection; cc: continue CC policy protection; owasp: continue web application protection; ai: continue AI engine protection; antileakage: continue information leakage prevention. If multiple values are entered, separate them with commas (,).
The default value is "geoip,cc,owasp,ai,antileakage". 
     * @return Bypass Whether to continue executing other check logic upon allowing. geoip: continue region blocking protection; cc: continue CC policy protection; owasp: continue web application protection; ai: continue AI engine protection; antileakage: continue information leakage prevention. If multiple values are entered, separate them with commas (,).
The default value is "geoip,cc,owasp,ai,antileakage".
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set Whether to continue executing other check logic upon allowing. geoip: continue region blocking protection; cc: continue CC policy protection; owasp: continue web application protection; ai: continue AI engine protection; antileakage: continue information leakage prevention. If multiple values are entered, separate them with commas (,).
The default value is "geoip,cc,owasp,ai,antileakage".
     * @param Bypass Whether to continue executing other check logic upon allowing. geoip: continue region blocking protection; cc: continue CC policy protection; owasp: continue web application protection; ai: continue AI engine protection; antileakage: continue information leakage prevention. If multiple values are entered, separate them with commas (,).
The default value is "geoip,cc,owasp,ai,antileakage".
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.

The default value is 100. 
     * @return SortId Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.

The default value is 100.
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.

The default value is 100.
     * @param SortId Priority, an integer from 1 to 100. The smaller the number, the higher the execution priority of this rule.

The default value is 100.
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.

The default value is 0. 
     * @return ExpireTime Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.

The default value is 0.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.

The default value is 0.
     * @param ExpireTime Rule expiration deadline: 0 - permanently effective; other values correspond to the timestamp of the specified time.

The default value is 0.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
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
     * Get Rule source. This parameter checks whether the rule source is mini program. 
     * @return Source Rule source. This parameter checks whether the rule source is mini program.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Rule source. This parameter checks whether the rule source is mini program.
     * @param Source Rule source. This parameter checks whether the rule source is mini program.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Enabling status. Pass the value for rules of mini program risk control. 
     * @return Status Enabling status. Pass the value for rules of mini program risk control.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling status. Pass the value for rules of mini program risk control.
     * @param Status Enabling status. Pass the value for rules of mini program risk control.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get ID of the blocked page 
     * @return PageId ID of the blocked page
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set ID of the blocked page
     * @param PageId ID of the blocked page
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    public ModifyCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomRuleRequest(ModifyCustomRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
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
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PageId", this.PageId);

    }
}

