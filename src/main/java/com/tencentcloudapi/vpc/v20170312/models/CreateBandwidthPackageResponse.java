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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBandwidthPackageResponse extends AbstractModel{

    /**
    * The ID of the bandwidth package
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * The IDs of the bandwidth package (valid when the applied number is greater than 1)
    */
    @SerializedName("BandwidthPackageIds")
    @Expose
    private String [] BandwidthPackageIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The ID of the bandwidth package 
     * @return BandwidthPackageId The ID of the bandwidth package
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The ID of the bandwidth package
     * @param BandwidthPackageId The ID of the bandwidth package
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get The IDs of the bandwidth package (valid when the applied number is greater than 1) 
     * @return BandwidthPackageIds The IDs of the bandwidth package (valid when the applied number is greater than 1)
     */
    public String [] getBandwidthPackageIds() {
        return this.BandwidthPackageIds;
    }

    /**
     * Set The IDs of the bandwidth package (valid when the applied number is greater than 1)
     * @param BandwidthPackageIds The IDs of the bandwidth package (valid when the applied number is greater than 1)
     */
    public void setBandwidthPackageIds(String [] BandwidthPackageIds) {
        this.BandwidthPackageIds = BandwidthPackageIds;
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
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamArraySimple(map, prefix + "BandwidthPackageIds.", this.BandwidthPackageIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

