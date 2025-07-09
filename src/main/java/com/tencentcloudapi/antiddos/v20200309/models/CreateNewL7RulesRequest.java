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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNewL7RulesRequest extends AbstractModel {

    /**
    * List of rules
    */
    @SerializedName("Rules")
    @Expose
    private L7RuleEntry [] Rules;

    /**
    * Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * List of resource IDs
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * List of resource IPs
    */
    @SerializedName("VipList")
    @Expose
    private String [] VipList;

    /**
     * Get List of rules 
     * @return Rules List of rules
     */
    public L7RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of rules
     * @param Rules List of rules
     */
    public void setRules(L7RuleEntry [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced) 
     * @return Business Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
     * @param Business Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get List of resource IDs 
     * @return IdList List of resource IDs
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set List of resource IDs
     * @param IdList List of resource IDs
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get List of resource IPs 
     * @return VipList List of resource IPs
     */
    public String [] getVipList() {
        return this.VipList;
    }

    /**
     * Set List of resource IPs
     * @param VipList List of resource IPs
     */
    public void setVipList(String [] VipList) {
        this.VipList = VipList;
    }

    public CreateNewL7RulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNewL7RulesRequest(CreateNewL7RulesRequest source) {
        if (source.Rules != null) {
            this.Rules = new L7RuleEntry[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new L7RuleEntry(source.Rules[i]);
            }
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.IdList != null) {
            this.IdList = new String[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new String(source.IdList[i]);
            }
        }
        if (source.VipList != null) {
            this.VipList = new String[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new String(source.VipList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamArraySimple(map, prefix + "VipList.", this.VipList);

    }
}

