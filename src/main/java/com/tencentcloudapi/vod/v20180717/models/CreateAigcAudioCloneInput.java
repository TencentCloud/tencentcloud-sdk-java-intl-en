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

public class CreateAigcAudioCloneInput extends AbstractModel {

    /**
    * <p>The original audio file. The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p>
    */
    @SerializedName("AudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo AudioFileInfo;

    /**
    * <p>Custom voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Clone audition parameters.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Example audio for voice replication.</p>
    */
    @SerializedName("PromptAudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo PromptAudioFileInfo;

    /**
    * <p>Text content of the sample audio.</p>
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * <p>Pass-through parameter.</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
     * Get <p>The original audio file. The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p> 
     * @return AudioFileInfo <p>The original audio file. The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p>
     */
    public AigcAudioCloneInputFileInfo getAudioFileInfo() {
        return this.AudioFileInfo;
    }

    /**
     * Set <p>The original audio file. The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p>
     * @param AudioFileInfo <p>The original audio file. The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p>
     */
    public void setAudioFileInfo(AigcAudioCloneInputFileInfo AudioFileInfo) {
        this.AudioFileInfo = AudioFileInfo;
    }

    /**
     * Get <p>Custom voice ID.</p> 
     * @return VoiceId <p>Custom voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Custom voice ID.</p>
     * @param VoiceId <p>Custom voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Clone audition parameters.</p> 
     * @return Text <p>Clone audition parameters.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Clone audition parameters.</p>
     * @param Text <p>Clone audition parameters.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Example audio for voice replication.</p> 
     * @return PromptAudioFileInfo <p>Example audio for voice replication.</p>
     */
    public AigcAudioCloneInputFileInfo getPromptAudioFileInfo() {
        return this.PromptAudioFileInfo;
    }

    /**
     * Set <p>Example audio for voice replication.</p>
     * @param PromptAudioFileInfo <p>Example audio for voice replication.</p>
     */
    public void setPromptAudioFileInfo(AigcAudioCloneInputFileInfo PromptAudioFileInfo) {
        this.PromptAudioFileInfo = PromptAudioFileInfo;
    }

    /**
     * Get <p>Text content of the sample audio.</p> 
     * @return PromptText <p>Text content of the sample audio.</p>
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set <p>Text content of the sample audio.</p>
     * @param PromptText <p>Text content of the sample audio.</p>
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get <p>Pass-through parameter.</p> 
     * @return Payload <p>Pass-through parameter.</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>Pass-through parameter.</p>
     * @param Payload <p>Pass-through parameter.</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    public CreateAigcAudioCloneInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneInput(CreateAigcAudioCloneInput source) {
        if (source.AudioFileInfo != null) {
            this.AudioFileInfo = new AigcAudioCloneInputFileInfo(source.AudioFileInfo);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.PromptAudioFileInfo != null) {
            this.PromptAudioFileInfo = new AigcAudioCloneInputFileInfo(source.PromptAudioFileInfo);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AudioFileInfo.", this.AudioFileInfo);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "PromptAudioFileInfo.", this.PromptAudioFileInfo);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Payload", this.Payload);

    }
}

