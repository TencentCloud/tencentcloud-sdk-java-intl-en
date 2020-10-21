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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamedComputeEnv extends AbstractModel{

    /**
    * Compute environment name
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * Number of desired compute nodes
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * Compute environment description
    */
    @SerializedName("EnvDescription")
    @Expose
    private String EnvDescription;

    /**
    * Compute environment management type
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Compute environment's specific parameters
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * Data disk mounting option
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * Authorization information
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * Input mapping information
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * Agent running mode; applicable for Windows
    */
    @SerializedName("AgentRunningMode")
    @Expose
    private AgentRunningMode AgentRunningMode;

    /**
    * Notification information
    */
    @SerializedName("Notifications")
    @Expose
    private Notification Notifications;

    /**
    * Inactive node processing policy. Default value: RECREATE, which means that instance resources will be re-created periodically for compute nodes where instance creation fails or is abnormally returned.
    */
    @SerializedName("ActionIfComputeNodeInactive")
    @Expose
    private String ActionIfComputeNodeInactive;

    /**
    * When the instances are failed to be created or returned because of exceptions, the related compute node will retry to create instances periodically. This parameter specifies the maximum retry attempts. The max value is 11 and the default value is 7.
    */
    @SerializedName("ResourceMaxRetryCount")
    @Expose
    private Long ResourceMaxRetryCount;

    /**
    * Tag list. By setting this parameter, you can bind tags to a compute environment. Each compute environment supports up to 10 tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Compute environment name 
     * @return EnvName Compute environment name
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set Compute environment name
     * @param EnvName Compute environment name
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get Number of desired compute nodes 
     * @return DesiredComputeNodeCount Number of desired compute nodes
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set Number of desired compute nodes
     * @param DesiredComputeNodeCount Number of desired compute nodes
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get Compute environment description 
     * @return EnvDescription Compute environment description
     */
    public String getEnvDescription() {
        return this.EnvDescription;
    }

    /**
     * Set Compute environment description
     * @param EnvDescription Compute environment description
     */
    public void setEnvDescription(String EnvDescription) {
        this.EnvDescription = EnvDescription;
    }

    /**
     * Get Compute environment management type 
     * @return EnvType Compute environment management type
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Compute environment management type
     * @param EnvType Compute environment management type
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Compute environment's specific parameters 
     * @return EnvData Compute environment's specific parameters
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * Set Compute environment's specific parameters
     * @param EnvData Compute environment's specific parameters
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * Get Data disk mounting option 
     * @return MountDataDisks Data disk mounting option
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * Set Data disk mounting option
     * @param MountDataDisks Data disk mounting option
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * Get Authorization information 
     * @return Authentications Authorization information
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * Set Authorization information
     * @param Authentications Authorization information
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * Get Input mapping information 
     * @return InputMappings Input mapping information
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * Set Input mapping information
     * @param InputMappings Input mapping information
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * Get Agent running mode; applicable for Windows 
     * @return AgentRunningMode Agent running mode; applicable for Windows
     */
    public AgentRunningMode getAgentRunningMode() {
        return this.AgentRunningMode;
    }

    /**
     * Set Agent running mode; applicable for Windows
     * @param AgentRunningMode Agent running mode; applicable for Windows
     */
    public void setAgentRunningMode(AgentRunningMode AgentRunningMode) {
        this.AgentRunningMode = AgentRunningMode;
    }

    /**
     * Get Notification information 
     * @return Notifications Notification information
     */
    public Notification getNotifications() {
        return this.Notifications;
    }

    /**
     * Set Notification information
     * @param Notifications Notification information
     */
    public void setNotifications(Notification Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * Get Inactive node processing policy. Default value: RECREATE, which means that instance resources will be re-created periodically for compute nodes where instance creation fails or is abnormally returned. 
     * @return ActionIfComputeNodeInactive Inactive node processing policy. Default value: RECREATE, which means that instance resources will be re-created periodically for compute nodes where instance creation fails or is abnormally returned.
     */
    public String getActionIfComputeNodeInactive() {
        return this.ActionIfComputeNodeInactive;
    }

    /**
     * Set Inactive node processing policy. Default value: RECREATE, which means that instance resources will be re-created periodically for compute nodes where instance creation fails or is abnormally returned.
     * @param ActionIfComputeNodeInactive Inactive node processing policy. Default value: RECREATE, which means that instance resources will be re-created periodically for compute nodes where instance creation fails or is abnormally returned.
     */
    public void setActionIfComputeNodeInactive(String ActionIfComputeNodeInactive) {
        this.ActionIfComputeNodeInactive = ActionIfComputeNodeInactive;
    }

    /**
     * Get When the instances are failed to be created or returned because of exceptions, the related compute node will retry to create instances periodically. This parameter specifies the maximum retry attempts. The max value is 11 and the default value is 7. 
     * @return ResourceMaxRetryCount When the instances are failed to be created or returned because of exceptions, the related compute node will retry to create instances periodically. This parameter specifies the maximum retry attempts. The max value is 11 and the default value is 7.
     */
    public Long getResourceMaxRetryCount() {
        return this.ResourceMaxRetryCount;
    }

    /**
     * Set When the instances are failed to be created or returned because of exceptions, the related compute node will retry to create instances periodically. This parameter specifies the maximum retry attempts. The max value is 11 and the default value is 7.
     * @param ResourceMaxRetryCount When the instances are failed to be created or returned because of exceptions, the related compute node will retry to create instances periodically. This parameter specifies the maximum retry attempts. The max value is 11 and the default value is 7.
     */
    public void setResourceMaxRetryCount(Long ResourceMaxRetryCount) {
        this.ResourceMaxRetryCount = ResourceMaxRetryCount;
    }

    /**
     * Get Tag list. By setting this parameter, you can bind tags to a compute environment. Each compute environment supports up to 10 tags. 
     * @return Tags Tag list. By setting this parameter, you can bind tags to a compute environment. Each compute environment supports up to 10 tags.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list. By setting this parameter, you can bind tags to a compute environment. Each compute environment supports up to 10 tags.
     * @param Tags Tag list. By setting this parameter, you can bind tags to a compute environment. Each compute environment supports up to 10 tags.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "EnvDescription", this.EnvDescription);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamObj(map, prefix + "AgentRunningMode.", this.AgentRunningMode);
        this.setParamObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "ActionIfComputeNodeInactive", this.ActionIfComputeNodeInactive);
        this.setParamSimple(map, prefix + "ResourceMaxRetryCount", this.ResourceMaxRetryCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

