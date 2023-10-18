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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaRechargeInfo extends AbstractModel {

    /**
    * Primary key ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Kafka data import task name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * CKafka instance ID, which is required when `KafkaType` is set to `0`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * Service address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Whether the service address uses an encrypted connection	
Note: This field may return null, indicating that no valid values can be obtained.
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
    * List of Kafka topics to import data from. Separate multiple topics with commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserKafkaTopics")
    @Expose
    private String UserKafkaTopics;

    /**
    * Kafka consumer group name	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Status. Valid values: 1 (running) and 2 (suspended).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Position for data import. Valid values: -2 (earliest, default) and -1 (latest).  
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Log import rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogRechargeRule")
    @Expose
    private LogRechargeRuleInfo LogRechargeRule;

    /**
     * Get Primary key ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Primary key ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Primary key ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Primary key ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Log topic ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicId Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicId Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Kafka data import task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Kafka data import task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Kafka data import task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Kafka data import task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KafkaType Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getKafkaType() {
        return this.KafkaType;
    }

    /**
     * Set Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KafkaType Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKafkaType(Long KafkaType) {
        this.KafkaType = KafkaType;
    }

    /**
     * Get CKafka instance ID, which is required when `KafkaType` is set to `0`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KafkaInstance CKafka instance ID, which is required when `KafkaType` is set to `0`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set CKafka instance ID, which is required when `KafkaType` is set to `0`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KafkaInstance CKafka instance ID, which is required when `KafkaType` is set to `0`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get Service address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerAddr Service address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerAddr Service address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Whether the service address uses an encrypted connection	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsEncryptionAddr Whether the service address uses an encrypted connection	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set Whether the service address uses an encrypted connection	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsEncryptionAddr Whether the service address uses an encrypted connection	
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get List of Kafka topics to import data from. Separate multiple topics with commas (,).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserKafkaTopics List of Kafka topics to import data from. Separate multiple topics with commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set List of Kafka topics to import data from. Separate multiple topics with commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserKafkaTopics List of Kafka topics to import data from. Separate multiple topics with commas (,).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserKafkaTopics(String UserKafkaTopics) {
        this.UserKafkaTopics = UserKafkaTopics;
    }

    /**
     * Get Kafka consumer group name	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerGroupName Kafka consumer group name	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Kafka consumer group name	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerGroupName Kafka consumer group name	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Status. Valid values: 1 (running) and 2 (suspended).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status. Valid values: 1 (running) and 2 (suspended).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: 1 (running) and 2 (suspended).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status. Valid values: 1 (running) and 2 (suspended).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Position for data import. Valid values: -2 (earliest, default) and -1 (latest).  
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Offset Position for data import. Valid values: -2 (earliest, default) and -1 (latest).  
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Position for data import. Valid values: -2 (earliest, default) and -1 (latest).  
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Offset Position for data import. Valid values: -2 (earliest, default) and -1 (latest).  
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Log import rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogRechargeRule Log import rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LogRechargeRuleInfo getLogRechargeRule() {
        return this.LogRechargeRule;
    }

    /**
     * Set Log import rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogRechargeRule Log import rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogRechargeRule(LogRechargeRuleInfo LogRechargeRule) {
        this.LogRechargeRule = LogRechargeRule;
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

    }
}

