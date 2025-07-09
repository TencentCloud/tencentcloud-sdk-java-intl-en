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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportOpenApiRequest extends AbstractModel {

    /**
    * The unique ID of the service associated with the API
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Content of the openAPI
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Format of the content. Values: `YAML` (default), `JSON`
    */
    @SerializedName("EncodeType")
    @Expose
    private String EncodeType;

    /**
    * Version of the content. It can only be `openAPI` for now.
    */
    @SerializedName("ContentVersion")
    @Expose
    private String ContentVersion;

    /**
     * Get The unique ID of the service associated with the API 
     * @return ServiceId The unique ID of the service associated with the API
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set The unique ID of the service associated with the API
     * @param ServiceId The unique ID of the service associated with the API
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Content of the openAPI 
     * @return Content Content of the openAPI
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content of the openAPI
     * @param Content Content of the openAPI
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Format of the content. Values: `YAML` (default), `JSON` 
     * @return EncodeType Format of the content. Values: `YAML` (default), `JSON`
     */
    public String getEncodeType() {
        return this.EncodeType;
    }

    /**
     * Set Format of the content. Values: `YAML` (default), `JSON`
     * @param EncodeType Format of the content. Values: `YAML` (default), `JSON`
     */
    public void setEncodeType(String EncodeType) {
        this.EncodeType = EncodeType;
    }

    /**
     * Get Version of the content. It can only be `openAPI` for now. 
     * @return ContentVersion Version of the content. It can only be `openAPI` for now.
     */
    public String getContentVersion() {
        return this.ContentVersion;
    }

    /**
     * Set Version of the content. It can only be `openAPI` for now.
     * @param ContentVersion Version of the content. It can only be `openAPI` for now.
     */
    public void setContentVersion(String ContentVersion) {
        this.ContentVersion = ContentVersion;
    }

    public ImportOpenApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportOpenApiRequest(ImportOpenApiRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.EncodeType != null) {
            this.EncodeType = new String(source.EncodeType);
        }
        if (source.ContentVersion != null) {
            this.ContentVersion = new String(source.ContentVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "EncodeType", this.EncodeType);
        this.setParamSimple(map, prefix + "ContentVersion", this.ContentVersion);

    }
}

