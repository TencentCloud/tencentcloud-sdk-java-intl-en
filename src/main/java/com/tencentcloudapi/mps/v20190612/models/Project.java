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

public class Project extends AbstractModel {

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>Project name.</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>Project description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Project term base.</p>
    */
    @SerializedName("TermBase")
    @Expose
    private TermBase [] TermBase;

    /**
    * <p>List of characters.</p>
    */
    @SerializedName("Speakers")
    @Expose
    private Speakers [] Speakers;

    /**
    * <p>Creation time (Unix timestamp).</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * <p>Update time (Unix timestamp).</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Project name.</p> 
     * @return ProjectName <p>Project name.</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>Project name.</p>
     * @param ProjectName <p>Project name.</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>Project description.</p> 
     * @return Description <p>Project description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Project description.</p>
     * @param Description <p>Project description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Project term base.</p> 
     * @return TermBase <p>Project term base.</p>
     */
    public TermBase [] getTermBase() {
        return this.TermBase;
    }

    /**
     * Set <p>Project term base.</p>
     * @param TermBase <p>Project term base.</p>
     */
    public void setTermBase(TermBase [] TermBase) {
        this.TermBase = TermBase;
    }

    /**
     * Get <p>List of characters.</p> 
     * @return Speakers <p>List of characters.</p>
     */
    public Speakers [] getSpeakers() {
        return this.Speakers;
    }

    /**
     * Set <p>List of characters.</p>
     * @param Speakers <p>List of characters.</p>
     */
    public void setSpeakers(Speakers [] Speakers) {
        this.Speakers = Speakers;
    }

    /**
     * Get <p>Creation time (Unix timestamp).</p> 
     * @return CreatedAt <p>Creation time (Unix timestamp).</p>
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Creation time (Unix timestamp).</p>
     * @param CreatedAt <p>Creation time (Unix timestamp).</p>
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Update time (Unix timestamp).</p> 
     * @return UpdatedAt <p>Update time (Unix timestamp).</p>
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>Update time (Unix timestamp).</p>
     * @param UpdatedAt <p>Update time (Unix timestamp).</p>
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TermBase != null) {
            this.TermBase = new TermBase[source.TermBase.length];
            for (int i = 0; i < source.TermBase.length; i++) {
                this.TermBase[i] = new TermBase(source.TermBase[i]);
            }
        }
        if (source.Speakers != null) {
            this.Speakers = new Speakers[source.Speakers.length];
            for (int i = 0; i < source.Speakers.length; i++) {
                this.Speakers[i] = new Speakers(source.Speakers[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "TermBase.", this.TermBase);
        this.setParamArrayObj(map, prefix + "Speakers.", this.Speakers);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

