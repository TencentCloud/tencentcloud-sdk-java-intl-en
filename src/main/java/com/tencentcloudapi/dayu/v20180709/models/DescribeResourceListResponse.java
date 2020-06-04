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

public class DescribeResourceListResponse extends AbstractModel{

    /**
    * Total number of records
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Resource record list. Valid values of `key`:
"Key": "CreateTime" - resource instance purchase time
"Key": "Region" - resource instance region
"Key": "BoundIP" - IP bound to single IP instance
"Key": "Id" - resource instance ID
"Key": "CCEnabled" - CC protection status of resource instance
"Key": "DDoSThreshold" - DDoS cleansing threshold of resource instance	
"Key": "BoundStatus" - IP binding status of single IP instance or multi-IP instance (binding or bound)
"Key": "Type" - this field has been disused
"Key": "ElasticLimit" - elastic protection value of resource instance
"Key": "DDoSAI" - DDoS AI protection status of resource instance
"Key": "Bandwidth" - base protection value of resource instance
"Key": "OverloadCount" - number of attacks to the resource instance that exceed the elastic protection value
"Key": "Status" - resource instance status (idle: running, attacking: attacking, blocking: blocking, isolate: isolating)
"Key": "Lbid" - this field has been disused
"Key": "ShowFlag" - this field has been disused
"Key": "Expire" - resource instance expiration time
"Key": "CCThreshold" - CC protection triggering threshold of resource instance
"Key": "AutoRenewFlag" - auto-renewal flag of resource instance
"Key": "IspCode" - line of single IP instance or multi-IP instance (0: China Telecom, 1: China Unicom, 2: China Mobile, 5: BGP)
"Key": "PackType" - package type
"Key": "PackId" - package ID
"Key": "Name" - resource instance name
"Key": "Locked" - this field has been disused
"Key": "IpDDoSLevel" - protection level of resource instance (low: loose, middle: normal, high: strict)
"Key": "DefendStatus" - DDoS protection status of resource (enabled or temporarily disabled)
"Key": "UndefendExpire" - end time of temporary disablement of DDoS protection for resource instance
"Key": "Tgw" - whether the resource instance is a new resource
    */
    @SerializedName("ServicePacks")
    @Expose
    private KeyValueRecord [] ServicePacks;

    /**
    * Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records 
     * @return Total Total number of records
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of records
     * @param Total Total number of records
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Resource record list. Valid values of `key`:
"Key": "CreateTime" - resource instance purchase time
"Key": "Region" - resource instance region
"Key": "BoundIP" - IP bound to single IP instance
"Key": "Id" - resource instance ID
"Key": "CCEnabled" - CC protection status of resource instance
"Key": "DDoSThreshold" - DDoS cleansing threshold of resource instance	
"Key": "BoundStatus" - IP binding status of single IP instance or multi-IP instance (binding or bound)
"Key": "Type" - this field has been disused
"Key": "ElasticLimit" - elastic protection value of resource instance
"Key": "DDoSAI" - DDoS AI protection status of resource instance
"Key": "Bandwidth" - base protection value of resource instance
"Key": "OverloadCount" - number of attacks to the resource instance that exceed the elastic protection value
"Key": "Status" - resource instance status (idle: running, attacking: attacking, blocking: blocking, isolate: isolating)
"Key": "Lbid" - this field has been disused
"Key": "ShowFlag" - this field has been disused
"Key": "Expire" - resource instance expiration time
"Key": "CCThreshold" - CC protection triggering threshold of resource instance
"Key": "AutoRenewFlag" - auto-renewal flag of resource instance
"Key": "IspCode" - line of single IP instance or multi-IP instance (0: China Telecom, 1: China Unicom, 2: China Mobile, 5: BGP)
"Key": "PackType" - package type
"Key": "PackId" - package ID
"Key": "Name" - resource instance name
"Key": "Locked" - this field has been disused
"Key": "IpDDoSLevel" - protection level of resource instance (low: loose, middle: normal, high: strict)
"Key": "DefendStatus" - DDoS protection status of resource (enabled or temporarily disabled)
"Key": "UndefendExpire" - end time of temporary disablement of DDoS protection for resource instance
"Key": "Tgw" - whether the resource instance is a new resource 
     * @return ServicePacks Resource record list. Valid values of `key`:
"Key": "CreateTime" - resource instance purchase time
"Key": "Region" - resource instance region
"Key": "BoundIP" - IP bound to single IP instance
"Key": "Id" - resource instance ID
"Key": "CCEnabled" - CC protection status of resource instance
"Key": "DDoSThreshold" - DDoS cleansing threshold of resource instance	
"Key": "BoundStatus" - IP binding status of single IP instance or multi-IP instance (binding or bound)
"Key": "Type" - this field has been disused
"Key": "ElasticLimit" - elastic protection value of resource instance
"Key": "DDoSAI" - DDoS AI protection status of resource instance
"Key": "Bandwidth" - base protection value of resource instance
"Key": "OverloadCount" - number of attacks to the resource instance that exceed the elastic protection value
"Key": "Status" - resource instance status (idle: running, attacking: attacking, blocking: blocking, isolate: isolating)
"Key": "Lbid" - this field has been disused
"Key": "ShowFlag" - this field has been disused
"Key": "Expire" - resource instance expiration time
"Key": "CCThreshold" - CC protection triggering threshold of resource instance
"Key": "AutoRenewFlag" - auto-renewal flag of resource instance
"Key": "IspCode" - line of single IP instance or multi-IP instance (0: China Telecom, 1: China Unicom, 2: China Mobile, 5: BGP)
"Key": "PackType" - package type
"Key": "PackId" - package ID
"Key": "Name" - resource instance name
"Key": "Locked" - this field has been disused
"Key": "IpDDoSLevel" - protection level of resource instance (low: loose, middle: normal, high: strict)
"Key": "DefendStatus" - DDoS protection status of resource (enabled or temporarily disabled)
"Key": "UndefendExpire" - end time of temporary disablement of DDoS protection for resource instance
"Key": "Tgw" - whether the resource instance is a new resource
     */
    public KeyValueRecord [] getServicePacks() {
        return this.ServicePacks;
    }

