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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionsResponse extends AbstractModel{

    /**
    * Number of queried AZs
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of AZ query results
    */
    @SerializedName("RegionInfos")
    @Expose
    private RegionInfo [] RegionInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of queried AZs 
     * @return TotalCount Number of queried AZs
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of queried AZs
     * @param TotalCount Number of queried AZs
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of AZ query results 
     * @return RegionInfos List of AZ query results
     */
    public RegionInfo [] getRegionInfos() {
        return this.RegionInfos;
    }

    /**
     * Set List of AZ query results
     * @param RegionInfos List of AZ query results
     */
    public void setRegionInfos(RegionInfo [] RegionInfos) {
        this.RegionInfos = RegionInfos;
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
        this.setParamArrayObj(map, prefix + "RegionInfos.", this.RegionInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

