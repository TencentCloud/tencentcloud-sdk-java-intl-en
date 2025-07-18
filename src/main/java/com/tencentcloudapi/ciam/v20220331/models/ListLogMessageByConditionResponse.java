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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLogMessageByConditionResponse extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Pagination object
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * List of logs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private LogMessage [] Content;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number 
     * @return Total Total number
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number
     * @param Total Total number
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Pagination object 
     * @return Pageable Pagination object
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set Pagination object
     * @param Pageable Pagination object
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get List of logs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content List of logs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LogMessage [] getContent() {
        return this.Content;
    }

    /**
     * Set List of logs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content List of logs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(LogMessage [] Content) {
        this.Content = Content;
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

    public ListLogMessageByConditionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLogMessageByConditionResponse(ListLogMessageByConditionResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.Content != null) {
            this.Content = new LogMessage[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new LogMessage(source.Content[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

