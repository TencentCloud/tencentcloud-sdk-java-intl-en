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

public class LLMComprehendTemplateItem extends AbstractModel {

    /**
    * Unique identifier of the image asynchronous processing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Image async processing template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information of the image asynchronous processing template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Parsing level. Optional values:
-Audio: Audio-level parsing
-Video: Video-level parsing
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Segment summary parsing configuration
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummary Summary;

    /**
    * Text transcription parsing configuration
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsr Asr;

    /**
    * Template creation time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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
     * Get Unique identifier of the image asynchronous processing template. 
     * @return Definition Unique identifier of the image asynchronous processing template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the image asynchronous processing template.
     * @param Definition Unique identifier of the image asynchronous processing template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * Get Description information of the image asynchronous processing template. 
     * @return Comment Description information of the image asynchronous processing template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description information of the image asynchronous processing template.
     * @param Comment Description information of the image asynchronous processing template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Parsing level. Optional values:
-Audio: Audio-level parsing
-Video: Video-level parsing 
     * @return Level Parsing level. Optional values:
-Audio: Audio-level parsing
-Video: Video-level parsing
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Parsing level. Optional values:
-Audio: Audio-level parsing
-Video: Video-level parsing
     * @param Level Parsing level. Optional values:
-Audio: Audio-level parsing
-Video: Video-level parsing
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Segment summary parsing configuration 
     * @return Summary Segment summary parsing configuration
     */
    public LLMComprehendSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set Segment summary parsing configuration
     * @param Summary Segment summary parsing configuration
     */
    public void setSummary(LLMComprehendSummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get Text transcription parsing configuration 
     * @return Asr Text transcription parsing configuration
     */
    public LLMComprehendAsr getAsr() {
        return this.Asr;
    }

    /**
     * Set Text transcription parsing configuration
     * @param Asr Text transcription parsing configuration
     */
    public void setAsr(LLMComprehendAsr Asr) {
        this.Asr = Asr;
    }

    /**
     * Get Template creation time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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

    public LLMComprehendTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMComprehendTemplateItem(LLMComprehendTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Summary != null) {
            this.Summary = new LLMComprehendSummary(source.Summary);
        }
        if (source.Asr != null) {
            this.Asr = new LLMComprehendAsr(source.Asr);
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
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Asr.", this.Asr);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

