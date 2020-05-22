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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AudioTemplateNames.", this.AudioTemplateNames);
        this.setParamArraySimple(map, prefix + "VideoTemplateNames.", this.VideoTemplateNames);
        this.setParamObj(map, prefix + "Scte35Settings.", this.Scte35Settings);

    }
}

