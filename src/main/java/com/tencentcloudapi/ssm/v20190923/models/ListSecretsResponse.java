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

public class ListSecretsResponse extends AbstractModel{

    /**
    * Number of filtered Secrets according to `State` and `SearchSecretName`.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of Secret information.
    */
    @SerializedName("SecretMetadatas")
    @Expose
    private SecretMetadata [] SecretMetadatas;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of filtered Secrets according to `State` and `SearchSecretName`. 
     * @return TotalCount Number of filtered Secrets according to `State` and `SearchSecretName`.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of filtered Secrets according to `State` and `SearchSecretName`.
     * @param TotalCount Number of filtered Secrets according to `State` and `SearchSecretName`.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of Secret information. 
     * @return SecretMetadatas List of Secret information.
     */
    public SecretMetadata [] getSecretMetadatas() {
        return this.SecretMetadatas;
    }

    /**
     * Set List of Secret information.
     * @param SecretMetadatas List of Secret information.
     */
    public void setSecretMetadatas(SecretMetadata [] SecretMetadatas) {
        this.SecretMetadatas = SecretMetadatas;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SecretMetadatas.", this.SecretMetadatas);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

