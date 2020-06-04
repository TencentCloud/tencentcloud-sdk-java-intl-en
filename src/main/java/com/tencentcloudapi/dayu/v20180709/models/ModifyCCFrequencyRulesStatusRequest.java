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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCCFrequencyRulesStatusRequest extends AbstractModel{

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
    * Layer-7 forwarding rule ID, which can be obtained through the `DescribleL7Rules` API
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Enables or disable. Valid values: ["on", "off"]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

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
     * Get Layer-7 forwarding rule ID, which can be obtained through the `DescribleL7Rules` API 
     * @return RuleId Layer-7 forwarding rule ID, which can be obtained through the `DescribleL7Rules` API
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Layer-7 forwarding rule ID, which can be obtained through the `DescribleL7Rules` API
     * @param RuleId Layer-7 forwarding rule ID, which can be obtained through the `DescribleL7Rules` API
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Enables or disable. Valid values: ["on", "off"] 
     * @return Method Enables or disable. Valid values: ["on", "off"]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Enables or disable. Valid values: ["on", "off"]
     * @param Method Enables or disable. Valid values: ["on", "off"]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

