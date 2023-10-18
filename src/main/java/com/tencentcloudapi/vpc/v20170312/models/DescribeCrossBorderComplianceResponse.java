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

public class DescribeCrossBorderComplianceResponse extends AbstractModel {

    /**
    * List of compliance review requests.
    */
    @SerializedName("CrossBorderComplianceSet")
    @Expose
    private CrossBorderCompliance [] CrossBorderComplianceSet;

    /**
    * Total number of compliance review requests.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of compliance review requests. 
     * @return CrossBorderComplianceSet List of compliance review requests.
     */
    public CrossBorderCompliance [] getCrossBorderComplianceSet() {
        return this.CrossBorderComplianceSet;
    }

    /**
     * Set List of compliance review requests.
     * @param CrossBorderComplianceSet List of compliance review requests.
     */
    public void setCrossBorderComplianceSet(CrossBorderCompliance [] CrossBorderComplianceSet) {
        this.CrossBorderComplianceSet = CrossBorderComplianceSet;
    }

    /**
     * Get Total number of compliance review requests. 
     * @return TotalCount Total number of compliance review requests.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of compliance review requests.
     * @param TotalCount Total number of compliance review requests.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeCrossBorderComplianceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBorderComplianceResponse(DescribeCrossBorderComplianceResponse source) {
        if (source.CrossBorderComplianceSet != null) {
            this.CrossBorderComplianceSet = new CrossBorderCompliance[source.CrossBorderComplianceSet.length];
            for (int i = 0; i < source.CrossBorderComplianceSet.length; i++) {
                this.CrossBorderComplianceSet[i] = new CrossBorderCompliance(source.CrossBorderComplianceSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CrossBorderComplianceSet.", this.CrossBorderComplianceSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

