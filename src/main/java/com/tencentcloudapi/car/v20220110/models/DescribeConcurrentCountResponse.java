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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrentCountResponse extends AbstractModel {

    /**
    * Total Concurrency Count
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The number of concurrent executions, including those in pre-launch, connected, waiting for reconnection, to be cleaned up or recovered, and all non-idle concurrent executions. Therefore, refreshing projects or disconnecting user connections with concurrency packages will affect this value.
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total Concurrency Count 
     * @return Total Total Concurrency Count
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total Concurrency Count
     * @param Total Total Concurrency Count
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The number of concurrent executions, including those in pre-launch, connected, waiting for reconnection, to be cleaned up or recovered, and all non-idle concurrent executions. Therefore, refreshing projects or disconnecting user connections with concurrency packages will affect this value. 
     * @return Running The number of concurrent executions, including those in pre-launch, connected, waiting for reconnection, to be cleaned up or recovered, and all non-idle concurrent executions. Therefore, refreshing projects or disconnecting user connections with concurrency packages will affect this value.
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set The number of concurrent executions, including those in pre-launch, connected, waiting for reconnection, to be cleaned up or recovered, and all non-idle concurrent executions. Therefore, refreshing projects or disconnecting user connections with concurrency packages will affect this value.
     * @param Running The number of concurrent executions, including those in pre-launch, connected, waiting for reconnection, to be cleaned up or recovered, and all non-idle concurrent executions. Therefore, refreshing projects or disconnecting user connections with concurrency packages will affect this value.
     */
    public void setRunning(Long Running) {
        this.Running = Running;
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

    public DescribeConcurrentCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrentCountResponse(DescribeConcurrentCountResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

