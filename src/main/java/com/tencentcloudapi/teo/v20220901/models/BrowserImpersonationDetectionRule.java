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
    * Browser spoofing identification rule ID. rule ID supports different rule configuration operations: <li> <b>add</b> a new rule: ID is empty or without specifying the ID parameter;</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list of the BrowserImpersonationDetection parameter will be deleted.</li>.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies the name of the browser spoofing identification rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether browser spoofing detection is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Specifies the specific content of browser spoofing identification rules, which only support configuration of request Method (Method), request Path (Path), and request URL, and must comply with expression grammar. for detailed specifications, please refer to the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Describes the handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
    */
    @SerializedName("Action")
    @Expose
    private BrowserImpersonationDetectionAction Action;

    /**
     * Get Browser spoofing identification rule ID. rule ID supports different rule configuration operations: <li> <b>add</b> a new rule: ID is empty or without specifying the ID parameter;</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list of the BrowserImpersonationDetection parameter will be deleted.</li>. 
     * @return Id Browser spoofing identification rule ID. rule ID supports different rule configuration operations: <li> <b>add</b> a new rule: ID is empty or without specifying the ID parameter;</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list of the BrowserImpersonationDetection parameter will be deleted.</li>.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Browser spoofing identification rule ID. rule ID supports different rule configuration operations: <li> <b>add</b> a new rule: ID is empty or without specifying the ID parameter;</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list of the BrowserImpersonationDetection parameter will be deleted.</li>.
     * @param Id Browser spoofing identification rule ID. rule ID supports different rule configuration operations: <li> <b>add</b> a new rule: ID is empty or without specifying the ID parameter;</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list of the BrowserImpersonationDetection parameter will be deleted.</li>.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the name of the browser spoofing identification rule. 
     * @return Name Specifies the name of the browser spoofing identification rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the name of the browser spoofing identification rule.
     * @param Name Specifies the name of the browser spoofing identification rule.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether browser spoofing detection is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>. 
     * @return Enabled Whether browser spoofing detection is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether browser spoofing detection is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
     * @param Enabled Whether browser spoofing detection is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Specifies the specific content of browser spoofing identification rules, which only support configuration of request Method (Method), request Path (Path), and request URL, and must comply with expression grammar. for detailed specifications, please refer to the product document. 
     * @return Condition Specifies the specific content of browser spoofing identification rules, which only support configuration of request Method (Method), request Path (Path), and request URL, and must comply with expression grammar. for detailed specifications, please refer to the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Specifies the specific content of browser spoofing identification rules, which only support configuration of request Method (Method), request Path (Path), and request URL, and must comply with expression grammar. for detailed specifications, please refer to the product document.
     * @param Condition Specifies the specific content of browser spoofing identification rules, which only support configuration of request Method (Method), request Path (Path), and request URL, and must comply with expression grammar. for detailed specifications, please refer to the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Describes the handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration. 
     * @return Action Describes the handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
     */
    public BrowserImpersonationDetectionAction getAction() {
        return this.Action;
    }

    /**
     * Set Describes the handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
     * @param Action Describes the handling method for browser spoofing identification rules, including Cookie verification, session tracking configuration, and client behavior validation configuration.
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

