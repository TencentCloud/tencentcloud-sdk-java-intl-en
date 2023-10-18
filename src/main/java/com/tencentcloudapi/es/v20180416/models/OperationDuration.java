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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationDuration extends AbstractModel {

    /**
    * Maintenance period, which can be one or more days from Monday to Sunday. Valid values: [0, 6].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Periods")
    @Expose
    private Long [] Periods;

    /**
    * The maintenance start time
    */
    @SerializedName("TimeStart")
    @Expose
    private String TimeStart;

    /**
    * The maintenance end time
    */
    @SerializedName("TimeEnd")
    @Expose
    private String TimeEnd;

    /**
    * The time zone expressed in UTC.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Maintenance period, which can be one or more days from Monday to Sunday. Valid values: [0, 6].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Periods Maintenance period, which can be one or more days from Monday to Sunday. Valid values: [0, 6].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set Maintenance period, which can be one or more days from Monday to Sunday. Valid values: [0, 6].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Periods Maintenance period, which can be one or more days from Monday to Sunday. Valid values: [0, 6].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriods(Long [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get The maintenance start time 
     * @return TimeStart The maintenance start time
     */
    public String getTimeStart() {
        return this.TimeStart;
    }

    /**
     * Set The maintenance start time
     * @param TimeStart The maintenance start time
     */
    public void setTimeStart(String TimeStart) {
        this.TimeStart = TimeStart;
    }

    /**
     * Get The maintenance end time 
     * @return TimeEnd The maintenance end time
     */
    public String getTimeEnd() {
        return this.TimeEnd;
    }

    /**
     * Set The maintenance end time
     * @param TimeEnd The maintenance end time
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Get The time zone expressed in UTC. 
     * @return TimeZone The time zone expressed in UTC.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set The time zone expressed in UTC.
     * @param TimeZone The time zone expressed in UTC.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public OperationDuration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationDuration(OperationDuration source) {
        if (source.Periods != null) {
            this.Periods = new Long[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new Long(source.Periods[i]);
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

