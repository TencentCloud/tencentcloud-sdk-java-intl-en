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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowLogsResponse extends AbstractModel{

    /**
    * Slow query log data
    */
    @SerializedName("Data")
    @Expose
    private SlowLogData [] Data;

    /**
    * Sum of all statement lock durations
    */
    @SerializedName("LockTimeSum")
    @Expose
    private Float LockTimeSum;

    /**
    * Total number of statement queries
    */
    @SerializedName("QueryCount")
    @Expose
    private Long QueryCount;

    /**
    * Total number of results
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Sum of all statement query durations
    */
    @SerializedName("QueryTimeSum")
    @Expose
    private Float QueryTimeSum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Slow query log data 
     * @return Data Slow query log data
     */
    public SlowLogData [] getData() {
        return this.Data;
    }

    /**
     * Set Slow query log data
     * @param Data Slow query log data
     */
    public void setData(SlowLogData [] Data) {
        this.Data = Data;
    }

    /**
     * Get Sum of all statement lock durations 
     * @return LockTimeSum Sum of all statement lock durations
     */
    public Float getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * Set Sum of all statement lock durations
     * @param LockTimeSum Sum of all statement lock durations
     */
    public void setLockTimeSum(Float LockTimeSum) {
        this.LockTimeSum = LockTimeSum;
    }

    /**
     * Get Total number of statement queries 
     * @return QueryCount Total number of statement queries
     */
    public Long getQueryCount() {
        return this.QueryCount;
    }

    /**
     * Set Total number of statement queries
     * @param QueryCount Total number of statement queries
     */
    public void setQueryCount(Long QueryCount) {
        this.QueryCount = QueryCount;
    }

    /**
     * Get Total number of results 
     * @return Total Total number of results
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of results
     * @param Total Total number of results
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Sum of all statement query durations 
     * @return QueryTimeSum Sum of all statement query durations
     */
    public Float getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * Set Sum of all statement query durations
     * @param QueryTimeSum Sum of all statement query durations
     */
    public void setQueryTimeSum(Float QueryTimeSum) {
        this.QueryTimeSum = QueryTimeSum;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "LockTimeSum", this.LockTimeSum);
        this.setParamSimple(map, prefix + "QueryCount", this.QueryCount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "QueryTimeSum", this.QueryTimeSum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

