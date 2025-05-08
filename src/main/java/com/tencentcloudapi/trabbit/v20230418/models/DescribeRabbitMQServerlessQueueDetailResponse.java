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

public class DescribeRabbitMQServerlessQueueDetailResponse extends AbstractModel {

    /**
    * Instance ID
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
    * Specifies the queue type. the valid values are classic or quorum.
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * Number of online consumers.
    */
    @SerializedName("Consumers")
    @Expose
    private Long Consumers;

    /**
    * Durable flag.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Automatic cleanup.
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
    * MessageTTL parameter, dedicated for classic type.
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * AutoExpire parameter.
    */
    @SerializedName("AutoExpire")
    @Expose
    private Long AutoExpire;

    /**
    * MaxLength parameter.
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * MaxLengthBytes parameter.
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
    * DeadLetterExchange parameter.
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * The DeadLetterRoutingKey parameter.
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
    * SingleActiveConsumer parameter.
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
    * LazyMode parameter, dedicated for classic type.
    */
    @SerializedName("LazyMode")
    @Expose
    private Boolean LazyMode;

    /**
    * MasterLocator parameter, dedicated for classic type.
    */
    @SerializedName("MasterLocator")
    @Expose
    private String MasterLocator;

    /**
    * MaxInMemoryLength parameter, dedicated for quorum type.
    */
    @SerializedName("MaxInMemoryLength")
    @Expose
    private Long MaxInMemoryLength;

    /**
    * The MaxInMemoryBytes parameter is dedicated to the quorum type.
    */
    @SerializedName("MaxInMemoryBytes")
    @Expose
    private Long MaxInMemoryBytes;

    /**
    * Create timestamp, in seconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Node.
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * Arbitration queue dead letter consistency policy.
    */
    @SerializedName("DeadLetterStrategy")
    @Expose
    private String DeadLetterStrategy;

    /**
    * Leadership election policy for arbitration queue.
    */
    @SerializedName("QueueLeaderLocator")
    @Expose
    private String QueueLeaderLocator;

    /**
    * Specifies the initial replica group size of the arbitration queue.
    */
    @SerializedName("QuorumInitialGroupSize")
    @Expose
    private Long QuorumInitialGroupSize;

    /**
    * Whether it is an exclusive queue.
    */
    @SerializedName("Exclusive")
    @Expose
    private Boolean Exclusive;

    /**
    * The name of the policy that takes effect.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Additional parameters key-value.
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Specifies the queue type. the valid values are classic or quorum. 
     * @return QueueType Specifies the queue type. the valid values are classic or quorum.
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Specifies the queue type. the valid values are classic or quorum.
     * @param QueueType Specifies the queue type. the valid values are classic or quorum.
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get Number of online consumers. 
     * @return Consumers Number of online consumers.
     */
    public Long getConsumers() {
        return this.Consumers;
    }

    /**
     * Set Number of online consumers.
     * @param Consumers Number of online consumers.
     */
    public void setConsumers(Long Consumers) {
        this.Consumers = Consumers;
    }

    /**
     * Get Durable flag. 
     * @return Durable Durable flag.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Durable flag.
     * @param Durable Durable flag.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Automatic cleanup. 
     * @return AutoDelete Automatic cleanup.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Automatic cleanup.
     * @param AutoDelete Automatic cleanup.
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
     * Get MessageTTL parameter, dedicated for classic type. 
     * @return MessageTTL MessageTTL parameter, dedicated for classic type.
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set MessageTTL parameter, dedicated for classic type.
     * @param MessageTTL MessageTTL parameter, dedicated for classic type.
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get AutoExpire parameter. 
     * @return AutoExpire AutoExpire parameter.
     */
    public Long getAutoExpire() {
        return this.AutoExpire;
    }

    /**
     * Set AutoExpire parameter.
     * @param AutoExpire AutoExpire parameter.
     */
    public void setAutoExpire(Long AutoExpire) {
        this.AutoExpire = AutoExpire;
    }

    /**
     * Get MaxLength parameter. 
     * @return MaxLength MaxLength parameter.
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set MaxLength parameter.
     * @param MaxLength MaxLength parameter.
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get MaxLengthBytes parameter. 
     * @return MaxLengthBytes MaxLengthBytes parameter.
     */
    public Long getMaxLengthBytes() {
        return this.MaxLengthBytes;
    }

    /**
     * Set MaxLengthBytes parameter.
     * @param MaxLengthBytes MaxLengthBytes parameter.
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
     * Get DeadLetterExchange parameter. 
     * @return DeadLetterExchange DeadLetterExchange parameter.
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set DeadLetterExchange parameter.
     * @param DeadLetterExchange DeadLetterExchange parameter.
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get The DeadLetterRoutingKey parameter. 
     * @return DeadLetterRoutingKey The DeadLetterRoutingKey parameter.
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set The DeadLetterRoutingKey parameter.
     * @param DeadLetterRoutingKey The DeadLetterRoutingKey parameter.
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    /**
     * Get SingleActiveConsumer parameter. 
     * @return SingleActiveConsumer SingleActiveConsumer parameter.
     */
    public Boolean getSingleActiveConsumer() {
        return this.SingleActiveConsumer;
    }

