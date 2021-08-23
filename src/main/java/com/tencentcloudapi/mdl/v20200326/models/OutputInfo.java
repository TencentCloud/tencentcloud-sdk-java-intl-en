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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputInfo extends AbstractModel{

    /**
    * Output name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio transcoding template name array.
Quantity limit: [0,1] for RTMP; [0,20] for others.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioTemplateNames")
    @Expose
    private String [] AudioTemplateNames;

    /**
    * Video transcoding template name array. Quantity limit: [0,1].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoTemplateNames")
    @Expose
    private String [] VideoTemplateNames;

    /**
    * SCTE-35 information configuration.
    */
    @SerializedName("Scte35Settings")
    @Expose
    private Scte35SettingsInfo Scte35Settings;

    /**
    * Audio/Video transcoding template name. If `HlsRemuxSettings.Scheme` is `MERGE`, there is 1 audio/video transcoding template. Otherwise, this parameter is empty.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AVTemplateNames")
    @Expose
    private String [] AVTemplateNames;

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
Quantity limit: [0,1] for RTMP; [0,20] for others.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioTemplateNames Audio transcoding template name array.
Quantity limit: [0,1] for RTMP; [0,20] for others.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAudioTemplateNames() {
        return this.AudioTemplateNames;
    }

    /**
     * Set Audio transcoding template name array.
Quantity limit: [0,1] for RTMP; [0,20] for others.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioTemplateNames Audio transcoding template name array.
Quantity limit: [0,1] for RTMP; [0,20] for others.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioTemplateNames(String [] AudioTemplateNames) {
        this.AudioTemplateNames = AudioTemplateNames;
    }

    /**
     * Get Video transcoding template name array. Quantity limit: [0,1].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoTemplateNames Video transcoding template name array. Quantity limit: [0,1].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getVideoTemplateNames() {
        return this.VideoTemplateNames;
    }

    /**
     * Set Video transcoding template name array. Quantity limit: [0,1].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoTemplateNames Video transcoding template name array. Quantity limit: [0,1].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoTemplateNames(String [] VideoTemplateNames) {
        this.VideoTemplateNames = VideoTemplateNames;
    }

    /**
     * Get SCTE-35 information configuration. 
     * @return Scte35Settings SCTE-35 information configuration.
     */
    public Scte35SettingsInfo getScte35Settings() {
        return this.Scte35Settings;
    }

    /**
     * Set SCTE-35 information configuration.
     * @param Scte35Settings SCTE-35 information configuration.
     */
    public void setScte35Settings(Scte35SettingsInfo Scte35Settings) {
        this.Scte35Settings = Scte35Settings;
    }

    /**
     * Get Audio/Video transcoding template name. If `HlsRemuxSettings.Scheme` is `MERGE`, there is 1 audio/video transcoding template. Otherwise, this parameter is empty.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return AVTemplateNames Audio/Video transcoding template name. If `HlsRemuxSettings.Scheme` is `MERGE`, there is 1 audio/video transcoding template. Otherwise, this parameter is empty.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String [] getAVTemplateNames() {
        return this.AVTemplateNames;
    }

    /**
     * Set Audio/Video transcoding template name. If `HlsRemuxSettings.Scheme` is `MERGE`, there is 1 audio/video transcoding template. Otherwise, this parameter is empty.
Note: this field may return `null`, indicating that no valid value was found.
     * @param AVTemplateNames Audio/Video transcoding template name. If `HlsRemuxSettings.Scheme` is `MERGE`, there is 1 audio/video transcoding template. Otherwise, this parameter is empty.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setAVTemplateNames(String [] AVTemplateNames) {
        this.AVTemplateNames = AVTemplateNames;
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

    }
}

