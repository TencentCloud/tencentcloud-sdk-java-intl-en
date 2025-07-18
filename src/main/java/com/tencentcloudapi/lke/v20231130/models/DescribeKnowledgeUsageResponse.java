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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKnowledgeUsageResponse extends AbstractModel {

    /**
    * The upper limit of available characters.
    */
    @SerializedName("AvailableCharSize")
    @Expose
    private String AvailableCharSize;

    /**
    * Number of characters exceeding the capacity limit of available characters.
    */
    @SerializedName("ExceedCharSize")
    @Expose
    private String ExceedCharSize;

    /**
    * Total number of characters used in the knowledge library.
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The upper limit of available characters. 
     * @return AvailableCharSize The upper limit of available characters.
     */
    public String getAvailableCharSize() {
        return this.AvailableCharSize;
    }

    /**
     * Set The upper limit of available characters.
     * @param AvailableCharSize The upper limit of available characters.
     */
    public void setAvailableCharSize(String AvailableCharSize) {
        this.AvailableCharSize = AvailableCharSize;
    }

    /**
     * Get Number of characters exceeding the capacity limit of available characters. 
     * @return ExceedCharSize Number of characters exceeding the capacity limit of available characters.
     */
    public String getExceedCharSize() {
        return this.ExceedCharSize;
    }

    /**
     * Set Number of characters exceeding the capacity limit of available characters.
     * @param ExceedCharSize Number of characters exceeding the capacity limit of available characters.
     */
    public void setExceedCharSize(String ExceedCharSize) {
        this.ExceedCharSize = ExceedCharSize;
    }

    /**
     * Get Total number of characters used in the knowledge library. 
     * @return UsedCharSize Total number of characters used in the knowledge library.
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set Total number of characters used in the knowledge library.
     * @param UsedCharSize Total number of characters used in the knowledge library.
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKnowledgeUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeUsageResponse(DescribeKnowledgeUsageResponse source) {
        if (source.AvailableCharSize != null) {
            this.AvailableCharSize = new String(source.AvailableCharSize);
        }
        if (source.ExceedCharSize != null) {
            this.ExceedCharSize = new String(source.ExceedCharSize);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvailableCharSize", this.AvailableCharSize);
        this.setParamSimple(map, prefix + "ExceedCharSize", this.ExceedCharSize);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

