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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProcessStatisticsResponse extends AbstractModel {

    /**
    * Total number of records in process statistics list.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Process statistics list array.
    */
    @SerializedName("ProcessStatistics")
    @Expose
    private ProcessStatistics [] ProcessStatistics;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records in process statistics list. 
     * @return TotalCount Total number of records in process statistics list.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records in process statistics list.
     * @param TotalCount Total number of records in process statistics list.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Process statistics list array. 
     * @return ProcessStatistics Process statistics list array.
     */
    public ProcessStatistics [] getProcessStatistics() {
        return this.ProcessStatistics;
    }

    /**
     * Set Process statistics list array.
     * @param ProcessStatistics Process statistics list array.
     */
    public void setProcessStatistics(ProcessStatistics [] ProcessStatistics) {
        this.ProcessStatistics = ProcessStatistics;
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

    public DescribeProcessStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProcessStatisticsResponse(DescribeProcessStatisticsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ProcessStatistics != null) {
            this.ProcessStatistics = new ProcessStatistics[source.ProcessStatistics.length];
            for (int i = 0; i < source.ProcessStatistics.length; i++) {
                this.ProcessStatistics[i] = new ProcessStatistics(source.ProcessStatistics[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ProcessStatistics.", this.ProcessStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

