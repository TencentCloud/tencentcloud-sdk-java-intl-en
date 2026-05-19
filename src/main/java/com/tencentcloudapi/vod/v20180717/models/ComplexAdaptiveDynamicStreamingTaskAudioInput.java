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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplexAdaptiveDynamicStreamingTaskAudioInput extends AbstractModel {

    /**
    * <p>Media ID of the audio source. The first audio stream in the media source file is used by default. The video stream and other audio streams (if any) will be ignored.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Name of the audio stream in the output adaptive bitrate stream. Length limit is 16 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>The language of the audio stream in the output adaptive bitrate stream, with a length limit of 16 characters. It must comply with RFC5646.</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Set as default audio for adaptive bitrate. Value:</p><li>YES: Set as default audio;</li><li>NO: Do not set as default audio (default value).</li>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>Audio track serial number, which means selecting the nth audio track in the audio source, counting begins from 0. Default value is 0, means selecting the audio track positioned towards the front.</p>
    */
    @SerializedName("AudioTrackIdx")
    @Expose
    private Long AudioTrackIdx;

    /**
     * Get <p>Media ID of the audio source. The first audio stream in the media source file is used by default. The video stream and other audio streams (if any) will be ignored.</p> 
     * @return FileId <p>Media ID of the audio source. The first audio stream in the media source file is used by default. The video stream and other audio streams (if any) will be ignored.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media ID of the audio source. The first audio stream in the media source file is used by default. The video stream and other audio streams (if any) will be ignored.</p>
     * @param FileId <p>Media ID of the audio source. The first audio stream in the media source file is used by default. The video stream and other audio streams (if any) will be ignored.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Name of the audio stream in the output adaptive bitrate stream. Length limit is 16 characters.</p> 
     * @return Name <p>Name of the audio stream in the output adaptive bitrate stream. Length limit is 16 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name of the audio stream in the output adaptive bitrate stream. Length limit is 16 characters.</p>
     * @param Name <p>Name of the audio stream in the output adaptive bitrate stream. Length limit is 16 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>The language of the audio stream in the output adaptive bitrate stream, with a length limit of 16 characters. It must comply with RFC5646.</p> 
     * @return Language <p>The language of the audio stream in the output adaptive bitrate stream, with a length limit of 16 characters. It must comply with RFC5646.</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>The language of the audio stream in the output adaptive bitrate stream, with a length limit of 16 characters. It must comply with RFC5646.</p>
     * @param Language <p>The language of the audio stream in the output adaptive bitrate stream, with a length limit of 16 characters. It must comply with RFC5646.</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Set as default audio for adaptive bitrate. Value:</p><li>YES: Set as default audio;</li><li>NO: Do not set as default audio (default value).</li> 
     * @return Default <p>Set as default audio for adaptive bitrate. Value:</p><li>YES: Set as default audio;</li><li>NO: Do not set as default audio (default value).</li>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>Set as default audio for adaptive bitrate. Value:</p><li>YES: Set as default audio;</li><li>NO: Do not set as default audio (default value).</li>
     * @param Default <p>Set as default audio for adaptive bitrate. Value:</p><li>YES: Set as default audio;</li><li>NO: Do not set as default audio (default value).</li>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>Audio track serial number, which means selecting the nth audio track in the audio source, counting begins from 0. Default value is 0, means selecting the audio track positioned towards the front.</p> 
     * @return AudioTrackIdx <p>Audio track serial number, which means selecting the nth audio track in the audio source, counting begins from 0. Default value is 0, means selecting the audio track positioned towards the front.</p>
     */
    public Long getAudioTrackIdx() {
        return this.AudioTrackIdx;
    }

    /**
     * Set <p>Audio track serial number, which means selecting the nth audio track in the audio source, counting begins from 0. Default value is 0, means selecting the audio track positioned towards the front.</p>
     * @param AudioTrackIdx <p>Audio track serial number, which means selecting the nth audio track in the audio source, counting begins from 0. Default value is 0, means selecting the audio track positioned towards the front.</p>
     */
    public void setAudioTrackIdx(Long AudioTrackIdx) {
        this.AudioTrackIdx = AudioTrackIdx;
    }

    public ComplexAdaptiveDynamicStreamingTaskAudioInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput(ComplexAdaptiveDynamicStreamingTaskAudioInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.AudioTrackIdx != null) {
            this.AudioTrackIdx = new Long(source.AudioTrackIdx);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "AudioTrackIdx", this.AudioTrackIdx);

    }
}

