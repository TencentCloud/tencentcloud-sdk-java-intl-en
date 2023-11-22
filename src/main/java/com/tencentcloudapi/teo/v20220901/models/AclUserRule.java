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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclUserRule extends AbstractModel {

    /**
    * The rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * The action. Values:
<li>`trans`: Allow</li>
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`ban`: Block the IP</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * The custom rule.
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * The rule priority. Value range: 0-100.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * Rule ID, which is only used as an output parameter.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * The update time, which is only used as an output parameter.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * IP ban duration. Range: 0-2 days. It's required when `Action=ban`. 
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * The unit of the IP ban duration. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>Default value: `second`.
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * Name of the custom return page. It's required when `Action=page`.	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * (Disused) ID of the custom return page. The default value is 0, which means that the system default blocking page is used. 
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Action=page`.	
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
    * The response code to trigger the return page. It's required when `Action=page`. Value: 100-600. 3xx response codes are not supported. Default value: 567.
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

    /**
    * The redirection URL. It's required when `Action=redirect`.	
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get The rule name. 
     * @return RuleName The rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set The rule name.
     * @param RuleName The rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get The action. Values:
<li>`trans`: Allow</li>
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`ban`: Block the IP</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li> 
     * @return Action The action. Values:
<li>`trans`: Allow</li>
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`ban`: Block the IP</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action. Values:
<li>`trans`: Allow</li>
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`ban`: Block the IP</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
     * @param Action The action. Values:
<li>`trans`: Allow</li>
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`ban`: Block the IP</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li> 
     * @return RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
     * @param RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get The custom rule. 
     * @return AclConditions The custom rule.
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set The custom rule.
     * @param AclConditions The custom rule.
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get The rule priority. Value range: 0-100. 
     * @return RulePriority The rule priority. Value range: 0-100.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set The rule priority. Value range: 0-100.
     * @param RulePriority The rule priority. Value range: 0-100.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get Rule ID, which is only used as an output parameter. 
     * @return RuleID Rule ID, which is only used as an output parameter.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID, which is only used as an output parameter.
     * @param RuleID Rule ID, which is only used as an output parameter.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get The update time, which is only used as an output parameter. 
     * @return UpdateTime The update time, which is only used as an output parameter.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time, which is only used as an output parameter.
     * @param UpdateTime The update time, which is only used as an output parameter.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get IP ban duration. Range: 0-2 days. It's required when `Action=ban`.  
     * @return PunishTime IP ban duration. Range: 0-2 days. It's required when `Action=ban`. 
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set IP ban duration. Range: 0-2 days. It's required when `Action=ban`. 
     * @param PunishTime IP ban duration. Range: 0-2 days. It's required when `Action=ban`. 
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get The unit of the IP ban duration. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>Default value: `second`. 
     * @return PunishTimeUnit The unit of the IP ban duration. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>Default value: `second`.
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set The unit of the IP ban duration. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>Default value: `second`.
     * @param PunishTimeUnit The unit of the IP ban duration. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>Default value: `second`.
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get Name of the custom return page. It's required when `Action=page`.	 
     * @return Name Name of the custom return page. It's required when `Action=page`.	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the custom return page. It's required when `Action=page`.	
     * @param Name Name of the custom return page. It's required when `Action=page`.	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get (Disused) ID of the custom return page. The default value is 0, which means that the system default blocking page is used.  
     * @return PageId (Disused) ID of the custom return page. The default value is 0, which means that the system default blocking page is used. 
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set (Disused) ID of the custom return page. The default value is 0, which means that the system default blocking page is used. 
     * @param PageId (Disused) ID of the custom return page. The default value is 0, which means that the system default blocking page is used. 
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Action=page`.	 
     * @return CustomResponseId ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Action=page`.	
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Action=page`.	
     * @param CustomResponseId ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Action=page`.	
     */
    public void setCustomResponseId(String CustomResponseId) {
        this.CustomResponseId = CustomResponseId;
    }

    /**
     * Get The response code to trigger the return page. It's required when `Action=page`. Value: 100-600. 3xx response codes are not supported. Default value: 567. 
     * @return ResponseCode The response code to trigger the return page. It's required when `Action=page`. Value: 100-600. 3xx response codes are not supported. Default value: 567.
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set The response code to trigger the return page. It's required when `Action=page`. Value: 100-600. 3xx response codes are not supported. Default value: 567.
     * @param ResponseCode The response code to trigger the return page. It's required when `Action=page`. Value: 100-600. 3xx response codes are not supported. Default value: 567.
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get The redirection URL. It's required when `Action=redirect`.	 
     * @return RedirectUrl The redirection URL. It's required when `Action=redirect`.	
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set The redirection URL. It's required when `Action=redirect`.	
     * @param RedirectUrl The redirection URL. It's required when `Action=redirect`.	
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

