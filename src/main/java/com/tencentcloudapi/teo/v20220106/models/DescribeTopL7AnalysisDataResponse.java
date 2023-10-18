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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopL7AnalysisDataResponse extends AbstractModel {

    /**
    * Top detailed data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private TopDataRecord [] Data;

    /**
    * Query dimension
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Query metric
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Top detailed data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Top detailed data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopDataRecord [] getData() {
        return this.Data;
    }

    /**
     * Set Top detailed data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Top detailed data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(TopDataRecord [] Data) {
        this.Data = Data;
    }

    /**
     * Get Query dimension 
     * @return Type Query dimension
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Query dimension
     * @param Type Query dimension
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Query metric 
     * @return MetricName Query metric
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Query metric
     * @param MetricName Query metric
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
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

    public DescribeTopL7AnalysisDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopL7AnalysisDataResponse(DescribeTopL7AnalysisDataResponse source) {
        if (source.Data != null) {
            this.Data = new TopDataRecord[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TopDataRecord(source.Data[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

