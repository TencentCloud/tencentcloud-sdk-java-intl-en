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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsImportInfo extends AbstractModel {

    /**
    * Import mode.
1. Import history data
2. Import real-time data
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Start time. Unit: unix second-level timestamp.

    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time. Unit: unix second-level timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Maximum delay time. Unit: s

Import mode is 2. Required for importing real-time data.
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Check interval. Unit: s

Import mode is 2. Required for importing real-time data.
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
     * Get Import mode.
1. Import history data
2. Import real-time data 
     * @return Type Import mode.
1. Import history data
2. Import real-time data
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Import mode.
1. Import history data
2. Import real-time data
     * @param Type Import mode.
1. Import history data
2. Import real-time data
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Start time. Unit: unix second-level timestamp.
 
     * @return StartTime Start time. Unit: unix second-level timestamp.

     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. Unit: unix second-level timestamp.

     * @param StartTime Start time. Unit: unix second-level timestamp.

     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. Unit: unix second-level timestamp. 
     * @return EndTime End time. Unit: unix second-level timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. Unit: unix second-level timestamp.
     * @param EndTime End time. Unit: unix second-level timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Maximum delay time. Unit: s

Import mode is 2. Required for importing real-time data. 
     * @return MaxDelay Maximum delay time. Unit: s

Import mode is 2. Required for importing real-time data.
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set Maximum delay time. Unit: s

Import mode is 2. Required for importing real-time data.
     * @param MaxDelay Maximum delay time. Unit: s

Import mode is 2. Required for importing real-time data.
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Check interval. Unit: s

Import mode is 2. Required for importing real-time data. 
     * @return CheckInterval Check interval. Unit: s

Import mode is 2. Required for importing real-time data.
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set Check interval. Unit: s

Import mode is 2. Required for importing real-time data.
     * @param CheckInterval Check interval. Unit: s

Import mode is 2. Required for importing real-time data.
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    public EsImportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsImportInfo(EsImportInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.CheckInterval != null) {
            this.CheckInterval = new Long(source.CheckInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "CheckInterval", this.CheckInterval);

    }
}

