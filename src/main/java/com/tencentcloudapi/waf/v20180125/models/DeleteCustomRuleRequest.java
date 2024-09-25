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

public class DeleteCustomRuleRequest extends AbstractModel {

    /**
    * Deleted domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Deleted rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * List of rules to be deleted in batches
    */
    @SerializedName("DomainRuleIdList")
    @Expose
    private DomainRuleId [] DomainRuleIdList;

    /**
     * Get Deleted domain 
     * @return Domain Deleted domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Deleted domain
     * @param Domain Deleted domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Deleted rule ID 
     * @return RuleId Deleted rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Deleted rule ID
     * @param RuleId Deleted rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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
     * Get List of rules to be deleted in batches 
     * @return DomainRuleIdList List of rules to be deleted in batches
     */
    public DomainRuleId [] getDomainRuleIdList() {
        return this.DomainRuleIdList;
    }

    /**
     * Set List of rules to be deleted in batches
     * @param DomainRuleIdList List of rules to be deleted in batches
     */
    public void setDomainRuleIdList(DomainRuleId [] DomainRuleIdList) {
        this.DomainRuleIdList = DomainRuleIdList;
    }

    public DeleteCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomRuleRequest(DeleteCustomRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.DomainRuleIdList != null) {
            this.DomainRuleIdList = new DomainRuleId[source.DomainRuleIdList.length];
            for (int i = 0; i < source.DomainRuleIdList.length; i++) {
                this.DomainRuleIdList[i] = new DomainRuleId(source.DomainRuleIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamArrayObj(map, prefix + "DomainRuleIdList.", this.DomainRuleIdList);

    }
}

