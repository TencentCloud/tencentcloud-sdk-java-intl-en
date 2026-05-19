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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcAudioTaskOutput extends AbstractModel {

    /**
    * <p>Output audio content</p>
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioTaskOutputFileInfo [] AudioInfos;

    /**
    * <p>Output video information.</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioTaskOutputFileInfo [] VideoInfos;

    /**
     * Get <p>Output audio content</p> 
     * @return AudioInfos <p>Output audio content</p>
     */
    public AigcAudioTaskOutputFileInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set <p>Output audio content</p>
     * @param AudioInfos <p>Output audio content</p>
     */
    public void setAudioInfos(AigcAudioTaskOutputFileInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get <p>Output video information.</p> 
     * @return VideoInfos <p>Output video information.</p>
     */
    public AigcAudioTaskOutputFileInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>Output video information.</p>
     * @param VideoInfos <p>Output video information.</p>
     */
    public void setVideoInfos(AigcAudioTaskOutputFileInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    public AigcAudioTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioTaskOutput(AigcAudioTaskOutput source) {
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcAudioTaskOutputFileInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcAudioTaskOutputFileInfo(source.AudioInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcAudioTaskOutputFileInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcAudioTaskOutputFileInfo(source.VideoInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);

    }
}

