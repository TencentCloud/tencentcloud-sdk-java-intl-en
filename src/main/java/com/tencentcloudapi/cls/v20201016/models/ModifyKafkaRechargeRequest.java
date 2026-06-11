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

public class ModifyKafkaRechargeRequest extends AbstractModel {

    /**
    * Import configuration Id.
-Create a Kafka Data Subscription Task (https://www.tencentcloud.com/document/product/614/94448?from_cn_redirect=1) to obtain the Kafka import configuration Id.
-Get the Kafka import configuration Id by searching the [Kafka Data Subscription Task list](https://www.tencentcloud.com/document/product/614/94446?from_cn_redirect=1).
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
    * Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka.
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
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
    * Encrypted access protocol. It is required when the parameter KafkaType is 1 and the parameter IsEncryptionAddr is true.
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * List of Kafka-related topics to be imported by the user, separated by commas.

-When Kafka Type is Tencent Cloud CKafka: Get TopicName by searching the topic list (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * Kafka consumer group name
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
    * Import control, 1: suspend; 2: start.
    */
    @SerializedName("StatusControl")
    @Expose
    private Long StatusControl;

    /**
    * User kafka extended information
    */
    @SerializedName("UserKafkaMeta")
    @Expose
    private UserKafkaMeta UserKafkaMeta;

    /**
     * Get Import configuration Id.
-Create a Kafka Data Subscription Task (https://www.tencentcloud.com/document/product/614/94448?from_cn_redirect=1) to obtain the Kafka import configuration Id.
-Get the Kafka import configuration Id by searching the [Kafka Data Subscription Task list](https://www.tencentcloud.com/document/product/614/94446?from_cn_redirect=1). 
     * @return Id Import configuration Id.
-Create a Kafka Data Subscription Task (https://www.tencentcloud.com/document/product/614/94448?from_cn_redirect=1) to obtain the Kafka import configuration Id.
-Get the Kafka import configuration Id by searching the [Kafka Data Subscription Task list](https://www.tencentcloud.com/document/product/614/94446?from_cn_redirect=1).
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Import configuration Id.
-Create a Kafka Data Subscription Task (https://www.tencentcloud.com/document/product/614/94448?from_cn_redirect=1) to obtain the Kafka import configuration Id.
-Get the Kafka import configuration Id by searching the [Kafka Data Subscription Task list](https://www.tencentcloud.com/document/product/614/94446?from_cn_redirect=1).
     * @param Id Import configuration Id.
-Create a Kafka Data Subscription Task (https://www.tencentcloud.com/document/product/614/94448?from_cn_redirect=1) to obtain the Kafka import configuration Id.
-Get the Kafka import configuration Id by searching the [Kafka Data Subscription Task list](https://www.tencentcloud.com/document/product/614/94446?from_cn_redirect=1).
     */
    public void setId(String Id) {
        this.Id = Id;
    }

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
     * Get Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1). 
     * @return KafkaInstance Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     * @param KafkaInstance Tencent Cloud CKafka instance ID. Required when KafkaType is 0.
- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
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
     * Get Encrypted access protocol. It is required when the parameter KafkaType is 1 and the parameter IsEncryptionAddr is true. 
     * @return Protocol Encrypted access protocol. It is required when the parameter KafkaType is 1 and the parameter IsEncryptionAddr is true.
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Encrypted access protocol. It is required when the parameter KafkaType is 1 and the parameter IsEncryptionAddr is true.
     * @param Protocol Encrypted access protocol. It is required when the parameter KafkaType is 1 and the parameter IsEncryptionAddr is true.
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get List of Kafka-related topics to be imported by the user, separated by commas.

-When Kafka Type is Tencent Cloud CKafka: Get TopicName by searching the topic list (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1). 
     * @return UserKafkaTopics List of Kafka-related topics to be imported by the user, separated by commas.

-When Kafka Type is Tencent Cloud CKafka: Get TopicName by searching the topic list (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set List of Kafka-related topics to be imported by the user, separated by commas.

-When Kafka Type is Tencent Cloud CKafka: Get TopicName by searching the topic list (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     * @param UserKafkaTopics List of Kafka-related topics to be imported by the user, separated by commas.

-When Kafka Type is Tencent Cloud CKafka: Get TopicName by searching the topic list (https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1).
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get Kafka consumer group name 
     * @return ConsumerGroupName Kafka consumer group name
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Kafka consumer group name
     * @param ConsumerGroupName Kafka consumer group name
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
     * Get Import control, 1: suspend; 2: start. 
     * @return StatusControl Import control, 1: suspend; 2: start.
     */
    public Long getStatusControl() {
        return this.StatusControl;
    }

    /**
     * Set Import control, 1: suspend; 2: start.
     * @param StatusControl Import control, 1: suspend; 2: start.
     */
    public void setStatusControl(Long StatusControl) {
        this.StatusControl = StatusControl;
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

    public ModifyKafkaRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKafkaRechargeRequest(ModifyKafkaRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KafkaType != null) {
            this.KafkaType = new Long(source.KafkaType);
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
        if (source.UserKafkaTopics != null) {
            this.UserKafkaTopics = new String(source.UserKafkaTopics);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.LogRechargeRule != null) {
            this.LogRechargeRule = new LogRechargeRuleInfo(source.LogRechargeRule);
        }
        if (source.StatusControl != null) {
            this.StatusControl = new Long(source.StatusControl);
        }
        if (source.UserKafkaMeta != null) {
            this.UserKafkaMeta = new UserKafkaMeta(source.UserKafkaMeta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KafkaType", this.KafkaType);
        this.setParamSimple(map, prefix + "KafkaInstance", this.KafkaInstance);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "IsEncryptionAddr", this.IsEncryptionAddr);
        this.setParamObj(map, prefix + "Protocol.", this.Protocol);
        this.setParamSimple(map, prefix + "UserKafkaTopics", this.UserKafkaTopics);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);
        this.setParamSimple(map, prefix + "StatusControl", this.StatusControl);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

