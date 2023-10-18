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

public class ImageProcessingTemplate extends AbstractModel {

    /**
    * The template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The template type. Valid values:
<li>Preset</li>
<li>Custom</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    * An array of image processing operations. The operations will be performed in the specified order.
<li>Length limit: 3.</li>
    */
    @SerializedName("Operations")
    @Expose
    private ImageOperation [] Operations;

    /**
    * The template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?lang=en&pg=#iso-date-format).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get The template ID. 
     * @return Definition The template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The template ID.
     * @param Definition The template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * Get An array of image processing operations. The operations will be performed in the specified order.
<li>Length limit: 3.</li> 
     * @return Operations An array of image processing operations. The operations will be performed in the specified order.
<li>Length limit: 3.</li>
     */
    public ImageOperation [] getOperations() {
        return this.Operations;
    }

    /**
     * Set An array of image processing operations. The operations will be performed in the specified order.
<li>Length limit: 3.</li>
     * @param Operations An array of image processing operations. The operations will be performed in the specified order.
<li>Length limit: 3.</li>
     */
    public void setOperations(ImageOperation [] Operations) {
        this.Operations = Operations;
    }

    /**
     * Get The template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?lang=en&pg=#iso-date-format). 
     * @return CreateTime The template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?lang=en&pg=#iso-date-format).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?lang=en&pg=#iso-date-format).
     * @param CreateTime The template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?lang=en&pg=#iso-date-format).
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

