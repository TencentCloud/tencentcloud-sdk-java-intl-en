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

public class AIAnalysisTemplateItem extends AbstractModel {

    /**
    * Unique ID of intelligent analysis template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Intelligent analysis template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Intelligent analysis template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Control parameter of intelligent categorization task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private ClassificationConfigureInfo ClassificationConfigure;

    /**
    * Control parameter of intelligent tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfo TagConfigure;

    /**
    * Control parameter of intelligent cover generating task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfo CoverConfigure;

    /**
    * Control parameter of intelligent frame-specific tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfo FrameTagConfigure;

    /**
    * Control parameter of an intelligent highlight generating task.
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private HighlightsConfigureInfo HighlightConfigure;

    /**
    * Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of intelligent analysis template. 
     * @return Definition Unique ID of intelligent analysis template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of intelligent analysis template.
     * @param Definition Unique ID of intelligent analysis template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Intelligent analysis template name. 
     * @return Name Intelligent analysis template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Intelligent analysis template name.
     * @param Name Intelligent analysis template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Intelligent analysis template description. 
     * @return Comment Intelligent analysis template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Intelligent analysis template description.
     * @param Comment Intelligent analysis template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Control parameter of intelligent categorization task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClassificationConfigure Control parameter of intelligent categorization task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClassificationConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set Control parameter of intelligent categorization task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClassificationConfigure Control parameter of intelligent categorization task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClassificationConfigure(ClassificationConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get Control parameter of intelligent tagging task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagConfigure Control parameter of intelligent tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TagConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set Control parameter of intelligent tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagConfigure Control parameter of intelligent tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagConfigure(TagConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get Control parameter of intelligent cover generating task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverConfigure Control parameter of intelligent cover generating task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CoverConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set Control parameter of intelligent cover generating task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverConfigure Control parameter of intelligent cover generating task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverConfigure(CoverConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get Control parameter of intelligent frame-specific tagging task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FrameTagConfigure Control parameter of intelligent frame-specific tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FrameTagConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set Control parameter of intelligent frame-specific tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FrameTagConfigure Control parameter of intelligent frame-specific tagging task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFrameTagConfigure(FrameTagConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get Control parameter of an intelligent highlight generating task. 
     * @return HighlightConfigure Control parameter of an intelligent highlight generating task.
     */
    public HighlightsConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set Control parameter of an intelligent highlight generating task.
     * @param HighlightConfigure Control parameter of an intelligent highlight generating task.
     */
    public void setHighlightConfigure(HighlightsConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * Get Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AIAnalysisTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysisTemplateItem(AIAnalysisTemplateItem source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

