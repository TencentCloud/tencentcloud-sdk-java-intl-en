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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel {

    /**
    * CLB instance IDs. There can be up to 20 IDs.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * CLB instance network type:
OPEN: public network; INTERNAL: private network.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance type. 1: generic CLB instance; 0: classic CLB instance
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * Specifies the name of the clb instance. fuzzy query is supported.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Tencent cloud assigns a domain name to the cloud load balancer instance. fuzzy query is supported.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * VIP address of a CLB instance (there can be multiple addresses)
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * Public IPs of the backend services bound with the load balancer. Only the public IPs of CVMs are supported now.
    */
    @SerializedName("BackendPublicIps")
    @Expose
    private String [] BackendPublicIps;

    /**
    * Private IPs of the backend services bound with the load balancer. Only the private IPs of CVMs are supported now.
    */
    @SerializedName("BackendPrivateIps")
    @Expose
    private String [] BackendPrivateIps;

    /**
    * Data offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned CLB instances. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting parameter. supports the following fields:.
- LoadBalancerName
- CreateTime
- Domain
- LoadBalancerType

Defaults to CreateTime.

    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1 for descending, 0 for ascending, defaults to 1, sorted by creation time in descending order.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Specifies the fuzzy search field for fuzzy matching the name, domain name, VIP address, or ID of a cloud load balancer instance.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Project ID of the cloud load balancer instance. you can call the [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1) api to obtain the ID. defaults to all projects if not passed.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether a CLB instance is bound to a real server. 0: no; 1: yes; -1: query all.
    */
    @SerializedName("WithRs")
    @Expose
    private Long WithRs;

    /**
    * Specifies the unique vpc ID of the load balancing instance, such as vpc-bhqkbhdx. you can call the [DescribeVpcs](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) api to obtain it.
Searches for cloud load balancer of basic network type. allows input '0'.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Security group ID, such as sg-m1cc****, can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> internet-charge-type - Type: String - Required: No - Filter by CLB network billing mode, including `TRAFFIC_POSTPAID_BY_HOUR`</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Specifies the expanded fields to return. not specified, expanded fields do not return by default. supported expanded fields are as follows:.
<Li>TargetCount: specifies the number of real servers bound to it.</li>.
    */
    @SerializedName("AdditionalFields")
    @Expose
    private String [] AdditionalFields;

    /**
     * Get CLB instance IDs. There can be up to 20 IDs. 
     * @return LoadBalancerIds CLB instance IDs. There can be up to 20 IDs.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set CLB instance IDs. There can be up to 20 IDs.
     * @param LoadBalancerIds CLB instance IDs. There can be up to 20 IDs.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get CLB instance network type:
OPEN: public network; INTERNAL: private network. 
     * @return LoadBalancerType CLB instance network type:
OPEN: public network; INTERNAL: private network.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB instance network type:
OPEN: public network; INTERNAL: private network.
     * @param LoadBalancerType CLB instance network type:
OPEN: public network; INTERNAL: private network.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB instance type. 1: generic CLB instance; 0: classic CLB instance 
     * @return Forward CLB instance type. 1: generic CLB instance; 0: classic CLB instance
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB instance type. 1: generic CLB instance; 0: classic CLB instance
     * @param Forward CLB instance type. 1: generic CLB instance; 0: classic CLB instance
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get Specifies the name of the clb instance. fuzzy query is supported. 
     * @return LoadBalancerName Specifies the name of the clb instance. fuzzy query is supported.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Specifies the name of the clb instance. fuzzy query is supported.
     * @param LoadBalancerName Specifies the name of the clb instance. fuzzy query is supported.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Tencent cloud assigns a domain name to the cloud load balancer instance. fuzzy query is supported. 
     * @return Domain Tencent cloud assigns a domain name to the cloud load balancer instance. fuzzy query is supported.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Tencent cloud assigns a domain name to the cloud load balancer instance. fuzzy query is supported.
     * @param Domain Tencent cloud assigns a domain name to the cloud load balancer instance. fuzzy query is supported.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get VIP address of a CLB instance (there can be multiple addresses) 
     * @return LoadBalancerVips VIP address of a CLB instance (there can be multiple addresses)
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set VIP address of a CLB instance (there can be multiple addresses)
     * @param LoadBalancerVips VIP address of a CLB instance (there can be multiple addresses)
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get Public IPs of the backend services bound with the load balancer. Only the public IPs of CVMs are supported now. 
     * @return BackendPublicIps Public IPs of the backend services bound with the load balancer. Only the public IPs of CVMs are supported now.
     */
    public String [] getBackendPublicIps() {
        return this.BackendPublicIps;
    }

    /**
     * Set Public IPs of the backend services bound with the load balancer. Only the public IPs of CVMs are supported now.
     * @param BackendPublicIps Public IPs of the backend services bound with the load balancer. Only the public IPs of CVMs are supported now.
     */
    public void setBackendPublicIps(String [] BackendPublicIps) {
        this.BackendPublicIps = BackendPublicIps;
    }

    /**
     * Get Private IPs of the backend services bound with the load balancer. Only the private IPs of CVMs are supported now. 
     * @return BackendPrivateIps Private IPs of the backend services bound with the load balancer. Only the private IPs of CVMs are supported now.
     */
    public String [] getBackendPrivateIps() {
        return this.BackendPrivateIps;
    }

    /**
     * Set Private IPs of the backend services bound with the load balancer. Only the private IPs of CVMs are supported now.
     * @param BackendPrivateIps Private IPs of the backend services bound with the load balancer. Only the private IPs of CVMs are supported now.
     */
    public void setBackendPrivateIps(String [] BackendPrivateIps) {
        this.BackendPrivateIps = BackendPrivateIps;
    }

    /**
     * Get Data offset. Default value: 0. 
     * @return Offset Data offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default value: 0.
     * @param Offset Data offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned CLB instances. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned CLB instances. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned CLB instances. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned CLB instances. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting parameter. supports the following fields:.
- LoadBalancerName
- CreateTime
- Domain
- LoadBalancerType

Defaults to CreateTime.
 
     * @return OrderBy Sorting parameter. supports the following fields:.
- LoadBalancerName
- CreateTime
- Domain
- LoadBalancerType

Defaults to CreateTime.

     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting parameter. supports the following fields:.
- LoadBalancerName
- CreateTime
- Domain
- LoadBalancerType

Defaults to CreateTime.

     * @param OrderBy Sorting parameter. supports the following fields:.
- LoadBalancerName
- CreateTime
- Domain
- LoadBalancerType

Defaults to CreateTime.

     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 1 for descending, 0 for ascending, defaults to 1, sorted by creation time in descending order. 
     * @return OrderType 1 for descending, 0 for ascending, defaults to 1, sorted by creation time in descending order.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1 for descending, 0 for ascending, defaults to 1, sorted by creation time in descending order.
     * @param OrderType 1 for descending, 0 for ascending, defaults to 1, sorted by creation time in descending order.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Specifies the fuzzy search field for fuzzy matching the name, domain name, VIP address, or ID of a cloud load balancer instance. 
     * @return SearchKey Specifies the fuzzy search field for fuzzy matching the name, domain name, VIP address, or ID of a cloud load balancer instance.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Specifies the fuzzy search field for fuzzy matching the name, domain name, VIP address, or ID of a cloud load balancer instance.
     * @param SearchKey Specifies the fuzzy search field for fuzzy matching the name, domain name, VIP address, or ID of a cloud load balancer instance.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Project ID of the cloud load balancer instance. you can call the [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1) api to obtain the ID. defaults to all projects if not passed. 
     * @return ProjectId Project ID of the cloud load balancer instance. you can call the [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1) api to obtain the ID. defaults to all projects if not passed.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of the cloud load balancer instance. you can call the [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1) api to obtain the ID. defaults to all projects if not passed.
     * @param ProjectId Project ID of the cloud load balancer instance. you can call the [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1) api to obtain the ID. defaults to all projects if not passed.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether a CLB instance is bound to a real server. 0: no; 1: yes; -1: query all. 
     * @return WithRs Whether a CLB instance is bound to a real server. 0: no; 1: yes; -1: query all.
     */
    public Long getWithRs() {
        return this.WithRs;
    }

    /**
     * Set Whether a CLB instance is bound to a real server. 0: no; 1: yes; -1: query all.
     * @param WithRs Whether a CLB instance is bound to a real server. 0: no; 1: yes; -1: query all.
     */
    public void setWithRs(Long WithRs) {
        this.WithRs = WithRs;
    }

    /**
     * Get Specifies the unique vpc ID of the load balancing instance, such as vpc-bhqkbhdx. you can call the [DescribeVpcs](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) api to obtain it.
Searches for cloud load balancer of basic network type. allows input '0'. 
     * @return VpcId Specifies the unique vpc ID of the load balancing instance, such as vpc-bhqkbhdx. you can call the [DescribeVpcs](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) api to obtain it.
Searches for cloud load balancer of basic network type. allows input '0'.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the unique vpc ID of the load balancing instance, such as vpc-bhqkbhdx. you can call the [DescribeVpcs](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) api to obtain it.
Searches for cloud load balancer of basic network type. allows input '0'.
     * @param VpcId Specifies the unique vpc ID of the load balancing instance, such as vpc-bhqkbhdx. you can call the [DescribeVpcs](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1) api to obtain it.
Searches for cloud load balancer of basic network type. allows input '0'.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Security group ID, such as sg-m1cc****, can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1). 
     * @return SecurityGroup Security group ID, such as sg-m1cc****, can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group ID, such as sg-m1cc****, can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
     * @param SecurityGroup Security group ID, such as sg-m1cc****, can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808?from_cn_redirect=1).
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1). 
     * @return MasterZone Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
     * @param MasterZone Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> internet-charge-type - Type: String - Required: No - Filter by CLB network billing mode, including `TRAFFIC_POSTPAID_BY_HOUR`</li> 
     * @return Filters Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> internet-charge-type - Type: String - Required: No - Filter by CLB network billing mode, including `TRAFFIC_POSTPAID_BY_HOUR`</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> internet-charge-type - Type: String - Required: No - Filter by CLB network billing mode, including `TRAFFIC_POSTPAID_BY_HOUR`</li>
     * @param Filters Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> internet-charge-type - Type: String - Required: No - Filter by CLB network billing mode, including `TRAFFIC_POSTPAID_BY_HOUR`</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specifies the expanded fields to return. not specified, expanded fields do not return by default. supported expanded fields are as follows:.
<Li>TargetCount: specifies the number of real servers bound to it.</li>. 
     * @return AdditionalFields Specifies the expanded fields to return. not specified, expanded fields do not return by default. supported expanded fields are as follows:.
<Li>TargetCount: specifies the number of real servers bound to it.</li>.
     */
    public String [] getAdditionalFields() {
        return this.AdditionalFields;
    }

    /**
     * Set Specifies the expanded fields to return. not specified, expanded fields do not return by default. supported expanded fields are as follows:.
<Li>TargetCount: specifies the number of real servers bound to it.</li>.
     * @param AdditionalFields Specifies the expanded fields to return. not specified, expanded fields do not return by default. supported expanded fields are as follows:.
<Li>TargetCount: specifies the number of real servers bound to it.</li>.
     */
    public void setAdditionalFields(String [] AdditionalFields) {
        this.AdditionalFields = AdditionalFields;
    }

    public DescribeLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersRequest(DescribeLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.BackendPublicIps != null) {
            this.BackendPublicIps = new String[source.BackendPublicIps.length];
            for (int i = 0; i < source.BackendPublicIps.length; i++) {
                this.BackendPublicIps[i] = new String(source.BackendPublicIps[i]);
            }
        }
        if (source.BackendPrivateIps != null) {
            this.BackendPrivateIps = new String[source.BackendPrivateIps.length];
            for (int i = 0; i < source.BackendPrivateIps.length; i++) {
                this.BackendPrivateIps[i] = new String(source.BackendPrivateIps[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.WithRs != null) {
            this.WithRs = new Long(source.WithRs);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.AdditionalFields != null) {
            this.AdditionalFields = new String[source.AdditionalFields.length];
            for (int i = 0; i < source.AdditionalFields.length; i++) {
                this.AdditionalFields[i] = new String(source.AdditionalFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamArraySimple(map, prefix + "BackendPublicIps.", this.BackendPublicIps);
        this.setParamArraySimple(map, prefix + "BackendPrivateIps.", this.BackendPrivateIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WithRs", this.WithRs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "AdditionalFields.", this.AdditionalFields);

    }
}

