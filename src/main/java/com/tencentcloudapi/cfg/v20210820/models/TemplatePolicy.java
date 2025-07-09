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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplatePolicy extends AbstractModel {

    /**
    * Protection policy ID list
    */
    @SerializedName("TemplatePolicyIdList")
    @Expose
    private String [] TemplatePolicyIdList;

    /**
    * Policy rules
    */
    @SerializedName("TemplatePolicyRule")
    @Expose
    private String TemplatePolicyRule;

    /**
    * Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
    */
    @SerializedName("TemplatePolicyDealType")
    @Expose
    private Long TemplatePolicyDealType;

    /**
     * Get Protection policy ID list 
     * @return TemplatePolicyIdList Protection policy ID list
     */
    public String [] getTemplatePolicyIdList() {
        return this.TemplatePolicyIdList;
    }

    /**
     * Set Protection policy ID list
     * @param TemplatePolicyIdList Protection policy ID list
     */
    public void setTemplatePolicyIdList(String [] TemplatePolicyIdList) {
        this.TemplatePolicyIdList = TemplatePolicyIdList;
    }

    /**
     * Get Policy rules 
     * @return TemplatePolicyRule Policy rules
     */
    public String getTemplatePolicyRule() {
        return this.TemplatePolicyRule;
    }

    /**
     * Set Policy rules
     * @param TemplatePolicyRule Policy rules
     */
    public void setTemplatePolicyRule(String TemplatePolicyRule) {
        this.TemplatePolicyRule = TemplatePolicyRule;
    }

    /**
     * Get Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing. 
     * @return TemplatePolicyDealType Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
     */
    public Long getTemplatePolicyDealType() {
        return this.TemplatePolicyDealType;
    }

    /**
     * Set Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
     * @param TemplatePolicyDealType Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
     */
    public void setTemplatePolicyDealType(Long TemplatePolicyDealType) {
        this.TemplatePolicyDealType = TemplatePolicyDealType;
    }

    public TemplatePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplatePolicy(TemplatePolicy source) {
        if (source.TemplatePolicyIdList != null) {
            this.TemplatePolicyIdList = new String[source.TemplatePolicyIdList.length];
            for (int i = 0; i < source.TemplatePolicyIdList.length; i++) {
                this.TemplatePolicyIdList[i] = new String(source.TemplatePolicyIdList[i]);
            }
        }
        if (source.TemplatePolicyRule != null) {
            this.TemplatePolicyRule = new String(source.TemplatePolicyRule);
        }
        if (source.TemplatePolicyDealType != null) {
            this.TemplatePolicyDealType = new Long(source.TemplatePolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TemplatePolicyIdList.", this.TemplatePolicyIdList);
        this.setParamSimple(map, prefix + "TemplatePolicyRule", this.TemplatePolicyRule);
        this.setParamSimple(map, prefix + "TemplatePolicyDealType", this.TemplatePolicyDealType);

    }
}

