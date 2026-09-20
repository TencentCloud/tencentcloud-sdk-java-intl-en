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

public class QualityInspectTimeSpotCheck extends AbstractModel {

    /**
    * <p>Duration of each loop detection.</p><p>Value range: [10, 86400]</p><p>Unit: seconds.</p>
    */
    @SerializedName("CheckDuration")
    @Expose
    private Long CheckDuration;

    /**
    * <p>Detection interval, in seconds. It indicates the duration after a detection is completed and before the next detection is conducted.</p><p>Value range: [10, 3600]</p><p>Unit: seconds.</p>
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * <p>Skipped opening duration.</p><p>Value range: [1, 1800]</p><p>Unit: seconds.</p>
    */
    @SerializedName("SkipDuration")
    @Expose
    private Long SkipDuration;

    /**
    * <p>Number of loops.</p><p>Value range: [0, 1000]</p>
    */
    @SerializedName("CirclesNumber")
    @Expose
    private Long CirclesNumber;

    /**
     * Get <p>Duration of each loop detection.</p><p>Value range: [10, 86400]</p><p>Unit: seconds.</p> 
     * @return CheckDuration <p>Duration of each loop detection.</p><p>Value range: [10, 86400]</p><p>Unit: seconds.</p>
     */
    public Long getCheckDuration() {
        return this.CheckDuration;
    }

    /**
     * Set <p>Duration of each loop detection.</p><p>Value range: [10, 86400]</p><p>Unit: seconds.</p>
     * @param CheckDuration <p>Duration of each loop detection.</p><p>Value range: [10, 86400]</p><p>Unit: seconds.</p>
     */
    public void setCheckDuration(Long CheckDuration) {
        this.CheckDuration = CheckDuration;
    }

    /**
     * Get <p>Detection interval, in seconds. It indicates the duration after a detection is completed and before the next detection is conducted.</p><p>Value range: [10, 3600]</p><p>Unit: seconds.</p> 
     * @return CheckInterval <p>Detection interval, in seconds. It indicates the duration after a detection is completed and before the next detection is conducted.</p><p>Value range: [10, 3600]</p><p>Unit: seconds.</p>
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set <p>Detection interval, in seconds. It indicates the duration after a detection is completed and before the next detection is conducted.</p><p>Value range: [10, 3600]</p><p>Unit: seconds.</p>
     * @param CheckInterval <p>Detection interval, in seconds. It indicates the duration after a detection is completed and before the next detection is conducted.</p><p>Value range: [10, 3600]</p><p>Unit: seconds.</p>
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get <p>Skipped opening duration.</p><p>Value range: [1, 1800]</p><p>Unit: seconds.</p> 
     * @return SkipDuration <p>Skipped opening duration.</p><p>Value range: [1, 1800]</p><p>Unit: seconds.</p>
     */
    public Long getSkipDuration() {
        return this.SkipDuration;
    }

    /**
     * Set <p>Skipped opening duration.</p><p>Value range: [1, 1800]</p><p>Unit: seconds.</p>
     * @param SkipDuration <p>Skipped opening duration.</p><p>Value range: [1, 1800]</p><p>Unit: seconds.</p>
     */
    public void setSkipDuration(Long SkipDuration) {
        this.SkipDuration = SkipDuration;
    }

    /**
     * Get <p>Number of loops.</p><p>Value range: [0, 1000]</p> 
     * @return CirclesNumber <p>Number of loops.</p><p>Value range: [0, 1000]</p>
     */
    public Long getCirclesNumber() {
        return this.CirclesNumber;
    }

    /**
     * Set <p>Number of loops.</p><p>Value range: [0, 1000]</p>
     * @param CirclesNumber <p>Number of loops.</p><p>Value range: [0, 1000]</p>
     */
    public void setCirclesNumber(Long CirclesNumber) {
        this.CirclesNumber = CirclesNumber;
    }

    public QualityInspectTimeSpotCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTimeSpotCheck(QualityInspectTimeSpotCheck source) {
        if (source.CheckDuration != null) {
            this.CheckDuration = new Long(source.CheckDuration);
        }
        if (source.CheckInterval != null) {
            this.CheckInterval = new Long(source.CheckInterval);
        }
        if (source.SkipDuration != null) {
            this.SkipDuration = new Long(source.SkipDuration);
        }
        if (source.CirclesNumber != null) {
            this.CirclesNumber = new Long(source.CirclesNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckDuration", this.CheckDuration);
        this.setParamSimple(map, prefix + "CheckInterval", this.CheckInterval);
        this.setParamSimple(map, prefix + "SkipDuration", this.SkipDuration);
        this.setParamSimple(map, prefix + "CirclesNumber", this.CirclesNumber);

    }
}

