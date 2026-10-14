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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PidSelector extends AbstractModel {

    /**
    * For streams containing multiple audio tracks, specify the audio track to use by entering a PID. The PID can be a positive integer between 1 and 8191.
    */
    @SerializedName("AudioPID")
    @Expose
    private Long [] AudioPID;

    /**
    * For streams containing multiple video tracks, specify the video track to be used by entering a PID. You can enter a positive integer between 1 and 8191 for the PID.
    */
    @SerializedName("VideoPID")
    @Expose
    private Long [] VideoPID;

    /**
     * Get For streams containing multiple audio tracks, specify the audio track to use by entering a PID. The PID can be a positive integer between 1 and 8191. 
     * @return AudioPID For streams containing multiple audio tracks, specify the audio track to use by entering a PID. The PID can be a positive integer between 1 and 8191.
     */
    public Long [] getAudioPID() {
        return this.AudioPID;
    }

    /**
     * Set For streams containing multiple audio tracks, specify the audio track to use by entering a PID. The PID can be a positive integer between 1 and 8191.
     * @param AudioPID For streams containing multiple audio tracks, specify the audio track to use by entering a PID. The PID can be a positive integer between 1 and 8191.
     */
    public void setAudioPID(Long [] AudioPID) {
        this.AudioPID = AudioPID;
    }

    /**
     * Get For streams containing multiple video tracks, specify the video track to be used by entering a PID. You can enter a positive integer between 1 and 8191 for the PID. 
     * @return VideoPID For streams containing multiple video tracks, specify the video track to be used by entering a PID. You can enter a positive integer between 1 and 8191 for the PID.
     */
    public Long [] getVideoPID() {
        return this.VideoPID;
    }

    /**
     * Set For streams containing multiple video tracks, specify the video track to be used by entering a PID. You can enter a positive integer between 1 and 8191 for the PID.
     * @param VideoPID For streams containing multiple video tracks, specify the video track to be used by entering a PID. You can enter a positive integer between 1 and 8191 for the PID.
     */
    public void setVideoPID(Long [] VideoPID) {
        this.VideoPID = VideoPID;
    }

    public PidSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PidSelector(PidSelector source) {
        if (source.AudioPID != null) {
            this.AudioPID = new Long[source.AudioPID.length];
            for (int i = 0; i < source.AudioPID.length; i++) {
                this.AudioPID[i] = new Long(source.AudioPID[i]);
            }
        }
        if (source.VideoPID != null) {
            this.VideoPID = new Long[source.VideoPID.length];
            for (int i = 0; i < source.VideoPID.length; i++) {
                this.VideoPID[i] = new Long(source.VideoPID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AudioPID.", this.AudioPID);
        this.setParamArraySimple(map, prefix + "VideoPID.", this.VideoPID);

    }
}

