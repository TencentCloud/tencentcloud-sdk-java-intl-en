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

public class AiAnalysisResult extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("ClassificationTask")
    @Expose
    private AiAnalysisTaskClassificationResult ClassificationTask;

    /**
    * 
    */
    @SerializedName("CoverTask")
    @Expose
    private AiAnalysisTaskCoverResult CoverTask;

    /**
    * 
    */
    @SerializedName("TagTask")
    @Expose
    private AiAnalysisTaskTagResult TagTask;

    /**
    * 
    */
    @SerializedName("FrameTagTask")
    @Expose
    private AiAnalysisTaskFrameTagResult FrameTagTask;

    /**
    * 
    */
    @SerializedName("HighlightTask")
    @Expose
    private AiAnalysisTaskHighlightResult HighlightTask;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return ClassificationTask 
     */
    public AiAnalysisTaskClassificationResult getClassificationTask() {
        return this.ClassificationTask;
    }

    /**
     * Set 
     * @param ClassificationTask 
     */
    public void setClassificationTask(AiAnalysisTaskClassificationResult ClassificationTask) {
        this.ClassificationTask = ClassificationTask;
    }

    /**
     * Get  
     * @return CoverTask 
     */
    public AiAnalysisTaskCoverResult getCoverTask() {
        return this.CoverTask;
    }

    /**
     * Set 
     * @param CoverTask 
     */
    public void setCoverTask(AiAnalysisTaskCoverResult CoverTask) {
        this.CoverTask = CoverTask;
    }

    /**
     * Get  
     * @return TagTask 
     */
    public AiAnalysisTaskTagResult getTagTask() {
        return this.TagTask;
    }

    /**
     * Set 
     * @param TagTask 
     */
    public void setTagTask(AiAnalysisTaskTagResult TagTask) {
        this.TagTask = TagTask;
    }

    /**
     * Get  
     * @return FrameTagTask 
     */
    public AiAnalysisTaskFrameTagResult getFrameTagTask() {
        return this.FrameTagTask;
    }

    /**
     * Set 
     * @param FrameTagTask 
     */
    public void setFrameTagTask(AiAnalysisTaskFrameTagResult FrameTagTask) {
        this.FrameTagTask = FrameTagTask;
    }

    /**
     * Get  
     * @return HighlightTask 
     */
    public AiAnalysisTaskHighlightResult getHighlightTask() {
        return this.HighlightTask;
    }

    /**
     * Set 
     * @param HighlightTask 
     */
    public void setHighlightTask(AiAnalysisTaskHighlightResult HighlightTask) {
        this.HighlightTask = HighlightTask;
    }

    public AiAnalysisResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisResult(AiAnalysisResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClassificationTask != null) {
            this.ClassificationTask = new AiAnalysisTaskClassificationResult(source.ClassificationTask);
        }
        if (source.CoverTask != null) {
            this.CoverTask = new AiAnalysisTaskCoverResult(source.CoverTask);
        }
        if (source.TagTask != null) {
            this.TagTask = new AiAnalysisTaskTagResult(source.TagTask);
        }
        if (source.FrameTagTask != null) {
            this.FrameTagTask = new AiAnalysisTaskFrameTagResult(source.FrameTagTask);
        }
        if (source.HighlightTask != null) {
            this.HighlightTask = new AiAnalysisTaskHighlightResult(source.HighlightTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ClassificationTask.", this.ClassificationTask);
        this.setParamObj(map, prefix + "CoverTask.", this.CoverTask);
        this.setParamObj(map, prefix + "TagTask.", this.TagTask);
        this.setParamObj(map, prefix + "FrameTagTask.", this.FrameTagTask);
        this.setParamObj(map, prefix + "HighlightTask.", this.HighlightTask);

    }
}

