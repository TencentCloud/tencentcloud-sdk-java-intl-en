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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * Device id.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Number of bound licenses.
    */
    @SerializedName("LicenseCount")
    @Expose
    private Long LicenseCount;

    /**
    * Remaining days: days.
    */
    @SerializedName("RemainDay")
    @Expose
    private Long RemainDay;

    /**
    * Expiration time: s.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Service duration: s.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * List of bound license ids.
    */
    @SerializedName("LicenseIds")
    @Expose
    private String [] LicenseIds;

    /**
    * Monthly license duration limit.
    */
    @SerializedName("MonthlyRemainTime")
    @Expose
    private Long MonthlyRemainTime;

    /**
    * Monthly maximum duration (minutes).
    */
    @SerializedName("LimitedTime")
    @Expose
    private Long LimitedTime;

    /**
     * Get Device id. 
     * @return DeviceId Device id.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device id.
     * @param DeviceId Device id.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Number of bound licenses. 
     * @return LicenseCount Number of bound licenses.
     */
    public Long getLicenseCount() {
        return this.LicenseCount;
    }

    /**
     * Set Number of bound licenses.
     * @param LicenseCount Number of bound licenses.
     */
    public void setLicenseCount(Long LicenseCount) {
        this.LicenseCount = LicenseCount;
    }

    /**
     * Get Remaining days: days. 
     * @return RemainDay Remaining days: days.
     */
    public Long getRemainDay() {
        return this.RemainDay;
    }

    /**
     * Set Remaining days: days.
     * @param RemainDay Remaining days: days.
     */
    public void setRemainDay(Long RemainDay) {
        this.RemainDay = RemainDay;
    }

    /**
     * Get Expiration time: s. 
     * @return ExpireTime Expiration time: s.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time: s.
     * @param ExpireTime Expiration time: s.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Service duration: s. 
     * @return Duration Service duration: s.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Service duration: s.
     * @param Duration Service duration: s.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get List of bound license ids. 
     * @return LicenseIds List of bound license ids.
     */
    public String [] getLicenseIds() {
        return this.LicenseIds;
    }

    /**
     * Set List of bound license ids.
     * @param LicenseIds List of bound license ids.
     */
    public void setLicenseIds(String [] LicenseIds) {
        this.LicenseIds = LicenseIds;
    }

    /**
     * Get Monthly license duration limit. 
     * @return MonthlyRemainTime Monthly license duration limit.
     */
    public Long getMonthlyRemainTime() {
        return this.MonthlyRemainTime;
    }

    /**
     * Set Monthly license duration limit.
     * @param MonthlyRemainTime Monthly license duration limit.
     */
    public void setMonthlyRemainTime(Long MonthlyRemainTime) {
        this.MonthlyRemainTime = MonthlyRemainTime;
    }

    /**
     * Get Monthly maximum duration (minutes). 
     * @return LimitedTime Monthly maximum duration (minutes).
     */
    public Long getLimitedTime() {
        return this.LimitedTime;
    }

    /**
     * Set Monthly maximum duration (minutes).
     * @param LimitedTime Monthly maximum duration (minutes).
     */
    public void setLimitedTime(Long LimitedTime) {
        this.LimitedTime = LimitedTime;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.LicenseCount != null) {
            this.LicenseCount = new Long(source.LicenseCount);
        }
        if (source.RemainDay != null) {
            this.RemainDay = new Long(source.RemainDay);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.LicenseIds != null) {
            this.LicenseIds = new String[source.LicenseIds.length];
            for (int i = 0; i < source.LicenseIds.length; i++) {
                this.LicenseIds[i] = new String(source.LicenseIds[i]);
            }
        }
        if (source.MonthlyRemainTime != null) {
            this.MonthlyRemainTime = new Long(source.MonthlyRemainTime);
        }
        if (source.LimitedTime != null) {
            this.LimitedTime = new Long(source.LimitedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "LicenseCount", this.LicenseCount);
        this.setParamSimple(map, prefix + "RemainDay", this.RemainDay);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "LicenseIds.", this.LicenseIds);
        this.setParamSimple(map, prefix + "MonthlyRemainTime", this.MonthlyRemainTime);
        this.setParamSimple(map, prefix + "LimitedTime", this.LimitedTime);

    }
}

