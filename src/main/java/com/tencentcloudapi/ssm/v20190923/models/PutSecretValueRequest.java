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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutSecretValueRequest extends AbstractModel{

    /**
    * Name of a Secret where the version is added to.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ID of the new Secret version. It can be up to 64 bytes, contain letters, digits, hyphens (-), and underscores (_), and must begin with a letter or digit.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Binary Secret information that is base64-encoded. Either `SecretBinary` or `SecretString` must be set.
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * Secret information plaintext in text format, base64 encoding is not needed. Either `SecretBinary` or `SecretString` must be set.
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
     * Get Name of a Secret where the version is added to. 
     * @return SecretName Name of a Secret where the version is added to.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of a Secret where the version is added to.
     * @param SecretName Name of a Secret where the version is added to.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ID of the new Secret version. It can be up to 64 bytes, contain letters, digits, hyphens (-), and underscores (_), and must begin with a letter or digit. 
     * @return VersionId ID of the new Secret version. It can be up to 64 bytes, contain letters, digits, hyphens (-), and underscores (_), and must begin with a letter or digit.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set ID of the new Secret version. It can be up to 64 bytes, contain letters, digits, hyphens (-), and underscores (_), and must begin with a letter or digit.
     * @param VersionId ID of the new Secret version. It can be up to 64 bytes, contain letters, digits, hyphens (-), and underscores (_), and must begin with a letter or digit.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Binary Secret information that is base64-encoded. Either `SecretBinary` or `SecretString` must be set. 
     * @return SecretBinary Binary Secret information that is base64-encoded. Either `SecretBinary` or `SecretString` must be set.
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set Binary Secret information that is base64-encoded. Either `SecretBinary` or `SecretString` must be set.
     * @param SecretBinary Binary Secret information that is base64-encoded. Either `SecretBinary` or `SecretString` must be set.
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get Secret information plaintext in text format, base64 encoding is not needed. Either `SecretBinary` or `SecretString` must be set. 
     * @return SecretString Secret information plaintext in text format, base64 encoding is not needed. Either `SecretBinary` or `SecretString` must be set.
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set Secret information plaintext in text format, base64 encoding is not needed. Either `SecretBinary` or `SecretString` must be set.
     * @param SecretString Secret information plaintext in text format, base64 encoding is not needed. Either `SecretBinary` or `SecretString` must be set.
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);

    }
}

