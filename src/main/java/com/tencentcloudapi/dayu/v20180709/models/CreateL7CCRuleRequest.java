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

public class CreateL7CCRuleRequest extends AbstractModel {

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
    * Operation. Valid values: [query (query), add (add), del (delete)]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Layer-7 forwarding rule ID, such as rule-0000001
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Custom layer-7 CC protection rule. If the `Method` is `query`, this field can be left empty; if the `Method` is `add` or `del`, it is required, and the array length can only be 1;
    */
    @SerializedName("RuleConfig")
    @Expose
    private CCRuleConfig [] RuleConfig;

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
     * Get Operation. Valid values: [query (query), add (add), del (delete)] 
     * @return Method Operation. Valid values: [query (query), add (add), del (delete)]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Operation. Valid values: [query (query), add (add), del (delete)]
     * @param Method Operation. Valid values: [query (query), add (add), del (delete)]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Layer-7 forwarding rule ID, such as rule-0000001 
     * @return RuleId Layer-7 forwarding rule ID, such as rule-0000001
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Layer-7 forwarding rule ID, such as rule-0000001
     * @param RuleId Layer-7 forwarding rule ID, such as rule-0000001
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Custom layer-7 CC protection rule. If the `Method` is `query`, this field can be left empty; if the `Method` is `add` or `del`, it is required, and the array length can only be 1; 
     * @return RuleConfig Custom layer-7 CC protection rule. If the `Method` is `query`, this field can be left empty; if the `Method` is `add` or `del`, it is required, and the array length can only be 1;
     */
    public CCRuleConfig [] getRuleConfig() {
        return this.RuleConfig;
    }

    /**
     * Set Custom layer-7 CC protection rule. If the `Method` is `query`, this field can be left empty; if the `Method` is `add` or `del`, it is required, and the array length can only be 1;
     * @param RuleConfig Custom layer-7 CC protection rule. If the `Method` is `query`, this field can be left empty; if the `Method` is `add` or `del`, it is required, and the array length can only be 1;
     */
    public void setRuleConfig(CCRuleConfig [] RuleConfig) {
        this.RuleConfig = RuleConfig;
    }

    public CreateL7CCRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateL7CCRuleRequest(CreateL7CCRuleRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleConfig != null) {
            this.RuleConfig = new CCRuleConfig[source.RuleConfig.length];
            for (int i = 0; i < source.RuleConfig.length; i++) {
                this.RuleConfig[i] = new CCRuleConfig(source.RuleConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "RuleConfig.", this.RuleConfig);

    }
}

