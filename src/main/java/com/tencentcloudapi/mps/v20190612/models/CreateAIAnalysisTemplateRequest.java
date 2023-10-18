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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIAnalysisTemplateRequest extends AbstractModel {

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
    private ClassificationConfigureInfo ClassificationConfigure;

    /**
    * Control parameter of intelligent tagging task.
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfo TagConfigure;

    /**
    * Control parameter of intelligent cover generating task.
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfo CoverConfigure;

    /**
    * Control parameter of intelligent frame-specific tagging task.
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfo FrameTagConfigure;

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
    public ClassificationConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set Control parameter of intelligent categorization task.
     * @param ClassificationConfigure Control parameter of intelligent categorization task.
     */
    public void setClassificationConfigure(ClassificationConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get Control parameter of intelligent tagging task. 
     * @return TagConfigure Control parameter of intelligent tagging task.
     */
    public TagConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set Control parameter of intelligent tagging task.
     * @param TagConfigure Control parameter of intelligent tagging task.
     */
    public void setTagConfigure(TagConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get Control parameter of intelligent cover generating task. 
     * @return CoverConfigure Control parameter of intelligent cover generating task.
     */
    public CoverConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set Control parameter of intelligent cover generating task.
     * @param CoverConfigure Control parameter of intelligent cover generating task.
     */
    public void setCoverConfigure(CoverConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get Control parameter of intelligent frame-specific tagging task. 
     * @return FrameTagConfigure Control parameter of intelligent frame-specific tagging task.
     */
    public FrameTagConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set Control parameter of intelligent frame-specific tagging task.
     * @param FrameTagConfigure Control parameter of intelligent frame-specific tagging task.
     */
    public void setFrameTagConfigure(FrameTagConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    public CreateAIAnalysisTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIAnalysisTemplateRequest(CreateAIAnalysisTemplateRequest source) {
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

    }
}

