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

public class ModifyCCIpAllowDenyRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
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
    * add: add, delete: delete
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Blocklist/allowlist type. Valid values: [white (allowlist), black (blocklist)]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Blocklisted/whitelisted IP array
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * CC protection type, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)]; if this field is left empty, HTTPS CC protection will be used by default; if `https` is entered, the `Domain` and `RuleId` fields are required;
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * HTTPS layer-7 forwarding rule domain name (which is optional and can be obtained from the layer-7 forwarding rule API). This field is required only if `Protocol` is `https`;
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * HTTPS layer-7 forwarding rule ID (which is optional and can be obtained from the layer-7 forwarding rule API),
If `Method` is `delete`, this field can be left empty;
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
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
     * Get add: add, delete: delete 
     * @return Method add: add, delete: delete
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set add: add, delete: delete
     * @param Method add: add, delete: delete
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Blocklist/allowlist type. Valid values: [white (allowlist), black (blocklist)] 
     * @return Type Blocklist/allowlist type. Valid values: [white (allowlist), black (blocklist)]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Blocklist/allowlist type. Valid values: [white (allowlist), black (blocklist)]
     * @param Type Blocklist/allowlist type. Valid values: [white (allowlist), black (blocklist)]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Blocklisted/whitelisted IP array 
     * @return IpList Blocklisted/whitelisted IP array
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set Blocklisted/whitelisted IP array
     * @param IpList Blocklisted/whitelisted IP array
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get CC protection type, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)]; if this field is left empty, HTTPS CC protection will be used by default; if `https` is entered, the `Domain` and `RuleId` fields are required; 
     * @return Protocol CC protection type, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)]; if this field is left empty, HTTPS CC protection will be used by default; if `https` is entered, the `Domain` and `RuleId` fields are required;
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set CC protection type, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)]; if this field is left empty, HTTPS CC protection will be used by default; if `https` is entered, the `Domain` and `RuleId` fields are required;
     * @param Protocol CC protection type, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)]; if this field is left empty, HTTPS CC protection will be used by default; if `https` is entered, the `Domain` and `RuleId` fields are required;
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get HTTPS layer-7 forwarding rule domain name (which is optional and can be obtained from the layer-7 forwarding rule API). This field is required only if `Protocol` is `https`; 
     * @return Domain HTTPS layer-7 forwarding rule domain name (which is optional and can be obtained from the layer-7 forwarding rule API). This field is required only if `Protocol` is `https`;
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set HTTPS layer-7 forwarding rule domain name (which is optional and can be obtained from the layer-7 forwarding rule API). This field is required only if `Protocol` is `https`;
     * @param Domain HTTPS layer-7 forwarding rule domain name (which is optional and can be obtained from the layer-7 forwarding rule API). This field is required only if `Protocol` is `https`;
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get HTTPS layer-7 forwarding rule ID (which is optional and can be obtained from the layer-7 forwarding rule API),
If `Method` is `delete`, this field can be left empty; 
     * @return RuleId HTTPS layer-7 forwarding rule ID (which is optional and can be obtained from the layer-7 forwarding rule API),
If `Method` is `delete`, this field can be left empty;
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set HTTPS layer-7 forwarding rule ID (which is optional and can be obtained from the layer-7 forwarding rule API),
If `Method` is `delete`, this field can be left empty;
     * @param RuleId HTTPS layer-7 forwarding rule ID (which is optional and can be obtained from the layer-7 forwarding rule API),
If `Method` is `delete`, this field can be left empty;
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public ModifyCCIpAllowDenyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCCIpAllowDenyRequest(ModifyCCIpAllowDenyRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

