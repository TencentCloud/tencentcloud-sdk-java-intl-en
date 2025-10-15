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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectInstanceStatisticsAlarmInfo extends AbstractModel {

    /**
    * Alarm type

projectFailureInstanceUpwardFluctuationAlarm: specifies the upward fluctuation alert for failed instances.

projectSuccessInstanceDownwardFluctuationAlarm: specifies the downward fluctuation alert for successful instances.
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * Alarm threshold for the downward fluctuation ratio of the number of successful instances.
Alarm threshold for the upward fluctuation ratio of the number of failed instances.
    */
    @SerializedName("InstanceThresholdCountPercent")
    @Expose
    private Long InstanceThresholdCountPercent;

    /**
    * Cumulative instance number fluctuation threshold.
    */
    @SerializedName("InstanceThresholdCount")
    @Expose
    private Long InstanceThresholdCount;

    /**
    * Stability threshold count (debounce configuration statistical cycle count).
    */
    @SerializedName("StabilizeThreshold")
    @Expose
    private Long StabilizeThreshold;

    /**
    * Stability statistical cycle (anti-shake configuration statistical cycle count).
    */
    @SerializedName("StabilizeStatisticsCycle")
    @Expose
    private Long StabilizeStatisticsCycle;

    /**
    * Specifies whether to use cumulative calculation. valid values: false (consecutive), true (cumulative).
    */
    @SerializedName("IsCumulant")
    @Expose
    private Boolean IsCumulant;

    /**
    * Cumulative number of instances for the current day.
Specifies the downward fluctuation of failed instance count on the day.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get Alarm type

projectFailureInstanceUpwardFluctuationAlarm: specifies the upward fluctuation alert for failed instances.

projectSuccessInstanceDownwardFluctuationAlarm: specifies the downward fluctuation alert for successful instances. 
     * @return AlarmType Alarm type

projectFailureInstanceUpwardFluctuationAlarm: specifies the upward fluctuation alert for failed instances.

projectSuccessInstanceDownwardFluctuationAlarm: specifies the downward fluctuation alert for successful instances.
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm type

projectFailureInstanceUpwardFluctuationAlarm: specifies the upward fluctuation alert for failed instances.

projectSuccessInstanceDownwardFluctuationAlarm: specifies the downward fluctuation alert for successful instances.
     * @param AlarmType Alarm type

projectFailureInstanceUpwardFluctuationAlarm: specifies the upward fluctuation alert for failed instances.

projectSuccessInstanceDownwardFluctuationAlarm: specifies the downward fluctuation alert for successful instances.
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Alarm threshold for the downward fluctuation ratio of the number of successful instances.
Alarm threshold for the upward fluctuation ratio of the number of failed instances. 
     * @return InstanceThresholdCountPercent Alarm threshold for the downward fluctuation ratio of the number of successful instances.
Alarm threshold for the upward fluctuation ratio of the number of failed instances.
     */
    public Long getInstanceThresholdCountPercent() {
        return this.InstanceThresholdCountPercent;
    }

    /**
     * Set Alarm threshold for the downward fluctuation ratio of the number of successful instances.
Alarm threshold for the upward fluctuation ratio of the number of failed instances.
     * @param InstanceThresholdCountPercent Alarm threshold for the downward fluctuation ratio of the number of successful instances.
Alarm threshold for the upward fluctuation ratio of the number of failed instances.
     */
    public void setInstanceThresholdCountPercent(Long InstanceThresholdCountPercent) {
        this.InstanceThresholdCountPercent = InstanceThresholdCountPercent;
    }

    /**
     * Get Cumulative instance number fluctuation threshold. 
     * @return InstanceThresholdCount Cumulative instance number fluctuation threshold.
     */
    public Long getInstanceThresholdCount() {
        return this.InstanceThresholdCount;
    }

    /**
     * Set Cumulative instance number fluctuation threshold.
     * @param InstanceThresholdCount Cumulative instance number fluctuation threshold.
     */
    public void setInstanceThresholdCount(Long InstanceThresholdCount) {
        this.InstanceThresholdCount = InstanceThresholdCount;
    }

    /**
     * Get Stability threshold count (debounce configuration statistical cycle count). 
     * @return StabilizeThreshold Stability threshold count (debounce configuration statistical cycle count).
     */
    public Long getStabilizeThreshold() {
        return this.StabilizeThreshold;
    }

    /**
     * Set Stability threshold count (debounce configuration statistical cycle count).
     * @param StabilizeThreshold Stability threshold count (debounce configuration statistical cycle count).
     */
    public void setStabilizeThreshold(Long StabilizeThreshold) {
        this.StabilizeThreshold = StabilizeThreshold;
    }

    /**
     * Get Stability statistical cycle (anti-shake configuration statistical cycle count). 
     * @return StabilizeStatisticsCycle Stability statistical cycle (anti-shake configuration statistical cycle count).
     */
    public Long getStabilizeStatisticsCycle() {
        return this.StabilizeStatisticsCycle;
    }

    /**
     * Set Stability statistical cycle (anti-shake configuration statistical cycle count).
     * @param StabilizeStatisticsCycle Stability statistical cycle (anti-shake configuration statistical cycle count).
     */
    public void setStabilizeStatisticsCycle(Long StabilizeStatisticsCycle) {
        this.StabilizeStatisticsCycle = StabilizeStatisticsCycle;
    }

    /**
     * Get Specifies whether to use cumulative calculation. valid values: false (consecutive), true (cumulative). 
     * @return IsCumulant Specifies whether to use cumulative calculation. valid values: false (consecutive), true (cumulative).
     */
    public Boolean getIsCumulant() {
        return this.IsCumulant;
    }

    /**
     * Set Specifies whether to use cumulative calculation. valid values: false (consecutive), true (cumulative).
     * @param IsCumulant Specifies whether to use cumulative calculation. valid values: false (consecutive), true (cumulative).
     */
    public void setIsCumulant(Boolean IsCumulant) {
        this.IsCumulant = IsCumulant;
    }

    /**
     * Get Cumulative number of instances for the current day.
Specifies the downward fluctuation of failed instance count on the day. 
     * @return InstanceCount Cumulative number of instances for the current day.
Specifies the downward fluctuation of failed instance count on the day.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Cumulative number of instances for the current day.
Specifies the downward fluctuation of failed instance count on the day.
     * @param InstanceCount Cumulative number of instances for the current day.
Specifies the downward fluctuation of failed instance count on the day.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    public ProjectInstanceStatisticsAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectInstanceStatisticsAlarmInfo(ProjectInstanceStatisticsAlarmInfo source) {
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.InstanceThresholdCountPercent != null) {
            this.InstanceThresholdCountPercent = new Long(source.InstanceThresholdCountPercent);
        }
        if (source.InstanceThresholdCount != null) {
            this.InstanceThresholdCount = new Long(source.InstanceThresholdCount);
        }
        if (source.StabilizeThreshold != null) {
            this.StabilizeThreshold = new Long(source.StabilizeThreshold);
        }
        if (source.StabilizeStatisticsCycle != null) {
            this.StabilizeStatisticsCycle = new Long(source.StabilizeStatisticsCycle);
        }
        if (source.IsCumulant != null) {
            this.IsCumulant = new Boolean(source.IsCumulant);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "InstanceThresholdCountPercent", this.InstanceThresholdCountPercent);
        this.setParamSimple(map, prefix + "InstanceThresholdCount", this.InstanceThresholdCount);
        this.setParamSimple(map, prefix + "StabilizeThreshold", this.StabilizeThreshold);
        this.setParamSimple(map, prefix + "StabilizeStatisticsCycle", this.StabilizeStatisticsCycle);
        this.setParamSimple(map, prefix + "IsCumulant", this.IsCumulant);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}

