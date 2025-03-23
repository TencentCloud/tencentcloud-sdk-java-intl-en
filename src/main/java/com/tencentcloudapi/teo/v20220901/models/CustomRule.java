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

public class CustomRule extends AbstractModel {

    /**
    * The custom rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The specifics of the custom rule, must comply with the expression grammar, please refer to product documentation for details.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Action for custom rules. The Name parameter of SecurityAction supports: <li>`Deny`: block;</li> <li>`Monitor`: observe;</li> <li>`ReturnCustomPage`: block with customized page;</li> <li>`Redirect`: Redirect to URL;</li> <li>`BlockIP`: IP blocking;</li> <li>`JSChallenge`: JavaScript challenge;</li> <li>`ManagedChallenge`: managed challenge;</li> <li>`Allow`: Allow.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * The custom rule status. Values: <li>`on`: enabled</li> <li>`off`: disabled</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Custom rule ID. <br>Different rule configuration operations are supported by rule ID : <br> - Add a new rule: ID is empty or the ID parameter is not specified; <br> - Modify an existing rule: specify the rule ID that needs to be updated/modified; <br> - Delete an existing rule: existing rules not included in the Rules parameter will be deleted.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Type of custom rule. Values: <li>`BasicAccessRule`: basic access control;</li> <li>`PreciseMatchRule`: exact custom rule, default;</li> <li>`ManagedAccessRule`: expert customized rule, output parameter only.</li>The default value is PreciseMatchRule.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Customize the priority of custom rule. Range: 0-100, the default value is 0, this parameter only supports PreciseMatchRule.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get The custom rule name. 
     * @return Name The custom rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The custom rule name.
     * @param Name The custom rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The specifics of the custom rule, must comply with the expression grammar, please refer to product documentation for details. 
     * @return Condition The specifics of the custom rule, must comply with the expression grammar, please refer to product documentation for details.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set The specifics of the custom rule, must comply with the expression grammar, please refer to product documentation for details.
     * @param Condition The specifics of the custom rule, must comply with the expression grammar, please refer to product documentation for details.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Action for custom rules. The Name parameter of SecurityAction supports: <li>`Deny`: block;</li> <li>`Monitor`: observe;</li> <li>`ReturnCustomPage`: block with customized page;</li> <li>`Redirect`: Redirect to URL;</li> <li>`BlockIP`: IP blocking;</li> <li>`JSChallenge`: JavaScript challenge;</li> <li>`ManagedChallenge`: managed challenge;</li> <li>`Allow`: Allow.</li>. 
     * @return Action Action for custom rules. The Name parameter of SecurityAction supports: <li>`Deny`: block;</li> <li>`Monitor`: observe;</li> <li>`ReturnCustomPage`: block with customized page;</li> <li>`Redirect`: Redirect to URL;</li> <li>`BlockIP`: IP blocking;</li> <li>`JSChallenge`: JavaScript challenge;</li> <li>`ManagedChallenge`: managed challenge;</li> <li>`Allow`: Allow.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Action for custom rules. The Name parameter of SecurityAction supports: <li>`Deny`: block;</li> <li>`Monitor`: observe;</li> <li>`ReturnCustomPage`: block with customized page;</li> <li>`Redirect`: Redirect to URL;</li> <li>`BlockIP`: IP blocking;</li> <li>`JSChallenge`: JavaScript challenge;</li> <li>`ManagedChallenge`: managed challenge;</li> <li>`Allow`: Allow.</li>.
     * @param Action Action for custom rules. The Name parameter of SecurityAction supports: <li>`Deny`: block;</li> <li>`Monitor`: observe;</li> <li>`ReturnCustomPage`: block with customized page;</li> <li>`Redirect`: Redirect to URL;</li> <li>`BlockIP`: IP blocking;</li> <li>`JSChallenge`: JavaScript challenge;</li> <li>`ManagedChallenge`: managed challenge;</li> <li>`Allow`: Allow.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get The custom rule status. Values: <li>`on`: enabled</li> <li>`off`: disabled</li>. 
     * @return Enabled The custom rule status. Values: <li>`on`: enabled</li> <li>`off`: disabled</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set The custom rule status. Values: <li>`on`: enabled</li> <li>`off`: disabled</li>.
     * @param Enabled The custom rule status. Values: <li>`on`: enabled</li> <li>`off`: disabled</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Custom rule ID. <br>Different rule configuration operations are supported by rule ID : <br> - Add a new rule: ID is empty or the ID parameter is not specified; <br> - Modify an existing rule: specify the rule ID that needs to be updated/modified; <br> - Delete an existing rule: existing rules not included in the Rules parameter will be deleted. 
     * @return Id Custom rule ID. <br>Different rule configuration operations are supported by rule ID : <br> - Add a new rule: ID is empty or the ID parameter is not specified; <br> - Modify an existing rule: specify the rule ID that needs to be updated/modified; <br> - Delete an existing rule: existing rules not included in the Rules parameter will be deleted.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Custom rule ID. <br>Different rule configuration operations are supported by rule ID : <br> - Add a new rule: ID is empty or the ID parameter is not specified; <br> - Modify an existing rule: specify the rule ID that needs to be updated/modified; <br> - Delete an existing rule: existing rules not included in the Rules parameter will be deleted.
     * @param Id Custom rule ID. <br>Different rule configuration operations are supported by rule ID : <br> - Add a new rule: ID is empty or the ID parameter is not specified; <br> - Modify an existing rule: specify the rule ID that needs to be updated/modified; <br> - Delete an existing rule: existing rules not included in the Rules parameter will be deleted.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Type of custom rule. Values: <li>`BasicAccessRule`: basic access control;</li> <li>`PreciseMatchRule`: exact custom rule, default;</li> <li>`ManagedAccessRule`: expert customized rule, output parameter only.</li>The default value is PreciseMatchRule. 
     * @return RuleType Type of custom rule. Values: <li>`BasicAccessRule`: basic access control;</li> <li>`PreciseMatchRule`: exact custom rule, default;</li> <li>`ManagedAccessRule`: expert customized rule, output parameter only.</li>The default value is PreciseMatchRule.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Type of custom rule. Values: <li>`BasicAccessRule`: basic access control;</li> <li>`PreciseMatchRule`: exact custom rule, default;</li> <li>`ManagedAccessRule`: expert customized rule, output parameter only.</li>The default value is PreciseMatchRule.
     * @param RuleType Type of custom rule. Values: <li>`BasicAccessRule`: basic access control;</li> <li>`PreciseMatchRule`: exact custom rule, default;</li> <li>`ManagedAccessRule`: expert customized rule, output parameter only.</li>The default value is PreciseMatchRule.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Customize the priority of custom rule. Range: 0-100, the default value is 0, this parameter only supports PreciseMatchRule. 
     * @return Priority Customize the priority of custom rule. Range: 0-100, the default value is 0, this parameter only supports PreciseMatchRule.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Customize the priority of custom rule. Range: 0-100, the default value is 0, this parameter only supports PreciseMatchRule.
     * @param Priority Customize the priority of custom rule. Range: 0-100, the default value is 0, this parameter only supports PreciseMatchRule.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRule(CustomRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

