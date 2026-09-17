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

public class CreateAIAnalysisTemplateRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
    private ClassificationConfigureInfo ClassificationConfigure;

    /**
    * 
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfo TagConfigure;

    /**
    * 
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfo CoverConfigure;

    /**
    * 
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfo FrameTagConfigure;

    /**
    * 
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private HighlightsConfigureInfo HighlightConfigure;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

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
    public ClassificationConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set 
     * @param ClassificationConfigure 
     */
    public void setClassificationConfigure(ClassificationConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get  
     * @return TagConfigure 
     */
    public TagConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set 
     * @param TagConfigure 
     */
    public void setTagConfigure(TagConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get  
     * @return CoverConfigure 
     */
    public CoverConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set 
     * @param CoverConfigure 
     */
    public void setCoverConfigure(CoverConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get  
     * @return FrameTagConfigure 
     */
    public FrameTagConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set 
     * @param FrameTagConfigure 
     */
    public void setFrameTagConfigure(FrameTagConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get  
     * @return HighlightConfigure 
     */
    public HighlightsConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set 
     * @param HighlightConfigure 
     */
    public void setHighlightConfigure(HighlightsConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    public CreateAIAnalysisTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIAnalysisTemplateRequest(CreateAIAnalysisTemplateRequest source) {
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
            this.ClassificationConfigure = new ClassificationConfigureInfo(source.ClassificationConfigure);
        }
        if (source.TagConfigure != null) {
            this.TagConfigure = new TagConfigureInfo(source.TagConfigure);
        }
        if (source.CoverConfigure != null) {
            this.CoverConfigure = new CoverConfigureInfo(source.CoverConfigure);
        }
        if (source.FrameTagConfigure != null) {
            this.FrameTagConfigure = new FrameTagConfigureInfo(source.FrameTagConfigure);
        }
        if (source.HighlightConfigure != null) {
            this.HighlightConfigure = new HighlightsConfigureInfo(source.HighlightConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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

