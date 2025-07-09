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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTransmitStatisResponse extends AbstractModel {

    /**
    * If `MetricName` is `traffic`, this field indicates the inbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the inbound packet rate in pps;
    */
    @SerializedName("InDataList")
    @Expose
    private Float [] InDataList;

    /**
    * If `MetricName` is `traffic`, this field indicates the outbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the outbound packet rate in pps;
    */
    @SerializedName("OutDataList")
    @Expose
    private Float [] OutDataList;

    /**
    * Metric name:
traffic: traffic bandwidth;
pkg: packet rate;
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
     * Get If `MetricName` is `traffic`, this field indicates the inbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the inbound packet rate in pps; 
     * @return InDataList If `MetricName` is `traffic`, this field indicates the inbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the inbound packet rate in pps;
     */
    public Float [] getInDataList() {
        return this.InDataList;
    }

    /**
     * Set If `MetricName` is `traffic`, this field indicates the inbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the inbound packet rate in pps;
     * @param InDataList If `MetricName` is `traffic`, this field indicates the inbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the inbound packet rate in pps;
     */
    public void setInDataList(Float [] InDataList) {
        this.InDataList = InDataList;
    }

    /**
     * Get If `MetricName` is `traffic`, this field indicates the outbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the outbound packet rate in pps; 
     * @return OutDataList If `MetricName` is `traffic`, this field indicates the outbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the outbound packet rate in pps;
     */
    public Float [] getOutDataList() {
        return this.OutDataList;
    }

    /**
     * Set If `MetricName` is `traffic`, this field indicates the outbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the outbound packet rate in pps;
     * @param OutDataList If `MetricName` is `traffic`, this field indicates the outbound traffic bandwidth in bps;
If `MetricName` is `pkg`, this field indicates the outbound packet rate in pps;
     */
    public void setOutDataList(Float [] OutDataList) {
        this.OutDataList = OutDataList;
    }

    /**
     * Get Metric name:
traffic: traffic bandwidth;
pkg: packet rate; 
     * @return MetricName Metric name:
traffic: traffic bandwidth;
pkg: packet rate;
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name:
traffic: traffic bandwidth;
pkg: packet rate;
     * @param MetricName Metric name:
traffic: traffic bandwidth;
pkg: packet rate;
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

    public DescribeTransmitStatisResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTransmitStatisResponse(DescribeTransmitStatisResponse source) {
        if (source.InDataList != null) {
            this.InDataList = new Float[source.InDataList.length];
            for (int i = 0; i < source.InDataList.length; i++) {
                this.InDataList[i] = new Float(source.InDataList[i]);
            }
        }
        if (source.OutDataList != null) {
            this.OutDataList = new Float[source.OutDataList.length];
            for (int i = 0; i < source.OutDataList.length; i++) {
                this.OutDataList[i] = new Float(source.OutDataList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "InDataList.", this.InDataList);
        this.setParamArraySimple(map, prefix + "OutDataList.", this.OutDataList);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

