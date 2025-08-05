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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeSpotCheck extends AbstractModel {

    /**
    * Duration of each loop detection in the spot check policy, in seconds. Valid values:

 - Minimum value: 10.
 - Maximum value: 86400.

    */
    @SerializedName("CheckDuration")
    @Expose
    private Long CheckDuration;

    /**
    * Detection interval of the spot check policy, which indicates how long to wait before conducting the next detection after one detection is completed.
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * Duration for which the opening clip is skipped.
    */
    @SerializedName("SkipDuration")
    @Expose
    private Long SkipDuration;

    /**
    * Number of loops. When this field is empty or set to 0, the default behavior is to loop until the video ends.
    */
    @SerializedName("CirclesNumber")
    @Expose
    private Long CirclesNumber;

    /**
     * Get Duration of each loop detection in the spot check policy, in seconds. Valid values:

 - Minimum value: 10.
 - Maximum value: 86400.
 
     * @return CheckDuration Duration of each loop detection in the spot check policy, in seconds. Valid values:

 - Minimum value: 10.
 - Maximum value: 86400.

     */
    public Long getCheckDuration() {
        return this.CheckDuration;
    }

    /**
     * Set Duration of each loop detection in the spot check policy, in seconds. Valid values:

 - Minimum value: 10.
 - Maximum value: 86400.

     * @param CheckDuration Duration of each loop detection in the spot check policy, in seconds. Valid values:

 - Minimum value: 10.
 - Maximum value: 86400.

     */
    public void setCheckDuration(Long CheckDuration) {
        this.CheckDuration = CheckDuration;
    }

    /**
     * Get Detection interval of the spot check policy, which indicates how long to wait before conducting the next detection after one detection is completed. 
     * @return CheckInterval Detection interval of the spot check policy, which indicates how long to wait before conducting the next detection after one detection is completed.
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set Detection interval of the spot check policy, which indicates how long to wait before conducting the next detection after one detection is completed.
     * @param CheckInterval Detection interval of the spot check policy, which indicates how long to wait before conducting the next detection after one detection is completed.
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get Duration for which the opening clip is skipped. 
     * @return SkipDuration Duration for which the opening clip is skipped.
     */
    public Long getSkipDuration() {
        return this.SkipDuration;
    }

    /**
     * Set Duration for which the opening clip is skipped.
     * @param SkipDuration Duration for which the opening clip is skipped.
     */
    public void setSkipDuration(Long SkipDuration) {
        this.SkipDuration = SkipDuration;
    }

    /**
     * Get Number of loops. When this field is empty or set to 0, the default behavior is to loop until the video ends. 
     * @return CirclesNumber Number of loops. When this field is empty or set to 0, the default behavior is to loop until the video ends.
     */
    public Long getCirclesNumber() {
        return this.CirclesNumber;
    }

    /**
     * Set Number of loops. When this field is empty or set to 0, the default behavior is to loop until the video ends.
     * @param CirclesNumber Number of loops. When this field is empty or set to 0, the default behavior is to loop until the video ends.
     */
    public void setCirclesNumber(Long CirclesNumber) {
        this.CirclesNumber = CirclesNumber;
    }

    public TimeSpotCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeSpotCheck(TimeSpotCheck source) {
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

