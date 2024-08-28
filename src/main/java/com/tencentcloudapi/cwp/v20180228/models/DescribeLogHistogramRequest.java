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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogHistogramRequest extends AbstractModel {

    /**
    * Start time of logs to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of logs to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Query statement
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * Time interval, in ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get Start time of logs to be queried, which is a Unix timestamp in milliseconds 
     * @return StartTime Start time of logs to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of logs to be queried, which is a Unix timestamp in milliseconds
     * @param StartTime Start time of logs to be queried, which is a Unix timestamp in milliseconds
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of logs to be queried, which is a Unix timestamp in milliseconds 
     * @return EndTime End time of logs to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of logs to be queried, which is a Unix timestamp in milliseconds
     * @param EndTime End time of logs to be queried, which is a Unix timestamp in milliseconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query statement 
     * @return QueryString Query statement
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Query statement
     * @param QueryString Query statement
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Time interval, in ms 
     * @return Interval Time interval, in ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Time interval, in ms
     * @param Interval Time interval, in ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public DescribeLogHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogHistogramRequest(DescribeLogHistogramRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

