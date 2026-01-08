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

public class ImportMediaKnowledgeRequest extends AbstractModel {

    /**
    * <b>Specifies the VOD application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * media file ID, the globally unique identifier of the file in vod, is assigned by the vod backend after successful upload. can be obtained from the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.tencentcloud.com//vod/media).
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Specifies the task type for importing the knowledge base. valid values:.
- AiAnalysis.DescriptionTask
- SmartSubtitle.AsrFullTextTask
    */
    @SerializedName("ImportTasks")
    @Expose
    private String [] ImportTasks;

    /**
     * Get <b>Specifies the VOD application ID.</b> 
     * @return SubAppId <b>Specifies the VOD application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>Specifies the VOD application ID.</b>
     * @param SubAppId <b>Specifies the VOD application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get media file ID, the globally unique identifier of the file in vod, is assigned by the vod backend after successful upload. can be obtained from the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.tencentcloud.com//vod/media). 
     * @return FileId media file ID, the globally unique identifier of the file in vod, is assigned by the vod backend after successful upload. can be obtained from the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.tencentcloud.com//vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set media file ID, the globally unique identifier of the file in vod, is assigned by the vod backend after successful upload. can be obtained from the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.tencentcloud.com//vod/media).
     * @param FileId media file ID, the globally unique identifier of the file in vod, is assigned by the vod backend after successful upload. can be obtained from the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.tencentcloud.com//vod/media).
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Specifies the task type for importing the knowledge base. valid values:.
- AiAnalysis.DescriptionTask
- SmartSubtitle.AsrFullTextTask 
     * @return ImportTasks Specifies the task type for importing the knowledge base. valid values:.
- AiAnalysis.DescriptionTask
- SmartSubtitle.AsrFullTextTask
     */
    public String [] getImportTasks() {
        return this.ImportTasks;
    }

    /**
     * Set Specifies the task type for importing the knowledge base. valid values:.
- AiAnalysis.DescriptionTask
- SmartSubtitle.AsrFullTextTask
     * @param ImportTasks Specifies the task type for importing the knowledge base. valid values:.
- AiAnalysis.DescriptionTask
- SmartSubtitle.AsrFullTextTask
     */
    public void setImportTasks(String [] ImportTasks) {
        this.ImportTasks = ImportTasks;
    }

    public ImportMediaKnowledgeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMediaKnowledgeRequest(ImportMediaKnowledgeRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ImportTasks != null) {
            this.ImportTasks = new String[source.ImportTasks.length];
            for (int i = 0; i < source.ImportTasks.length; i++) {
                this.ImportTasks[i] = new String(source.ImportTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamArraySimple(map, prefix + "ImportTasks.", this.ImportTasks);

    }
}

