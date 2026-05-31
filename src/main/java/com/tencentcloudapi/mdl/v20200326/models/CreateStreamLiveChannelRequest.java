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

public class CreateStreamLiveChannelRequest extends AbstractModel {

    /**
    * Channel name, limited to lowercase letters, digits, and underscores, length [1, 32], unique in each Region.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Associated media input, limit on the number [1, 5].
    */
    @SerializedName("AttachedInputs")
    @Expose
    private AttachedInput [] AttachedInputs;

    /**
    * Configuration message of the output group for the channel. Limit on the number [1, 10].
    */
    @SerializedName("OutputGroups")
    @Expose
    private StreamLiveOutputGroupsInfo [] OutputGroups;

    /**
    * Audio transcoding template array, with the maximum number of [1, 20].
    */
    @SerializedName("AudioTemplates")
    @Expose
    private AudioTemplateInfo [] AudioTemplates;

    /**
    * Video transcoding template array, with the maximum number of [1, 10].
    */
    @SerializedName("VideoTemplates")
    @Expose
    private VideoTemplateInfo [] VideoTemplates;

    /**
    * Audio and video transcoding template array, with a limit on the number between 1 and 10.
    */
    @SerializedName("AVTemplates")
    @Expose
    private AVTemplate [] AVTemplates;

    /**
    * Subtitle template configuration is only valid for joint transcoding template.
    */
    @SerializedName("CaptionTemplates")
    @Expose
    private SubtitleConf [] CaptionTemplates;

    /**
    * Configuration message of the scheduled task.
    */
    @SerializedName("PlanSettings")
    @Expose
    private PlanSettings PlanSettings;

    /**
    * Callback configuration information.
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
    * Input content identification configuration.
    */
    @SerializedName("InputAnalysisSettings")
    @Expose
    private InputAnalysisInfo InputAnalysisSettings;

    /**
    * Console tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * chart template
    */
    @SerializedName("FrameCaptureTemplates")
    @Expose
    private FrameCaptureTemplate [] FrameCaptureTemplates;

    /**
    * Common configuration.
    */
    @SerializedName("GeneralSettings")
    @Expose
    private GeneralSetting GeneralSettings;

    /**
     * Get Channel name, limited to lowercase letters, digits, and underscores, length [1, 32], unique in each Region. 
     * @return Name Channel name, limited to lowercase letters, digits, and underscores, length [1, 32], unique in each Region.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name, limited to lowercase letters, digits, and underscores, length [1, 32], unique in each Region.
     * @param Name Channel name, limited to lowercase letters, digits, and underscores, length [1, 32], unique in each Region.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Associated media input, limit on the number [1, 5]. 
     * @return AttachedInputs Associated media input, limit on the number [1, 5].
     */
    public AttachedInput [] getAttachedInputs() {
        return this.AttachedInputs;
    }

    /**
     * Set Associated media input, limit on the number [1, 5].
     * @param AttachedInputs Associated media input, limit on the number [1, 5].
     */
    public void setAttachedInputs(AttachedInput [] AttachedInputs) {
        this.AttachedInputs = AttachedInputs;
    }

    /**
     * Get Configuration message of the output group for the channel. Limit on the number [1, 10]. 
     * @return OutputGroups Configuration message of the output group for the channel. Limit on the number [1, 10].
     */
    public StreamLiveOutputGroupsInfo [] getOutputGroups() {
        return this.OutputGroups;
    }

    /**
     * Set Configuration message of the output group for the channel. Limit on the number [1, 10].
     * @param OutputGroups Configuration message of the output group for the channel. Limit on the number [1, 10].
     */
    public void setOutputGroups(StreamLiveOutputGroupsInfo [] OutputGroups) {
        this.OutputGroups = OutputGroups;
    }

    /**
     * Get Audio transcoding template array, with the maximum number of [1, 20]. 
     * @return AudioTemplates Audio transcoding template array, with the maximum number of [1, 20].
     */
    public AudioTemplateInfo [] getAudioTemplates() {
        return this.AudioTemplates;
    }

    /**
     * Set Audio transcoding template array, with the maximum number of [1, 20].
     * @param AudioTemplates Audio transcoding template array, with the maximum number of [1, 20].
     */
    public void setAudioTemplates(AudioTemplateInfo [] AudioTemplates) {
        this.AudioTemplates = AudioTemplates;
    }

