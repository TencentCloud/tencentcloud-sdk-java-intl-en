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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowQueryListResponse extends AbstractModel{

    /**
    * The total number of slow query statements during the specified period of time.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Analysis of the execution time of slow query statements by classifying them to different time ranges. These slow query statements fall within the query range you specified in the request parameters.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DurationAnalysis")
    @Expose
    private DurationAnalysis [] DurationAnalysis;

    /**
    * The list of slow query details during the specified period of time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RawSlowQueryList")
    @Expose
    private RawSlowQuery [] RawSlowQueryList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of slow query statements during the specified period of time. 
     * @return TotalCount The total number of slow query statements during the specified period of time.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of slow query statements during the specified period of time.
     * @param TotalCount The total number of slow query statements during the specified period of time.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Analysis of the execution time of slow query statements by classifying them to different time ranges. These slow query statements fall within the query range you specified in the request parameters.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DurationAnalysis Analysis of the execution time of slow query statements by classifying them to different time ranges. These slow query statements fall within the query range you specified in the request parameters.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public DurationAnalysis [] getDurationAnalysis() {
        return this.DurationAnalysis;
    }

    /**
     * Set Analysis of the execution time of slow query statements by classifying them to different time ranges. These slow query statements fall within the query range you specified in the request parameters.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DurationAnalysis Analysis of the execution time of slow query statements by classifying them to different time ranges. These slow query statements fall within the query range you specified in the request parameters.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDurationAnalysis(DurationAnalysis [] DurationAnalysis) {
        this.DurationAnalysis = DurationAnalysis;
    }

    /**
     * Get The list of slow query details during the specified period of time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RawSlowQueryList The list of slow query details during the specified period of time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RawSlowQuery [] getRawSlowQueryList() {
        return this.RawSlowQueryList;
    }

    /**
     * Set The list of slow query details during the specified period of time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RawSlowQueryList The list of slow query details during the specified period of time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRawSlowQueryList(RawSlowQuery [] RawSlowQueryList) {
        this.RawSlowQueryList = RawSlowQueryList;
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

    public DescribeSlowQueryListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryListResponse(DescribeSlowQueryListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DurationAnalysis != null) {
            this.DurationAnalysis = new DurationAnalysis[source.DurationAnalysis.length];
            for (int i = 0; i < source.DurationAnalysis.length; i++) {
                this.DurationAnalysis[i] = new DurationAnalysis(source.DurationAnalysis[i]);
            }
        }
        if (source.RawSlowQueryList != null) {
            this.RawSlowQueryList = new RawSlowQuery[source.RawSlowQueryList.length];
            for (int i = 0; i < source.RawSlowQueryList.length; i++) {
                this.RawSlowQueryList[i] = new RawSlowQuery(source.RawSlowQueryList[i]);
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
        this.setParamArrayObj(map, prefix + "DurationAnalysis.", this.DurationAnalysis);
        this.setParamArrayObj(map, prefix + "RawSlowQueryList.", this.RawSlowQueryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

