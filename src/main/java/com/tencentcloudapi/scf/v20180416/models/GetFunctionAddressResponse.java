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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionAddressResponse extends AbstractModel {

    /**
    * Cos address of the function
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * SHA256 code of the function
    */
    @SerializedName("CodeSha256")
    @Expose
    private String CodeSha256;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cos address of the function 
     * @return Url Cos address of the function
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Cos address of the function
     * @param Url Cos address of the function
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get SHA256 code of the function 
     * @return CodeSha256 SHA256 code of the function
     */
    public String getCodeSha256() {
        return this.CodeSha256;
    }

    /**
     * Set SHA256 code of the function
     * @param CodeSha256 SHA256 code of the function
     */
    public void setCodeSha256(String CodeSha256) {
        this.CodeSha256 = CodeSha256;
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

    public GetFunctionAddressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionAddressResponse(GetFunctionAddressResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CodeSha256 != null) {
            this.CodeSha256 = new String(source.CodeSha256);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CodeSha256", this.CodeSha256);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

