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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenTaskInfo extends AbstractModel {

    /**
    * Statistical Indicator 0: All Instances, 1: Current Day, 2: Yesterday
    */
    @SerializedName("CountTag")
    @Expose
    private Long CountTag;

    /**
    * Total numberNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * RunningNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunningNum")
    @Expose
    private Long RunningNum;

    /**
    * StoppingNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StoppingNum")
    @Expose
    private Long StoppingNum;

    /**
    * StoppedNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StoppedNum")
    @Expose
    private Long StoppedNum;

    /**
    * Pause
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FrozenNum")
    @Expose
    private Long FrozenNum;

    /**
    * Annual task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("YearNum")
    @Expose
    private Long YearNum;

    /**
    * Monthly task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonthNum")
    @Expose
    private Long MonthNum;

    /**
    * Weekly task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WeekNum")
    @Expose
    private Long WeekNum;

    /**
    * Daily task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DayNum")
    @Expose
    private Long DayNum;

    /**
    * Hourly task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HourNum")
    @Expose
    private Long HourNum;

    /**
    * Minute Task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MinuteNum")
    @Expose
    private Long MinuteNum;

    /**
     * Get Statistical Indicator 0: All Instances, 1: Current Day, 2: Yesterday 
     * @return CountTag Statistical Indicator 0: All Instances, 1: Current Day, 2: Yesterday
     */
    public Long getCountTag() {
        return this.CountTag;
    }

    /**
     * Set Statistical Indicator 0: All Instances, 1: Current Day, 2: Yesterday
     * @param CountTag Statistical Indicator 0: All Instances, 1: Current Day, 2: Yesterday
     */
    public void setCountTag(Long CountTag) {
        this.CountTag = CountTag;
    }

    /**
     * Get Total numberNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalNum Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total numberNote: This field may return null, indicating that no valid value can be obtained.
     * @param TotalNum Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get RunningNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RunningNum RunningNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRunningNum() {
        return this.RunningNum;
    }

    /**
     * Set RunningNote: This field may return null, indicating that no valid value can be obtained.
     * @param RunningNum RunningNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunningNum(Long RunningNum) {
        this.RunningNum = RunningNum;
    }

    /**
     * Get StoppingNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StoppingNum StoppingNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStoppingNum() {
        return this.StoppingNum;
    }

    /**
     * Set StoppingNote: This field may return null, indicating that no valid value can be obtained.
     * @param StoppingNum StoppingNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStoppingNum(Long StoppingNum) {
        this.StoppingNum = StoppingNum;
    }

    /**
     * Get StoppedNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StoppedNum StoppedNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStoppedNum() {
        return this.StoppedNum;
    }

    /**
     * Set StoppedNote: This field may return null, indicating that no valid value can be obtained.
     * @param StoppedNum StoppedNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStoppedNum(Long StoppedNum) {
        this.StoppedNum = StoppedNum;
    }

    /**
     * Get Pause
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FrozenNum Pause
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFrozenNum() {
        return this.FrozenNum;
    }

    /**
     * Set Pause
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FrozenNum Pause
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFrozenNum(Long FrozenNum) {
        this.FrozenNum = FrozenNum;
    }

    /**
     * Get Annual task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return YearNum Annual task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getYearNum() {
        return this.YearNum;
    }

    /**
     * Set Annual task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param YearNum Annual task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setYearNum(Long YearNum) {
        this.YearNum = YearNum;
    }

    /**
     * Get Monthly task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonthNum Monthly task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMonthNum() {
        return this.MonthNum;
    }

    /**
     * Set Monthly task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonthNum Monthly task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonthNum(Long MonthNum) {
        this.MonthNum = MonthNum;
    }

    /**
     * Get Weekly task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WeekNum Weekly task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getWeekNum() {
        return this.WeekNum;
    }

    /**
     * Set Weekly task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WeekNum Weekly task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWeekNum(Long WeekNum) {
        this.WeekNum = WeekNum;
    }

    /**
     * Get Daily task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DayNum Daily task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDayNum() {
        return this.DayNum;
    }

    /**
     * Set Daily task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DayNum Daily task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDayNum(Long DayNum) {
        this.DayNum = DayNum;
    }

    /**
     * Get Hourly task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HourNum Hourly task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getHourNum() {
        return this.HourNum;
    }

    /**
     * Set Hourly task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HourNum Hourly task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHourNum(Long HourNum) {
        this.HourNum = HourNum;
    }

    /**
     * Get Minute Task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MinuteNum Minute Task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMinuteNum() {
        return this.MinuteNum;
    }

    /**
     * Set Minute Task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MinuteNum Minute Task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMinuteNum(Long MinuteNum) {
        this.MinuteNum = MinuteNum;
    }

    public ScreenTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenTaskInfo(ScreenTaskInfo source) {
        if (source.CountTag != null) {
            this.CountTag = new Long(source.CountTag);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RunningNum != null) {
            this.RunningNum = new Long(source.RunningNum);
        }
        if (source.StoppingNum != null) {
            this.StoppingNum = new Long(source.StoppingNum);
        }
        if (source.StoppedNum != null) {
            this.StoppedNum = new Long(source.StoppedNum);
        }
        if (source.FrozenNum != null) {
            this.FrozenNum = new Long(source.FrozenNum);
        }
        if (source.YearNum != null) {
            this.YearNum = new Long(source.YearNum);
        }
        if (source.MonthNum != null) {
            this.MonthNum = new Long(source.MonthNum);
        }
        if (source.WeekNum != null) {
            this.WeekNum = new Long(source.WeekNum);
        }
        if (source.DayNum != null) {
            this.DayNum = new Long(source.DayNum);
        }
        if (source.HourNum != null) {
            this.HourNum = new Long(source.HourNum);
        }
        if (source.MinuteNum != null) {
            this.MinuteNum = new Long(source.MinuteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountTag", this.CountTag);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RunningNum", this.RunningNum);
        this.setParamSimple(map, prefix + "StoppingNum", this.StoppingNum);
        this.setParamSimple(map, prefix + "StoppedNum", this.StoppedNum);
        this.setParamSimple(map, prefix + "FrozenNum", this.FrozenNum);
        this.setParamSimple(map, prefix + "YearNum", this.YearNum);
        this.setParamSimple(map, prefix + "MonthNum", this.MonthNum);
        this.setParamSimple(map, prefix + "WeekNum", this.WeekNum);
        this.setParamSimple(map, prefix + "DayNum", this.DayNum);
        this.setParamSimple(map, prefix + "HourNum", this.HourNum);
        this.setParamSimple(map, prefix + "MinuteNum", this.MinuteNum);

    }
}

