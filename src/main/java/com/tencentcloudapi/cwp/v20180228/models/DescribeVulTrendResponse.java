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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulTrendResponse extends AbstractModel {

    /**
    * Number of vulnerability exploitation attacks in the past six months
    */
    @SerializedName("VulEventCount")
    @Expose
    private Long VulEventCount;

    /**
    * Number of new vulnerability exploitation attacks in the past six months
    */
    @SerializedName("IncreaseVulEventCount")
    @Expose
    private Long IncreaseVulEventCount;

    /**
    * Notable vulnerabilities attacked in the past six months
    */
    @SerializedName("HotVulCount")
    @Expose
    private Long HotVulCount;

    /**
    * New notable vulnerabilities attacked in the past six months
    */
    @SerializedName("IncreaseHotVulCount")
    @Expose
    private Long IncreaseHotVulCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of vulnerability exploitation attacks in the past six months 
     * @return VulEventCount Number of vulnerability exploitation attacks in the past six months
     */
    public Long getVulEventCount() {
        return this.VulEventCount;
    }

    /**
     * Set Number of vulnerability exploitation attacks in the past six months
     * @param VulEventCount Number of vulnerability exploitation attacks in the past six months
     */
    public void setVulEventCount(Long VulEventCount) {
        this.VulEventCount = VulEventCount;
    }

    /**
     * Get Number of new vulnerability exploitation attacks in the past six months 
     * @return IncreaseVulEventCount Number of new vulnerability exploitation attacks in the past six months
     */
    public Long getIncreaseVulEventCount() {
        return this.IncreaseVulEventCount;
    }

    /**
     * Set Number of new vulnerability exploitation attacks in the past six months
     * @param IncreaseVulEventCount Number of new vulnerability exploitation attacks in the past six months
     */
    public void setIncreaseVulEventCount(Long IncreaseVulEventCount) {
        this.IncreaseVulEventCount = IncreaseVulEventCount;
    }

    /**
     * Get Notable vulnerabilities attacked in the past six months 
     * @return HotVulCount Notable vulnerabilities attacked in the past six months
     */
    public Long getHotVulCount() {
        return this.HotVulCount;
    }

    /**
     * Set Notable vulnerabilities attacked in the past six months
     * @param HotVulCount Notable vulnerabilities attacked in the past six months
     */
    public void setHotVulCount(Long HotVulCount) {
        this.HotVulCount = HotVulCount;
    }

    /**
     * Get New notable vulnerabilities attacked in the past six months 
     * @return IncreaseHotVulCount New notable vulnerabilities attacked in the past six months
     */
    public Long getIncreaseHotVulCount() {
        return this.IncreaseHotVulCount;
    }

    /**
     * Set New notable vulnerabilities attacked in the past six months
     * @param IncreaseHotVulCount New notable vulnerabilities attacked in the past six months
     */
    public void setIncreaseHotVulCount(Long IncreaseHotVulCount) {
        this.IncreaseHotVulCount = IncreaseHotVulCount;
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

    public DescribeVulTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulTrendResponse(DescribeVulTrendResponse source) {
        if (source.VulEventCount != null) {
            this.VulEventCount = new Long(source.VulEventCount);
        }
        if (source.IncreaseVulEventCount != null) {
            this.IncreaseVulEventCount = new Long(source.IncreaseVulEventCount);
        }
        if (source.HotVulCount != null) {
            this.HotVulCount = new Long(source.HotVulCount);
        }
        if (source.IncreaseHotVulCount != null) {
            this.IncreaseHotVulCount = new Long(source.IncreaseHotVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulEventCount", this.VulEventCount);
        this.setParamSimple(map, prefix + "IncreaseVulEventCount", this.IncreaseVulEventCount);
        this.setParamSimple(map, prefix + "HotVulCount", this.HotVulCount);
        this.setParamSimple(map, prefix + "IncreaseHotVulCount", this.IncreaseHotVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

