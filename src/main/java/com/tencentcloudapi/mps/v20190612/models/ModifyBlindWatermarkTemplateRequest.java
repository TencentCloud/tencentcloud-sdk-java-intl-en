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

public class ModifyBlindWatermarkTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the digital watermark template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

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
    * Text content of the digital watermark. The length cannot exceed 64 characters. The text content cannot be modified for NAGRA watermark templates.
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

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

    /**
     * Get Text content of the digital watermark. The length cannot exceed 64 characters. The text content cannot be modified for NAGRA watermark templates. 
     * @return TextContent Text content of the digital watermark. The length cannot exceed 64 characters. The text content cannot be modified for NAGRA watermark templates.
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set Text content of the digital watermark. The length cannot exceed 64 characters. The text content cannot be modified for NAGRA watermark templates.
     * @param TextContent Text content of the digital watermark. The length cannot exceed 64 characters. The text content cannot be modified for NAGRA watermark templates.
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    public ModifyBlindWatermarkTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlindWatermarkTemplateRequest(ModifyBlindWatermarkTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);

    }
}

