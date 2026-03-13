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

public class CreateAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * Snapshot repeat time point. value range: 0-23 hr.
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Policy name, limited to 64 characters, only supports input of chinese, letters, numbers, _, or -.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Snapshot repeat date, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * Specifies the snapshot retention duration in days. the default value is 0 (permanent).
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * Snapshot monthly recurrence, select a day from the 1st to the 31st of each month, and a snapshot will be automatically created on that day. for example, 1 represents the 1st. choose one of the three: DayOfWeek, IntervalDays.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * Interval days. choose one of the three with DayOfWeek and DayOfMonth.
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
    * Snapshot policy tag.
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
     * Get Snapshot repeat time point. value range: 0-23 hr. 
     * @return Hour Snapshot repeat time point. value range: 0-23 hr.
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set Snapshot repeat time point. value range: 0-23 hr.
     * @param Hour Snapshot repeat time point. value range: 0-23 hr.
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Policy name, limited to 64 characters, only supports input of chinese, letters, numbers, _, or -. 
     * @return PolicyName Policy name, limited to 64 characters, only supports input of chinese, letters, numbers, _, or -.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name, limited to 64 characters, only supports input of chinese, letters, numbers, _, or -.
     * @param PolicyName Policy name, limited to 64 characters, only supports input of chinese, letters, numbers, _, or -.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Snapshot repeat date, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays. 
     * @return DayOfWeek Snapshot repeat date, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set Snapshot repeat date, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
     * @param DayOfWeek Snapshot repeat date, monday to sunday. 1 represents monday, 7 represents sunday. choose one from three: DayOfMonth, IntervalDays.
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get Specifies the snapshot retention duration in days. the default value is 0 (permanent). 
     * @return AliveDays Specifies the snapshot retention duration in days. the default value is 0 (permanent).
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set Specifies the snapshot retention duration in days. the default value is 0 (permanent).
     * @param AliveDays Specifies the snapshot retention duration in days. the default value is 0 (permanent).
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get Snapshot monthly recurrence, select a day from the 1st to the 31st of each month, and a snapshot will be automatically created on that day. for example, 1 represents the 1st. choose one of the three: DayOfWeek, IntervalDays. 
     * @return DayOfMonth Snapshot monthly recurrence, select a day from the 1st to the 31st of each month, and a snapshot will be automatically created on that day. for example, 1 represents the 1st. choose one of the three: DayOfWeek, IntervalDays.
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set Snapshot monthly recurrence, select a day from the 1st to the 31st of each month, and a snapshot will be automatically created on that day. for example, 1 represents the 1st. choose one of the three: DayOfWeek, IntervalDays.
     * @param DayOfMonth Snapshot monthly recurrence, select a day from the 1st to the 31st of each month, and a snapshot will be automatically created on that day. for example, 1 represents the 1st. choose one of the three: DayOfWeek, IntervalDays.
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get Interval days. choose one of the three with DayOfWeek and DayOfMonth. 
     * @return IntervalDays Interval days. choose one of the three with DayOfWeek and DayOfMonth.
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set Interval days. choose one of the three with DayOfWeek and DayOfMonth.
     * @param IntervalDays Interval days. choose one of the three with DayOfWeek and DayOfMonth.
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    /**
     * Get Snapshot policy tag. 
     * @return ResourceTags Snapshot policy tag.
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Snapshot policy tag.
     * @param ResourceTags Snapshot policy tag.
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
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
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

