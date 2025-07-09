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

public class BotUserRule extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * The action. Values:
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`trans`: Allow</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
<li>`captcha`: Managed challenge</li>
<li>`random`: Handle the request randomly by the weight</li>
<li>`silence`: Keep the connection but do not response to the client</li>
<li>`shortdelay`: Add a short latency period</li>
<li>`longdelay`: Add a long latency period</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * Details of the rule.
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
    * [Currently unavailable] Specify the random action and percentage.
    */
    @SerializedName("ExtendActions")
    @Expose
    private BotExtendAction [] ExtendActions;

    /**
    * The filter. Values:
<li>`sip`: Client IP</li>
This parameter is left empty by default.
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * The update time, which is only used as an output parameter.
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
     * Get  
     * @return RuleName 
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 
     * @param RuleName 
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get The action. Values:
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`trans`: Allow</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
<li>`captcha`: Managed challenge</li>
<li>`random`: Handle the request randomly by the weight</li>
<li>`silence`: Keep the connection but do not response to the client</li>
<li>`shortdelay`: Add a short latency period</li>
<li>`longdelay`: Add a long latency period</li> 
     * @return Action The action. Values:
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`trans`: Allow</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
<li>`captcha`: Managed challenge</li>
<li>`random`: Handle the request randomly by the weight</li>
<li>`silence`: Keep the connection but do not response to the client</li>
<li>`shortdelay`: Add a short latency period</li>
<li>`longdelay`: Add a long latency period</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action. Values:
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`trans`: Allow</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
<li>`captcha`: Managed challenge</li>
<li>`random`: Handle the request randomly by the weight</li>
<li>`silence`: Keep the connection but do not response to the client</li>
<li>`shortdelay`: Add a short latency period</li>
<li>`longdelay`: Add a long latency period</li>
     * @param Action The action. Values:
<li>`drop`: Block the request</li>
<li>`monitor`: Observe</li>
<li>`trans`: Allow</li>
<li>`redirect`: Redirect the request</li>
<li>`page`: Return the specified page</li>
<li>`alg`: JavaScript challenge</li>
<li>`captcha`: Managed challenge</li>
<li>`random`: Handle the request randomly by the weight</li>
<li>`silence`: Keep the connection but do not response to the client</li>
<li>`shortdelay`: Add a short latency period</li>
<li>`longdelay`: Add a long latency period</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
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
     * Get Details of the rule. 
     * @return AclConditions Details of the rule.
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set Details of the rule.
     * @param AclConditions Details of the rule.
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
     * Get [Currently unavailable] Specify the random action and percentage. 
     * @return ExtendActions [Currently unavailable] Specify the random action and percentage.
     */
    public BotExtendAction [] getExtendActions() {
        return this.ExtendActions;
    }

    /**
     * Set [Currently unavailable] Specify the random action and percentage.
     * @param ExtendActions [Currently unavailable] Specify the random action and percentage.
     */
    public void setExtendActions(BotExtendAction [] ExtendActions) {
        this.ExtendActions = ExtendActions;
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

    public BotUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotUserRule(BotUserRule source) {
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
        if (source.ExtendActions != null) {
            this.ExtendActions = new BotExtendAction[source.ExtendActions.length];
            for (int i = 0; i < source.ExtendActions.length; i++) {
                this.ExtendActions[i] = new BotExtendAction(source.ExtendActions[i]);
            }
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
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArrayObj(map, prefix + "ExtendActions.", this.ExtendActions);
        this.setParamArraySimple(map, prefix + "FreqFields.", this.FreqFields);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "FreqScope.", this.FreqScope);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CustomResponseId", this.CustomResponseId);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

