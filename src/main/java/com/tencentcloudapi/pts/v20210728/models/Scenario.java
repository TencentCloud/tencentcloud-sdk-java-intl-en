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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scenario extends AbstractModel {

    /**
    * Scenario ID.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Scenario name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Scenario description.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Scenario status.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Load configuration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Load")
    @Expose
    private Load Load;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("EncodedScripts")
    @Expose
    private String EncodedScripts;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Configs")
    @Expose
    private String [] Configs;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * Test datasets.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Datasets")
    @Expose
    private TestData [] Datasets;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SLAId")
    @Expose
    private String SLAId;

    /**
    * CronJob ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CronId")
    @Expose
    private String CronId;

    /**
    * Create time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * App ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub account uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * Test scripts.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TestScripts")
    @Expose
    private ScriptInfo [] TestScripts;

    /**
    * Protocol files.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Protocols")
    @Expose
    private ProtocolInfo [] Protocols;

    /**
    * Request files.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RequestFiles")
    @Expose
    private FileInfo [] RequestFiles;

    /**
    * SLA policy.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SLAPolicy")
    @Expose
    private SLAPolicy SLAPolicy;

    /**
    * Extension plugin files.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Plugins")
    @Expose
    private FileInfo [] Plugins;

    /**
    * Domain name resolution configuration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DomainNameConfig")
    @Expose
    private DomainNameConfig DomainNameConfig;

    /**
    * Notification event hooks.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NotificationHooks")
    @Expose
    private NotificationHook [] NotificationHooks;

    /**
    * Creator name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Project name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get Scenario ID. 
     * @return ScenarioId Scenario ID.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.
     * @param ScenarioId Scenario ID.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Scenario name. 
     * @return Name Scenario name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Scenario name.
     * @param Name Scenario name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Scenario description.

Note: This field may return null, indicating that no valid value is found. 
     * @return Description Scenario description.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Scenario description.

Note: This field may return null, indicating that no valid value is found.
     * @param Description Scenario description.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.

Note: This field may return null, indicating that no valid value is found. 
     * @return Type Type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.

Note: This field may return null, indicating that no valid value is found.
     * @param Type Type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Scenario status.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Scenario status.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Scenario status.

Note: This field may return null, indicating that no valid value is found.
     * @param Status Scenario status.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Load configuration.

Note: This field may return null, indicating that no valid value is found. 
     * @return Load Load configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public Load getLoad() {
        return this.Load;
    }

    /**
     * Set Load configuration.

Note: This field may return null, indicating that no valid value is found.
     * @param Load Load configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLoad(Load Load) {
        this.Load = Load;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return EncodedScripts Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getEncodedScripts() {
        return this.EncodedScripts;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param EncodedScripts Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setEncodedScripts(String EncodedScripts) {
        this.EncodedScripts = EncodedScripts;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return Configs Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param Configs Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setConfigs(String [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return Extensions Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param Extensions Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get Test datasets.

Note: This field may return null, indicating that no valid value is found. 
     * @return Datasets Test datasets.

Note: This field may return null, indicating that no valid value is found.
     */
    public TestData [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set Test datasets.

Note: This field may return null, indicating that no valid value is found.
     * @param Datasets Test datasets.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDatasets(TestData [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return SLAId Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getSLAId() {
        return this.SLAId;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param SLAId Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSLAId(String SLAId) {
        this.SLAId = SLAId;
    }

    /**
     * Get CronJob ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return CronId CronJob ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCronId() {
        return this.CronId;
    }

    /**
     * Set CronJob ID.

Note: This field may return null, indicating that no valid value is found.
     * @param CronId CronJob ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCronId(String CronId) {
        this.CronId = CronId;
    }

    /**
     * Get Create time. 
     * @return CreatedAt Create time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create time.
     * @param CreatedAt Create time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time. 
     * @return UpdatedAt Update time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
     * @param UpdatedAt Update time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get App ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return AppId App ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID.

Note: This field may return null, indicating that no valid value is found.
     * @param AppId App ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return Uin Uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin.

Note: This field may return null, indicating that no valid value is found.
     * @param Uin Uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub account uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     * @param SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get Test scripts.

Note: This field may return null, indicating that no valid value is found. 
     * @return TestScripts Test scripts.

Note: This field may return null, indicating that no valid value is found.
     */
    public ScriptInfo [] getTestScripts() {
        return this.TestScripts;
    }

    /**
     * Set Test scripts.

Note: This field may return null, indicating that no valid value is found.
     * @param TestScripts Test scripts.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTestScripts(ScriptInfo [] TestScripts) {
        this.TestScripts = TestScripts;
    }

    /**
     * Get Protocol files.

Note: This field may return null, indicating that no valid value is found. 
     * @return Protocols Protocol files.

Note: This field may return null, indicating that no valid value is found.
     */
    public ProtocolInfo [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set Protocol files.

Note: This field may return null, indicating that no valid value is found.
     * @param Protocols Protocol files.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProtocols(ProtocolInfo [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get Request files.

Note: This field may return null, indicating that no valid value is found. 
     * @return RequestFiles Request files.

Note: This field may return null, indicating that no valid value is found.
     */
    public FileInfo [] getRequestFiles() {
        return this.RequestFiles;
    }

    /**
     * Set Request files.

Note: This field may return null, indicating that no valid value is found.
     * @param RequestFiles Request files.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRequestFiles(FileInfo [] RequestFiles) {
        this.RequestFiles = RequestFiles;
    }

    /**
     * Get SLA policy.

Note: This field may return null, indicating that no valid value is found. 
     * @return SLAPolicy SLA policy.

Note: This field may return null, indicating that no valid value is found.
     */
    public SLAPolicy getSLAPolicy() {
        return this.SLAPolicy;
    }

    /**
     * Set SLA policy.

Note: This field may return null, indicating that no valid value is found.
     * @param SLAPolicy SLA policy.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSLAPolicy(SLAPolicy SLAPolicy) {
        this.SLAPolicy = SLAPolicy;
    }

    /**
     * Get Extension plugin files.

Note: This field may return null, indicating that no valid value is found. 
     * @return Plugins Extension plugin files.

Note: This field may return null, indicating that no valid value is found.
     */
    public FileInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set Extension plugin files.

Note: This field may return null, indicating that no valid value is found.
     * @param Plugins Extension plugin files.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setPlugins(FileInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get Domain name resolution configuration.

Note: This field may return null, indicating that no valid value is found. 
     * @return DomainNameConfig Domain name resolution configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public DomainNameConfig getDomainNameConfig() {
        return this.DomainNameConfig;
    }

    /**
     * Set Domain name resolution configuration.

Note: This field may return null, indicating that no valid value is found.
     * @param DomainNameConfig Domain name resolution configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDomainNameConfig(DomainNameConfig DomainNameConfig) {
        this.DomainNameConfig = DomainNameConfig;
    }

    /**
     * Get Notification event hooks.

Note: This field may return null, indicating that no valid value is found. 
     * @return NotificationHooks Notification event hooks.

Note: This field may return null, indicating that no valid value is found.
     */
    public NotificationHook [] getNotificationHooks() {
        return this.NotificationHooks;
    }

    /**
     * Set Notification event hooks.

Note: This field may return null, indicating that no valid value is found.
     * @param NotificationHooks Notification event hooks.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNotificationHooks(NotificationHook [] NotificationHooks) {
        this.NotificationHooks = NotificationHooks;
    }

    /**
     * Get Creator name.

Note: This field may return null, indicating that no valid value is found. 
     * @return Owner Creator name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Creator name.

Note: This field may return null, indicating that no valid value is found.
     * @param Owner Creator name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Project name.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectName Project name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectName Project name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public Scenario() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Scenario(Scenario source) {
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Load != null) {
            this.Load = new Load(source.Load);
        }
        if (source.EncodedScripts != null) {
            this.EncodedScripts = new String(source.EncodedScripts);
        }
        if (source.Configs != null) {
            this.Configs = new String[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new String(source.Configs[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.Datasets != null) {
            this.Datasets = new TestData[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new TestData(source.Datasets[i]);
            }
        }
        if (source.SLAId != null) {
            this.SLAId = new String(source.SLAId);
        }
        if (source.CronId != null) {
            this.CronId = new String(source.CronId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.TestScripts != null) {
            this.TestScripts = new ScriptInfo[source.TestScripts.length];
            for (int i = 0; i < source.TestScripts.length; i++) {
                this.TestScripts[i] = new ScriptInfo(source.TestScripts[i]);
            }
        }
        if (source.Protocols != null) {
            this.Protocols = new ProtocolInfo[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new ProtocolInfo(source.Protocols[i]);
            }
        }
        if (source.RequestFiles != null) {
            this.RequestFiles = new FileInfo[source.RequestFiles.length];
            for (int i = 0; i < source.RequestFiles.length; i++) {
                this.RequestFiles[i] = new FileInfo(source.RequestFiles[i]);
            }
        }
        if (source.SLAPolicy != null) {
            this.SLAPolicy = new SLAPolicy(source.SLAPolicy);
        }
        if (source.Plugins != null) {
            this.Plugins = new FileInfo[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new FileInfo(source.Plugins[i]);
            }
        }
        if (source.DomainNameConfig != null) {
            this.DomainNameConfig = new DomainNameConfig(source.DomainNameConfig);
        }
        if (source.NotificationHooks != null) {
            this.NotificationHooks = new NotificationHook[source.NotificationHooks.length];
            for (int i = 0; i < source.NotificationHooks.length; i++) {
                this.NotificationHooks[i] = new NotificationHook(source.NotificationHooks[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Load.", this.Load);
        this.setParamSimple(map, prefix + "EncodedScripts", this.EncodedScripts);
        this.setParamArraySimple(map, prefix + "Configs.", this.Configs);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamSimple(map, prefix + "SLAId", this.SLAId);
        this.setParamSimple(map, prefix + "CronId", this.CronId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamArrayObj(map, prefix + "TestScripts.", this.TestScripts);
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamArrayObj(map, prefix + "RequestFiles.", this.RequestFiles);
        this.setParamObj(map, prefix + "SLAPolicy.", this.SLAPolicy);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamObj(map, prefix + "DomainNameConfig.", this.DomainNameConfig);
        this.setParamArrayObj(map, prefix + "NotificationHooks.", this.NotificationHooks);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

