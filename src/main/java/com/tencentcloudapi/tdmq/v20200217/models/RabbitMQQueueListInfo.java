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

public class RabbitMQQueueListInfo extends AbstractModel {

    /**
    * Queue name
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Consumer information.
    */
    @SerializedName("ConsumerDetail")
    @Expose
    private RabbitMQQueueListConsumerDetailInfo ConsumerDetail;

    /**
    * Queue type. Valid values: "classic" and "quorum".
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * Number of retained messages

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * Message production rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * Message consumption rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Whether the queue is durable. true: durable; false: non-durable.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Whether automatic deletion is set for the queue. true: automatic deletion set; false: automatic deletion not set.
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * Instance ID of the queue.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost name of the queue.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Primary node name of the queue.
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * Indicates the name of the effective policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Extended parameters of the key-value object type.
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * Whether the queue is exclusive.
    */
    @SerializedName("Exclusive")
    @Expose
    private Boolean Exclusive;

    /**
    * Creation time timestamp.
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * Modification time timestamp.
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
     * Get Queue name 
     * @return QueueName Queue name
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name
     * @param QueueName Queue name
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Remarks

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Remark Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Remark Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Consumer information. 
     * @return ConsumerDetail Consumer information.
     */
    public RabbitMQQueueListConsumerDetailInfo getConsumerDetail() {
        return this.ConsumerDetail;
    }

    /**
     * Set Consumer information.
     * @param ConsumerDetail Consumer information.
     */
    public void setConsumerDetail(RabbitMQQueueListConsumerDetailInfo ConsumerDetail) {
        this.ConsumerDetail = ConsumerDetail;
    }

    /**
     * Get Queue type. Valid values: "classic" and "quorum". 
     * @return QueueType Queue type. Valid values: "classic" and "quorum".
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Queue type. Valid values: "classic" and "quorum".
     * @param QueueType Queue type. Valid values: "classic" and "quorum".
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get Number of retained messages

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageHeapCount Number of retained messages

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set Number of retained messages

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageHeapCount Number of retained messages

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get Message production rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageRateIn Message production rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set Message production rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageRateIn Message production rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get Message consumption rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageRateOut Message consumption rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set Message consumption rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageRateOut Message consumption rate per second.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time. 
     * @return ModifyTime Modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
     * @param ModifyTime Modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Whether the queue is durable. true: durable; false: non-durable. 
     * @return Durable Whether the queue is durable. true: durable; false: non-durable.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Whether the queue is durable. true: durable; false: non-durable.
     * @param Durable Whether the queue is durable. true: durable; false: non-durable.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Whether automatic deletion is set for the queue. true: automatic deletion set; false: automatic deletion not set. 
     * @return AutoDelete Whether automatic deletion is set for the queue. true: automatic deletion set; false: automatic deletion not set.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Whether automatic deletion is set for the queue. true: automatic deletion set; false: automatic deletion not set.
     * @param AutoDelete Whether automatic deletion is set for the queue. true: automatic deletion set; false: automatic deletion not set.
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get Instance ID of the queue. 
     * @return InstanceId Instance ID of the queue.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of the queue.
     * @param InstanceId Instance ID of the queue.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost name of the queue. 
     * @return VirtualHost Vhost name of the queue.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost name of the queue.
     * @param VirtualHost Vhost name of the queue.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Primary node name of the queue. 
     * @return Node Primary node name of the queue.
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Primary node name of the queue.
     * @param Node Primary node name of the queue.
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get Indicates the name of the effective policy.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Policy Indicates the name of the effective policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Indicates the name of the effective policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Policy Indicates the name of the effective policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Extended parameters of the key-value object type. 
     * @return Arguments Extended parameters of the key-value object type.
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set Extended parameters of the key-value object type.
     * @param Arguments Extended parameters of the key-value object type.
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get Whether the queue is exclusive. 
     * @return Exclusive Whether the queue is exclusive.
     */
    public Boolean getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set Whether the queue is exclusive.
     * @param Exclusive Whether the queue is exclusive.
     */
    public void setExclusive(Boolean Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get Creation time timestamp. 
     * @return CreateTs Creation time timestamp.
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set Creation time timestamp.
     * @param CreateTs Creation time timestamp.
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get Modification time timestamp. 
     * @return ModifyTs Modification time timestamp.
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set Modification time timestamp.
     * @param ModifyTs Modification time timestamp.
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    public RabbitMQQueueListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQQueueListInfo(RabbitMQQueueListInfo source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerDetail != null) {
            this.ConsumerDetail = new RabbitMQQueueListConsumerDetailInfo(source.ConsumerDetail);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.MessageHeapCount != null) {
            this.MessageHeapCount = new Long(source.MessageHeapCount);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
        if (source.Exclusive != null) {
            this.Exclusive = new Boolean(source.Exclusive);
        }
        if (source.CreateTs != null) {
            this.CreateTs = new Long(source.CreateTs);
        }
        if (source.ModifyTs != null) {
            this.ModifyTs = new Long(source.ModifyTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "ConsumerDetail.", this.ConsumerDetail);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "MessageHeapCount", this.MessageHeapCount);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