    /**
     * Set SingleActiveConsumer parameter.
     * @param SingleActiveConsumer SingleActiveConsumer parameter.
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
     * Get LazyMode parameter, dedicated for classic type. 
     * @return LazyMode LazyMode parameter, dedicated for classic type.
     */
    public Boolean getLazyMode() {
        return this.LazyMode;
    }

    /**
     * Set LazyMode parameter, dedicated for classic type.
     * @param LazyMode LazyMode parameter, dedicated for classic type.
     */
    public void setLazyMode(Boolean LazyMode) {
        this.LazyMode = LazyMode;
    }

    /**
     * Get MasterLocator parameter, dedicated for classic type. 
     * @return MasterLocator MasterLocator parameter, dedicated for classic type.
     */
    public String getMasterLocator() {
        return this.MasterLocator;
    }

    /**
     * Set MasterLocator parameter, dedicated for classic type.
     * @param MasterLocator MasterLocator parameter, dedicated for classic type.
     */
    public void setMasterLocator(String MasterLocator) {
        this.MasterLocator = MasterLocator;
    }

    /**
     * Get MaxInMemoryLength parameter, dedicated for quorum type. 
     * @return MaxInMemoryLength MaxInMemoryLength parameter, dedicated for quorum type.
     */
    public Long getMaxInMemoryLength() {
        return this.MaxInMemoryLength;
    }

    /**
     * Set MaxInMemoryLength parameter, dedicated for quorum type.
     * @param MaxInMemoryLength MaxInMemoryLength parameter, dedicated for quorum type.
     */
    public void setMaxInMemoryLength(Long MaxInMemoryLength) {
        this.MaxInMemoryLength = MaxInMemoryLength;
    }

    /**
     * Get The MaxInMemoryBytes parameter is dedicated to the quorum type. 
     * @return MaxInMemoryBytes The MaxInMemoryBytes parameter is dedicated to the quorum type.
     */
    public Long getMaxInMemoryBytes() {
        return this.MaxInMemoryBytes;
    }

    /**
     * Set The MaxInMemoryBytes parameter is dedicated to the quorum type.
     * @param MaxInMemoryBytes The MaxInMemoryBytes parameter is dedicated to the quorum type.
     */
    public void setMaxInMemoryBytes(Long MaxInMemoryBytes) {
        this.MaxInMemoryBytes = MaxInMemoryBytes;
    }

    /**
     * Get Create timestamp, in seconds. 
     * @return CreateTime Create timestamp, in seconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Create timestamp, in seconds.
     * @param CreateTime Create timestamp, in seconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Node. 
     * @return Node Node.
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Node.
     * @param Node Node.
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get Arbitration queue dead letter consistency policy. 
     * @return DeadLetterStrategy Arbitration queue dead letter consistency policy.
     */
    public String getDeadLetterStrategy() {
        return this.DeadLetterStrategy;
    }

    /**
     * Set Arbitration queue dead letter consistency policy.
     * @param DeadLetterStrategy Arbitration queue dead letter consistency policy.
     */
    public void setDeadLetterStrategy(String DeadLetterStrategy) {
        this.DeadLetterStrategy = DeadLetterStrategy;
    }

    /**
     * Get Leadership election policy for arbitration queue. 
     * @return QueueLeaderLocator Leadership election policy for arbitration queue.
     */
    public String getQueueLeaderLocator() {
        return this.QueueLeaderLocator;
    }

    /**
     * Set Leadership election policy for arbitration queue.
     * @param QueueLeaderLocator Leadership election policy for arbitration queue.
     */
    public void setQueueLeaderLocator(String QueueLeaderLocator) {
        this.QueueLeaderLocator = QueueLeaderLocator;
    }

    /**
     * Get Specifies the initial replica group size of the arbitration queue. 
     * @return QuorumInitialGroupSize Specifies the initial replica group size of the arbitration queue.
     */
    public Long getQuorumInitialGroupSize() {
        return this.QuorumInitialGroupSize;
    }

    /**
     * Set Specifies the initial replica group size of the arbitration queue.
     * @param QuorumInitialGroupSize Specifies the initial replica group size of the arbitration queue.
     */
    public void setQuorumInitialGroupSize(Long QuorumInitialGroupSize) {
        this.QuorumInitialGroupSize = QuorumInitialGroupSize;
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

    /**
     * Get The name of the policy that takes effect. 
     * @return Policy The name of the policy that takes effect.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set The name of the policy that takes effect.
     * @param Policy The name of the policy that takes effect.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Additional parameters key-value. 
     * @return Arguments Additional parameters key-value.
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set Additional parameters key-value.
     * @param Arguments Additional parameters key-value.
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
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

    public DescribeRabbitMQServerlessQueueDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessQueueDetailResponse(DescribeRabbitMQServerlessQueueDetailResponse source) {
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

