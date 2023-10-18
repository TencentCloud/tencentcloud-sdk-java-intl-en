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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSlowQueriesResponse extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Slow query record
    */
    @SerializedName("SlowQueries")
    @Expose
    private SlowQueriesItem [] SlowQueries;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Slow query record 
     * @return SlowQueries Slow query record
     */
    public SlowQueriesItem [] getSlowQueries() {
        return this.SlowQueries;
    }

    /**
     * Set Slow query record
     * @param SlowQueries Slow query record
     */
    public void setSlowQueries(SlowQueriesItem [] SlowQueries) {
        this.SlowQueries = SlowQueries;
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

    public DescribeInstanceSlowQueriesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSlowQueriesResponse(DescribeInstanceSlowQueriesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SlowQueries != null) {
            this.SlowQueries = new SlowQueriesItem[source.SlowQueries.length];
            for (int i = 0; i < source.SlowQueries.length; i++) {
                this.SlowQueries[i] = new SlowQueriesItem(source.SlowQueries[i]);
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
        this.setParamArrayObj(map, prefix + "SlowQueries.", this.SlowQueries);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

