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

public class DescribeRabbitMQQueueDetailResponse extends AbstractModel {

    /**
    * Instance name
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost parameter.
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
    * Queue type. Valid values: classic and quorum.
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * The number of online consumers.

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Consumers")
    @Expose
    private Long Consumers;

    /**
    * Durable queue flag.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Automatic cleanup.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Messagettl parameter, specific to classic type.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * Autoexpire parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoExpire")
    @Expose
    private Long AutoExpire;

    /**
    * The maxlength parameter specifies the maximum length.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * The maxlengthbytes parameter specifies the maximum length in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxLengthBytes")
    @Expose
    private Long MaxLengthBytes;

    /**
    * The deliverylimit parameter is used for quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeliveryLimit")
    @Expose
    private Long DeliveryLimit;

    /**
    * The overflowbehaviour parameter specifies the behavior when overflow occurs. Valid values: drop-head, reject-publish, reject-publish-dlx.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OverflowBehaviour")
    @Expose
    private String OverflowBehaviour;

    /**
    * The deadletterexchange parameter specifies the dead letter exchange.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * The deadletterroutingkey parameter specifies the routing key for dead letters. Valid values: [value1, value2, value3].
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
    * The singleactiveconsumer parameter indicates whether only one consumer can be active at a time. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SingleActiveConsumer")
    @Expose
    private Boolean SingleActiveConsumer;

    /**
    * The maximumpriority parameter, for classic type only, specifies the maximum priority level. Value range: 1-30.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaximumPriority")
    @Expose
    private Long MaximumPriority;

    /**
    * The lazymode parameter, for classic type only, indicates whether lazy mode is enabled. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LazyMode")
    @Expose
    private Boolean LazyMode;

    /**
    * The masterlocator parameter, for classic type only, specifies the master locator strategy. Valid values: [strategy1, strategy2, strategy3].
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterLocator")
    @Expose
    private String MasterLocator;

    /**
    * The maxinmemorylength parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxInMemoryLength")
    @Expose
    private Long MaxInMemoryLength;

    /**
    * The maxinmemorybytes parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxInMemoryBytes")
    @Expose
    private Long MaxInMemoryBytes;

    /**
    * Creation timestamp. Unit: seconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Node

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * Quorum queue dead letter consistency policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterStrategy")
    @Expose
    private String DeadLetterStrategy;

    /**
    * Leader election policy for quorum queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueLeaderLocator")
    @Expose
    private String QueueLeaderLocator;

    /**
    * Initial replica group size of arbitration queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("QuorumInitialGroupSize")
    @Expose
    private Long QuorumInitialGroupSize;

    /**
    * Whether the queue is an exclusive queue.
    */
    @SerializedName("Exclusive")
    @Expose
    private Boolean Exclusive;

