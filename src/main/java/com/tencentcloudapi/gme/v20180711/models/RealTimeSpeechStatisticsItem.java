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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeSpeechStatisticsItem extends AbstractModel{

    /**
    * DAU in Mainland China
    */
    @SerializedName("MainLandDau")
    @Expose
    private Long MainLandDau;

    /**
    * PCU in Mainland China
    */
    @SerializedName("MainLandPcu")
    @Expose
    private Long MainLandPcu;

    /**
    * Total duration of use in Mainland China in minutes
    */
    @SerializedName("MainLandDuration")
    @Expose
    private Long MainLandDuration;

    /**
    * DAU outside Mainland China
    */
    @SerializedName("OverseaDau")
    @Expose
    private Long OverseaDau;

    /**
    * PCU outside Mainland China
    */
    @SerializedName("OverseaPcu")
    @Expose
    private Long OverseaPcu;

    /**
    * Total duration of use outside Mainland China in minutes
    */
    @SerializedName("OverseaDuration")
    @Expose
    private Long OverseaDuration;

    /**
     * Get DAU in Mainland China 
     * @return MainLandDau DAU in Mainland China
     */
    public Long getMainLandDau() {
        return this.MainLandDau;
    }

    /**
     * Set DAU in Mainland China
     * @param MainLandDau DAU in Mainland China
     */
    public void setMainLandDau(Long MainLandDau) {
        this.MainLandDau = MainLandDau;
    }

    /**
     * Get PCU in Mainland China 
     * @return MainLandPcu PCU in Mainland China
     */
    public Long getMainLandPcu() {
        return this.MainLandPcu;
    }

    /**
     * Set PCU in Mainland China
     * @param MainLandPcu PCU in Mainland China
     */
    public void setMainLandPcu(Long MainLandPcu) {
        this.MainLandPcu = MainLandPcu;
    }

    /**
     * Get Total duration of use in Mainland China in minutes 
     * @return MainLandDuration Total duration of use in Mainland China in minutes
     */
    public Long getMainLandDuration() {
        return this.MainLandDuration;
    }

    /**
     * Set Total duration of use in Mainland China in minutes
     * @param MainLandDuration Total duration of use in Mainland China in minutes
     */
    public void setMainLandDuration(Long MainLandDuration) {
        this.MainLandDuration = MainLandDuration;
    }

    /**
     * Get DAU outside Mainland China 
     * @return OverseaDau DAU outside Mainland China
     */
    public Long getOverseaDau() {
        return this.OverseaDau;
    }

    /**
     * Set DAU outside Mainland China
     * @param OverseaDau DAU outside Mainland China
     */
    public void setOverseaDau(Long OverseaDau) {
        this.OverseaDau = OverseaDau;
    }

    /**
     * Get PCU outside Mainland China 
     * @return OverseaPcu PCU outside Mainland China
     */
    public Long getOverseaPcu() {
        return this.OverseaPcu;
    }

    /**
     * Set PCU outside Mainland China
     * @param OverseaPcu PCU outside Mainland China
     */
    public void setOverseaPcu(Long OverseaPcu) {
        this.OverseaPcu = OverseaPcu;
    }

    /**
     * Get Total duration of use outside Mainland China in minutes 
     * @return OverseaDuration Total duration of use outside Mainland China in minutes
     */
    public Long getOverseaDuration() {
        return this.OverseaDuration;
    }

    /**
     * Set Total duration of use outside Mainland China in minutes
     * @param OverseaDuration Total duration of use outside Mainland China in minutes
     */
    public void setOverseaDuration(Long OverseaDuration) {
        this.OverseaDuration = OverseaDuration;
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

