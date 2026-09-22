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
    * <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Unique identifier of the large model understanding template</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>List of knowledge base IDs. If left blank, the default knowledge base will be used.</p>
    */
    @SerializedName("KnowledgeBaseIds")
    @Expose
    private String [] KnowledgeBaseIds;

    /**
    * <p>Task types that need to import knowledge base. Optional values:</p><ul><li>AiAnalysis.DescriptionTask</li><li>SmartSubtitle.AsrFullTextTask</li></ul>
    */
    @SerializedName("ImportTasks")
    @Expose
    private String [] ImportTasks;

    /**
     * Get <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p> 
     * @return SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     * @param SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p> 
     * @return FileId <p>Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     * @param FileId <p>Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Unique identifier of the large model understanding template</p> 
     * @return Definition <p>Unique identifier of the large model understanding template</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of the large model understanding template</p>
     * @param Definition <p>Unique identifier of the large model understanding template</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>List of knowledge base IDs. If left blank, the default knowledge base will be used.</p> 
     * @return KnowledgeBaseIds <p>List of knowledge base IDs. If left blank, the default knowledge base will be used.</p>
     */
    public String [] getKnowledgeBaseIds() {
        return this.KnowledgeBaseIds;
    }

    /**
     * Set <p>List of knowledge base IDs. If left blank, the default knowledge base will be used.</p>
     * @param KnowledgeBaseIds <p>List of knowledge base IDs. If left blank, the default knowledge base will be used.</p>
     */
    public void setKnowledgeBaseIds(String [] KnowledgeBaseIds) {
        this.KnowledgeBaseIds = KnowledgeBaseIds;
    }

    /**
     * Get <p>Task types that need to import knowledge base. Optional values:</p><ul><li>AiAnalysis.DescriptionTask</li><li>SmartSubtitle.AsrFullTextTask</li></ul> 
     * @return ImportTasks <p>Task types that need to import knowledge base. Optional values:</p><ul><li>AiAnalysis.DescriptionTask</li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     * @deprecated
     */
    @Deprecated
    public String [] getImportTasks() {
        return this.ImportTasks;
    }

    /**
     * Set <p>Task types that need to import knowledge base. Optional values:</p><ul><li>AiAnalysis.DescriptionTask</li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     * @param ImportTasks <p>Task types that need to import knowledge base. Optional values:</p><ul><li>AiAnalysis.DescriptionTask</li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     * @deprecated
     */
    @Deprecated
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
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.KnowledgeBaseIds != null) {
            this.KnowledgeBaseIds = new String[source.KnowledgeBaseIds.length];
            for (int i = 0; i < source.KnowledgeBaseIds.length; i++) {
                this.KnowledgeBaseIds[i] = new String(source.KnowledgeBaseIds[i]);
            }
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "KnowledgeBaseIds.", this.KnowledgeBaseIds);
        this.setParamArraySimple(map, prefix + "ImportTasks.", this.ImportTasks);

    }
}

