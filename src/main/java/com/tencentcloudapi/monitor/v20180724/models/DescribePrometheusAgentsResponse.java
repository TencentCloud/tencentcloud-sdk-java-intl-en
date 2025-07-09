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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusAgentsResponse extends AbstractModel {

    /**
    * List of agents
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AgentSet")
    @Expose
    private PrometheusAgent [] AgentSet;

    /**
    * Total number of agents
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
     * Get List of agents
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AgentSet List of agents
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusAgent [] getAgentSet() {
        return this.AgentSet;
    }

    /**
     * Set List of agents
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AgentSet List of agents
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgentSet(PrometheusAgent [] AgentSet) {
        this.AgentSet = AgentSet;
    }

    /**
     * Get Total number of agents 
     * @return TotalCount Total number of agents
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of agents
     * @param TotalCount Total number of agents
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

    public DescribePrometheusAgentsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusAgentsResponse(DescribePrometheusAgentsResponse source) {
        if (source.AgentSet != null) {
            this.AgentSet = new PrometheusAgent[source.AgentSet.length];
            for (int i = 0; i < source.AgentSet.length; i++) {
                this.AgentSet[i] = new PrometheusAgent(source.AgentSet[i]);
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
        this.setParamArrayObj(map, prefix + "AgentSet.", this.AgentSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

