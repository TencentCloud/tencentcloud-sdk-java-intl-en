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

public class ReEncryptRequest extends AbstractModel{

    /**
    * Ciphertext to be re-encrypted
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * CMK used for re-encryption. If this parameter is empty, the ciphertext will be re-encrypted by using the original CMK (as long as the key is not rotated, the ciphertext will not be refreshed)
    */
    @SerializedName("DestinationKeyId")
    @Expose
    private String DestinationKeyId;

    /**
    * JSON string of the key-value pair used during ciphertext encryption by `CiphertextBlob`. If not used during encryption, this parameter will be empty
    */
    @SerializedName("SourceEncryptionContext")
    @Expose
    private String SourceEncryptionContext;

    /**
    * JSON string of the key-value pair used during re-encryption. If this field is used, the same string should be entered when the returned new ciphertext is decrypted
    */
    @SerializedName("DestinationEncryptionContext")
    @Expose
    private String DestinationEncryptionContext;

    /**
     * Get Ciphertext to be re-encrypted 
     * @return CiphertextBlob Ciphertext to be re-encrypted
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set Ciphertext to be re-encrypted
     * @param CiphertextBlob Ciphertext to be re-encrypted
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get CMK used for re-encryption. If this parameter is empty, the ciphertext will be re-encrypted by using the original CMK (as long as the key is not rotated, the ciphertext will not be refreshed) 
     * @return DestinationKeyId CMK used for re-encryption. If this parameter is empty, the ciphertext will be re-encrypted by using the original CMK (as long as the key is not rotated, the ciphertext will not be refreshed)
     */
    public String getDestinationKeyId() {
        return this.DestinationKeyId;
    }

    /**
     * Set CMK used for re-encryption. If this parameter is empty, the ciphertext will be re-encrypted by using the original CMK (as long as the key is not rotated, the ciphertext will not be refreshed)
     * @param DestinationKeyId CMK used for re-encryption. If this parameter is empty, the ciphertext will be re-encrypted by using the original CMK (as long as the key is not rotated, the ciphertext will not be refreshed)
     */
    public void setDestinationKeyId(String DestinationKeyId) {
        this.DestinationKeyId = DestinationKeyId;
    }

    /**
     * Get JSON string of the key-value pair used during ciphertext encryption by `CiphertextBlob`. If not used during encryption, this parameter will be empty 
     * @return SourceEncryptionContext JSON string of the key-value pair used during ciphertext encryption by `CiphertextBlob`. If not used during encryption, this parameter will be empty
     */
    public String getSourceEncryptionContext() {
        return this.SourceEncryptionContext;
    }

    /**
     * Set JSON string of the key-value pair used during ciphertext encryption by `CiphertextBlob`. If not used during encryption, this parameter will be empty
     * @param SourceEncryptionContext JSON string of the key-value pair used during ciphertext encryption by `CiphertextBlob`. If not used during encryption, this parameter will be empty
     */
    public void setSourceEncryptionContext(String SourceEncryptionContext) {
        this.SourceEncryptionContext = SourceEncryptionContext;
    }

    /**
     * Get JSON string of the key-value pair used during re-encryption. If this field is used, the same string should be entered when the returned new ciphertext is decrypted 
     * @return DestinationEncryptionContext JSON string of the key-value pair used during re-encryption. If this field is used, the same string should be entered when the returned new ciphertext is decrypted
     */
    public String getDestinationEncryptionContext() {
        return this.DestinationEncryptionContext;
    }

    /**
     * Set JSON string of the key-value pair used during re-encryption. If this field is used, the same string should be entered when the returned new ciphertext is decrypted
     * @param DestinationEncryptionContext JSON string of the key-value pair used during re-encryption. If this field is used, the same string should be entered when the returned new ciphertext is decrypted
     */
    public void setDestinationEncryptionContext(String DestinationEncryptionContext) {
        this.DestinationEncryptionContext = DestinationEncryptionContext;
    }

    public ReEncryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReEncryptRequest(ReEncryptRequest source) {
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.DestinationKeyId != null) {
            this.DestinationKeyId = new String(source.DestinationKeyId);
        }
        if (source.SourceEncryptionContext != null) {
            this.SourceEncryptionContext = new String(source.SourceEncryptionContext);
        }
        if (source.DestinationEncryptionContext != null) {
            this.DestinationEncryptionContext = new String(source.DestinationEncryptionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "DestinationKeyId", this.DestinationKeyId);
        this.setParamSimple(map, prefix + "SourceEncryptionContext", this.SourceEncryptionContext);
        this.setParamSimple(map, prefix + "DestinationEncryptionContext", this.DestinationEncryptionContext);

    }
}

