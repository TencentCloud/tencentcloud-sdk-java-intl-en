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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetActiveDeviceCountRequest extends AbstractModel {

    /**
    * Query granularity. Valid values: 0: day, 1: week, 2: month. Default is day.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Start time. In seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time. In seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * device group, if not passed, query all
    */
    @SerializedName("DevGroup")
    @Expose
    private String DevGroup;

    /**
    * License type. If not passed, query all. 1: Tenant monthly payment, 2: Manufacturer monthly payment, 3: Permanent license.
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
     * Get Query granularity. Valid values: 0: day, 1: week, 2: month. Default is day. 
     * @return Period Query granularity. Valid values: 0: day, 1: week, 2: month. Default is day.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Query granularity. Valid values: 0: day, 1: week, 2: month. Default is day.
     * @param Period Query granularity. Valid values: 0: day, 1: week, 2: month. Default is day.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Start time. In seconds. 
     * @return StartTime Start time. In seconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. In seconds.
     * @param StartTime Start time. In seconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. In seconds. 
     * @return EndTime End time. In seconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. In seconds.
     * @param EndTime End time. In seconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get device group, if not passed, query all 
     * @return DevGroup device group, if not passed, query all
     */
    public String getDevGroup() {
        return this.DevGroup;
    }

    /**
     * Set device group, if not passed, query all
     * @param DevGroup device group, if not passed, query all
     */
    public void setDevGroup(String DevGroup) {
        this.DevGroup = DevGroup;
    }

    /**
     * Get License type. If not passed, query all. 1: Tenant monthly payment, 2: Manufacturer monthly payment, 3: Permanent license. 
     * @return LicenseType License type. If not passed, query all. 1: Tenant monthly payment, 2: Manufacturer monthly payment, 3: Permanent license.
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set License type. If not passed, query all. 1: Tenant monthly payment, 2: Manufacturer monthly payment, 3: Permanent license.
     * @param LicenseType License type. If not passed, query all. 1: Tenant monthly payment, 2: Manufacturer monthly payment, 3: Permanent license.
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    public GetActiveDeviceCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetActiveDeviceCountRequest(GetActiveDeviceCountRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DevGroup != null) {
            this.DevGroup = new String(source.DevGroup);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DevGroup", this.DevGroup);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

