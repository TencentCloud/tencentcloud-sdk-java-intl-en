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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowStatisticsArray extends AbstractModel {

    /**
    * The timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The statistics of all the sessions.
    */
    @SerializedName("FlowStatistics")
    @Expose
    private FlowStatistics [] FlowStatistics;

    /**
     * Get The timestamp. 
     * @return Timestamp The timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set The timestamp.
     * @param Timestamp The timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get The statistics of all the sessions. 
     * @return FlowStatistics The statistics of all the sessions.
     */
    public FlowStatistics [] getFlowStatistics() {
        return this.FlowStatistics;
    }

    /**
     * Set The statistics of all the sessions.
     * @param FlowStatistics The statistics of all the sessions.
     */
    public void setFlowStatistics(FlowStatistics [] FlowStatistics) {
        this.FlowStatistics = FlowStatistics;
    }

    public FlowStatisticsArray() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowStatisticsArray(FlowStatisticsArray source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.FlowStatistics != null) {
            this.FlowStatistics = new FlowStatistics[source.FlowStatistics.length];
            for (int i = 0; i < source.FlowStatistics.length; i++) {
                this.FlowStatistics[i] = new FlowStatistics(source.FlowStatistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArrayObj(map, prefix + "FlowStatistics.", this.FlowStatistics);

    }
}

