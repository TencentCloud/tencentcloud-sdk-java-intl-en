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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeSpeechStatisticsItem extends AbstractModel {

    /**
    * DAUs in the Chinese mainland
    */
    @SerializedName("MainLandDau")
    @Expose
    private Long MainLandDau;

    /**
    * PCUs in the Chinese mainland
    */
    @SerializedName("MainLandPcu")
    @Expose
    private Long MainLandPcu;

    /**
    * Total duration of use in the Chinese mainland (in minutes)
    */
    @SerializedName("MainLandDuration")
    @Expose
    private Long MainLandDuration;

    /**
    * DAUs outside the Chinese mainland
    */
    @SerializedName("OverseaDau")
    @Expose
    private Long OverseaDau;

    /**
    * PCUs outside the Chinese mainland
    */
    @SerializedName("OverseaPcu")
    @Expose
    private Long OverseaPcu;

    /**
    * Total duration of use outside the Chinese mainland (in minutes)
    */
    @SerializedName("OverseaDuration")
    @Expose
    private Long OverseaDuration;

    /**
     * Get DAUs in the Chinese mainland 
     * @return MainLandDau DAUs in the Chinese mainland
     */
    public Long getMainLandDau() {
        return this.MainLandDau;
    }

    /**
     * Set DAUs in the Chinese mainland
     * @param MainLandDau DAUs in the Chinese mainland
     */
    public void setMainLandDau(Long MainLandDau) {
        this.MainLandDau = MainLandDau;
    }

    /**
     * Get PCUs in the Chinese mainland 
     * @return MainLandPcu PCUs in the Chinese mainland
     */
    public Long getMainLandPcu() {
        return this.MainLandPcu;
    }

    /**
     * Set PCUs in the Chinese mainland
     * @param MainLandPcu PCUs in the Chinese mainland
     */
    public void setMainLandPcu(Long MainLandPcu) {
        this.MainLandPcu = MainLandPcu;
    }

    /**
     * Get Total duration of use in the Chinese mainland (in minutes) 
     * @return MainLandDuration Total duration of use in the Chinese mainland (in minutes)
     */
    public Long getMainLandDuration() {
        return this.MainLandDuration;
    }

    /**
     * Set Total duration of use in the Chinese mainland (in minutes)
     * @param MainLandDuration Total duration of use in the Chinese mainland (in minutes)
     */
    public void setMainLandDuration(Long MainLandDuration) {
        this.MainLandDuration = MainLandDuration;
    }

    /**
     * Get DAUs outside the Chinese mainland 
     * @return OverseaDau DAUs outside the Chinese mainland
     */
    public Long getOverseaDau() {
        return this.OverseaDau;
    }

    /**
     * Set DAUs outside the Chinese mainland
     * @param OverseaDau DAUs outside the Chinese mainland
     */
    public void setOverseaDau(Long OverseaDau) {
        this.OverseaDau = OverseaDau;
    }

    /**
     * Get PCUs outside the Chinese mainland 
     * @return OverseaPcu PCUs outside the Chinese mainland
     */
    public Long getOverseaPcu() {
        return this.OverseaPcu;
    }

    /**
     * Set PCUs outside the Chinese mainland
     * @param OverseaPcu PCUs outside the Chinese mainland
     */
    public void setOverseaPcu(Long OverseaPcu) {
        this.OverseaPcu = OverseaPcu;
    }

    /**
     * Get Total duration of use outside the Chinese mainland (in minutes) 
     * @return OverseaDuration Total duration of use outside the Chinese mainland (in minutes)
     */
    public Long getOverseaDuration() {
        return this.OverseaDuration;
    }

    /**
     * Set Total duration of use outside the Chinese mainland (in minutes)
     * @param OverseaDuration Total duration of use outside the Chinese mainland (in minutes)
     */
    public void setOverseaDuration(Long OverseaDuration) {
        this.OverseaDuration = OverseaDuration;
    }

    public RealTimeSpeechStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealTimeSpeechStatisticsItem(RealTimeSpeechStatisticsItem source) {
        if (source.MainLandDau != null) {
            this.MainLandDau = new Long(source.MainLandDau);
        }
        if (source.MainLandPcu != null) {
            this.MainLandPcu = new Long(source.MainLandPcu);
        }
        if (source.MainLandDuration != null) {
            this.MainLandDuration = new Long(source.MainLandDuration);
        }
        if (source.OverseaDau != null) {
            this.OverseaDau = new Long(source.OverseaDau);
        }
        if (source.OverseaPcu != null) {
            this.OverseaPcu = new Long(source.OverseaPcu);
        }
        if (source.OverseaDuration != null) {
            this.OverseaDuration = new Long(source.OverseaDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainLandDau", this.MainLandDau);
        this.setParamSimple(map, prefix + "MainLandPcu", this.MainLandPcu);
        this.setParamSimple(map, prefix + "MainLandDuration", this.MainLandDuration);
        this.setParamSimple(map, prefix + "OverseaDau", this.OverseaDau);
        this.setParamSimple(map, prefix + "OverseaPcu", this.OverseaPcu);
        this.setParamSimple(map, prefix + "OverseaDuration", this.OverseaDuration);

    }
}

