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

public class UpdateScenarioRequest extends AbstractModel {

    /**
    * Scenario ID.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Scenario name. When calling this API, please include the fields in the Scenario that do not need to be modified as part of the API parameters, otherwise the scenario may become unusable.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Scenario description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Mode type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Load configuration.
    */
    @SerializedName("Load")
    @Expose
    private Load Load;

    /**
    * Deprecated.
    */
    @SerializedName("EncodedScripts")
    @Expose
    private String EncodedScripts;

    /**
    * Deprecated.
    */
    @SerializedName("Configs")
    @Expose
    private String [] Configs;

    /**
    * Test datasets.
    */
    @SerializedName("Datasets")
    @Expose
    private TestData [] Datasets;

    /**
    * Deprecated.
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * SLA rule ID.
    */
    @SerializedName("SLAId")
    @Expose
    private String SLAId;

    /**
    * Cron job ID.
    */
    @SerializedName("CronId")
    @Expose
    private String CronId;

    /**
    * Scenario status (Note: This parameter is no longer required).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Test scripts.
    */
    @SerializedName("TestScripts")
    @Expose
    private ScriptInfo [] TestScripts;

    /**
    * Protocol.
    */
    @SerializedName("Protocols")
    @Expose
    private ProtocolInfo [] Protocols;

    /**
    * Request files.
    */
    @SerializedName("RequestFiles")
    @Expose
    private FileInfo [] RequestFiles;

    /**
    * SLA policy.
    */
    @SerializedName("SLAPolicy")
    @Expose
    private SLAPolicy SLAPolicy;

    /**
    * Extension plugins.
    */
    @SerializedName("Plugins")
    @Expose
    private FileInfo [] Plugins;

    /**
    * Domain name resolution configuration.
    */
    @SerializedName("DomainNameConfig")
    @Expose
    private DomainNameConfig DomainNameConfig;

    /**
    * Notification web hook configuration.
    */
    @SerializedName("NotificationHooks")
    @Expose
    private Notification [] NotificationHooks;

    /**
    * Creator name.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Environment ID.
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

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
     * Get Scenario name. When calling this API, please include the fields in the Scenario that do not need to be modified as part of the API parameters, otherwise the scenario may become unusable. 
     * @return Name Scenario name. When calling this API, please include the fields in the Scenario that do not need to be modified as part of the API parameters, otherwise the scenario may become unusable.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Scenario name. When calling this API, please include the fields in the Scenario that do not need to be modified as part of the API parameters, otherwise the scenario may become unusable.
     * @param Name Scenario name. When calling this API, please include the fields in the Scenario that do not need to be modified as part of the API parameters, otherwise the scenario may become unusable.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Scenario description. 
     * @return Description Scenario description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Scenario description.
     * @param Description Scenario description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Mode type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode. 
     * @return Type Mode type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Mode type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.
     * @param Type Mode type of scenario. Valid values: 'pts-http' represents the simple mode, 'pts-js' represents the script mode, 'pts-jmeter' represents the JMeter mode.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Load configuration. 
     * @return Load Load configuration.
     */
    public Load getLoad() {
        return this.Load;
    }

    /**
     * Set Load configuration.
     * @param Load Load configuration.
     */
    public void setLoad(Load Load) {
        this.Load = Load;
    }

    /**
     * Get Deprecated. 
     * @return EncodedScripts Deprecated.
     */
    public String getEncodedScripts() {
        return this.EncodedScripts;
    }

    /**
     * Set Deprecated.
     * @param EncodedScripts Deprecated.
     */
    public void setEncodedScripts(String EncodedScripts) {
        this.EncodedScripts = EncodedScripts;
    }

