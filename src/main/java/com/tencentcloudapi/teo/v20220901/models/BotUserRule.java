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
    * Rule name can only contain English characters, digits, and underscores, and cannot begin with an underscore.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Disposal actions. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>trans: pass;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: Random disposal;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Not effective.</li>Default on takes effect.
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * Rule details.
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * Rule weight. Value range: 0-100.
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
    * Disposal method and proportion of random disposal. Optional for non-random disposal. Not currently supported.
    */
    @SerializedName("ExtendActions")
    @Expose
    private BotExtendAction [] ExtendActions;

    /**
    * Filter word. Valid values:
<li>sip: Client IP.</li>
Defaults to an empty string.
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * Update time. For output usage only.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Statistical scope. Valid values:
<li>source_to_eo: (Response) Origin server to EdgeOne;</li>
<li>client_to_eo: (request) Client to EdgeOne.</li>
Default value: source_to_eo.
    */
    @SerializedName("FreqScope")
    @Expose
    private String [] FreqScope;

    /**
    * Name of the custom return page. Required when Action is page, and cannot be empty.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Custom response Id, which can be obtained through the customized error page list interface. The default value is `default`, which uses the system default page. Required and cannot be empty when Action is `page`.	
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
    * Custom response code for the return to page. Required when Action is page, and cannot be empty. Value range: 100–600. 3xx response codes are not supported. Default value: 567.
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
     * Get Rule name can only contain English characters, digits, and underscores, and cannot begin with an underscore. 
     * @return RuleName Rule name can only contain English characters, digits, and underscores, and cannot begin with an underscore.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name can only contain English characters, digits, and underscores, and cannot begin with an underscore.
     * @param RuleName Rule name can only contain English characters, digits, and underscores, and cannot begin with an underscore.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Disposal actions. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>trans: pass;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: Random disposal;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li> 
     * @return Action Disposal actions. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>trans: pass;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: Random disposal;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Disposal actions. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>trans: pass;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: Random disposal;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
     * @param Action Disposal actions. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>trans: pass;</li>
<li>redirect: Redirection;</li>
<li>page: Specified page;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: Random disposal;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Not effective.</li>Default on takes effect. 
     * @return RuleStatus Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Not effective.</li>Default on takes effect.
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Not effective.</li>Default on takes effect.
     * @param RuleStatus Rule status. Valid values:
<li>`on`: Take effect;</li>
<li>off: Not effective.</li>Default on takes effect.
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Rule details. 
     * @return AclConditions Rule details.
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set Rule details.
     * @param AclConditions Rule details.
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get Rule weight. Value range: 0-100. 
     * @return RulePriority Rule weight. Value range: 0-100.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set Rule weight. Value range: 0-100.
     * @param RulePriority Rule weight. Value range: 0-100.
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
     * Get Disposal method and proportion of random disposal. Optional for non-random disposal. Not currently supported. 
     * @return ExtendActions Disposal method and proportion of random disposal. Optional for non-random disposal. Not currently supported.
     */
    public BotExtendAction [] getExtendActions() {
        return this.ExtendActions;
    }

    /**
     * Set Disposal method and proportion of random disposal. Optional for non-random disposal. Not currently supported.
     * @param ExtendActions Disposal method and proportion of random disposal. Optional for non-random disposal. Not currently supported.
     */
    public void setExtendActions(BotExtendAction [] ExtendActions) {
        this.ExtendActions = ExtendActions;
    }

    /**
     * Get Filter word. Valid values:
<li>sip: Client IP.</li>
Defaults to an empty string. 
     * @return FreqFields Filter word. Valid values:
<li>sip: Client IP.</li>
Defaults to an empty string.
     */
    public String [] getFreqFields() {
        return this.FreqFields;
    }

    /**
     * Set Filter word. Valid values:
<li>sip: Client IP.</li>
Defaults to an empty string.
     * @param FreqFields Filter word. Valid values:
<li>sip: Client IP.</li>
Defaults to an empty string.
     */
    public void setFreqFields(String [] FreqFields) {
        this.FreqFields = FreqFields;
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
     * Get Statistical scope. Valid values:
<li>source_to_eo: (Response) Origin server to EdgeOne;</li>
<li>client_to_eo: (request) Client to EdgeOne.</li>
Default value: source_to_eo. 
     * @return FreqScope Statistical scope. Valid values:
<li>source_to_eo: (Response) Origin server to EdgeOne;</li>
<li>client_to_eo: (request) Client to EdgeOne.</li>
Default value: source_to_eo.
     */
    public String [] getFreqScope() {
        return this.FreqScope;
    }

    /**
     * Set Statistical scope. Valid values:
<li>source_to_eo: (Response) Origin server to EdgeOne;</li>
<li>client_to_eo: (request) Client to EdgeOne.</li>
Default value: source_to_eo.
     * @param FreqScope Statistical scope. Valid values:
<li>source_to_eo: (Response) Origin server to EdgeOne;</li>
<li>client_to_eo: (request) Client to EdgeOne.</li>
Default value: source_to_eo.
     */
    public void setFreqScope(String [] FreqScope) {
        this.FreqScope = FreqScope;
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
     * Get Custom response Id, which can be obtained through the customized error page list interface. The default value is `default`, which uses the system default page. Required and cannot be empty when Action is `page`.	 
     * @return CustomResponseId Custom response Id, which can be obtained through the customized error page list interface. The default value is `default`, which uses the system default page. Required and cannot be empty when Action is `page`.	
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set Custom response Id, which can be obtained through the customized error page list interface. The default value is `default`, which uses the system default page. Required and cannot be empty when Action is `page`.	
     * @param CustomResponseId Custom response Id, which can be obtained through the customized error page list interface. The default value is `default`, which uses the system default page. Required and cannot be empty when Action is `page`.	
     */
    public void setCustomResponseId(String CustomResponseId) {
        this.CustomResponseId = CustomResponseId;
    }

    /**
     * Get Custom response code for the return to page. Required when Action is page, and cannot be empty. Value range: 100–600. 3xx response codes are not supported. Default value: 567. 
     * @return ResponseCode Custom response code for the return to page. Required when Action is page, and cannot be empty. Value range: 100–600. 3xx response codes are not supported. Default value: 567.
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set Custom response code for the return to page. Required when Action is page, and cannot be empty. Value range: 100–600. 3xx response codes are not supported. Default value: 567.
     * @param ResponseCode Custom response code for the return to page. Required when Action is page, and cannot be empty. Value range: 100–600. 3xx response codes are not supported. Default value: 567.
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

