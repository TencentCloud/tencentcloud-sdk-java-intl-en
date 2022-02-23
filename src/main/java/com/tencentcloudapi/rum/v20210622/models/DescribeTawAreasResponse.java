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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawAreasResponse extends AbstractModel{

    /**
    * Total number of regions
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Region list
    */
    @SerializedName("AreaSet")
    @Expose
    private RumAreaInfo [] AreaSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of regions 
     * @return TotalCount Total number of regions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of regions
     * @param TotalCount Total number of regions
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Region list 
     * @return AreaSet Region list
     */
    public RumAreaInfo [] getAreaSet() {
        return this.AreaSet;
    }

    /**
     * Set Region list
     * @param AreaSet Region list
     */
    public void setAreaSet(RumAreaInfo [] AreaSet) {
        this.AreaSet = AreaSet;
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

    public DescribeTawAreasResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTawAreasResponse(DescribeTawAreasResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AreaSet != null) {
            this.AreaSet = new RumAreaInfo[source.AreaSet.length];
            for (int i = 0; i < source.AreaSet.length; i++) {
                this.AreaSet[i] = new RumAreaInfo(source.AreaSet[i]);
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
        this.setParamArrayObj(map, prefix + "AreaSet.", this.AreaSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

