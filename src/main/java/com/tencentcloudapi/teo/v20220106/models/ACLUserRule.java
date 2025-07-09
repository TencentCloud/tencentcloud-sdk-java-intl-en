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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ACLUserRule extends AbstractModel {

    /**
    * Name of the rule
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Action
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Status of the rule
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * ACL rule
    */
    @SerializedName("Conditions")
    @Expose
    private ACLCondition [] Conditions;

    /**
    * Priority of the rule
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * IP blocking time unit
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * Redirection URL, which must be a subdomain name of the site
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * Return code configured on the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

    /**
     * Get Name of the rule 
     * @return RuleName Name of the rule
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Name of the rule
     * @param RuleName Name of the rule
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Action 
     * @return Action Action
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action
     * @param Action Action
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Status of the rule 
     * @return RuleStatus Status of the rule
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Status of the rule
     * @param RuleStatus Status of the rule
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get ACL rule 
     * @return Conditions ACL rule
     */
    public ACLCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set ACL rule
     * @param Conditions ACL rule
     */
    public void setConditions(ACLCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Priority of the rule 
     * @return RulePriority Priority of the rule
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set Priority of the rule
     * @param RulePriority Priority of the rule
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleID ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleID ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Update time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpdateTime Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpdateTime Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PunishTime IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PunishTime IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get IP blocking time unit
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PunishTimeUnit IP blocking time unit
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set IP blocking time unit
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PunishTimeUnit IP blocking time unit
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Name Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Name Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PageId ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PageId ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Redirection URL, which must be a subdomain name of the site
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RedirectUrl Redirection URL, which must be a subdomain name of the site
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Redirection URL, which must be a subdomain name of the site
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RedirectUrl Redirection URL, which must be a subdomain name of the site
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get Return code configured on the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ResponseCode Return code configured on the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set Return code configured on the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ResponseCode Return code configured on the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public ACLUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ACLUserRule(ACLUserRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.Conditions != null) {
            this.Conditions = new ACLCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ACLCondition(source.Conditions[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new Long(source.ResponseCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);

    }
}

