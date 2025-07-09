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

public class KafkaProtocolInfo extends AbstractModel {

    /**
    * Protocol type, including plaintext, sasl_plaintext, or sasl_ssl. sasl_ssl is recommended for encrypted connections and user authentication.Required input parameters
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.Required when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * UsernameRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User PasswordRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Protocol type, including plaintext, sasl_plaintext, or sasl_ssl. sasl_ssl is recommended for encrypted connections and user authentication.Required input parameters
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol type, including plaintext, sasl_plaintext, or sasl_ssl. sasl_ssl is recommended for encrypted connections and user authentication.Required input parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type, including plaintext, sasl_plaintext, or sasl_ssl. sasl_ssl is recommended for encrypted connections and user authentication.Required input parameters
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol type, including plaintext, sasl_plaintext, or sasl_ssl. sasl_ssl is recommended for encrypted connections and user authentication.Required input parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.Required when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mechanism Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.Required when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.Required when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mechanism Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.Required when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get UsernameRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName UsernameRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set UsernameRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName UsernameRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User PasswordRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Password User PasswordRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set User PasswordRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Password User PasswordRequired when the Protocol is sasl_plaintext or sasl_ssl.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public KafkaProtocolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaProtocolInfo(KafkaProtocolInfo source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Mechanism != null) {
            this.Mechanism = new String(source.Mechanism);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

