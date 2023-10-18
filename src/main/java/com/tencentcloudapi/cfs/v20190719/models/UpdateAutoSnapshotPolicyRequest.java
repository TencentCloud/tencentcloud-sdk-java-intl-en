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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * Snapshot policy ID
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * Snapshot policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * The day of the week on which to regularly back up the snapshot
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * The hour of a day at which to regularly back up the snapshot
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Snapshot retention period
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * Whether to activate the scheduled snapshot feature
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

    /**
    * The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek`.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * The snapshot interval. This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get Snapshot policy ID 
     * @return AutoSnapshotPolicyId Snapshot policy ID
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Snapshot policy ID
     * @param AutoSnapshotPolicyId Snapshot policy ID
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get Snapshot policy name 
     * @return PolicyName Snapshot policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Snapshot policy name
     * @param PolicyName Snapshot policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get The day of the week on which to regularly back up the snapshot 
     * @return DayOfWeek The day of the week on which to regularly back up the snapshot
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set The day of the week on which to regularly back up the snapshot
     * @param DayOfWeek The day of the week on which to regularly back up the snapshot
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get The hour of a day at which to regularly back up the snapshot 
     * @return Hour The hour of a day at which to regularly back up the snapshot
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set The hour of a day at which to regularly back up the snapshot
     * @param Hour The hour of a day at which to regularly back up the snapshot
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
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
     * Get Whether to activate the scheduled snapshot feature 
     * @return IsActivated Whether to activate the scheduled snapshot feature
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set Whether to activate the scheduled snapshot feature
     * @param IsActivated Whether to activate the scheduled snapshot feature
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek`. 
     * @return DayOfMonth The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek`.
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek`.
     * @param DayOfMonth The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek`.
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get The snapshot interval. This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`. 
     * @return IntervalDays The snapshot interval. This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set The snapshot interval. This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
     * @param IntervalDays The snapshot interval. This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public UpdateAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAutoSnapshotPolicyRequest(UpdateAutoSnapshotPolicyRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Long(source.IsActivated);
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
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

