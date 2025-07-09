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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLiveChannelRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Inputs to attach. You can attach 1 to 5 inputs.
    */
    @SerializedName("AttachedInputs")
    @Expose
    private AttachedInput [] AttachedInputs;

    /**
    * Configuration information of the channel's output groups. Quantity: [1, 10]
    */
    @SerializedName("OutputGroups")
    @Expose
    private StreamLiveOutputGroupsInfo [] OutputGroups;

    /**
    * Audio transcoding templates. Quantity: [1, 20]
    */
    @SerializedName("AudioTemplates")
    @Expose
    private AudioTemplateInfo [] AudioTemplates;

    /**
    * Video transcoding templates. Quantity: [1, 10]
    */
    @SerializedName("VideoTemplates")
    @Expose
    private VideoTemplateInfo [] VideoTemplates;

    /**
    * Audio/Video transcoding templates. Quantity: [1, 10]
    */
    @SerializedName("AVTemplates")
    @Expose
    private AVTemplate [] AVTemplates;

    /**
    * Subtitle template configuration, only AVTemplates are valid.
    */
    @SerializedName("CaptionTemplates")
    @Expose
    private SubtitleConf [] CaptionTemplates;

    /**
    * Event settings
    */
    @SerializedName("PlanSettings")
    @Expose
    private PlanSettings PlanSettings;

    /**
    * The callback settings.
    */
    @SerializedName("EventNotifySettings")
    @Expose
    private EventNotifySetting EventNotifySettings;

    /**
    * Complement the last video frame settings.
    */
    @SerializedName("InputLossBehavior")
    @Expose
    private InputLossBehaviorInfo InputLossBehavior;

    /**
    * Pipeline configuration.
    */
    @SerializedName("PipelineInputSettings")
    @Expose
    private PipelineInputSettingsInfo PipelineInputSettings;

    /**
    * Recognition configuration for input content.
    */
    @SerializedName("InputAnalysisSettings")
    @Expose
    private InputAnalysisInfo InputAnalysisSettings;

    /**
    * Console tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Frame capture templates.
    */
    @SerializedName("FrameCaptureTemplates")
    @Expose
    private FrameCaptureTemplate [] FrameCaptureTemplates;

    /**
    * General settings.
    */
    @SerializedName("GeneralSettings")
    @Expose
    private GeneralSetting GeneralSettings;

    /**
     * Get Channel ID 
     * @return Id Channel ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID
     * @param Id Channel ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Channel name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level 
     * @return Name Channel name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     * @param Name Channel name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Inputs to attach. You can attach 1 to 5 inputs. 
     * @return AttachedInputs Inputs to attach. You can attach 1 to 5 inputs.
     */
    public AttachedInput [] getAttachedInputs() {
        return this.AttachedInputs;
    }

    /**
     * Set Inputs to attach. You can attach 1 to 5 inputs.
     * @param AttachedInputs Inputs to attach. You can attach 1 to 5 inputs.
     */
    public void setAttachedInputs(AttachedInput [] AttachedInputs) {
        this.AttachedInputs = AttachedInputs;
    }

    /**
     * Get Configuration information of the channel's output groups. Quantity: [1, 10] 
     * @return OutputGroups Configuration information of the channel's output groups. Quantity: [1, 10]
     */
    public StreamLiveOutputGroupsInfo [] getOutputGroups() {
        return this.OutputGroups;
    }

    /**
     * Set Configuration information of the channel's output groups. Quantity: [1, 10]
     * @param OutputGroups Configuration information of the channel's output groups. Quantity: [1, 10]
     */
    public void setOutputGroups(StreamLiveOutputGroupsInfo [] OutputGroups) {
        this.OutputGroups = OutputGroups;
    }

    /**
     * Get Audio transcoding templates. Quantity: [1, 20] 
     * @return AudioTemplates Audio transcoding templates. Quantity: [1, 20]
     */
    public AudioTemplateInfo [] getAudioTemplates() {
        return this.AudioTemplates;
    }

    /**
     * Set Audio transcoding templates. Quantity: [1, 20]
     * @param AudioTemplates Audio transcoding templates. Quantity: [1, 20]
     */
    public void setAudioTemplates(AudioTemplateInfo [] AudioTemplates) {
        this.AudioTemplates = AudioTemplates;
    }

    /**
     * Get Video transcoding templates. Quantity: [1, 10] 
     * @return VideoTemplates Video transcoding templates. Quantity: [1, 10]
     */
    public VideoTemplateInfo [] getVideoTemplates() {
        return this.VideoTemplates;
    }

    /**
     * Set Video transcoding templates. Quantity: [1, 10]
     * @param VideoTemplates Video transcoding templates. Quantity: [1, 10]
     */
    public void setVideoTemplates(VideoTemplateInfo [] VideoTemplates) {
        this.VideoTemplates = VideoTemplates;
    }

    /**
     * Get Audio/Video transcoding templates. Quantity: [1, 10] 
     * @return AVTemplates Audio/Video transcoding templates. Quantity: [1, 10]
     */
    public AVTemplate [] getAVTemplates() {
        return this.AVTemplates;
    }

    /**
     * Set Audio/Video transcoding templates. Quantity: [1, 10]
     * @param AVTemplates Audio/Video transcoding templates. Quantity: [1, 10]
     */
    public void setAVTemplates(AVTemplate [] AVTemplates) {
        this.AVTemplates = AVTemplates;
    }

    /**
     * Get Subtitle template configuration, only AVTemplates are valid. 
     * @return CaptionTemplates Subtitle template configuration, only AVTemplates are valid.
     */
    public SubtitleConf [] getCaptionTemplates() {
        return this.CaptionTemplates;
    }

    /**
     * Set Subtitle template configuration, only AVTemplates are valid.
     * @param CaptionTemplates Subtitle template configuration, only AVTemplates are valid.
     */
    public void setCaptionTemplates(SubtitleConf [] CaptionTemplates) {
        this.CaptionTemplates = CaptionTemplates;
    }

    /**
     * Get Event settings 
     * @return PlanSettings Event settings
     */
    public PlanSettings getPlanSettings() {
        return this.PlanSettings;
    }

    /**
     * Set Event settings
     * @param PlanSettings Event settings
     */
    public void setPlanSettings(PlanSettings PlanSettings) {
        this.PlanSettings = PlanSettings;
    }

    /**
     * Get The callback settings. 
     * @return EventNotifySettings The callback settings.
     */
    public EventNotifySetting getEventNotifySettings() {
        return this.EventNotifySettings;
    }

    /**
     * Set The callback settings.
     * @param EventNotifySettings The callback settings.
     */
    public void setEventNotifySettings(EventNotifySetting EventNotifySettings) {
        this.EventNotifySettings = EventNotifySettings;
    }

    /**
     * Get Complement the last video frame settings. 
     * @return InputLossBehavior Complement the last video frame settings.
     */
    public InputLossBehaviorInfo getInputLossBehavior() {
        return this.InputLossBehavior;
    }

    /**
     * Set Complement the last video frame settings.
     * @param InputLossBehavior Complement the last video frame settings.
     */
    public void setInputLossBehavior(InputLossBehaviorInfo InputLossBehavior) {
        this.InputLossBehavior = InputLossBehavior;
    }

    /**
     * Get Pipeline configuration. 
     * @return PipelineInputSettings Pipeline configuration.
     */
    public PipelineInputSettingsInfo getPipelineInputSettings() {
        return this.PipelineInputSettings;
    }

    /**
     * Set Pipeline configuration.
     * @param PipelineInputSettings Pipeline configuration.
     */
    public void setPipelineInputSettings(PipelineInputSettingsInfo PipelineInputSettings) {
        this.PipelineInputSettings = PipelineInputSettings;
    }

    /**
     * Get Recognition configuration for input content. 
     * @return InputAnalysisSettings Recognition configuration for input content.
     */
    public InputAnalysisInfo getInputAnalysisSettings() {
        return this.InputAnalysisSettings;
    }

    /**
     * Set Recognition configuration for input content.
     * @param InputAnalysisSettings Recognition configuration for input content.
     */
    public void setInputAnalysisSettings(InputAnalysisInfo InputAnalysisSettings) {
        this.InputAnalysisSettings = InputAnalysisSettings;
    }

    /**
     * Get Console tag list. 
     * @return Tags Console tag list.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Console tag list.
     * @param Tags Console tag list.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Frame capture templates. 
     * @return FrameCaptureTemplates Frame capture templates.
     */
    public FrameCaptureTemplate [] getFrameCaptureTemplates() {
        return this.FrameCaptureTemplates;
    }

    /**
     * Set Frame capture templates.
     * @param FrameCaptureTemplates Frame capture templates.
     */
    public void setFrameCaptureTemplates(FrameCaptureTemplate [] FrameCaptureTemplates) {
        this.FrameCaptureTemplates = FrameCaptureTemplates;
    }

    /**
     * Get General settings. 
     * @return GeneralSettings General settings.
     */
    public GeneralSetting getGeneralSettings() {
        return this.GeneralSettings;
    }

    /**
     * Set General settings.
     * @param GeneralSettings General settings.
     */
    public void setGeneralSettings(GeneralSetting GeneralSettings) {
        this.GeneralSettings = GeneralSettings;
    }

    public ModifyStreamLiveChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLiveChannelRequest(ModifyStreamLiveChannelRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AttachedInputs != null) {
            this.AttachedInputs = new AttachedInput[source.AttachedInputs.length];
            for (int i = 0; i < source.AttachedInputs.length; i++) {
                this.AttachedInputs[i] = new AttachedInput(source.AttachedInputs[i]);
            }
        }
        if (source.OutputGroups != null) {
            this.OutputGroups = new StreamLiveOutputGroupsInfo[source.OutputGroups.length];
            for (int i = 0; i < source.OutputGroups.length; i++) {
                this.OutputGroups[i] = new StreamLiveOutputGroupsInfo(source.OutputGroups[i]);
            }
        }
        if (source.AudioTemplates != null) {
            this.AudioTemplates = new AudioTemplateInfo[source.AudioTemplates.length];
            for (int i = 0; i < source.AudioTemplates.length; i++) {
                this.AudioTemplates[i] = new AudioTemplateInfo(source.AudioTemplates[i]);
            }
        }
        if (source.VideoTemplates != null) {
            this.VideoTemplates = new VideoTemplateInfo[source.VideoTemplates.length];
            for (int i = 0; i < source.VideoTemplates.length; i++) {
                this.VideoTemplates[i] = new VideoTemplateInfo(source.VideoTemplates[i]);
            }
        }
        if (source.AVTemplates != null) {
            this.AVTemplates = new AVTemplate[source.AVTemplates.length];
            for (int i = 0; i < source.AVTemplates.length; i++) {
                this.AVTemplates[i] = new AVTemplate(source.AVTemplates[i]);
            }
        }
        if (source.CaptionTemplates != null) {
            this.CaptionTemplates = new SubtitleConf[source.CaptionTemplates.length];
            for (int i = 0; i < source.CaptionTemplates.length; i++) {
                this.CaptionTemplates[i] = new SubtitleConf(source.CaptionTemplates[i]);
            }
        }
        if (source.PlanSettings != null) {
            this.PlanSettings = new PlanSettings(source.PlanSettings);
        }
        if (source.EventNotifySettings != null) {
            this.EventNotifySettings = new EventNotifySetting(source.EventNotifySettings);
        }
        if (source.InputLossBehavior != null) {
            this.InputLossBehavior = new InputLossBehaviorInfo(source.InputLossBehavior);
        }
        if (source.PipelineInputSettings != null) {
            this.PipelineInputSettings = new PipelineInputSettingsInfo(source.PipelineInputSettings);
        }
        if (source.InputAnalysisSettings != null) {
            this.InputAnalysisSettings = new InputAnalysisInfo(source.InputAnalysisSettings);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.FrameCaptureTemplates != null) {
            this.FrameCaptureTemplates = new FrameCaptureTemplate[source.FrameCaptureTemplates.length];
            for (int i = 0; i < source.FrameCaptureTemplates.length; i++) {
                this.FrameCaptureTemplates[i] = new FrameCaptureTemplate(source.FrameCaptureTemplates[i]);
            }
        }
        if (source.GeneralSettings != null) {
            this.GeneralSettings = new GeneralSetting(source.GeneralSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AttachedInputs.", this.AttachedInputs);
        this.setParamArrayObj(map, prefix + "OutputGroups.", this.OutputGroups);
        this.setParamArrayObj(map, prefix + "AudioTemplates.", this.AudioTemplates);
        this.setParamArrayObj(map, prefix + "VideoTemplates.", this.VideoTemplates);
        this.setParamArrayObj(map, prefix + "AVTemplates.", this.AVTemplates);
        this.setParamArrayObj(map, prefix + "CaptionTemplates.", this.CaptionTemplates);
        this.setParamObj(map, prefix + "PlanSettings.", this.PlanSettings);
        this.setParamObj(map, prefix + "EventNotifySettings.", this.EventNotifySettings);
        this.setParamObj(map, prefix + "InputLossBehavior.", this.InputLossBehavior);
        this.setParamObj(map, prefix + "PipelineInputSettings.", this.PipelineInputSettings);
        this.setParamObj(map, prefix + "InputAnalysisSettings.", this.InputAnalysisSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "FrameCaptureTemplates.", this.FrameCaptureTemplates);
        this.setParamObj(map, prefix + "GeneralSettings.", this.GeneralSettings);

    }
}

