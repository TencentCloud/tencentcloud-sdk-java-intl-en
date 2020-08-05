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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExistedInstancesRequest extends AbstractModel{

    /**
    * Cluster ID. Enter the `ClusterId` field returned when you call the DescribeClusters API (Only VPC ID obtained through `ClusterId` need filtering conditions. When comparing statuses, the nodes on all clusters in this region will be used for comparison. You cannot specify `InstanceIds` and `ClusterId` at the same time.)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Query by one or more instance ID(s). Instance ID format: ins-xxxxxxxx. (Refer to section ID.N of the API overview for this parameter's specific format.) Up to 100 instances are allowed for each request. You cannot specify InstanceIds and Filters at the same time.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter condition. For fields and other information, see [the DescribeInstances API](https://cloud.tencent.com/document/api/213/15728). If a ClusterId has been set, then the cluster's VPC ID will be attached as a query field. In this situation, if a "vpc-id" is specified in Filter, then the specified VPC ID must be consistent with the cluster's VPC ID.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Filter by instance IP (Supports both private and public IPs)
    */
    @SerializedName("VagueIpAddress")
    @Expose
    private String VagueIpAddress;

    /**
    * Filter by instance name
    */
    @SerializedName("VagueInstanceName")
    @Expose
    private String VagueInstanceName;

    /**
    * Offset. Default value: 0. For more information on Offset, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on Limit, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster ID. Enter the `ClusterId` field returned when you call the DescribeClusters API (Only VPC ID obtained through `ClusterId` need filtering conditions. When comparing statuses, the nodes on all clusters in this region will be used for comparison. You cannot specify `InstanceIds` and `ClusterId` at the same time.) 
     * @return ClusterId Cluster ID. Enter the `ClusterId` field returned when you call the DescribeClusters API (Only VPC ID obtained through `ClusterId` need filtering conditions. When comparing statuses, the nodes on all clusters in this region will be used for comparison. You cannot specify `InstanceIds` and `ClusterId` at the same time.)
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID. Enter the `ClusterId` field returned when you call the DescribeClusters API (Only VPC ID obtained through `ClusterId` need filtering conditions. When comparing statuses, the nodes on all clusters in this region will be used for comparison. You cannot specify `InstanceIds` and `ClusterId` at the same time.)
     * @param ClusterId Cluster ID. Enter the `ClusterId` field returned when you call the DescribeClusters API (Only VPC ID obtained through `ClusterId` need filtering conditions. When comparing statuses, the nodes on all clusters in this region will be used for comparison. You cannot specify `InstanceIds` and `ClusterId` at the same time.)
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Query by one or more instance ID(s). Instance ID format: ins-xxxxxxxx. (Refer to section ID.N of the API overview for this parameter's specific format.) Up to 100 instances are allowed for each request. You cannot specify InstanceIds and Filters at the same time. 
     * @return InstanceIds Query by one or more instance ID(s). Instance ID format: ins-xxxxxxxx. (Refer to section ID.N of the API overview for this parameter's specific format.) Up to 100 instances are allowed for each request. You cannot specify InstanceIds and Filters at the same time.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Query by one or more instance ID(s). Instance ID format: ins-xxxxxxxx. (Refer to section ID.N of the API overview for this parameter's specific format.) Up to 100 instances are allowed for each request. You cannot specify InstanceIds and Filters at the same time.
     * @param InstanceIds Query by one or more instance ID(s). Instance ID format: ins-xxxxxxxx. (Refer to section ID.N of the API overview for this parameter's specific format.) Up to 100 instances are allowed for each request. You cannot specify InstanceIds and Filters at the same time.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter condition. For fields and other information, see [the DescribeInstances API](https://cloud.tencent.com/document/api/213/15728). If a ClusterId has been set, then the cluster's VPC ID will be attached as a query field. In this situation, if a "vpc-id" is specified in Filter, then the specified VPC ID must be consistent with the cluster's VPC ID. 
     * @return Filters Filter condition. For fields and other information, see [the DescribeInstances API](https://cloud.tencent.com/document/api/213/15728). If a ClusterId has been set, then the cluster's VPC ID will be attached as a query field. In this situation, if a "vpc-id" is specified in Filter, then the specified VPC ID must be consistent with the cluster's VPC ID.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. For fields and other information, see [the DescribeInstances API](https://cloud.tencent.com/document/api/213/15728). If a ClusterId has been set, then the cluster's VPC ID will be attached as a query field. In this situation, if a "vpc-id" is specified in Filter, then the specified VPC ID must be consistent with the cluster's VPC ID.
     * @param Filters Filter condition. For fields and other information, see [the DescribeInstances API](https://cloud.tencent.com/document/api/213/15728). If a ClusterId has been set, then the cluster's VPC ID will be attached as a query field. In this situation, if a "vpc-id" is specified in Filter, then the specified VPC ID must be consistent with the cluster's VPC ID.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Filter by instance IP (Supports both private and public IPs) 
     * @return VagueIpAddress Filter by instance IP (Supports both private and public IPs)
     */
    public String getVagueIpAddress() {
        return this.VagueIpAddress;
    }

    /**
     * Set Filter by instance IP (Supports both private and public IPs)
     * @param VagueIpAddress Filter by instance IP (Supports both private and public IPs)
     */
    public void setVagueIpAddress(String VagueIpAddress) {
        this.VagueIpAddress = VagueIpAddress;
    }

    /**
     * Get Filter by instance name 
     * @return VagueInstanceName Filter by instance name
     */
    public String getVagueInstanceName() {
        return this.VagueInstanceName;
    }

    /**
     * Set Filter by instance name
     * @param VagueInstanceName Filter by instance name
     */
    public void setVagueInstanceName(String VagueInstanceName) {
        this.VagueInstanceName = VagueInstanceName;
    }

    /**
     * Get Offset. Default value: 0. For more information on Offset, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688). 
     * @return Offset Offset. Default value: 0. For more information on Offset, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on Offset, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
     * @param Offset Offset. Default value: 0. For more information on Offset, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on Limit, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on Limit, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on Limit, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on Limit, see the relevant section in the API [Introduction](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "VagueIpAddress", this.VagueIpAddress);
        this.setParamSimple(map, prefix + "VagueInstanceName", this.VagueInstanceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

