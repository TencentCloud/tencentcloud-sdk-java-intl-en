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

public class AiAnalysisTaskHorizontalToVerticalOutput extends AbstractModel {

    /**
    * Intelligent landscape-to-portrait video list.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Storage location of intelligent landscape-to-portrait videos.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Confidence degree.	
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Intelligent landscape-to-portrait video list. 
     * @return Path Intelligent landscape-to-portrait video list.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Intelligent landscape-to-portrait video list.
     * @param Path Intelligent landscape-to-portrait video list.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Storage location of intelligent landscape-to-portrait videos. 
     * @return OutputStorage Storage location of intelligent landscape-to-portrait videos.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage location of intelligent landscape-to-portrait videos.
     * @param OutputStorage Storage location of intelligent landscape-to-portrait videos.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Confidence degree.	 
     * @return Confidence Confidence degree.	
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence degree.	
     * @param Confidence Confidence degree.	
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public AiAnalysisTaskHorizontalToVerticalOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHorizontalToVerticalOutput(AiAnalysisTaskHorizontalToVerticalOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

