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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * <p>App avatar</p>
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * <p>Application configuration</p>
    */
    @SerializedName("Config")
    @Expose
    private AppConfig Config;

    /**
    * <p>Application description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Application name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>List of IDs of shared knowledge bases to refer (full coverage)</p>
    */
    @SerializedName("SharedKbIdList")
    @Expose
    private String [] SharedKbIdList;

    /**
    * <p>App mount cloud disk</p>
    */
    @SerializedName("FileVolumeMountList")
    @Expose
    private AppFileVolumeMount [] FileVolumeMountList;

    /**
    * <p>Field mask, specifying the fields to update (if Paths is empty, no fields will be updated). Paths enumeration values:<br>[Top level] Name, Avatar, Description, AppMode, SharedKbIdList, FileVolumeMountList<br>[Greeting] Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList<br>[Model] Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel<br>[WebSearch] Config.WebSearch<br>[Memory] Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent<br>[Mode] Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig,Config.Mode.ClawAgentConfig<br> [Mode.ClawAgentConfig] Config.Mode.ClawAgentConfig.LongMemoryConfig, Config.Mode.ClawAgentConfig.AgentTeamConfig, Config.Mode.ClawAgentConfig.ChannelContextTimeoutConfig<br>[Experience] Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced<br>[Experience.Conversation] Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch,Config.Experience.Conversation.NewMessageInterrupt<br>[Experience.Conversation.AiCall] Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman<br>[Experience.Advanced] Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p> 
     * @return AppMode <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
     * @param AppMode <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get <p>App avatar</p> 
     * @return Avatar <p>App avatar</p>
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set <p>App avatar</p>
     * @param Avatar <p>App avatar</p>
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get <p>Application configuration</p> 
     * @return Config <p>Application configuration</p>
     */
    public AppConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Application configuration</p>
     * @param Config <p>Application configuration</p>
     */
    public void setConfig(AppConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Application description.</p> 
     * @return Description <p>Application description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Application description.</p>
     * @param Description <p>Application description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Application name.</p> 
     * @return Name <p>Application name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Application name.</p>
     * @param Name <p>Application name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>List of IDs of shared knowledge bases to refer (full coverage)</p> 
     * @return SharedKbIdList <p>List of IDs of shared knowledge bases to refer (full coverage)</p>
     */
    public String [] getSharedKbIdList() {
        return this.SharedKbIdList;
    }

    /**
     * Set <p>List of IDs of shared knowledge bases to refer (full coverage)</p>
     * @param SharedKbIdList <p>List of IDs of shared knowledge bases to refer (full coverage)</p>
     */
    public void setSharedKbIdList(String [] SharedKbIdList) {
        this.SharedKbIdList = SharedKbIdList;
    }

    /**
     * Get <p>App mount cloud disk</p> 
     * @return FileVolumeMountList <p>App mount cloud disk</p>
     */
    public AppFileVolumeMount [] getFileVolumeMountList() {
        return this.FileVolumeMountList;
    }

    /**
     * Set <p>App mount cloud disk</p>
     * @param FileVolumeMountList <p>App mount cloud disk</p>
     */
    public void setFileVolumeMountList(AppFileVolumeMount [] FileVolumeMountList) {
        this.FileVolumeMountList = FileVolumeMountList;
    }

    /**
     * Get <p>Field mask, specifying the fields to update (if Paths is empty, no fields will be updated). Paths enumeration values:<br>[Top level] Name, Avatar, Description, AppMode, SharedKbIdList, FileVolumeMountList<br>[Greeting] Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList<br>[Model] Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel<br>[WebSearch] Config.WebSearch<br>[Memory] Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent<br>[Mode] Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig,Config.Mode.ClawAgentConfig<br> [Mode.ClawAgentConfig] Config.Mode.ClawAgentConfig.LongMemoryConfig, Config.Mode.ClawAgentConfig.AgentTeamConfig, Config.Mode.ClawAgentConfig.ChannelContextTimeoutConfig<br>[Experience] Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced<br>[Experience.Conversation] Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch,Config.Experience.Conversation.NewMessageInterrupt<br>[Experience.Conversation.AiCall] Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman<br>[Experience.Advanced] Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility</p> 
     * @return UpdateMask <p>Field mask, specifying the fields to update (if Paths is empty, no fields will be updated). Paths enumeration values:<br>[Top level] Name, Avatar, Description, AppMode, SharedKbIdList, FileVolumeMountList<br>[Greeting] Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList<br>[Model] Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel<br>[WebSearch] Config.WebSearch<br>[Memory] Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent<br>[Mode] Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig,Config.Mode.ClawAgentConfig<br> [Mode.ClawAgentConfig] Config.Mode.ClawAgentConfig.LongMemoryConfig, Config.Mode.ClawAgentConfig.AgentTeamConfig, Config.Mode.ClawAgentConfig.ChannelContextTimeoutConfig<br>[Experience] Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced<br>[Experience.Conversation] Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch,Config.Experience.Conversation.NewMessageInterrupt<br>[Experience.Conversation.AiCall] Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman<br>[Experience.Advanced] Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Field mask, specifying the fields to update (if Paths is empty, no fields will be updated). Paths enumeration values:<br>[Top level] Name, Avatar, Description, AppMode, SharedKbIdList, FileVolumeMountList<br>[Greeting] Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList<br>[Model] Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel<br>[WebSearch] Config.WebSearch<br>[Memory] Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent<br>[Mode] Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig,Config.Mode.ClawAgentConfig<br> [Mode.ClawAgentConfig] Config.Mode.ClawAgentConfig.LongMemoryConfig, Config.Mode.ClawAgentConfig.AgentTeamConfig, Config.Mode.ClawAgentConfig.ChannelContextTimeoutConfig<br>[Experience] Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced<br>[Experience.Conversation] Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch,Config.Experience.Conversation.NewMessageInterrupt<br>[Experience.Conversation.AiCall] Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman<br>[Experience.Advanced] Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility</p>
     * @param UpdateMask <p>Field mask, specifying the fields to update (if Paths is empty, no fields will be updated). Paths enumeration values:<br>[Top level] Name, Avatar, Description, AppMode, SharedKbIdList, FileVolumeMountList<br>[Greeting] Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList<br>[Model] Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel<br>[WebSearch] Config.WebSearch<br>[Memory] Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent<br>[Mode] Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig,Config.Mode.ClawAgentConfig<br> [Mode.ClawAgentConfig] Config.Mode.ClawAgentConfig.LongMemoryConfig, Config.Mode.ClawAgentConfig.AgentTeamConfig, Config.Mode.ClawAgentConfig.ChannelContextTimeoutConfig<br>[Experience] Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced<br>[Experience.Conversation] Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch,Config.Experience.Conversation.NewMessageInterrupt<br>[Experience.Conversation.AiCall] Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman<br>[Experience.Advanced] Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppRequest(ModifyAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Config != null) {
            this.Config = new AppConfig(source.Config);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SharedKbIdList != null) {
            this.SharedKbIdList = new String[source.SharedKbIdList.length];
            for (int i = 0; i < source.SharedKbIdList.length; i++) {
                this.SharedKbIdList[i] = new String(source.SharedKbIdList[i]);
            }
        }
        if (source.FileVolumeMountList != null) {
            this.FileVolumeMountList = new AppFileVolumeMount[source.FileVolumeMountList.length];
            for (int i = 0; i < source.FileVolumeMountList.length; i++) {
                this.FileVolumeMountList[i] = new AppFileVolumeMount(source.FileVolumeMountList[i]);
            }
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SharedKbIdList.", this.SharedKbIdList);
        this.setParamArrayObj(map, prefix + "FileVolumeMountList.", this.FileVolumeMountList);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

