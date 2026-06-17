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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel {

    /**
    * CLB instance ID. There can be up to 20 IDs.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Network type of the CLB instance:
OPEN: Public network attribute. INTERNAL: Private network attribute.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance type. 1: General CLB instance; 0: Classic CLB instance. If this parameter is not specified, all types of CLB instances will be queried.
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * CLB instance name.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Domain name assigned for a CLB instance by the cloud platform.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * VIP address of a CLB instance (there can be multiple addresses).
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * The public network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the public IP of Cloud Virtual Machine (CVM).
    */
    @SerializedName("BackendPublicIps")
    @Expose
    private String [] BackendPublicIps;

    /**
    * The private network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the private IP address of Cloud Virtual Machine (CVM).
    */
    @SerializedName("BackendPrivateIps")
    @Expose
    private String [] BackendPrivateIps;

    /**
    * Data offset. Default: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of CLB instances returned. Default: 20. Maximum: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * A sorting parameter. Valid values: LoadBalancerName, CreateTime, Domain, and LoadBalancerType.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1: Reverse; 0: Sequential. Default: reverse by creation time
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Search field, supporting fuzzy match by name, domain, and VIP.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * The ID of the project to which the CLB instance belongs. This parameter can be obtained through the DescribeProject API.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether CLB is bound to a real server. 0: No; 1: Yes; -1: Query all.
    */
    @SerializedName("WithRs")
    @Expose
    private Long WithRs;

    /**
    * Unique VPC ID of the CLB instance, such as vpc-bhqkbhdx
Basic network allows input '0'.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Security group ID, for example sg-m1cc****.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Each request can have up to 10 `Filters` values and 100 `Filter.Values` values.<br/>`Filter.Name` and `Filter.Values` are required items. The detailed filter criteria are as follows:
<li> charge-type - String - Required: No - (Filter condition) Filter by the CLB instance billing mode, including "PREPAID", "POSTPAID_BY_HOUR".</li>
<li> internet-charge-type - String - Required: No - (Filter condition) Filter by CLB network billing mode, including "BANDWIDTH_PREPAID", "TRAFFIC_POSTPAID_BY_HOUR", "BANDWIDTH_POSTPAID_BY_HOUR", "BANDWIDTH_PACKAGE".</li>
<li> master-zone-id - String - Required: No - (Filter condition) Filter by primary AZ ID of CLB, such as "100001" (corresponding to Guangzhou Zone 1).</li>
<li>tag-key - String - required: no - (filter condition) filter by CLB tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by CLB Tag key-value pair. Replace tag-key with a specific tag key.</li>
<li> function-name - String - Required: No - (Filter condition) Filter by the function name of the Serverless Cloud Function (SCF) bound to the CLB backend.</li>
<li> vip-isp - String - Required: No - (Filter condition) Filter by operator type of CLB VIP, such as "BGP", "INTERNAL", "CMCC", "CTCC", "CUCC".</li>
<li>sla-type - String - required: no - (filter condition) filter by CLB performance capacity specification, including "clb.c2.medium", "clb.c3.small", "clb.c3.medium", "clb.c4.small", "clb.c4.medium", "clb.c4.large", "clb.c4.xlarge".</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Select the expansion fields to return. If not specified, expansion fields are not returned by default. The supported expansion fields are as follows:
<li> TargetCount: Number of real servers bound to it</li>
    */
    @SerializedName("AdditionalFields")
    @Expose
    private String [] AdditionalFields;

    /**
     * Get CLB instance ID. There can be up to 20 IDs. 
     * @return LoadBalancerIds CLB instance ID. There can be up to 20 IDs.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set CLB instance ID. There can be up to 20 IDs.
     * @param LoadBalancerIds CLB instance ID. There can be up to 20 IDs.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Network type of the CLB instance:
OPEN: Public network attribute. INTERNAL: Private network attribute. 
     * @return LoadBalancerType Network type of the CLB instance:
OPEN: Public network attribute. INTERNAL: Private network attribute.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Network type of the CLB instance:
OPEN: Public network attribute. INTERNAL: Private network attribute.
     * @param LoadBalancerType Network type of the CLB instance:
OPEN: Public network attribute. INTERNAL: Private network attribute.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB instance type. 1: General CLB instance; 0: Classic CLB instance. If this parameter is not specified, all types of CLB instances will be queried. 
     * @return Forward CLB instance type. 1: General CLB instance; 0: Classic CLB instance. If this parameter is not specified, all types of CLB instances will be queried.
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB instance type. 1: General CLB instance; 0: Classic CLB instance. If this parameter is not specified, all types of CLB instances will be queried.
     * @param Forward CLB instance type. 1: General CLB instance; 0: Classic CLB instance. If this parameter is not specified, all types of CLB instances will be queried.
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get CLB instance name. 
     * @return LoadBalancerName CLB instance name.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name.
     * @param LoadBalancerName CLB instance name.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Domain name assigned for a CLB instance by the cloud platform. 
     * @return Domain Domain name assigned for a CLB instance by the cloud platform.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name assigned for a CLB instance by the cloud platform.
     * @param Domain Domain name assigned for a CLB instance by the cloud platform.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get VIP address of a CLB instance (there can be multiple addresses). 
     * @return LoadBalancerVips VIP address of a CLB instance (there can be multiple addresses).
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set VIP address of a CLB instance (there can be multiple addresses).
     * @param LoadBalancerVips VIP address of a CLB instance (there can be multiple addresses).
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get The public network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the public IP of Cloud Virtual Machine (CVM). 
     * @return BackendPublicIps The public network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the public IP of Cloud Virtual Machine (CVM).
     */
    public String [] getBackendPublicIps() {
        return this.BackendPublicIps;
    }

    /**
     * Set The public network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the public IP of Cloud Virtual Machine (CVM).
     * @param BackendPublicIps The public network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the public IP of Cloud Virtual Machine (CVM).
     */
    public void setBackendPublicIps(String [] BackendPublicIps) {
        this.BackendPublicIps = BackendPublicIps;
    }

    /**
     * Get The private network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the private IP address of Cloud Virtual Machine (CVM). 
     * @return BackendPrivateIps The private network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the private IP address of Cloud Virtual Machine (CVM).
     */
    public String [] getBackendPrivateIps() {
        return this.BackendPrivateIps;
    }

    /**
     * Set The private network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the private IP address of Cloud Virtual Machine (CVM).
     * @param BackendPrivateIps The private network IP of the backend service bound to Cloud Load Balancer (CLB) only supports querying the private IP address of Cloud Virtual Machine (CVM).
     */
    public void setBackendPrivateIps(String [] BackendPrivateIps) {
        this.BackendPrivateIps = BackendPrivateIps;
    }

    /**
     * Get Data offset. Default: 0. 
     * @return Offset Data offset. Default: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default: 0.
     * @param Offset Data offset. Default: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of CLB instances returned. Default: 20. Maximum: 100. 
     * @return Limit Number of CLB instances returned. Default: 20. Maximum: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of CLB instances returned. Default: 20. Maximum: 100.
     * @param Limit Number of CLB instances returned. Default: 20. Maximum: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get A sorting parameter. Valid values: LoadBalancerName, CreateTime, Domain, and LoadBalancerType. 
     * @return OrderBy A sorting parameter. Valid values: LoadBalancerName, CreateTime, Domain, and LoadBalancerType.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set A sorting parameter. Valid values: LoadBalancerName, CreateTime, Domain, and LoadBalancerType.
     * @param OrderBy A sorting parameter. Valid values: LoadBalancerName, CreateTime, Domain, and LoadBalancerType.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 1: Reverse; 0: Sequential. Default: reverse by creation time 
     * @return OrderType 1: Reverse; 0: Sequential. Default: reverse by creation time
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1: Reverse; 0: Sequential. Default: reverse by creation time
     * @param OrderType 1: Reverse; 0: Sequential. Default: reverse by creation time
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Search field, supporting fuzzy match by name, domain, and VIP. 
     * @return SearchKey Search field, supporting fuzzy match by name, domain, and VIP.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search field, supporting fuzzy match by name, domain, and VIP.
     * @param SearchKey Search field, supporting fuzzy match by name, domain, and VIP.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get The ID of the project to which the CLB instance belongs. This parameter can be obtained through the DescribeProject API. 
     * @return ProjectId The ID of the project to which the CLB instance belongs. This parameter can be obtained through the DescribeProject API.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The ID of the project to which the CLB instance belongs. This parameter can be obtained through the DescribeProject API.
     * @param ProjectId The ID of the project to which the CLB instance belongs. This parameter can be obtained through the DescribeProject API.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether CLB is bound to a real server. 0: No; 1: Yes; -1: Query all. 
     * @return WithRs Whether CLB is bound to a real server. 0: No; 1: Yes; -1: Query all.
     */
    public Long getWithRs() {
        return this.WithRs;
    }

    /**
     * Set Whether CLB is bound to a real server. 0: No; 1: Yes; -1: Query all.
     * @param WithRs Whether CLB is bound to a real server. 0: No; 1: Yes; -1: Query all.
     */
    public void setWithRs(Long WithRs) {
        this.WithRs = WithRs;
    }

    /**
     * Get Unique VPC ID of the CLB instance, such as vpc-bhqkbhdx
Basic network allows input '0'. 
     * @return VpcId Unique VPC ID of the CLB instance, such as vpc-bhqkbhdx
Basic network allows input '0'.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique VPC ID of the CLB instance, such as vpc-bhqkbhdx
Basic network allows input '0'.
     * @param VpcId Unique VPC ID of the CLB instance, such as vpc-bhqkbhdx
Basic network allows input '0'.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Security group ID, for example sg-m1cc****. 
     * @return SecurityGroup Security group ID, for example sg-m1cc****.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group ID, for example sg-m1cc****.
     * @param SecurityGroup Security group ID, for example sg-m1cc****.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1). 
     * @return MasterZone Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
     * @param MasterZone Primary availability zone ID, such as 100001 (corresponding to Guangzhou Zone 1). You can obtain the list of availability zones through [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get Each request can have up to 10 `Filters` values and 100 `Filter.Values` values.<br/>`Filter.Name` and `Filter.Values` are required items. The detailed filter criteria are as follows:
<li> charge-type - String - Required: No - (Filter condition) Filter by the CLB instance billing mode, including "PREPAID", "POSTPAID_BY_HOUR".</li>
<li> internet-charge-type - String - Required: No - (Filter condition) Filter by CLB network billing mode, including "BANDWIDTH_PREPAID", "TRAFFIC_POSTPAID_BY_HOUR", "BANDWIDTH_POSTPAID_BY_HOUR", "BANDWIDTH_PACKAGE".</li>
<li> master-zone-id - String - Required: No - (Filter condition) Filter by primary AZ ID of CLB, such as "100001" (corresponding to Guangzhou Zone 1).</li>
<li>tag-key - String - required: no - (filter condition) filter by CLB tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by CLB Tag key-value pair. Replace tag-key with a specific tag key.</li>
<li> function-name - String - Required: No - (Filter condition) Filter by the function name of the Serverless Cloud Function (SCF) bound to the CLB backend.</li>
<li> vip-isp - String - Required: No - (Filter condition) Filter by operator type of CLB VIP, such as "BGP", "INTERNAL", "CMCC", "CTCC", "CUCC".</li>
<li>sla-type - String - required: no - (filter condition) filter by CLB performance capacity specification, including "clb.c2.medium", "clb.c3.small", "clb.c3.medium", "clb.c4.small", "clb.c4.medium", "clb.c4.large", "clb.c4.xlarge".</li> 
     * @return Filters Each request can have up to 10 `Filters` values and 100 `Filter.Values` values.<br/>`Filter.Name` and `Filter.Values` are required items. The detailed filter criteria are as follows:
<li> charge-type - String - Required: No - (Filter condition) Filter by the CLB instance billing mode, including "PREPAID", "POSTPAID_BY_HOUR".</li>
<li> internet-charge-type - String - Required: No - (Filter condition) Filter by CLB network billing mode, including "BANDWIDTH_PREPAID", "TRAFFIC_POSTPAID_BY_HOUR", "BANDWIDTH_POSTPAID_BY_HOUR", "BANDWIDTH_PACKAGE".</li>
<li> master-zone-id - String - Required: No - (Filter condition) Filter by primary AZ ID of CLB, such as "100001" (corresponding to Guangzhou Zone 1).</li>
<li>tag-key - String - required: no - (filter condition) filter by CLB tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by CLB Tag key-value pair. Replace tag-key with a specific tag key.</li>
<li> function-name - String - Required: No - (Filter condition) Filter by the function name of the Serverless Cloud Function (SCF) bound to the CLB backend.</li>
<li> vip-isp - String - Required: No - (Filter condition) Filter by operator type of CLB VIP, such as "BGP", "INTERNAL", "CMCC", "CTCC", "CUCC".</li>
<li>sla-type - String - required: no - (filter condition) filter by CLB performance capacity specification, including "clb.c2.medium", "clb.c3.small", "clb.c3.medium", "clb.c4.small", "clb.c4.medium", "clb.c4.large", "clb.c4.xlarge".</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters` values and 100 `Filter.Values` values.<br/>`Filter.Name` and `Filter.Values` are required items. The detailed filter criteria are as follows:
<li> charge-type - String - Required: No - (Filter condition) Filter by the CLB instance billing mode, including "PREPAID", "POSTPAID_BY_HOUR".</li>
<li> internet-charge-type - String - Required: No - (Filter condition) Filter by CLB network billing mode, including "BANDWIDTH_PREPAID", "TRAFFIC_POSTPAID_BY_HOUR", "BANDWIDTH_POSTPAID_BY_HOUR", "BANDWIDTH_PACKAGE".</li>
<li> master-zone-id - String - Required: No - (Filter condition) Filter by primary AZ ID of CLB, such as "100001" (corresponding to Guangzhou Zone 1).</li>
<li>tag-key - String - required: no - (filter condition) filter by CLB tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by CLB Tag key-value pair. Replace tag-key with a specific tag key.</li>
<li> function-name - String - Required: No - (Filter condition) Filter by the function name of the Serverless Cloud Function (SCF) bound to the CLB backend.</li>
<li> vip-isp - String - Required: No - (Filter condition) Filter by operator type of CLB VIP, such as "BGP", "INTERNAL", "CMCC", "CTCC", "CUCC".</li>
<li>sla-type - String - required: no - (filter condition) filter by CLB performance capacity specification, including "clb.c2.medium", "clb.c3.small", "clb.c3.medium", "clb.c4.small", "clb.c4.medium", "clb.c4.large", "clb.c4.xlarge".</li>
     * @param Filters Each request can have up to 10 `Filters` values and 100 `Filter.Values` values.<br/>`Filter.Name` and `Filter.Values` are required items. The detailed filter criteria are as follows:
<li> charge-type - String - Required: No - (Filter condition) Filter by the CLB instance billing mode, including "PREPAID", "POSTPAID_BY_HOUR".</li>
<li> internet-charge-type - String - Required: No - (Filter condition) Filter by CLB network billing mode, including "BANDWIDTH_PREPAID", "TRAFFIC_POSTPAID_BY_HOUR", "BANDWIDTH_POSTPAID_BY_HOUR", "BANDWIDTH_PACKAGE".</li>
<li> master-zone-id - String - Required: No - (Filter condition) Filter by primary AZ ID of CLB, such as "100001" (corresponding to Guangzhou Zone 1).</li>
<li>tag-key - String - required: no - (filter condition) filter by CLB tag key.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by CLB Tag key-value pair. Replace tag-key with a specific tag key.</li>
<li> function-name - String - Required: No - (Filter condition) Filter by the function name of the Serverless Cloud Function (SCF) bound to the CLB backend.</li>
<li> vip-isp - String - Required: No - (Filter condition) Filter by operator type of CLB VIP, such as "BGP", "INTERNAL", "CMCC", "CTCC", "CUCC".</li>
<li>sla-type - String - required: no - (filter condition) filter by CLB performance capacity specification, including "clb.c2.medium", "clb.c3.small", "clb.c3.medium", "clb.c4.small", "clb.c4.medium", "clb.c4.large", "clb.c4.xlarge".</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Select the expansion fields to return. If not specified, expansion fields are not returned by default. The supported expansion fields are as follows:
<li> TargetCount: Number of real servers bound to it</li> 
     * @return AdditionalFields Select the expansion fields to return. If not specified, expansion fields are not returned by default. The supported expansion fields are as follows:
<li> TargetCount: Number of real servers bound to it</li>
     */
    public String [] getAdditionalFields() {
        return this.AdditionalFields;
    }

    /**
     * Set Select the expansion fields to return. If not specified, expansion fields are not returned by default. The supported expansion fields are as follows:
<li> TargetCount: Number of real servers bound to it</li>
     * @param AdditionalFields Select the expansion fields to return. If not specified, expansion fields are not returned by default. The supported expansion fields are as follows:
<li> TargetCount: Number of real servers bound to it</li>
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

