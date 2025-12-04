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

public class ProcessImageTemplate extends AbstractModel {

    /**
    * Unique identifier of the image processing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Image processing template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information of the image processing template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image processing template configuration parameter.
    */
    @SerializedName("ProcessImageConfig")
    @Expose
    private ImageTaskInput ProcessImageConfig;

    /**
    * Template creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the template.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get Description information of the image processing template. 
     * @return Comment Description information of the image processing template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description information of the image processing template.
     * @param Comment Description information of the image processing template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. 
     * @return Type Template type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type.
     * @param Type Template type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image processing template configuration parameter. 
     * @return ProcessImageConfig Image processing template configuration parameter.
     */
    public ImageTaskInput getProcessImageConfig() {
        return this.ProcessImageConfig;
    }

    /**
     * Set Image processing template configuration parameter.
     * @param ProcessImageConfig Image processing template configuration parameter.
     */
    public void setProcessImageConfig(ImageTaskInput ProcessImageConfig) {
        this.ProcessImageConfig = ProcessImageConfig;
    }

    /**
     * Get Template creation time. 
     * @return CreateTime Template creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time.
     * @param CreateTime Template creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the template. 
     * @return UpdateTime Last modification time of the template.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the template.
     * @param UpdateTime Last modification time of the template.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProcessImageTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageTemplate(ProcessImageTemplate source) {
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
        if (source.ProcessImageConfig != null) {
            this.ProcessImageConfig = new ImageTaskInput(source.ProcessImageConfig);
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
        this.setParamObj(map, prefix + "ProcessImageConfig.", this.ProcessImageConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

