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

public class CheckRechargeKafkaServerRequest extends AbstractModel {

    /**
    * Kafka type. Valid values: 0 (Tencent Cloud CKafka) and 1 (customer's Kafka).
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * Tencent Cloud CKafka Instance IDWhen KafkaType is 0, KafkaInstance is required
    */
    @SerializedName("KafkaInstance")
    @Expose
    private String KafkaInstance;

    /**
    * Service AddressWhen KafkaType is 1, ServerAddr is required
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
    * Encryption access protocol. Required when IsEncryptionAddr parameter is set to true
    */
    @SerializedName("Protocol")
    @Expose
    private KafkaProtocolInfo Protocol;

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
     * Get Tencent Cloud CKafka Instance IDWhen KafkaType is 0, KafkaInstance is required 
     * @return KafkaInstance Tencent Cloud CKafka Instance IDWhen KafkaType is 0, KafkaInstance is required
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set Tencent Cloud CKafka Instance IDWhen KafkaType is 0, KafkaInstance is required
     * @param KafkaInstance Tencent Cloud CKafka Instance IDWhen KafkaType is 0, KafkaInstance is required
     */
    public void setKafkaInstance(String KafkaInstance) {
        this.KafkaInstance = KafkaInstance;
    }

    /**
     * Get Service AddressWhen KafkaType is 1, ServerAddr is required 
     * @return ServerAddr Service AddressWhen KafkaType is 1, ServerAddr is required
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service AddressWhen KafkaType is 1, ServerAddr is required
     * @param ServerAddr Service AddressWhen KafkaType is 1, ServerAddr is required
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
     * Get Encryption access protocol. Required when IsEncryptionAddr parameter is set to true 
     * @return Protocol Encryption access protocol. Required when IsEncryptionAddr parameter is set to true
     */
    public KafkaProtocolInfo getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Encryption access protocol. Required when IsEncryptionAddr parameter is set to true
     * @param Protocol Encryption access protocol. Required when IsEncryptionAddr parameter is set to true
     */
    public void setProtocol(KafkaProtocolInfo Protocol) {
        this.Protocol = Protocol;
    }

    public CheckRechargeKafkaServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckRechargeKafkaServerRequest(CheckRechargeKafkaServerRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaType", this.KafkaType);
        this.setParamSimple(map, prefix + "KafkaInstance", this.KafkaInstance);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "IsEncryptionAddr", this.IsEncryptionAddr);
        this.setParamObj(map, prefix + "Protocol.", this.Protocol);

    }
}

