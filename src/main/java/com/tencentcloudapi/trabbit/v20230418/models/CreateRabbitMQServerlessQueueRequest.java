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

public class CreateRabbitMQServerlessQueueRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VHost parameter.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Queue name.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Supports only classic.
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * Durable flag. specifies that for the classic type, it must be passed in. for the quorum type, there is no need to pass it in and it is fixed as true.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Automatic cleanup. the classic type must be passed. the quorum type does not need to be passed and is fixed as false.
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The MessageTTL parameter specifies settings dedicated to the classic type.
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * The AutoExpire parameter, in milliseconds, indicates that the queue will be deleted if it is not used within a specified time.
    */
    @SerializedName("AutoExpire")
    @Expose
    private Long AutoExpire;

    /**
    * MaxLength parameter. specifies the maximum number of entries the queue can hold. if the limit is exceeded, it will be handled according to the overview behavior.
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * The MaxLengthBytes parameter specifies the maximum length in bytes. if the value exceeds the limit, it will be handled according to the overview behavior.
    */
    @SerializedName("MaxLengthBytes")
    @Expose
    private Long MaxLengthBytes;

    /**
    * DeliveryLimit parameter. specifies the parameter dedicated to the quorum type.
    */
    @SerializedName("DeliveryLimit")
    @Expose
    private Long DeliveryLimit;

    /**
    * OverflowBehaviour parameter specifies a value of drop-head, reject-publish, or reject-publish-dlx.
    */
    @SerializedName("OverflowBehaviour")
    @Expose
    private String OverflowBehaviour;

    /**
    * The DeadLetterExchange parameter specifies that expired or rejected messages can be routed to a designated dead letter exchange.
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * The DeadLetterRoutingKey parameter specifies that it can only contain letters, digits, ".", "-", "@", and "_".
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
    * The SingleActiveConsumer parameter. if enabled, ensure that there is only one consumer consuming from the queue every time.
    */
    @SerializedName("SingleActiveConsumer")
    @Expose
    private Boolean SingleActiveConsumer;

    /**
    * MaximumPriority parameter. specifies that it is dedicated for the classic type.
    */
    @SerializedName("MaximumPriority")
    @Expose
    private Long MaximumPriority;

    /**
    * LazyMode parameter. specifies that it is dedicated for the classic type.
    */
    @SerializedName("LazyMode")
    @Expose
    private Boolean LazyMode;

    /**
    * The MasterLocator parameter, dedicated to the classic type, specifies a value of min-masters, client-local, or random.
    */
    @SerializedName("MasterLocator")
    @Expose
    private String MasterLocator;

    /**
    * MaxInMemoryLength parameter, dedicated for quorum type. specifies the maximum number of messages in memory for quorum queues.
    */
    @SerializedName("MaxInMemoryLength")
    @Expose
    private Long MaxInMemoryLength;

    /**
    * The MaxInMemoryBytes parameter is dedicated to the quorum type. it specifies the maximum total message size in memory for quorum queues.
    */
    @SerializedName("MaxInMemoryBytes")
    @Expose
    private Long MaxInMemoryBytes;

    /**
    * Node parameter. optional. specifies the node where the specified creation queue is located.
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * Consistency policy for dead-letter in arbitrating queues. specifies valid values: at-most-once, at-least-once. at-most-once is selected by default.
    */
    @SerializedName("DeadLetterStrategy")
    @Expose
    private String DeadLetterStrategy;

    /**
    * Specifies the leader election strategy for the arbitration queue. valid values are client-local and balanced. the default value is client-local.
    */
    @SerializedName("QueueLeaderLocator")
    @Expose
    private String QueueLeaderLocator;

    /**
    * Specifies the initial replica group size of the arbitration queue. the default value is 3.
    */
    @SerializedName("QuorumInitialGroupSize")
    @Expose
    private Long QuorumInitialGroupSize;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VHost parameter. 
     * @return VirtualHost VHost parameter.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VHost parameter.
     * @param VirtualHost VHost parameter.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

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
     * Get Supports only classic. 
     * @return QueueType Supports only classic.
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Supports only classic.
     * @param QueueType Supports only classic.
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get Durable flag. specifies that for the classic type, it must be passed in. for the quorum type, there is no need to pass it in and it is fixed as true. 
     * @return Durable Durable flag. specifies that for the classic type, it must be passed in. for the quorum type, there is no need to pass it in and it is fixed as true.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Durable flag. specifies that for the classic type, it must be passed in. for the quorum type, there is no need to pass it in and it is fixed as true.
     * @param Durable Durable flag. specifies that for the classic type, it must be passed in. for the quorum type, there is no need to pass it in and it is fixed as true.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Automatic cleanup. the classic type must be passed. the quorum type does not need to be passed and is fixed as false. 
     * @return AutoDelete Automatic cleanup. the classic type must be passed. the quorum type does not need to be passed and is fixed as false.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Automatic cleanup. the classic type must be passed. the quorum type does not need to be passed and is fixed as false.
     * @param AutoDelete Automatic cleanup. the classic type must be passed. the quorum type does not need to be passed and is fixed as false.
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The MessageTTL parameter specifies settings dedicated to the classic type. 
     * @return MessageTTL The MessageTTL parameter specifies settings dedicated to the classic type.
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set The MessageTTL parameter specifies settings dedicated to the classic type.
     * @param MessageTTL The MessageTTL parameter specifies settings dedicated to the classic type.
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get The AutoExpire parameter, in milliseconds, indicates that the queue will be deleted if it is not used within a specified time. 
     * @return AutoExpire The AutoExpire parameter, in milliseconds, indicates that the queue will be deleted if it is not used within a specified time.
     */
    public Long getAutoExpire() {
        return this.AutoExpire;
    }

    /**
     * Set The AutoExpire parameter, in milliseconds, indicates that the queue will be deleted if it is not used within a specified time.
     * @param AutoExpire The AutoExpire parameter, in milliseconds, indicates that the queue will be deleted if it is not used within a specified time.
     */
    public void setAutoExpire(Long AutoExpire) {
        this.AutoExpire = AutoExpire;
    }

    /**
     * Get MaxLength parameter. specifies the maximum number of entries the queue can hold. if the limit is exceeded, it will be handled according to the overview behavior. 
     * @return MaxLength MaxLength parameter. specifies the maximum number of entries the queue can hold. if the limit is exceeded, it will be handled according to the overview behavior.
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set MaxLength parameter. specifies the maximum number of entries the queue can hold. if the limit is exceeded, it will be handled according to the overview behavior.
     * @param MaxLength MaxLength parameter. specifies the maximum number of entries the queue can hold. if the limit is exceeded, it will be handled according to the overview behavior.
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get The MaxLengthBytes parameter specifies the maximum length in bytes. if the value exceeds the limit, it will be handled according to the overview behavior. 
     * @return MaxLengthBytes The MaxLengthBytes parameter specifies the maximum length in bytes. if the value exceeds the limit, it will be handled according to the overview behavior.
     */
    public Long getMaxLengthBytes() {
        return this.MaxLengthBytes;
    }

    /**
     * Set The MaxLengthBytes parameter specifies the maximum length in bytes. if the value exceeds the limit, it will be handled according to the overview behavior.
     * @param MaxLengthBytes The MaxLengthBytes parameter specifies the maximum length in bytes. if the value exceeds the limit, it will be handled according to the overview behavior.
     */
    public void setMaxLengthBytes(Long MaxLengthBytes) {
        this.MaxLengthBytes = MaxLengthBytes;
    }

    /**
     * Get DeliveryLimit parameter. specifies the parameter dedicated to the quorum type. 
     * @return DeliveryLimit DeliveryLimit parameter. specifies the parameter dedicated to the quorum type.
     */
    public Long getDeliveryLimit() {
        return this.DeliveryLimit;
    }

    /**
     * Set DeliveryLimit parameter. specifies the parameter dedicated to the quorum type.
     * @param DeliveryLimit DeliveryLimit parameter. specifies the parameter dedicated to the quorum type.
     */
    public void setDeliveryLimit(Long DeliveryLimit) {
        this.DeliveryLimit = DeliveryLimit;
    }

    /**
     * Get OverflowBehaviour parameter specifies a value of drop-head, reject-publish, or reject-publish-dlx. 
     * @return OverflowBehaviour OverflowBehaviour parameter specifies a value of drop-head, reject-publish, or reject-publish-dlx.
     */
    public String getOverflowBehaviour() {
        return this.OverflowBehaviour;
    }

    /**
     * Set OverflowBehaviour parameter specifies a value of drop-head, reject-publish, or reject-publish-dlx.
     * @param OverflowBehaviour OverflowBehaviour parameter specifies a value of drop-head, reject-publish, or reject-publish-dlx.
     */
    public void setOverflowBehaviour(String OverflowBehaviour) {
        this.OverflowBehaviour = OverflowBehaviour;
    }

    /**
     * Get The DeadLetterExchange parameter specifies that expired or rejected messages can be routed to a designated dead letter exchange. 
     * @return DeadLetterExchange The DeadLetterExchange parameter specifies that expired or rejected messages can be routed to a designated dead letter exchange.
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set The DeadLetterExchange parameter specifies that expired or rejected messages can be routed to a designated dead letter exchange.
     * @param DeadLetterExchange The DeadLetterExchange parameter specifies that expired or rejected messages can be routed to a designated dead letter exchange.
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get The DeadLetterRoutingKey parameter specifies that it can only contain letters, digits, ".", "-", "@", and "_". 
     * @return DeadLetterRoutingKey The DeadLetterRoutingKey parameter specifies that it can only contain letters, digits, ".", "-", "@", and "_".
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set The DeadLetterRoutingKey parameter specifies that it can only contain letters, digits, ".", "-", "@", and "_".
     * @param DeadLetterRoutingKey The DeadLetterRoutingKey parameter specifies that it can only contain letters, digits, ".", "-", "@", and "_".
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    /**
     * Get The SingleActiveConsumer parameter. if enabled, ensure that there is only one consumer consuming from the queue every time. 
     * @return SingleActiveConsumer The SingleActiveConsumer parameter. if enabled, ensure that there is only one consumer consuming from the queue every time.
     */
    public Boolean getSingleActiveConsumer() {
        return this.SingleActiveConsumer;
    }

    /**
     * Set The SingleActiveConsumer parameter. if enabled, ensure that there is only one consumer consuming from the queue every time.
     * @param SingleActiveConsumer The SingleActiveConsumer parameter. if enabled, ensure that there is only one consumer consuming from the queue every time.
     */
    public void setSingleActiveConsumer(Boolean SingleActiveConsumer) {
        this.SingleActiveConsumer = SingleActiveConsumer;
    }

    /**
     * Get MaximumPriority parameter. specifies that it is dedicated for the classic type. 
     * @return MaximumPriority MaximumPriority parameter. specifies that it is dedicated for the classic type.
     */
    public Long getMaximumPriority() {
        return this.MaximumPriority;
    }

    /**
     * Set MaximumPriority parameter. specifies that it is dedicated for the classic type.
     * @param MaximumPriority MaximumPriority parameter. specifies that it is dedicated for the classic type.
     */
    public void setMaximumPriority(Long MaximumPriority) {
        this.MaximumPriority = MaximumPriority;
    }

    /**
     * Get LazyMode parameter. specifies that it is dedicated for the classic type. 
     * @return LazyMode LazyMode parameter. specifies that it is dedicated for the classic type.
     */
    public Boolean getLazyMode() {
        return this.LazyMode;
    }

    /**
     * Set LazyMode parameter. specifies that it is dedicated for the classic type.
     * @param LazyMode LazyMode parameter. specifies that it is dedicated for the classic type.
     */
    public void setLazyMode(Boolean LazyMode) {
        this.LazyMode = LazyMode;
    }

    /**
     * Get The MasterLocator parameter, dedicated to the classic type, specifies a value of min-masters, client-local, or random. 
     * @return MasterLocator The MasterLocator parameter, dedicated to the classic type, specifies a value of min-masters, client-local, or random.
     */
    public String getMasterLocator() {
        return this.MasterLocator;
    }

    /**
     * Set The MasterLocator parameter, dedicated to the classic type, specifies a value of min-masters, client-local, or random.
     * @param MasterLocator The MasterLocator parameter, dedicated to the classic type, specifies a value of min-masters, client-local, or random.
     */
    public void setMasterLocator(String MasterLocator) {
        this.MasterLocator = MasterLocator;
    }

    /**
     * Get MaxInMemoryLength parameter, dedicated for quorum type. specifies the maximum number of messages in memory for quorum queues. 
     * @return MaxInMemoryLength MaxInMemoryLength parameter, dedicated for quorum type. specifies the maximum number of messages in memory for quorum queues.
     */
    public Long getMaxInMemoryLength() {
        return this.MaxInMemoryLength;
    }

    /**
     * Set MaxInMemoryLength parameter, dedicated for quorum type. specifies the maximum number of messages in memory for quorum queues.
     * @param MaxInMemoryLength MaxInMemoryLength parameter, dedicated for quorum type. specifies the maximum number of messages in memory for quorum queues.
     */
    public void setMaxInMemoryLength(Long MaxInMemoryLength) {
        this.MaxInMemoryLength = MaxInMemoryLength;
    }

    /**
     * Get The MaxInMemoryBytes parameter is dedicated to the quorum type. it specifies the maximum total message size in memory for quorum queues. 
     * @return MaxInMemoryBytes The MaxInMemoryBytes parameter is dedicated to the quorum type. it specifies the maximum total message size in memory for quorum queues.
     */
    public Long getMaxInMemoryBytes() {
        return this.MaxInMemoryBytes;
    }

    /**
     * Set The MaxInMemoryBytes parameter is dedicated to the quorum type. it specifies the maximum total message size in memory for quorum queues.
     * @param MaxInMemoryBytes The MaxInMemoryBytes parameter is dedicated to the quorum type. it specifies the maximum total message size in memory for quorum queues.
     */
    public void setMaxInMemoryBytes(Long MaxInMemoryBytes) {
        this.MaxInMemoryBytes = MaxInMemoryBytes;
    }

    /**
     * Get Node parameter. optional. specifies the node where the specified creation queue is located. 
     * @return Node Node parameter. optional. specifies the node where the specified creation queue is located.
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Node parameter. optional. specifies the node where the specified creation queue is located.
     * @param Node Node parameter. optional. specifies the node where the specified creation queue is located.
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get Consistency policy for dead-letter in arbitrating queues. specifies valid values: at-most-once, at-least-once. at-most-once is selected by default. 
     * @return DeadLetterStrategy Consistency policy for dead-letter in arbitrating queues. specifies valid values: at-most-once, at-least-once. at-most-once is selected by default.
     */
    public String getDeadLetterStrategy() {
        return this.DeadLetterStrategy;
    }

    /**
     * Set Consistency policy for dead-letter in arbitrating queues. specifies valid values: at-most-once, at-least-once. at-most-once is selected by default.
     * @param DeadLetterStrategy Consistency policy for dead-letter in arbitrating queues. specifies valid values: at-most-once, at-least-once. at-most-once is selected by default.
     */
    public void setDeadLetterStrategy(String DeadLetterStrategy) {
        this.DeadLetterStrategy = DeadLetterStrategy;
    }

    /**
     * Get Specifies the leader election strategy for the arbitration queue. valid values are client-local and balanced. the default value is client-local. 
     * @return QueueLeaderLocator Specifies the leader election strategy for the arbitration queue. valid values are client-local and balanced. the default value is client-local.
     */
    public String getQueueLeaderLocator() {
        return this.QueueLeaderLocator;
    }

    /**
     * Set Specifies the leader election strategy for the arbitration queue. valid values are client-local and balanced. the default value is client-local.
     * @param QueueLeaderLocator Specifies the leader election strategy for the arbitration queue. valid values are client-local and balanced. the default value is client-local.
     */
    public void setQueueLeaderLocator(String QueueLeaderLocator) {
        this.QueueLeaderLocator = QueueLeaderLocator;
    }

    /**
     * Get Specifies the initial replica group size of the arbitration queue. the default value is 3. 
     * @return QuorumInitialGroupSize Specifies the initial replica group size of the arbitration queue. the default value is 3.
     */
    public Long getQuorumInitialGroupSize() {
        return this.QuorumInitialGroupSize;
    }

    /**
     * Set Specifies the initial replica group size of the arbitration queue. the default value is 3.
     * @param QuorumInitialGroupSize Specifies the initial replica group size of the arbitration queue. the default value is 3.
     */
    public void setQuorumInitialGroupSize(Long QuorumInitialGroupSize) {
        this.QuorumInitialGroupSize = QuorumInitialGroupSize;
    }

    public CreateRabbitMQServerlessQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQServerlessQueueRequest(CreateRabbitMQServerlessQueueRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageTTL != null) {
            this.MessageTTL = new Long(source.MessageTTL);
        }
        if (source.AutoExpire != null) {
            this.AutoExpire = new Long(source.AutoExpire);
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.MaxLengthBytes != null) {
            this.MaxLengthBytes = new Long(source.MaxLengthBytes);
        }
        if (source.DeliveryLimit != null) {
            this.DeliveryLimit = new Long(source.DeliveryLimit);
        }
        if (source.OverflowBehaviour != null) {
            this.OverflowBehaviour = new String(source.OverflowBehaviour);
        }
        if (source.DeadLetterExchange != null) {
            this.DeadLetterExchange = new String(source.DeadLetterExchange);
        }
        if (source.DeadLetterRoutingKey != null) {
            this.DeadLetterRoutingKey = new String(source.DeadLetterRoutingKey);
        }
        if (source.SingleActiveConsumer != null) {
            this.SingleActiveConsumer = new Boolean(source.SingleActiveConsumer);
        }
        if (source.MaximumPriority != null) {
            this.MaximumPriority = new Long(source.MaximumPriority);
        }
        if (source.LazyMode != null) {
            this.LazyMode = new Boolean(source.LazyMode);
        }
        if (source.MasterLocator != null) {
            this.MasterLocator = new String(source.MasterLocator);
        }
        if (source.MaxInMemoryLength != null) {
            this.MaxInMemoryLength = new Long(source.MaxInMemoryLength);
        }
        if (source.MaxInMemoryBytes != null) {
            this.MaxInMemoryBytes = new Long(source.MaxInMemoryBytes);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
        if (source.DeadLetterStrategy != null) {
            this.DeadLetterStrategy = new String(source.DeadLetterStrategy);
        }
        if (source.QueueLeaderLocator != null) {
            this.QueueLeaderLocator = new String(source.QueueLeaderLocator);
        }
        if (source.QuorumInitialGroupSize != null) {
            this.QuorumInitialGroupSize = new Long(source.QuorumInitialGroupSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageTTL", this.MessageTTL);
        this.setParamSimple(map, prefix + "AutoExpire", this.AutoExpire);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamSimple(map, prefix + "MaxLengthBytes", this.MaxLengthBytes);
        this.setParamSimple(map, prefix + "DeliveryLimit", this.DeliveryLimit);
        this.setParamSimple(map, prefix + "OverflowBehaviour", this.OverflowBehaviour);
        this.setParamSimple(map, prefix + "DeadLetterExchange", this.DeadLetterExchange);
        this.setParamSimple(map, prefix + "DeadLetterRoutingKey", this.DeadLetterRoutingKey);
        this.setParamSimple(map, prefix + "SingleActiveConsumer", this.SingleActiveConsumer);
        this.setParamSimple(map, prefix + "MaximumPriority", this.MaximumPriority);
        this.setParamSimple(map, prefix + "LazyMode", this.LazyMode);
        this.setParamSimple(map, prefix + "MasterLocator", this.MasterLocator);
        this.setParamSimple(map, prefix + "MaxInMemoryLength", this.MaxInMemoryLength);
        this.setParamSimple(map, prefix + "MaxInMemoryBytes", this.MaxInMemoryBytes);
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "DeadLetterStrategy", this.DeadLetterStrategy);
        this.setParamSimple(map, prefix + "QueueLeaderLocator", this.QueueLeaderLocator);
        this.setParamSimple(map, prefix + "QuorumInitialGroupSize", this.QuorumInitialGroupSize);

    }
}

