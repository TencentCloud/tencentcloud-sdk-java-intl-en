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
    * Voice Chat statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RealtimeSpeechStatisticsItem")
    @Expose
    private RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem;

    /**
    * Voice Message statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VoiceMessageStatisticsItem")
    @Expose
    private VoiceMessageStatisticsItem VoiceMessageStatisticsItem;

    /**
    * Phrase Filtering statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VoiceFilterStatisticsItem")
    @Expose
    private VoiceFilterStatisticsItem VoiceFilterStatisticsItem;

    /**
    * Reference period
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Recording-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioTextStatisticsItem")
    @Expose
    private AudioTextStatisticsItem AudioTextStatisticsItem;

    /**
    * Stream-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamTextStatisticsItem")
    @Expose
    private StreamTextStatisticsItem StreamTextStatisticsItem;

    /**
    * Usage statistics of Voice-to-Text of outside-MLC requests
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OverseaTextStatisticsItem")
    @Expose
    private OverseaTextStatisticsItem OverseaTextStatisticsItem;

    /**
    * Real-time Voice-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RealtimeTextStatisticsItem")
    @Expose
    private RealtimeTextStatisticsItem RealtimeTextStatisticsItem;

    /**
     * Get Voice Chat statistics
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RealtimeSpeechStatisticsItem Voice Chat statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public RealTimeSpeechStatisticsItem getRealtimeSpeechStatisticsItem() {
        return this.RealtimeSpeechStatisticsItem;
    }

    /**
     * Set Voice Chat statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RealtimeSpeechStatisticsItem Voice Chat statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRealtimeSpeechStatisticsItem(RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem) {
        this.RealtimeSpeechStatisticsItem = RealtimeSpeechStatisticsItem;
    }

    /**
     * Get Voice Message statistics
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return VoiceMessageStatisticsItem Voice Message statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public VoiceMessageStatisticsItem getVoiceMessageStatisticsItem() {
        return this.VoiceMessageStatisticsItem;
    }

    /**
     * Set Voice Message statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param VoiceMessageStatisticsItem Voice Message statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVoiceMessageStatisticsItem(VoiceMessageStatisticsItem VoiceMessageStatisticsItem) {
        this.VoiceMessageStatisticsItem = VoiceMessageStatisticsItem;
    }

    /**
     * Get Phrase Filtering statistics
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return VoiceFilterStatisticsItem Phrase Filtering statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public VoiceFilterStatisticsItem getVoiceFilterStatisticsItem() {
        return this.VoiceFilterStatisticsItem;
    }

    /**
     * Set Phrase Filtering statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param VoiceFilterStatisticsItem Phrase Filtering statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVoiceFilterStatisticsItem(VoiceFilterStatisticsItem VoiceFilterStatisticsItem) {
        this.VoiceFilterStatisticsItem = VoiceFilterStatisticsItem;
    }

    /**
     * Get Reference period 
     * @return Date Reference period
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Reference period
     * @param Date Reference period
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Recording-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AudioTextStatisticsItem Recording-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AudioTextStatisticsItem getAudioTextStatisticsItem() {
        return this.AudioTextStatisticsItem;
    }

    /**
     * Set Recording-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AudioTextStatisticsItem Recording-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAudioTextStatisticsItem(AudioTextStatisticsItem AudioTextStatisticsItem) {
        this.AudioTextStatisticsItem = AudioTextStatisticsItem;
    }

    /**
     * Get Stream-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StreamTextStatisticsItem Stream-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public StreamTextStatisticsItem getStreamTextStatisticsItem() {
        return this.StreamTextStatisticsItem;
    }

    /**
     * Set Stream-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StreamTextStatisticsItem Stream-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStreamTextStatisticsItem(StreamTextStatisticsItem StreamTextStatisticsItem) {
        this.StreamTextStatisticsItem = StreamTextStatisticsItem;
    }

    /**
     * Get Usage statistics of Voice-to-Text of outside-MLC requests
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return OverseaTextStatisticsItem Usage statistics of Voice-to-Text of outside-MLC requests
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public OverseaTextStatisticsItem getOverseaTextStatisticsItem() {
        return this.OverseaTextStatisticsItem;
    }

    /**
     * Set Usage statistics of Voice-to-Text of outside-MLC requests
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param OverseaTextStatisticsItem Usage statistics of Voice-to-Text of outside-MLC requests
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOverseaTextStatisticsItem(OverseaTextStatisticsItem OverseaTextStatisticsItem) {
        this.OverseaTextStatisticsItem = OverseaTextStatisticsItem;
    }

    /**
     * Get Real-time Voice-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RealtimeTextStatisticsItem Real-time Voice-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public RealtimeTextStatisticsItem getRealtimeTextStatisticsItem() {
        return this.RealtimeTextStatisticsItem;
    }

    /**
     * Set Real-time Voice-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RealtimeTextStatisticsItem Real-time Voice-to-Text usage statistics
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRealtimeTextStatisticsItem(RealtimeTextStatisticsItem RealtimeTextStatisticsItem) {
        this.RealtimeTextStatisticsItem = RealtimeTextStatisticsItem;
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
        if (source.AudioTextStatisticsItem != null) {
            this.AudioTextStatisticsItem = new AudioTextStatisticsItem(source.AudioTextStatisticsItem);
        }
        if (source.StreamTextStatisticsItem != null) {
            this.StreamTextStatisticsItem = new StreamTextStatisticsItem(source.StreamTextStatisticsItem);
        }
        if (source.OverseaTextStatisticsItem != null) {
            this.OverseaTextStatisticsItem = new OverseaTextStatisticsItem(source.OverseaTextStatisticsItem);
        }
        if (source.RealtimeTextStatisticsItem != null) {
            this.RealtimeTextStatisticsItem = new RealtimeTextStatisticsItem(source.RealtimeTextStatisticsItem);
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
        this.setParamObj(map, prefix + "AudioTextStatisticsItem.", this.AudioTextStatisticsItem);
        this.setParamObj(map, prefix + "StreamTextStatisticsItem.", this.StreamTextStatisticsItem);
        this.setParamObj(map, prefix + "OverseaTextStatisticsItem.", this.OverseaTextStatisticsItem);
        this.setParamObj(map, prefix + "RealtimeTextStatisticsItem.", this.RealtimeTextStatisticsItem);

    }
}

