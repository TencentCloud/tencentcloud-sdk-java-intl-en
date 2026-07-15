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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportKeyMaterialRequest extends AbstractModel {

    /**
    * <p>base64-encoded encrypted key material using the PublicKey returned by GetParametersForImport. For KMS in national cryptography version regions, the length requirement for imported key material is 128 bit. For KMS in FIPS 140-2 version regions, the length requirement for imported key material is 256 bit.</p>
    */
    @SerializedName("EncryptedKeyMaterial")
    @Expose
    private String EncryptedKeyMaterial;

    /**
    * <p>Import token obtained by calling GetParametersForImport.</p>
    */
    @SerializedName("ImportToken")
    @Expose
    private String ImportToken;

    /**
    * <p>The CMK designated for importing key material must be identical to the CMK specified in GetParametersForImport.</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>Expiration time of the key material in unix timestamp. If unspecified or 0, the key material does not expire. If specified, the expiration time must be greater than the current time and supports up to 2147443200.</p>
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
     * Get <p>base64-encoded encrypted key material using the PublicKey returned by GetParametersForImport. For KMS in national cryptography version regions, the length requirement for imported key material is 128 bit. For KMS in FIPS 140-2 version regions, the length requirement for imported key material is 256 bit.</p> 
     * @return EncryptedKeyMaterial <p>base64-encoded encrypted key material using the PublicKey returned by GetParametersForImport. For KMS in national cryptography version regions, the length requirement for imported key material is 128 bit. For KMS in FIPS 140-2 version regions, the length requirement for imported key material is 256 bit.</p>
     */
    public String getEncryptedKeyMaterial() {
        return this.EncryptedKeyMaterial;
    }

    /**
     * Set <p>base64-encoded encrypted key material using the PublicKey returned by GetParametersForImport. For KMS in national cryptography version regions, the length requirement for imported key material is 128 bit. For KMS in FIPS 140-2 version regions, the length requirement for imported key material is 256 bit.</p>
     * @param EncryptedKeyMaterial <p>base64-encoded encrypted key material using the PublicKey returned by GetParametersForImport. For KMS in national cryptography version regions, the length requirement for imported key material is 128 bit. For KMS in FIPS 140-2 version regions, the length requirement for imported key material is 256 bit.</p>
     */
    public void setEncryptedKeyMaterial(String EncryptedKeyMaterial) {
        this.EncryptedKeyMaterial = EncryptedKeyMaterial;
    }

    /**
     * Get <p>Import token obtained by calling GetParametersForImport.</p> 
     * @return ImportToken <p>Import token obtained by calling GetParametersForImport.</p>
     */
    public String getImportToken() {
        return this.ImportToken;
    }

    /**
     * Set <p>Import token obtained by calling GetParametersForImport.</p>
     * @param ImportToken <p>Import token obtained by calling GetParametersForImport.</p>
     */
    public void setImportToken(String ImportToken) {
        this.ImportToken = ImportToken;
    }

    /**
     * Get <p>The CMK designated for importing key material must be identical to the CMK specified in GetParametersForImport.</p> 
     * @return KeyId <p>The CMK designated for importing key material must be identical to the CMK specified in GetParametersForImport.</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>The CMK designated for importing key material must be identical to the CMK specified in GetParametersForImport.</p>
     * @param KeyId <p>The CMK designated for importing key material must be identical to the CMK specified in GetParametersForImport.</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>Expiration time of the key material in unix timestamp. If unspecified or 0, the key material does not expire. If specified, the expiration time must be greater than the current time and supports up to 2147443200.</p> 
     * @return ValidTo <p>Expiration time of the key material in unix timestamp. If unspecified or 0, the key material does not expire. If specified, the expiration time must be greater than the current time and supports up to 2147443200.</p>
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set <p>Expiration time of the key material in unix timestamp. If unspecified or 0, the key material does not expire. If specified, the expiration time must be greater than the current time and supports up to 2147443200.</p>
     * @param ValidTo <p>Expiration time of the key material in unix timestamp. If unspecified or 0, the key material does not expire. If specified, the expiration time must be greater than the current time and supports up to 2147443200.</p>
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    public ImportKeyMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportKeyMaterialRequest(ImportKeyMaterialRequest source) {
        if (source.EncryptedKeyMaterial != null) {
            this.EncryptedKeyMaterial = new String(source.EncryptedKeyMaterial);
        }
        if (source.ImportToken != null) {
            this.ImportToken = new String(source.ImportToken);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new Long(source.ValidTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptedKeyMaterial", this.EncryptedKeyMaterial);
        this.setParamSimple(map, prefix + "ImportToken", this.ImportToken);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);

    }
}

