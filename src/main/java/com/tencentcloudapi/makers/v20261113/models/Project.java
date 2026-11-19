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

public class Project extends AbstractModel {

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>Project name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Project status. Normal, Ban, Unlink, Process, Pending, Offline</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Site ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Acceleration region. mainland, overseas, global</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Code source. Github, Gitee, Coding, Upload, Gitlab, Bitbucket, Cnb</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Create Source. Template, Custom, CLI, Guest</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>Preset domain name.</p>
    */
    @SerializedName("PresetDomain")
    @Expose
    private String PresetDomain;

    /**
    * <p>Preset domain name status</p>
    */
    @SerializedName("PresetDomainStatus")
    @Expose
    private String PresetDomainStatus;

    /**
    * <p>Project root directory</p>
    */
    @SerializedName("RootDir")
    @Expose
    private String RootDir;

    /**
    * <p>Build artifact directory</p>
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * <p>Build command</p>
    */
    @SerializedName("BuildCmd")
    @Expose
    private String BuildCmd;

    /**
    * <p>Installation command</p>
    */
    @SerializedName("InstallCmd")
    @Expose
    private String InstallCmd;

    /**
    * <p>Framework</p>
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>Node.js version</p>
    */
    @SerializedName("NodejsVersion")
    @Expose
    private String NodejsVersion;

    /**
    * <p>Repository address</p>
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * <p>Repository owner</p>
    */
    @SerializedName("RepoOwner")
    @Expose
    private String RepoOwner;

    /**
    * <p>Repository name</p>
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>Production branch</p>
    */
    @SerializedName("RepoBranch")
    @Expose
    private String RepoBranch;

    /**
    * <p>Preview Branch</p>
    */
    @SerializedName("RepoPreBranches")
    @Expose
    private String [] RepoPreBranches;

    /**
    * <p>Deployment region</p>
    */
    @SerializedName("Regions")
    @Expose
    private Regions Regions;

    /**
    * <p>Environment variable.</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private ProjectEnvVar [] EnvVars;

    /**
    * <p>Custom domain name</p>
    */
    @SerializedName("CustomDomains")
    @Expose
    private CustomDomainItem [] CustomDomains;

    /**
    * <p>Last deployment</p>
    */
    @SerializedName("Deployment")
    @Expose
    private ProjectDeployment Deployment;

    /**
    * <p>Whether it is an Agent project. 1: yes, 0: no</p>
    */
    @SerializedName("IsAgent")
    @Expose
    private Long IsAgent;

    /**
    * <p>Agent framework. Non-Agent project is empty</p>
    */
    @SerializedName("AgentFramework")
    @Expose
    private String AgentFramework;

    /**
    * <p>Whether it hits a user-level wildcard domain name. 1: yes, 0: no</p>
    */
    @SerializedName("IsTld")
    @Expose
    private Long IsTld;

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
     * Get <p>Project name.</p> 
     * @return Name <p>Project name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Project name.</p>
     * @param Name <p>Project name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Project status. Normal, Ban, Unlink, Process, Pending, Offline</p> 
     * @return Status <p>Project status. Normal, Ban, Unlink, Process, Pending, Offline</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Project status. Normal, Ban, Unlink, Process, Pending, Offline</p>
     * @param Status <p>Project status. Normal, Ban, Unlink, Process, Pending, Offline</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Site ID</p> 
     * @return ZoneId <p>Site ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID</p>
     * @param ZoneId <p>Site ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Acceleration region. mainland, overseas, global</p> 
     * @return Area <p>Acceleration region. mainland, overseas, global</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Acceleration region. mainland, overseas, global</p>
     * @param Area <p>Acceleration region. mainland, overseas, global</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Code source. Github, Gitee, Coding, Upload, Gitlab, Bitbucket, Cnb</p> 
     * @return Provider <p>Code source. Github, Gitee, Coding, Upload, Gitlab, Bitbucket, Cnb</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Code source. Github, Gitee, Coding, Upload, Gitlab, Bitbucket, Cnb</p>
     * @param Provider <p>Code source. Github, Gitee, Coding, Upload, Gitlab, Bitbucket, Cnb</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Create Source. Template, Custom, CLI, Guest</p> 
     * @return Channel <p>Create Source. Template, Custom, CLI, Guest</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>Create Source. Template, Custom, CLI, Guest</p>
     * @param Channel <p>Create Source. Template, Custom, CLI, Guest</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>Preset domain name.</p> 
     * @return PresetDomain <p>Preset domain name.</p>
     */
    public String getPresetDomain() {
        return this.PresetDomain;
    }

    /**
     * Set <p>Preset domain name.</p>
     * @param PresetDomain <p>Preset domain name.</p>
     */
    public void setPresetDomain(String PresetDomain) {
        this.PresetDomain = PresetDomain;
    }

