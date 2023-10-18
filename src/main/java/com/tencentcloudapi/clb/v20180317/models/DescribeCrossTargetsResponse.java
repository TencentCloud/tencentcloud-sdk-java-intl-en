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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrossTargetsResponse extends AbstractModel {

    /**
    * Total number of real server lists
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Real server list
    */
    @SerializedName("CrossTargetSet")
    @Expose
    private CrossTargets [] CrossTargetSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of real server lists 
     * @return TotalCount Total number of real server lists
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of real server lists
     * @param TotalCount Total number of real server lists
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Real server list 
     * @return CrossTargetSet Real server list
     */
    public CrossTargets [] getCrossTargetSet() {
        return this.CrossTargetSet;
    }

    /**
     * Set Real server list
     * @param CrossTargetSet Real server list
     */
    public void setCrossTargetSet(CrossTargets [] CrossTargetSet) {
        this.CrossTargetSet = CrossTargetSet;
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

    public DescribeCrossTargetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossTargetsResponse(DescribeCrossTargetsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.CrossTargetSet != null) {
            this.CrossTargetSet = new CrossTargets[source.CrossTargetSet.length];
            for (int i = 0; i < source.CrossTargetSet.length; i++) {
                this.CrossTargetSet[i] = new CrossTargets(source.CrossTargetSet[i]);
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
        this.setParamArrayObj(map, prefix + "CrossTargetSet.", this.CrossTargetSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

