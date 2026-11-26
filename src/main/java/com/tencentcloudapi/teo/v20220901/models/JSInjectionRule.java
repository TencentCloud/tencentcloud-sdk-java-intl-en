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

public class JSInjectionRule extends AbstractModel {

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule priority. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Match condition content. It must comply with the expression syntax. For detailed specifications, see the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * JavaScript injection options. Default value: run-attestations. Valid values:
<li> no-injection: Do not inject JavaScript;</li>
<li> inject-sdk-only: Inject the SDKs of all currently supported authentication methods, including TC-RCE and TC-CAPTCHA. Note: To execute authentication detection, configure challenge rules.</li>

    */
    @SerializedName("InjectJS")
    @Expose
    private String InjectJS;

    /**
     * Get Rule ID. 
     * @return RuleId Rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID.
     * @param RuleId Rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name. 
     * @return Name Rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name.
     * @param Name Rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule priority. A smaller value indicates higher priority. Value range: 0-100. Default value: 0. 
     * @return Priority Rule priority. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.
     * @param Priority Rule priority. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Match condition content. It must comply with the expression syntax. For detailed specifications, see the product document. 
     * @return Condition Match condition content. It must comply with the expression syntax. For detailed specifications, see the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Match condition content. It must comply with the expression syntax. For detailed specifications, see the product document.
     * @param Condition Match condition content. It must comply with the expression syntax. For detailed specifications, see the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get JavaScript injection options. Default value: run-attestations. Valid values:
<li> no-injection: Do not inject JavaScript;</li>
<li> inject-sdk-only: Inject the SDKs of all currently supported authentication methods, including TC-RCE and TC-CAPTCHA. Note: To execute authentication detection, configure challenge rules.</li>
 
     * @return InjectJS JavaScript injection options. Default value: run-attestations. Valid values:
<li> no-injection: Do not inject JavaScript;</li>
<li> inject-sdk-only: Inject the SDKs of all currently supported authentication methods, including TC-RCE and TC-CAPTCHA. Note: To execute authentication detection, configure challenge rules.</li>

     */
    public String getInjectJS() {
        return this.InjectJS;
    }

    /**
     * Set JavaScript injection options. Default value: run-attestations. Valid values:
<li> no-injection: Do not inject JavaScript;</li>
<li> inject-sdk-only: Inject the SDKs of all currently supported authentication methods, including TC-RCE and TC-CAPTCHA. Note: To execute authentication detection, configure challenge rules.</li>

     * @param InjectJS JavaScript injection options. Default value: run-attestations. Valid values:
<li> no-injection: Do not inject JavaScript;</li>
<li> inject-sdk-only: Inject the SDKs of all currently supported authentication methods, including TC-RCE and TC-CAPTCHA. Note: To execute authentication detection, configure challenge rules.</li>

     */
    public void setInjectJS(String InjectJS) {
        this.InjectJS = InjectJS;
    }

    public JSInjectionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JSInjectionRule(JSInjectionRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.InjectJS != null) {
            this.InjectJS = new String(source.InjectJS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "InjectJS", this.InjectJS);

    }
}

