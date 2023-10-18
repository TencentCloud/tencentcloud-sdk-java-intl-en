/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Unique ID of video content analysis template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Video content analysis template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Video content analysis template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Control parameter of intelligent categorization task.
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private ClassificationConfigureInfoForUpdate ClassificationConfigure;

    /**
    * Control parameter of intelligent tagging task.
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfoForUpdate TagConfigure;

    /**
    * Control parameter of intelligent cover generating task.
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfoForUpdate CoverConfigure;

    /**
    * Control parameter of intelligent frame-specific tagging task.
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfoForUpdate FrameTagConfigure;

    /**
    * Control parameter of an intelligent highlight generating task.
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private HighlightsConfigureInfoForUpdate HighlightConfigure;

    /**
     * Get Unique ID of video content analysis template. 
     * @return Definition Unique ID of video content analysis template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of video content analysis template.
     * @param Definition Unique ID of video content analysis template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     * @param SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Video content analysis template name. Length limit: 64 characters. 
     * @return Name Video content analysis template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Video content analysis template name. Length limit: 64 characters.
     * @param Name Video content analysis template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Video content analysis template description. Length limit: 256 characters. 
     * @return Comment Video content analysis template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Video content analysis template description. Length limit: 256 characters.
     * @param Comment Video content analysis template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Control parameter of intelligent categorization task. 
     * @return ClassificationConfigure Control parameter of intelligent categorization task.
     */
    public ClassificationConfigureInfoForUpdate getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set Control parameter of intelligent categorization task.
     * @param ClassificationConfigure Control parameter of intelligent categorization task.
     */
    public void setClassificationConfigure(ClassificationConfigureInfoForUpdate ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get Control parameter of intelligent tagging task. 
     * @return TagConfigure Control parameter of intelligent tagging task.
     */
    public TagConfigureInfoForUpdate getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set Control parameter of intelligent tagging task.
     * @param TagConfigure Control parameter of intelligent tagging task.
     */
    public void setTagConfigure(TagConfigureInfoForUpdate TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get Control parameter of intelligent cover generating task. 
     * @return CoverConfigure Control parameter of intelligent cover generating task.
     */
    public CoverConfigureInfoForUpdate getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set Control parameter of intelligent cover generating task.
     * @param CoverConfigure Control parameter of intelligent cover generating task.
     */
    public void setCoverConfigure(CoverConfigureInfoForUpdate CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get Control parameter of intelligent frame-specific tagging task. 
     * @return FrameTagConfigure Control parameter of intelligent frame-specific tagging task.
     */
    public FrameTagConfigureInfoForUpdate getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set Control parameter of intelligent frame-specific tagging task.
     * @param FrameTagConfigure Control parameter of intelligent frame-specific tagging task.
     */
    public void setFrameTagConfigure(FrameTagConfigureInfoForUpdate FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get Control parameter of an intelligent highlight generating task. 
     * @return HighlightConfigure Control parameter of an intelligent highlight generating task.
     */
    public HighlightsConfigureInfoForUpdate getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set Control parameter of an intelligent highlight generating task.
     * @param HighlightConfigure Control parameter of an intelligent highlight generating task.
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

