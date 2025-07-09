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

public class CreateKeyRequest extends AbstractModel {

    /**
    * Unique alias that makes a key more recognizable and understandable. This parameter cannot be empty, can contain 1-60 letters, digits, `-`, and `_`, and must begin with a letter or digit. The `kms-` prefix is used for Tencent Cloud products.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * CMK description of up to 1,024 bytes in length
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Defines the purpose of the key. The valid values are as follows: `ENCRYPT_DECRYPT` (default): creates a symmetric encryption/decryption key; `ASYMMETRIC_DECRYPT_RSA_2048`: creates an asymmetric encryption/decryption 2048-bit RSA key; `ASYMMETRIC_DECRYPT_SM2`: creates an asymmetric encryption/decryption SM2 key; `ASYMMETRIC_SIGN_VERIFY_SM2`: creates an asymmetric SM2 key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECC`: creates an asymmetric 2048-bit RSA key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECDSA384`: creates an asymmetric ECDSA384 key for signature verification. You can get a full list of supported key purposes and algorithms using the ListAlgorithms API.
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * Specifies the key type. Default value: 1. Valid value: 1 - default type, indicating that the CMK is created by KMS; 2 - EXTERNAL type, indicating that you need to import key material. For more information, please see the `GetParametersForImport` and `ImportKeyMaterial` API documents.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
     * Get Unique alias that makes a key more recognizable and understandable. This parameter cannot be empty, can contain 1-60 letters, digits, `-`, and `_`, and must begin with a letter or digit. The `kms-` prefix is used for Tencent Cloud products. 
     * @return Alias Unique alias that makes a key more recognizable and understandable. This parameter cannot be empty, can contain 1-60 letters, digits, `-`, and `_`, and must begin with a letter or digit. The `kms-` prefix is used for Tencent Cloud products.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Unique alias that makes a key more recognizable and understandable. This parameter cannot be empty, can contain 1-60 letters, digits, `-`, and `_`, and must begin with a letter or digit. The `kms-` prefix is used for Tencent Cloud products.
     * @param Alias Unique alias that makes a key more recognizable and understandable. This parameter cannot be empty, can contain 1-60 letters, digits, `-`, and `_`, and must begin with a letter or digit. The `kms-` prefix is used for Tencent Cloud products.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get CMK description of up to 1,024 bytes in length 
     * @return Description CMK description of up to 1,024 bytes in length
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CMK description of up to 1,024 bytes in length
     * @param Description CMK description of up to 1,024 bytes in length
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Defines the purpose of the key. The valid values are as follows: `ENCRYPT_DECRYPT` (default): creates a symmetric encryption/decryption key; `ASYMMETRIC_DECRYPT_RSA_2048`: creates an asymmetric encryption/decryption 2048-bit RSA key; `ASYMMETRIC_DECRYPT_SM2`: creates an asymmetric encryption/decryption SM2 key; `ASYMMETRIC_SIGN_VERIFY_SM2`: creates an asymmetric SM2 key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECC`: creates an asymmetric 2048-bit RSA key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECDSA384`: creates an asymmetric ECDSA384 key for signature verification. You can get a full list of supported key purposes and algorithms using the ListAlgorithms API. 
     * @return KeyUsage Defines the purpose of the key. The valid values are as follows: `ENCRYPT_DECRYPT` (default): creates a symmetric encryption/decryption key; `ASYMMETRIC_DECRYPT_RSA_2048`: creates an asymmetric encryption/decryption 2048-bit RSA key; `ASYMMETRIC_DECRYPT_SM2`: creates an asymmetric encryption/decryption SM2 key; `ASYMMETRIC_SIGN_VERIFY_SM2`: creates an asymmetric SM2 key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECC`: creates an asymmetric 2048-bit RSA key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECDSA384`: creates an asymmetric ECDSA384 key for signature verification. You can get a full list of supported key purposes and algorithms using the ListAlgorithms API.
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set Defines the purpose of the key. The valid values are as follows: `ENCRYPT_DECRYPT` (default): creates a symmetric encryption/decryption key; `ASYMMETRIC_DECRYPT_RSA_2048`: creates an asymmetric encryption/decryption 2048-bit RSA key; `ASYMMETRIC_DECRYPT_SM2`: creates an asymmetric encryption/decryption SM2 key; `ASYMMETRIC_SIGN_VERIFY_SM2`: creates an asymmetric SM2 key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECC`: creates an asymmetric 2048-bit RSA key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECDSA384`: creates an asymmetric ECDSA384 key for signature verification. You can get a full list of supported key purposes and algorithms using the ListAlgorithms API.
     * @param KeyUsage Defines the purpose of the key. The valid values are as follows: `ENCRYPT_DECRYPT` (default): creates a symmetric encryption/decryption key; `ASYMMETRIC_DECRYPT_RSA_2048`: creates an asymmetric encryption/decryption 2048-bit RSA key; `ASYMMETRIC_DECRYPT_SM2`: creates an asymmetric encryption/decryption SM2 key; `ASYMMETRIC_SIGN_VERIFY_SM2`: creates an asymmetric SM2 key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECC`: creates an asymmetric 2048-bit RSA key for signature verification; `ASYMMETRIC_SIGN_VERIFY_ECDSA384`: creates an asymmetric ECDSA384 key for signature verification. You can get a full list of supported key purposes and algorithms using the ListAlgorithms API.
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get Specifies the key type. Default value: 1. Valid value: 1 - default type, indicating that the CMK is created by KMS; 2 - EXTERNAL type, indicating that you need to import key material. For more information, please see the `GetParametersForImport` and `ImportKeyMaterial` API documents. 
     * @return Type Specifies the key type. Default value: 1. Valid value: 1 - default type, indicating that the CMK is created by KMS; 2 - EXTERNAL type, indicating that you need to import key material. For more information, please see the `GetParametersForImport` and `ImportKeyMaterial` API documents.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Specifies the key type. Default value: 1. Valid value: 1 - default type, indicating that the CMK is created by KMS; 2 - EXTERNAL type, indicating that you need to import key material. For more information, please see the `GetParametersForImport` and `ImportKeyMaterial` API documents.
     * @param Type Specifies the key type. Default value: 1. Valid value: 1 - default type, indicating that the CMK is created by KMS; 2 - EXTERNAL type, indicating that you need to import key material. For more information, please see the `GetParametersForImport` and `ImportKeyMaterial` API documents.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances. 
     * @return HsmClusterId ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
     * @param HsmClusterId ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public CreateKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeyRequest(CreateKeyRequest source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

