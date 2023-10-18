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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingGroupsResponse extends AbstractModel {

    /**
    * List of auto scaling group details.
    */
    @SerializedName("AutoScalingGroupSet")
    @Expose
    private AutoScalingGroup [] AutoScalingGroupSet;

    /**
    * Number of eligible auto scaling groups.
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
     * Get List of auto scaling group details. 
     * @return AutoScalingGroupSet List of auto scaling group details.
     */
    public AutoScalingGroup [] getAutoScalingGroupSet() {
        return this.AutoScalingGroupSet;
    }

    /**
     * Set List of auto scaling group details.
     * @param AutoScalingGroupSet List of auto scaling group details.
     */
    public void setAutoScalingGroupSet(AutoScalingGroup [] AutoScalingGroupSet) {
        this.AutoScalingGroupSet = AutoScalingGroupSet;
    }

    /**
     * Get Number of eligible auto scaling groups. 
     * @return TotalCount Number of eligible auto scaling groups.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible auto scaling groups.
     * @param TotalCount Number of eligible auto scaling groups.
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

    public DescribeAutoScalingGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingGroupsResponse(DescribeAutoScalingGroupsResponse source) {
        if (source.AutoScalingGroupSet != null) {
            this.AutoScalingGroupSet = new AutoScalingGroup[source.AutoScalingGroupSet.length];
            for (int i = 0; i < source.AutoScalingGroupSet.length; i++) {
                this.AutoScalingGroupSet[i] = new AutoScalingGroup(source.AutoScalingGroupSet[i]);
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
        this.setParamArrayObj(map, prefix + "AutoScalingGroupSet.", this.AutoScalingGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

