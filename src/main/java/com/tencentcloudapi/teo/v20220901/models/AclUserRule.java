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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclUserRule extends AbstractModel {

    /**
    * Rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Penalty action. Valid values:
<li>trans: pass;</li>
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>ban: IP block;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Disable.</li>
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * Custom rule.
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * Rule priority. Value range: 0-100.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * Rule Id. Output only.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Update time. For output usage only.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Penalty duration for ip blocking. Required when Action is ban. It cannot be empty and the value ranges from 0 to 2 days.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * Penalty time unit for ip blocking. Valid values:
<li>second: second;</li>
<li>minutes: minute;</li>
<li>hour: hour.</li>Default: second.
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * Name of the custom return page. Required when Action is page, and cannot be empty.	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Instance Id for the custom return page. Default value: 0, which means the system default blocking page is used. This parameter is deprecated.
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * Custom response Id, which can be obtained through the API for querying the custom error page list. The default value is default, which uses the system default page. Required and cannot be empty when Action is page.	
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
    * code of the custom return page. Required when Action is page. The value cannot be empty. Value range: 100-600. 3xx response codes are unsupported. Default value: 567.
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

    /**
    * Address for redirection. Required when Action is `redirect` and cannot be empty.	
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get Rule name. 
     * @return RuleName Rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name.
     * @param RuleName Rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Penalty action. Valid values:
<li>trans: pass;</li>
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>ban: IP block;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge.</li> 
     * @return Action Penalty action. Valid values:
<li>trans: pass;</li>
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>ban: IP block;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Penalty action. Valid values:
<li>trans: pass;</li>
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>ban: IP block;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge.</li>
     * @param Action Penalty action. Valid values:
<li>trans: pass;</li>
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>ban: IP block;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Disable.</li> 
     * @return RuleStatus Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Disable.</li>
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Disable.</li>
     * @param RuleStatus Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Disable.</li>
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Custom rule. 
     * @return AclConditions Custom rule.
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set Custom rule.
     * @param AclConditions Custom rule.
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get Rule priority. Value range: 0-100. 
     * @return RulePriority Rule priority. Value range: 0-100.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set Rule priority. Value range: 0-100.
     * @param RulePriority Rule priority. Value range: 0-100.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get Rule Id. Output only. 
     * @return RuleID Rule Id. Output only.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule Id. Output only.
     * @param RuleID Rule Id. Output only.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Update time. For output usage only. 
     * @return UpdateTime Update time. For output usage only.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. For output usage only.
     * @param UpdateTime Update time. For output usage only.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Penalty duration for ip blocking. Required when Action is ban. It cannot be empty and the value ranges from 0 to 2 days. 
     * @return PunishTime Penalty duration for ip blocking. Required when Action is ban. It cannot be empty and the value ranges from 0 to 2 days.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set Penalty duration for ip blocking. Required when Action is ban. It cannot be empty and the value ranges from 0 to 2 days.
     * @param PunishTime Penalty duration for ip blocking. Required when Action is ban. It cannot be empty and the value ranges from 0 to 2 days.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get Penalty time unit for ip blocking. Valid values:
<li>second: second;</li>
<li>minutes: minute;</li>
<li>hour: hour.</li>Default: second. 
     * @return PunishTimeUnit Penalty time unit for ip blocking. Valid values:
<li>second: second;</li>
<li>minutes: minute;</li>
<li>hour: hour.</li>Default: second.
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set Penalty time unit for ip blocking. Valid values:
<li>second: second;</li>
<li>minutes: minute;</li>
<li>hour: hour.</li>Default: second.
     * @param PunishTimeUnit Penalty time unit for ip blocking. Valid values:
<li>second: second;</li>
<li>minutes: minute;</li>
<li>hour: hour.</li>Default: second.
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get Name of the custom return page. Required when Action is page, and cannot be empty.	 
     * @return Name Name of the custom return page. Required when Action is page, and cannot be empty.	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the custom return page. Required when Action is page, and cannot be empty.	
     * @param Name Name of the custom return page. Required when Action is page, and cannot be empty.	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Instance Id for the custom return page. Default value: 0, which means the system default blocking page is used. This parameter is deprecated. 
     * @return PageId Instance Id for the custom return page. Default value: 0, which means the system default blocking page is used. This parameter is deprecated.
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set Instance Id for the custom return page. Default value: 0, which means the system default blocking page is used. This parameter is deprecated.
     * @param PageId Instance Id for the custom return page. Default value: 0, which means the system default blocking page is used. This parameter is deprecated.
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Custom response Id, which can be obtained through the API for querying the custom error page list. The default value is default, which uses the system default page. Required and cannot be empty when Action is page.	 
     * @return CustomResponseId Custom response Id, which can be obtained through the API for querying the custom error page list. The default value is default, which uses the system default page. Required and cannot be empty when Action is page.	
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set Custom response Id, which can be obtained through the API for querying the custom error page list. The default value is default, which uses the system default page. Required and cannot be empty when Action is page.	
     * @param CustomResponseId Custom response Id, which can be obtained through the API for querying the custom error page list. The default value is default, which uses the system default page. Required and cannot be empty when Action is page.	
     */
    public void setCustomResponseId(String CustomResponseId) {
        this.CustomResponseId = CustomResponseId;
    }

    /**
     * Get code of the custom return page. Required when Action is page. The value cannot be empty. Value range: 100-600. 3xx response codes are unsupported. Default value: 567. 
     * @return ResponseCode code of the custom return page. Required when Action is page. The value cannot be empty. Value range: 100-600. 3xx response codes are unsupported. Default value: 567.
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set code of the custom return page. Required when Action is page. The value cannot be empty. Value range: 100-600. 3xx response codes are unsupported. Default value: 567.
     * @param ResponseCode code of the custom return page. Required when Action is page. The value cannot be empty. Value range: 100-600. 3xx response codes are unsupported. Default value: 567.
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get Address for redirection. Required when Action is `redirect` and cannot be empty.	 
     * @return RedirectUrl Address for redirection. Required when Action is `redirect` and cannot be empty.	
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Address for redirection. Required when Action is `redirect` and cannot be empty.	
     * @param RedirectUrl Address for redirection. Required when Action is `redirect` and cannot be empty.	
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    public AclUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclUserRule(AclUserRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.AclConditions != null) {
            this.AclConditions = new AclCondition[source.AclConditions.length];
            for (int i = 0; i < source.AclConditions.length; i++) {
                this.AclConditions[i] = new AclCondition(source.AclConditions[i]);
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
        if (source.CustomResponseId != null) {
            this.CustomResponseId = new String(source.CustomResponseId);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new Long(source.ResponseCode);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "CustomResponseId", this.CustomResponseId);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

