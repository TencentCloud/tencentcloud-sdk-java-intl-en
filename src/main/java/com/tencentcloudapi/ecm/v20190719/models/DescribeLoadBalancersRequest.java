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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel{

    /**
    * Region. If this parameter is not specified, the information of all regions will be queried by default.
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * CLB instance ID.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * CLB instance name.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * VIP address of the CLB instance. There can be multiple addresses.
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * Private IP of the real server bound to the CLB.
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
    * Whether the CLB instance is bound to a real server. 0: no; 1: yes; -1: query all. 
If this parameter is not specified, all will be queried by default.
    */
    @SerializedName("WithBackend")
    @Expose
    private Long WithBackend;

    /**
    * Unique VPC ID of the CLB instance, such as `vpc-bhqkbhdx`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Each request can contain up to 10 `Filters` and 100 `Filter.Values`. The detailed filters are as follows:
tag-key - String - Required: no - (Filter) Filter by tag key.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Security group.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
     * Get Region. If this parameter is not specified, the information of all regions will be queried by default. 
     * @return EcmRegion Region. If this parameter is not specified, the information of all regions will be queried by default.
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set Region. If this parameter is not specified, the information of all regions will be queried by default.
     * @param EcmRegion Region. If this parameter is not specified, the information of all regions will be queried by default.
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get CLB instance ID. 
     * @return LoadBalancerIds CLB instance ID.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set CLB instance ID.
     * @param LoadBalancerIds CLB instance ID.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
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
     * Get VIP address of the CLB instance. There can be multiple addresses. 
     * @return LoadBalancerVips VIP address of the CLB instance. There can be multiple addresses.
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set VIP address of the CLB instance. There can be multiple addresses.
     * @param LoadBalancerVips VIP address of the CLB instance. There can be multiple addresses.
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get Private IP of the real server bound to the CLB. 
     * @return BackendPrivateIps Private IP of the real server bound to the CLB.
     */
    public String [] getBackendPrivateIps() {
        return this.BackendPrivateIps;
    }

    /**
     * Set Private IP of the real server bound to the CLB.
     * @param BackendPrivateIps Private IP of the real server bound to the CLB.
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
     * Get Whether the CLB instance is bound to a real server. 0: no; 1: yes; -1: query all. 
If this parameter is not specified, all will be queried by default. 
     * @return WithBackend Whether the CLB instance is bound to a real server. 0: no; 1: yes; -1: query all. 
If this parameter is not specified, all will be queried by default.
     */
    public Long getWithBackend() {
        return this.WithBackend;
    }

    /**
     * Set Whether the CLB instance is bound to a real server. 0: no; 1: yes; -1: query all. 
If this parameter is not specified, all will be queried by default.
     * @param WithBackend Whether the CLB instance is bound to a real server. 0: no; 1: yes; -1: query all. 
If this parameter is not specified, all will be queried by default.
     */
    public void setWithBackend(Long WithBackend) {
        this.WithBackend = WithBackend;
    }

    /**
     * Get Unique VPC ID of the CLB instance, such as `vpc-bhqkbhdx`. 
     * @return VpcId Unique VPC ID of the CLB instance, such as `vpc-bhqkbhdx`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique VPC ID of the CLB instance, such as `vpc-bhqkbhdx`.
     * @param VpcId Unique VPC ID of the CLB instance, such as `vpc-bhqkbhdx`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Each request can contain up to 10 `Filters` and 100 `Filter.Values`. The detailed filters are as follows:
tag-key - String - Required: no - (Filter) Filter by tag key. 
     * @return Filters Each request can contain up to 10 `Filters` and 100 `Filter.Values`. The detailed filters are as follows:
tag-key - String - Required: no - (Filter) Filter by tag key.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can contain up to 10 `Filters` and 100 `Filter.Values`. The detailed filters are as follows:
tag-key - String - Required: no - (Filter) Filter by tag key.
     * @param Filters Each request can contain up to 10 `Filters` and 100 `Filter.Values`. The detailed filters are as follows:
tag-key - String - Required: no - (Filter) Filter by tag key.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Security group. 
     * @return SecurityGroup Security group.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group.
     * @param SecurityGroup Security group.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    public DescribeLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersRequest(DescribeLoadBalancersRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
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
        if (source.WithBackend != null) {
            this.WithBackend = new Long(source.WithBackend);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamArraySimple(map, prefix + "BackendPrivateIps.", this.BackendPrivateIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "WithBackend", this.WithBackend);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);

    }
}

