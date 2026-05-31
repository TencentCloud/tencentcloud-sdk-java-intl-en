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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputInfo extends AbstractModel {

    /**
    * Output name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio transcoding template name array.
RTMP limit [0, 1], other limits [0, 20].
    */
    @SerializedName("AudioTemplateNames")
    @Expose
    private String [] AudioTemplateNames;

    /**
    * Video transcoding template name array, with the maximum number of [0, 1].
    */
    @SerializedName("VideoTemplateNames")
    @Expose
    private String [] VideoTemplateNames;

    /**
    * Scte-35 information configuration.
    */
    @SerializedName("Scte35Settings")
    @Expose
    private Scte35SettingsInfo Scte35Settings;

    /**
    * Audio/video transcoding template name array, with the maximum number of 1.
    */
    @SerializedName("AVTemplateNames")
    @Expose
    private String [] AVTemplateNames;

    /**
    * The used subtitle template is only valid for merge template.
    */
    @SerializedName("CaptionTemplateNames")
    @Expose
    private String [] CaptionTemplateNames;

    /**
    * Meta-information control configuration.
    */
    @SerializedName("TimedMetadataSettings")
    @Expose
    private TimedMetadataSettingInfo TimedMetadataSettings;

    /**
    * Screenshot transcode template name array. Limit: 1.
    */
    @SerializedName("FrameCaptureTemplateNames")
    @Expose
    private String [] FrameCaptureTemplateNames;

    /**
    * Modify the name of the sub-m3u8.
    */
    @SerializedName("NameModifier")
    @Expose
    private String NameModifier;

    /**
     * Get Output name. 
     * @return Name Output name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Output name.
     * @param Name Output name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audio transcoding template name array.
RTMP limit [0, 1], other limits [0, 20]. 
     * @return AudioTemplateNames Audio transcoding template name array.
RTMP limit [0, 1], other limits [0, 20].
     */
    public String [] getAudioTemplateNames() {
        return this.AudioTemplateNames;
    }

    /**
     * Set Audio transcoding template name array.
RTMP limit [0, 1], other limits [0, 20].
     * @param AudioTemplateNames Audio transcoding template name array.
RTMP limit [0, 1], other limits [0, 20].
     */
    public void setAudioTemplateNames(String [] AudioTemplateNames) {
        this.AudioTemplateNames = AudioTemplateNames;
    }

    /**
     * Get Video transcoding template name array, with the maximum number of [0, 1]. 
     * @return VideoTemplateNames Video transcoding template name array, with the maximum number of [0, 1].
     */
    public String [] getVideoTemplateNames() {
        return this.VideoTemplateNames;
    }

    /**
     * Set Video transcoding template name array, with the maximum number of [0, 1].
     * @param VideoTemplateNames Video transcoding template name array, with the maximum number of [0, 1].
     */
    public void setVideoTemplateNames(String [] VideoTemplateNames) {
        this.VideoTemplateNames = VideoTemplateNames;
    }

    /**
     * Get Scte-35 information configuration. 
     * @return Scte35Settings Scte-35 information configuration.
     */
    public Scte35SettingsInfo getScte35Settings() {
        return this.Scte35Settings;
    }

    /**
     * Set Scte-35 information configuration.
     * @param Scte35Settings Scte-35 information configuration.
     */
    public void setScte35Settings(Scte35SettingsInfo Scte35Settings) {
        this.Scte35Settings = Scte35Settings;
    }

    /**
     * Get Audio/video transcoding template name array, with the maximum number of 1. 
     * @return AVTemplateNames Audio/video transcoding template name array, with the maximum number of 1.
     */
    public String [] getAVTemplateNames() {
        return this.AVTemplateNames;
    }

    /**
     * Set Audio/video transcoding template name array, with the maximum number of 1.
     * @param AVTemplateNames Audio/video transcoding template name array, with the maximum number of 1.
     */
    public void setAVTemplateNames(String [] AVTemplateNames) {
        this.AVTemplateNames = AVTemplateNames;
    }

    /**
     * Get The used subtitle template is only valid for merge template. 
     * @return CaptionTemplateNames The used subtitle template is only valid for merge template.
     */
    public String [] getCaptionTemplateNames() {
        return this.CaptionTemplateNames;
    }

    /**
     * Set The used subtitle template is only valid for merge template.
     * @param CaptionTemplateNames The used subtitle template is only valid for merge template.
     */
    public void setCaptionTemplateNames(String [] CaptionTemplateNames) {
        this.CaptionTemplateNames = CaptionTemplateNames;
    }

    /**
     * Get Meta-information control configuration. 
     * @return TimedMetadataSettings Meta-information control configuration.
     */
    public TimedMetadataSettingInfo getTimedMetadataSettings() {
        return this.TimedMetadataSettings;
    }

    /**
     * Set Meta-information control configuration.
     * @param TimedMetadataSettings Meta-information control configuration.
     */
    public void setTimedMetadataSettings(TimedMetadataSettingInfo TimedMetadataSettings) {
        this.TimedMetadataSettings = TimedMetadataSettings;
    }

    /**
     * Get Screenshot transcode template name array. Limit: 1. 
     * @return FrameCaptureTemplateNames Screenshot transcode template name array. Limit: 1.
     */
    public String [] getFrameCaptureTemplateNames() {
        return this.FrameCaptureTemplateNames;
    }

    /**
     * Set Screenshot transcode template name array. Limit: 1.
     * @param FrameCaptureTemplateNames Screenshot transcode template name array. Limit: 1.
     */
    public void setFrameCaptureTemplateNames(String [] FrameCaptureTemplateNames) {
        this.FrameCaptureTemplateNames = FrameCaptureTemplateNames;
    }

    /**
     * Get Modify the name of the sub-m3u8. 
     * @return NameModifier Modify the name of the sub-m3u8.
     */
    public String getNameModifier() {
        return this.NameModifier;
    }

    /**
     * Set Modify the name of the sub-m3u8.
     * @param NameModifier Modify the name of the sub-m3u8.
     */
    public void setNameModifier(String NameModifier) {
        this.NameModifier = NameModifier;
    }

    public OutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputInfo(OutputInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AudioTemplateNames != null) {
            this.AudioTemplateNames = new String[source.AudioTemplateNames.length];
            for (int i = 0; i < source.AudioTemplateNames.length; i++) {
                this.AudioTemplateNames[i] = new String(source.AudioTemplateNames[i]);
            }
        }
        if (source.VideoTemplateNames != null) {
            this.VideoTemplateNames = new String[source.VideoTemplateNames.length];
            for (int i = 0; i < source.VideoTemplateNames.length; i++) {
                this.VideoTemplateNames[i] = new String(source.VideoTemplateNames[i]);
            }
        }
        if (source.Scte35Settings != null) {
            this.Scte35Settings = new Scte35SettingsInfo(source.Scte35Settings);
        }
        if (source.AVTemplateNames != null) {
            this.AVTemplateNames = new String[source.AVTemplateNames.length];
            for (int i = 0; i < source.AVTemplateNames.length; i++) {
                this.AVTemplateNames[i] = new String(source.AVTemplateNames[i]);
            }
        }
        if (source.CaptionTemplateNames != null) {
            this.CaptionTemplateNames = new String[source.CaptionTemplateNames.length];
            for (int i = 0; i < source.CaptionTemplateNames.length; i++) {
                this.CaptionTemplateNames[i] = new String(source.CaptionTemplateNames[i]);
            }
        }
        if (source.TimedMetadataSettings != null) {
            this.TimedMetadataSettings = new TimedMetadataSettingInfo(source.TimedMetadataSettings);
        }
        if (source.FrameCaptureTemplateNames != null) {
            this.FrameCaptureTemplateNames = new String[source.FrameCaptureTemplateNames.length];
            for (int i = 0; i < source.FrameCaptureTemplateNames.length; i++) {
                this.FrameCaptureTemplateNames[i] = new String(source.FrameCaptureTemplateNames[i]);
            }
        }
        if (source.NameModifier != null) {
            this.NameModifier = new String(source.NameModifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AudioTemplateNames.", this.AudioTemplateNames);
        this.setParamArraySimple(map, prefix + "VideoTemplateNames.", this.VideoTemplateNames);
        this.setParamObj(map, prefix + "Scte35Settings.", this.Scte35Settings);
        this.setParamArraySimple(map, prefix + "AVTemplateNames.", this.AVTemplateNames);
        this.setParamArraySimple(map, prefix + "CaptionTemplateNames.", this.CaptionTemplateNames);
        this.setParamObj(map, prefix + "TimedMetadataSettings.", this.TimedMetadataSettings);
        this.setParamArraySimple(map, prefix + "FrameCaptureTemplateNames.", this.FrameCaptureTemplateNames);
        this.setParamSimple(map, prefix + "NameModifier", this.NameModifier);

    }
}

