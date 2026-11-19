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

public class CreateDeploymentRequest extends AbstractModel {

    /**
    * <p>Makers site ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>Trigger source. Github, ReDeploy, Api, Webhook, Upload, Coding, Gitee, Gitlab</p>
    */
    @SerializedName("ViaMeta")
    @Expose
    private String ViaMeta;

    /**
    * <p>Environment slug. Production, Preview, or custom environment</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>Code source. For upload artifact, pass Upload.</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Artifact type. Zip or Folder</p>
    */
    @SerializedName("DistType")
    @Expose
    private String DistType;

    /**
    * <p>Object path of the uploaded artifact in the temporary bucket</p>
    */
    @SerializedName("TempBucketPath")
    @Expose
    private String TempBucketPath;

    /**
    * <p>Build branch</p>
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
    * <p>Build source</p>
    */
    @SerializedName("BuildFrom")
    @Expose
    private String BuildFrom;

    /**
    * <p>Template ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Build specification. The current server still reads from edgeone.json. This field is reserved for now.</p>
    */
    @SerializedName("CiSpec")
    @Expose
    private String CiSpec;

    /**
     * Get <p>Makers site ID</p> 
     * @return ZoneId <p>Makers site ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers site ID</p>
     * @param ZoneId <p>Makers site ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get <p>Trigger source. Github, ReDeploy, Api, Webhook, Upload, Coding, Gitee, Gitlab</p> 
     * @return ViaMeta <p>Trigger source. Github, ReDeploy, Api, Webhook, Upload, Coding, Gitee, Gitlab</p>
     */
    public String getViaMeta() {
        return this.ViaMeta;
    }

    /**
     * Set <p>Trigger source. Github, ReDeploy, Api, Webhook, Upload, Coding, Gitee, Gitlab</p>
     * @param ViaMeta <p>Trigger source. Github, ReDeploy, Api, Webhook, Upload, Coding, Gitee, Gitlab</p>
     */
    public void setViaMeta(String ViaMeta) {
        this.ViaMeta = ViaMeta;
    }

    /**
     * Get <p>Environment slug. Production, Preview, or custom environment</p> 
     * @return Env <p>Environment slug. Production, Preview, or custom environment</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>Environment slug. Production, Preview, or custom environment</p>
     * @param Env <p>Environment slug. Production, Preview, or custom environment</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>Code source. For upload artifact, pass Upload.</p> 
     * @return Provider <p>Code source. For upload artifact, pass Upload.</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Code source. For upload artifact, pass Upload.</p>
     * @param Provider <p>Code source. For upload artifact, pass Upload.</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Artifact type. Zip or Folder</p> 
     * @return DistType <p>Artifact type. Zip or Folder</p>
     */
    public String getDistType() {
        return this.DistType;
    }

    /**
     * Set <p>Artifact type. Zip or Folder</p>
     * @param DistType <p>Artifact type. Zip or Folder</p>
     */
    public void setDistType(String DistType) {
        this.DistType = DistType;
    }

    /**
     * Get <p>Object path of the uploaded artifact in the temporary bucket</p> 
     * @return TempBucketPath <p>Object path of the uploaded artifact in the temporary bucket</p>
     */
    public String getTempBucketPath() {
        return this.TempBucketPath;
    }

    /**
     * Set <p>Object path of the uploaded artifact in the temporary bucket</p>
     * @param TempBucketPath <p>Object path of the uploaded artifact in the temporary bucket</p>
     */
    public void setTempBucketPath(String TempBucketPath) {
        this.TempBucketPath = TempBucketPath;
    }

    /**
     * Get <p>Build branch</p> 
     * @return RepoBranch <p>Build branch</p>
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>Build branch</p>
     * @param RepoBranch <p>Build branch</p>
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
     * Get <p>Build source</p> 
     * @return BuildFrom <p>Build source</p>
     */
    public String getBuildFrom() {
        return this.BuildFrom;
    }

    /**
     * Set <p>Build source</p>
     * @param BuildFrom <p>Build source</p>
     */
    public void setBuildFrom(String BuildFrom) {
        this.BuildFrom = BuildFrom;
    }

    /**
     * Get <p>Template ID</p> 
     * @return TemplateId <p>Template ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Template ID</p>
     * @param TemplateId <p>Template ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Build specification. The current server still reads from edgeone.json. This field is reserved for now.</p> 
     * @return CiSpec <p>Build specification. The current server still reads from edgeone.json. This field is reserved for now.</p>
     */
    public String getCiSpec() {
        return this.CiSpec;
    }

    /**
     * Set <p>Build specification. The current server still reads from edgeone.json. This field is reserved for now.</p>
     * @param CiSpec <p>Build specification. The current server still reads from edgeone.json. This field is reserved for now.</p>
     */
    public void setCiSpec(String CiSpec) {
        this.CiSpec = CiSpec;
    }

    public CreateDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeploymentRequest(CreateDeploymentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ViaMeta != null) {
            this.ViaMeta = new String(source.ViaMeta);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.DistType != null) {
            this.DistType = new String(source.DistType);
        }
        if (source.TempBucketPath != null) {
            this.TempBucketPath = new String(source.TempBucketPath);
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
        if (source.BuildFrom != null) {
            this.BuildFrom = new String(source.BuildFrom);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.CiSpec != null) {
            this.CiSpec = new String(source.CiSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ViaMeta", this.ViaMeta);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "DistType", this.DistType);
        this.setParamSimple(map, prefix + "TempBucketPath", this.TempBucketPath);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamSimple(map, prefix + "RepoCommitHash", this.RepoCommitHash);
        this.setParamSimple(map, prefix + "RepoCommitMsg", this.RepoCommitMsg);
        this.setParamSimple(map, prefix + "BuildFrom", this.BuildFrom);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "CiSpec", this.CiSpec);

    }
}

