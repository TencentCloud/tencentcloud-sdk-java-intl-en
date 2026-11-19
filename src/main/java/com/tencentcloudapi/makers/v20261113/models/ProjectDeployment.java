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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectDeployment extends AbstractModel {

    /**
    * <p>Deployment ID</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>Deployment state</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Build duration, in milliseconds.</p>
    */
    @SerializedName("BuildCost")
    @Expose
    private String BuildCost;

    /**
    * <p>Trigger source.</p>
    */
    @SerializedName("ViaMeta")
    @Expose
    private String ViaMeta;

    /**
    * <p>Environment slug</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>Branch</p>
    */
    @SerializedName("RepoBranch")
    @Expose
    private String RepoBranch;

    /**
    * <p>Submit hash</p>
    */
    @SerializedName("RepoCommitHash")
    @Expose
    private String RepoCommitHash;

    /**
    * <p>Commit description</p>
    */
    @SerializedName("RepoCommitMsg")
    @Expose
    private String RepoCommitMsg;

    /**
    * <p>Preview address</p>
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * <p>Address of a cover</p>
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * <p>Repository address used for this deployment</p>
    */
    @SerializedName("DplRepoUrl")
    @Expose
    private String DplRepoUrl;

    /**
     * Get <p>Deployment ID</p> 
     * @return DeploymentId <p>Deployment ID</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>Deployment ID</p>
     * @param DeploymentId <p>Deployment ID</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Deployment state</p> 
     * @return Status <p>Deployment state</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Deployment state</p>
     * @param Status <p>Deployment state</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Build duration, in milliseconds.</p> 
     * @return BuildCost <p>Build duration, in milliseconds.</p>
     */
    public String getBuildCost() {
        return this.BuildCost;
    }

    /**
     * Set <p>Build duration, in milliseconds.</p>
     * @param BuildCost <p>Build duration, in milliseconds.</p>
     */
    public void setBuildCost(String BuildCost) {
        this.BuildCost = BuildCost;
    }

    /**
     * Get <p>Trigger source.</p> 
     * @return ViaMeta <p>Trigger source.</p>
     */
    public String getViaMeta() {
        return this.ViaMeta;
    }

    /**
     * Set <p>Trigger source.</p>
     * @param ViaMeta <p>Trigger source.</p>
     */
    public void setViaMeta(String ViaMeta) {
        this.ViaMeta = ViaMeta;
    }

    /**
     * Get <p>Environment slug</p> 
     * @return Env <p>Environment slug</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>Environment slug</p>
     * @param Env <p>Environment slug</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>Branch</p> 
     * @return RepoBranch <p>Branch</p>
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>Branch</p>
     * @param RepoBranch <p>Branch</p>
     */
    public void setRepoBranch(String RepoBranch) {
        this.RepoBranch = RepoBranch;
    }

    /**
     * Get <p>Submit hash</p> 
     * @return RepoCommitHash <p>Submit hash</p>
     */
    public String getRepoCommitHash() {
        return this.RepoCommitHash;
    }

    /**
     * Set <p>Submit hash</p>
     * @param RepoCommitHash <p>Submit hash</p>
     */
    public void setRepoCommitHash(String RepoCommitHash) {
        this.RepoCommitHash = RepoCommitHash;
    }

    /**
     * Get <p>Commit description</p> 
     * @return RepoCommitMsg <p>Commit description</p>
     */
    public String getRepoCommitMsg() {
        return this.RepoCommitMsg;
    }

    /**
     * Set <p>Commit description</p>
     * @param RepoCommitMsg <p>Commit description</p>
     */
    public void setRepoCommitMsg(String RepoCommitMsg) {
        this.RepoCommitMsg = RepoCommitMsg;
    }

    /**
     * Get <p>Preview address</p> 
     * @return PreviewUrl <p>Preview address</p>
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set <p>Preview address</p>
     * @param PreviewUrl <p>Preview address</p>
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get <p>Address of a cover</p> 
     * @return CoverUrl <p>Address of a cover</p>
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set <p>Address of a cover</p>
     * @param CoverUrl <p>Address of a cover</p>
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedOn <p>Creation time.</p>
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedOn <p>Creation time.</p>
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>Update time.</p> 
     * @return ModifiedOn <p>Update time.</p>
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>Update time.</p>
     * @param ModifiedOn <p>Update time.</p>
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get <p>Repository address used for this deployment</p> 
     * @return DplRepoUrl <p>Repository address used for this deployment</p>
     */
    public String getDplRepoUrl() {
        return this.DplRepoUrl;
    }

    /**
     * Set <p>Repository address used for this deployment</p>
     * @param DplRepoUrl <p>Repository address used for this deployment</p>
     */
    public void setDplRepoUrl(String DplRepoUrl) {
        this.DplRepoUrl = DplRepoUrl;
    }

    public ProjectDeployment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectDeployment(ProjectDeployment source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BuildCost != null) {
            this.BuildCost = new String(source.BuildCost);
        }
        if (source.ViaMeta != null) {
            this.ViaMeta = new String(source.ViaMeta);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.RepoBranch != null) {
            this.RepoBranch = new String(source.RepoBranch);
        }
        if (source.RepoCommitHash != null) {
            this.RepoCommitHash = new String(source.RepoCommitHash);
        }
        if (source.RepoCommitMsg != null) {
            this.RepoCommitMsg = new String(source.RepoCommitMsg);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.DplRepoUrl != null) {
            this.DplRepoUrl = new String(source.DplRepoUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BuildCost", this.BuildCost);
        this.setParamSimple(map, prefix + "ViaMeta", this.ViaMeta);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamSimple(map, prefix + "RepoCommitHash", this.RepoCommitHash);
        this.setParamSimple(map, prefix + "RepoCommitMsg", this.RepoCommitMsg);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "DplRepoUrl", this.DplRepoUrl);

    }
}

