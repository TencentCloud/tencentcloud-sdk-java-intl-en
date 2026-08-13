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

public class TextToSpeechRequest extends AbstractModel {

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
    * <p>Text language. This defaults to auto-identification if left blank.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>Output parameters.</p>
    */
    @SerializedName("Output")
    @Expose
    private SyncDubbingOutputOption Output;

    /**
    * <p>Additional parameters, json string</p><p><strong>synExt</strong> Object Text To Speech extension parameters<br>   <strong>duration</strong> Float Synthetic audio duration in seconds. No throttling period by default. For example: 5.2<br>   <strong>format</strong> String Output audio format. Default is wav. Support wav and mp3.<br>   <strong>sampleRate</strong> Integer Synthetic audio sample rate. Default is 16000. Support [8000,16000,22050,24000,32000,44100]</p>
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
     * Get <p>Text language. This defaults to auto-identification if left blank.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p> 
     * @return TextLang <p>Text language. This defaults to auto-identification if left blank.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>Text language. This defaults to auto-identification if left blank.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
     * @param TextLang <p>Text language. This defaults to auto-identification if left blank.<br>Supported languages:<br>zh    Chinese<br>en    English<br>ja    Japanese<br>de    German<br>fr    French<br>ko    Korean<br>ru    Russian<br>uk    Ukrainian<br>pt    Portuguese<br>it    Italian<br>es    Spanish<br>id    Indonesian<br>nl    Dutch<br>tr    Turkish<br>fil    Filipino<br>ms    Malay<br>el    Greek<br>fi    Finnish<br>hr    Croatian<br>sk    Slovak<br>pl    Polish<br>sv    Swedish<br>hi    Hindi<br>bg    Bulgarian<br>ro    Romanian<br>ar    Arabic<br>cs    Czech<br>da    Danish<br>ta    Tamil<br>hun    Hungarian<br>vi    Vietnamese<br>no    Norwegian<br>yue    Cantonese<br>th    Thai<br>he    Hebrew<br>ca    Catalan<br>nn    Nynorsk<br>af    Afrikaans<br>fa    Persian<br>sl    Slovenian</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
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
     * Get <p>Additional parameters, json string</p><p><strong>synExt</strong> Object Text To Speech extension parameters<br>   <strong>duration</strong> Float Synthetic audio duration in seconds. No throttling period by default. For example: 5.2<br>   <strong>format</strong> String Output audio format. Default is wav. Support wav and mp3.<br>   <strong>sampleRate</strong> Integer Synthetic audio sample rate. Default is 16000. Support [8000,16000,22050,24000,32000,44100]</p> 
     * @return ExtParam <p>Additional parameters, json string</p><p><strong>synExt</strong> Object Text To Speech extension parameters<br>   <strong>duration</strong> Float Synthetic audio duration in seconds. No throttling period by default. For example: 5.2<br>   <strong>format</strong> String Output audio format. Default is wav. Support wav and mp3.<br>   <strong>sampleRate</strong> Integer Synthetic audio sample rate. Default is 16000. Support [8000,16000,22050,24000,32000,44100]</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Additional parameters, json string</p><p><strong>synExt</strong> Object Text To Speech extension parameters<br>   <strong>duration</strong> Float Synthetic audio duration in seconds. No throttling period by default. For example: 5.2<br>   <strong>format</strong> String Output audio format. Default is wav. Support wav and mp3.<br>   <strong>sampleRate</strong> Integer Synthetic audio sample rate. Default is 16000. Support [8000,16000,22050,24000,32000,44100]</p>
     * @param ExtParam <p>Additional parameters, json string</p><p><strong>synExt</strong> Object Text To Speech extension parameters<br>   <strong>duration</strong> Float Synthetic audio duration in seconds. No throttling period by default. For example: 5.2<br>   <strong>format</strong> String Output audio format. Default is wav. Support wav and mp3.<br>   <strong>sampleRate</strong> Integer Synthetic audio sample rate. Default is 16000. Support [8000,16000,22050,24000,32000,44100]</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public TextToSpeechRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechRequest(TextToSpeechRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
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
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

