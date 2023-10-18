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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNewL7RulesRequest extends AbstractModel {

    /**
    * Anti-DDoS service type (`bgpip`: Anti-DDoS Advanced)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * (Optional) Searches by rule status. Valid values: `0` (Successfully configured), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Deletion failed), `6` (awaiting configuration), `7` (awaiting deletion), and `8` (awaiting certificate configuration).
    */
    @SerializedName("StatusList")
    @Expose
    private Long [] StatusList;

    /**
    * (Optional) Searches by domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * (Optional) Searches by IP.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Number of items in a page. Returned results are not paged if you enter “0”.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting offset of the page. Value: (number of pages – 1) * items per page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * (Optional) Searches by forwarding protocol. Values: [http, https, http/https]
    */
    @SerializedName("ProtocolList")
    @Expose
    private String [] ProtocolList;

    /**
    * CNAME of the Anti-DDoS Advanced instance
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

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
     * Get (Optional) Searches by rule status. Valid values: `0` (Successfully configured), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Deletion failed), `6` (awaiting configuration), `7` (awaiting deletion), and `8` (awaiting certificate configuration). 
     * @return StatusList (Optional) Searches by rule status. Valid values: `0` (Successfully configured), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Deletion failed), `6` (awaiting configuration), `7` (awaiting deletion), and `8` (awaiting certificate configuration).
     */
    public Long [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set (Optional) Searches by rule status. Valid values: `0` (Successfully configured), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Deletion failed), `6` (awaiting configuration), `7` (awaiting deletion), and `8` (awaiting certificate configuration).
     * @param StatusList (Optional) Searches by rule status. Valid values: `0` (Successfully configured), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Deletion failed), `6` (awaiting configuration), `7` (awaiting deletion), and `8` (awaiting certificate configuration).
     */
    public void setStatusList(Long [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get (Optional) Searches by domain name. 
     * @return Domain (Optional) Searches by domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set (Optional) Searches by domain name.
     * @param Domain (Optional) Searches by domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get (Optional) Searches by IP. 
     * @return Ip (Optional) Searches by IP.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set (Optional) Searches by IP.
     * @param Ip (Optional) Searches by IP.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Number of items in a page. Returned results are not paged if you enter “0”. 
     * @return Limit Number of items in a page. Returned results are not paged if you enter “0”.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items in a page. Returned results are not paged if you enter “0”.
     * @param Limit Number of items in a page. Returned results are not paged if you enter “0”.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get (Optional) Searches by forwarding protocol. Values: [http, https, http/https] 
     * @return ProtocolList (Optional) Searches by forwarding protocol. Values: [http, https, http/https]
     */
    public String [] getProtocolList() {
        return this.ProtocolList;
    }

    /**
     * Set (Optional) Searches by forwarding protocol. Values: [http, https, http/https]
     * @param ProtocolList (Optional) Searches by forwarding protocol. Values: [http, https, http/https]
     */
    public void setProtocolList(String [] ProtocolList) {
        this.ProtocolList = ProtocolList;
    }

    /**
     * Get CNAME of the Anti-DDoS Advanced instance 
     * @return Cname CNAME of the Anti-DDoS Advanced instance
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME of the Anti-DDoS Advanced instance
     * @param Cname CNAME of the Anti-DDoS Advanced instance
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public DescribeNewL7RulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewL7RulesRequest(DescribeNewL7RulesRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.StatusList != null) {
            this.StatusList = new Long[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new Long(source.StatusList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProtocolList != null) {
            this.ProtocolList = new String[source.ProtocolList.length];
            for (int i = 0; i < source.ProtocolList.length; i++) {
                this.ProtocolList[i] = new String(source.ProtocolList[i]);
            }
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ProtocolList.", this.ProtocolList);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