    /**
     * Get <p>Preset domain name status</p> 
     * @return PresetDomainStatus <p>Preset domain name status</p>
     */
    public String getPresetDomainStatus() {
        return this.PresetDomainStatus;
    }

    /**
     * Set <p>Preset domain name status</p>
     * @param PresetDomainStatus <p>Preset domain name status</p>
     */
    public void setPresetDomainStatus(String PresetDomainStatus) {
        this.PresetDomainStatus = PresetDomainStatus;
    }

    /**
     * Get <p>Project root directory</p> 
     * @return RootDir <p>Project root directory</p>
     */
    public String getRootDir() {
        return this.RootDir;
    }

    /**
     * Set <p>Project root directory</p>
     * @param RootDir <p>Project root directory</p>
     */
    public void setRootDir(String RootDir) {
        this.RootDir = RootDir;
    }

    /**
     * Get <p>Build artifact directory</p> 
     * @return OutputDir <p>Build artifact directory</p>
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set <p>Build artifact directory</p>
     * @param OutputDir <p>Build artifact directory</p>
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get <p>Build command</p> 
     * @return BuildCmd <p>Build command</p>
     */
    public String getBuildCmd() {
        return this.BuildCmd;
    }

    /**
     * Set <p>Build command</p>
     * @param BuildCmd <p>Build command</p>
     */
    public void setBuildCmd(String BuildCmd) {
        this.BuildCmd = BuildCmd;
    }

    /**
     * Get <p>Installation command</p> 
     * @return InstallCmd <p>Installation command</p>
     */
    public String getInstallCmd() {
        return this.InstallCmd;
    }

    /**
     * Set <p>Installation command</p>
     * @param InstallCmd <p>Installation command</p>
     */
    public void setInstallCmd(String InstallCmd) {
        this.InstallCmd = InstallCmd;
    }

    /**
     * Get <p>Framework</p> 
     * @return Framework <p>Framework</p>
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>Framework</p>
     * @param Framework <p>Framework</p>
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>Node.js version</p> 
     * @return NodejsVersion <p>Node.js version</p>
     */
    public String getNodejsVersion() {
        return this.NodejsVersion;
    }

    /**
     * Set <p>Node.js version</p>
     * @param NodejsVersion <p>Node.js version</p>
     */
    public void setNodejsVersion(String NodejsVersion) {
        this.NodejsVersion = NodejsVersion;
    }

    /**
     * Get <p>Repository address</p> 
     * @return RepoUrl <p>Repository address</p>
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set <p>Repository address</p>
     * @param RepoUrl <p>Repository address</p>
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get <p>Repository owner</p> 
     * @return RepoOwner <p>Repository owner</p>
     */
    public String getRepoOwner() {
        return this.RepoOwner;
    }

    /**
     * Set <p>Repository owner</p>
     * @param RepoOwner <p>Repository owner</p>
     */
    public void setRepoOwner(String RepoOwner) {
        this.RepoOwner = RepoOwner;
    }

    /**
     * Get <p>Repository name</p> 
     * @return RepoName <p>Repository name</p>
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>Repository name</p>
     * @param RepoName <p>Repository name</p>
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>Production branch</p> 
     * @return RepoBranch <p>Production branch</p>
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>Production branch</p>
     * @param RepoBranch <p>Production branch</p>
     */
    public void setRepoBranch(String RepoBranch) {
        this.RepoBranch = RepoBranch;
    }

    /**
     * Get <p>Preview Branch</p> 
     * @return RepoPreBranches <p>Preview Branch</p>
     */
    public String [] getRepoPreBranches() {
        return this.RepoPreBranches;
    }

    /**
     * Set <p>Preview Branch</p>
     * @param RepoPreBranches <p>Preview Branch</p>
     */
    public void setRepoPreBranches(String [] RepoPreBranches) {
        this.RepoPreBranches = RepoPreBranches;
    }

