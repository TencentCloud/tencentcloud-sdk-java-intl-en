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

public class AudioTemplateInfo extends AbstractModel {

    /**
    * Only `AttachedInputs.AudioSelectors.Name` can be selected. This parameter is required for RTP_PUSH and UDP_PUSH.
    */
    @SerializedName("AudioSelectorName")
    @Expose
    private String AudioSelectorName;

    /**
    * Audio transcoding template name, which can contain 1-20 letters and digits.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audio codec. Valid value: AAC. Default value: AAC.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. If this parameter is left empty, the original value will be used.
Valid values: 6000, 7000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Audio language code, whose length is always 3 characters.
    */
    @SerializedName("LanguageCode")
    @Expose
    private String LanguageCode;

    /**
     * Get Only `AttachedInputs.AudioSelectors.Name` can be selected. This parameter is required for RTP_PUSH and UDP_PUSH. 
     * @return AudioSelectorName Only `AttachedInputs.AudioSelectors.Name` can be selected. This parameter is required for RTP_PUSH and UDP_PUSH.
     */
    public String getAudioSelectorName() {
        return this.AudioSelectorName;
    }

    /**
     * Set Only `AttachedInputs.AudioSelectors.Name` can be selected. This parameter is required for RTP_PUSH and UDP_PUSH.
     * @param AudioSelectorName Only `AttachedInputs.AudioSelectors.Name` can be selected. This parameter is required for RTP_PUSH and UDP_PUSH.
     */
    public void setAudioSelectorName(String AudioSelectorName) {
        this.AudioSelectorName = AudioSelectorName;
    }

    /**
     * Get Audio transcoding template name, which can contain 1-20 letters and digits. 
     * @return Name Audio transcoding template name, which can contain 1-20 letters and digits.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio transcoding template name, which can contain 1-20 letters and digits.
     * @param Name Audio transcoding template name, which can contain 1-20 letters and digits.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audio codec. Valid value: AAC. Default value: AAC. 
     * @return Acodec Audio codec. Valid value: AAC. Default value: AAC.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio codec. Valid value: AAC. Default value: AAC.
     * @param Acodec Audio codec. Valid value: AAC. Default value: AAC.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. If this parameter is left empty, the original value will be used.
Valid values: 6000, 7000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000 
     * @return AudioBitrate Audio bitrate. If this parameter is left empty, the original value will be used.
Valid values: 6000, 7000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. If this parameter is left empty, the original value will be used.
Valid values: 6000, 7000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000
     * @param AudioBitrate Audio bitrate. If this parameter is left empty, the original value will be used.
Valid values: 6000, 7000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Audio language code, whose length is always 3 characters. 
     * @return LanguageCode Audio language code, whose length is always 3 characters.
     */
    public String getLanguageCode() {
        return this.LanguageCode;
    }

    /**
     * Set Audio language code, whose length is always 3 characters.
     * @param LanguageCode Audio language code, whose length is always 3 characters.
     */
    public void setLanguageCode(String LanguageCode) {
        this.LanguageCode = LanguageCode;
    }

    public AudioTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTemplateInfo(AudioTemplateInfo source) {
        if (source.AudioSelectorName != null) {
            this.AudioSelectorName = new String(source.AudioSelectorName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.LanguageCode != null) {
            this.LanguageCode = new String(source.LanguageCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioSelectorName", this.AudioSelectorName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "LanguageCode", this.LanguageCode);

    }
}

