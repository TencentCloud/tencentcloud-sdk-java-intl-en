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

public class DescribeCustomRulesRspRuleListItem extends AbstractModel {

    /**
    * Action type
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Skipped Policy
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * URL for redirection
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * Policy ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Priority
    */
    @SerializedName("SortId")
    @Expose
    private String SortId;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Policy details
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
    * Event ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Modification time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Effective status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * Source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Scheduled task type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Scheduled task configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * Periodic task granularity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CronType")
    @Expose
    private String CronType;

    /**
    * Custom tag in risk control rules, indicating whether a rule is built-in or user-defined
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * ID of the blocked page
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * Domain name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Action type 
     * @return ActionType Action type
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action type
     * @param ActionType Action type
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Skipped Policy 
     * @return Bypass Skipped Policy
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set Skipped Policy
     * @param Bypass Skipped Policy
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
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
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get URL for redirection 
     * @return Redirect URL for redirection
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set URL for redirection
     * @param Redirect URL for redirection
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get Policy ID 
     * @return RuleId Policy ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Policy ID
     * @param RuleId Policy ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Event ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventId Event ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventId Event ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Modification time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

    /**
     * Get Source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Source Source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Source Source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSource(String Source) {
        this.Source = Source;
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
     * Get Scheduled task configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobDateTime Scheduled task configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set Scheduled task configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobDateTime Scheduled task configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    /**
     * Get Periodic task granularity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CronType Periodic task granularity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCronType() {
        return this.CronType;
    }

    /**
     * Set Periodic task granularity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CronType Periodic task granularity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCronType(String CronType) {
        this.CronType = CronType;
    }

    /**
     * Get Custom tag in risk control rules, indicating whether a rule is built-in or user-defined
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label Custom tag in risk control rules, indicating whether a rule is built-in or user-defined
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Custom tag in risk control rules, indicating whether a rule is built-in or user-defined
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label Custom tag in risk control rules, indicating whether a rule is built-in or user-defined
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get ID of the blocked page
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageId ID of the blocked page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set ID of the blocked page
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageId ID of the blocked page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Domain name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeCustomRulesRspRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomRulesRspRuleListItem(DescribeCustomRulesRspRuleListItem source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.SortId != null) {
            this.SortId = new String(source.SortId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
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
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "CronType", this.CronType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

