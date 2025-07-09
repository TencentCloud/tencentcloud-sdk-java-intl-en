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

public class AudioSelectorInfo extends AbstractModel {

    /**
    * Audio name, which can contain 1-32 letters, digits, and underscores.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio `Pid` selection.
    */
    @SerializedName("AudioPidSelection")
    @Expose
    private AudioPidSelectionInfo AudioPidSelection;

    /**
    * Audio input type, optional values: 'PID_SELECTOR' 'TRACK_SELECTOR', default value PID_SELECTOR.
    */
    @SerializedName("AudioSelectorType")
    @Expose
    private String AudioSelectorType;

    /**
    * AudioTrack configuration.
    */
    @SerializedName("AudioTrackSelection")
    @Expose
    private InputTracks AudioTrackSelection;

    /**
     * Get Audio name, which can contain 1-32 letters, digits, and underscores. 
     * @return Name Audio name, which can contain 1-32 letters, digits, and underscores.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio name, which can contain 1-32 letters, digits, and underscores.
     * @param Name Audio name, which can contain 1-32 letters, digits, and underscores.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audio `Pid` selection. 
     * @return AudioPidSelection Audio `Pid` selection.
     */
    public AudioPidSelectionInfo getAudioPidSelection() {
        return this.AudioPidSelection;
    }

    /**
     * Set Audio `Pid` selection.
     * @param AudioPidSelection Audio `Pid` selection.
     */
    public void setAudioPidSelection(AudioPidSelectionInfo AudioPidSelection) {
        this.AudioPidSelection = AudioPidSelection;
    }

    /**
     * Get Audio input type, optional values: 'PID_SELECTOR' 'TRACK_SELECTOR', default value PID_SELECTOR. 
     * @return AudioSelectorType Audio input type, optional values: 'PID_SELECTOR' 'TRACK_SELECTOR', default value PID_SELECTOR.
     */
    public String getAudioSelectorType() {
        return this.AudioSelectorType;
    }

    /**
     * Set Audio input type, optional values: 'PID_SELECTOR' 'TRACK_SELECTOR', default value PID_SELECTOR.
     * @param AudioSelectorType Audio input type, optional values: 'PID_SELECTOR' 'TRACK_SELECTOR', default value PID_SELECTOR.
     */
    public void setAudioSelectorType(String AudioSelectorType) {
        this.AudioSelectorType = AudioSelectorType;
    }

    /**
     * Get AudioTrack configuration. 
     * @return AudioTrackSelection AudioTrack configuration.
     */
    public InputTracks getAudioTrackSelection() {
        return this.AudioTrackSelection;
    }

    /**
     * Set AudioTrack configuration.
     * @param AudioTrackSelection AudioTrack configuration.
     */
    public void setAudioTrackSelection(InputTracks AudioTrackSelection) {
        this.AudioTrackSelection = AudioTrackSelection;
    }

    public AudioSelectorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSelectorInfo(AudioSelectorInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AudioPidSelection != null) {
            this.AudioPidSelection = new AudioPidSelectionInfo(source.AudioPidSelection);
        }
        if (source.AudioSelectorType != null) {
            this.AudioSelectorType = new String(source.AudioSelectorType);
        }
        if (source.AudioTrackSelection != null) {
            this.AudioTrackSelection = new InputTracks(source.AudioTrackSelection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "AudioPidSelection.", this.AudioPidSelection);
        this.setParamSimple(map, prefix + "AudioSelectorType", this.AudioSelectorType);
        this.setParamObj(map, prefix + "AudioTrackSelection.", this.AudioTrackSelection);

    }
}

