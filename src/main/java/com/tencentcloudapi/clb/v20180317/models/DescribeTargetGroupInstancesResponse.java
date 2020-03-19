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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupInstancesResponse extends AbstractModel{

    /**
    * Number of results in current query
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of the bound server
    */
    @SerializedName("TargetGroupInstanceSet")
    @Expose
    private TargetGroupBackend [] TargetGroupInstanceSet;

    /**
    * Actual statistics, which are not affected by `Limit`, `Offset`, and `CAM`.
    */
    @SerializedName("RealCount")
    @Expose
    private Long RealCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of results in current query 
     * @return TotalCount Number of results in current query
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of results in current query
     * @param TotalCount Number of results in current query
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of the bound server 
     * @return TargetGroupInstanceSet Information of the bound server
     */
    public TargetGroupBackend [] getTargetGroupInstanceSet() {
        return this.TargetGroupInstanceSet;
    }

    /**
     * Set Information of the bound server
     * @param TargetGroupInstanceSet Information of the bound server
     */
    public void setTargetGroupInstanceSet(TargetGroupBackend [] TargetGroupInstanceSet) {
        this.TargetGroupInstanceSet = TargetGroupInstanceSet;
    }

    /**
     * Get Actual statistics, which are not affected by `Limit`, `Offset`, and `CAM`. 
     * @return RealCount Actual statistics, which are not affected by `Limit`, `Offset`, and `CAM`.
     */
    public Long getRealCount() {
        return this.RealCount;
    }

    /**
     * Set Actual statistics, which are not affected by `Limit`, `Offset`, and `CAM`.
     * @param RealCount Actual statistics, which are not affected by `Limit`, `Offset`, and `CAM`.
     */
    public void setRealCount(Long RealCount) {
        this.RealCount = RealCount;
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
        this.setParamArrayObj(map, prefix + "TargetGroupInstanceSet.", this.TargetGroupInstanceSet);
        this.setParamSimple(map, prefix + "RealCount", this.RealCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

