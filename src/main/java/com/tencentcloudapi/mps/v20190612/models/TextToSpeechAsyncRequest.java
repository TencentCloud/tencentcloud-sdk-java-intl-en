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

public class TextToSpeechAsyncRequest extends AbstractModel {

    /**
    * <p>Text to convert to speech.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Text language. The default value is Chinese.</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>Extended parameters in the format of a JSON string.</p><p>synExt (Object): Extended text to speech parameter.<br>  duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>  sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br>  pitch (Integer): -Pitch. Default value: 0 (original voice output). Value range: [-12, 12].</p><p>transExt (Object): Extended translation parameter.<br>  transInfo (Object).<br>   transDst (String): Target language, such as en.<br>  transRequirement (String): Translation requirements.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Text to convert to speech.</p> 
     * @return Text <p>Text to convert to speech.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Text to convert to speech.</p>
     * @param Text <p>Text to convert to speech.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
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
     * Get <p>Text language. The default value is Chinese.</p> 
     * @return TextLang <p>Text language. The default value is Chinese.</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>Text language. The default value is Chinese.</p>
     * @param TextLang <p>Text language. The default value is Chinese.</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string.</p><p>synExt (Object): Extended text to speech parameter.<br>  duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>  sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br>  pitch (Integer): -Pitch. Default value: 0 (original voice output). Value range: [-12, 12].</p><p>transExt (Object): Extended translation parameter.<br>  transInfo (Object).<br>   transDst (String): Target language, such as en.<br>  transRequirement (String): Translation requirements.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string.</p><p>synExt (Object): Extended text to speech parameter.<br>  duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>  sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br>  pitch (Integer): -Pitch. Default value: 0 (original voice output). Value range: [-12, 12].</p><p>transExt (Object): Extended translation parameter.<br>  transInfo (Object).<br>   transDst (String): Target language, such as en.<br>  transRequirement (String): Translation requirements.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string.</p><p>synExt (Object): Extended text to speech parameter.<br>  duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>  sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br>  pitch (Integer): -Pitch. Default value: 0 (original voice output). Value range: [-12, 12].</p><p>transExt (Object): Extended translation parameter.<br>  transInfo (Object).<br>   transDst (String): Target language, such as en.<br>  transRequirement (String): Translation requirements.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string.</p><p>synExt (Object): Extended text to speech parameter.<br>  duration (Float): Synthesized audio duration, in seconds. Example: 5.2.<br>  sampleRate (Integer): Synthesized audio sample rate. Default value: 16000. Supported values: [8000,16000,22050,32000,44100].<br>  pitch (Integer): -Pitch. Default value: 0 (original voice output). Value range: [-12, 12].</p><p>transExt (Object): Extended translation parameter.<br>  transInfo (Object).<br>   transDst (String): Target language, such as en.<br>  transRequirement (String): Translation requirements.</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public TextToSpeechAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechAsyncRequest(TextToSpeechAsyncRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

