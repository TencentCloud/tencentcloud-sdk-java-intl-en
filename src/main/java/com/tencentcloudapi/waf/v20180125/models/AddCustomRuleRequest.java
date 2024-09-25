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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCustomRuleRequest extends AbstractModel {

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
    * Action type: 1 for Block, 2 captcha, 3 for Observe, 4 for Redirect
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * If the action is redirect, it indicates the redirect address; otherwise, it can be left blank.
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * Expiration time: in second-level timestamp, for example, 1677254399 indicates the expiration time is 2023-02-24 23:59:59; 0 indicates it will never expire.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Details of release
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * Source of the rule addition, default is empty
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Rule execution mode: TimedJob indicates scheduled execution. CronJob indicates periodic execution.
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Rule execution time
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * Rule source. You can determine whether a rule comes from a mini program.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Rule tag. It is used for mini program rules and identifies whether a rule is a built-in rule or a custom rule.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Switch status. This value is passed when mini program risk control rules are used.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Interception page ID
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

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
     * Get Action type: 1 for Block, 2 captcha, 3 for Observe, 4 for Redirect 
     * @return ActionType Action type: 1 for Block, 2 captcha, 3 for Observe, 4 for Redirect
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action type: 1 for Block, 2 captcha, 3 for Observe, 4 for Redirect
     * @param ActionType Action type: 1 for Block, 2 captcha, 3 for Observe, 4 for Redirect
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get If the action is redirect, it indicates the redirect address; otherwise, it can be left blank. 
     * @return Redirect If the action is redirect, it indicates the redirect address; otherwise, it can be left blank.
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set If the action is redirect, it indicates the redirect address; otherwise, it can be left blank.
     * @param Redirect If the action is redirect, it indicates the redirect address; otherwise, it can be left blank.
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get Expiration time: in second-level timestamp, for example, 1677254399 indicates the expiration time is 2023-02-24 23:59:59; 0 indicates it will never expire. 
     * @return ExpireTime Expiration time: in second-level timestamp, for example, 1677254399 indicates the expiration time is 2023-02-24 23:59:59; 0 indicates it will never expire.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time: in second-level timestamp, for example, 1677254399 indicates the expiration time is 2023-02-24 23:59:59; 0 indicates it will never expire.
     * @param ExpireTime Expiration time: in second-level timestamp, for example, 1677254399 indicates the expiration time is 2023-02-24 23:59:59; 0 indicates it will never expire.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF. 
     * @return Edition WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
     * @param Edition WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
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
     * Get Source of the rule addition, default is empty 
     * @return EventId Source of the rule addition, default is empty
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Source of the rule addition, default is empty
     * @param EventId Source of the rule addition, default is empty
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
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
     * Get Rule execution time 
     * @return JobDateTime Rule execution time
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set Rule execution time
     * @param JobDateTime Rule execution time
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get Rule source. You can determine whether a rule comes from a mini program. 
     * @return Source Rule source. You can determine whether a rule comes from a mini program.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Rule source. You can determine whether a rule comes from a mini program.
     * @param Source Rule source. You can determine whether a rule comes from a mini program.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Rule tag. It is used for mini program rules and identifies whether a rule is a built-in rule or a custom rule. 
     * @return Label Rule tag. It is used for mini program rules and identifies whether a rule is a built-in rule or a custom rule.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Rule tag. It is used for mini program rules and identifies whether a rule is a built-in rule or a custom rule.
     * @param Label Rule tag. It is used for mini program rules and identifies whether a rule is a built-in rule or a custom rule.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Switch status. This value is passed when mini program risk control rules are used. 
     * @return Status Switch status. This value is passed when mini program risk control rules are used.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Switch status. This value is passed when mini program risk control rules are used.
     * @param Status Switch status. This value is passed when mini program risk control rules are used.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Interception page ID 
     * @return PageId Interception page ID
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set Interception page ID
     * @param PageId Interception page ID
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    public AddCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomRuleRequest(AddCustomRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
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
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
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
        if (source.Label != null) {
            this.Label = new String(source.Label);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PageId", this.PageId);

    }
}

