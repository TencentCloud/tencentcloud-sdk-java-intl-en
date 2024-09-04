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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostLoginListResponse extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Log-in an audit list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostLoginList")
    @Expose
    private HostLoginList [] HostLoginList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Log-in an audit list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostLoginList Log-in an audit list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HostLoginList [] getHostLoginList() {
        return this.HostLoginList;
    }

    /**
     * Set Log-in an audit list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostLoginList Log-in an audit list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostLoginList(HostLoginList [] HostLoginList) {
        this.HostLoginList = HostLoginList;
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

    public DescribeHostLoginListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostLoginListResponse(DescribeHostLoginListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HostLoginList != null) {
            this.HostLoginList = new HostLoginList[source.HostLoginList.length];
            for (int i = 0; i < source.HostLoginList.length; i++) {
                this.HostLoginList[i] = new HostLoginList(source.HostLoginList[i]);
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
        this.setParamArrayObj(map, prefix + "HostLoginList.", this.HostLoginList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
