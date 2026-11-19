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

public class CreateProjectRequest extends AbstractModel {

    /**
    * <p>Makers site ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Project name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Create Source. Template, Custom, CLI, Guest</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>Code source. Upload, Github, Gitee, Gitlab, Coding</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Accessing party identifier.</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Acceleration region. mainland, overseas, global</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Node.js version. 14.21.3, 16.20.2, 18.20.4, 20.18.0, 22.11.0, 22.17.1, 22.21.1, 24.5.0, 24.11.0, 24.18.0</p>
    */
    @SerializedName("NodeJsVersion")
    @Expose
    private String NodeJsVersion;

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
    * <p>Template ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

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
    * <p>Initial environment variable.</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
    * <p>Coding namespace. Used when the Provider is Coding.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Coding project ID. Used when the Provider is Coding</p>
    */
    @SerializedName("CodingProjectId")
    @Expose
    private Long CodingProjectId;

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
     * Get <p>Code source. Upload, Github, Gitee, Gitlab, Coding</p> 
     * @return Provider <p>Code source. Upload, Github, Gitee, Gitlab, Coding</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Code source. Upload, Github, Gitee, Gitlab, Coding</p>
     * @param Provider <p>Code source. Upload, Github, Gitee, Gitlab, Coding</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Accessing party identifier.</p> 
     * @return Source <p>Accessing party identifier.</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Accessing party identifier.</p>
     * @param Source <p>Accessing party identifier.</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
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
     * Get <p>Node.js version. 14.21.3, 16.20.2, 18.20.4, 20.18.0, 22.11.0, 22.17.1, 22.21.1, 24.5.0, 24.11.0, 24.18.0</p> 
     * @return NodeJsVersion <p>Node.js version. 14.21.3, 16.20.2, 18.20.4, 20.18.0, 22.11.0, 22.17.1, 22.21.1, 24.5.0, 24.11.0, 24.18.0</p>
     */
    public String getNodeJsVersion() {
        return this.NodeJsVersion;
    }

    /**
     * Set <p>Node.js version. 14.21.3, 16.20.2, 18.20.4, 20.18.0, 22.11.0, 22.17.1, 22.21.1, 24.5.0, 24.11.0, 24.18.0</p>
     * @param NodeJsVersion <p>Node.js version. 14.21.3, 16.20.2, 18.20.4, 20.18.0, 22.11.0, 22.17.1, 22.21.1, 24.5.0, 24.11.0, 24.18.0</p>
     */
    public void setNodeJsVersion(String NodeJsVersion) {
        this.NodeJsVersion = NodeJsVersion;
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
     * Get <p>Initial environment variable.</p> 
     * @return EnvVars <p>Initial environment variable.</p>
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>Initial environment variable.</p>
     * @param EnvVars <p>Initial environment variable.</p>
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>Coding namespace. Used when the Provider is Coding.</p> 
     * @return Namespace <p>Coding namespace. Used when the Provider is Coding.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Coding namespace. Used when the Provider is Coding.</p>
     * @param Namespace <p>Coding namespace. Used when the Provider is Coding.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Coding project ID. Used when the Provider is Coding</p> 
     * @return CodingProjectId <p>Coding project ID. Used when the Provider is Coding</p>
     */
    public Long getCodingProjectId() {
        return this.CodingProjectId;
    }

    /**
     * Set <p>Coding project ID. Used when the Provider is Coding</p>
     * @param CodingProjectId <p>Coding project ID. Used when the Provider is Coding</p>
     */
    public void setCodingProjectId(Long CodingProjectId) {
        this.CodingProjectId = CodingProjectId;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.NodeJsVersion != null) {
            this.NodeJsVersion = new String(source.NodeJsVersion);
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
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        if (source.EnvVars != null) {
            this.EnvVars = new EnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvVar(source.EnvVars[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CodingProjectId != null) {
            this.CodingProjectId = new Long(source.CodingProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "NodeJsVersion", this.NodeJsVersion);
        this.setParamSimple(map, prefix + "RootDir", this.RootDir);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "RepoOwner", this.RepoOwner);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CodingProjectId", this.CodingProjectId);

    }
}