    /**
     * Get <p>Deployment region</p> 
     * @return Regions <p>Deployment region</p>
     */
    public Regions getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>Deployment region</p>
     * @param Regions <p>Deployment region</p>
     */
    public void setRegions(Regions Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>Environment variable.</p> 
     * @return EnvVars <p>Environment variable.</p>
     */
    public ProjectEnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>Environment variable.</p>
     * @param EnvVars <p>Environment variable.</p>
     */
    public void setEnvVars(ProjectEnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>Custom domain name</p> 
     * @return CustomDomains <p>Custom domain name</p>
     */
    public CustomDomainItem [] getCustomDomains() {
        return this.CustomDomains;
    }

    /**
     * Set <p>Custom domain name</p>
     * @param CustomDomains <p>Custom domain name</p>
     */
    public void setCustomDomains(CustomDomainItem [] CustomDomains) {
        this.CustomDomains = CustomDomains;
    }

    /**
     * Get <p>Last deployment</p> 
     * @return Deployment <p>Last deployment</p>
     */
    public ProjectDeployment getDeployment() {
        return this.Deployment;
    }

    /**
     * Set <p>Last deployment</p>
     * @param Deployment <p>Last deployment</p>
     */
    public void setDeployment(ProjectDeployment Deployment) {
        this.Deployment = Deployment;
    }

    /**
     * Get <p>Whether it is an Agent project. 1: yes, 0: no</p> 
     * @return IsAgent <p>Whether it is an Agent project. 1: yes, 0: no</p>
     */
    public Long getIsAgent() {
        return this.IsAgent;
    }

    /**
     * Set <p>Whether it is an Agent project. 1: yes, 0: no</p>
     * @param IsAgent <p>Whether it is an Agent project. 1: yes, 0: no</p>
     */
    public void setIsAgent(Long IsAgent) {
        this.IsAgent = IsAgent;
    }

    /**
     * Get <p>Agent framework. Non-Agent project is empty</p> 
     * @return AgentFramework <p>Agent framework. Non-Agent project is empty</p>
     */
    public String getAgentFramework() {
        return this.AgentFramework;
    }

    /**
     * Set <p>Agent framework. Non-Agent project is empty</p>
     * @param AgentFramework <p>Agent framework. Non-Agent project is empty</p>
     */
    public void setAgentFramework(String AgentFramework) {
        this.AgentFramework = AgentFramework;
    }

    /**
     * Get <p>Whether it hits a user-level wildcard domain name. 1: yes, 0: no</p> 
     * @return IsTld <p>Whether it hits a user-level wildcard domain name. 1: yes, 0: no</p>
     */
    public Long getIsTld() {
        return this.IsTld;
    }

    /**
     * Set <p>Whether it hits a user-level wildcard domain name. 1: yes, 0: no</p>
     * @param IsTld <p>Whether it hits a user-level wildcard domain name. 1: yes, 0: no</p>
     */
    public void setIsTld(Long IsTld) {
        this.IsTld = IsTld;
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.PresetDomain != null) {
            this.PresetDomain = new String(source.PresetDomain);
        }
        if (source.PresetDomainStatus != null) {
            this.PresetDomainStatus = new String(source.PresetDomainStatus);
        }
        if (source.RootDir != null) {
            this.RootDir = new String(source.RootDir);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.BuildCmd != null) {
            this.BuildCmd = new String(source.BuildCmd);
        }
        if (source.InstallCmd != null) {
            this.InstallCmd = new String(source.InstallCmd);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.NodejsVersion != null) {
            this.NodejsVersion = new String(source.NodejsVersion);
        }
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
        if (source.RepoOwner != null) {
            this.RepoOwner = new String(source.RepoOwner);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.RepoBranch != null) {
            this.RepoBranch = new String(source.RepoBranch);
        }
        if (source.RepoPreBranches != null) {
            this.RepoPreBranches = new String[source.RepoPreBranches.length];
            for (int i = 0; i < source.RepoPreBranches.length; i++) {
                this.RepoPreBranches[i] = new String(source.RepoPreBranches[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new Regions(source.Regions);
        }
        if (source.EnvVars != null) {
            this.EnvVars = new ProjectEnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new ProjectEnvVar(source.EnvVars[i]);
            }
        }
        if (source.CustomDomains != null) {
            this.CustomDomains = new CustomDomainItem[source.CustomDomains.length];
            for (int i = 0; i < source.CustomDomains.length; i++) {
                this.CustomDomains[i] = new CustomDomainItem(source.CustomDomains[i]);
            }
        }
        if (source.Deployment != null) {
            this.Deployment = new ProjectDeployment(source.Deployment);
        }
        if (source.IsAgent != null) {
            this.IsAgent = new Long(source.IsAgent);
        }
        if (source.AgentFramework != null) {
            this.AgentFramework = new String(source.AgentFramework);
        }
        if (source.IsTld != null) {
            this.IsTld = new Long(source.IsTld);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "PresetDomain", this.PresetDomain);
        this.setParamSimple(map, prefix + "PresetDomainStatus", this.PresetDomainStatus);
        this.setParamSimple(map, prefix + "RootDir", this.RootDir);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "NodejsVersion", this.NodejsVersion);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "RepoOwner", this.RepoOwner);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamArraySimple(map, prefix + "RepoPreBranches.", this.RepoPreBranches);
        this.setParamObj(map, prefix + "Regions.", this.Regions);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamArrayObj(map, prefix + "CustomDomains.", this.CustomDomains);
        this.setParamObj(map, prefix + "Deployment.", this.Deployment);
        this.setParamSimple(map, prefix + "IsAgent", this.IsAgent);
        this.setParamSimple(map, prefix + "AgentFramework", this.AgentFramework);
        this.setParamSimple(map, prefix + "IsTld", this.IsTld);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

