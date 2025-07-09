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

public class License extends AbstractModel {

    /**
    * The number of licenses of this type.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * License status. 0: unbound; 1: bound; 2: service suspension; 3: refund.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Expiration timestamp: s.
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
    * Remaining days: days.
    */
    @SerializedName("RemainDay")
    @Expose
    private Long RemainDay;

    /**
    * The list of license ids of this type.
    */
    @SerializedName("LicenseIds")
    @Expose
    private String [] LicenseIds;

    /**
     * Get The number of licenses of this type. 
     * @return Count The number of licenses of this type.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of licenses of this type.
     * @param Count The number of licenses of this type.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get License status. 0: unbound; 1: bound; 2: service suspension; 3: refund. 
     * @return Status License status. 0: unbound; 1: bound; 2: service suspension; 3: refund.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set License status. 0: unbound; 1: bound; 2: service suspension; 3: refund.
     * @param Status License status. 0: unbound; 1: bound; 2: service suspension; 3: refund.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Expiration timestamp: s. 
     * @return ExpireTime Expiration timestamp: s.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration timestamp: s.
     * @param ExpireTime Expiration timestamp: s.
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
     * Get The list of license ids of this type. 
     * @return LicenseIds The list of license ids of this type.
     */
    public String [] getLicenseIds() {
        return this.LicenseIds;
    }

    /**
     * Set The list of license ids of this type.
     * @param LicenseIds The list of license ids of this type.
     */
    public void setLicenseIds(String [] LicenseIds) {
        this.LicenseIds = LicenseIds;
    }

    public License() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public License(License source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.RemainDay != null) {
            this.RemainDay = new Long(source.RemainDay);
        }
        if (source.LicenseIds != null) {
            this.LicenseIds = new String[source.LicenseIds.length];
            for (int i = 0; i < source.LicenseIds.length; i++) {
                this.LicenseIds[i] = new String(source.LicenseIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RemainDay", this.RemainDay);
        this.setParamArraySimple(map, prefix + "LicenseIds.", this.LicenseIds);

    }
}

