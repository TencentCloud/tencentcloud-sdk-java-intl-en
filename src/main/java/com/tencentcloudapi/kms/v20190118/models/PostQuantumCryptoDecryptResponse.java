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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostQuantumCryptoDecryptResponse extends AbstractModel{

    /**
    * Globally unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * If `EncryptionPublicKey` is left empty, a Base64-encoded ciphertext will be returned. To get the plaintext, you need to decode the ciphertext first.
If `EncryptionPublicKey` is passed in, this field u200dcontains the Base64-encoded ciphertext after asymmetric encryption by using the public key in `EncryptionPublicKey` To get the plaintext, you need to first decode the Base64 format, and then decrypwith the private key corresponding with the public key. The private key is uploaded by the user. 
    */
    @SerializedName("PlainText")
    @Expose
    private String PlainText;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Globally unique CMK ID 
     * @return KeyId Globally unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique CMK ID
     * @param KeyId Globally unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get If `EncryptionPublicKey` is left empty, a Base64-encoded ciphertext will be returned. To get the plaintext, you need to decode the ciphertext first.
If `EncryptionPublicKey` is passed in, this field u200dcontains the Base64-encoded ciphertext after asymmetric encryption by using the public key in `EncryptionPublicKey` To get the plaintext, you need to first decode the Base64 format, and then decrypwith the private key corresponding with the public key. The private key is uploaded by the user.  
     * @return PlainText If `EncryptionPublicKey` is left empty, a Base64-encoded ciphertext will be returned. To get the plaintext, you need to decode the ciphertext first.
If `EncryptionPublicKey` is passed in, this field u200dcontains the Base64-encoded ciphertext after asymmetric encryption by using the public key in `EncryptionPublicKey` To get the plaintext, you need to first decode the Base64 format, and then decrypwith the private key corresponding with the public key. The private key is uploaded by the user. 
     */
    public String getPlainText() {
        return this.PlainText;
    }

    /**
     * Set If `EncryptionPublicKey` is left empty, a Base64-encoded ciphertext will be returned. To get the plaintext, you need to decode the ciphertext first.
If `EncryptionPublicKey` is passed in, this field u200dcontains the Base64-encoded ciphertext after asymmetric encryption by using the public key in `EncryptionPublicKey` To get the plaintext, you need to first decode the Base64 format, and then decrypwith the private key corresponding with the public key. The private key is uploaded by the user. 
     * @param PlainText If `EncryptionPublicKey` is left empty, a Base64-encoded ciphertext will be returned. To get the plaintext, you need to decode the ciphertext first.
If `EncryptionPublicKey` is passed in, this field u200dcontains the Base64-encoded ciphertext after asymmetric encryption by using the public key in `EncryptionPublicKey` To get the plaintext, you need to first decode the Base64 format, and then decrypwith the private key corresponding with the public key. The private key is uploaded by the user. 
     */
    public void setPlainText(String PlainText) {
        this.PlainText = PlainText;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public PostQuantumCryptoDecryptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostQuantumCryptoDecryptResponse(PostQuantumCryptoDecryptResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PlainText != null) {
            this.PlainText = new String(source.PlainText);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlainText", this.PlainText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

