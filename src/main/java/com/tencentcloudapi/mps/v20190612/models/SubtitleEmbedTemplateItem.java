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

public class SubtitleEmbedTemplateItem extends AbstractModel {

    /**
    * Unique identifier of the subtitle suppression template
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Subtitle suppression template name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subtitle suppression template description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Deletion mark. 0 Not deleted. 1 Deleted.
    */
    @SerializedName("DeleteTag")
    @Expose
    private Long DeleteTag;

    /**
    * Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Subtitle suppression module settings
    */
    @SerializedName("SubtitleEmbedConfig")
    @Expose
    private SubtitleEmbedConfig SubtitleEmbedConfig;

    /**
    * Subtitle suppression template English name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
     * Get Unique identifier of the subtitle suppression template 
     * @return Definition Unique identifier of the subtitle suppression template
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the subtitle suppression template
     * @param Definition Unique identifier of the subtitle suppression template
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Subtitle suppression template name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Subtitle suppression template name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subtitle suppression template name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Subtitle suppression template name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subtitle suppression template description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Subtitle suppression template description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Subtitle suppression template description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Subtitle suppression template description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Deletion mark. 0 Not deleted. 1 Deleted. 
     * @return DeleteTag Deletion mark. 0 Not deleted. 1 Deleted.
     */
    public Long getDeleteTag() {
        return this.DeleteTag;
    }

    /**
     * Set Deletion mark. 0 Not deleted. 1 Deleted.
     * @param DeleteTag Deletion mark. 0 Not deleted. 1 Deleted.
     */
    public void setDeleteTag(Long DeleteTag) {
        this.DeleteTag = DeleteTag;
    }

    /**
     * Get Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return UpdateTime Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param UpdateTime Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Subtitle suppression module settings 
     * @return SubtitleEmbedConfig Subtitle suppression module settings
     */
    public SubtitleEmbedConfig getSubtitleEmbedConfig() {
        return this.SubtitleEmbedConfig;
    }

    /**
     * Set Subtitle suppression module settings
     * @param SubtitleEmbedConfig Subtitle suppression module settings
     */
    public void setSubtitleEmbedConfig(SubtitleEmbedConfig SubtitleEmbedConfig) {
        this.SubtitleEmbedConfig = SubtitleEmbedConfig;
    }

    /**
     * Get Subtitle suppression template English name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AliasName Subtitle suppression template English name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Subtitle suppression template English name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AliasName Subtitle suppression template English name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    public SubtitleEmbedTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleEmbedTemplateItem(SubtitleEmbedTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DeleteTag != null) {
            this.DeleteTag = new Long(source.DeleteTag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SubtitleEmbedConfig != null) {
            this.SubtitleEmbedConfig = new SubtitleEmbedConfig(source.SubtitleEmbedConfig);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DeleteTag", this.DeleteTag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "SubtitleEmbedConfig.", this.SubtitleEmbedConfig);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);

    }
}

