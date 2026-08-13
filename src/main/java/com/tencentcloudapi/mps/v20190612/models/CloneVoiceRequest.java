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
    * <p>Clone audio base64 encoding</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>Cloning audio URL. Valid when AudioData is empty.</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>Cloning audio language. The default language is Chinese. Currently supported languages are the same as those for Text To Speech (TTS) TextLang.</p>
    */
    @SerializedName("AudioLang")
    @Expose
    private String AudioLang;

    /**
    * <p>Voice attribute. Voice type querying and match usage.</p>
    */
    @SerializedName("VoiceProfile")
    @Expose
    private VoiceProfile VoiceProfile;

    /**
    * <p>Audition text</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Language of the audition text, by default if left blank, auto-detection. Current supported languages are the same as Text To Speech.</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>Output parameters. Specifies the output audio format, etc. The default output audio format is base64.</p>
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
     * Get <p>Clone audio base64 encoding</p> 
     * @return AudioData <p>Clone audio base64 encoding</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>Clone audio base64 encoding</p>
     * @param AudioData <p>Clone audio base64 encoding</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>Cloning audio URL. Valid when AudioData is empty.</p> 
     * @return AudioUrl <p>Cloning audio URL. Valid when AudioData is empty.</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>Cloning audio URL. Valid when AudioData is empty.</p>
     * @param AudioUrl <p>Cloning audio URL. Valid when AudioData is empty.</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>Cloning audio language. The default language is Chinese. Currently supported languages are the same as those for Text To Speech (TTS) TextLang.</p> 
     * @return AudioLang <p>Cloning audio language. The default language is Chinese. Currently supported languages are the same as those for Text To Speech (TTS) TextLang.</p>
     */
    public String getAudioLang() {
        return this.AudioLang;
    }

    /**
     * Set <p>Cloning audio language. The default language is Chinese. Currently supported languages are the same as those for Text To Speech (TTS) TextLang.</p>
     * @param AudioLang <p>Cloning audio language. The default language is Chinese. Currently supported languages are the same as those for Text To Speech (TTS) TextLang.</p>
     */
    public void setAudioLang(String AudioLang) {
        this.AudioLang = AudioLang;
    }

    /**
     * Get <p>Voice attribute. Voice type querying and match usage.</p> 
     * @return VoiceProfile <p>Voice attribute. Voice type querying and match usage.</p>
     */
    public VoiceProfile getVoiceProfile() {
        return this.VoiceProfile;
    }

    /**
     * Set <p>Voice attribute. Voice type querying and match usage.</p>
     * @param VoiceProfile <p>Voice attribute. Voice type querying and match usage.</p>
     */
    public void setVoiceProfile(VoiceProfile VoiceProfile) {
        this.VoiceProfile = VoiceProfile;
    }

    /**
     * Get <p>Audition text</p> 
     * @return Text <p>Audition text</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Audition text</p>
     * @param Text <p>Audition text</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Language of the audition text, by default if left blank, auto-detection. Current supported languages are the same as Text To Speech.</p> 
     * @return TextLang <p>Language of the audition text, by default if left blank, auto-detection. Current supported languages are the same as Text To Speech.</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>Language of the audition text, by default if left blank, auto-detection. Current supported languages are the same as Text To Speech.</p>
     * @param TextLang <p>Language of the audition text, by default if left blank, auto-detection. Current supported languages are the same as Text To Speech.</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get <p>Output parameters. Specifies the output audio format, etc. The default output audio format is base64.</p> 
     * @return Output <p>Output parameters. Specifies the output audio format, etc. The default output audio format is base64.</p>
     */
    public SyncDubbingOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Output parameters. Specifies the output audio format, etc. The default output audio format is base64.</p>
     * @param Output <p>Output parameters. Specifies the output audio format, etc. The default output audio format is base64.</p>
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

