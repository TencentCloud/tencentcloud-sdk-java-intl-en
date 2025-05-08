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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQQueueListInfo extends AbstractModel {

    /**
    * Queue name.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Remarks.
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
    * Specifies the queue type. the valid values are "classic" and "quorum".
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * Number of message backlogs.
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * Message production rate per second.
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * Message consumption rate per second.
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Specifies whether the queue is persistent. true indicates persistent, and false indicates non-persistent.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Specifies whether the queue is an auto-delete queue. true indicates auto-delete, and false indicates non-auto-delete.
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * instanceId to which the queue belongs.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of the virtual host to which the queue belongs.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Specifies the name of the primary node where the queue is located.
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * The name of the effective policy.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Additional parameters key-value objects.
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * Whether it is an exclusive queue.
    */
    @SerializedName("Exclusive")
    @Expose
    private Boolean Exclusive;

    /**
     * Get Queue name. 
     * @return QueueName Queue name.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name.
     * @param QueueName Queue name.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
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
     * Get Specifies the queue type. the valid values are "classic" and "quorum". 
     * @return QueueType Specifies the queue type. the valid values are "classic" and "quorum".
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Specifies the queue type. the valid values are "classic" and "quorum".
     * @param QueueType Specifies the queue type. the valid values are "classic" and "quorum".
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get Number of message backlogs. 
     * @return MessageHeapCount Number of message backlogs.
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set Number of message backlogs.
     * @param MessageHeapCount Number of message backlogs.
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get Message production rate per second. 
     * @return MessageRateIn Message production rate per second.
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set Message production rate per second.
     * @param MessageRateIn Message production rate per second.
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get Message consumption rate per second. 
     * @return MessageRateOut Message consumption rate per second.
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set Message consumption rate per second.
     * @param MessageRateOut Message consumption rate per second.
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
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
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Specifies whether the queue is persistent. true indicates persistent, and false indicates non-persistent. 
     * @return Durable Specifies whether the queue is persistent. true indicates persistent, and false indicates non-persistent.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Specifies whether the queue is persistent. true indicates persistent, and false indicates non-persistent.
     * @param Durable Specifies whether the queue is persistent. true indicates persistent, and false indicates non-persistent.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Specifies whether the queue is an auto-delete queue. true indicates auto-delete, and false indicates non-auto-delete. 
     * @return AutoDelete Specifies whether the queue is an auto-delete queue. true indicates auto-delete, and false indicates non-auto-delete.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Specifies whether the queue is an auto-delete queue. true indicates auto-delete, and false indicates non-auto-delete.
     * @param AutoDelete Specifies whether the queue is an auto-delete queue. true indicates auto-delete, and false indicates non-auto-delete.
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get instanceId to which the queue belongs. 
     * @return InstanceId instanceId to which the queue belongs.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instanceId to which the queue belongs.
     * @param InstanceId instanceId to which the queue belongs.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Name of the virtual host to which the queue belongs. 
     * @return VirtualHost Name of the virtual host to which the queue belongs.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Name of the virtual host to which the queue belongs.
     * @param VirtualHost Name of the virtual host to which the queue belongs.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Specifies the name of the primary node where the queue is located. 
     * @return Node Specifies the name of the primary node where the queue is located.
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Specifies the name of the primary node where the queue is located.
     * @param Node Specifies the name of the primary node where the queue is located.
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get The name of the effective policy. 
     * @return Policy The name of the effective policy.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set The name of the effective policy.
     * @param Policy The name of the effective policy.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Additional parameters key-value objects. 
     * @return Arguments Additional parameters key-value objects.
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set Additional parameters key-value objects.
     * @param Arguments Additional parameters key-value objects.
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get Whether it is an exclusive queue. 
     * @return Exclusive Whether it is an exclusive queue.
     */
    public Boolean getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set Whether it is an exclusive queue.
     * @param Exclusive Whether it is an exclusive queue.
     */
    public void setExclusive(Boolean Exclusive) {
        this.Exclusive = Exclusive;
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

    }
}

