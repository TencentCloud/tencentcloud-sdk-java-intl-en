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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySpartaProtectionModeRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 0 is for modifying the Rule Engine Status; 1 is for modifying the AI Status
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception 
     * @return Mode Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
     * @param Mode Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default. 
     * @return Edition Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
     * @param Edition Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 0 is for modifying the Rule Engine Status; 1 is for modifying the AI Status 
     * @return Type 0 is for modifying the Rule Engine Status; 1 is for modifying the AI Status
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 is for modifying the Rule Engine Status; 1 is for modifying the AI Status
     * @param Type 0 is for modifying the Rule Engine Status; 1 is for modifying the AI Status
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModifySpartaProtectionModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySpartaProtectionModeRequest(ModifySpartaProtectionModeRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

