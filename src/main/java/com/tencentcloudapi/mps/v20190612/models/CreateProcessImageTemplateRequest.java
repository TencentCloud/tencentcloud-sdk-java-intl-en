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

public class CreateProcessImageTemplateRequest extends AbstractModel {

    /**
    * Image processing template.
    */
    @SerializedName("ProcessImageTemplate")
    @Expose
    private ImageTaskInput ProcessImageTemplate;

    /**
    * Image processing template name. The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information of the image processing template. The length cannot exceed 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Image processing template. 
     * @return ProcessImageTemplate Image processing template.
     */
    public ImageTaskInput getProcessImageTemplate() {
        return this.ProcessImageTemplate;
    }

    /**
     * Set Image processing template.
     * @param ProcessImageTemplate Image processing template.
     */
    public void setProcessImageTemplate(ImageTaskInput ProcessImageTemplate) {
        this.ProcessImageTemplate = ProcessImageTemplate;
    }

    /**
     * Get Image processing template name. The length cannot exceed 64 characters. 
     * @return Name Image processing template name. The length cannot exceed 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Image processing template name. The length cannot exceed 64 characters.
     * @param Name Image processing template name. The length cannot exceed 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description information of the image processing template. The length cannot exceed 256 characters. 
     * @return Comment Description information of the image processing template. The length cannot exceed 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description information of the image processing template. The length cannot exceed 256 characters.
     * @param Comment Description information of the image processing template. The length cannot exceed 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateProcessImageTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProcessImageTemplateRequest(CreateProcessImageTemplateRequest source) {
        if (source.ProcessImageTemplate != null) {
            this.ProcessImageTemplate = new ImageTaskInput(source.ProcessImageTemplate);
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
        this.setParamObj(map, prefix + "ProcessImageTemplate.", this.ProcessImageTemplate);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

