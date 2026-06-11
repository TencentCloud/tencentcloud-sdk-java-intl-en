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

public class KafkaRechargeInfo extends AbstractModel {

    /**
    * ID of Kafka data subscription configuration.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Name of the Kafka import task
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Imports Kafka type. 0: Cloud CKafka; 1: user-built Kafka
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * CKafka instance ID of cloud platform, required when KafkaType is 0.
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
    * Whether ServerAddr is an encrypted connection	
    */
    @SerializedName("IsEncryptionAddr")
    @Expose
    private Boolean IsEncryptionAddr;

    /**
    * Encryption access protocol, which is required when `IsEncryptionAddr` is set to `true`
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

    /**
    * The list of Kafka-related topics that the user needs to import. Separate multiple topics by commas.
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * Kafka consumer group name of the user	
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Status. 1: Running; 2: Suspension.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Data import position. -2: earliest (default); -1: latest
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Creation time. Format `YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time. Format: `YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get ID of Kafka data subscription configuration. 
     * @return Id ID of Kafka data subscription configuration.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID of Kafka data subscription configuration.
     * @param Id ID of Kafka data subscription configuration.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Name of the Kafka import task 
     * @return Name Name of the Kafka import task
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the Kafka import task
     * @param Name Name of the Kafka import task
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Imports Kafka type. 0: Cloud CKafka; 1: user-built Kafka 
     * @return KafkaType Imports Kafka type. 0: Cloud CKafka; 1: user-built Kafka
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set Imports Kafka type. 0: Cloud CKafka; 1: user-built Kafka
     * @param KafkaType Imports Kafka type. 0: Cloud CKafka; 1: user-built Kafka
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get CKafka instance ID of cloud platform, required when KafkaType is 0. 
     * @return KafkaInstance CKafka instance ID of cloud platform, required when KafkaType is 0.
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set CKafka instance ID of cloud platform, required when KafkaType is 0.
     * @param KafkaInstance CKafka instance ID of cloud platform, required when KafkaType is 0.
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
     * Get Whether ServerAddr is an encrypted connection	 
     * @return IsEncryptionAddr Whether ServerAddr is an encrypted connection	
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set Whether ServerAddr is an encrypted connection	
     * @param IsEncryptionAddr Whether ServerAddr is an encrypted connection	
     */
    public void setIsEncryptionAddr(Boolean IsEncryptionAddr) {
        this.IsEncryptionAddr = IsEncryptionAddr;
    }

    /**
     * Get Encryption access protocol, which is required when `IsEncryptionAddr` is set to `true` 
     * @return Protocol Encryption access protocol, which is required when `IsEncryptionAddr` is set to `true`
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Encryption access protocol, which is required when `IsEncryptionAddr` is set to `true`
     * @param Protocol Encryption access protocol, which is required when `IsEncryptionAddr` is set to `true`
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The list of Kafka-related topics that the user needs to import. Separate multiple topics by commas. 
     * @return UserKafkaTopics The list of Kafka-related topics that the user needs to import. Separate multiple topics by commas.
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set The list of Kafka-related topics that the user needs to import. Separate multiple topics by commas.
     * @param UserKafkaTopics The list of Kafka-related topics that the user needs to import. Separate multiple topics by commas.
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get Kafka consumer group name of the user	 
     * @return ConsumerGroupName Kafka consumer group name of the user	
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Kafka consumer group name of the user	
     * @param ConsumerGroupName Kafka consumer group name of the user	
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Status. 1: Running; 2: Suspension. 
     * @return Status Status. 1: Running; 2: Suspension.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 1: Running; 2: Suspension.
     * @param Status Status. 1: Running; 2: Suspension.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Data import position. -2: earliest (default); -1: latest 
     * @return Offset Data import position. -2: earliest (default); -1: latest
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data import position. -2: earliest (default); -1: latest
     * @param Offset Data import position. -2: earliest (default); -1: latest
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Creation time. Format `YYYY-MM-DD HH:MM:SS` 
     * @return CreateTime Creation time. Format `YYYY-MM-DD HH:MM:SS`
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. Format `YYYY-MM-DD HH:MM:SS`
     * @param CreateTime Creation time. Format `YYYY-MM-DD HH:MM:SS`
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. Format: `YYYY-MM-DD HH:MM:SS` 
     * @return UpdateTime Update time. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. Format: `YYYY-MM-DD HH:MM:SS`
     * @param UpdateTime Update time. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public KafkaRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaRechargeInfo(KafkaRechargeInfo source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "LogRechargeRule.", this.LogRechargeRule);
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

