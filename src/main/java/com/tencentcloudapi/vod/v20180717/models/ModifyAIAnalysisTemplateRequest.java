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

public class ModifyAIAnalysisTemplateRequest extends AbstractModel {

    /**
    * Audio and video content analysis template unique identifier.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created application.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Audio and video content analysis template name, with a length limit of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio and video content analysis template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Intelligent classification task control parameters.
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private ClassificationConfigureInfoForUpdate ClassificationConfigure;

    /**
    * Intelligent tag task control parameter.
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfoForUpdate TagConfigure;

    /**
    * Intelligent cover task control parameters.
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfoForUpdate CoverConfigure;

    /**
    * Control parameter for the intelligent frame-specific tagging task.
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfoForUpdate FrameTagConfigure;

    /**
    * Intelligent Highlights Compilation Task Control Parameters.
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private HighlightsConfigureInfoForUpdate HighlightConfigure;

    /**
     * Get Audio and video content analysis template unique identifier. 
     * @return Definition Audio and video content analysis template unique identifier.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Audio and video content analysis template unique identifier.
     * @param Definition Audio and video content analysis template unique identifier.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created application.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created application.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created application.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created application.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Audio and video content analysis template name, with a length limit of 64 characters. 
     * @return Name Audio and video content analysis template name, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio and video content analysis template name, with a length limit of 64 characters.
     * @param Name Audio and video content analysis template name, with a length limit of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audio and video content analysis template description, with a length limit of 256 characters. 
     * @return Comment Audio and video content analysis template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Audio and video content analysis template description, with a length limit of 256 characters.
     * @param Comment Audio and video content analysis template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Intelligent classification task control parameters. 
     * @return ClassificationConfigure Intelligent classification task control parameters.
     */
    public ClassificationConfigureInfoForUpdate getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set Intelligent classification task control parameters.
     * @param ClassificationConfigure Intelligent classification task control parameters.
     */
    public void setClassificationConfigure(ClassificationConfigureInfoForUpdate ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get Intelligent tag task control parameter. 
     * @return TagConfigure Intelligent tag task control parameter.
     */
    public TagConfigureInfoForUpdate getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set Intelligent tag task control parameter.
     * @param TagConfigure Intelligent tag task control parameter.
     */
    public void setTagConfigure(TagConfigureInfoForUpdate TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get Intelligent cover task control parameters. 
     * @return CoverConfigure Intelligent cover task control parameters.
     */
    public CoverConfigureInfoForUpdate getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set Intelligent cover task control parameters.
     * @param CoverConfigure Intelligent cover task control parameters.
     */
    public void setCoverConfigure(CoverConfigureInfoForUpdate CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get Control parameter for the intelligent frame-specific tagging task. 
     * @return FrameTagConfigure Control parameter for the intelligent frame-specific tagging task.
     */
    public FrameTagConfigureInfoForUpdate getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set Control parameter for the intelligent frame-specific tagging task.
     * @param FrameTagConfigure Control parameter for the intelligent frame-specific tagging task.
     */
    public void setFrameTagConfigure(FrameTagConfigureInfoForUpdate FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get Intelligent Highlights Compilation Task Control Parameters. 
     * @return HighlightConfigure Intelligent Highlights Compilation Task Control Parameters.
     */
    public HighlightsConfigureInfoForUpdate getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set Intelligent Highlights Compilation Task Control Parameters.
     * @param HighlightConfigure Intelligent Highlights Compilation Task Control Parameters.
     */
    public void setHighlightConfigure(HighlightsConfigureInfoForUpdate HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    public ModifyAIAnalysisTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIAnalysisTemplateRequest(ModifyAIAnalysisTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ClassificationConfigure != null) {
            this.ClassificationConfigure = new ClassificationConfigureInfoForUpdate(source.ClassificationConfigure);
        }
        if (source.TagConfigure != null) {
            this.TagConfigure = new TagConfigureInfoForUpdate(source.TagConfigure);
        }
        if (source.CoverConfigure != null) {
            this.CoverConfigure = new CoverConfigureInfoForUpdate(source.CoverConfigure);
        }
        if (source.FrameTagConfigure != null) {
            this.FrameTagConfigure = new FrameTagConfigureInfoForUpdate(source.FrameTagConfigure);
        }
        if (source.HighlightConfigure != null) {
            this.HighlightConfigure = new HighlightsConfigureInfoForUpdate(source.HighlightConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ClassificationConfigure.", this.ClassificationConfigure);
        this.setParamObj(map, prefix + "TagConfigure.", this.TagConfigure);
        this.setParamObj(map, prefix + "CoverConfigure.", this.CoverConfigure);
        this.setParamObj(map, prefix + "FrameTagConfigure.", this.FrameTagConfigure);
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);

    }
}

