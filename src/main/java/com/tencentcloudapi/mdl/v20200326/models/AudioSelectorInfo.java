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

public class AudioSelectorInfo extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "AudioPidSelection.", this.AudioPidSelection);

    }
}

