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

public class CreateFlowLogRequest extends AbstractModel{

    /**
    * The name of the flow log instance.
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * The type of resource associated with the flow log. Valid values: `VPC`, `SUBNET`, `NETWORKINTERFACE`, `CCN`, `NAT`, and `DCG`.
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
    * Type of the flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the `ResourceType` is set to `CCN`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The description of the flow log instance
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * The storage ID of the flow log.
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Consumer types: `cls` and `ckafka`
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Information of the flow log consumer, which is required when the consumer type is `ckafka`.
    */
    @SerializedName("FlowLogStorage")
    @Expose
    private FlowLogStorage FlowLogStorage;

    /**
    * The region corresponding to the flow log storage ID. If not passed in, this field defaults to the current region.
    */
    @SerializedName("CloudLogRegion")
    @Expose
    private String CloudLogRegion;

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
     * Get The type of resource associated with the flow log. Valid values: `VPC`, `SUBNET`, `NETWORKINTERFACE`, `CCN`, `NAT`, and `DCG`. 
     * @return ResourceType The type of resource associated with the flow log. Valid values: `VPC`, `SUBNET`, `NETWORKINTERFACE`, `CCN`, `NAT`, and `DCG`.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The type of resource associated with the flow log. Valid values: `VPC`, `SUBNET`, `NETWORKINTERFACE`, `CCN`, `NAT`, and `DCG`.
     * @param ResourceType The type of resource associated with the flow log. Valid values: `VPC`, `SUBNET`, `NETWORKINTERFACE`, `CCN`, `NAT`, and `DCG`.
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
     * Get Type of the flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`. 
     * @return TrafficType Type of the flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set Type of the flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
     * @param TrafficType Type of the flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the `ResourceType` is set to `CCN`. 
     * @return VpcId The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the `ResourceType` is set to `CCN`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the `ResourceType` is set to `CCN`.
     * @param VpcId The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the `ResourceType` is set to `CCN`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The description of the flow log instance 
     * @return FlowLogDescription The description of the flow log instance
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set The description of the flow log instance
     * @param FlowLogDescription The description of the flow log instance
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
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
     * Get Bound tags, such as [{"Key": "city", "Value": "shanghai"}] 
     * @return Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
     * @param Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Consumer types: `cls` and `ckafka` 
     * @return StorageType Consumer types: `cls` and `ckafka`
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Consumer types: `cls` and `ckafka`
     * @param StorageType Consumer types: `cls` and `ckafka`
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Information of the flow log consumer, which is required when the consumer type is `ckafka`. 
     * @return FlowLogStorage Information of the flow log consumer, which is required when the consumer type is `ckafka`.
     */
    public FlowLogStorage getFlowLogStorage() {
        return this.FlowLogStorage;
    }

    /**
     * Set Information of the flow log consumer, which is required when the consumer type is `ckafka`.
     * @param FlowLogStorage Information of the flow log consumer, which is required when the consumer type is `ckafka`.
     */
    public void setFlowLogStorage(FlowLogStorage FlowLogStorage) {
        this.FlowLogStorage = FlowLogStorage;
    }

    /**
     * Get The region corresponding to the flow log storage ID. If not passed in, this field defaults to the current region. 
     * @return CloudLogRegion The region corresponding to the flow log storage ID. If not passed in, this field defaults to the current region.
     */
    public String getCloudLogRegion() {
        return this.CloudLogRegion;
    }

    /**
     * Set The region corresponding to the flow log storage ID. If not passed in, this field defaults to the current region.
     * @param CloudLogRegion The region corresponding to the flow log storage ID. If not passed in, this field defaults to the current region.
     */
    public void setCloudLogRegion(String CloudLogRegion) {
        this.CloudLogRegion = CloudLogRegion;
    }

    public CreateFlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowLogRequest(CreateFlowLogRequest source) {
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
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.FlowLogStorage != null) {
            this.FlowLogStorage = new FlowLogStorage(source.FlowLogStorage);
        }
        if (source.CloudLogRegion != null) {
            this.CloudLogRegion = new String(source.CloudLogRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "FlowLogStorage.", this.FlowLogStorage);
        this.setParamSimple(map, prefix + "CloudLogRegion", this.CloudLogRegion);

    }
}

