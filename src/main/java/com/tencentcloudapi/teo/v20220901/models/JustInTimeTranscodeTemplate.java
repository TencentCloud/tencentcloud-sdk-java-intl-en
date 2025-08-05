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

public class JustInTimeTranscodeTemplate extends AbstractModel {

    /**
    * Unique identifier of the instant transcoding template.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Specifies the transcoding template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template description information.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. valid values: <li>preset: system-preset template;</li> <li>custom: user-defined template.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Enable video stream. valid values: <li>on: turn on;</li> <li>off: turn off.</li>.
    */
    @SerializedName("VideoStreamSwitch")
    @Expose
    private String VideoStreamSwitch;

    /**
    * Enable audio stream. valid values: <li>on: enable;</li> <li>off: disable.</li>.
    */
    @SerializedName("AudioStreamSwitch")
    @Expose
    private String AudioStreamSwitch;

    /**
    * Video stream configuration parameters. this field is valid only when VideoStreamSwitch is on.
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * Audio stream configuration parameters. specifies this field is valid only when AudioStreamSwitch is on.
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * Template creation time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique identifier of the instant transcoding template. 
     * @return TemplateId Unique identifier of the instant transcoding template.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Unique identifier of the instant transcoding template.
     * @param TemplateId Unique identifier of the instant transcoding template.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Specifies the transcoding template name. 
     * @return TemplateName Specifies the transcoding template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Specifies the transcoding template name.
     * @param TemplateName Specifies the transcoding template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Template description information. 
     * @return Comment Template description information.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information.
     * @param Comment Template description information.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. valid values: <li>preset: system-preset template;</li> <li>custom: user-defined template.</li>. 
     * @return Type Template type. valid values: <li>preset: system-preset template;</li> <li>custom: user-defined template.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. valid values: <li>preset: system-preset template;</li> <li>custom: user-defined template.</li>.
     * @param Type Template type. valid values: <li>preset: system-preset template;</li> <li>custom: user-defined template.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Enable video stream. valid values: <li>on: turn on;</li> <li>off: turn off.</li>. 
     * @return VideoStreamSwitch Enable video stream. valid values: <li>on: turn on;</li> <li>off: turn off.</li>.
     */
    public String getVideoStreamSwitch() {
        return this.VideoStreamSwitch;
    }

    /**
     * Set Enable video stream. valid values: <li>on: turn on;</li> <li>off: turn off.</li>.
     * @param VideoStreamSwitch Enable video stream. valid values: <li>on: turn on;</li> <li>off: turn off.</li>.
     */
    public void setVideoStreamSwitch(String VideoStreamSwitch) {
        this.VideoStreamSwitch = VideoStreamSwitch;
    }

    /**
     * Get Enable audio stream. valid values: <li>on: enable;</li> <li>off: disable.</li>. 
     * @return AudioStreamSwitch Enable audio stream. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     */
    public String getAudioStreamSwitch() {
        return this.AudioStreamSwitch;
    }

    /**
     * Set Enable audio stream. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     * @param AudioStreamSwitch Enable audio stream. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     */
    public void setAudioStreamSwitch(String AudioStreamSwitch) {
        this.AudioStreamSwitch = AudioStreamSwitch;
    }

    /**
     * Get Video stream configuration parameters. this field is valid only when VideoStreamSwitch is on. 
     * @return VideoTemplate Video stream configuration parameters. this field is valid only when VideoStreamSwitch is on.
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set Video stream configuration parameters. this field is valid only when VideoStreamSwitch is on.
     * @param VideoTemplate Video stream configuration parameters. this field is valid only when VideoStreamSwitch is on.
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get Audio stream configuration parameters. specifies this field is valid only when AudioStreamSwitch is on. 
     * @return AudioTemplate Audio stream configuration parameters. specifies this field is valid only when AudioStreamSwitch is on.
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set Audio stream configuration parameters. specifies this field is valid only when AudioStreamSwitch is on.
     * @param AudioTemplate Audio stream configuration parameters. specifies this field is valid only when AudioStreamSwitch is on.
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get Template creation time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template last modified time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time. uses [ISO date format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public JustInTimeTranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JustInTimeTranscodeTemplate(JustInTimeTranscodeTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VideoStreamSwitch", this.VideoStreamSwitch);
        this.setParamSimple(map, prefix + "AudioStreamSwitch", this.AudioStreamSwitch);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

