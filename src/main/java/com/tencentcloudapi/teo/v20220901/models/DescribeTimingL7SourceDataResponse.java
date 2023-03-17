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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimingL7SourceDataResponse extends AbstractModel{

    /**
    * Total number of query results.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of time series traffic data.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TimingDataRecords")
    @Expose
    private TimingDataRecord [] TimingDataRecords;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of query results. 
     * @return TotalCount Total number of query results.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of query results.
     * @param TotalCount Total number of query results.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of time series traffic data.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TimingDataRecords List of time series traffic data.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public TimingDataRecord [] getTimingDataRecords() {
        return this.TimingDataRecords;
    }

    /**
     * Set List of time series traffic data.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TimingDataRecords List of time series traffic data.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTimingDataRecords(TimingDataRecord [] TimingDataRecords) {
        this.TimingDataRecords = TimingDataRecords;
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

    public DescribeTimingL7SourceDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7SourceDataResponse(DescribeTimingL7SourceDataResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TimingDataRecords != null) {
            this.TimingDataRecords = new TimingDataRecord[source.TimingDataRecords.length];
            for (int i = 0; i < source.TimingDataRecords.length; i++) {
                this.TimingDataRecords[i] = new TimingDataRecord(source.TimingDataRecords[i]);
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
        this.setParamArrayObj(map, prefix + "TimingDataRecords.", this.TimingDataRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

