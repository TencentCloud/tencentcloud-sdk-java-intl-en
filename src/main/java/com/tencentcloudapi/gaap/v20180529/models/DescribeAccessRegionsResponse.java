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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessRegionsResponse extends AbstractModel {

    /**
    * Total quantity of acceleration regions
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Acceleration region details list
    */
    @SerializedName("AccessRegionSet")
    @Expose
    private RegionDetail [] AccessRegionSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total quantity of acceleration regions 
     * @return TotalCount Total quantity of acceleration regions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total quantity of acceleration regions
     * @param TotalCount Total quantity of acceleration regions
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Acceleration region details list 
     * @return AccessRegionSet Acceleration region details list
     */
    public RegionDetail [] getAccessRegionSet() {
        return this.AccessRegionSet;
    }

    /**
     * Set Acceleration region details list
     * @param AccessRegionSet Acceleration region details list
     */
    public void setAccessRegionSet(RegionDetail [] AccessRegionSet) {
        this.AccessRegionSet = AccessRegionSet;
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

    public DescribeAccessRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessRegionsResponse(DescribeAccessRegionsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccessRegionSet != null) {
            this.AccessRegionSet = new RegionDetail[source.AccessRegionSet.length];
            for (int i = 0; i < source.AccessRegionSet.length; i++) {
                this.AccessRegionSet[i] = new RegionDetail(source.AccessRegionSet[i]);
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
        this.setParamArrayObj(map, prefix + "AccessRegionSet.", this.AccessRegionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

