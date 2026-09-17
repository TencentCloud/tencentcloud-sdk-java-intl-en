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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("Sampling")
    @Expose
    private String Sampling;

    /**
    * 
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return Sampling 
     */
    public String getSampling() {
        return this.Sampling;
    }

    /**
     * Set 
     * @param Sampling 
     */
    public void setSampling(String Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get  
     * @return IntervalTime 
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 
     * @param IntervalTime 
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return Threshold 
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 
     * @param Threshold 
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    public QualityInspectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectConfig(QualityInspectConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Sampling != null) {
            this.Sampling = new String(source.Sampling);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Sampling", this.Sampling);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

