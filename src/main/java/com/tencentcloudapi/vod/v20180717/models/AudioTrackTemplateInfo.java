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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTrackTemplateInfo extends AbstractModel{

    /**
    * Unique ID of a template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Audio track encoder.
When `Container` is `mp3`, the valid value is:
<li>libmp3lame.</li>
When `Container` is `ogg` or `flac`, the valid value is:
<li>flac.</li>
When `Container` is `m4a`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the video track's `Container` is `mp4` or `flv`, the valid values include:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the video track's `Container` is `hls`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame.</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Audio channel system. Valid values:
<li>1: Mono</li>
<li>2: Dual</li>
<li>6: Stereo</li>
Default value: 2.
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of a template. 
     * @return Definition Unique ID of a template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a template.
     * @param Definition Unique ID of a template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Audio track encoder.
When `Container` is `mp3`, the valid value is:
<li>libmp3lame.</li>
When `Container` is `ogg` or `flac`, the valid value is:
<li>flac.</li>
When `Container` is `m4a`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the video track's `Container` is `mp4` or `flv`, the valid values include:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the video track's `Container` is `hls`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame.</li> 
     * @return Codec Audio track encoder.
When `Container` is `mp3`, the valid value is:
<li>libmp3lame.</li>
When `Container` is `ogg` or `flac`, the valid value is:
<li>flac.</li>
When `Container` is `m4a`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the video track's `Container` is `mp4` or `flv`, the valid values include:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the video track's `Container` is `hls`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame.</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Audio track encoder.
When `Container` is `mp3`, the valid value is:
<li>libmp3lame.</li>
When `Container` is `ogg` or `flac`, the valid value is:
<li>flac.</li>
When `Container` is `m4a`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the video track's `Container` is `mp4` or `flv`, the valid values include:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the video track's `Container` is `hls`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame.</li>
     * @param Codec Audio track encoder.
When `Container` is `mp3`, the valid value is:
<li>libmp3lame.</li>
When `Container` is `ogg` or `flac`, the valid value is:
<li>flac.</li>
When `Container` is `m4a`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame;</li>
<li>ac3.</li>
When the video track's `Container` is `mp4` or `flv`, the valid values include:
<li>libfdk_aac: more suitable for mp4;</li>
<li>libmp3lame: more suitable for flv;</li>
<li>mp2.</li>
When the video track's `Container` is `hls`, the valid values include:
<li>libfdk_aac;</li>
<li>libmp3lame.</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio. 
     * @return Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     * @param Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256].
If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz. 
     * @return SampleRate Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     * @param SampleRate Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Template name. Length limit: 64 characters. 
     * @return Name Template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. Length limit: 64 characters.
     * @param Name Template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Audio channel system. Valid values:
<li>1: Mono</li>
<li>2: Dual</li>
<li>6: Stereo</li>
Default value: 2. 
     * @return AudioChannel Audio channel system. Valid values:
<li>1: Mono</li>
<li>2: Dual</li>
<li>6: Stereo</li>
Default value: 2.
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel system. Valid values:
<li>1: Mono</li>
<li>2: Dual</li>
<li>6: Stereo</li>
Default value: 2.
     * @param AudioChannel Audio channel system. Valid values:
<li>1: Mono</li>
<li>2: Dual</li>
<li>6: Stereo</li>
Default value: 2.
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param CreateTime Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

