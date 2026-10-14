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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableScheduleOperationDuration extends AbstractModel {

    /**
    * Date when enabling an asynchronous task is supported
    */
    @SerializedName("Periods")
    @Expose
    private String [] Periods;

    /**
    * Enable async start time
    */
    @SerializedName("TimeStart")
    @Expose
    private String TimeStart;

    /**
    * Supports enabling asynchronous termination time
    */
    @SerializedName("TimeEnd")
    @Expose
    private String TimeEnd;

    /**
    * Enable async time zone
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Date when enabling an asynchronous task is supported 
     * @return Periods Date when enabling an asynchronous task is supported
     */
    public String [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set Date when enabling an asynchronous task is supported
     * @param Periods Date when enabling an asynchronous task is supported
     */
    public void setPeriods(String [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get Enable async start time 
     * @return TimeStart Enable async start time
     */
    public String getTimeStart() {
        return this.TimeStart;
    }

    /**
     * Set Enable async start time
     * @param TimeStart Enable async start time
     */
    public void setTimeStart(String TimeStart) {
        this.TimeStart = TimeStart;
    }

    /**
     * Get Supports enabling asynchronous termination time 
     * @return TimeEnd Supports enabling asynchronous termination time
     */
    public String getTimeEnd() {
        return this.TimeEnd;
    }

    /**
     * Set Supports enabling asynchronous termination time
     * @param TimeEnd Supports enabling asynchronous termination time
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Get Enable async time zone 
     * @return TimeZone Enable async time zone
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Enable async time zone
     * @param TimeZone Enable async time zone
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public EnableScheduleOperationDuration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableScheduleOperationDuration(EnableScheduleOperationDuration source) {
        if (source.Periods != null) {
            this.Periods = new String[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new String(source.Periods[i]);
            }
        }
        if (source.TimeStart != null) {
            this.TimeStart = new String(source.TimeStart);
        }
        if (source.TimeEnd != null) {
            this.TimeEnd = new String(source.TimeEnd);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Periods.", this.Periods);
        this.setParamSimple(map, prefix + "TimeStart", this.TimeStart);
        this.setParamSimple(map, prefix + "TimeEnd", this.TimeEnd);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

