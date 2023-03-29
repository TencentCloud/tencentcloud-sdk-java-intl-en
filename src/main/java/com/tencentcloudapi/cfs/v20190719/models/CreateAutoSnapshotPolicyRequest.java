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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoSnapshotPolicyRequest extends AbstractModel{

    /**
    * The time point when to repeat the snapshot operation
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * The day of the week on which to repeat the snapshot operation
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * Snapshot retention period
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * The specific day (day 1 to day 31) of the month on which to create a snapshot.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * The snapshot interval, in days.
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get The time point when to repeat the snapshot operation 
     * @return Hour The time point when to repeat the snapshot operation
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set The time point when to repeat the snapshot operation
     * @param Hour The time point when to repeat the snapshot operation
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get The day of the week on which to repeat the snapshot operation 
     * @return DayOfWeek The day of the week on which to repeat the snapshot operation
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set The day of the week on which to repeat the snapshot operation
     * @param DayOfWeek The day of the week on which to repeat the snapshot operation
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get Snapshot retention period 
     * @return AliveDays Snapshot retention period
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set Snapshot retention period
     * @param AliveDays Snapshot retention period
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get The specific day (day 1 to day 31) of the month on which to create a snapshot. 
     * @return DayOfMonth The specific day (day 1 to day 31) of the month on which to create a snapshot.
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set The specific day (day 1 to day 31) of the month on which to create a snapshot.
     * @param DayOfMonth The specific day (day 1 to day 31) of the month on which to create a snapshot.
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get The snapshot interval, in days. 
     * @return IntervalDays The snapshot interval, in days.
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set The snapshot interval, in days.
     * @param IntervalDays The snapshot interval, in days.
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public CreateAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoSnapshotPolicyRequest(CreateAutoSnapshotPolicyRequest source) {
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.IntervalDays != null) {
            this.IntervalDays = new Long(source.IntervalDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

