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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSecretRequest extends AbstractModel {

    /**
    * Name of a Secret whose content is to be updated.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ID of the Secret version whose content is to be updated.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * This field should be used and Base64-encoded if the content of the new credential is binary.
Either `SecretBinary` or `SecretString` cannot be empty.
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * This field should be used without being Base64-encoded if the content of the new credential is text. Either `SecretBinary` or `SecretString` cannot be empty.
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
     * Get Name of a Secret whose content is to be updated. 
     * @return SecretName Name of a Secret whose content is to be updated.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of a Secret whose content is to be updated.
     * @param SecretName Name of a Secret whose content is to be updated.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ID of the Secret version whose content is to be updated. 
     * @return VersionId ID of the Secret version whose content is to be updated.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set ID of the Secret version whose content is to be updated.
     * @param VersionId ID of the Secret version whose content is to be updated.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get This field should be used and Base64-encoded if the content of the new credential is binary.
Either `SecretBinary` or `SecretString` cannot be empty. 
     * @return SecretBinary This field should be used and Base64-encoded if the content of the new credential is binary.
Either `SecretBinary` or `SecretString` cannot be empty.
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set This field should be used and Base64-encoded if the content of the new credential is binary.
Either `SecretBinary` or `SecretString` cannot be empty.
     * @param SecretBinary This field should be used and Base64-encoded if the content of the new credential is binary.
Either `SecretBinary` or `SecretString` cannot be empty.
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get This field should be used without being Base64-encoded if the content of the new credential is text. Either `SecretBinary` or `SecretString` cannot be empty. 
     * @return SecretString This field should be used without being Base64-encoded if the content of the new credential is text. Either `SecretBinary` or `SecretString` cannot be empty.
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set This field should be used without being Base64-encoded if the content of the new credential is text. Either `SecretBinary` or `SecretString` cannot be empty.
     * @param SecretString This field should be used without being Base64-encoded if the content of the new credential is text. Either `SecretBinary` or `SecretString` cannot be empty.
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    public UpdateSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSecretRequest(UpdateSecretRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.SecretBinary != null) {
            this.SecretBinary = new String(source.SecretBinary);
        }
        if (source.SecretString != null) {
            this.SecretString = new String(source.SecretString);
        }
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

