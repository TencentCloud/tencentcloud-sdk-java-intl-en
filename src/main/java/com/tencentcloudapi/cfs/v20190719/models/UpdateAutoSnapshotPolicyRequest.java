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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * Snapshot policy name, no more than 64 characters.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Snapshot periodic backup, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
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
    * Snapshot retention days.
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * Whether the periodic snapshot function is activated; 1 indicates activate, 0 indicates inactive.
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

    /**
    * Scheduled snapshot creates a snapshot on the day of the month. this parameter is used in combination with DayOfWeek and IntervalDays. choose one of the three.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * Periodically execute snapshots at interval days. this parameter is used in combination with DayOfWeek and DayOfMonth. choose one of the three.
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api. 
     * @return AutoSnapshotPolicyId Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
     * @param AutoSnapshotPolicyId Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get Snapshot policy name, no more than 64 characters. 
     * @return PolicyName Snapshot policy name, no more than 64 characters.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Snapshot policy name, no more than 64 characters.
     * @param PolicyName Snapshot policy name, no more than 64 characters.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Snapshot periodic backup, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays. 
     * @return DayOfWeek Snapshot periodic backup, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set Snapshot periodic backup, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
     * @param DayOfWeek Snapshot periodic backup, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
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
     * Get Snapshot retention days. 
     * @return AliveDays Snapshot retention days.
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set Snapshot retention days.
     * @param AliveDays Snapshot retention days.
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get Whether the periodic snapshot function is activated; 1 indicates activate, 0 indicates inactive. 
     * @return IsActivated Whether the periodic snapshot function is activated; 1 indicates activate, 0 indicates inactive.
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set Whether the periodic snapshot function is activated; 1 indicates activate, 0 indicates inactive.
     * @param IsActivated Whether the periodic snapshot function is activated; 1 indicates activate, 0 indicates inactive.
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get Scheduled snapshot creates a snapshot on the day of the month. this parameter is used in combination with DayOfWeek and IntervalDays. choose one of the three. 
     * @return DayOfMonth Scheduled snapshot creates a snapshot on the day of the month. this parameter is used in combination with DayOfWeek and IntervalDays. choose one of the three.
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set Scheduled snapshot creates a snapshot on the day of the month. this parameter is used in combination with DayOfWeek and IntervalDays. choose one of the three.
     * @param DayOfMonth Scheduled snapshot creates a snapshot on the day of the month. this parameter is used in combination with DayOfWeek and IntervalDays. choose one of the three.
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get Periodically execute snapshots at interval days. this parameter is used in combination with DayOfWeek and DayOfMonth. choose one of the three. 
     * @return IntervalDays Periodically execute snapshots at interval days. this parameter is used in combination with DayOfWeek and DayOfMonth. choose one of the three.
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set Periodically execute snapshots at interval days. this parameter is used in combination with DayOfWeek and DayOfMonth. choose one of the three.
     * @param IntervalDays Periodically execute snapshots at interval days. this parameter is used in combination with DayOfWeek and DayOfMonth. choose one of the three.
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

