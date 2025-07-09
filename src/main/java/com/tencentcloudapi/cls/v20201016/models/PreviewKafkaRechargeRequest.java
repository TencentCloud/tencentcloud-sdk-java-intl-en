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
    * Preview type. Valid values: 1 (source data preview) and 2 (result preview).
    */
    @SerializedName("PreviewType")
    @Expose
    private Long PreviewType;

    /**
    * Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka)
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * List of Kafka-related topics that the user needs to import, separated by commas. Supports up to 100 topics.
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
    * Tencent Cloud CKafka instance ID.
KafkaInstance is required when KafkaType is 0
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * Service AddressServerAddr is required when KafkaType is 1
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
    * Encrypted Access ProtocolWhen KafkaType is 1 and IsEncryptionAddr is true, Protocol is required
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

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
     * Get Preview type. Valid values: 1 (source data preview) and 2 (result preview). 
     * @return PreviewType Preview type. Valid values: 1 (source data preview) and 2 (result preview).
     */
    public Long getPreviewType() {
        return this.PreviewType;
    }

    /**
     * Set Preview type. Valid values: 1 (source data preview) and 2 (result preview).
     * @param PreviewType Preview type. Valid values: 1 (source data preview) and 2 (result preview).
     */
    public void setPreviewType(Long PreviewType) {
        this.PreviewType = PreviewType;
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
     * Get List of Kafka-related topics that the user needs to import, separated by commas. Supports up to 100 topics. 
     * @return UserKafkaTopics List of Kafka-related topics that the user needs to import, separated by commas. Supports up to 100 topics.
     */
    public String getUserKafkaTopics() {
        return this.UserKafkaTopics;
    }

    /**
     * Set List of Kafka-related topics that the user needs to import, separated by commas. Supports up to 100 topics.
     * @param UserKafkaTopics List of Kafka-related topics that the user needs to import, separated by commas. Supports up to 100 topics.
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
     * Get Tencent Cloud CKafka instance ID.
KafkaInstance is required when KafkaType is 0 
     * @return KafkaInstance Tencent Cloud CKafka instance ID.
KafkaInstance is required when KafkaType is 0
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set Tencent Cloud CKafka instance ID.
KafkaInstance is required when KafkaType is 0
     * @param KafkaInstance Tencent Cloud CKafka instance ID.
KafkaInstance is required when KafkaType is 0
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get Service AddressServerAddr is required when KafkaType is 1 
     * @return ServerAddr Service AddressServerAddr is required when KafkaType is 1
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service AddressServerAddr is required when KafkaType is 1
     * @param ServerAddr Service AddressServerAddr is required when KafkaType is 1
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
     * Get Encrypted Access ProtocolWhen KafkaType is 1 and IsEncryptionAddr is true, Protocol is required 
     * @return Protocol Encrypted Access ProtocolWhen KafkaType is 1 and IsEncryptionAddr is true, Protocol is required
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Encrypted Access ProtocolWhen KafkaType is 1 and IsEncryptionAddr is true, Protocol is required
     * @param Protocol Encrypted Access ProtocolWhen KafkaType is 1 and IsEncryptionAddr is true, Protocol is required
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
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

    }
}

