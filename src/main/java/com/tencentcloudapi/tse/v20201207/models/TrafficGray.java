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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficGray extends AbstractModel {

    /**
    * Grayscale release rules for traffic, grayscale by ratio or preheat method
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Grayscale percentage value 1-100 by proportion
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Preheated interval
    */
    @SerializedName("IntervalSecond")
    @Expose
    private Long IntervalSecond;

    /**
    * Preheated curvature
    */
    @SerializedName("Curvature")
    @Expose
    private Long Curvature;

    /**
     * Get Grayscale release rules for traffic, grayscale by ratio or preheat method 
     * @return Mode Grayscale release rules for traffic, grayscale by ratio or preheat method
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Grayscale release rules for traffic, grayscale by ratio or preheat method
     * @param Mode Grayscale release rules for traffic, grayscale by ratio or preheat method
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Grayscale percentage value 1-100 by proportion 
     * @return Percent Grayscale percentage value 1-100 by proportion
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Grayscale percentage value 1-100 by proportion
     * @param Percent Grayscale percentage value 1-100 by proportion
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Preheated interval 
     * @return IntervalSecond Preheated interval
     */
    public Long getIntervalSecond() {
        return this.IntervalSecond;
    }

    /**
     * Set Preheated interval
     * @param IntervalSecond Preheated interval
     */
    public void setIntervalSecond(Long IntervalSecond) {
        this.IntervalSecond = IntervalSecond;
    }

    /**
     * Get Preheated curvature 
     * @return Curvature Preheated curvature
     */
    public Long getCurvature() {
        return this.Curvature;
    }

    /**
     * Set Preheated curvature
     * @param Curvature Preheated curvature
     */
    public void setCurvature(Long Curvature) {
        this.Curvature = Curvature;
    }

    public TrafficGray() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficGray(TrafficGray source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.IntervalSecond != null) {
            this.IntervalSecond = new Long(source.IntervalSecond);
        }
        if (source.Curvature != null) {
            this.Curvature = new Long(source.Curvature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "IntervalSecond", this.IntervalSecond);
        this.setParamSimple(map, prefix + "Curvature", this.Curvature);

    }
}

