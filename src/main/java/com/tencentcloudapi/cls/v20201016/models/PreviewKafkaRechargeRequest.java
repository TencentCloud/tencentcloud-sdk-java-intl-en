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

public class PreviewKafkaRechargeRequest extends AbstractModel {

    /**
    * Preview type. 1: preview of source data; 2: preview of exported results.
    */
    @SerializedName("PreviewType")
    @Expose
    private Long PreviewType;

    /**
    * Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka.
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * List of Kafka-related topics to be imported by the user, topics separated by commas.
Supports up to 100.
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * Import data location. -2: earliest; -1: latest.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Tencent Cloud CKafka instance ID. The parameter KafkaInstance is valid and required when KafkaType is 0.
-Get the instance id through [Get Instance List](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * Service address.
When KafkaType is 1, ServerAddr is required.
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Whether ServerAddr is a secure connection.
Valid when KafkaType is 1.
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
    * User Kafka consumer group.

-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed data of messages in the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by a single consumer in the group.
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Log import rule
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
    * User kafka extended information
    */
    @SerializedName("UserKafkaMeta")
    @Expose
    private UserKafkaMeta UserKafkaMeta;

    /**
     * Get Preview type. 1: preview of source data; 2: preview of exported results. 
     * @return PreviewType Preview type. 1: preview of source data; 2: preview of exported results.
     */
    public Long getPreviewType() {
        return this.PreviewType;
    }

    /**
     * Set Preview type. 1: preview of source data; 2: preview of exported results.
     * @param PreviewType Preview type. 1: preview of source data; 2: preview of exported results.
     */
    public void setPreviewType(Long PreviewType) {
        this.PreviewType = PreviewType;
    }

    /**
     * Get Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka. 
     * @return KafkaType Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka.
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka.
     * @param KafkaType Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka.
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get List of Kafka-related topics to be imported by the user, topics separated by commas.
Supports up to 100. 
     * @return UserKafkaTopics List of Kafka-related topics to be imported by the user, topics separated by commas.
Supports up to 100.
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set List of Kafka-related topics to be imported by the user, topics separated by commas.
Supports up to 100.
     * @param UserKafkaTopics List of Kafka-related topics to be imported by the user, topics separated by commas.
Supports up to 100.
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get Import data location. -2: earliest; -1: latest. 
     * @return Offset Import data location. -2: earliest; -1: latest.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Import data location. -2: earliest; -1: latest.
     * @param Offset Import data location. -2: earliest; -1: latest.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Tencent Cloud CKafka instance ID. The parameter KafkaInstance is valid and required when KafkaType is 0.
-Get the instance id through [Get Instance List](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1). 
     * @return KafkaInstance Tencent Cloud CKafka instance ID. The parameter KafkaInstance is valid and required when KafkaType is 0.
-Get the instance id through [Get Instance List](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set Tencent Cloud CKafka instance ID. The parameter KafkaInstance is valid and required when KafkaType is 0.
-Get the instance id through [Get Instance List](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     * @param KafkaInstance Tencent Cloud CKafka instance ID. The parameter KafkaInstance is valid and required when KafkaType is 0.
-Get the instance id through [Get Instance List](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get Service address.
When KafkaType is 1, ServerAddr is required. 
     * @return ServerAddr Service address.
When KafkaType is 1, ServerAddr is required.
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service address.
When KafkaType is 1, ServerAddr is required.
     * @param ServerAddr Service address.
When KafkaType is 1, ServerAddr is required.
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Whether ServerAddr is a secure connection.
Valid when KafkaType is 1. 
     * @return IsEncryptionAddr Whether ServerAddr is a secure connection.
Valid when KafkaType is 1.
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set Whether ServerAddr is a secure connection.
Valid when KafkaType is 1.
     * @param IsEncryptionAddr Whether ServerAddr is a secure connection.
Valid when KafkaType is 1.
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
     * Get User Kafka consumer group.

-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed data of messages in the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by a single consumer in the group. 
     * @return ConsumerGroupName User Kafka consumer group.

-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed data of messages in the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by a single consumer in the group.
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set User Kafka consumer group.

-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed data of messages in the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by a single consumer in the group.
     * @param ConsumerGroupName User Kafka consumer group.

-A consumption group is a scalable and fault-tolerant consumer mechanism provided by Kafka. Multiple consumers exist in a consumption group, and all consumers in the group consume subscribed data of messages in the Topic. A consumer can consume multiple partitions simultaneously, but one Partition can only be consumed by a single consumer in the group.
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Log import rule 
     * @return LogRechargeRule Log import rule
     */
    public LogRechargeRuleInfo getLogRechargeRule() {
        return this.LogRechargeRule;
    }

    /**
     * Set Log import rule
     * @param LogRechargeRule Log import rule
     */
    public void setLogRechargeRule(LogRechargeRuleInfo LogRechargeRule) {
        this.LogRechargeRule = LogRechargeRule;
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

    public PreviewKafkaRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewKafkaRechargeRequest(PreviewKafkaRechargeRequest source) {
        if (source.PreviewType != null) {
            this.PreviewType = new Long(source.PreviewType);
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
        if (source.LogRechargeRule != null) {
            this.LogRechargeRule = new LogRechargeRuleInfo(source.LogRechargeRule);
        }
        if (source.UserKafkaMeta != null) {
            this.UserKafkaMeta = new UserKafkaMeta(source.UserKafkaMeta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PreviewType", this.PreviewType);
        this.setParamSimple(map, prefix + "KafkaType", this.KafkaType);
        this.setParamSimple(map, prefix + "UserKafkaTopics", this.UserKafkaTopics);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "KafkaInstance", this.KafkaInstance);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "IsEncryptionAddr", this.IsEncryptionAddr);
        this.setParamObj(map, prefix + "Protocol.", this.Protocol);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

