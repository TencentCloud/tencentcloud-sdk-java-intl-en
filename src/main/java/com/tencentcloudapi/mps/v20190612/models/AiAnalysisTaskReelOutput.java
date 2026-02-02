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

public class AiAnalysisTaskReelOutput extends AbstractModel {

    /**
    * Path of the edited video.
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * Script file path.

    */
    @SerializedName("ScriptPath")
    @Expose
    private String ScriptPath;

    /**
    * Storage location of the edited video.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get Path of the edited video. 
     * @return VideoPath Path of the edited video.
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set Path of the edited video.
     * @param VideoPath Path of the edited video.
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get Script file path.
 
     * @return ScriptPath Script file path.

     */
    public String getScriptPath() {
        return this.ScriptPath;
    }

    /**
     * Set Script file path.

     * @param ScriptPath Script file path.

     */
    public void setScriptPath(String ScriptPath) {
        this.ScriptPath = ScriptPath;
    }

    /**
     * Get Storage location of the edited video. 
     * @return OutputStorage Storage location of the edited video.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage location of the edited video.
     * @param OutputStorage Storage location of the edited video.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskReelOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskReelOutput(AiAnalysisTaskReelOutput source) {
        if (source.VideoPath != null) {
            this.VideoPath = new String(source.VideoPath);
        }
        if (source.ScriptPath != null) {
            this.ScriptPath = new String(source.ScriptPath);
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
        this.setParamSimple(map, prefix + "ScriptPath", this.ScriptPath);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

