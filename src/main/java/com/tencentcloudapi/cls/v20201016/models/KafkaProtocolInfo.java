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
    * Protocol type. Supported protocol types include plaintext, sasl_plaintext, or sasl_ssl. Recommend using sasl_ssl. Protocol enables encrypted connection and also requires user authentication.

-Protocol is required when IsEncryptionAddr is true.
-Supported protocol types are as follows:
-plaintext: Plaintext without encryption protocol
-sasl_ssl: sasl authentication + ssl encryption
-ssl: Pure ssl/TLS encryption protocol
-sasl_plaintext: SASL authentication + unencrypted tunnel

    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.

-Mechanism is required when Protocol is `sasl_plaintext` or `sasl_ssl`.
-Supported encryption types are as follows.
-PLAIN: plaintext authentication
-SCRAM-SHA-256: Based on challenge-response mechanism, uses PBKDF2-HMAC-SHA256 algorithm.
-SCRAM-SHA-512: Enhanced SCRAM that uses the PBKDF2-HMAC-SHA512 algorithm.
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * Username.
Required when Protocol is sasl_plaintext or sasl_ssl
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User password.
Required when Protocol is sasl_plaintext or sasl_ssl
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Protocol type. Supported protocol types include plaintext, sasl_plaintext, or sasl_ssl. Recommend using sasl_ssl. Protocol enables encrypted connection and also requires user authentication.

-Protocol is required when IsEncryptionAddr is true.
-Supported protocol types are as follows:
-plaintext: Plaintext without encryption protocol
-sasl_ssl: sasl authentication + ssl encryption
-ssl: Pure ssl/TLS encryption protocol
-sasl_plaintext: SASL authentication + unencrypted tunnel
 
     * @return Protocol Protocol type. Supported protocol types include plaintext, sasl_plaintext, or sasl_ssl. Recommend using sasl_ssl. Protocol enables encrypted connection and also requires user authentication.

-Protocol is required when IsEncryptionAddr is true.
-Supported protocol types are as follows:
-plaintext: Plaintext without encryption protocol
-sasl_ssl: sasl authentication + ssl encryption
-ssl: Pure ssl/TLS encryption protocol
-sasl_plaintext: SASL authentication + unencrypted tunnel

     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type. Supported protocol types include plaintext, sasl_plaintext, or sasl_ssl. Recommend using sasl_ssl. Protocol enables encrypted connection and also requires user authentication.

-Protocol is required when IsEncryptionAddr is true.
-Supported protocol types are as follows:
-plaintext: Plaintext without encryption protocol
-sasl_ssl: sasl authentication + ssl encryption
-ssl: Pure ssl/TLS encryption protocol
-sasl_plaintext: SASL authentication + unencrypted tunnel

     * @param Protocol Protocol type. Supported protocol types include plaintext, sasl_plaintext, or sasl_ssl. Recommend using sasl_ssl. Protocol enables encrypted connection and also requires user authentication.

-Protocol is required when IsEncryptionAddr is true.
-Supported protocol types are as follows:
-plaintext: Plaintext without encryption protocol
-sasl_ssl: sasl authentication + ssl encryption
-ssl: Pure ssl/TLS encryption protocol
-sasl_plaintext: SASL authentication + unencrypted tunnel

     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.

-Mechanism is required when Protocol is `sasl_plaintext` or `sasl_ssl`.
-Supported encryption types are as follows.
-PLAIN: plaintext authentication
-SCRAM-SHA-256: Based on challenge-response mechanism, uses PBKDF2-HMAC-SHA256 algorithm.
-SCRAM-SHA-512: Enhanced SCRAM that uses the PBKDF2-HMAC-SHA512 algorithm. 
     * @return Mechanism Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.

-Mechanism is required when Protocol is `sasl_plaintext` or `sasl_ssl`.
-Supported encryption types are as follows.
-PLAIN: plaintext authentication
-SCRAM-SHA-256: Based on challenge-response mechanism, uses PBKDF2-HMAC-SHA256 algorithm.
-SCRAM-SHA-512: Enhanced SCRAM that uses the PBKDF2-HMAC-SHA512 algorithm.
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.

-Mechanism is required when Protocol is `sasl_plaintext` or `sasl_ssl`.
-Supported encryption types are as follows.
-PLAIN: plaintext authentication
-SCRAM-SHA-256: Based on challenge-response mechanism, uses PBKDF2-HMAC-SHA256 algorithm.
-SCRAM-SHA-512: Enhanced SCRAM that uses the PBKDF2-HMAC-SHA512 algorithm.
     * @param Mechanism Encryption type, supports PLAIN, SCRAM-SHA-256, or SCRAM-SHA-512.

-Mechanism is required when Protocol is `sasl_plaintext` or `sasl_ssl`.
-Supported encryption types are as follows.
-PLAIN: plaintext authentication
-SCRAM-SHA-256: Based on challenge-response mechanism, uses PBKDF2-HMAC-SHA256 algorithm.
-SCRAM-SHA-512: Enhanced SCRAM that uses the PBKDF2-HMAC-SHA512 algorithm.
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get Username.
Required when Protocol is sasl_plaintext or sasl_ssl 
     * @return UserName Username.
Required when Protocol is sasl_plaintext or sasl_ssl
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Required when Protocol is sasl_plaintext or sasl_ssl
     * @param UserName Username.
Required when Protocol is sasl_plaintext or sasl_ssl
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User password.
Required when Protocol is sasl_plaintext or sasl_ssl 
     * @return Password User password.
Required when Protocol is sasl_plaintext or sasl_ssl
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set User password.
Required when Protocol is sasl_plaintext or sasl_ssl
     * @param Password User password.
Required when Protocol is sasl_plaintext or sasl_ssl
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

