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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDestRegionsResponse extends AbstractModel{

    /**
    * Total number of origin server regions
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of origin server region details
    */
    @SerializedName("DestRegionSet")
    @Expose
    private RegionDetail [] DestRegionSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of origin server regions 
     * @return TotalCount Total number of origin server regions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of origin server regions
     * @param TotalCount Total number of origin server regions
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of origin server region details 
     * @return DestRegionSet List of origin server region details
     */
    public RegionDetail [] getDestRegionSet() {
        return this.DestRegionSet;
    }

    /**
     * Set List of origin server region details
     * @param DestRegionSet List of origin server region details
     */
    public void setDestRegionSet(RegionDetail [] DestRegionSet) {
        this.DestRegionSet = DestRegionSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DestRegionSet.", this.DestRegionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

