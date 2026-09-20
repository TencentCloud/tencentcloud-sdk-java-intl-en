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

public class ImageProcessingTemplate extends AbstractModel {

    /**
    * Unique identifier of the image processing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image processing template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description information.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Array of image processing operations. Operations are performed in array order.
<li>Length limit: 3.</li>
    */
    @SerializedName("Operations")
    @Expose
    private ImageOperation [] Operations;

    /**
    * Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Unique identifier of the image processing template. 
     * @return Definition Unique identifier of the image processing template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the image processing template.
     * @param Definition Unique identifier of the image processing template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image processing template name. 
     * @return Name Image processing template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Image processing template name.
     * @param Name Image processing template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description information. 
     * @return Comment Template description information.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information.
     * @param Comment Template description information.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Array of image processing operations. Operations are performed in array order.
<li>Length limit: 3.</li> 
     * @return Operations Array of image processing operations. Operations are performed in array order.
<li>Length limit: 3.</li>
     */
    public ImageOperation [] getOperations() {
        return this.Operations;
    }

    /**
     * Set Array of image processing operations. Operations are performed in array order.
<li>Length limit: 3.</li>
     * @param Operations Array of image processing operations. Operations are performed in array order.
<li>Length limit: 3.</li>
     */
    public void setOperations(ImageOperation [] Operations) {
        this.Operations = Operations;
    }

    /**
     * Get Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ImageProcessingTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessingTemplate(ImageProcessingTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Operations != null) {
            this.Operations = new ImageOperation[source.Operations.length];
            for (int i = 0; i < source.Operations.length; i++) {
                this.Operations[i] = new ImageOperation(source.Operations[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Operations.", this.Operations);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

