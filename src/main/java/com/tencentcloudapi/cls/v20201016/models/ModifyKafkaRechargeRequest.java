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
    * Kafka data import configuration ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Target topic ID
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
    * Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka)
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * CKafka instance ID, which is required when `KafkaType` is set to `0`
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * Service address
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Whether the service address uses an encrypted connection
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * Encryption access protocol, which is required when IsEncryptionAddr` is set to `true`
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * List of Kafka topics to import data from. Separate multiple topics with commas (,).
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
    * Import control. Valid values: 1 (suspend) and 2 (resume).
    */
    @SerializedName("StatusControl")
    @Expose
    private Long StatusControl;

    /**
     * Get Kafka data import configuration ID 
     * @return Id Kafka data import configuration ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Kafka data import configuration ID
     * @param Id Kafka data import configuration ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Target topic ID 
     * @return TopicId Target topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Target topic ID
     * @param TopicId Target topic ID
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
     * Get Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka) 
     * @return KafkaType Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka)
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka)
     * @param KafkaType Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka)
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get CKafka instance ID, which is required when `KafkaType` is set to `0` 
     * @return KafkaInstance CKafka instance ID, which is required when `KafkaType` is set to `0`
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set CKafka instance ID, which is required when `KafkaType` is set to `0`
     * @param KafkaInstance CKafka instance ID, which is required when `KafkaType` is set to `0`
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get Service address 
     * @return ServerAddr Service address
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service address
     * @param ServerAddr Service address
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Whether the service address uses an encrypted connection 
     * @return IsEncryptionAddr Whether the service address uses an encrypted connection
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set Whether the service address uses an encrypted connection
     * @param IsEncryptionAddr Whether the service address uses an encrypted connection
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get Encryption access protocol, which is required when IsEncryptionAddr` is set to `true` 
     * @return Protocol Encryption access protocol, which is required when IsEncryptionAddr` is set to `true`
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Encryption access protocol, which is required when IsEncryptionAddr` is set to `true`
     * @param Protocol Encryption access protocol, which is required when IsEncryptionAddr` is set to `true`
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
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
     * Get Import control. Valid values: 1 (suspend) and 2 (resume). 
     * @return StatusControl Import control. Valid values: 1 (suspend) and 2 (resume).
     */
    public Long getStatusControl() {
        return this.StatusControl;
    }

    /**
     * Set Import control. Valid values: 1 (suspend) and 2 (resume).
     * @param StatusControl Import control. Valid values: 1 (suspend) and 2 (resume).
     */
    public void setStatusControl(Long StatusControl) {
        this.StatusControl = StatusControl;
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

    }
}

