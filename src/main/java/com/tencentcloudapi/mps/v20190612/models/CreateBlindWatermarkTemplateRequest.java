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

public class CreateBlindWatermarkTemplateRequest extends AbstractModel {

    /**
    * Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Text content of the digital watermark. The length cannot exceed 64 characters. After NAGRA watermark templates are created, the text content cannot be modified.
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * Digital watermark template name, which supports Chinese, English, digits, underscores (_), hyphens (-), and periods (.). The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information of the digital watermark template. The length cannot exceed 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA watermark.</li> 
     * @return Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA watermark.</li>
     * @param Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Text content of the digital watermark. The length cannot exceed 64 characters. After NAGRA watermark templates are created, the text content cannot be modified. 
     * @return TextContent Text content of the digital watermark. The length cannot exceed 64 characters. After NAGRA watermark templates are created, the text content cannot be modified.
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set Text content of the digital watermark. The length cannot exceed 64 characters. After NAGRA watermark templates are created, the text content cannot be modified.
     * @param TextContent Text content of the digital watermark. The length cannot exceed 64 characters. After NAGRA watermark templates are created, the text content cannot be modified.
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get Digital watermark template name, which supports Chinese, English, digits, underscores (_), hyphens (-), and periods (.). The length cannot exceed 64 characters. 
     * @return Name Digital watermark template name, which supports Chinese, English, digits, underscores (_), hyphens (-), and periods (.). The length cannot exceed 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Digital watermark template name, which supports Chinese, English, digits, underscores (_), hyphens (-), and periods (.). The length cannot exceed 64 characters.
     * @param Name Digital watermark template name, which supports Chinese, English, digits, underscores (_), hyphens (-), and periods (.). The length cannot exceed 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description information of the digital watermark template. The length cannot exceed 256 characters. 
     * @return Comment Description information of the digital watermark template. The length cannot exceed 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description information of the digital watermark template. The length cannot exceed 256 characters.
     * @param Comment Description information of the digital watermark template. The length cannot exceed 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateBlindWatermarkTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlindWatermarkTemplateRequest(CreateBlindWatermarkTemplateRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

