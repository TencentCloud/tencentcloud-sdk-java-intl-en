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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioFormat extends AbstractModel {

    /**
    * Generated audio format.

-TextToSpeechSSE streaming API.

Supports pcm. default: pcm.

-TextToSpeech non-streaming API.

Supports pcm, wav, mp3. default: pcm.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Generated audio sample rate. default 24000.
Selectable.
- 16000
- 24000 
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * MP3 bitrate (kbps), only applicable to mp3 format. can choose: `64`, `128`, `192`, `256`. default: `128`.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get Generated audio format.

-TextToSpeechSSE streaming API.

Supports pcm. default: pcm.

-TextToSpeech non-streaming API.

Supports pcm, wav, mp3. default: pcm. 
     * @return Format Generated audio format.

-TextToSpeechSSE streaming API.

Supports pcm. default: pcm.

-TextToSpeech non-streaming API.

Supports pcm, wav, mp3. default: pcm.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Generated audio format.

-TextToSpeechSSE streaming API.

Supports pcm. default: pcm.

-TextToSpeech non-streaming API.

Supports pcm, wav, mp3. default: pcm.
     * @param Format Generated audio format.

-TextToSpeechSSE streaming API.

Supports pcm. default: pcm.

-TextToSpeech non-streaming API.

Supports pcm, wav, mp3. default: pcm.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Generated audio sample rate. default 24000.
Selectable.
- 16000
- 24000  
     * @return SampleRate Generated audio sample rate. default 24000.
Selectable.
- 16000
- 24000 
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Generated audio sample rate. default 24000.
Selectable.
- 16000
- 24000 
     * @param SampleRate Generated audio sample rate. default 24000.
Selectable.
- 16000
- 24000 
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get MP3 bitrate (kbps), only applicable to mp3 format. can choose: `64`, `128`, `192`, `256`. default: `128`. 
     * @return Bitrate MP3 bitrate (kbps), only applicable to mp3 format. can choose: `64`, `128`, `192`, `256`. default: `128`.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set MP3 bitrate (kbps), only applicable to mp3 format. can choose: `64`, `128`, `192`, `256`. default: `128`.
     * @param Bitrate MP3 bitrate (kbps), only applicable to mp3 format. can choose: `64`, `128`, `192`, `256`. default: `128`.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    public AudioFormat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioFormat(AudioFormat source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}

