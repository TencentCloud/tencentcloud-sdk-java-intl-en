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
    * The VPC ID or the unified ID. We recommend you use the unified ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The unique ID of the flow log
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * The name of the flow log instance
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * The type of resource to which the flow log belongs. VPC|SUBNET|NETWORKINTERFACE
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The unique ID of the resource
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * The collection type of the flow log. ACCEPT|REJECT|ALL
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * The storage ID of the flow log
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * Flow log storage ID status
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * Order by field. Supported fields: flowLogName, createTime. The default value is createTime.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Ascending (asc) and descending (desc). The default value is desc.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of rows per page. The default value is 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The VPC ID or the unified ID. We recommend you use the unified ID 
     * @return VpcId The VPC ID or the unified ID. We recommend you use the unified ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The VPC ID or the unified ID. We recommend you use the unified ID
     * @param VpcId The VPC ID or the unified ID. We recommend you use the unified ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The unique ID of the flow log 
     * @return FlowLogId The unique ID of the flow log
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set The unique ID of the flow log
     * @param FlowLogId The unique ID of the flow log
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get The name of the flow log instance 
     * @return FlowLogName The name of the flow log instance
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set The name of the flow log instance
     * @param FlowLogName The name of the flow log instance
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get The type of resource to which the flow log belongs. VPC|SUBNET|NETWORKINTERFACE 
     * @return ResourceType The type of resource to which the flow log belongs. VPC|SUBNET|NETWORKINTERFACE
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The type of resource to which the flow log belongs. VPC|SUBNET|NETWORKINTERFACE
     * @param ResourceType The type of resource to which the flow log belongs. VPC|SUBNET|NETWORKINTERFACE
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The unique ID of the resource 
     * @return ResourceId The unique ID of the resource
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set The unique ID of the resource
     * @param ResourceId The unique ID of the resource
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get The collection type of the flow log. ACCEPT|REJECT|ALL 
     * @return TrafficType The collection type of the flow log. ACCEPT|REJECT|ALL
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set The collection type of the flow log. ACCEPT|REJECT|ALL
     * @param TrafficType The collection type of the flow log. ACCEPT|REJECT|ALL
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get The storage ID of the flow log 
     * @return CloudLogId The storage ID of the flow log
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set The storage ID of the flow log
     * @param CloudLogId The storage ID of the flow log
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get Flow log storage ID status 
     * @return CloudLogState Flow log storage ID status
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * Set Flow log storage ID status
     * @param CloudLogState Flow log storage ID status
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * Get Order by field. Supported fields: flowLogName, createTime. The default value is createTime. 
     * @return OrderField Order by field. Supported fields: flowLogName, createTime. The default value is createTime.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Order by field. Supported fields: flowLogName, createTime. The default value is createTime.
     * @param OrderField Order by field. Supported fields: flowLogName, createTime. The default value is createTime.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Ascending (asc) and descending (desc). The default value is desc. 
     * @return OrderDirection Ascending (asc) and descending (desc). The default value is desc.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Ascending (asc) and descending (desc). The default value is desc.
     * @param OrderDirection Ascending (asc) and descending (desc). The default value is desc.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of rows per page. The default value is 10. 
     * @return Limit The number of rows per page. The default value is 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of rows per page. The default value is 10.
     * @param Limit The number of rows per page. The default value is 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

