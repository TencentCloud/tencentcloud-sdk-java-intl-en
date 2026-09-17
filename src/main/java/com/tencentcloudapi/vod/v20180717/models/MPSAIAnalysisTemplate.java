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

public class MPSAIAnalysisTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo ClassificationConfigure;

    /**
    * 
    */
    @SerializedName("TagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo TagConfigure;

    /**
    * 
    */
    @SerializedName("CoverConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo CoverConfigure;

    /**
    * 
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo FrameTagConfigure;

    /**
    * 
    */
    @SerializedName("SplitConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo SplitConfigure;

    /**
    * 
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo HighlightConfigure;

    /**
    * 
    */
    @SerializedName("OpeningAndEndingConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure;

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return ClassificationConfigure 
     */
    public MPSAIAnalysisConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set 
     * @param ClassificationConfigure 
     */
    public void setClassificationConfigure(MPSAIAnalysisConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get  
     * @return TagConfigure 
     */
    public MPSAIAnalysisConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set 
     * @param TagConfigure 
     */
    public void setTagConfigure(MPSAIAnalysisConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get  
     * @return CoverConfigure 
     */
    public MPSAIAnalysisConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set 
     * @param CoverConfigure 
     */
    public void setCoverConfigure(MPSAIAnalysisConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get  
     * @return FrameTagConfigure 
     */
    public MPSAIAnalysisConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set 
     * @param FrameTagConfigure 
     */
    public void setFrameTagConfigure(MPSAIAnalysisConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get  
     * @return SplitConfigure 
     */
    public MPSAIAnalysisConfigureInfo getSplitConfigure() {
        return this.SplitConfigure;
    }

    /**
     * Set 
     * @param SplitConfigure 
     */
    public void setSplitConfigure(MPSAIAnalysisConfigureInfo SplitConfigure) {
        this.SplitConfigure = SplitConfigure;
    }

    /**
     * Get  
     * @return HighlightConfigure 
     */
    public MPSAIAnalysisConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set 
     * @param HighlightConfigure 
     */
    public void setHighlightConfigure(MPSAIAnalysisConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * Get  
     * @return OpeningAndEndingConfigure 
     */
    public MPSAIAnalysisConfigureInfo getOpeningAndEndingConfigure() {
        return this.OpeningAndEndingConfigure;
    }

    /**
     * Set 
     * @param OpeningAndEndingConfigure 
     */
    public void setOpeningAndEndingConfigure(MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure) {
        this.OpeningAndEndingConfigure = OpeningAndEndingConfigure;
    }

    public MPSAIAnalysisTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAIAnalysisTemplate(MPSAIAnalysisTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ClassificationConfigure != null) {
            this.ClassificationConfigure = new MPSAIAnalysisConfigureInfo(source.ClassificationConfigure);
        }
        if (source.TagConfigure != null) {
            this.TagConfigure = new MPSAIAnalysisConfigureInfo(source.TagConfigure);
        }
        if (source.CoverConfigure != null) {
            this.CoverConfigure = new MPSAIAnalysisConfigureInfo(source.CoverConfigure);
        }
        if (source.FrameTagConfigure != null) {
            this.FrameTagConfigure = new MPSAIAnalysisConfigureInfo(source.FrameTagConfigure);
        }
        if (source.SplitConfigure != null) {
            this.SplitConfigure = new MPSAIAnalysisConfigureInfo(source.SplitConfigure);
        }
        if (source.HighlightConfigure != null) {
            this.HighlightConfigure = new MPSAIAnalysisConfigureInfo(source.HighlightConfigure);
        }
        if (source.OpeningAndEndingConfigure != null) {
            this.OpeningAndEndingConfigure = new MPSAIAnalysisConfigureInfo(source.OpeningAndEndingConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ClassificationConfigure.", this.ClassificationConfigure);
        this.setParamObj(map, prefix + "TagConfigure.", this.TagConfigure);
        this.setParamObj(map, prefix + "CoverConfigure.", this.CoverConfigure);
        this.setParamObj(map, prefix + "FrameTagConfigure.", this.FrameTagConfigure);
        this.setParamObj(map, prefix + "SplitConfigure.", this.SplitConfigure);
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);
        this.setParamObj(map, prefix + "OpeningAndEndingConfigure.", this.OpeningAndEndingConfigure);

    }
}

