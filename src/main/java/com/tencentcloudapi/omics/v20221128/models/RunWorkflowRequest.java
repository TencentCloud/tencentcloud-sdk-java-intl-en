/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunWorkflowRequest extends AbstractModel {

    /**
    * Run group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Delivery environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Workflow Git repository information
    */
    @SerializedName("GitSource")
    @Expose
    private GitInfo GitSource;

    /**
    * Workflow type

Supported type:
- NEXTFLOW
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Nextflow option
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
    * Project ID
(If you leave it blank, the default item in the specified region will be used.)
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Run group description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Run input JSON. Base64 encoding is required.
(Either InputBase64 or InputCosUri must be selected.)
    */
    @SerializedName("InputBase64")
    @Expose
    private String InputBase64;

    /**
    * Run input COS path
(Either InputBase64 or InputCosUri must be selected.)
    */
    @SerializedName("InputCosUri")
    @Expose
    private String InputCosUri;

    /**
    * Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
    * Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
    */
    @SerializedName("VolumeIds")
    @Expose
    private String [] VolumeIds;

    /**
     * Get Run group name 
     * @return Name Run group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Run group name
     * @param Name Run group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Delivery environment ID 
     * @return EnvironmentId Delivery environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Delivery environment ID
     * @param EnvironmentId Delivery environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Workflow Git repository information 
     * @return GitSource Workflow Git repository information
     */
    public GitInfo getGitSource() {
        return this.GitSource;
    }

    /**
     * Set Workflow Git repository information
     * @param GitSource Workflow Git repository information
     */
    public void setGitSource(GitInfo GitSource) {
        this.GitSource = GitSource;
    }

    /**
     * Get Workflow type

Supported type:
- NEXTFLOW 
     * @return Type Workflow type

Supported type:
- NEXTFLOW
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Workflow type

Supported type:
- NEXTFLOW
     * @param Type Workflow type

Supported type:
- NEXTFLOW
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Nextflow option 
     * @return NFOption Nextflow option
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow option
     * @param NFOption Nextflow option
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    /**
     * Get Project ID
(If you leave it blank, the default item in the specified region will be used.) 
     * @return ProjectId Project ID
(If you leave it blank, the default item in the specified region will be used.)
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
(If you leave it blank, the default item in the specified region will be used.)
     * @param ProjectId Project ID
(If you leave it blank, the default item in the specified region will be used.)
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Run group description 
     * @return Description Run group description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Run group description
     * @param Description Run group description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Run input JSON. Base64 encoding is required.
(Either InputBase64 or InputCosUri must be selected.) 
     * @return InputBase64 Run input JSON. Base64 encoding is required.
(Either InputBase64 or InputCosUri must be selected.)
     */
    public String getInputBase64() {
        return this.InputBase64;
    }

    /**
     * Set Run input JSON. Base64 encoding is required.
(Either InputBase64 or InputCosUri must be selected.)
     * @param InputBase64 Run input JSON. Base64 encoding is required.
(Either InputBase64 or InputCosUri must be selected.)
     */
    public void setInputBase64(String InputBase64) {
        this.InputBase64 = InputBase64;
    }

    /**
     * Get Run input COS path
(Either InputBase64 or InputCosUri must be selected.) 
     * @return InputCosUri Run input COS path
(Either InputBase64 or InputCosUri must be selected.)
     */
    public String getInputCosUri() {
        return this.InputCosUri;
    }

    /**
     * Set Run input COS path
(Either InputBase64 or InputCosUri must be selected.)
     * @param InputCosUri Run input COS path
(Either InputBase64 or InputCosUri must be selected.)
     */
    public void setInputCosUri(String InputCosUri) {
        this.InputCosUri = InputCosUri;
    }

    /**
     * Get Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup. 
     * @return CacheClearDelay Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
     * @param CacheClearDelay Run cache cleanup time (hours). Leaving it blank or entering 0 indicates no cleanup.
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    /**
     * Get Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported. 
     * @return WorkDir Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
     * @param WorkDir Working directory. You can fill in the absolute path in the specified volume. If you leave it blank, the default path in the default volume will be used. Currently, only Nextflow is supported.
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    /**
     * Get Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported. 
     * @return VolumeIds Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
     */
    public String [] getVolumeIds() {
        return this.VolumeIds;
    }

    /**
     * Set Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
     * @param VolumeIds Volume ID. If you leave it blank, the default volume will be used. Currently, only Nextflow is supported.
     */
    public void setVolumeIds(String [] VolumeIds) {
        this.VolumeIds = VolumeIds;
    }

    public RunWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunWorkflowRequest(RunWorkflowRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.GitSource != null) {
            this.GitSource = new GitInfo(source.GitSource);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputBase64 != null) {
            this.InputBase64 = new String(source.InputBase64);
        }
        if (source.InputCosUri != null) {
            this.InputCosUri = new String(source.InputCosUri);
        }
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.VolumeIds != null) {
            this.VolumeIds = new String[source.VolumeIds.length];
            for (int i = 0; i < source.VolumeIds.length; i++) {
                this.VolumeIds[i] = new String(source.VolumeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamObj(map, prefix + "GitSource.", this.GitSource);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InputBase64", this.InputBase64);
        this.setParamSimple(map, prefix + "InputCosUri", this.InputCosUri);
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamArraySimple(map, prefix + "VolumeIds.", this.VolumeIds);

    }
}

