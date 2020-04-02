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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSnapOverviewResponse extends AbstractModel{

    /**
    * The total snapshot size of the user
    */
    @SerializedName("TotalSize")
    @Expose
    private Float TotalSize;

    /**
    * The total billed snapshot size of the user
    */
    @SerializedName("RealTradeSize")
    @Expose
    private Float RealTradeSize;

    /**
    * Free tier of snapshot
    */
    @SerializedName("FreeQuota")
    @Expose
    private Float FreeQuota;

    /**
    * Total number of snapshots
    */
    @SerializedName("TotalNums")
    @Expose
    private Long TotalNums;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total snapshot size of the user 
     * @return TotalSize The total snapshot size of the user
     */
    public Float getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set The total snapshot size of the user
     * @param TotalSize The total snapshot size of the user
     */
    public void setTotalSize(Float TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get The total billed snapshot size of the user 
     * @return RealTradeSize The total billed snapshot size of the user
     */
    public Float getRealTradeSize() {
        return this.RealTradeSize;
    }

    /**
     * Set The total billed snapshot size of the user
     * @param RealTradeSize The total billed snapshot size of the user
     */
    public void setRealTradeSize(Float RealTradeSize) {
        this.RealTradeSize = RealTradeSize;
    }

    /**
     * Get Free tier of snapshot 
     * @return FreeQuota Free tier of snapshot
     */
    public Float getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set Free tier of snapshot
     * @param FreeQuota Free tier of snapshot
     */
    public void setFreeQuota(Float FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get Total number of snapshots 
     * @return TotalNums Total number of snapshots
     */
    public Long getTotalNums() {
        return this.TotalNums;
    }

    /**
     * Set Total number of snapshots
     * @param TotalNums Total number of snapshots
     */
    public void setTotalNums(Long TotalNums) {
        this.TotalNums = TotalNums;
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
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "RealTradeSize", this.RealTradeSize);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "TotalNums", this.TotalNums);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

