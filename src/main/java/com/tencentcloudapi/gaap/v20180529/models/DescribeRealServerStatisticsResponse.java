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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServerStatisticsResponse extends AbstractModel {

    /**
    * Origin server status statistics of specified listener
    */
    @SerializedName("StatisticsData")
    @Expose
    private StatisticsDataInfo [] StatisticsData;

    /**
    * Status statistics of multiple origin servers
    */
    @SerializedName("RsStatisticsData")
    @Expose
    private MetricStatisticsInfo [] RsStatisticsData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Origin server status statistics of specified listener 
     * @return StatisticsData Origin server status statistics of specified listener
     */
    public StatisticsDataInfo [] getStatisticsData() {
        return this.StatisticsData;
    }

    /**
     * Set Origin server status statistics of specified listener
     * @param StatisticsData Origin server status statistics of specified listener
     */
    public void setStatisticsData(StatisticsDataInfo [] StatisticsData) {
        this.StatisticsData = StatisticsData;
    }

    /**
     * Get Status statistics of multiple origin servers 
     * @return RsStatisticsData Status statistics of multiple origin servers
     */
    public MetricStatisticsInfo [] getRsStatisticsData() {
        return this.RsStatisticsData;
    }

    /**
     * Set Status statistics of multiple origin servers
     * @param RsStatisticsData Status statistics of multiple origin servers
     */
    public void setRsStatisticsData(MetricStatisticsInfo [] RsStatisticsData) {
        this.RsStatisticsData = RsStatisticsData;
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

    public DescribeRealServerStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServerStatisticsResponse(DescribeRealServerStatisticsResponse source) {
        if (source.StatisticsData != null) {
            this.StatisticsData = new StatisticsDataInfo[source.StatisticsData.length];
            for (int i = 0; i < source.StatisticsData.length; i++) {
                this.StatisticsData[i] = new StatisticsDataInfo(source.StatisticsData[i]);
            }
        }
        if (source.RsStatisticsData != null) {
            this.RsStatisticsData = new MetricStatisticsInfo[source.RsStatisticsData.length];
            for (int i = 0; i < source.RsStatisticsData.length; i++) {
                this.RsStatisticsData[i] = new MetricStatisticsInfo(source.RsStatisticsData[i]);
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
        this.setParamArrayObj(map, prefix + "StatisticsData.", this.StatisticsData);
        this.setParamArrayObj(map, prefix + "RsStatisticsData.", this.RsStatisticsData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

