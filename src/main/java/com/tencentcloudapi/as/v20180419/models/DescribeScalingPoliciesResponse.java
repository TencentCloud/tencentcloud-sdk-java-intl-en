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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScalingPoliciesResponse extends AbstractModel{

    /**
    * List of AS alarm trigger policy details.
    */
    @SerializedName("ScalingPolicySet")
    @Expose
    private ScalingPolicy [] ScalingPolicySet;

    /**
    * Number of eligible notifications.
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
     * Get List of AS alarm trigger policy details. 
     * @return ScalingPolicySet List of AS alarm trigger policy details.
     */
    public ScalingPolicy [] getScalingPolicySet() {
        return this.ScalingPolicySet;
    }

    /**
     * Set List of AS alarm trigger policy details.
     * @param ScalingPolicySet List of AS alarm trigger policy details.
     */
    public void setScalingPolicySet(ScalingPolicy [] ScalingPolicySet) {
        this.ScalingPolicySet = ScalingPolicySet;
    }

    /**
     * Get Number of eligible notifications. 
     * @return TotalCount Number of eligible notifications.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible notifications.
     * @param TotalCount Number of eligible notifications.
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

    public DescribeScalingPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScalingPoliciesResponse(DescribeScalingPoliciesResponse source) {
        if (source.ScalingPolicySet != null) {
            this.ScalingPolicySet = new ScalingPolicy[source.ScalingPolicySet.length];
            for (int i = 0; i < source.ScalingPolicySet.length; i++) {
                this.ScalingPolicySet[i] = new ScalingPolicy(source.ScalingPolicySet[i]);
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
        this.setParamArrayObj(map, prefix + "ScalingPolicySet.", this.ScalingPolicySet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

