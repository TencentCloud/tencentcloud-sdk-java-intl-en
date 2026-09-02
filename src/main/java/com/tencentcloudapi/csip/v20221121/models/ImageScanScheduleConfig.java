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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanScheduleConfig extends AbstractModel {

    /**
    * <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAILY: Daily</li><li>WEEKLY: Weekly</li><li>MONTHLY: Monthly</li></ul>
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>Specific date. For weekly type: 1-7 (Monday to Sunday); for monthly type: 1-31; disabled for daily type.</p>
    */
    @SerializedName("CycleDays")
    @Expose
    private Long [] CycleDays;

    /**
    * <p>Scan start time</p><p>Parameter format: hh:mm</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Time zone</p>
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
     * Get <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAILY: Daily</li><li>WEEKLY: Weekly</li><li>MONTHLY: Monthly</li></ul> 
     * @return CycleType <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAILY: Daily</li><li>WEEKLY: Weekly</li><li>MONTHLY: Monthly</li></ul>
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAILY: Daily</li><li>WEEKLY: Weekly</li><li>MONTHLY: Monthly</li></ul>
     * @param CycleType <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAILY: Daily</li><li>WEEKLY: Weekly</li><li>MONTHLY: Monthly</li></ul>
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>Specific date. For weekly type: 1-7 (Monday to Sunday); for monthly type: 1-31; disabled for daily type.</p> 
     * @return CycleDays <p>Specific date. For weekly type: 1-7 (Monday to Sunday); for monthly type: 1-31; disabled for daily type.</p>
     */
    public Long [] getCycleDays() {
        return this.CycleDays;
    }

    /**
     * Set <p>Specific date. For weekly type: 1-7 (Monday to Sunday); for monthly type: 1-31; disabled for daily type.</p>
     * @param CycleDays <p>Specific date. For weekly type: 1-7 (Monday to Sunday); for monthly type: 1-31; disabled for daily type.</p>
     */
    public void setCycleDays(Long [] CycleDays) {
        this.CycleDays = CycleDays;
    }

    /**
     * Get <p>Scan start time</p><p>Parameter format: hh:mm</p> 
     * @return StartTime <p>Scan start time</p><p>Parameter format: hh:mm</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Scan start time</p><p>Parameter format: hh:mm</p>
     * @param StartTime <p>Scan start time</p><p>Parameter format: hh:mm</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Time zone</p> 
     * @return Timezone <p>Time zone</p>
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set <p>Time zone</p>
     * @param Timezone <p>Time zone</p>
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    public ImageScanScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanScheduleConfig(ImageScanScheduleConfig source) {
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleDays != null) {
            this.CycleDays = new Long[source.CycleDays.length];
            for (int i = 0; i < source.CycleDays.length; i++) {
                this.CycleDays[i] = new Long(source.CycleDays[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamArraySimple(map, prefix + "CycleDays.", this.CycleDays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);

    }
}

