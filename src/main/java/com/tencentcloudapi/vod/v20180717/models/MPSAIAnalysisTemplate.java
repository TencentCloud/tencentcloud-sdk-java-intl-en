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
    * <p>Video analysis template name. The length cannot exceed 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Video analysis template description, with a length limit of 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Parameters for the intelligent classification task.</p>
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo ClassificationConfigure;

    /**
    * <p>Control parameters for the intelligent tag task.</p>
    */
    @SerializedName("TagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo TagConfigure;

    /**
    * <p>Intelligent Cover Task Control Parameters.</p>
    */
    @SerializedName("CoverConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo CoverConfigure;

    /**
    * <p>Control parameters for the intelligent frame-specific tagging task.</p>
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo FrameTagConfigure;

    /**
    * <p>Task control parameters for video splitting.</p>
    */
    @SerializedName("SplitConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo SplitConfigure;

    /**
    * <p>Control parameters for the intelligent highlights task.</p>
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo HighlightConfigure;

    /**
    * <p>Intelligent Opening and Closing Credits Task Control Parameters.</p>
    */
    @SerializedName("OpeningAndEndingConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure;

    /**
     * Get <p>Video analysis template name. The length cannot exceed 64 characters.</p> 
     * @return Name <p>Video analysis template name. The length cannot exceed 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Video analysis template name. The length cannot exceed 64 characters.</p>
     * @param Name <p>Video analysis template name. The length cannot exceed 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Video analysis template description, with a length limit of 256 characters.</p> 
     * @return Comment <p>Video analysis template description, with a length limit of 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Video analysis template description, with a length limit of 256 characters.</p>
     * @param Comment <p>Video analysis template description, with a length limit of 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Parameters for the intelligent classification task.</p> 
     * @return ClassificationConfigure <p>Parameters for the intelligent classification task.</p>
     */
    public MPSAIAnalysisConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set <p>Parameters for the intelligent classification task.</p>
     * @param ClassificationConfigure <p>Parameters for the intelligent classification task.</p>
     */
    public void setClassificationConfigure(MPSAIAnalysisConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get <p>Control parameters for the intelligent tag task.</p> 
     * @return TagConfigure <p>Control parameters for the intelligent tag task.</p>
     */
    public MPSAIAnalysisConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set <p>Control parameters for the intelligent tag task.</p>
     * @param TagConfigure <p>Control parameters for the intelligent tag task.</p>
     */
    public void setTagConfigure(MPSAIAnalysisConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get <p>Intelligent Cover Task Control Parameters.</p> 
     * @return CoverConfigure <p>Intelligent Cover Task Control Parameters.</p>
     */
    public MPSAIAnalysisConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set <p>Intelligent Cover Task Control Parameters.</p>
     * @param CoverConfigure <p>Intelligent Cover Task Control Parameters.</p>
     */
    public void setCoverConfigure(MPSAIAnalysisConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get <p>Control parameters for the intelligent frame-specific tagging task.</p> 
     * @return FrameTagConfigure <p>Control parameters for the intelligent frame-specific tagging task.</p>
     */
    public MPSAIAnalysisConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set <p>Control parameters for the intelligent frame-specific tagging task.</p>
     * @param FrameTagConfigure <p>Control parameters for the intelligent frame-specific tagging task.</p>
     */
    public void setFrameTagConfigure(MPSAIAnalysisConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get <p>Task control parameters for video splitting.</p> 
     * @return SplitConfigure <p>Task control parameters for video splitting.</p>
     */
    public MPSAIAnalysisConfigureInfo getSplitConfigure() {
        return this.SplitConfigure;
    }

    /**
     * Set <p>Task control parameters for video splitting.</p>
     * @param SplitConfigure <p>Task control parameters for video splitting.</p>
     */
    public void setSplitConfigure(MPSAIAnalysisConfigureInfo SplitConfigure) {
        this.SplitConfigure = SplitConfigure;
    }

    /**
     * Get <p>Control parameters for the intelligent highlights task.</p> 
     * @return HighlightConfigure <p>Control parameters for the intelligent highlights task.</p>
     */
    public MPSAIAnalysisConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set <p>Control parameters for the intelligent highlights task.</p>
     * @param HighlightConfigure <p>Control parameters for the intelligent highlights task.</p>
     */
    public void setHighlightConfigure(MPSAIAnalysisConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * Get <p>Intelligent Opening and Closing Credits Task Control Parameters.</p> 
     * @return OpeningAndEndingConfigure <p>Intelligent Opening and Closing Credits Task Control Parameters.</p>
     */
    public MPSAIAnalysisConfigureInfo getOpeningAndEndingConfigure() {
        return this.OpeningAndEndingConfigure;
    }

    /**
     * Set <p>Intelligent Opening and Closing Credits Task Control Parameters.</p>
     * @param OpeningAndEndingConfigure <p>Intelligent Opening and Closing Credits Task Control Parameters.</p>
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

