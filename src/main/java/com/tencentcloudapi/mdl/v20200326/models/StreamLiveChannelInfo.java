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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamLiveChannelInfo extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel status
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Information of attached inputs
    */
    @SerializedName("AttachedInputs")
    @Expose
    private AttachedInput [] AttachedInputs;

    /**
    * Information of output groups
    */
    @SerializedName("OutputGroups")
    @Expose
    private StreamLiveOutputGroupsInfo [] OutputGroups;

    /**
    * Channel name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AudioTemplates")
    @Expose
    private AudioTemplateInfo [] AudioTemplates;

    /**
    * Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VideoTemplates")
    @Expose
    private VideoTemplateInfo [] VideoTemplates;

    /**
    * Audio/Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AVTemplates")
    @Expose
    private AVTemplate [] AVTemplates;

    /**
    * Event settings
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PlanSettings")
    @Expose
    private PlanSettings PlanSettings;

    /**
    * The callback settings.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EventNotifySettings")
    @Expose
    private EventNotifySetting EventNotifySettings;

    /**
    * Supplement the last video frame configuration settings.
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
     * Get Channel status 
     * @return State Channel status
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Channel status
     * @param State Channel status
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Information of attached inputs 
     * @return AttachedInputs Information of attached inputs
     */
    public AttachedInput [] getAttachedInputs() {
        return this.AttachedInputs;
    }

    /**
     * Set Information of attached inputs
     * @param AttachedInputs Information of attached inputs
     */
    public void setAttachedInputs(AttachedInput [] AttachedInputs) {
        this.AttachedInputs = AttachedInputs;
    }

    /**
     * Get Information of output groups 
     * @return OutputGroups Information of output groups
     */
    public StreamLiveOutputGroupsInfo [] getOutputGroups() {
        return this.OutputGroups;
    }

    /**
     * Set Information of output groups
     * @param OutputGroups Information of output groups
     */
    public void setOutputGroups(StreamLiveOutputGroupsInfo [] OutputGroups) {
        this.OutputGroups = OutputGroups;
    }

    /**
     * Get Channel name 
     * @return Name Channel name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name
     * @param Name Channel name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audio transcoding templates
Note: this field may return `null`, indicating that no valid value was found. 
     * @return AudioTemplates Audio transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     */
    public AudioTemplateInfo [] getAudioTemplates() {
        return this.AudioTemplates;
    }

    /**
     * Set Audio transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     * @param AudioTemplates Audio transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setAudioTemplates(AudioTemplateInfo [] AudioTemplates) {
        this.AudioTemplates = AudioTemplates;
    }

    /**
     * Get Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found. 
     * @return VideoTemplates Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     */
    public VideoTemplateInfo [] getVideoTemplates() {
        return this.VideoTemplates;
    }

    /**
     * Set Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     * @param VideoTemplates Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setVideoTemplates(VideoTemplateInfo [] VideoTemplates) {
        this.VideoTemplates = VideoTemplates;
    }

    /**
     * Get Audio/Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found. 
     * @return AVTemplates Audio/Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     */
    public AVTemplate [] getAVTemplates() {
        return this.AVTemplates;
    }

    /**
     * Set Audio/Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     * @param AVTemplates Audio/Video transcoding templates
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setAVTemplates(AVTemplate [] AVTemplates) {
        this.AVTemplates = AVTemplates;
    }

    /**
     * Get Event settings
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PlanSettings Event settings
Note: This field may return `null`, indicating that no valid value was found.
     */
    public PlanSettings getPlanSettings() {
        return this.PlanSettings;
    }

    /**
     * Set Event settings
Note: This field may return `null`, indicating that no valid value was found.
     * @param PlanSettings Event settings
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPlanSettings(PlanSettings PlanSettings) {
        this.PlanSettings = PlanSettings;
    }

    /**
     * Get The callback settings.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EventNotifySettings The callback settings.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public EventNotifySetting getEventNotifySettings() {
        return this.EventNotifySettings;
    }

    /**
     * Set The callback settings.
Note: This field may return `null`, indicating that no valid value was found.
     * @param EventNotifySettings The callback settings.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEventNotifySettings(EventNotifySetting EventNotifySettings) {
        this.EventNotifySettings = EventNotifySettings;
    }

    /**
     * Get Supplement the last video frame configuration settings. 
     * @return InputLossBehavior Supplement the last video frame configuration settings.
     */
    public InputLossBehaviorInfo getInputLossBehavior() {
        return this.InputLossBehavior;
    }

    /**
     * Set Supplement the last video frame configuration settings.
     * @param InputLossBehavior Supplement the last video frame configuration settings.
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

    public StreamLiveChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamLiveChannelInfo(StreamLiveChannelInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.State != null) {
            this.State = new String(source.State);
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "AttachedInputs.", this.AttachedInputs);
        this.setParamArrayObj(map, prefix + "OutputGroups.", this.OutputGroups);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AudioTemplates.", this.AudioTemplates);
        this.setParamArrayObj(map, prefix + "VideoTemplates.", this.VideoTemplates);
        this.setParamArrayObj(map, prefix + "AVTemplates.", this.AVTemplates);
        this.setParamObj(map, prefix + "PlanSettings.", this.PlanSettings);
        this.setParamObj(map, prefix + "EventNotifySettings.", this.EventNotifySettings);
        this.setParamObj(map, prefix + "InputLossBehavior.", this.InputLossBehavior);
        this.setParamObj(map, prefix + "PipelineInputSettings.", this.PipelineInputSettings);

    }
}

