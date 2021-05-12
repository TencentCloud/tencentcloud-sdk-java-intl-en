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

public class ImportKeyMaterialRequest extends AbstractModel{

    /**
    * Base64-encoded key material that encrypted with the `PublicKey` returned by `GetParametersForImport`. For the KMS of SM-CRYPTO version, the length of the key material should be 128 bits, while for KMS of FIPS-compliant version, the length should be 256 bits.
    */
    @SerializedName("EncryptedKeyMaterial")
    @Expose
    private String EncryptedKeyMaterial;

    /**
    * Import token obtained by calling `GetParametersForImport`.
    */
    @SerializedName("ImportToken")
    @Expose
    private String ImportToken;

    /**
    * Specifies the CMK into which to import key material, which must be the same as the one specified by `GetParametersForImport`.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Unix timestamp of the key material's expiration time. If this value is empty or 0, the key material will never expire. To specify the expiration time, it should be later than the current time. Maximum value: 2147443200.
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
     * Get Base64-encoded key material that encrypted with the `PublicKey` returned by `GetParametersForImport`. For the KMS of SM-CRYPTO version, the length of the key material should be 128 bits, while for KMS of FIPS-compliant version, the length should be 256 bits. 
     * @return EncryptedKeyMaterial Base64-encoded key material that encrypted with the `PublicKey` returned by `GetParametersForImport`. For the KMS of SM-CRYPTO version, the length of the key material should be 128 bits, while for KMS of FIPS-compliant version, the length should be 256 bits.
     */
    public String getEncryptedKeyMaterial() {
        return this.EncryptedKeyMaterial;
    }

    /**
     * Set Base64-encoded key material that encrypted with the `PublicKey` returned by `GetParametersForImport`. For the KMS of SM-CRYPTO version, the length of the key material should be 128 bits, while for KMS of FIPS-compliant version, the length should be 256 bits.
     * @param EncryptedKeyMaterial Base64-encoded key material that encrypted with the `PublicKey` returned by `GetParametersForImport`. For the KMS of SM-CRYPTO version, the length of the key material should be 128 bits, while for KMS of FIPS-compliant version, the length should be 256 bits.
     */
    public void setEncryptedKeyMaterial(String EncryptedKeyMaterial) {
        this.EncryptedKeyMaterial = EncryptedKeyMaterial;
    }

    /**
     * Get Import token obtained by calling `GetParametersForImport`. 
     * @return ImportToken Import token obtained by calling `GetParametersForImport`.
     */
    public String getImportToken() {
        return this.ImportToken;
    }

    /**
     * Set Import token obtained by calling `GetParametersForImport`.
     * @param ImportToken Import token obtained by calling `GetParametersForImport`.
     */
    public void setImportToken(String ImportToken) {
        this.ImportToken = ImportToken;
    }

    /**
     * Get Specifies the CMK into which to import key material, which must be the same as the one specified by `GetParametersForImport`. 
     * @return KeyId Specifies the CMK into which to import key material, which must be the same as the one specified by `GetParametersForImport`.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Specifies the CMK into which to import key material, which must be the same as the one specified by `GetParametersForImport`.
     * @param KeyId Specifies the CMK into which to import key material, which must be the same as the one specified by `GetParametersForImport`.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Unix timestamp of the key material's expiration time. If this value is empty or 0, the key material will never expire. To specify the expiration time, it should be later than the current time. Maximum value: 2147443200. 
     * @return ValidTo Unix timestamp of the key material's expiration time. If this value is empty or 0, the key material will never expire. To specify the expiration time, it should be later than the current time. Maximum value: 2147443200.
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set Unix timestamp of the key material's expiration time. If this value is empty or 0, the key material will never expire. To specify the expiration time, it should be later than the current time. Maximum value: 2147443200.
     * @param ValidTo Unix timestamp of the key material's expiration time. If this value is empty or 0, the key material will never expire. To specify the expiration time, it should be later than the current time. Maximum value: 2147443200.
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