    /**
     * Set Resource record list. Valid values of `key`:
"Key": "CreateTime" - resource instance purchase time
"Key": "Region" - resource instance region
"Key": "BoundIP" - IP bound to single IP instance
"Key": "Id" - resource instance ID
"Key": "CCEnabled" - CC protection status of resource instance
"Key": "DDoSThreshold" - DDoS cleansing threshold of resource instance	
"Key": "BoundStatus" - IP binding status of single IP instance or multi-IP instance (binding or bound)
"Key": "Type" - this field has been disused
"Key": "ElasticLimit" - elastic protection value of resource instance
"Key": "DDoSAI" - DDoS AI protection status of resource instance
"Key": "Bandwidth" - base protection value of resource instance
"Key": "OverloadCount" - number of attacks to the resource instance that exceed the elastic protection value
"Key": "Status" - resource instance status (idle: running, attacking: attacking, blocking: blocking, isolate: isolating)
"Key": "Lbid" - this field has been disused
"Key": "ShowFlag" - this field has been disused
"Key": "Expire" - resource instance expiration time
"Key": "CCThreshold" - CC protection triggering threshold of resource instance
"Key": "AutoRenewFlag" - auto-renewal flag of resource instance
"Key": "IspCode" - line of single IP instance or multi-IP instance (0: China Telecom, 1: China Unicom, 2: China Mobile, 5: BGP)
"Key": "PackType" - package type
"Key": "PackId" - package ID
"Key": "Name" - resource instance name
"Key": "Locked" - this field has been disused
"Key": "IpDDoSLevel" - protection level of resource instance (low: loose, middle: normal, high: strict)
"Key": "DefendStatus" - DDoS protection status of resource (enabled or temporarily disabled)
"Key": "UndefendExpire" - end time of temporary disablement of DDoS protection for resource instance
"Key": "Tgw" - whether the resource instance is a new resource
     * @param ServicePacks Resource record list. Valid values of `key`:
"Key": "CreateTime" - resource instance purchase time
"Key": "Region" - resource instance region
"Key": "BoundIP" - IP bound to single IP instance
"Key": "Id" - resource instance ID
"Key": "CCEnabled" - CC protection status of resource instance
"Key": "DDoSThreshold" - DDoS cleansing threshold of resource instance	
"Key": "BoundStatus" - IP binding status of single IP instance or multi-IP instance (binding or bound)
"Key": "Type" - this field has been disused
"Key": "ElasticLimit" - elastic protection value of resource instance
"Key": "DDoSAI" - DDoS AI protection status of resource instance
"Key": "Bandwidth" - base protection value of resource instance
"Key": "OverloadCount" - number of attacks to the resource instance that exceed the elastic protection value
"Key": "Status" - resource instance status (idle: running, attacking: attacking, blocking: blocking, isolate: isolating)
"Key": "Lbid" - this field has been disused
"Key": "ShowFlag" - this field has been disused
"Key": "Expire" - resource instance expiration time
"Key": "CCThreshold" - CC protection triggering threshold of resource instance
"Key": "AutoRenewFlag" - auto-renewal flag of resource instance
"Key": "IspCode" - line of single IP instance or multi-IP instance (0: China Telecom, 1: China Unicom, 2: China Mobile, 5: BGP)
"Key": "PackType" - package type
"Key": "PackId" - package ID
"Key": "Name" - resource instance name
"Key": "Locked" - this field has been disused
"Key": "IpDDoSLevel" - protection level of resource instance (low: loose, middle: normal, high: strict)
"Key": "DefendStatus" - DDoS protection status of resource (enabled or temporarily disabled)
"Key": "UndefendExpire" - end time of temporary disablement of DDoS protection for resource instance
"Key": "Tgw" - whether the resource instance is a new resource
     */
    public void setServicePacks(KeyValueRecord [] ServicePacks) {
        this.ServicePacks = ServicePacks;
    }

    /**
     * Get Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate) 
     * @return Business Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
     * @param Business Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ServicePacks.", this.ServicePacks);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