    /**
    * Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Extended parameters of the key-value type.
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * Creation timestamp.
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * Modification timestamp.
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance name 
     * @return InstanceId Instance name
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name
     * @param InstanceId Instance name
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost parameter. 
     * @return VirtualHost Vhost parameter.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost parameter.
     * @param VirtualHost Vhost parameter.
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
     * Get Queue type. Valid values: classic and quorum. 
     * @return QueueType Queue type. Valid values: classic and quorum.
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Queue type. Valid values: classic and quorum.
     * @param QueueType Queue type. Valid values: classic and quorum.
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get The number of online consumers.

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Consumers The number of online consumers.

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getConsumers() {
        return this.Consumers;
    }

    /**
     * Set The number of online consumers.

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Consumers The number of online consumers.

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConsumers(Long Consumers) {
        this.Consumers = Consumers;
    }

    /**
     * Get Durable queue flag. 
     * @return Durable Durable queue flag.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Durable queue flag.
     * @param Durable Durable queue flag.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Automatic cleanup.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoDelete Automatic cleanup.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Automatic cleanup.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AutoDelete Automatic cleanup.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
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
     * Get Messagettl parameter, specific to classic type.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageTTL Messagettl parameter, specific to classic type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set Messagettl parameter, specific to classic type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageTTL Messagettl parameter, specific to classic type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get Autoexpire parameter.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoExpire Autoexpire parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAutoExpire() {
        return this.AutoExpire;
    }

    /**
     * Set Autoexpire parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AutoExpire Autoexpire parameter.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoExpire(Long AutoExpire) {
        this.AutoExpire = AutoExpire;
    }

    /**
     * Get The maxlength parameter specifies the maximum length.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxLength The maxlength parameter specifies the maximum length.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set The maxlength parameter specifies the maximum length.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxLength The maxlength parameter specifies the maximum length.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get The maxlengthbytes parameter specifies the maximum length in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxLengthBytes The maxlengthbytes parameter specifies the maximum length in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxLengthBytes() {
        return this.MaxLengthBytes;
    }

    /**
     * Set The maxlengthbytes parameter specifies the maximum length in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxLengthBytes The maxlengthbytes parameter specifies the maximum length in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxLengthBytes(Long MaxLengthBytes) {
        this.MaxLengthBytes = MaxLengthBytes;
    }

    /**
     * Get The deliverylimit parameter is used for quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeliveryLimit The deliverylimit parameter is used for quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDeliveryLimit() {
        return this.DeliveryLimit;
    }

    /**
     * Set The deliverylimit parameter is used for quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeliveryLimit The deliverylimit parameter is used for quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeliveryLimit(Long DeliveryLimit) {
        this.DeliveryLimit = DeliveryLimit;
    }

    /**
     * Get The overflowbehaviour parameter specifies the behavior when overflow occurs. Valid values: drop-head, reject-publish, reject-publish-dlx.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OverflowBehaviour The overflowbehaviour parameter specifies the behavior when overflow occurs. Valid values: drop-head, reject-publish, reject-publish-dlx.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOverflowBehaviour() {
        return this.OverflowBehaviour;
    }

    /**
     * Set The overflowbehaviour parameter specifies the behavior when overflow occurs. Valid values: drop-head, reject-publish, reject-publish-dlx.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OverflowBehaviour The overflowbehaviour parameter specifies the behavior when overflow occurs. Valid values: drop-head, reject-publish, reject-publish-dlx.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOverflowBehaviour(String OverflowBehaviour) {
        this.OverflowBehaviour = OverflowBehaviour;
    }

    /**
     * Get The deadletterexchange parameter specifies the dead letter exchange.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeadLetterExchange The deadletterexchange parameter specifies the dead letter exchange.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set The deadletterexchange parameter specifies the dead letter exchange.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeadLetterExchange The deadletterexchange parameter specifies the dead letter exchange.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get The deadletterroutingkey parameter specifies the routing key for dead letters. Valid values: [value1, value2, value3].
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeadLetterRoutingKey The deadletterroutingkey parameter specifies the routing key for dead letters. Valid values: [value1, value2, value3].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set The deadletterroutingkey parameter specifies the routing key for dead letters. Valid values: [value1, value2, value3].
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeadLetterRoutingKey The deadletterroutingkey parameter specifies the routing key for dead letters. Valid values: [value1, value2, value3].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    /**
     * Get The singleactiveconsumer parameter indicates whether only one consumer can be active at a time. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SingleActiveConsumer The singleactiveconsumer parameter indicates whether only one consumer can be active at a time. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getSingleActiveConsumer() {
        return this.SingleActiveConsumer;
    }

    /**
     * Set The singleactiveconsumer parameter indicates whether only one consumer can be active at a time. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SingleActiveConsumer The singleactiveconsumer parameter indicates whether only one consumer can be active at a time. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSingleActiveConsumer(Boolean SingleActiveConsumer) {
        this.SingleActiveConsumer = SingleActiveConsumer;
    }

    /**
     * Get The maximumpriority parameter, for classic type only, specifies the maximum priority level. Value range: 1-30.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaximumPriority The maximumpriority parameter, for classic type only, specifies the maximum priority level. Value range: 1-30.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaximumPriority() {
        return this.MaximumPriority;
    }

    /**
     * Set The maximumpriority parameter, for classic type only, specifies the maximum priority level. Value range: 1-30.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaximumPriority The maximumpriority parameter, for classic type only, specifies the maximum priority level. Value range: 1-30.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaximumPriority(Long MaximumPriority) {
        this.MaximumPriority = MaximumPriority;
    }

    /**
     * Get The lazymode parameter, for classic type only, indicates whether lazy mode is enabled. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LazyMode The lazymode parameter, for classic type only, indicates whether lazy mode is enabled. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getLazyMode() {
        return this.LazyMode;
    }

    /**
     * Set The lazymode parameter, for classic type only, indicates whether lazy mode is enabled. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LazyMode The lazymode parameter, for classic type only, indicates whether lazy mode is enabled. Valid values: [true, false].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLazyMode(Boolean LazyMode) {
        this.LazyMode = LazyMode;
    }

    /**
     * Get The masterlocator parameter, for classic type only, specifies the master locator strategy. Valid values: [strategy1, strategy2, strategy3].
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MasterLocator The masterlocator parameter, for classic type only, specifies the master locator strategy. Valid values: [strategy1, strategy2, strategy3].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMasterLocator() {
        return this.MasterLocator;
    }

    /**
     * Set The masterlocator parameter, for classic type only, specifies the master locator strategy. Valid values: [strategy1, strategy2, strategy3].
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MasterLocator The masterlocator parameter, for classic type only, specifies the master locator strategy. Valid values: [strategy1, strategy2, strategy3].
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMasterLocator(String MasterLocator) {
        this.MasterLocator = MasterLocator;
    }

    /**
     * Get The maxinmemorylength parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxInMemoryLength The maxinmemorylength parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxInMemoryLength() {
        return this.MaxInMemoryLength;
    }

    /**
     * Set The maxinmemorylength parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxInMemoryLength The maxinmemorylength parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxInMemoryLength(Long MaxInMemoryLength) {
        this.MaxInMemoryLength = MaxInMemoryLength;
    }

    /**
     * Get The maxinmemorybytes parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxInMemoryBytes The maxinmemorybytes parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxInMemoryBytes() {
        return this.MaxInMemoryBytes;
    }

    /**
     * Set The maxinmemorybytes parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxInMemoryBytes The maxinmemorybytes parameter, specific to quorum type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxInMemoryBytes(Long MaxInMemoryBytes) {
        this.MaxInMemoryBytes = MaxInMemoryBytes;
    }

    /**
     * Get Creation timestamp. Unit: seconds. 
     * @return CreateTime Creation timestamp. Unit: seconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation timestamp. Unit: seconds.
     * @param CreateTime Creation timestamp. Unit: seconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Node

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Node Node

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Node

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Node Node

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get Quorum queue dead letter consistency policy.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeadLetterStrategy Quorum queue dead letter consistency policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeadLetterStrategy() {
        return this.DeadLetterStrategy;
    }

    /**
     * Set Quorum queue dead letter consistency policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeadLetterStrategy Quorum queue dead letter consistency policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeadLetterStrategy(String DeadLetterStrategy) {
        this.DeadLetterStrategy = DeadLetterStrategy;
    }

    /**
     * Get Leader election policy for quorum queue.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return QueueLeaderLocator Leader election policy for quorum queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getQueueLeaderLocator() {
        return this.QueueLeaderLocator;
    }

    /**
     * Set Leader election policy for quorum queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param QueueLeaderLocator Leader election policy for quorum queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setQueueLeaderLocator(String QueueLeaderLocator) {
        this.QueueLeaderLocator = QueueLeaderLocator;
    }

    /**
     * Get Initial replica group size of arbitration queue.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return QuorumInitialGroupSize Initial replica group size of arbitration queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getQuorumInitialGroupSize() {
        return this.QuorumInitialGroupSize;
    }

    /**
     * Set Initial replica group size of arbitration queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param QuorumInitialGroupSize Initial replica group size of arbitration queue.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setQuorumInitialGroupSize(Long QuorumInitialGroupSize) {
        this.QuorumInitialGroupSize = QuorumInitialGroupSize;
    }

    /**
     * Get Whether the queue is an exclusive queue. 
     * @return Exclusive Whether the queue is an exclusive queue.
     */
    public Boolean getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set Whether the queue is an exclusive queue.
     * @param Exclusive Whether the queue is an exclusive queue.
     */
    public void setExclusive(Boolean Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Policy Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Policy Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Extended parameters of the key-value type. 
     * @return Arguments Extended parameters of the key-value type.
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set Extended parameters of the key-value type.
     * @param Arguments Extended parameters of the key-value type.
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get Creation timestamp. 
     * @return CreateTs Creation timestamp.
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set Creation timestamp.
     * @param CreateTs Creation timestamp.
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get Modification timestamp. 
     * @return ModifyTs Modification timestamp.
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set Modification timestamp.
     * @param ModifyTs Modification timestamp.
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRabbitMQQueueDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQQueueDetailResponse(DescribeRabbitMQQueueDetailResponse source) {
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
        if (source.Consumers != null) {
            this.Consumers = new Long(source.Consumers);
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
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
        if (source.Exclusive != null) {
            this.Exclusive = new Boolean(source.Exclusive);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
        if (source.CreateTs != null) {
            this.CreateTs = new Long(source.CreateTs);
        }
        if (source.ModifyTs != null) {
            this.ModifyTs = new Long(source.ModifyTs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "Consumers", this.Consumers);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "DeadLetterStrategy", this.DeadLetterStrategy);
        this.setParamSimple(map, prefix + "QueueLeaderLocator", this.QueueLeaderLocator);
        this.setParamSimple(map, prefix + "QuorumInitialGroupSize", this.QuorumInitialGroupSize);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

