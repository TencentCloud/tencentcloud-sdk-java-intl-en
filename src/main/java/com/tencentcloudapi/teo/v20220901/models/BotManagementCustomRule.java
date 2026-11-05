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

public class BotManagementCustomRule extends AbstractModel {

    /**
    * <p>ID of the bot custom rule.<br>Different rule configuration operations are supported via the rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BotManagementCustomRules parameter will be deleted.</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Name of the Bot custom rule.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Whether the custom Bot rule is enabled. Valid values: <li>on: enable;</li><li>off: disable.</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>Priority of Bot custom rules, ranging from 1 to 100, with a default value of 50.</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>For specific content of the Bot custom rule, it must comply with the expression grammar. For detailed specifications, see the product document.</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>List of safe execution actions by weight assignment.</p>
    */
    @SerializedName("Action")
    @Expose
    private SecurityWeightedAction [] Action;

    /**
     * Get <p>ID of the bot custom rule.<br>Different rule configuration operations are supported via the rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BotManagementCustomRules parameter will be deleted.</li></p> 
     * @return Id <p>ID of the bot custom rule.<br>Different rule configuration operations are supported via the rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BotManagementCustomRules parameter will be deleted.</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>ID of the bot custom rule.<br>Different rule configuration operations are supported via the rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BotManagementCustomRules parameter will be deleted.</li></p>
     * @param Id <p>ID of the bot custom rule.<br>Different rule configuration operations are supported via the rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BotManagementCustomRules parameter will be deleted.</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Name of the Bot custom rule.</p> 
     * @return Name <p>Name of the Bot custom rule.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name of the Bot custom rule.</p>
     * @param Name <p>Name of the Bot custom rule.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Whether the custom Bot rule is enabled. Valid values: <li>on: enable;</li><li>off: disable.</li></p> 
     * @return Enabled <p>Whether the custom Bot rule is enabled. Valid values: <li>on: enable;</li><li>off: disable.</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether the custom Bot rule is enabled. Valid values: <li>on: enable;</li><li>off: disable.</li></p>
     * @param Enabled <p>Whether the custom Bot rule is enabled. Valid values: <li>on: enable;</li><li>off: disable.</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Priority of Bot custom rules, ranging from 1 to 100, with a default value of 50.</p> 
     * @return Priority <p>Priority of Bot custom rules, ranging from 1 to 100, with a default value of 50.</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>Priority of Bot custom rules, ranging from 1 to 100, with a default value of 50.</p>
     * @param Priority <p>Priority of Bot custom rules, ranging from 1 to 100, with a default value of 50.</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>For specific content of the Bot custom rule, it must comply with the expression grammar. For detailed specifications, see the product document.</p> 
     * @return Condition <p>For specific content of the Bot custom rule, it must comply with the expression grammar. For detailed specifications, see the product document.</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>For specific content of the Bot custom rule, it must comply with the expression grammar. For detailed specifications, see the product document.</p>
     * @param Condition <p>For specific content of the Bot custom rule, it must comply with the expression grammar. For detailed specifications, see the product document.</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>List of safe execution actions by weight assignment.</p> 
     * @return Action <p>List of safe execution actions by weight assignment.</p>
     */
    public SecurityWeightedAction [] getAction() {
        return this.Action;
    }

    /**
     * Set <p>List of safe execution actions by weight assignment.</p>
     * @param Action <p>List of safe execution actions by weight assignment.</p>
     */
    public void setAction(SecurityWeightedAction [] Action) {
        this.Action = Action;
    }

    public BotManagementCustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementCustomRule(BotManagementCustomRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new SecurityWeightedAction[source.Action.length];
            for (int i = 0; i < source.Action.length; i++) {
                this.Action[i] = new SecurityWeightedAction(source.Action[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "Action.", this.Action);

    }
}

