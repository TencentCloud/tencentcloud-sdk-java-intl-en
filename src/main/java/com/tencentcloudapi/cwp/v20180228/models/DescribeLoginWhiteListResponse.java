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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginWhiteListResponse extends AbstractModel {

    /**
    * Total number of records
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Cross-region log-in allowlist array
    */
    @SerializedName("LoginWhiteLists")
    @Expose
    private LoginWhiteLists [] LoginWhiteLists;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records 
     * @return TotalCount Total number of records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records
     * @param TotalCount Total number of records
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Cross-region log-in allowlist array 
     * @return LoginWhiteLists Cross-region log-in allowlist array
     */
    public LoginWhiteLists [] getLoginWhiteLists() {
        return this.LoginWhiteLists;
    }

    /**
     * Set Cross-region log-in allowlist array
     * @param LoginWhiteLists Cross-region log-in allowlist array
     */
    public void setLoginWhiteLists(LoginWhiteLists [] LoginWhiteLists) {
        this.LoginWhiteLists = LoginWhiteLists;
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

    public DescribeLoginWhiteListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginWhiteListResponse(DescribeLoginWhiteListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LoginWhiteLists != null) {
            this.LoginWhiteLists = new LoginWhiteLists[source.LoginWhiteLists.length];
            for (int i = 0; i < source.LoginWhiteLists.length; i++) {
                this.LoginWhiteLists[i] = new LoginWhiteLists(source.LoginWhiteLists[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "LoginWhiteLists.", this.LoginWhiteLists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

