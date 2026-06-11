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
    * Import Kafka type. 0: Tencent Cloud CKafka; 1: user-built kafka.
    */
    @SerializedName("KafkaType")
    @Expose
    private Long KafkaType;

    /**
    * Tencent Cloud CKafka instance ID.
When KafkaType is 0, KafkaInstance is required

- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
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
    * Whether ServerAddr is an encrypted connection. The default value is false. It is valid when KafkaType is 1, indicating a user self-built Kafka.
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
    * User kafka extended information
    */
    @SerializedName("UserKafkaMeta")
    @Expose
    private UserKafkaMeta UserKafkaMeta;

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
     * Get Tencent Cloud CKafka instance ID.
When KafkaType is 0, KafkaInstance is required

- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1). 
     * @return KafkaInstance Tencent Cloud CKafka instance ID.
When KafkaType is 0, KafkaInstance is required

- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public String getKafkaInstance() {
        return this.KafkaInstance;
    }

    /**
     * Set Tencent Cloud CKafka instance ID.
When KafkaType is 0, KafkaInstance is required

- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     * @param KafkaInstance Tencent Cloud CKafka instance ID.
When KafkaType is 0, KafkaInstance is required

- Obtain the instance id by searching the instance list information (https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
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
     * Get Whether ServerAddr is an encrypted connection. The default value is false. It is valid when KafkaType is 1, indicating a user self-built Kafka. 
     * @return IsEncryptionAddr Whether ServerAddr is an encrypted connection. The default value is false. It is valid when KafkaType is 1, indicating a user self-built Kafka.
     */
    public Boolean getIsEncryptionAddr() {
        return this.IsEncryptionAddr;
    }

    /**
     * Set Whether ServerAddr is an encrypted connection. The default value is false. It is valid when KafkaType is 1, indicating a user self-built Kafka.
     * @param IsEncryptionAddr Whether ServerAddr is an encrypted connection. The default value is false. It is valid when KafkaType is 1, indicating a user self-built Kafka.
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
        if (source.UserKafkaMeta != null) {
            this.UserKafkaMeta = new UserKafkaMeta(source.UserKafkaMeta);
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
        this.setParamObj(map, prefix + "UserKafkaMeta.", this.UserKafkaMeta);

    }
}

