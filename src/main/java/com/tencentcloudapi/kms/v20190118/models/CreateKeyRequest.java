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
    * <p>Alias that makes the key easier to identify and understand. It cannot be empty and must contain 1-60 alphanumeric characters, hyphens (-), or underscores (_), and start with a letter or digit. Aliases prefixed with kms- are reserved for cloud services. The alias must be unique.</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Description of the CMK. Maximum length: 1024 bytes.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Specifies the purpose of the key. The default value is "ENCRYPT_DECRYPT", which indicates creating a symmetric encryption/decryption key. Other supported purposes: "ASYMMETRIC_DECRYPT_RSA_2048" indicates creating an RSA2048 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_3072" indicates creating an RSA3072 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_4096" indicates creating an RSA4096 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_SM2" indicates creating an SM2 asymmetric key for encryption/decryption; "ASYMMETRIC_SIGN_VERIFY_SM2" indicates creating an SM2 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECC" indicates creating an ECC asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_2048" indicates creating an RSA_2048 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_3072" indicates creating an RSA_3072 asymmetric key for signature generation and verification; <br>"ASYMMETRIC_SIGN_VERIFY_RSA_4096" indicates creating an RSA_4096 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECDSA384" indicates creating an ECDSA384 asymmetric key for signature generation and verification. For the complete list of key purposes and supported algorithms, call the ListAlgorithms API.</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>Specifies the key type. The default value is 1. 1 indicates the default type, where the CMK is created by KMS. 2 indicates the EXTERNAL type, where you need to import the key material. For more information, see the GetParametersForImport and ImportKeyMaterial APIs.</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Tag list.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>HSM cluster ID corresponding to KMS Advanced Edition (valid only for KMS exclusive/managed service instances).</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
     * Get <p>Alias that makes the key easier to identify and understand. It cannot be empty and must contain 1-60 alphanumeric characters, hyphens (-), or underscores (_), and start with a letter or digit. Aliases prefixed with kms- are reserved for cloud services. The alias must be unique.</p> 
     * @return Alias <p>Alias that makes the key easier to identify and understand. It cannot be empty and must contain 1-60 alphanumeric characters, hyphens (-), or underscores (_), and start with a letter or digit. Aliases prefixed with kms- are reserved for cloud services. The alias must be unique.</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Alias that makes the key easier to identify and understand. It cannot be empty and must contain 1-60 alphanumeric characters, hyphens (-), or underscores (_), and start with a letter or digit. Aliases prefixed with kms- are reserved for cloud services. The alias must be unique.</p>
     * @param Alias <p>Alias that makes the key easier to identify and understand. It cannot be empty and must contain 1-60 alphanumeric characters, hyphens (-), or underscores (_), and start with a letter or digit. Aliases prefixed with kms- are reserved for cloud services. The alias must be unique.</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Description of the CMK. Maximum length: 1024 bytes.</p> 
     * @return Description <p>Description of the CMK. Maximum length: 1024 bytes.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description of the CMK. Maximum length: 1024 bytes.</p>
     * @param Description <p>Description of the CMK. Maximum length: 1024 bytes.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Specifies the purpose of the key. The default value is "ENCRYPT_DECRYPT", which indicates creating a symmetric encryption/decryption key. Other supported purposes: "ASYMMETRIC_DECRYPT_RSA_2048" indicates creating an RSA2048 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_3072" indicates creating an RSA3072 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_4096" indicates creating an RSA4096 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_SM2" indicates creating an SM2 asymmetric key for encryption/decryption; "ASYMMETRIC_SIGN_VERIFY_SM2" indicates creating an SM2 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECC" indicates creating an ECC asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_2048" indicates creating an RSA_2048 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_3072" indicates creating an RSA_3072 asymmetric key for signature generation and verification; <br>"ASYMMETRIC_SIGN_VERIFY_RSA_4096" indicates creating an RSA_4096 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECDSA384" indicates creating an ECDSA384 asymmetric key for signature generation and verification. For the complete list of key purposes and supported algorithms, call the ListAlgorithms API.</p> 
     * @return KeyUsage <p>Specifies the purpose of the key. The default value is "ENCRYPT_DECRYPT", which indicates creating a symmetric encryption/decryption key. Other supported purposes: "ASYMMETRIC_DECRYPT_RSA_2048" indicates creating an RSA2048 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_3072" indicates creating an RSA3072 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_4096" indicates creating an RSA4096 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_SM2" indicates creating an SM2 asymmetric key for encryption/decryption; "ASYMMETRIC_SIGN_VERIFY_SM2" indicates creating an SM2 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECC" indicates creating an ECC asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_2048" indicates creating an RSA_2048 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_3072" indicates creating an RSA_3072 asymmetric key for signature generation and verification; <br>"ASYMMETRIC_SIGN_VERIFY_RSA_4096" indicates creating an RSA_4096 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECDSA384" indicates creating an ECDSA384 asymmetric key for signature generation and verification. For the complete list of key purposes and supported algorithms, call the ListAlgorithms API.</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>Specifies the purpose of the key. The default value is "ENCRYPT_DECRYPT", which indicates creating a symmetric encryption/decryption key. Other supported purposes: "ASYMMETRIC_DECRYPT_RSA_2048" indicates creating an RSA2048 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_3072" indicates creating an RSA3072 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_4096" indicates creating an RSA4096 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_SM2" indicates creating an SM2 asymmetric key for encryption/decryption; "ASYMMETRIC_SIGN_VERIFY_SM2" indicates creating an SM2 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECC" indicates creating an ECC asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_2048" indicates creating an RSA_2048 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_3072" indicates creating an RSA_3072 asymmetric key for signature generation and verification; <br>"ASYMMETRIC_SIGN_VERIFY_RSA_4096" indicates creating an RSA_4096 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECDSA384" indicates creating an ECDSA384 asymmetric key for signature generation and verification. For the complete list of key purposes and supported algorithms, call the ListAlgorithms API.</p>
     * @param KeyUsage <p>Specifies the purpose of the key. The default value is "ENCRYPT_DECRYPT", which indicates creating a symmetric encryption/decryption key. Other supported purposes: "ASYMMETRIC_DECRYPT_RSA_2048" indicates creating an RSA2048 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_3072" indicates creating an RSA3072 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_RSA_4096" indicates creating an RSA4096 asymmetric key for encryption/decryption; "ASYMMETRIC_DECRYPT_SM2" indicates creating an SM2 asymmetric key for encryption/decryption; "ASYMMETRIC_SIGN_VERIFY_SM2" indicates creating an SM2 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECC" indicates creating an ECC asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_2048" indicates creating an RSA_2048 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_RSA_3072" indicates creating an RSA_3072 asymmetric key for signature generation and verification; <br>"ASYMMETRIC_SIGN_VERIFY_RSA_4096" indicates creating an RSA_4096 asymmetric key for signature generation and verification; "ASYMMETRIC_SIGN_VERIFY_ECDSA384" indicates creating an ECDSA384 asymmetric key for signature generation and verification. For the complete list of key purposes and supported algorithms, call the ListAlgorithms API.</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get <p>Specifies the key type. The default value is 1. 1 indicates the default type, where the CMK is created by KMS. 2 indicates the EXTERNAL type, where you need to import the key material. For more information, see the GetParametersForImport and ImportKeyMaterial APIs.</p> 
     * @return Type <p>Specifies the key type. The default value is 1. 1 indicates the default type, where the CMK is created by KMS. 2 indicates the EXTERNAL type, where you need to import the key material. For more information, see the GetParametersForImport and ImportKeyMaterial APIs.</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Specifies the key type. The default value is 1. 1 indicates the default type, where the CMK is created by KMS. 2 indicates the EXTERNAL type, where you need to import the key material. For more information, see the GetParametersForImport and ImportKeyMaterial APIs.</p>
     * @param Type <p>Specifies the key type. The default value is 1. 1 indicates the default type, where the CMK is created by KMS. 2 indicates the EXTERNAL type, where you need to import the key material. For more information, see the GetParametersForImport and ImportKeyMaterial APIs.</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Tag list.</p> 
     * @return Tags <p>Tag list.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list.</p>
     * @param Tags <p>Tag list.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>HSM cluster ID corresponding to KMS Advanced Edition (valid only for KMS exclusive/managed service instances).</p> 
     * @return HsmClusterId <p>HSM cluster ID corresponding to KMS Advanced Edition (valid only for KMS exclusive/managed service instances).</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM cluster ID corresponding to KMS Advanced Edition (valid only for KMS exclusive/managed service instances).</p>
     * @param HsmClusterId <p>HSM cluster ID corresponding to KMS Advanced Edition (valid only for KMS exclusive/managed service instances).</p>
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

