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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel{

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
    * CLB instance name.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Domain name assigned to a CLB instance by Tencent Cloud. This parameter is meaningful only for the public network classic CLB.
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
    * Sort by parameter. Value range: LoadBalancerName, CreateTime, Domain, LoadBalancerType.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1: reverse; 0: sequential. Default value: reverse by creation time |
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Search field which fuzzy matches name, domain name, or VIP.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API.
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
    * VPC where a CLB instance resides, such as vpc-bhqkbhdx.
Basic network does not support queries by VpcId.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Security group ID, e.g., `sg-m1cc****`.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * Primary AZ ID, e.g., `100001` (Guangzhou Zone 1).
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
     * Get Domain name assigned to a CLB instance by Tencent Cloud. This parameter is meaningful only for the public network classic CLB. 
     * @return Domain Domain name assigned to a CLB instance by Tencent Cloud. This parameter is meaningful only for the public network classic CLB.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name assigned to a CLB instance by Tencent Cloud. This parameter is meaningful only for the public network classic CLB.
     * @param Domain Domain name assigned to a CLB instance by Tencent Cloud. This parameter is meaningful only for the public network classic CLB.
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
     * Get Sort by parameter. Value range: LoadBalancerName, CreateTime, Domain, LoadBalancerType. 
     * @return OrderBy Sort by parameter. Value range: LoadBalancerName, CreateTime, Domain, LoadBalancerType.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by parameter. Value range: LoadBalancerName, CreateTime, Domain, LoadBalancerType.
     * @param OrderBy Sort by parameter. Value range: LoadBalancerName, CreateTime, Domain, LoadBalancerType.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 1: reverse; 0: sequential. Default value: reverse by creation time | 
     * @return OrderType 1: reverse; 0: sequential. Default value: reverse by creation time |
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1: reverse; 0: sequential. Default value: reverse by creation time |
     * @param OrderType 1: reverse; 0: sequential. Default value: reverse by creation time |
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Search field which fuzzy matches name, domain name, or VIP. 
     * @return SearchKey Search field which fuzzy matches name, domain name, or VIP.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search field which fuzzy matches name, domain name, or VIP.
     * @param SearchKey Search field which fuzzy matches name, domain name, or VIP.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API. 
     * @return ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API.
     * @param ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API.
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
     * Get VPC where a CLB instance resides, such as vpc-bhqkbhdx.
Basic network does not support queries by VpcId. 
     * @return VpcId VPC where a CLB instance resides, such as vpc-bhqkbhdx.
Basic network does not support queries by VpcId.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC where a CLB instance resides, such as vpc-bhqkbhdx.
Basic network does not support queries by VpcId.
     * @param VpcId VPC where a CLB instance resides, such as vpc-bhqkbhdx.
Basic network does not support queries by VpcId.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Security group ID, e.g., `sg-m1cc****`. 
     * @return SecurityGroup Security group ID, e.g., `sg-m1cc****`.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group ID, e.g., `sg-m1cc****`.
     * @param SecurityGroup Security group ID, e.g., `sg-m1cc****`.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Primary AZ ID, e.g., `100001` (Guangzhou Zone 1). 
     * @return MasterZone Primary AZ ID, e.g., `100001` (Guangzhou Zone 1).
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary AZ ID, e.g., `100001` (Guangzhou Zone 1).
     * @param MasterZone Primary AZ ID, e.g., `100001` (Guangzhou Zone 1).
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

    }
}

