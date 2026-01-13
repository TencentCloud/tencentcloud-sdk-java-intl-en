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

public class BlindWatermarkTemplate extends AbstractModel {

    /**
    * Unique identifier of the digital watermark template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Digital watermark template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Text content of the digital watermark template. The length cannot exceed 64 characters.
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * Description information of the digital watermark template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Creation time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique identifier of the digital watermark template. 
     * @return Definition Unique identifier of the digital watermark template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the digital watermark template.
     * @param Definition Unique identifier of the digital watermark template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li> 
     * @return Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
     * @param Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Digital watermark template name. 
     * @return Name Digital watermark template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Digital watermark template name.
     * @param Name Digital watermark template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Text content of the digital watermark template. The length cannot exceed 64 characters. 
     * @return TextContent Text content of the digital watermark template. The length cannot exceed 64 characters.
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set Text content of the digital watermark template. The length cannot exceed 64 characters.
     * @param TextContent Text content of the digital watermark template. The length cannot exceed 64 characters.
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get Description information of the digital watermark template. 
     * @return Comment Description information of the digital watermark template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description information of the digital watermark template.
     * @param Comment Description information of the digital watermark template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Creation time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return CreateTime Creation time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param CreateTime Creation time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return UpdateTime Last modification time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param UpdateTime Last modification time of the digital watermark template in [ISO date and time format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BlindWatermarkTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlindWatermarkTemplate(BlindWatermarkTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

