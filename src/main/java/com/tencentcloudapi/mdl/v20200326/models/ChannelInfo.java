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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelInfo extends AbstractModel{

    /**
    * Channel ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Information of associated input.
    */
    @SerializedName("AttachedInputs")
    @Expose
    private AttachedInputInfo [] AttachedInputs;

    /**
    * Information of output group.
    */
    @SerializedName("OutputGroups")
    @Expose
    private OutputGroupsInfo [] OutputGroups;

    /**
    * Channel name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioTemplates")
    @Expose
    private AudioTemplateInfo [] AudioTemplates;

    /**
    * Video transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoTemplates")
    @Expose
    private VideoTemplateInfo [] VideoTemplates;

    /**
     * Get Channel ID. 
     * @return Id Channel ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID.
     * @param Id Channel ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Channel status. 
     * @return State Channel status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Channel status.
     * @param State Channel status.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Information of associated input. 
     * @return AttachedInputs Information of associated input.
     */
    public AttachedInputInfo [] getAttachedInputs() {
        return this.AttachedInputs;
    }

    /**
     * Set Information of associated input.
     * @param AttachedInputs Information of associated input.
     */
    public void setAttachedInputs(AttachedInputInfo [] AttachedInputs) {
        this.AttachedInputs = AttachedInputs;
    }

    /**
     * Get Information of output group. 
     * @return OutputGroups Information of output group.
     */
    public OutputGroupsInfo [] getOutputGroups() {
        return this.OutputGroups;
    }

    /**
     * Set Information of output group.
     * @param OutputGroups Information of output group.
     */
    public void setOutputGroups(OutputGroupsInfo [] OutputGroups) {
        this.OutputGroups = OutputGroups;
    }

    /**
     * Get Channel name. 
     * @return Name Channel name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name.
     * @param Name Channel name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audio transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioTemplates Audio transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioTemplateInfo [] getAudioTemplates() {
        return this.AudioTemplates;
    }

    /**
     * Set Audio transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioTemplates Audio transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioTemplates(AudioTemplateInfo [] AudioTemplates) {
        this.AudioTemplates = AudioTemplates;
    }

    /**
     * Get Video transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoTemplates Video transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public VideoTemplateInfo [] getVideoTemplates() {
        return this.VideoTemplates;
    }

    /**
     * Set Video transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoTemplates Video transcoding template array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoTemplates(VideoTemplateInfo [] VideoTemplates) {
        this.VideoTemplates = VideoTemplates;
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

    }
}