    /**
     * Get Video transcoding template array, with the maximum number of [1, 10]. 
     * @return VideoTemplates Video transcoding template array, with the maximum number of [1, 10].
     */
    public VideoTemplateInfo [] getVideoTemplates() {
        return this.VideoTemplates;
    }

    /**
     * Set Video transcoding template array, with the maximum number of [1, 10].
     * @param VideoTemplates Video transcoding template array, with the maximum number of [1, 10].
     */
    public void setVideoTemplates(VideoTemplateInfo [] VideoTemplates) {
        this.VideoTemplates = VideoTemplates;
    }

    /**
     * Get Audio and video transcoding template array, with a limit on the number between 1 and 10. 
     * @return AVTemplates Audio and video transcoding template array, with a limit on the number between 1 and 10.
     */
    public AVTemplate [] getAVTemplates() {
        return this.AVTemplates;
    }

    /**
     * Set Audio and video transcoding template array, with a limit on the number between 1 and 10.
     * @param AVTemplates Audio and video transcoding template array, with a limit on the number between 1 and 10.
     */
    public void setAVTemplates(AVTemplate [] AVTemplates) {
        this.AVTemplates = AVTemplates;
    }

    /**
     * Get Subtitle template configuration is only valid for joint transcoding template. 
     * @return CaptionTemplates Subtitle template configuration is only valid for joint transcoding template.
     */
    public SubtitleConf [] getCaptionTemplates() {
        return this.CaptionTemplates;
    }

    /**
     * Set Subtitle template configuration is only valid for joint transcoding template.
     * @param CaptionTemplates Subtitle template configuration is only valid for joint transcoding template.
     */
    public void setCaptionTemplates(SubtitleConf [] CaptionTemplates) {
        this.CaptionTemplates = CaptionTemplates;
    }

    /**
     * Get Configuration message of the scheduled task. 
     * @return PlanSettings Configuration message of the scheduled task.
     */
    public PlanSettings getPlanSettings() {
        return this.PlanSettings;
    }

    /**
     * Set Configuration message of the scheduled task.
     * @param PlanSettings Configuration message of the scheduled task.
     */
    public void setPlanSettings(PlanSettings PlanSettings) {
        this.PlanSettings = PlanSettings;
    }

    /**
     * Get Callback configuration information. 
     * @return EventNotifySettings Callback configuration information.
     */
    public EventNotifySetting getEventNotifySettings() {
        return this.EventNotifySettings;
    }

    /**
     * Set Callback configuration information.
     * @param EventNotifySettings Callback configuration information.
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
     * Get Input content identification configuration. 
     * @return InputAnalysisSettings Input content identification configuration.
     */
    public InputAnalysisInfo getInputAnalysisSettings() {
        return this.InputAnalysisSettings;
    }

    /**
     * Set Input content identification configuration.
     * @param InputAnalysisSettings Input content identification configuration.
     */
    public void setInputAnalysisSettings(InputAnalysisInfo InputAnalysisSettings) {
        this.InputAnalysisSettings = InputAnalysisSettings;
    }

    /**
     * Get Console tag list 
     * @return Tags Console tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Console tag list
     * @param Tags Console tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get chart template 
     * @return FrameCaptureTemplates chart template
     */
    public FrameCaptureTemplate [] getFrameCaptureTemplates() {
        return this.FrameCaptureTemplates;
    }

    /**
     * Set chart template
     * @param FrameCaptureTemplates chart template
     */
    public void setFrameCaptureTemplates(FrameCaptureTemplate [] FrameCaptureTemplates) {
        this.FrameCaptureTemplates = FrameCaptureTemplates;
    }

    /**
     * Get Common configuration. 
     * @return GeneralSettings Common configuration.
     */
    public GeneralSetting getGeneralSettings() {
        return this.GeneralSettings;
    }

    /**
     * Set Common configuration.
     * @param GeneralSettings Common configuration.
     */
    public void setGeneralSettings(GeneralSetting GeneralSettings) {
        this.GeneralSettings = GeneralSettings;
    }

    public CreateStreamLiveChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLiveChannelRequest(CreateStreamLiveChannelRequest source) {
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

