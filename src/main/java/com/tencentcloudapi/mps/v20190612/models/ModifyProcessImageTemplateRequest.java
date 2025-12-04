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

public class ModifyProcessImageTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the image processing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Image processing template name. The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description information. The length cannot exceed 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Image processing template parameter.
    */
    @SerializedName("ProcessImageTemplate")
    @Expose
    private ImageTaskInput ProcessImageTemplate;

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
     * Get Template description information. The length cannot exceed 256 characters. 
     * @return Comment Template description information. The length cannot exceed 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information. The length cannot exceed 256 characters.
     * @param Comment Template description information. The length cannot exceed 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Image processing template parameter. 
     * @return ProcessImageTemplate Image processing template parameter.
     */
    public ImageTaskInput getProcessImageTemplate() {
        return this.ProcessImageTemplate;
    }

    /**
     * Set Image processing template parameter.
     * @param ProcessImageTemplate Image processing template parameter.
     */
    public void setProcessImageTemplate(ImageTaskInput ProcessImageTemplate) {
        this.ProcessImageTemplate = ProcessImageTemplate;
    }

    public ModifyProcessImageTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProcessImageTemplateRequest(ModifyProcessImageTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ProcessImageTemplate != null) {
            this.ProcessImageTemplate = new ImageTaskInput(source.ProcessImageTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ProcessImageTemplate.", this.ProcessImageTemplate);

    }
}

