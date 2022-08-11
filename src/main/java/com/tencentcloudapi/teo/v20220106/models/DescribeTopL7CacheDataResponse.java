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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopL7CacheDataResponse extends AbstractModel{

    /**
    * Top-ranked data details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private TopDataRecord [] Data;

    /**
    * Dimension specified for data query
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Metric specified for data query
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
     * Get Top-ranked data details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Top-ranked data details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopDataRecord [] getData() {
        return this.Data;
    }

    /**
     * Set Top-ranked data details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Top-ranked data details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(TopDataRecord [] Data) {
        this.Data = Data;
    }

    /**
     * Get Dimension specified for data query 
     * @return Type Dimension specified for data query
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Dimension specified for data query
     * @param Type Dimension specified for data query
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Metric specified for data query 
     * @return MetricName Metric specified for data query
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric specified for data query
     * @param MetricName Metric specified for data query
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

    public DescribeTopL7CacheDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopL7CacheDataResponse(DescribeTopL7CacheDataResponse source) {
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

