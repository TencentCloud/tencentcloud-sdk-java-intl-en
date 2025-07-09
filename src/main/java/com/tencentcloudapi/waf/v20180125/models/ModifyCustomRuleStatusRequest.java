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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomRuleStatusRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Status of the switch: 1 is On, 0 is Off
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Version of WAF. clb-waf indicates CLB WAF; sparta-waf indicates SaaS WAF. sparta-waf by default.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Rule ID
    */
    @SerializedName("DomainRuleIdList")
    @Expose
    private DomainRuleId [] DomainRuleIdList;

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
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Status of the switch: 1 is On, 0 is Off 
     * @return Status Status of the switch: 1 is On, 0 is Off
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the switch: 1 is On, 0 is Off
     * @param Status Status of the switch: 1 is On, 0 is Off
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Rule ID 
     * @return DomainRuleIdList Rule ID
     */
    public DomainRuleId [] getDomainRuleIdList() {
        return this.DomainRuleIdList;
    }

    /**
     * Set Rule ID
     * @param DomainRuleIdList Rule ID
     */
    public void setDomainRuleIdList(DomainRuleId [] DomainRuleIdList) {
        this.DomainRuleIdList = DomainRuleIdList;
    }

    public ModifyCustomRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomRuleStatusRequest(ModifyCustomRuleStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamArrayObj(map, prefix + "DomainRuleIdList.", this.DomainRuleIdList);

    }
}

