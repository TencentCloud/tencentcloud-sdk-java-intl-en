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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of access points
    */
    @SerializedName("EndPointNum")
    @Expose
    private Long EndPointNum;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the cluster is healthy. 1: healthy; 0: exceptional
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * Cluster health information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthyInfo")
    @Expose
    private String HealthyInfo;

    /**
    * Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Maximum number of namespaces
    */
    @SerializedName("MaxNamespaceNum")
    @Expose
    private Long MaxNamespaceNum;

    /**
    * Maximum number of topics
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * Maximum QPS
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * Maximum message retention period in seconds
    */
    @SerializedName("MessageRetentionTime")
    @Expose
    private Long MessageRetentionTime;

    /**
    * Maximum storage capacity
    */
    @SerializedName("MaxStorageCapacity")
    @Expose
    private Long MaxStorageCapacity;

    /**
    * Cluster version
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Public network access point
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicEndPoint")
    @Expose
    private String PublicEndPoint;

    /**
    * VPC access point
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcEndPoint")
    @Expose
    private String VpcEndPoint;

    /**
    * Number of namespaces
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceNum")
    @Expose
    private Long NamespaceNum;

    /**
    * Limit of used storage in MB
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsedStorageBudget")
    @Expose
    private Long UsedStorageBudget;

    /**
    * Maximum message production rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxPublishRateInMessages")
    @Expose
    private Long MaxPublishRateInMessages;

    /**
    * Maximum message push rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDispatchRateInMessages")
    @Expose
    private Long MaxDispatchRateInMessages;

    /**
    * Maximum message production rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxPublishRateInBytes")
    @Expose
    private Long MaxPublishRateInBytes;

    /**
    * Maximum message push rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDispatchRateInBytes")
    @Expose
    private Long MaxDispatchRateInBytes;

    /**
    * Number of created topics
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Maximum message delay in seconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMessageDelayInSeconds")
    @Expose
    private Long MaxMessageDelayInSeconds;

    /**
    * Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAccessEnabled")
    @Expose
    private Boolean PublicAccessEnabled;

    /**
    * Tag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Billing mode:
`0`: Pay-as-you-go
`1`: Monthly subscription
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Number of access points 
     * @return EndPointNum Number of access points
     */
    public Long getEndPointNum() {
        return this.EndPointNum;
    }

    /**
     * Set Number of access points
     * @param EndPointNum Number of access points
     */
    public void setEndPointNum(Long EndPointNum) {
        this.EndPointNum = EndPointNum;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the cluster is healthy. 1: healthy; 0: exceptional 
     * @return Healthy Whether the cluster is healthy. 1: healthy; 0: exceptional
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Whether the cluster is healthy. 1: healthy; 0: exceptional
     * @param Healthy Whether the cluster is healthy. 1: healthy; 0: exceptional
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get Cluster health information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HealthyInfo Cluster health information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHealthyInfo() {
        return this.HealthyInfo;
    }

    /**
     * Set Cluster health information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HealthyInfo Cluster health information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthyInfo(String HealthyInfo) {
        this.HealthyInfo = HealthyInfo;
    }

    /**
     * Get Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed 
     * @return Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
     * @param Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Maximum number of namespaces 
     * @return MaxNamespaceNum Maximum number of namespaces
     */
    public Long getMaxNamespaceNum() {
        return this.MaxNamespaceNum;
    }

    /**
     * Set Maximum number of namespaces
     * @param MaxNamespaceNum Maximum number of namespaces
     */
    public void setMaxNamespaceNum(Long MaxNamespaceNum) {
        this.MaxNamespaceNum = MaxNamespaceNum;
    }

    /**
     * Get Maximum number of topics 
     * @return MaxTopicNum Maximum number of topics
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set Maximum number of topics
     * @param MaxTopicNum Maximum number of topics
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get Maximum QPS 
     * @return MaxQps Maximum QPS
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set Maximum QPS
     * @param MaxQps Maximum QPS
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get Maximum message retention period in seconds 
     * @return MessageRetentionTime Maximum message retention period in seconds
     */
    public Long getMessageRetentionTime() {
        return this.MessageRetentionTime;
    }

    /**
     * Set Maximum message retention period in seconds
     * @param MessageRetentionTime Maximum message retention period in seconds
     */
    public void setMessageRetentionTime(Long MessageRetentionTime) {
        this.MessageRetentionTime = MessageRetentionTime;
    }

    /**
     * Get Maximum storage capacity 
     * @return MaxStorageCapacity Maximum storage capacity
     */
    public Long getMaxStorageCapacity() {
        return this.MaxStorageCapacity;
    }

    /**
     * Set Maximum storage capacity
     * @param MaxStorageCapacity Maximum storage capacity
     */
    public void setMaxStorageCapacity(Long MaxStorageCapacity) {
        this.MaxStorageCapacity = MaxStorageCapacity;
    }

    /**
     * Get Cluster version
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Version Cluster version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Cluster version
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Version Cluster version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Public network access point
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicEndPoint Public network access point
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicEndPoint() {
        return this.PublicEndPoint;
    }

    /**
     * Set Public network access point
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicEndPoint Public network access point
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicEndPoint(String PublicEndPoint) {
        this.PublicEndPoint = PublicEndPoint;
    }

    /**
     * Get VPC access point
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcEndPoint VPC access point
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcEndPoint() {
        return this.VpcEndPoint;
    }

    /**
     * Set VPC access point
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcEndPoint VPC access point
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcEndPoint(String VpcEndPoint) {
        this.VpcEndPoint = VpcEndPoint;
    }

    /**
     * Get Number of namespaces
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceNum Number of namespaces
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNamespaceNum() {
        return this.NamespaceNum;
    }

    /**
     * Set Number of namespaces
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NamespaceNum Number of namespaces
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceNum(Long NamespaceNum) {
        this.NamespaceNum = NamespaceNum;
    }

    /**
     * Get Limit of used storage in MB
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsedStorageBudget Limit of used storage in MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsedStorageBudget() {
        return this.UsedStorageBudget;
    }

    /**
     * Set Limit of used storage in MB
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsedStorageBudget Limit of used storage in MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsedStorageBudget(Long UsedStorageBudget) {
        this.UsedStorageBudget = UsedStorageBudget;
    }

    /**
     * Get Maximum message production rate in messages
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxPublishRateInMessages Maximum message production rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxPublishRateInMessages() {
        return this.MaxPublishRateInMessages;
    }

    /**
     * Set Maximum message production rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxPublishRateInMessages Maximum message production rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxPublishRateInMessages(Long MaxPublishRateInMessages) {
        this.MaxPublishRateInMessages = MaxPublishRateInMessages;
    }

    /**
     * Get Maximum message push rate in messages
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxDispatchRateInMessages Maximum message push rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDispatchRateInMessages() {
        return this.MaxDispatchRateInMessages;
    }

    /**
     * Set Maximum message push rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxDispatchRateInMessages Maximum message push rate in messages
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDispatchRateInMessages(Long MaxDispatchRateInMessages) {
        this.MaxDispatchRateInMessages = MaxDispatchRateInMessages;
    }

    /**
     * Get Maximum message production rate in bytes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxPublishRateInBytes Maximum message production rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxPublishRateInBytes() {
        return this.MaxPublishRateInBytes;
    }

    /**
     * Set Maximum message production rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxPublishRateInBytes Maximum message production rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxPublishRateInBytes(Long MaxPublishRateInBytes) {
        this.MaxPublishRateInBytes = MaxPublishRateInBytes;
    }

    /**
     * Get Maximum message push rate in bytes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxDispatchRateInBytes Maximum message push rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDispatchRateInBytes() {
        return this.MaxDispatchRateInBytes;
    }

    /**
     * Set Maximum message push rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxDispatchRateInBytes Maximum message push rate in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDispatchRateInBytes(Long MaxDispatchRateInBytes) {
        this.MaxDispatchRateInBytes = MaxDispatchRateInBytes;
    }

    /**
     * Get Number of created topics
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicNum Number of created topics
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Number of created topics
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicNum Number of created topics
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Maximum message delay in seconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMessageDelayInSeconds Maximum message delay in seconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMessageDelayInSeconds() {
        return this.MaxMessageDelayInSeconds;
    }

    /**
     * Set Maximum message delay in seconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMessageDelayInSeconds Maximum message delay in seconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMessageDelayInSeconds(Long MaxMessageDelayInSeconds) {
        this.MaxMessageDelayInSeconds = MaxMessageDelayInSeconds;
    }

    /**
     * Get Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicAccessEnabled Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPublicAccessEnabled() {
        return this.PublicAccessEnabled;
    }

    /**
     * Set Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicAccessEnabled Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAccessEnabled(Boolean PublicAccessEnabled) {
        this.PublicAccessEnabled = PublicAccessEnabled;
    }

    /**
     * Get Tag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Billing mode:
`0`: Pay-as-you-go
`1`: Monthly subscription
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PayMode Billing mode:
`0`: Pay-as-you-go
`1`: Monthly subscription
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode:
`0`: Pay-as-you-go
`1`: Monthly subscription
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PayMode Billing mode:
`0`: Pay-as-you-go
`1`: Monthly subscription
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EndPointNum != null) {
            this.EndPointNum = new Long(source.EndPointNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.HealthyInfo != null) {
            this.HealthyInfo = new String(source.HealthyInfo);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MaxNamespaceNum != null) {
            this.MaxNamespaceNum = new Long(source.MaxNamespaceNum);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.MaxQps != null) {
            this.MaxQps = new Long(source.MaxQps);
        }
        if (source.MessageRetentionTime != null) {
            this.MessageRetentionTime = new Long(source.MessageRetentionTime);
        }
        if (source.MaxStorageCapacity != null) {
            this.MaxStorageCapacity = new Long(source.MaxStorageCapacity);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.PublicEndPoint != null) {
            this.PublicEndPoint = new String(source.PublicEndPoint);
        }
        if (source.VpcEndPoint != null) {
            this.VpcEndPoint = new String(source.VpcEndPoint);
        }
        if (source.NamespaceNum != null) {
            this.NamespaceNum = new Long(source.NamespaceNum);
        }
        if (source.UsedStorageBudget != null) {
            this.UsedStorageBudget = new Long(source.UsedStorageBudget);
        }
        if (source.MaxPublishRateInMessages != null) {
            this.MaxPublishRateInMessages = new Long(source.MaxPublishRateInMessages);
        }
        if (source.MaxDispatchRateInMessages != null) {
            this.MaxDispatchRateInMessages = new Long(source.MaxDispatchRateInMessages);
        }
        if (source.MaxPublishRateInBytes != null) {
            this.MaxPublishRateInBytes = new Long(source.MaxPublishRateInBytes);
        }
        if (source.MaxDispatchRateInBytes != null) {
            this.MaxDispatchRateInBytes = new Long(source.MaxDispatchRateInBytes);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.MaxMessageDelayInSeconds != null) {
            this.MaxMessageDelayInSeconds = new Long(source.MaxMessageDelayInSeconds);
        }
        if (source.PublicAccessEnabled != null) {
            this.PublicAccessEnabled = new Boolean(source.PublicAccessEnabled);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EndPointNum", this.EndPointNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "HealthyInfo", this.HealthyInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaxNamespaceNum", this.MaxNamespaceNum);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);
        this.setParamSimple(map, prefix + "MessageRetentionTime", this.MessageRetentionTime);
        this.setParamSimple(map, prefix + "MaxStorageCapacity", this.MaxStorageCapacity);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "PublicEndPoint", this.PublicEndPoint);
        this.setParamSimple(map, prefix + "VpcEndPoint", this.VpcEndPoint);
        this.setParamSimple(map, prefix + "NamespaceNum", this.NamespaceNum);
        this.setParamSimple(map, prefix + "UsedStorageBudget", this.UsedStorageBudget);
        this.setParamSimple(map, prefix + "MaxPublishRateInMessages", this.MaxPublishRateInMessages);
        this.setParamSimple(map, prefix + "MaxDispatchRateInMessages", this.MaxDispatchRateInMessages);
        this.setParamSimple(map, prefix + "MaxPublishRateInBytes", this.MaxPublishRateInBytes);
        this.setParamSimple(map, prefix + "MaxDispatchRateInBytes", this.MaxDispatchRateInBytes);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "MaxMessageDelayInSeconds", this.MaxMessageDelayInSeconds);
        this.setParamSimple(map, prefix + "PublicAccessEnabled", this.PublicAccessEnabled);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

