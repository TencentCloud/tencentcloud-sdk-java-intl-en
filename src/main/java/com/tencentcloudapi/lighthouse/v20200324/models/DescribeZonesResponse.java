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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesResponse extends AbstractModel{

    /**
    * Number of AZs
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of AZ details
    */
    @SerializedName("ZoneInfoSet")
    @Expose
    private ZoneInfo [] ZoneInfoSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of AZs 
     * @return TotalCount Number of AZs
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of AZs
     * @param TotalCount Number of AZs
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of AZ details 
     * @return ZoneInfoSet List of AZ details
     */
    public ZoneInfo [] getZoneInfoSet() {
        return this.ZoneInfoSet;
    }

    /**
     * Set List of AZ details
     * @param ZoneInfoSet List of AZ details
     */
    public void setZoneInfoSet(ZoneInfo [] ZoneInfoSet) {
        this.ZoneInfoSet = ZoneInfoSet;
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

    public DescribeZonesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesResponse(DescribeZonesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ZoneInfoSet != null) {
            this.ZoneInfoSet = new ZoneInfo[source.ZoneInfoSet.length];
            for (int i = 0; i < source.ZoneInfoSet.length; i++) {
                this.ZoneInfoSet[i] = new ZoneInfo(source.ZoneInfoSet[i]);
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
        this.setParamArrayObj(map, prefix + "ZoneInfoSet.", this.ZoneInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

