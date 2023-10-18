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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusTargetsTMPResponse extends AbstractModel {

    /**
    * Targets information of all jobs
    */
    @SerializedName("Jobs")
    @Expose
    private PrometheusJobTargets [] Jobs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Targets information of all jobs 
     * @return Jobs Targets information of all jobs
     */
    public PrometheusJobTargets [] getJobs() {
        return this.Jobs;
    }

    /**
     * Set Targets information of all jobs
     * @param Jobs Targets information of all jobs
     */
    public void setJobs(PrometheusJobTargets [] Jobs) {
        this.Jobs = Jobs;
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

    public DescribePrometheusTargetsTMPResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusTargetsTMPResponse(DescribePrometheusTargetsTMPResponse source) {
        if (source.Jobs != null) {
            this.Jobs = new PrometheusJobTargets[source.Jobs.length];
            for (int i = 0; i < source.Jobs.length; i++) {
                this.Jobs[i] = new PrometheusJobTargets(source.Jobs[i]);
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
        this.setParamArrayObj(map, prefix + "Jobs.", this.Jobs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

