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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashManifestInfo extends AbstractModel {

    /**
    * The total duration of each manifest in seconds. [30, 3600], type: integer, default value 60.
    */
    @SerializedName("Windows")
    @Expose
    private Long Windows;

    /**
    * The minimum cache time (in seconds) that the player keeps in the buffer. [2, 60], type: integer, default value 30.
    */
    @SerializedName("MinBufferTime")
    @Expose
    private Long MinBufferTime;

    /**
    * The minimum time (in seconds) that the player should wait before requesting an update to the manifest. [2, 60], type: integer, default value 2.
    */
    @SerializedName("MinUpdatePeriod")
    @Expose
    private Long MinUpdatePeriod;

    /**
    * The time from the latest live broadcast time point when the player starts broadcasting is a rollback amount (in seconds). [2, 60], type: integer, default value 10.
    */
    @SerializedName("SuggestedPresentationDelay")
    @Expose
    private Long SuggestedPresentationDelay;

    /**
     * Get The total duration of each manifest in seconds. [30, 3600], type: integer, default value 60. 
     * @return Windows The total duration of each manifest in seconds. [30, 3600], type: integer, default value 60.
     */
    public Long getWindows() {
        return this.Windows;
    }

    /**
     * Set The total duration of each manifest in seconds. [30, 3600], type: integer, default value 60.
     * @param Windows The total duration of each manifest in seconds. [30, 3600], type: integer, default value 60.
     */
    public void setWindows(Long Windows) {
        this.Windows = Windows;
    }

    /**
     * Get The minimum cache time (in seconds) that the player keeps in the buffer. [2, 60], type: integer, default value 30. 
     * @return MinBufferTime The minimum cache time (in seconds) that the player keeps in the buffer. [2, 60], type: integer, default value 30.
     */
    public Long getMinBufferTime() {
        return this.MinBufferTime;
    }

    /**
     * Set The minimum cache time (in seconds) that the player keeps in the buffer. [2, 60], type: integer, default value 30.
     * @param MinBufferTime The minimum cache time (in seconds) that the player keeps in the buffer. [2, 60], type: integer, default value 30.
     */
    public void setMinBufferTime(Long MinBufferTime) {
        this.MinBufferTime = MinBufferTime;
    }

    /**
     * Get The minimum time (in seconds) that the player should wait before requesting an update to the manifest. [2, 60], type: integer, default value 2. 
     * @return MinUpdatePeriod The minimum time (in seconds) that the player should wait before requesting an update to the manifest. [2, 60], type: integer, default value 2.
     */
    public Long getMinUpdatePeriod() {
        return this.MinUpdatePeriod;
    }

    /**
     * Set The minimum time (in seconds) that the player should wait before requesting an update to the manifest. [2, 60], type: integer, default value 2.
     * @param MinUpdatePeriod The minimum time (in seconds) that the player should wait before requesting an update to the manifest. [2, 60], type: integer, default value 2.
     */
    public void setMinUpdatePeriod(Long MinUpdatePeriod) {
        this.MinUpdatePeriod = MinUpdatePeriod;
    }

    /**
     * Get The time from the latest live broadcast time point when the player starts broadcasting is a rollback amount (in seconds). [2, 60], type: integer, default value 10. 
     * @return SuggestedPresentationDelay The time from the latest live broadcast time point when the player starts broadcasting is a rollback amount (in seconds). [2, 60], type: integer, default value 10.
     */
    public Long getSuggestedPresentationDelay() {
        return this.SuggestedPresentationDelay;
    }

    /**
     * Set The time from the latest live broadcast time point when the player starts broadcasting is a rollback amount (in seconds). [2, 60], type: integer, default value 10.
     * @param SuggestedPresentationDelay The time from the latest live broadcast time point when the player starts broadcasting is a rollback amount (in seconds). [2, 60], type: integer, default value 10.
     */
    public void setSuggestedPresentationDelay(Long SuggestedPresentationDelay) {
        this.SuggestedPresentationDelay = SuggestedPresentationDelay;
    }

    public DashManifestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashManifestInfo(DashManifestInfo source) {
        if (source.Windows != null) {
            this.Windows = new Long(source.Windows);
        }
        if (source.MinBufferTime != null) {
            this.MinBufferTime = new Long(source.MinBufferTime);
        }
        if (source.MinUpdatePeriod != null) {
            this.MinUpdatePeriod = new Long(source.MinUpdatePeriod);
        }
        if (source.SuggestedPresentationDelay != null) {
            this.SuggestedPresentationDelay = new Long(source.SuggestedPresentationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Windows", this.Windows);
        this.setParamSimple(map, prefix + "MinBufferTime", this.MinBufferTime);
        this.setParamSimple(map, prefix + "MinUpdatePeriod", this.MinUpdatePeriod);
        this.setParamSimple(map, prefix + "SuggestedPresentationDelay", this.SuggestedPresentationDelay);

    }
}

