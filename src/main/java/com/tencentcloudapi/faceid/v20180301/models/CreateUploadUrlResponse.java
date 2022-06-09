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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUploadUrlResponse extends AbstractModel{

    /**
    * The URL for uploading contents with the `HTTP PUT` method.
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * The resource URL obtained after this upload is completed and to be passed in where it is required later.
    */
    @SerializedName("ResourceUrl")
    @Expose
    private String ResourceUrl;

    /**
    * The point in time when the upload/download link expires, which is a 10-bit Unix timestamp.
    */
    @SerializedName("ExpiredTimestamp")
    @Expose
    private Long ExpiredTimestamp;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The URL for uploading contents with the `HTTP PUT` method. 
     * @return UploadUrl The URL for uploading contents with the `HTTP PUT` method.
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set The URL for uploading contents with the `HTTP PUT` method.
     * @param UploadUrl The URL for uploading contents with the `HTTP PUT` method.
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get The resource URL obtained after this upload is completed and to be passed in where it is required later. 
     * @return ResourceUrl The resource URL obtained after this upload is completed and to be passed in where it is required later.
     */
    public String getResourceUrl() {
        return this.ResourceUrl;
    }

    /**
     * Set The resource URL obtained after this upload is completed and to be passed in where it is required later.
     * @param ResourceUrl The resource URL obtained after this upload is completed and to be passed in where it is required later.
     */
    public void setResourceUrl(String ResourceUrl) {
        this.ResourceUrl = ResourceUrl;
    }

    /**
     * Get The point in time when the upload/download link expires, which is a 10-bit Unix timestamp. 
     * @return ExpiredTimestamp The point in time when the upload/download link expires, which is a 10-bit Unix timestamp.
     */
    public Long getExpiredTimestamp() {
        return this.ExpiredTimestamp;
    }

    /**
     * Set The point in time when the upload/download link expires, which is a 10-bit Unix timestamp.
     * @param ExpiredTimestamp The point in time when the upload/download link expires, which is a 10-bit Unix timestamp.
     */
    public void setExpiredTimestamp(Long ExpiredTimestamp) {
        this.ExpiredTimestamp = ExpiredTimestamp;
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

    public CreateUploadUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUploadUrlResponse(CreateUploadUrlResponse source) {
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.ResourceUrl != null) {
            this.ResourceUrl = new String(source.ResourceUrl);
        }
        if (source.ExpiredTimestamp != null) {
            this.ExpiredTimestamp = new Long(source.ExpiredTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "ResourceUrl", this.ResourceUrl);
        this.setParamSimple(map, prefix + "ExpiredTimestamp", this.ExpiredTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

