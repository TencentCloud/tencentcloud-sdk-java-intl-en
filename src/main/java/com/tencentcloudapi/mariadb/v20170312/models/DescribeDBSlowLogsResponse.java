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
    * Total statement lock time
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
    * Total statement query time
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
     * Get Total statement lock time 
     * @return LockTimeSum Total statement lock time
     */
    public Float getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * Set Total statement lock time
     * @param LockTimeSum Total statement lock time
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
     * Get Total statement query time 
     * @return QueryTimeSum Total statement query time
     */
    public Float getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * Set Total statement query time
     * @param QueryTimeSum Total statement query time
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

    public DescribeDBSlowLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSlowLogsResponse(DescribeDBSlowLogsResponse source) {
        if (source.Data != null) {
            this.Data = new SlowLogData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SlowLogData(source.Data[i]);
            }
        }
        if (source.LockTimeSum != null) {
            this.LockTimeSum = new Float(source.LockTimeSum);
        }
        if (source.QueryCount != null) {
            this.QueryCount = new Long(source.QueryCount);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.QueryTimeSum != null) {
            this.QueryTimeSum = new Float(source.QueryTimeSum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

