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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListApplicationAuthorizationsResponse extends AbstractModel {

    /**
    * Returned list of application authorization information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizationInfoList")
    @Expose
    private AuthorizationInfo [] AuthorizationInfoList;

    /**
    * Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returned list of application authorization information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizationInfoList Returned list of application authorization information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AuthorizationInfo [] getAuthorizationInfoList() {
        return this.AuthorizationInfoList;
    }

    /**
     * Set Returned list of application authorization information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthorizationInfoList Returned list of application authorization information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizationInfoList(AuthorizationInfo [] AuthorizationInfoList) {
        this.AuthorizationInfoList = AuthorizationInfoList;
    }

    /**
     * Get Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public ListApplicationAuthorizationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListApplicationAuthorizationsResponse(ListApplicationAuthorizationsResponse source) {
        if (source.AuthorizationInfoList != null) {
            this.AuthorizationInfoList = new AuthorizationInfo[source.AuthorizationInfoList.length];
            for (int i = 0; i < source.AuthorizationInfoList.length; i++) {
                this.AuthorizationInfoList[i] = new AuthorizationInfo(source.AuthorizationInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AuthorizationInfoList.", this.AuthorizationInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

