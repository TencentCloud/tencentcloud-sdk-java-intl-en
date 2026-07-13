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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaveThresholdForm extends AbstractModel {

    /**
    * ACTUAL actual amount, FORECAST forecast amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarnType")
    @Expose
    private String WarnType;

    /**
    * Fluctuation threshold (equal to or greater than 0)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
    * Alarm type: chain period-over-period, yoy year-over-year, fix fixed value
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * Alarm dimension: day, month, weekday
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
     * Get ACTUAL actual amount, FORECAST forecast amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarnType ACTUAL actual amount, FORECAST forecast amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWarnType() {
        return this.WarnType;
    }

    /**
     * Set ACTUAL actual amount, FORECAST forecast amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarnType ACTUAL actual amount, FORECAST forecast amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarnType(String WarnType) {
        this.WarnType = WarnType;
    }

    /**
     * Get Fluctuation threshold (equal to or greater than 0)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Threshold Fluctuation threshold (equal to or greater than 0)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Fluctuation threshold (equal to or greater than 0)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Threshold Fluctuation threshold (equal to or greater than 0)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Alarm type: chain period-over-period, yoy year-over-year, fix fixed value
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaType Alarm type: chain period-over-period, yoy year-over-year, fix fixed value
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set Alarm type: chain period-over-period, yoy year-over-year, fix fixed value
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaType Alarm type: chain period-over-period, yoy year-over-year, fix fixed value
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get Alarm dimension: day, month, weekday
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeriodType Alarm dimension: day, month, weekday
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set Alarm dimension: day, month, weekday
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeriodType Alarm dimension: day, month, weekday
Supported types: day-on-day comparison chain day, day-on-day comparison chain weekday, year-on-year comparison by month yoy day, daily fixed value fix day, month-on-month comparison chain month, fixed monthly value fix month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    public WaveThresholdForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaveThresholdForm(WaveThresholdForm source) {
        if (source.WarnType != null) {
            this.WarnType = new String(source.WarnType);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarnType", this.WarnType);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);

    }
}

