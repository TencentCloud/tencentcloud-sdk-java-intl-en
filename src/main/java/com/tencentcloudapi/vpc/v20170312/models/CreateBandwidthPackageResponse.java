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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBandwidthPackageResponse extends AbstractModel {

    /**
    * The unique ID of the bandwidth package.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * The unique ID list of the bandwidth package (effective only when you apply for more than 1 bandwidth packages).
    */
    @SerializedName("BandwidthPackageIds")
    @Expose
    private String [] BandwidthPackageIds;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The unique ID of the bandwidth package. 
     * @return BandwidthPackageId The unique ID of the bandwidth package.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of the bandwidth package.
     * @param BandwidthPackageId The unique ID of the bandwidth package.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get The unique ID list of the bandwidth package (effective only when you apply for more than 1 bandwidth packages). 
     * @return BandwidthPackageIds The unique ID list of the bandwidth package (effective only when you apply for more than 1 bandwidth packages).
     */
    public String [] getBandwidthPackageIds() {
        return this.BandwidthPackageIds;
    }

    /**
     * Set The unique ID list of the bandwidth package (effective only when you apply for more than 1 bandwidth packages).
     * @param BandwidthPackageIds The unique ID list of the bandwidth package (effective only when you apply for more than 1 bandwidth packages).
     */
    public void setBandwidthPackageIds(String [] BandwidthPackageIds) {
        this.BandwidthPackageIds = BandwidthPackageIds;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateBandwidthPackageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBandwidthPackageResponse(CreateBandwidthPackageResponse source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.BandwidthPackageIds != null) {
            this.BandwidthPackageIds = new String[source.BandwidthPackageIds.length];
            for (int i = 0; i < source.BandwidthPackageIds.length; i++) {
                this.BandwidthPackageIds[i] = new String(source.BandwidthPackageIds[i]);
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
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamArraySimple(map, prefix + "BandwidthPackageIds.", this.BandwidthPackageIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

