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

public class UpdateSecretRequest extends AbstractModel{

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
    * Use this field if the new Secret content is in binary format, and base64-encoded. Either `SecretBinary` or `SecretString` is set.
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * Use this field if the new Secret content is in text format, and base64-encoding is not required. Either `SecretBinary` or `SecretString` is set.
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
     * Get Use this field if the new Secret content is in binary format, and base64-encoded. Either `SecretBinary` or `SecretString` is set. 
     * @return SecretBinary Use this field if the new Secret content is in binary format, and base64-encoded. Either `SecretBinary` or `SecretString` is set.
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set Use this field if the new Secret content is in binary format, and base64-encoded. Either `SecretBinary` or `SecretString` is set.
     * @param SecretBinary Use this field if the new Secret content is in binary format, and base64-encoded. Either `SecretBinary` or `SecretString` is set.
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get Use this field if the new Secret content is in text format, and base64-encoding is not required. Either `SecretBinary` or `SecretString` is set. 
     * @return SecretString Use this field if the new Secret content is in text format, and base64-encoding is not required. Either `SecretBinary` or `SecretString` is set.
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set Use this field if the new Secret content is in text format, and base64-encoding is not required. Either `SecretBinary` or `SecretString` is set.
     * @param SecretString Use this field if the new Secret content is in text format, and base64-encoding is not required. Either `SecretBinary` or `SecretString` is set.
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

