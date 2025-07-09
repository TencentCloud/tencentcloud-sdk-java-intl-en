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

public class ReviewTemplate extends AbstractModel {

    /**
    * The unique ID of the moderation template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The template type. Valid values:
<li>Preset</li>
<li>Custom</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The violation labels used.
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get The unique ID of the moderation template. 
     * @return Definition The unique ID of the moderation template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The unique ID of the moderation template.
     * @param Definition The unique ID of the moderation template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The template name. 
     * @return Name The template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The template name.
     * @param Name The template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The template description. 
     * @return Comment The template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set The template description.
     * @param Comment The template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get The template type. Valid values:
<li>Preset</li>
<li>Custom</li> 
     * @return Type The template type. Valid values:
<li>Preset</li>
<li>Custom</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The template type. Valid values:
<li>Preset</li>
<li>Custom</li>
     * @param Type The template type. Valid values:
<li>Preset</li>
<li>Custom</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The violation labels used. 
     * @return Labels The violation labels used.
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set The violation labels used.
     * @param Labels The violation labels used.
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime The template creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime The last updated time of the template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ReviewTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewTemplate(ReviewTemplate source) {
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
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

