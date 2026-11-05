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

public class BrowserImpersonationDetectionRule extends AbstractModel {

    /**
    * ID of the browser spoofing identification rule.<br>You can perform different rule configuration operations by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BrowserImpersonationDetection parameter will be deleted.</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name of the browser spoofing identification rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to enable the browser forgery identification rule. Valid values: <li>on: enable;</li><li>off: disable.</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Specific content of the browser spoofing identification rule. It only supports the configuration of request Method, request Path, and request URL, which must comply with expression syntax. For detailed specifications, see the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
    */
    @SerializedName("Action")
    @Expose
    private BrowserImpersonationDetectionAction Action;

    /**
     * Get ID of the browser spoofing identification rule.<br>You can perform different rule configuration operations by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BrowserImpersonationDetection parameter will be deleted.</li> 
     * @return Id ID of the browser spoofing identification rule.<br>You can perform different rule configuration operations by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BrowserImpersonationDetection parameter will be deleted.</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID of the browser spoofing identification rule.<br>You can perform different rule configuration operations by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BrowserImpersonationDetection parameter will be deleted.</li>
     * @param Id ID of the browser spoofing identification rule.<br>You can perform different rule configuration operations by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the BrowserImpersonationDetection parameter will be deleted.</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Name of the browser spoofing identification rule. 
     * @return Name Name of the browser spoofing identification rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the browser spoofing identification rule.
     * @param Name Name of the browser spoofing identification rule.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to enable the browser forgery identification rule. Valid values: <li>on: enable;</li><li>off: disable.</li> 
     * @return Enabled Whether to enable the browser forgery identification rule. Valid values: <li>on: enable;</li><li>off: disable.</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable the browser forgery identification rule. Valid values: <li>on: enable;</li><li>off: disable.</li>
     * @param Enabled Whether to enable the browser forgery identification rule. Valid values: <li>on: enable;</li><li>off: disable.</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Specific content of the browser spoofing identification rule. It only supports the configuration of request Method, request Path, and request URL, which must comply with expression syntax. For detailed specifications, see the product document. 
     * @return Condition Specific content of the browser spoofing identification rule. It only supports the configuration of request Method, request Path, and request URL, which must comply with expression syntax. For detailed specifications, see the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Specific content of the browser spoofing identification rule. It only supports the configuration of request Method, request Path, and request URL, which must comply with expression syntax. For detailed specifications, see the product document.
     * @param Condition Specific content of the browser spoofing identification rule. It only supports the configuration of request Method, request Path, and request URL, which must comply with expression syntax. For detailed specifications, see the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration. 
     * @return Action Handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
     */
    public BrowserImpersonationDetectionAction getAction() {
        return this.Action;
    }

    /**
     * Set Handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
     * @param Action Handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
     */
    public void setAction(BrowserImpersonationDetectionAction Action) {
        this.Action = Action;
    }

    public BrowserImpersonationDetectionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowserImpersonationDetectionRule(BrowserImpersonationDetectionRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new BrowserImpersonationDetectionAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

