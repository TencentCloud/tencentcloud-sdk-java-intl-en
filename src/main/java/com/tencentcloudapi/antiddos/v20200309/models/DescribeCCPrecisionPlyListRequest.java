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

public class DescribeCCPrecisionPlyListRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. Valid values: `bgpip-multip` (Anti-DDoS Pro) and `bgpip` (Anti-DDoS Advanced).
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Starting offset of the page. Value: (number of pages – 1) * items per page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results returned in one page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP address, which is required when an Anti-DDoS Advanced instance is used.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Domain name, which is required when an Anti-DDoS Advanced instance is used.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol, which is required when an Anti-DDoS Advanced instance is used.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Anti-DDoS service type. Valid values: `bgpip-multip` (Anti-DDoS Pro) and `bgpip` (Anti-DDoS Advanced). 
     * @return Business Anti-DDoS service type. Valid values: `bgpip-multip` (Anti-DDoS Pro) and `bgpip` (Anti-DDoS Advanced).
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. Valid values: `bgpip-multip` (Anti-DDoS Pro) and `bgpip` (Anti-DDoS Advanced).
     * @param Business Anti-DDoS service type. Valid values: `bgpip-multip` (Anti-DDoS Pro) and `bgpip` (Anti-DDoS Advanced).
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Starting offset of the page. Value: (number of pages – 1) * items per page. 
     * @return Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the page. Value: (number of pages – 1) * items per page.
     * @param Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results returned in one page 
     * @return Limit Number of results returned in one page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned in one page
     * @param Limit Number of results returned in one page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP address, which is required when an Anti-DDoS Advanced instance is used. 
     * @return Ip IP address, which is required when an Anti-DDoS Advanced instance is used.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address, which is required when an Anti-DDoS Advanced instance is used.
     * @param Ip IP address, which is required when an Anti-DDoS Advanced instance is used.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Domain name, which is required when an Anti-DDoS Advanced instance is used. 
     * @return Domain Domain name, which is required when an Anti-DDoS Advanced instance is used.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name, which is required when an Anti-DDoS Advanced instance is used.
     * @param Domain Domain name, which is required when an Anti-DDoS Advanced instance is used.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protocol, which is required when an Anti-DDoS Advanced instance is used. 
     * @return Protocol Protocol, which is required when an Anti-DDoS Advanced instance is used.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol, which is required when an Anti-DDoS Advanced instance is used.
     * @param Protocol Protocol, which is required when an Anti-DDoS Advanced instance is used.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public DescribeCCPrecisionPlyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCPrecisionPlyListRequest(DescribeCCPrecisionPlyListRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

