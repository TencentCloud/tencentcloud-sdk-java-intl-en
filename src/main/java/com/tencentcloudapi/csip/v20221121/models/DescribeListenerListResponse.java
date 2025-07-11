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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerListResponse extends AbstractModel {

    /**
    * Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List of listeners
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private ClbListenerListInfo [] Data;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of results
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Total Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Total Total number of results
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get List of listeners
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Data List of listeners
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public ClbListenerListInfo [] getData() {
        return this.Data;
    }

    /**
     * Set List of listeners
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Data List of listeners
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setData(ClbListenerListInfo [] Data) {
        this.Data = Data;
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

    public DescribeListenerListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerListResponse(DescribeListenerListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new ClbListenerListInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ClbListenerListInfo(source.Data[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

