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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArtifactInfo extends AbstractModel {

    /**
    * <p>Product ID</p>
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
    * <p>Product name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Physical type</p>
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
    * <p>File size (byte)</p>
    */
    @SerializedName("SizeBytes")
    @Expose
    private Long SizeBytes;

    /**
    * <p>Whether it is public</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * <p>Creation time (Unix timestamp in seconds).</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * <p>Agent ID that generated the artifact</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Skill ID that generates the artifact</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>For parsing calls to the download API</p>
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
     * Get <p>Product ID</p> 
     * @return ArtifactId <p>Product ID</p>
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>Product ID</p>
     * @param ArtifactId <p>Product ID</p>
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    /**
     * Get <p>Product name</p> 
     * @return Name <p>Product name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Product name</p>
     * @param Name <p>Product name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Physical type</p> 
     * @return MimeType <p>Physical type</p>
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set <p>Physical type</p>
     * @param MimeType <p>Physical type</p>
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * Get <p>File size (byte)</p> 
     * @return SizeBytes <p>File size (byte)</p>
     */
    public Long getSizeBytes() {
        return this.SizeBytes;
    }

    /**
     * Set <p>File size (byte)</p>
     * @param SizeBytes <p>File size (byte)</p>
     */
    public void setSizeBytes(Long SizeBytes) {
        this.SizeBytes = SizeBytes;
    }

    /**
     * Get <p>Whether it is public</p> 
     * @return IsGlobal <p>Whether it is public</p>
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>Whether it is public</p>
     * @param IsGlobal <p>Whether it is public</p>
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>Creation time (Unix timestamp in seconds).</p> 
     * @return CreatedAt <p>Creation time (Unix timestamp in seconds).</p>
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Creation time (Unix timestamp in seconds).</p>
     * @param CreatedAt <p>Creation time (Unix timestamp in seconds).</p>
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return UpdatedAt <p>Modification time.</p>
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>Modification time.</p>
     * @param UpdatedAt <p>Modification time.</p>
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>Agent ID that generated the artifact</p> 
     * @return AgentId <p>Agent ID that generated the artifact</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID that generated the artifact</p>
     * @param AgentId <p>Agent ID that generated the artifact</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Skill ID that generates the artifact</p> 
     * @return SkillId <p>Skill ID that generates the artifact</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>Skill ID that generates the artifact</p>
     * @param SkillId <p>Skill ID that generates the artifact</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>For parsing calls to the download API</p> 
     * @return StoragePath <p>For parsing calls to the download API</p>
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set <p>For parsing calls to the download API</p>
     * @param StoragePath <p>For parsing calls to the download API</p>
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    public ArtifactInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArtifactInfo(ArtifactInfo source) {
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
        if (source.SizeBytes != null) {
            this.SizeBytes = new Long(source.SizeBytes);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);
        this.setParamSimple(map, prefix + "SizeBytes", this.SizeBytes);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);

    }
}

