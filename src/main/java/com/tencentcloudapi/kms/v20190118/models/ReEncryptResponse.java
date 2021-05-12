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

public class ReEncryptResponse extends AbstractModel{

    /**
    * Re-encrypted ciphertext
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * CMK used for re-encryption
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * CMK used by ciphertext before re-encryption
    */
    @SerializedName("SourceKeyId")
    @Expose
    private String SourceKeyId;

    /**
    * `true` indicates that the ciphertext has been re-encrypted. When re-encryption is initiated by using the same CMK, as long as the CMK is not rotated, no actual re-encryption will be performed, and the original ciphertext will be returned
    */
    @SerializedName("ReEncrypted")
    @Expose
    private Boolean ReEncrypted;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Re-encrypted ciphertext 
     * @return CiphertextBlob Re-encrypted ciphertext
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set Re-encrypted ciphertext
     * @param CiphertextBlob Re-encrypted ciphertext
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get CMK used for re-encryption 
     * @return KeyId CMK used for re-encryption
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK used for re-encryption
     * @param KeyId CMK used for re-encryption
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get CMK used by ciphertext before re-encryption 
     * @return SourceKeyId CMK used by ciphertext before re-encryption
     */
    public String getSourceKeyId() {
        return this.SourceKeyId;
    }

    /**
     * Set CMK used by ciphertext before re-encryption
     * @param SourceKeyId CMK used by ciphertext before re-encryption
     */
    public void setSourceKeyId(String SourceKeyId) {
        this.SourceKeyId = SourceKeyId;
    }

    /**
     * Get `true` indicates that the ciphertext has been re-encrypted. When re-encryption is initiated by using the same CMK, as long as the CMK is not rotated, no actual re-encryption will be performed, and the original ciphertext will be returned 
     * @return ReEncrypted `true` indicates that the ciphertext has been re-encrypted. When re-encryption is initiated by using the same CMK, as long as the CMK is not rotated, no actual re-encryption will be performed, and the original ciphertext will be returned
     */
    public Boolean getReEncrypted() {
        return this.ReEncrypted;
    }

    /**
     * Set `true` indicates that the ciphertext has been re-encrypted. When re-encryption is initiated by using the same CMK, as long as the CMK is not rotated, no actual re-encryption will be performed, and the original ciphertext will be returned
     * @param ReEncrypted `true` indicates that the ciphertext has been re-encrypted. When re-encryption is initiated by using the same CMK, as long as the CMK is not rotated, no actual re-encryption will be performed, and the original ciphertext will be returned
     */
    public void setReEncrypted(Boolean ReEncrypted) {
        this.ReEncrypted = ReEncrypted;
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

    public ReEncryptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReEncryptResponse(ReEncryptResponse source) {
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.SourceKeyId != null) {
            this.SourceKeyId = new String(source.SourceKeyId);
        }
        if (source.ReEncrypted != null) {
            this.ReEncrypted = new Boolean(source.ReEncrypted);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "SourceKeyId", this.SourceKeyId);
        this.setParamSimple(map, prefix + "ReEncrypted", this.ReEncrypted);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

