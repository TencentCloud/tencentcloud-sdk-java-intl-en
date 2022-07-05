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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowLogsRequest extends AbstractModel{

    /**
    * ID of the VPC instance
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The unique ID of the flow log.
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * The name of the flow log instance.
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * The resource type of the flow log. Valid values: 'VPC', 'SUBNET', and 'NETWORKINTERFACE'.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The unique ID of the resource.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Type of flow logs to be collected. Valid values: 'ACCEPT', 'REJECT' and 'ALL'.
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * The storage ID of the flow log.
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * The storage ID status of the flow log.
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * Order by field. Valid values: 'flowLogName' and 'createTime'. Default value: 'createTime'.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * In ascending (`asc`) or descending (`desc`) order. Default value: 'desc'.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * The offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of rows per page. Default value: 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter condition. `FlowLogIds` and `Filters` cannot be specified at the same time.
<li>tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair. The tag-key should be replaced with a specified tag key.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * The region corresponding to the flow log storage ID.
    */
    @SerializedName("CloudLogRegion")
    @Expose
    private String CloudLogRegion;

    /**
     * Get ID of the VPC instance 
     * @return VpcId ID of the VPC instance
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance
     * @param VpcId ID of the VPC instance
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The unique ID of the flow log. 
     * @return FlowLogId The unique ID of the flow log.
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set The unique ID of the flow log.
     * @param FlowLogId The unique ID of the flow log.
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get The name of the flow log instance. 
     * @return FlowLogName The name of the flow log instance.
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set The name of the flow log instance.
     * @param FlowLogName The name of the flow log instance.
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get The resource type of the flow log. Valid values: 'VPC', 'SUBNET', and 'NETWORKINTERFACE'. 
     * @return ResourceType The resource type of the flow log. Valid values: 'VPC', 'SUBNET', and 'NETWORKINTERFACE'.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The resource type of the flow log. Valid values: 'VPC', 'SUBNET', and 'NETWORKINTERFACE'.
     * @param ResourceType The resource type of the flow log. Valid values: 'VPC', 'SUBNET', and 'NETWORKINTERFACE'.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The unique ID of the resource. 
     * @return ResourceId The unique ID of the resource.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set The unique ID of the resource.
     * @param ResourceId The unique ID of the resource.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Type of flow logs to be collected. Valid values: 'ACCEPT', 'REJECT' and 'ALL'. 
     * @return TrafficType Type of flow logs to be collected. Valid values: 'ACCEPT', 'REJECT' and 'ALL'.
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set Type of flow logs to be collected. Valid values: 'ACCEPT', 'REJECT' and 'ALL'.
     * @param TrafficType Type of flow logs to be collected. Valid values: 'ACCEPT', 'REJECT' and 'ALL'.
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get The storage ID of the flow log. 
     * @return CloudLogId The storage ID of the flow log.
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set The storage ID of the flow log.
     * @param CloudLogId The storage ID of the flow log.
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get The storage ID status of the flow log. 
     * @return CloudLogState The storage ID status of the flow log.
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * Set The storage ID status of the flow log.
     * @param CloudLogState The storage ID status of the flow log.
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * Get Order by field. Valid values: 'flowLogName' and 'createTime'. Default value: 'createTime'. 
     * @return OrderField Order by field. Valid values: 'flowLogName' and 'createTime'. Default value: 'createTime'.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Order by field. Valid values: 'flowLogName' and 'createTime'. Default value: 'createTime'.
     * @param OrderField Order by field. Valid values: 'flowLogName' and 'createTime'. Default value: 'createTime'.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get In ascending (`asc`) or descending (`desc`) order. Default value: 'desc'. 
     * @return OrderDirection In ascending (`asc`) or descending (`desc`) order. Default value: 'desc'.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set In ascending (`asc`) or descending (`desc`) order. Default value: 'desc'.
     * @param OrderDirection In ascending (`asc`) or descending (`desc`) order. Default value: 'desc'.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get The offset. Default value: 0. 
     * @return Offset The offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: 0.
     * @param Offset The offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of rows per page. Default value: 10. 
     * @return Limit The number of rows per page. Default value: 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of rows per page. Default value: 10.
     * @param Limit The number of rows per page. Default value: 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter condition. `FlowLogIds` and `Filters` cannot be specified at the same time.
<li>tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair. The tag-key should be replaced with a specified tag key.</li> 
     * @return Filters Filter condition. `FlowLogIds` and `Filters` cannot be specified at the same time.
<li>tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair. The tag-key should be replaced with a specified tag key.</li>
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `FlowLogIds` and `Filters` cannot be specified at the same time.
<li>tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair. The tag-key should be replaced with a specified tag key.</li>
     * @param Filters Filter condition. `FlowLogIds` and `Filters` cannot be specified at the same time.
<li>tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair. The tag-key should be replaced with a specified tag key.</li>
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The region corresponding to the flow log storage ID. 
     * @return CloudLogRegion The region corresponding to the flow log storage ID.
     */
    public String getCloudLogRegion() {
        return this.CloudLogRegion;
    }

    /**
     * Set The region corresponding to the flow log storage ID.
     * @param CloudLogRegion The region corresponding to the flow log storage ID.
     */
    public void setCloudLogRegion(String CloudLogRegion) {
        this.CloudLogRegion = CloudLogRegion;
    }

    public DescribeFlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowLogsRequest(DescribeFlowLogsRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FlowLogId != null) {
            this.FlowLogId = new String(source.FlowLogId);
        }
        if (source.FlowLogName != null) {
            this.FlowLogName = new String(source.FlowLogName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogState != null) {
            this.CloudLogState = new String(source.CloudLogState);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.CloudLogRegion != null) {
            this.CloudLogRegion = new String(source.CloudLogRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogState", this.CloudLogState);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CloudLogRegion", this.CloudLogRegion);

    }
}

