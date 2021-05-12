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

public class AppStatisticsItem extends AbstractModel{

    /**
    * Voice chat statistics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealtimeSpeechStatisticsItem")
    @Expose
    private RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem;

    /**
    * Voice messaging statistics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoiceMessageStatisticsItem")
    @Expose
    private VoiceMessageStatisticsItem VoiceMessageStatisticsItem;

    /**
    * Phrase filtering statistics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoiceFilterStatisticsItem")
    @Expose
    private VoiceFilterStatisticsItem VoiceFilterStatisticsItem;

    /**
    * Statistical period
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get Voice chat statistics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealtimeSpeechStatisticsItem Voice chat statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RealTimeSpeechStatisticsItem getRealtimeSpeechStatisticsItem() {
        return this.RealtimeSpeechStatisticsItem;
    }

    /**
     * Set Voice chat statistics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealtimeSpeechStatisticsItem Voice chat statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealtimeSpeechStatisticsItem(RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem) {
        this.RealtimeSpeechStatisticsItem = RealtimeSpeechStatisticsItem;
    }

    /**
     * Get Voice messaging statistics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoiceMessageStatisticsItem Voice messaging statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VoiceMessageStatisticsItem getVoiceMessageStatisticsItem() {
        return this.VoiceMessageStatisticsItem;
    }

    /**
     * Set Voice messaging statistics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoiceMessageStatisticsItem Voice messaging statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoiceMessageStatisticsItem(VoiceMessageStatisticsItem VoiceMessageStatisticsItem) {
        this.VoiceMessageStatisticsItem = VoiceMessageStatisticsItem;
    }

    /**
     * Get Phrase filtering statistics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoiceFilterStatisticsItem Phrase filtering statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VoiceFilterStatisticsItem getVoiceFilterStatisticsItem() {
        return this.VoiceFilterStatisticsItem;
    }

    /**
     * Set Phrase filtering statistics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoiceFilterStatisticsItem Phrase filtering statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoiceFilterStatisticsItem(VoiceFilterStatisticsItem VoiceFilterStatisticsItem) {
        this.VoiceFilterStatisticsItem = VoiceFilterStatisticsItem;
    }

    /**
     * Get Statistical period 
     * @return Date Statistical period
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Statistical period
     * @param Date Statistical period
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public AppStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppStatisticsItem(AppStatisticsItem source) {
        if (source.RealtimeSpeechStatisticsItem != null) {
            this.RealtimeSpeechStatisticsItem = new RealTimeSpeechStatisticsItem(source.RealtimeSpeechStatisticsItem);
        }
        if (source.VoiceMessageStatisticsItem != null) {
            this.VoiceMessageStatisticsItem = new VoiceMessageStatisticsItem(source.VoiceMessageStatisticsItem);
        }
        if (source.VoiceFilterStatisticsItem != null) {
            this.VoiceFilterStatisticsItem = new VoiceFilterStatisticsItem(source.VoiceFilterStatisticsItem);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RealtimeSpeechStatisticsItem.", this.RealtimeSpeechStatisticsItem);
        this.setParamObj(map, prefix + "VoiceMessageStatisticsItem.", this.VoiceMessageStatisticsItem);
        this.setParamObj(map, prefix + "VoiceFilterStatisticsItem.", this.VoiceFilterStatisticsItem);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

