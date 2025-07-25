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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAffectedClusterCountResponse extends AbstractModel {

    /**
    * Number of critical clusters
    */
    @SerializedName("SeriousRiskClusterCount")
    @Expose
    private Long SeriousRiskClusterCount;

    /**
    * Number of high-risk clusters
    */
    @SerializedName("HighRiskClusterCount")
    @Expose
    private Long HighRiskClusterCount;

    /**
    * Number of medium-risk clusters
    */
    @SerializedName("MiddleRiskClusterCount")
    @Expose
    private Long MiddleRiskClusterCount;

    /**
    * Number of low-risk clusters
    */
    @SerializedName("HintRiskClusterCount")
    @Expose
    private Long HintRiskClusterCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of critical clusters 
     * @return SeriousRiskClusterCount Number of critical clusters
     */
    public Long getSeriousRiskClusterCount() {
        return this.SeriousRiskClusterCount;
    }

    /**
     * Set Number of critical clusters
     * @param SeriousRiskClusterCount Number of critical clusters
     */
    public void setSeriousRiskClusterCount(Long SeriousRiskClusterCount) {
        this.SeriousRiskClusterCount = SeriousRiskClusterCount;
    }

    /**
     * Get Number of high-risk clusters 
     * @return HighRiskClusterCount Number of high-risk clusters
     */
    public Long getHighRiskClusterCount() {
        return this.HighRiskClusterCount;
    }

    /**
     * Set Number of high-risk clusters
     * @param HighRiskClusterCount Number of high-risk clusters
     */
    public void setHighRiskClusterCount(Long HighRiskClusterCount) {
        this.HighRiskClusterCount = HighRiskClusterCount;
    }

    /**
     * Get Number of medium-risk clusters 
     * @return MiddleRiskClusterCount Number of medium-risk clusters
     */
    public Long getMiddleRiskClusterCount() {
        return this.MiddleRiskClusterCount;
    }

    /**
     * Set Number of medium-risk clusters
     * @param MiddleRiskClusterCount Number of medium-risk clusters
     */
    public void setMiddleRiskClusterCount(Long MiddleRiskClusterCount) {
        this.MiddleRiskClusterCount = MiddleRiskClusterCount;
    }

    /**
     * Get Number of low-risk clusters 
     * @return HintRiskClusterCount Number of low-risk clusters
     */
    public Long getHintRiskClusterCount() {
        return this.HintRiskClusterCount;
    }

    /**
     * Set Number of low-risk clusters
     * @param HintRiskClusterCount Number of low-risk clusters
     */
    public void setHintRiskClusterCount(Long HintRiskClusterCount) {
        this.HintRiskClusterCount = HintRiskClusterCount;
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

    public DescribeAffectedClusterCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAffectedClusterCountResponse(DescribeAffectedClusterCountResponse source) {
        if (source.SeriousRiskClusterCount != null) {
            this.SeriousRiskClusterCount = new Long(source.SeriousRiskClusterCount);
        }
        if (source.HighRiskClusterCount != null) {
            this.HighRiskClusterCount = new Long(source.HighRiskClusterCount);
        }
        if (source.MiddleRiskClusterCount != null) {
            this.MiddleRiskClusterCount = new Long(source.MiddleRiskClusterCount);
        }
        if (source.HintRiskClusterCount != null) {
            this.HintRiskClusterCount = new Long(source.HintRiskClusterCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeriousRiskClusterCount", this.SeriousRiskClusterCount);
        this.setParamSimple(map, prefix + "HighRiskClusterCount", this.HighRiskClusterCount);
        this.setParamSimple(map, prefix + "MiddleRiskClusterCount", this.MiddleRiskClusterCount);
        this.setParamSimple(map, prefix + "HintRiskClusterCount", this.HintRiskClusterCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

