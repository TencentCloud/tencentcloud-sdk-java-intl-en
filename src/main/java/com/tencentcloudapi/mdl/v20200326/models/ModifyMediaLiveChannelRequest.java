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

public class ModifyMediaLiveChannelRequest extends AbstractModel{

    /**
    * Channel ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Associated media input. Quantity limit: [1,1].
    */
    @SerializedName("AttachedInputs")
    @Expose
    private AttachedInputInfo [] AttachedInputs;

    /**
    * Configuration information of channel output groups. Quantity limit: [1,10].
    */
    @SerializedName("OutputGroups")
    @Expose
    private OutputGroupsInfo [] OutputGroups;

    /**
    * Audio transcoding template array. Quantity limit: [1,20].
    */
    @SerializedName("AudioTemplates")
    @Expose
    private AudioTemplateInfo [] AudioTemplates;

    /**
    * Video transcoding template array. Quantity limit: [1,10].
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
     * Get Channel name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level. 
     * @return Name Channel name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
     * @param Name Channel name, which can contain 1–32 letters, digits, and underscores and must be unique at the region level.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Associated media input. Quantity limit: [1,1]. 
     * @return AttachedInputs Associated media input. Quantity limit: [1,1].
     */
    public AttachedInputInfo [] getAttachedInputs() {
        return this.AttachedInputs;
    }

    /**
     * Set Associated media input. Quantity limit: [1,1].
     * @param AttachedInputs Associated media input. Quantity limit: [1,1].
     */
    public void setAttachedInputs(AttachedInputInfo [] AttachedInputs) {
        this.AttachedInputs = AttachedInputs;
    }

    /**
     * Get Configuration information of channel output groups. Quantity limit: [1,10]. 
     * @return OutputGroups Configuration information of channel output groups. Quantity limit: [1,10].
     */
    public OutputGroupsInfo [] getOutputGroups() {
        return this.OutputGroups;
    }

    /**
     * Set Configuration information of channel output groups. Quantity limit: [1,10].
     * @param OutputGroups Configuration information of channel output groups. Quantity limit: [1,10].
     */
    public void setOutputGroups(OutputGroupsInfo [] OutputGroups) {
        this.OutputGroups = OutputGroups;
    }

    /**
     * Get Audio transcoding template array. Quantity limit: [1,20]. 
     * @return AudioTemplates Audio transcoding template array. Quantity limit: [1,20].
     */
    public AudioTemplateInfo [] getAudioTemplates() {
        return this.AudioTemplates;
    }

    /**
     * Set Audio transcoding template array. Quantity limit: [1,20].
     * @param AudioTemplates Audio transcoding template array. Quantity limit: [1,20].
     */
    public void setAudioTemplates(AudioTemplateInfo [] AudioTemplates) {
        this.AudioTemplates = AudioTemplates;
    }

    /**
     * Get Video transcoding template array. Quantity limit: [1,10]. 
     * @return VideoTemplates Video transcoding template array. Quantity limit: [1,10].
     */
    public VideoTemplateInfo [] getVideoTemplates() {
        return this.VideoTemplates;
    }

    /**
     * Set Video transcoding template array. Quantity limit: [1,10].
     * @param VideoTemplates Video transcoding template array. Quantity limit: [1,10].
     */
    public void setVideoTemplates(VideoTemplateInfo [] VideoTemplates) {
        this.VideoTemplates = VideoTemplates;
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

    }
}

