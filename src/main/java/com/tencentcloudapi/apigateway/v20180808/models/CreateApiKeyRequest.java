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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiKeyRequest extends AbstractModel{

    /**
    * Custom key name.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Key type. Valid values: auto, manual (custom key). Default value: auto.
    */
    @SerializedName("AccessKeyType")
    @Expose
    private String AccessKeyType;

    /**
    * Custom key ID, which is required when `AccessKeyType` is `manual`. It can contain 5 to 50 letters, digits, and underscores.
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Custom key, which is required when `AccessKeyType` is `manual`. It can contain 10 to 50 letters, digits, and underscores.
    */
    @SerializedName("AccessKeySecret")
    @Expose
    private String AccessKeySecret;

    /**
     * Get Custom key name. 
     * @return SecretName Custom key name.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Custom key name.
     * @param SecretName Custom key name.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Key type. Valid values: auto, manual (custom key). Default value: auto. 
     * @return AccessKeyType Key type. Valid values: auto, manual (custom key). Default value: auto.
     */
    public String getAccessKeyType() {
        return this.AccessKeyType;
    }

    /**
     * Set Key type. Valid values: auto, manual (custom key). Default value: auto.
     * @param AccessKeyType Key type. Valid values: auto, manual (custom key). Default value: auto.
     */
    public void setAccessKeyType(String AccessKeyType) {
        this.AccessKeyType = AccessKeyType;
    }

    /**
     * Get Custom key ID, which is required when `AccessKeyType` is `manual`. It can contain 5 to 50 letters, digits, and underscores. 
     * @return AccessKeyId Custom key ID, which is required when `AccessKeyType` is `manual`. It can contain 5 to 50 letters, digits, and underscores.
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set Custom key ID, which is required when `AccessKeyType` is `manual`. It can contain 5 to 50 letters, digits, and underscores.
     * @param AccessKeyId Custom key ID, which is required when `AccessKeyType` is `manual`. It can contain 5 to 50 letters, digits, and underscores.
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Custom key, which is required when `AccessKeyType` is `manual`. It can contain 10 to 50 letters, digits, and underscores. 
     * @return AccessKeySecret Custom key, which is required when `AccessKeyType` is `manual`. It can contain 10 to 50 letters, digits, and underscores.
     */
    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    /**
     * Set Custom key, which is required when `AccessKeyType` is `manual`. It can contain 10 to 50 letters, digits, and underscores.
     * @param AccessKeySecret Custom key, which is required when `AccessKeyType` is `manual`. It can contain 10 to 50 letters, digits, and underscores.
     */
    public void setAccessKeySecret(String AccessKeySecret) {
        this.AccessKeySecret = AccessKeySecret;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "AccessKeyType", this.AccessKeyType);
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "AccessKeySecret", this.AccessKeySecret);

    }
}

