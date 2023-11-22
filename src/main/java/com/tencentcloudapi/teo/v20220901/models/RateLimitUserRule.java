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

public class RateLimitUserRule extends AbstractModel {

    /**
    * The request threshold. Value range: 0-4294967294.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * The statistical period. The value can be 10, 20, 30, 40, 50, or 60 seconds.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * The rule name, which consists of only letters, digits, and underscores and cannot start with an underscore.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Action. Values:<li>`monitor`: Observe;</li><li>`drop`: Block;</li><li>`redirect`: Redirect;</li><li>`page`: Return a specific page;</li><li>`alg`: JavaScript challenge. </li>	
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The amount of time taken to perform the action. Value range: 0 seconds - 2 days.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * The time unit. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * The rule details.
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * The rule weight. Value range: 0-100.
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
    * The filter. Values:
<li>`sip`: Client IP</li>
This parameter is left empty by default.
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * Update time. It is only used as a response parameter, and defaults to the current time. 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Query scope. Values:
<li>`source_to_eo`: (Response) Traffic going from the origin to EdgeOne.</li>
<li>`client_to_eo`: (Request) Traffic going from the client to EdgeOne.</li>
Default: `source_to_eo`.
    */
    @SerializedName("FreqScope")
    @Expose
    private String [] FreqScope;

    /**
    * Name of the custom return page. It's required when `Action=page`.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
     * Get The request threshold. Value range: 0-4294967294. 
     * @return Threshold The request threshold. Value range: 0-4294967294.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set The request threshold. Value range: 0-4294967294.
     * @param Threshold The request threshold. Value range: 0-4294967294.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get The statistical period. The value can be 10, 20, 30, 40, 50, or 60 seconds. 
     * @return Period The statistical period. The value can be 10, 20, 30, 40, 50, or 60 seconds.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The statistical period. The value can be 10, 20, 30, 40, 50, or 60 seconds.
     * @param Period The statistical period. The value can be 10, 20, 30, 40, 50, or 60 seconds.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get The rule name, which consists of only letters, digits, and underscores and cannot start with an underscore. 
     * @return RuleName The rule name, which consists of only letters, digits, and underscores and cannot start with an underscore.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set The rule name, which consists of only letters, digits, and underscores and cannot start with an underscore.
     * @param RuleName The rule name, which consists of only letters, digits, and underscores and cannot start with an underscore.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Action. Values:<li>`monitor`: Observe;</li><li>`drop`: Block;</li><li>`redirect`: Redirect;</li><li>`page`: Return a specific page;</li><li>`alg`: JavaScript challenge. </li>	 
     * @return Action Action. Values:<li>`monitor`: Observe;</li><li>`drop`: Block;</li><li>`redirect`: Redirect;</li><li>`page`: Return a specific page;</li><li>`alg`: JavaScript challenge. </li>	
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Values:<li>`monitor`: Observe;</li><li>`drop`: Block;</li><li>`redirect`: Redirect;</li><li>`page`: Return a specific page;</li><li>`alg`: JavaScript challenge. </li>	
     * @param Action Action. Values:<li>`monitor`: Observe;</li><li>`drop`: Block;</li><li>`redirect`: Redirect;</li><li>`page`: Return a specific page;</li><li>`alg`: JavaScript challenge. </li>	
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The amount of time taken to perform the action. Value range: 0 seconds - 2 days. 
     * @return PunishTime The amount of time taken to perform the action. Value range: 0 seconds - 2 days.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set The amount of time taken to perform the action. Value range: 0 seconds - 2 days.
     * @param PunishTime The amount of time taken to perform the action. Value range: 0 seconds - 2 days.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get The time unit. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li> 
     * @return PunishTimeUnit The time unit. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set The time unit. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>
     * @param PunishTimeUnit The time unit. Values:
<li>`second`: Second</li>
<li>`minutes`: Minute</li>
<li>`hour`: Hour</li>
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on` 
     * @return RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
     * @param RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get The rule details. 
     * @return AclConditions The rule details.
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set The rule details.
     * @param AclConditions The rule details.
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get The rule weight. Value range: 0-100. 
     * @return RulePriority The rule weight. Value range: 0-100.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set The rule weight. Value range: 0-100.
     * @param RulePriority The rule weight. Value range: 0-100.
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
     * Get The filter. Values:
<li>`sip`: Client IP</li>
This parameter is left empty by default. 
     * @return FreqFields The filter. Values:
<li>`sip`: Client IP</li>
This parameter is left empty by default.
     */
    public String [] getFreqFields() {
        return this.FreqFields;
    }

    /**
     * Set The filter. Values:
<li>`sip`: Client IP</li>
This parameter is left empty by default.
     * @param FreqFields The filter. Values:
<li>`sip`: Client IP</li>
This parameter is left empty by default.
     */
    public void setFreqFields(String [] FreqFields) {
        this.FreqFields = FreqFields;
    }

    /**
     * Get Update time. It is only used as a response parameter, and defaults to the current time.  
     * @return UpdateTime Update time. It is only used as a response parameter, and defaults to the current time. 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. It is only used as a response parameter, and defaults to the current time. 
     * @param UpdateTime Update time. It is only used as a response parameter, and defaults to the current time. 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Query scope. Values:
<li>`source_to_eo`: (Response) Traffic going from the origin to EdgeOne.</li>
<li>`client_to_eo`: (Request) Traffic going from the client to EdgeOne.</li>
Default: `source_to_eo`. 
     * @return FreqScope Query scope. Values:
<li>`source_to_eo`: (Response) Traffic going from the origin to EdgeOne.</li>
<li>`client_to_eo`: (Request) Traffic going from the client to EdgeOne.</li>
Default: `source_to_eo`.
     */
    public String [] getFreqScope() {
        return this.FreqScope;
    }

    /**
     * Set Query scope. Values:
<li>`source_to_eo`: (Response) Traffic going from the origin to EdgeOne.</li>
<li>`client_to_eo`: (Request) Traffic going from the client to EdgeOne.</li>
Default: `source_to_eo`.
     * @param FreqScope Query scope. Values:
<li>`source_to_eo`: (Response) Traffic going from the origin to EdgeOne.</li>
<li>`client_to_eo`: (Request) Traffic going from the client to EdgeOne.</li>
Default: `source_to_eo`.
     */
    public void setFreqScope(String [] FreqScope) {
        this.FreqScope = FreqScope;
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

    public RateLimitUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitUserRule(RateLimitUserRule source) {
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
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
        if (source.FreqFields != null) {
            this.FreqFields = new String[source.FreqFields.length];
            for (int i = 0; i < source.FreqFields.length; i++) {
                this.FreqFields[i] = new String(source.FreqFields[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FreqScope != null) {
            this.FreqScope = new String[source.FreqScope.length];
            for (int i = 0; i < source.FreqScope.length; i++) {
                this.FreqScope[i] = new String(source.FreqScope[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "FreqFields.", this.FreqFields);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "FreqScope.", this.FreqScope);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CustomResponseId", this.CustomResponseId);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

