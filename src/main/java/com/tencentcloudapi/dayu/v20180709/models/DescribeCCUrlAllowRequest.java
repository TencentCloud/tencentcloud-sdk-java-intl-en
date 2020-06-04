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

public class DescribeCCUrlAllowRequest extends AbstractModel{

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
    * Blacklist or whitelist. Valid value: [white (whitelist)]. Currently, only whitelist is supported.
Note: this array can only have one value which can only be `white`
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * Pagination parameter
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * HTTP or HTTPS CC protection, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)];
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

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
     * Get Blacklist or whitelist. Valid value: [white (whitelist)]. Currently, only whitelist is supported.
Note: this array can only have one value which can only be `white` 
     * @return Type Blacklist or whitelist. Valid value: [white (whitelist)]. Currently, only whitelist is supported.
Note: this array can only have one value which can only be `white`
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Blacklist or whitelist. Valid value: [white (whitelist)]. Currently, only whitelist is supported.
Note: this array can only have one value which can only be `white`
     * @param Type Blacklist or whitelist. Valid value: [white (whitelist)]. Currently, only whitelist is supported.
Note: this array can only have one value which can only be `white`
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get Pagination parameter 
     * @return Limit Pagination parameter
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter
     * @param Limit Pagination parameter
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get HTTP or HTTPS CC protection, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)]; 
     * @return Protocol HTTP or HTTPS CC protection, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)];
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set HTTP or HTTPS CC protection, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)];
     * @param Protocol HTTP or HTTPS CC protection, which is optional. Valid values: [http (HTTP CC protection), https (HTTPS CC protection)];
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

