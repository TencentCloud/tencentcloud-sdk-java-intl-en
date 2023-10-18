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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowLog extends AbstractModel {

    /**
    * ID of the VPC instance.
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
    * The type of resource associated with the flow log. Valid values: `VPC`, `SUBNET`, `NETWORKINTERFACE`, `CCN`, `NAT`, and `DCG`.
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
    * Type of flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
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
    * Flow log storage ID status.
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * The flow log description.
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * The creation time of the flow log.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Tag list, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Whether to enable. `true`: yes; `false`: no.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Consumer end types: cls and ckafka
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Information of the consumer, which is returned when the consumer type is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("FlowLogStorage")
    @Expose
    private FlowLogStorage FlowLogStorage;

    /**
    * The region corresponding to the flow log storage ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudLogRegion")
    @Expose
    private String CloudLogRegion;

    /**
     * Get ID of the VPC instance. 
     * @return VpcId ID of the VPC instance.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance.
     * @param VpcId ID of the VPC instance.
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
     * Get Type of flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`. 
     * @return TrafficType Type of flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set Type of flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
     * @param TrafficType Type of flow logs to be collected. Valid values: `ACCEPT`, `REJECT` and `ALL`.
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
     * Get Flow log storage ID status. 
     * @return CloudLogState Flow log storage ID status.
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * Set Flow log storage ID status.
     * @param CloudLogState Flow log storage ID status.
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * Get The flow log description. 
     * @return FlowLogDescription The flow log description.
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set The flow log description.
     * @param FlowLogDescription The flow log description.
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Get The creation time of the flow log. 
     * @return CreatedTime The creation time of the flow log.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time of the flow log.
     * @param CreatedTime The creation time of the flow log.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Tag list, such as [{"Key": "city", "Value": "shanghai"}]. 
     * @return TagSet Tag list, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list, such as [{"Key": "city", "Value": "shanghai"}].
     * @param TagSet Tag list, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Whether to enable. `true`: yes; `false`: no. 
     * @return Enable Whether to enable. `true`: yes; `false`: no.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. `true`: yes; `false`: no.
     * @param Enable Whether to enable. `true`: yes; `false`: no.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Consumer end types: cls and ckafka
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return StorageType Consumer end types: cls and ckafka
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Consumer end types: cls and ckafka
Note: this field may return `null`, indicating that no valid value can be found.
     * @param StorageType Consumer end types: cls and ckafka
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Information of the consumer, which is returned when the consumer type is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return FlowLogStorage Information of the consumer, which is returned when the consumer type is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public FlowLogStorage getFlowLogStorage() {
        return this.FlowLogStorage;
    }

    /**
     * Set Information of the consumer, which is returned when the consumer type is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param FlowLogStorage Information of the consumer, which is returned when the consumer type is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setFlowLogStorage(FlowLogStorage FlowLogStorage) {
        this.FlowLogStorage = FlowLogStorage;
    }

    /**
     * Get The region corresponding to the flow log storage ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CloudLogRegion The region corresponding to the flow log storage ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCloudLogRegion() {
        return this.CloudLogRegion;
    }

    /**
     * Set The region corresponding to the flow log storage ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CloudLogRegion The region corresponding to the flow log storage ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCloudLogRegion(String CloudLogRegion) {
        this.CloudLogRegion = CloudLogRegion;
    }

    public FlowLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowLog(FlowLog source) {
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
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
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
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogState", this.CloudLogState);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "FlowLogStorage.", this.FlowLogStorage);
        this.setParamSimple(map, prefix + "CloudLogRegion", this.CloudLogRegion);

    }
}

