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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJustInTimeTranscodeTemplateRequest extends AbstractModel {

    /**
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Name of the just in time transcoding template, length limited to 64 characters.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template description, with a length limit of 256 characters. empty by default.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Enable video stream. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
    */
    @SerializedName("VideoStreamSwitch")
    @Expose
    private String VideoStreamSwitch;

    /**
    * Enable audio stream switch. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
    */
    @SerializedName("AudioStreamSwitch")
    @Expose
    private String AudioStreamSwitch;

    /**
    * Video stream configuration parameters. this field is required when VideoStreamSwitch is on.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * Audio stream configuration parameters. this field is required when AudioStreamSwitch is on.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Name of the just in time transcoding template, length limited to 64 characters. 
     * @return TemplateName Name of the just in time transcoding template, length limited to 64 characters.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Name of the just in time transcoding template, length limited to 64 characters.
     * @param TemplateName Name of the just in time transcoding template, length limited to 64 characters.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Template description, with a length limit of 256 characters. empty by default. 
     * @return Comment Template description, with a length limit of 256 characters. empty by default.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters. empty by default.
     * @param Comment Template description, with a length limit of 256 characters. empty by default.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Enable video stream. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on. 
     * @return VideoStreamSwitch Enable video stream. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
     */
    public String getVideoStreamSwitch() {
        return this.VideoStreamSwitch;
    }

    /**
     * Set Enable video stream. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
     * @param VideoStreamSwitch Enable video stream. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
     */
    public void setVideoStreamSwitch(String VideoStreamSwitch) {
        this.VideoStreamSwitch = VideoStreamSwitch;
    }

    /**
     * Get Enable audio stream switch. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on. 
     * @return AudioStreamSwitch Enable audio stream switch. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
     */
    public String getAudioStreamSwitch() {
        return this.AudioStreamSwitch;
    }

    /**
     * Set Enable audio stream switch. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
     * @param AudioStreamSwitch Enable audio stream switch. valid values:.
<li>`on`: Enable;</li>

<li>off: disabled.</li>default value: on.
     */
    public void setAudioStreamSwitch(String AudioStreamSwitch) {
        this.AudioStreamSwitch = AudioStreamSwitch;
    }

    /**
     * Get Video stream configuration parameters. this field is required when VideoStreamSwitch is on. 
     * @return VideoTemplate Video stream configuration parameters. this field is required when VideoStreamSwitch is on.
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameters. this field is required when VideoStreamSwitch is on.
     * @param VideoTemplate Video stream configuration parameters. this field is required when VideoStreamSwitch is on.
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameters. this field is required when AudioStreamSwitch is on. 
     * @return AudioTemplate Audio stream configuration parameters. this field is required when AudioStreamSwitch is on.
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameters. this field is required when AudioStreamSwitch is on.
     * @param AudioTemplate Audio stream configuration parameters. this field is required when AudioStreamSwitch is on.
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    public CreateJustInTimeTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJustInTimeTranscodeTemplateRequest(CreateJustInTimeTranscodeTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.VideoStreamSwitch != null) {
            this.VideoStreamSwitch = new String(source.VideoStreamSwitch);
        }
        if (source.AudioStreamSwitch != null) {
            this.AudioStreamSwitch = new String(source.AudioStreamSwitch);
        }
        if (source.VideoTemplate != null) {
            this.VideoTemplate = new VideoTemplateInfo(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfo(source.AudioTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "VideoStreamSwitch", this.VideoStreamSwitch);
        this.setParamSimple(map, prefix + "AudioStreamSwitch", this.AudioStreamSwitch);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);

    }
}

