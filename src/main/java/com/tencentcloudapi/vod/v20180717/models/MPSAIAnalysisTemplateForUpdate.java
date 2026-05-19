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

public class MPSAIAnalysisTemplateForUpdate extends AbstractModel {

    /**
    * <p>Unique identifier of a video analysis template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

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
    * <p>Intelligent Classification Task Control Parameters.</p>
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo ClassificationConfigure;

    /**
    * <p>Intelligent tag task control parameter.</p>
    */
    @SerializedName("TagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo TagConfigure;

    /**
    * <p>Parameters for the intelligent cover task.</p>
    */
    @SerializedName("CoverConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo CoverConfigure;

    /**
    * <p>Task control parameters for intelligent frame tagging.</p>
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo FrameTagConfigure;

    /**
    * <p>Task control parameter for intelligent splitting.</p>
    */
    @SerializedName("SplitConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo SplitConfigure;

    /**
    * <p>Intelligent highlights task control parameter.</p>
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo HighlightConfigure;

    /**
    * <p>Parameters for the intelligent video opening/closing credits task.</p>
    */
    @SerializedName("OpeningAndEndingConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure;

    /**
     * Get <p>Unique identifier of a video analysis template.</p> 
     * @return Definition <p>Unique identifier of a video analysis template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of a video analysis template.</p>
     * @param Definition <p>Unique identifier of a video analysis template.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

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
     * Get <p>Intelligent Classification Task Control Parameters.</p> 
     * @return ClassificationConfigure <p>Intelligent Classification Task Control Parameters.</p>
     */
    public MPSAIAnalysisConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set <p>Intelligent Classification Task Control Parameters.</p>
     * @param ClassificationConfigure <p>Intelligent Classification Task Control Parameters.</p>
     */
    public void setClassificationConfigure(MPSAIAnalysisConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get <p>Intelligent tag task control parameter.</p> 
     * @return TagConfigure <p>Intelligent tag task control parameter.</p>
     */
    public MPSAIAnalysisConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set <p>Intelligent tag task control parameter.</p>
     * @param TagConfigure <p>Intelligent tag task control parameter.</p>
     */
    public void setTagConfigure(MPSAIAnalysisConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get <p>Parameters for the intelligent cover task.</p> 
     * @return CoverConfigure <p>Parameters for the intelligent cover task.</p>
     */
    public MPSAIAnalysisConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set <p>Parameters for the intelligent cover task.</p>
     * @param CoverConfigure <p>Parameters for the intelligent cover task.</p>
     */
    public void setCoverConfigure(MPSAIAnalysisConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get <p>Task control parameters for intelligent frame tagging.</p> 
     * @return FrameTagConfigure <p>Task control parameters for intelligent frame tagging.</p>
     */
    public MPSAIAnalysisConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set <p>Task control parameters for intelligent frame tagging.</p>
     * @param FrameTagConfigure <p>Task control parameters for intelligent frame tagging.</p>
     */
    public void setFrameTagConfigure(MPSAIAnalysisConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get <p>Task control parameter for intelligent splitting.</p> 
     * @return SplitConfigure <p>Task control parameter for intelligent splitting.</p>
     */
    public MPSAIAnalysisConfigureInfo getSplitConfigure() {
        return this.SplitConfigure;
    }

    /**
     * Set <p>Task control parameter for intelligent splitting.</p>
     * @param SplitConfigure <p>Task control parameter for intelligent splitting.</p>
     */
    public void setSplitConfigure(MPSAIAnalysisConfigureInfo SplitConfigure) {
        this.SplitConfigure = SplitConfigure;
    }

    /**
     * Get <p>Intelligent highlights task control parameter.</p> 
     * @return HighlightConfigure <p>Intelligent highlights task control parameter.</p>
     */
    public MPSAIAnalysisConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set <p>Intelligent highlights task control parameter.</p>
     * @param HighlightConfigure <p>Intelligent highlights task control parameter.</p>
     */
    public void setHighlightConfigure(MPSAIAnalysisConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * Get <p>Parameters for the intelligent video opening/closing credits task.</p> 
     * @return OpeningAndEndingConfigure <p>Parameters for the intelligent video opening/closing credits task.</p>
     */
    public MPSAIAnalysisConfigureInfo getOpeningAndEndingConfigure() {
        return this.OpeningAndEndingConfigure;
    }

    /**
     * Set <p>Parameters for the intelligent video opening/closing credits task.</p>
     * @param OpeningAndEndingConfigure <p>Parameters for the intelligent video opening/closing credits task.</p>
     */
    public void setOpeningAndEndingConfigure(MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure) {
        this.OpeningAndEndingConfigure = OpeningAndEndingConfigure;
    }

    public MPSAIAnalysisTemplateForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAIAnalysisTemplateForUpdate(MPSAIAnalysisTemplateForUpdate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
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

