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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeVoiceRequest extends AbstractModel {

    /**
    * <p>base64-encoded audio to be converted.</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>Audio Url to be switched. Valid when AudioData is empty.</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>Voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Output parameters.</p>
    */
    @SerializedName("Output")
    @Expose
    private SyncDubbingOutputOption Output;

    /**
    * <p>Extended parameters in the format of a JSON string.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>base64-encoded audio to be converted.</p> 
     * @return AudioData <p>base64-encoded audio to be converted.</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>base64-encoded audio to be converted.</p>
     * @param AudioData <p>base64-encoded audio to be converted.</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>Audio Url to be switched. Valid when AudioData is empty.</p> 
     * @return AudioUrl <p>Audio Url to be switched. Valid when AudioData is empty.</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>Audio Url to be switched. Valid when AudioData is empty.</p>
     * @param AudioUrl <p>Audio Url to be switched. Valid when AudioData is empty.</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>Voice ID.</p> 
     * @return VoiceId <p>Voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice ID.</p>
     * @param VoiceId <p>Voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Output parameters.</p> 
     * @return Output <p>Output parameters.</p>
     */
    public SyncDubbingOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output parameters.</p>
     * @param Output <p>Output parameters.</p>
     */
    public void setOutput(SyncDubbingOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public ChangeVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeVoiceRequest(ChangeVoiceRequest source) {
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Output != null) {
            this.Output = new SyncDubbingOutputOption(source.Output);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

