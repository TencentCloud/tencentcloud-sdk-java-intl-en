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

public class ProcessImageAsyncTemplateItem extends AbstractModel {

    /**
    * Template unique identifier for asynchronous image processing.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image async processing template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information of the image async processing template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Image async processing template configuration.
    */
    @SerializedName("ProcessImageConfigure")
    @Expose
    private ProcessImageAsyncTask ProcessImageConfigure;

    /**
     * Get Template unique identifier for asynchronous image processing. 
     * @return Definition Template unique identifier for asynchronous image processing.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template unique identifier for asynchronous image processing.
     * @param Definition Template unique identifier for asynchronous image processing.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * Get Image async processing template name. 
     * @return Name Image async processing template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Image async processing template name.
     * @param Name Image async processing template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description information of the image async processing template. 
     * @return Comment Description information of the image async processing template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description information of the image async processing template.
     * @param Comment Description information of the image async processing template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
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

    /**
     * Get Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Image async processing template configuration. 
     * @return ProcessImageConfigure Image async processing template configuration.
     */
    public ProcessImageAsyncTask getProcessImageConfigure() {
        return this.ProcessImageConfigure;
    }

    /**
     * Set Image async processing template configuration.
     * @param ProcessImageConfigure Image async processing template configuration.
     */
    public void setProcessImageConfigure(ProcessImageAsyncTask ProcessImageConfigure) {
        this.ProcessImageConfigure = ProcessImageConfigure;
    }

    public ProcessImageAsyncTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncTemplateItem(ProcessImageAsyncTemplateItem source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ProcessImageConfigure != null) {
            this.ProcessImageConfigure = new ProcessImageAsyncTask(source.ProcessImageConfigure);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "ProcessImageConfigure.", this.ProcessImageConfigure);

    }
}

