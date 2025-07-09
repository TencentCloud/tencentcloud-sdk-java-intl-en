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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetStatisticsReportResponse extends AbstractModel {

    /**
    * Daily email sending statistics.
    */
    @SerializedName("DailyVolumes")
    @Expose
    private Volume [] DailyVolumes;

    /**
    * Overall email sending statistics.
    */
    @SerializedName("OverallVolume")
    @Expose
    private Volume OverallVolume;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Daily email sending statistics. 
     * @return DailyVolumes Daily email sending statistics.
     */
    public Volume [] getDailyVolumes() {
        return this.DailyVolumes;
    }

    /**
     * Set Daily email sending statistics.
     * @param DailyVolumes Daily email sending statistics.
     */
    public void setDailyVolumes(Volume [] DailyVolumes) {
        this.DailyVolumes = DailyVolumes;
    }

    /**
     * Get Overall email sending statistics. 
     * @return OverallVolume Overall email sending statistics.
     */
    public Volume getOverallVolume() {
        return this.OverallVolume;
    }

    /**
     * Set Overall email sending statistics.
     * @param OverallVolume Overall email sending statistics.
     */
    public void setOverallVolume(Volume OverallVolume) {
        this.OverallVolume = OverallVolume;
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

    public GetStatisticsReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetStatisticsReportResponse(GetStatisticsReportResponse source) {
        if (source.DailyVolumes != null) {
            this.DailyVolumes = new Volume[source.DailyVolumes.length];
            for (int i = 0; i < source.DailyVolumes.length; i++) {
                this.DailyVolumes[i] = new Volume(source.DailyVolumes[i]);
            }
        }
        if (source.OverallVolume != null) {
            this.OverallVolume = new Volume(source.OverallVolume);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DailyVolumes.", this.DailyVolumes);
        this.setParamObj(map, prefix + "OverallVolume.", this.OverallVolume);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