    /**
     * Get Deprecated. 
     * @return Configs Deprecated.
     */
    public String [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set Deprecated.
     * @param Configs Deprecated.
     */
    public void setConfigs(String [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get Test datasets. 
     * @return Datasets Test datasets.
     */
    public TestData [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set Test datasets.
     * @param Datasets Test datasets.
     */
    public void setDatasets(TestData [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get Deprecated. 
     * @return Extensions Deprecated.
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set Deprecated.
     * @param Extensions Deprecated.
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get SLA rule ID. 
     * @return SLAId SLA rule ID.
     */
    public String getSLAId() {
        return this.SLAId;
    }

    /**
     * Set SLA rule ID.
     * @param SLAId SLA rule ID.
     */
    public void setSLAId(String SLAId) {
        this.SLAId = SLAId;
    }

    /**
     * Get Cron job ID. 
     * @return CronId Cron job ID.
     */
    public String getCronId() {
        return this.CronId;
    }

    /**
     * Set Cron job ID.
     * @param CronId Cron job ID.
     */
    public void setCronId(String CronId) {
        this.CronId = CronId;
    }

    /**
     * Get Scenario status (Note: This parameter is no longer required). 
     * @return Status Scenario status (Note: This parameter is no longer required).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Scenario status (Note: This parameter is no longer required).
     * @param Status Scenario status (Note: This parameter is no longer required).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Test scripts. 
     * @return TestScripts Test scripts.
     */
    public ScriptInfo [] getTestScripts() {
        return this.TestScripts;
    }

    /**
     * Set Test scripts.
     * @param TestScripts Test scripts.
     */
    public void setTestScripts(ScriptInfo [] TestScripts) {
        this.TestScripts = TestScripts;
    }

    /**
     * Get Protocol. 
     * @return Protocols Protocol.
     */
    public ProtocolInfo [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set Protocol.
     * @param Protocols Protocol.
     */
    public void setProtocols(ProtocolInfo [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get Request files. 
     * @return RequestFiles Request files.
     */
    public FileInfo [] getRequestFiles() {
        return this.RequestFiles;
    }

    /**
     * Set Request files.
     * @param RequestFiles Request files.
     */
    public void setRequestFiles(FileInfo [] RequestFiles) {
        this.RequestFiles = RequestFiles;
    }

    /**
     * Get SLA policy. 
     * @return SLAPolicy SLA policy.
     */
    public SLAPolicy getSLAPolicy() {
        return this.SLAPolicy;
    }

    /**
     * Set SLA policy.
     * @param SLAPolicy SLA policy.
     */
    public void setSLAPolicy(SLAPolicy SLAPolicy) {
        this.SLAPolicy = SLAPolicy;
    }

    /**
     * Get Extension plugins. 
     * @return Plugins Extension plugins.
     */
    public FileInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set Extension plugins.
     * @param Plugins Extension plugins.
     */
    public void setPlugins(FileInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get Domain name resolution configuration. 
     * @return DomainNameConfig Domain name resolution configuration.
     */
    public DomainNameConfig getDomainNameConfig() {
        return this.DomainNameConfig;
    }

    /**
     * Set Domain name resolution configuration.
     * @param DomainNameConfig Domain name resolution configuration.
     */
    public void setDomainNameConfig(DomainNameConfig DomainNameConfig) {
        this.DomainNameConfig = DomainNameConfig;
    }

    /**
     * Get Notification web hook configuration. 
     * @return NotificationHooks Notification web hook configuration.
     */
    public Notification [] getNotificationHooks() {
        return this.NotificationHooks;
    }

    /**
     * Set Notification web hook configuration.
     * @param NotificationHooks Notification web hook configuration.
     */
    public void setNotificationHooks(Notification [] NotificationHooks) {
        this.NotificationHooks = NotificationHooks;
    }

    /**
     * Get Creator name. 
     * @return Owner Creator name.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Creator name.
     * @param Owner Creator name.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Environment ID. 
     * @return EnvId Environment ID.
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Environment ID.
     * @param EnvId Environment ID.
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public UpdateScenarioRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateScenarioRequest(UpdateScenarioRequest source) {
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
        if (source.Datasets != null) {
            this.Datasets = new TestData[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new TestData(source.Datasets[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.SLAId != null) {
            this.SLAId = new String(source.SLAId);
        }
        if (source.CronId != null) {
            this.CronId = new String(source.CronId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
            this.NotificationHooks = new Notification[source.NotificationHooks.length];
            for (int i = 0; i < source.NotificationHooks.length; i++) {
                this.NotificationHooks[i] = new Notification(source.NotificationHooks[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
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
        this.setParamObj(map, prefix + "Load.", this.Load);
        this.setParamSimple(map, prefix + "EncodedScripts", this.EncodedScripts);
        this.setParamArraySimple(map, prefix + "Configs.", this.Configs);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamSimple(map, prefix + "SLAId", this.SLAId);
        this.setParamSimple(map, prefix + "CronId", this.CronId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TestScripts.", this.TestScripts);
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamArrayObj(map, prefix + "RequestFiles.", this.RequestFiles);
        this.setParamObj(map, prefix + "SLAPolicy.", this.SLAPolicy);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamObj(map, prefix + "DomainNameConfig.", this.DomainNameConfig);
        this.setParamArrayObj(map, prefix + "NotificationHooks.", this.NotificationHooks);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

