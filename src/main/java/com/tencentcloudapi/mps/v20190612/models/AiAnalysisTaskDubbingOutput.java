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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskDubbingOutput extends AbstractModel {

    /**
    * Specifies the video path for translation.
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * Specifies the file path of the tag.

    */
    @SerializedName("SpeakerPath")
    @Expose
    private String SpeakerPath;

    /**
    * Specifies the storage location of the transcoded video.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get Specifies the video path for translation. 
     * @return VideoPath Specifies the video path for translation.
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set Specifies the video path for translation.
     * @param VideoPath Specifies the video path for translation.
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get Specifies the file path of the tag.
 
     * @return SpeakerPath Specifies the file path of the tag.

     */
    public String getSpeakerPath() {
        return this.SpeakerPath;
    }

    /**
     * Set Specifies the file path of the tag.

     * @param SpeakerPath Specifies the file path of the tag.

     */
    public void setSpeakerPath(String SpeakerPath) {
        this.SpeakerPath = SpeakerPath;
    }

    /**
     * Get Specifies the storage location of the transcoded video. 
     * @return OutputStorage Specifies the storage location of the transcoded video.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Specifies the storage location of the transcoded video.
     * @param OutputStorage Specifies the storage location of the transcoded video.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskDubbingOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDubbingOutput(AiAnalysisTaskDubbingOutput source) {
        if (source.VideoPath != null) {
            this.VideoPath = new String(source.VideoPath);
        }
        if (source.SpeakerPath != null) {
            this.SpeakerPath = new String(source.SpeakerPath);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoPath", this.VideoPath);
        this.setParamSimple(map, prefix + "SpeakerPath", this.SpeakerPath);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

