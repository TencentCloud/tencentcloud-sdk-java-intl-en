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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSecurityLastUsedResponse extends AbstractModel{

    /**
    * List of key ID’s recent usage records.
    */
    @SerializedName("SecretIdLastUsedRows")
    @Expose
    private SecretIdLastUsed [] SecretIdLastUsedRows;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of key ID’s recent usage records. 
     * @return SecretIdLastUsedRows List of key ID’s recent usage records.
     */
    public SecretIdLastUsed [] getSecretIdLastUsedRows() {
        return this.SecretIdLastUsedRows;
    }

    /**
     * Set List of key ID’s recent usage records.
     * @param SecretIdLastUsedRows List of key ID’s recent usage records.
     */
    public void setSecretIdLastUsedRows(SecretIdLastUsed [] SecretIdLastUsedRows) {
        this.SecretIdLastUsedRows = SecretIdLastUsedRows;
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

    public GetSecurityLastUsedResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSecurityLastUsedResponse(GetSecurityLastUsedResponse source) {
        if (source.SecretIdLastUsedRows != null) {
            this.SecretIdLastUsedRows = new SecretIdLastUsed[source.SecretIdLastUsedRows.length];
            for (int i = 0; i < source.SecretIdLastUsedRows.length; i++) {
                this.SecretIdLastUsedRows[i] = new SecretIdLastUsed(source.SecretIdLastUsedRows[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SecretIdLastUsedRows.", this.SecretIdLastUsedRows);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

