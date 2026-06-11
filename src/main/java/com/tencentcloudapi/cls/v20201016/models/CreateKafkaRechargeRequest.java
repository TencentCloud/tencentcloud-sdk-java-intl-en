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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKafkaRechargeRequest extends AbstractModel {

    /**
    * Import the target topic ID of CLS.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Kafka data import configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * List of Kafka topics to import data from. Separate multiple topics with commas (,).
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * Position for data import. Valid values: -2 (earliest, default) and -1 (latest).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Log Import Rules.
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
    * Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
-Obtain the instance id through [Get Instance List Information](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * Service address, which is required when KafkaType is 1.
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Whether ServerAddr is an encrypted connection. Required when KafkaType is 1.
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * Encrypted Access Protocol.
When KafkaType is 1 and IsEncryptionAddr is true, Protocol is required.
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * User Kafka consumer group name.
-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed messages of the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by one consumer in the group.
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * User kafka extended information
    */
    @SerializedName("UserKafkaMeta")
    @Expose
    private UserKafkaMeta UserKafkaMeta;

    /**
     * Get Import the target topic ID of CLS.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). 
     * @return TopicId Import the target topic ID of CLS.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Import the target topic ID of CLS.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     * @param TopicId Import the target topic ID of CLS.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Kafka data import configuration name 
     * @return Name Kafka data import configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Kafka data import configuration name
     * @param Name Kafka data import configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka). 
     * @return KafkaType Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
     * @param KafkaType Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get List of Kafka topics to import data from. Separate multiple topics with commas (,). 
     * @return UserKafkaTopics List of Kafka topics to import data from. Separate multiple topics with commas (,).
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set List of Kafka topics to import data from. Separate multiple topics with commas (,).
     * @param UserKafkaTopics List of Kafka topics to import data from. Separate multiple topics with commas (,).
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get Position for data import. Valid values: -2 (earliest, default) and -1 (latest). 
     * @return Offset Position for data import. Valid values: -2 (earliest, default) and -1 (latest).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Position for data import. Valid values: -2 (earliest, default) and -1 (latest).
     * @param Offset Position for data import. Valid values: -2 (earliest, default) and -1 (latest).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Log Import Rules. 
     * @return LogRechargeRule Log Import Rules.
     */
    public LogRechargeRuleInfo getLogRechargeRule() {
        return this.LogRechargeRule;
    }

    /**
     * Set Log Import Rules.
     * @param LogRechargeRule Log Import Rules.
     */
    public void setLogRechargeRule(LogRechargeRuleInfo LogRechargeRule) {
        this.LogRechargeRule = LogRechargeRule;
    }

    /**
     * Get Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
-Obtain the instance id through [Get Instance List Information](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1). 
     * @return KafkaInstance Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
-Obtain the instance id through [Get Instance List Information](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
-Obtain the instance id through [Get Instance List Information](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     * @param KafkaInstance Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
-Obtain the instance id through [Get Instance List Information](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get Service address, which is required when KafkaType is 1. 
     * @return ServerAddr Service address, which is required when KafkaType is 1.
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service address, which is required when KafkaType is 1.
     * @param ServerAddr Service address, which is required when KafkaType is 1.
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Whether ServerAddr is an encrypted connection. Required when KafkaType is 1. 
     * @return IsEncryptionAddr Whether ServerAddr is an encrypted connection. Required when KafkaType is 1.
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set Whether ServerAddr is an encrypted connection. Required when KafkaType is 1.
     * @param IsEncryptionAddr Whether ServerAddr is an encrypted connection. Required when KafkaType is 1.
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get Encrypted Access Protocol.
When KafkaType is 1 and IsEncryptionAddr is true, Protocol is required. 
     * @return Protocol Encrypted Access Protocol.
When KafkaType is 1 and IsEncryptionAddr is true, Protocol is required.
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Encrypted Access Protocol.
When KafkaType is 1 and IsEncryptionAddr is true, Protocol is required.
     * @param Protocol Encrypted Access Protocol.
When KafkaType is 1 and IsEncryptionAddr is true, Protocol is required.
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get User Kafka consumer group name.
-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed messages of the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by one consumer in the group. 
     * @return ConsumerGroupName User Kafka consumer group name.
-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed messages of the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by one consumer in the group.
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set User Kafka consumer group name.
-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed messages of the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by one consumer in the group.
     * @param ConsumerGroupName User Kafka consumer group name.
-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed messages of the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by one consumer in the group.
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get User kafka extended information 
     * @return UserKafkaMeta User kafka extended information
     */
    public UserKafkaMeta getUserKafkaMeta() {
        return this.UserKafkaMeta;
    }

    /**
     * Set User kafka extended information
     * @param UserKafkaMeta User kafka extended information
     */
    public void setUserKafkaMeta(UserKafkaMeta UserKafkaMeta) {
        this.UserKafkaMeta = UserKafkaMeta;
    }

    public CreateKafkaRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKafkaRechargeRequest(CreateKafkaRechargeRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KafkaType != null) {
            this.KafkaType = new Long(source.KafkaType);
        }
        if (source.UserKafkaTopics != null) {
            this.UserKafkaTopics = new String(source.UserKafkaTopics);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LogRechargeRule != null) {
            this.LogRechargeRule = new LogRechargeRuleInfo(source.LogRechargeRule);
        }
        if (source.KafkaInstance != null) {
            this.KafkaInstance = new String(source.KafkaInstance);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.IsEncryptionAddr != null) {
            this.IsEncryptionAddr = new Boolean(source.IsEncryptionAddr);
        }
        if (source.Protocol != null) {
            this.Protocol = new KafkaProtocolInfo(source.Protocol);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.UserKafkaMeta != null) {
            this.UserKafkaMeta = new UserKafkaMeta(source.UserKafkaMeta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KafkaType", this.KafkaType);
        this.setParamSimple(map, prefix + "UserKafkaTopics", this.UserKafkaTopics);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);
        this.setParamSimple(map, prefix + "KafkaInstance", this.KafkaInstance);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "IsEncryptionAddr", this.IsEncryptionAddr);
        this.setParamObj(map, prefix + "Protocol.", this.Protocol);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

