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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftBillData extends AbstractModel{

    /**
    * The push domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The time-shift video length (minutes).
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * The time-shift days.
    */
    @SerializedName("StoragePeriod")
    @Expose
    private Float StoragePeriod;

    /**
    * The time for the data returned. Format: YYYY-MM-DDThh:mm:ssZ.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 
    */
    @SerializedName("TotalDuration")
    @Expose
    private Float TotalDuration;

    /**
     * Get The push domain name. 
     * @return Domain The push domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The push domain name.
     * @param Domain The push domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The time-shift video length (minutes). 
     * @return Duration The time-shift video length (minutes).
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set The time-shift video length (minutes).
     * @param Duration The time-shift video length (minutes).
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The time-shift days. 
     * @return StoragePeriod The time-shift days.
     */
    public Float getStoragePeriod() {
        return this.StoragePeriod;
    }

    /**
     * Set The time-shift days.
     * @param StoragePeriod The time-shift days.
     */
    public void setStoragePeriod(Float StoragePeriod) {
        this.StoragePeriod = StoragePeriod;
    }

    /**
     * Get The time for the data returned. Format: YYYY-MM-DDThh:mm:ssZ. 
     * @return Time The time for the data returned. Format: YYYY-MM-DDThh:mm:ssZ.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set The time for the data returned. Format: YYYY-MM-DDThh:mm:ssZ.
     * @param Time The time for the data returned. Format: YYYY-MM-DDThh:mm:ssZ.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get  
     * @return TotalDuration 
     */
    public Float getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 
     * @param TotalDuration 
     */
    public void setTotalDuration(Float TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    public TimeShiftBillData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftBillData(TimeShiftBillData source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.StoragePeriod != null) {
            this.StoragePeriod = new Float(source.StoragePeriod);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Float(source.TotalDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StoragePeriod", this.StoragePeriod);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);

    }
}

