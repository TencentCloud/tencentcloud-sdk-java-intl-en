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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthPackagesResponse extends AbstractModel {

    /**
    * The number of eligible bandwidth packages.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Detail information of the bandwidth package.
    */
    @SerializedName("BandwidthPackageSet")
    @Expose
    private BandwidthPackage [] BandwidthPackageSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of eligible bandwidth packages. 
     * @return TotalCount The number of eligible bandwidth packages.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of eligible bandwidth packages.
     * @param TotalCount The number of eligible bandwidth packages.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Detail information of the bandwidth package. 
     * @return BandwidthPackageSet Detail information of the bandwidth package.
     */
    public BandwidthPackage [] getBandwidthPackageSet() {
        return this.BandwidthPackageSet;
    }

    /**
     * Set Detail information of the bandwidth package.
     * @param BandwidthPackageSet Detail information of the bandwidth package.
     */
    public void setBandwidthPackageSet(BandwidthPackage [] BandwidthPackageSet) {
        this.BandwidthPackageSet = BandwidthPackageSet;
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

    public DescribeBandwidthPackagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBandwidthPackagesResponse(DescribeBandwidthPackagesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BandwidthPackageSet != null) {
            this.BandwidthPackageSet = new BandwidthPackage[source.BandwidthPackageSet.length];
            for (int i = 0; i < source.BandwidthPackageSet.length; i++) {
                this.BandwidthPackageSet[i] = new BandwidthPackage(source.BandwidthPackageSet[i]);
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
        this.setParamArrayObj(map, prefix + "BandwidthPackageSet.", this.BandwidthPackageSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

