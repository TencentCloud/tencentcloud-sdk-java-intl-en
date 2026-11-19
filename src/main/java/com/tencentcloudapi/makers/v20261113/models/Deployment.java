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

public class Deployment extends AbstractModel {

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
    * <p>Success,Failed,Process,Invalid,Pending,Timeout,Cancelled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Original status before deployment removal</p>
    */
    @SerializedName("OriginalStatus")
    @Expose
    private String OriginalStatus;

    /**
    * <p>Build exit code. 0 indicates success</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>Build duration, in milliseconds.</p>
    */
    @SerializedName("BuildCost")
    @Expose
    private String BuildCost;

    /**
    * <p>Trigger source. Github, ReDeploy, Api, Coding, Gitee, Upload, Gitlab</p>
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
    * <p>Access address of this deployment</p>
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * <p>Default domain address of the project</p>
    */
    @SerializedName("ProjectUrl")
    @Expose
    private String ProjectUrl;

    /**
    * <p>Whether it is the current production version</p>
    */
    @SerializedName("UsedInProd")
    @Expose
    private Boolean UsedInProd;

    /**
    * <p>Address of a cover</p>
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * <p>Routing configuration, JSON string</p>
    */
    @SerializedName("MetaData")
    @Expose
    private String MetaData;

    /**
    * <p>Repository address used for this deployment</p>
    */
    @SerializedName("DplRepoUrl")
    @Expose
    private String DplRepoUrl;

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
     * Get <p>Success,Failed,Process,Invalid,Pending,Timeout,Cancelled</p> 
     * @return Status <p>Success,Failed,Process,Invalid,Pending,Timeout,Cancelled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Success,Failed,Process,Invalid,Pending,Timeout,Cancelled</p>
     * @param Status <p>Success,Failed,Process,Invalid,Pending,Timeout,Cancelled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Original status before deployment removal</p> 
     * @return OriginalStatus <p>Original status before deployment removal</p>
     */
    public String getOriginalStatus() {
        return this.OriginalStatus;
    }

    /**
     * Set <p>Original status before deployment removal</p>
     * @param OriginalStatus <p>Original status before deployment removal</p>
     */
    public void setOriginalStatus(String OriginalStatus) {
        this.OriginalStatus = OriginalStatus;
    }

    /**
     * Get <p>Build exit code. 0 indicates success</p> 
     * @return Code <p>Build exit code. 0 indicates success</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>Build exit code. 0 indicates success</p>
     * @param Code <p>Build exit code. 0 indicates success</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
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
     * Get <p>Trigger source. Github, ReDeploy, Api, Coding, Gitee, Upload, Gitlab</p> 
     * @return ViaMeta <p>Trigger source. Github, ReDeploy, Api, Coding, Gitee, Upload, Gitlab</p>
     */
    public String getViaMeta() {
        return this.ViaMeta;
    }

    /**
     * Set <p>Trigger source. Github, ReDeploy, Api, Coding, Gitee, Upload, Gitlab</p>
     * @param ViaMeta <p>Trigger source. Github, ReDeploy, Api, Coding, Gitee, Upload, Gitlab</p>
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
     * Get <p>Access address of this deployment</p> 
     * @return PreviewUrl <p>Access address of this deployment</p>
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set <p>Access address of this deployment</p>
     * @param PreviewUrl <p>Access address of this deployment</p>
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get <p>Default domain address of the project</p> 
     * @return ProjectUrl <p>Default domain address of the project</p>
     */
    public String getProjectUrl() {
        return this.ProjectUrl;
    }

    /**
     * Set <p>Default domain address of the project</p>
     * @param ProjectUrl <p>Default domain address of the project</p>
     */
    public void setProjectUrl(String ProjectUrl) {
        this.ProjectUrl = ProjectUrl;
    }

    /**
     * Get <p>Whether it is the current production version</p> 
     * @return UsedInProd <p>Whether it is the current production version</p>
     */
    public Boolean getUsedInProd() {
        return this.UsedInProd;
    }

    /**
     * Set <p>Whether it is the current production version</p>
     * @param UsedInProd <p>Whether it is the current production version</p>
     */
    public void setUsedInProd(Boolean UsedInProd) {
        this.UsedInProd = UsedInProd;
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
     * Get <p>Routing configuration, JSON string</p> 
     * @return MetaData <p>Routing configuration, JSON string</p>
     */
    public String getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>Routing configuration, JSON string</p>
     * @param MetaData <p>Routing configuration, JSON string</p>
     */
    public void setMetaData(String MetaData) {
        this.MetaData = MetaData;
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

    public Deployment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Deployment(Deployment source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OriginalStatus != null) {
            this.OriginalStatus = new String(source.OriginalStatus);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
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
        if (source.ProjectUrl != null) {
            this.ProjectUrl = new String(source.ProjectUrl);
        }
        if (source.UsedInProd != null) {
            this.UsedInProd = new Boolean(source.UsedInProd);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.MetaData != null) {
            this.MetaData = new String(source.MetaData);
        }
        if (source.DplRepoUrl != null) {
            this.DplRepoUrl = new String(source.DplRepoUrl);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginalStatus", this.OriginalStatus);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "BuildCost", this.BuildCost);
        this.setParamSimple(map, prefix + "ViaMeta", this.ViaMeta);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamSimple(map, prefix + "RepoCommitHash", this.RepoCommitHash);
        this.setParamSimple(map, prefix + "RepoCommitMsg", this.RepoCommitMsg);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "ProjectUrl", this.ProjectUrl);
        this.setParamSimple(map, prefix + "UsedInProd", this.UsedInProd);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "MetaData", this.MetaData);
        this.setParamSimple(map, prefix + "DplRepoUrl", this.DplRepoUrl);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

