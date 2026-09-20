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

public class KnowledgeBaseInfo extends AbstractModel {

    /**
    * <p>Knowledge base ID.</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>Knowledge base name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Repository description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Knowledge base status.</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>active: Normal</li><li>deleting: Deleting</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Creation time of the knowledge base.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>Knowledge base ID.</p> 
     * @return KnowledgeBaseId <p>Knowledge base ID.</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>Knowledge base ID.</p>
     * @param KnowledgeBaseId <p>Knowledge base ID.</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>Knowledge base name.</p> 
     * @return Name <p>Knowledge base name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Knowledge base name.</p>
     * @param Name <p>Knowledge base name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Repository description.</p> 
     * @return Description <p>Repository description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Repository description.</p>
     * @param Description <p>Repository description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Knowledge base status.</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>active: Normal</li><li>deleting: Deleting</li></ul> 
     * @return Status <p>Knowledge base status.</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>active: Normal</li><li>deleting: Deleting</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Knowledge base status.</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>active: Normal</li><li>deleting: Deleting</li></ul>
     * @param Status <p>Knowledge base status.</p><p>Enumeration values:</p><ul><li>creating: Creating</li><li>active: Normal</li><li>deleting: Deleting</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Creation time of the knowledge base.</p> 
     * @return CreateTime <p>Creation time of the knowledge base.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time of the knowledge base.</p>
     * @param CreateTime <p>Creation time of the knowledge base.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public KnowledgeBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBaseInfo(KnowledgeBaseInfo source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

