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

public class GetSecretValueResponse extends AbstractModel{

    /**
    * Name of the Secret.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ID of the Secret version.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * If the `SecretBinary` field in the request body is specified in the `CreateSecret` call, this field is returned and base64-encoded. The caller needs to perform base64 decoding to obtain the original data. Either `SecretBinary` or `SecretString` will be returned.
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * If the `SecretString` field in the request body is specified in the `CreateSecret` call, this field is returned. Either `SecretBinary` or `SecretString` will be returned.
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name of the Secret. 
     * @return SecretName Name of the Secret.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of the Secret.
     * @param SecretName Name of the Secret.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ID of the Secret version. 
     * @return VersionId ID of the Secret version.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set ID of the Secret version.
     * @param VersionId ID of the Secret version.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get If the `SecretBinary` field in the request body is specified in the `CreateSecret` call, this field is returned and base64-encoded. The caller needs to perform base64 decoding to obtain the original data. Either `SecretBinary` or `SecretString` will be returned. 
     * @return SecretBinary If the `SecretBinary` field in the request body is specified in the `CreateSecret` call, this field is returned and base64-encoded. The caller needs to perform base64 decoding to obtain the original data. Either `SecretBinary` or `SecretString` will be returned.
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set If the `SecretBinary` field in the request body is specified in the `CreateSecret` call, this field is returned and base64-encoded. The caller needs to perform base64 decoding to obtain the original data. Either `SecretBinary` or `SecretString` will be returned.
     * @param SecretBinary If the `SecretBinary` field in the request body is specified in the `CreateSecret` call, this field is returned and base64-encoded. The caller needs to perform base64 decoding to obtain the original data. Either `SecretBinary` or `SecretString` will be returned.
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get If the `SecretString` field in the request body is specified in the `CreateSecret` call, this field is returned. Either `SecretBinary` or `SecretString` will be returned. 
     * @return SecretString If the `SecretString` field in the request body is specified in the `CreateSecret` call, this field is returned. Either `SecretBinary` or `SecretString` will be returned.
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set If the `SecretString` field in the request body is specified in the `CreateSecret` call, this field is returned. Either `SecretBinary` or `SecretString` will be returned.
     * @param SecretString If the `SecretString` field in the request body is specified in the `CreateSecret` call, this field is returned. Either `SecretBinary` or `SecretString` will be returned.
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

