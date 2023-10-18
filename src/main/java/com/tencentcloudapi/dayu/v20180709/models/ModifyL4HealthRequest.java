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

public class ModifyL4HealthRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Health check parameter array
    */
    @SerializedName("Healths")
    @Expose
    private L4RuleHealth [] Healths;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Health check parameter array 
     * @return Healths Health check parameter array
     */
    public L4RuleHealth [] getHealths() {
        return this.Healths;
    }

    /**
     * Set Health check parameter array
     * @param Healths Health check parameter array
     */
    public void setHealths(L4RuleHealth [] Healths) {
        this.Healths = Healths;
    }

    public ModifyL4HealthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyL4HealthRequest(ModifyL4HealthRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Healths != null) {
            this.Healths = new L4RuleHealth[source.Healths.length];
            for (int i = 0; i < source.Healths.length; i++) {
                this.Healths[i] = new L4RuleHealth(source.Healths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Healths.", this.Healths);

    }
}

