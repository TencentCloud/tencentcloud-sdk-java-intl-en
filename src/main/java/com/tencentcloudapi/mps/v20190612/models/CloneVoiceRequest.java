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

public class CloneVoiceRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 
    */
    @SerializedName("AudioLang")
    @Expose
    private String AudioLang;

    /**
    * 
    */
    @SerializedName("VoiceProfile")
    @Expose
    private VoiceProfile VoiceProfile;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * 
    */
    @SerializedName("Output")
    @Expose
    private SyncDubbingOutputOption Output;

    /**
    * 
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get  
     * @return AudioData 
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set 
     * @param AudioData 
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get  
     * @return AudioUrl 
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 
     * @param AudioUrl 
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get  
     * @return AudioLang 
     */
    public String getAudioLang() {
        return this.AudioLang;
    }

    /**
     * Set 
     * @param AudioLang 
     */
    public void setAudioLang(String AudioLang) {
        this.AudioLang = AudioLang;
    }

    /**
     * Get  
     * @return VoiceProfile 
     */
    public VoiceProfile getVoiceProfile() {
        return this.VoiceProfile;
    }

    /**
     * Set 
     * @param VoiceProfile 
     */
    public void setVoiceProfile(VoiceProfile VoiceProfile) {
        this.VoiceProfile = VoiceProfile;
    }

    /**
     * Get  
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get  
     * @return TextLang 
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set 
     * @param TextLang 
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get  
     * @return Output 
     */
    public SyncDubbingOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set 
     * @param Output 
     */
    public void setOutput(SyncDubbingOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get  
     * @return ExtParam 
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set 
     * @param ExtParam 
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public CloneVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceRequest(CloneVoiceRequest source) {
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioLang != null) {
            this.AudioLang = new String(source.AudioLang);
        }
        if (source.VoiceProfile != null) {
            this.VoiceProfile = new VoiceProfile(source.VoiceProfile);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
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
        this.setParamSimple(map, prefix + "AudioLang", this.AudioLang);
        this.setParamObj(map, prefix + "VoiceProfile.", this.VoiceProfile);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

