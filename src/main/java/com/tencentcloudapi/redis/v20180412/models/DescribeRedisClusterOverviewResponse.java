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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisClusterOverviewResponse extends AbstractModel {

    /**
    * Total number of resource packages.
    */
    @SerializedName("TotalBundle")
    @Expose
    private Long TotalBundle;

    /**
    * Total memory size occupied by resource packages. Unit: GB.
    */
    @SerializedName("TotalMemory")
    @Expose
    private Long TotalMemory;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of resource packages. 
     * @return TotalBundle Total number of resource packages.
     */
    public Long getTotalBundle() {
        return this.TotalBundle;
    }

    /**
     * Set Total number of resource packages.
     * @param TotalBundle Total number of resource packages.
     */
    public void setTotalBundle(Long TotalBundle) {
        this.TotalBundle = TotalBundle;
    }

    /**
     * Get Total memory size occupied by resource packages. Unit: GB. 
     * @return TotalMemory Total memory size occupied by resource packages. Unit: GB.
     */
    public Long getTotalMemory() {
        return this.TotalMemory;
    }

    /**
     * Set Total memory size occupied by resource packages. Unit: GB.
     * @param TotalMemory Total memory size occupied by resource packages. Unit: GB.
     */
    public void setTotalMemory(Long TotalMemory) {
        this.TotalMemory = TotalMemory;
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

    public DescribeRedisClusterOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisClusterOverviewResponse(DescribeRedisClusterOverviewResponse source) {
        if (source.TotalBundle != null) {
            this.TotalBundle = new Long(source.TotalBundle);
        }
        if (source.TotalMemory != null) {
            this.TotalMemory = new Long(source.TotalMemory);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalBundle", this.TotalBundle);
        this.setParamSimple(map, prefix + "TotalMemory", this.TotalMemory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

