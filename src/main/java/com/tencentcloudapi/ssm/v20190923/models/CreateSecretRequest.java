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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecretRequest extends AbstractModel {

    /**
    * Secret name, which must be unique in the same region. It can contain 128 bytes ([a-z], [A-Z], [0-9], [-_]). It must begin with a letter or digit. Note that it cannot be modified once created. 
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Secret version. It can contain up to 64 bytes ([a-z], [A-Z], [0-9], [-_.]). It must begin with a letter or digit. `SecretName` and `VersionId` are used to query the Secret information. If it is left empty, the initial Secret version number is used by default.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Description information, such as the detailed use cases. It can be up to 2048 bytes.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * KMS CMK used for Secret encryption. If this parameter is left empty, SecretsManager will create a CMK by default. You can also specify a KMS CMK that is created in the same region.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Secret type. It defaults to `custom`.
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * Base64-encoded plaintext of a binary Secret. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * Plaintext of a Secret, in text format. Base64 encoding is not required. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
    * Additional configuration of the Secret in JSON format
    */
    @SerializedName("AdditionalConfig")
    @Expose
    private String AdditionalConfig;

    /**
    * List of tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Secret name, which must be unique in the same region. It can contain 128 bytes ([a-z], [A-Z], [0-9], [-_]). It must begin with a letter or digit. Note that it cannot be modified once created.  
     * @return SecretName Secret name, which must be unique in the same region. It can contain 128 bytes ([a-z], [A-Z], [0-9], [-_]). It must begin with a letter or digit. Note that it cannot be modified once created. 
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Secret name, which must be unique in the same region. It can contain 128 bytes ([a-z], [A-Z], [0-9], [-_]). It must begin with a letter or digit. Note that it cannot be modified once created. 
     * @param SecretName Secret name, which must be unique in the same region. It can contain 128 bytes ([a-z], [A-Z], [0-9], [-_]). It must begin with a letter or digit. Note that it cannot be modified once created. 
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Secret version. It can contain up to 64 bytes ([a-z], [A-Z], [0-9], [-_.]). It must begin with a letter or digit. `SecretName` and `VersionId` are used to query the Secret information. If it is left empty, the initial Secret version number is used by default. 
     * @return VersionId Secret version. It can contain up to 64 bytes ([a-z], [A-Z], [0-9], [-_.]). It must begin with a letter or digit. `SecretName` and `VersionId` are used to query the Secret information. If it is left empty, the initial Secret version number is used by default.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Secret version. It can contain up to 64 bytes ([a-z], [A-Z], [0-9], [-_.]). It must begin with a letter or digit. `SecretName` and `VersionId` are used to query the Secret information. If it is left empty, the initial Secret version number is used by default.
     * @param VersionId Secret version. It can contain up to 64 bytes ([a-z], [A-Z], [0-9], [-_.]). It must begin with a letter or digit. `SecretName` and `VersionId` are used to query the Secret information. If it is left empty, the initial Secret version number is used by default.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Description information, such as the detailed use cases. It can be up to 2048 bytes. 
     * @return Description Description information, such as the detailed use cases. It can be up to 2048 bytes.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information, such as the detailed use cases. It can be up to 2048 bytes.
     * @param Description Description information, such as the detailed use cases. It can be up to 2048 bytes.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get KMS CMK used for Secret encryption. If this parameter is left empty, SecretsManager will create a CMK by default. You can also specify a KMS CMK that is created in the same region. 
     * @return KmsKeyId KMS CMK used for Secret encryption. If this parameter is left empty, SecretsManager will create a CMK by default. You can also specify a KMS CMK that is created in the same region.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set KMS CMK used for Secret encryption. If this parameter is left empty, SecretsManager will create a CMK by default. You can also specify a KMS CMK that is created in the same region.
     * @param KmsKeyId KMS CMK used for Secret encryption. If this parameter is left empty, SecretsManager will create a CMK by default. You can also specify a KMS CMK that is created in the same region.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Secret type. It defaults to `custom`. 
     * @return SecretType Secret type. It defaults to `custom`.
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set Secret type. It defaults to `custom`.
     * @param SecretType Secret type. It defaults to `custom`.
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get Base64-encoded plaintext of a binary Secret. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported. 
     * @return SecretBinary Base64-encoded plaintext of a binary Secret. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set Base64-encoded plaintext of a binary Secret. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
     * @param SecretBinary Base64-encoded plaintext of a binary Secret. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get Plaintext of a Secret, in text format. Base64 encoding is not required. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported. 
     * @return SecretString Plaintext of a Secret, in text format. Base64 encoding is not required. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set Plaintext of a Secret, in text format. Base64 encoding is not required. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
     * @param SecretString Plaintext of a Secret, in text format. Base64 encoding is not required. Either `SecretBinary` or `SecretString` must be set. A maximum of 4096 bytes is supported.
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Get Additional configuration of the Secret in JSON format 
     * @return AdditionalConfig Additional configuration of the Secret in JSON format
     */
    public String getAdditionalConfig() {
        return this.AdditionalConfig;
    }

    /**
     * Set Additional configuration of the Secret in JSON format
     * @param AdditionalConfig Additional configuration of the Secret in JSON format
     */
    public void setAdditionalConfig(String AdditionalConfig) {
        this.AdditionalConfig = AdditionalConfig;
    }

    /**
     * Get List of tags. 
     * @return Tags List of tags.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags.
     * @param Tags List of tags.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecretRequest(CreateSecretRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.SecretBinary != null) {
            this.SecretBinary = new String(source.SecretBinary);
        }
        if (source.SecretString != null) {
            this.SecretString = new String(source.SecretString);
        }
        if (source.AdditionalConfig != null) {
            this.AdditionalConfig = new String(source.AdditionalConfig);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);
        this.setParamSimple(map, prefix + "AdditionalConfig", this.AdditionalConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

