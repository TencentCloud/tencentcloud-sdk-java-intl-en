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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaInfo extends AbstractModel {

    /**
    * Kafka address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Kafka topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * CKafka username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * CKafka password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * CKafka instance
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Whether VPC access is enabled
    */
    @SerializedName("IsVpc")
    @Expose
    private Long IsVpc;

    /**
     * Get Kafka address 
     * @return Address Kafka address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Kafka address
     * @param Address Kafka address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Kafka topic 
     * @return Topic Kafka topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Kafka topic
     * @param Topic Kafka topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get CKafka username 
     * @return User CKafka username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set CKafka username
     * @param User CKafka username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get CKafka password 
     * @return Password CKafka password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set CKafka password
     * @param Password CKafka password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get CKafka instance 
     * @return Instance CKafka instance
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set CKafka instance
     * @param Instance CKafka instance
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Whether VPC access is enabled 
     * @return IsVpc Whether VPC access is enabled
     */
    public Long getIsVpc() {
        return this.IsVpc;
    }

    /**
     * Set Whether VPC access is enabled
     * @param IsVpc Whether VPC access is enabled
     */
    public void setIsVpc(Long IsVpc) {
        this.IsVpc = IsVpc;
    }

    public KafkaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaInfo(KafkaInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.IsVpc != null) {
            this.IsVpc = new Long(source.IsVpc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "IsVpc", this.IsVpc);

    }
}

