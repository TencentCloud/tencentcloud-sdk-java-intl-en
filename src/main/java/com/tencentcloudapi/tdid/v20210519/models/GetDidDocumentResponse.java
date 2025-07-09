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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDidDocumentResponse extends AbstractModel {

    /**
    * The name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The DID document.
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The name. 
     * @return Name The name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name.
     * @param Name The name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The DID document. 
     * @return Document The DID document.
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set The DID document.
     * @param Document The DID document.
     */
    public void setDocument(String Document) {
        this.Document = Document;
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

    public GetDidDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidDocumentResponse(GetDidDocumentResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Document", this.Document);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

