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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNewL7RulesUploadRequest extends AbstractModel {

    /**
    * Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced).
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Resource ID list.
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * Resource IP address list.
    */
    @SerializedName("VipList")
    @Expose
    private String [] VipList;

    /**
    * Rule list.
    */
    @SerializedName("Rules")
    @Expose
    private L7RuleEntry [] Rules;

    /**
     * Get Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced). 
     * @return Business Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced).
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced).
     * @param Business Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced).
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Resource ID list. 
     * @return IdList Resource ID list.
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set Resource ID list.
     * @param IdList Resource ID list.
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get Resource IP address list. 
     * @return VipList Resource IP address list.
     */
    public String [] getVipList() {
        return this.VipList;
    }

    /**
     * Set Resource IP address list.
     * @param VipList Resource IP address list.
     */
    public void setVipList(String [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get Rule list. 
     * @return Rules Rule list.
     */
    public L7RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule list.
     * @param Rules Rule list.
     */
    public void setRules(L7RuleEntry [] Rules) {
        this.Rules = Rules;
    }

    public CreateNewL7RulesUploadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNewL7RulesUploadRequest(CreateNewL7RulesUploadRequest source) {
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
        if (source.Rules != null) {
            this.Rules = new L7RuleEntry[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new L7RuleEntry(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamArraySimple(map, prefix + "VipList.", this.VipList);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

