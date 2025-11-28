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

public class CmqTopic extends AbstractModel {

    /**
    * Topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Maximum lifetime of messages in a topic. After the time specified by this parameter has elapsed since sending to this topic, the message will be deleted whether or not it has been successfully pushed to the user. Measured in seconds and fixed at one day (86,400 seconds). This attribute cannot be modified.
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * Maximum message length. value range: 1024-1048576 bytes (1-1024 kb). default value: 1048576.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Number of messages published per second.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Describes the filtering policy selected by users when creating subscriptions.
FilterType = 1 means when users use Tag filtering with FilterTag.
FilterType = 2 indicates user use BindingKey for filtering.
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * Topic creation time. Returns a Unix timestamp, accurate to milliseconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * The last time the topic attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * Number of messages in the current topic (message backlog).
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * Tenant ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Specifies the namespace name.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0: Pulsar, 1: RocketMQ
    */
    @SerializedName("BrokerType")
    @Expose
    private Long BrokerType;

    /**
    * Number of Subscriptions
    */
    @SerializedName("SubscriptionCount")
    @Expose
    private Long SubscriptionCount;

    /**
     * Get Topic ID. 
     * @return TopicId Topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID.
     * @param TopicId Topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic name. 
     * @return TopicName Topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
     * @param TopicName Topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Maximum lifetime of messages in a topic. After the time specified by this parameter has elapsed since sending to this topic, the message will be deleted whether or not it has been successfully pushed to the user. Measured in seconds and fixed at one day (86,400 seconds). This attribute cannot be modified. 
     * @return MsgRetentionSeconds Maximum lifetime of messages in a topic. After the time specified by this parameter has elapsed since sending to this topic, the message will be deleted whether or not it has been successfully pushed to the user. Measured in seconds and fixed at one day (86,400 seconds). This attribute cannot be modified.
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set Maximum lifetime of messages in a topic. After the time specified by this parameter has elapsed since sending to this topic, the message will be deleted whether or not it has been successfully pushed to the user. Measured in seconds and fixed at one day (86,400 seconds). This attribute cannot be modified.
     * @param MsgRetentionSeconds Maximum lifetime of messages in a topic. After the time specified by this parameter has elapsed since sending to this topic, the message will be deleted whether or not it has been successfully pushed to the user. Measured in seconds and fixed at one day (86,400 seconds). This attribute cannot be modified.
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get Maximum message length. value range: 1024-1048576 bytes (1-1024 kb). default value: 1048576. 
     * @return MaxMsgSize Maximum message length. value range: 1024-1048576 bytes (1-1024 kb). default value: 1048576.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set Maximum message length. value range: 1024-1048576 bytes (1-1024 kb). default value: 1048576.
     * @param MaxMsgSize Maximum message length. value range: 1024-1048576 bytes (1-1024 kb). default value: 1048576.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Number of messages published per second. 
     * @return Qps Number of messages published per second.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Number of messages published per second.
     * @param Qps Number of messages published per second.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Describes the filtering policy selected by users when creating subscriptions.
FilterType = 1 means when users use Tag filtering with FilterTag.
FilterType = 2 indicates user use BindingKey for filtering. 
     * @return FilterType Describes the filtering policy selected by users when creating subscriptions.
FilterType = 1 means when users use Tag filtering with FilterTag.
FilterType = 2 indicates user use BindingKey for filtering.
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Describes the filtering policy selected by users when creating subscriptions.
FilterType = 1 means when users use Tag filtering with FilterTag.
FilterType = 2 indicates user use BindingKey for filtering.
     * @param FilterType Describes the filtering policy selected by users when creating subscriptions.
FilterType = 1 means when users use Tag filtering with FilterTag.
FilterType = 2 indicates user use BindingKey for filtering.
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Topic creation time. Returns a Unix timestamp, accurate to milliseconds. 
     * @return CreateTime Topic creation time. Returns a Unix timestamp, accurate to milliseconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Topic creation time. Returns a Unix timestamp, accurate to milliseconds.
     * @param CreateTime Topic creation time. Returns a Unix timestamp, accurate to milliseconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last time the topic attribute was modified. Returns a Unix timestamp, accurate to milliseconds. 
     * @return LastModifyTime The last time the topic attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set The last time the topic attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     * @param LastModifyTime The last time the topic attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get Number of messages in the current topic (message backlog). 
     * @return MsgCount Number of messages in the current topic (message backlog).
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set Number of messages in the current topic (message backlog).
     * @param MsgCount Number of messages in the current topic (message backlog).
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateUin Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateUin Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Associated tag.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Trace Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Trace Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get Tenant ID 
     * @return TenantId Tenant ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
     * @param TenantId Tenant ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Specifies the namespace name. 
     * @return NamespaceName Specifies the namespace name.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Specifies the namespace name.
     * @param NamespaceName Specifies the namespace name.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed 
     * @return Status Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
     * @param Status Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0: Pulsar, 1: RocketMQ 
     * @return BrokerType 0: Pulsar, 1: RocketMQ
     */
    public Long getBrokerType() {
        return this.BrokerType;
    }

    /**
     * Set 0: Pulsar, 1: RocketMQ
     * @param BrokerType 0: Pulsar, 1: RocketMQ
     */
    public void setBrokerType(Long BrokerType) {
        this.BrokerType = BrokerType;
    }

    /**
     * Get Number of Subscriptions 
     * @return SubscriptionCount Number of Subscriptions
     */
    public Long getSubscriptionCount() {
        return this.SubscriptionCount;
    }

    /**
     * Set Number of Subscriptions
     * @param SubscriptionCount Number of Subscriptions
     */
    public void setSubscriptionCount(Long SubscriptionCount) {
        this.SubscriptionCount = SubscriptionCount;
    }

    public CmqTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqTopic(CmqTopic source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.MsgCount != null) {
            this.MsgCount = new Long(source.MsgCount);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BrokerType != null) {
            this.BrokerType = new Long(source.BrokerType);
        }
        if (source.SubscriptionCount != null) {
            this.SubscriptionCount = new Long(source.SubscriptionCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Trace", this.Trace);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BrokerType", this.BrokerType);
        this.setParamSimple(map, prefix + "SubscriptionCount", this.SubscriptionCount);

    }
}

