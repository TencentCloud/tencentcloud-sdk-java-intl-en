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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAgentAsset extends AbstractModel {

    /**
    * <p>ID identifier</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>agent name</p>
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * <p>agent model name usage</p>
    */
    @SerializedName("AgentModel")
    @Expose
    private String [] AgentModel;

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>metadata risk list. Has the following enumeration values: 1. AK_TMP 2. USER_DATA</p>
    */
    @SerializedName("MetadataRiskList")
    @Expose
    private String [] MetadataRiskList;

    /**
    * <p>First detection time</p>
    */
    @SerializedName("IdentityTimeFirst")
    @Expose
    private String IdentityTimeFirst;

    /**
    * <p>Latest detected time</p>
    */
    @SerializedName("IdentityTimeLast")
    @Expose
    private String IdentityTimeLast;

    /**
    * <p>Detect method. Has the following enumeration values: 1. FINGER Detect via asset fingerprinting 2. NETWORK Detect via network access mode</p>
    */
    @SerializedName("IdentityMethod")
    @Expose
    private String IdentityMethod;

    /**
    * <p>Exposure status. Has the following enumeration values. 1. EXPOSED; 2. UNEXPOSED;</p><ol start="3"><li>UNKNOWN;</li></ol>
    */
    @SerializedName("ExposureStatus")
    @Expose
    private String ExposureStatus;

    /**
    * <p>Corresponding path when metadata is at risk</p>
    */
    @SerializedName("MetadataRiskURL")
    @Expose
    private String MetadataRiskURL;

    /**
    * <p>None</p>
    */
    @SerializedName("SkillState")
    @Expose
    private SkillState SkillState;

    /**
    * <p>Traffic sandbox plug-in status</p>
    */
    @SerializedName("TrafficPluginState")
    @Expose
    private TrafficPluginState TrafficPluginState;

    /**
    * <p>Sandbox rule status for traffic</p>
    */
    @SerializedName("TrafficRuleState")
    @Expose
    private TrafficRuleState [] TrafficRuleState;

    /**
    * <p>Command sandbox plug-in status</p>
    */
    @SerializedName("CommandPluginState")
    @Expose
    private CommandPluginState CommandPluginState;

    /**
     * Get <p>ID identifier</p> 
     * @return ID <p>ID identifier</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>ID identifier</p>
     * @param ID <p>ID identifier</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>agent name</p> 
     * @return AgentName <p>agent name</p>
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set <p>agent name</p>
     * @param AgentName <p>agent name</p>
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get <p>agent model name usage</p> 
     * @return AgentModel <p>agent model name usage</p>
     */
    public String [] getAgentModel() {
        return this.AgentModel;
    }

    /**
     * Set <p>agent model name usage</p>
     * @param AgentModel <p>agent model name usage</p>
     */
    public void setAgentModel(String [] AgentModel) {
        this.AgentModel = AgentModel;
    }

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceID <p>Instance ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceID <p>Instance ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>metadata risk list. Has the following enumeration values: 1. AK_TMP 2. USER_DATA</p> 
     * @return MetadataRiskList <p>metadata risk list. Has the following enumeration values: 1. AK_TMP 2. USER_DATA</p>
     */
    public String [] getMetadataRiskList() {
        return this.MetadataRiskList;
    }

    /**
     * Set <p>metadata risk list. Has the following enumeration values: 1. AK_TMP 2. USER_DATA</p>
     * @param MetadataRiskList <p>metadata risk list. Has the following enumeration values: 1. AK_TMP 2. USER_DATA</p>
     */
    public void setMetadataRiskList(String [] MetadataRiskList) {
        this.MetadataRiskList = MetadataRiskList;
    }

    /**
     * Get <p>First detection time</p> 
     * @return IdentityTimeFirst <p>First detection time</p>
     */
    public String getIdentityTimeFirst() {
        return this.IdentityTimeFirst;
    }

    /**
     * Set <p>First detection time</p>
     * @param IdentityTimeFirst <p>First detection time</p>
     */
    public void setIdentityTimeFirst(String IdentityTimeFirst) {
        this.IdentityTimeFirst = IdentityTimeFirst;
    }

    /**
     * Get <p>Latest detected time</p> 
     * @return IdentityTimeLast <p>Latest detected time</p>
     */
    public String getIdentityTimeLast() {
        return this.IdentityTimeLast;
    }

    /**
     * Set <p>Latest detected time</p>
     * @param IdentityTimeLast <p>Latest detected time</p>
     */
    public void setIdentityTimeLast(String IdentityTimeLast) {
        this.IdentityTimeLast = IdentityTimeLast;
    }

    /**
     * Get <p>Detect method. Has the following enumeration values: 1. FINGER Detect via asset fingerprinting 2. NETWORK Detect via network access mode</p> 
     * @return IdentityMethod <p>Detect method. Has the following enumeration values: 1. FINGER Detect via asset fingerprinting 2. NETWORK Detect via network access mode</p>
     */
    public String getIdentityMethod() {
        return this.IdentityMethod;
    }

    /**
     * Set <p>Detect method. Has the following enumeration values: 1. FINGER Detect via asset fingerprinting 2. NETWORK Detect via network access mode</p>
     * @param IdentityMethod <p>Detect method. Has the following enumeration values: 1. FINGER Detect via asset fingerprinting 2. NETWORK Detect via network access mode</p>
     */
    public void setIdentityMethod(String IdentityMethod) {
        this.IdentityMethod = IdentityMethod;
    }

    /**
     * Get <p>Exposure status. Has the following enumeration values. 1. EXPOSED; 2. UNEXPOSED;</p><ol start="3"><li>UNKNOWN;</li></ol> 
     * @return ExposureStatus <p>Exposure status. Has the following enumeration values. 1. EXPOSED; 2. UNEXPOSED;</p><ol start="3"><li>UNKNOWN;</li></ol>
     */
    public String getExposureStatus() {
        return this.ExposureStatus;
    }

    /**
     * Set <p>Exposure status. Has the following enumeration values. 1. EXPOSED; 2. UNEXPOSED;</p><ol start="3"><li>UNKNOWN;</li></ol>
     * @param ExposureStatus <p>Exposure status. Has the following enumeration values. 1. EXPOSED; 2. UNEXPOSED;</p><ol start="3"><li>UNKNOWN;</li></ol>
     */
    public void setExposureStatus(String ExposureStatus) {
        this.ExposureStatus = ExposureStatus;
    }

    /**
     * Get <p>Corresponding path when metadata is at risk</p> 
     * @return MetadataRiskURL <p>Corresponding path when metadata is at risk</p>
     */
    public String getMetadataRiskURL() {
        return this.MetadataRiskURL;
    }

    /**
     * Set <p>Corresponding path when metadata is at risk</p>
     * @param MetadataRiskURL <p>Corresponding path when metadata is at risk</p>
     */
    public void setMetadataRiskURL(String MetadataRiskURL) {
        this.MetadataRiskURL = MetadataRiskURL;
    }

    /**
     * Get <p>None</p> 
     * @return SkillState <p>None</p>
     */
    public SkillState getSkillState() {
        return this.SkillState;
    }

    /**
     * Set <p>None</p>
     * @param SkillState <p>None</p>
     */
    public void setSkillState(SkillState SkillState) {
        this.SkillState = SkillState;
    }

    /**
     * Get <p>Traffic sandbox plug-in status</p> 
     * @return TrafficPluginState <p>Traffic sandbox plug-in status</p>
     */
    public TrafficPluginState getTrafficPluginState() {
        return this.TrafficPluginState;
    }

    /**
     * Set <p>Traffic sandbox plug-in status</p>
     * @param TrafficPluginState <p>Traffic sandbox plug-in status</p>
     */
    public void setTrafficPluginState(TrafficPluginState TrafficPluginState) {
        this.TrafficPluginState = TrafficPluginState;
    }

    /**
     * Get <p>Sandbox rule status for traffic</p> 
     * @return TrafficRuleState <p>Sandbox rule status for traffic</p>
     */
    public TrafficRuleState [] getTrafficRuleState() {
        return this.TrafficRuleState;
    }

    /**
     * Set <p>Sandbox rule status for traffic</p>
     * @param TrafficRuleState <p>Sandbox rule status for traffic</p>
     */
    public void setTrafficRuleState(TrafficRuleState [] TrafficRuleState) {
        this.TrafficRuleState = TrafficRuleState;
    }

    /**
     * Get <p>Command sandbox plug-in status</p> 
     * @return CommandPluginState <p>Command sandbox plug-in status</p>
     */
    public CommandPluginState getCommandPluginState() {
        return this.CommandPluginState;
    }

    /**
     * Set <p>Command sandbox plug-in status</p>
     * @param CommandPluginState <p>Command sandbox plug-in status</p>
     */
    public void setCommandPluginState(CommandPluginState CommandPluginState) {
        this.CommandPluginState = CommandPluginState;
    }

    public AIAgentAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentAsset(AIAgentAsset source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AgentModel != null) {
            this.AgentModel = new String[source.AgentModel.length];
            for (int i = 0; i < source.AgentModel.length; i++) {
                this.AgentModel[i] = new String(source.AgentModel[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MetadataRiskList != null) {
            this.MetadataRiskList = new String[source.MetadataRiskList.length];
            for (int i = 0; i < source.MetadataRiskList.length; i++) {
                this.MetadataRiskList[i] = new String(source.MetadataRiskList[i]);
            }
        }
        if (source.IdentityTimeFirst != null) {
            this.IdentityTimeFirst = new String(source.IdentityTimeFirst);
        }
        if (source.IdentityTimeLast != null) {
            this.IdentityTimeLast = new String(source.IdentityTimeLast);
        }
        if (source.IdentityMethod != null) {
            this.IdentityMethod = new String(source.IdentityMethod);
        }
        if (source.ExposureStatus != null) {
            this.ExposureStatus = new String(source.ExposureStatus);
        }
        if (source.MetadataRiskURL != null) {
            this.MetadataRiskURL = new String(source.MetadataRiskURL);
        }
        if (source.SkillState != null) {
            this.SkillState = new SkillState(source.SkillState);
        }
        if (source.TrafficPluginState != null) {
            this.TrafficPluginState = new TrafficPluginState(source.TrafficPluginState);
        }
        if (source.TrafficRuleState != null) {
            this.TrafficRuleState = new TrafficRuleState[source.TrafficRuleState.length];
            for (int i = 0; i < source.TrafficRuleState.length; i++) {
                this.TrafficRuleState[i] = new TrafficRuleState(source.TrafficRuleState[i]);
            }
        }
        if (source.CommandPluginState != null) {
            this.CommandPluginState = new CommandPluginState(source.CommandPluginState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamArraySimple(map, prefix + "AgentModel.", this.AgentModel);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "MetadataRiskList.", this.MetadataRiskList);
        this.setParamSimple(map, prefix + "IdentityTimeFirst", this.IdentityTimeFirst);
        this.setParamSimple(map, prefix + "IdentityTimeLast", this.IdentityTimeLast);
        this.setParamSimple(map, prefix + "IdentityMethod", this.IdentityMethod);
        this.setParamSimple(map, prefix + "ExposureStatus", this.ExposureStatus);
        this.setParamSimple(map, prefix + "MetadataRiskURL", this.MetadataRiskURL);
        this.setParamObj(map, prefix + "SkillState.", this.SkillState);
        this.setParamObj(map, prefix + "TrafficPluginState.", this.TrafficPluginState);
        this.setParamArrayObj(map, prefix + "TrafficRuleState.", this.TrafficRuleState);
        this.setParamObj(map, prefix + "CommandPluginState.", this.CommandPluginState);

    }
}

