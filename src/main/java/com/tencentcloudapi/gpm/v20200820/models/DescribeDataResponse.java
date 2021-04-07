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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataResponse extends AbstractModel{

    /**
    * Matchmaking statistics overview
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("OverviewData")
    @Expose
    private ReportOverviewData OverviewData;

    /**
    * Trend data of the number of matchmaking requests
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("TrendData")
    @Expose
    private ReportTrendData TrendData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Matchmaking statistics overview
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return OverviewData Matchmaking statistics overview
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public ReportOverviewData getOverviewData() {
        return this.OverviewData;
    }

    /**
     * Set Matchmaking statistics overview
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param OverviewData Matchmaking statistics overview
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setOverviewData(ReportOverviewData OverviewData) {
        this.OverviewData = OverviewData;
    }

    /**
     * Get Trend data of the number of matchmaking requests
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return TrendData Trend data of the number of matchmaking requests
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public ReportTrendData getTrendData() {
        return this.TrendData;
    }

    /**
     * Set Trend data of the number of matchmaking requests
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param TrendData Trend data of the number of matchmaking requests
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTrendData(ReportTrendData TrendData) {
        this.TrendData = TrendData;
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
        this.setParamObj(map, prefix + "OverviewData.", this.OverviewData);
        this.setParamObj(map, prefix + "TrendData.", this.TrendData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

