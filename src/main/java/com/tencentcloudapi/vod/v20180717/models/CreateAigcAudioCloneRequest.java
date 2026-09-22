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

public class CreateAigcAudioCloneRequest extends AbstractModel {

    /**
    * <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Original audio file (ensure it is accessible). The model will use the voice type of the audio passed in this parameter as an example to clone the voice type.  </p><p>Input limitations: Note 1: Supported audio formats: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be at least 10 seconds and no more than 5 minutes; Note 3: The uploaded audio file size must not exceed 20 mb; Note 4: The audio content must not involve copyright, otherwise it will be removed or terminated.</p>
    */
    @SerializedName("AudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo AudioFileInfo;

    /**
    * <p>Custom voice ID, for example: "vidu01".</p><p>Input limitations:</p><ul><li>Length range of a custom voice_ID: [8,256];</li><li>The first character must be an English letter;</li><li>Numbers, letters, hyphens, and underscores are allowed;</li><li>The last character cannot be - or _</li><li>voice_ID cannot duplicate an existing ID, otherwise an error will occur.</li></ul>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Replicate audition parameters.</p><p>Parameter format: up to 1000 characters. The model will use the cloned voice type to read aloud the text content and return an audition audio link. Note: Audition will be charged based on the number of characters for text to speech.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Sample audio for voice replication. Providing this parameter will help in enhancing the voice similarity and stability of text to speech. If you use this parameter, you need to upload a short sample audio at the same time.</p><p>Input limitations: Note 1: Audio formats supported: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be less than 8 seconds; Note 3: The uploaded audio file size should be no more than 20 mb.</p>
    */
    @SerializedName("PromptAudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo PromptAudioFileInfo;

    /**
    * <p>The text content corresponding to the sample audio must match the audio content, and punctuation is required at the end of each sentence.</p>
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * <p>Pass-through parameter. Input parameter limit: without any processing, only data transmission. Note: up to 1048576 characters</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>Reserved field, used for special purposes.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Original audio file (ensure it is accessible). The model will use the voice type of the audio passed in this parameter as an example to clone the voice type.  </p><p>Input limitations: Note 1: Supported audio formats: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be at least 10 seconds and no more than 5 minutes; Note 3: The uploaded audio file size must not exceed 20 mb; Note 4: The audio content must not involve copyright, otherwise it will be removed or terminated.</p> 
     * @return AudioFileInfo <p>Original audio file (ensure it is accessible). The model will use the voice type of the audio passed in this parameter as an example to clone the voice type.  </p><p>Input limitations: Note 1: Supported audio formats: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be at least 10 seconds and no more than 5 minutes; Note 3: The uploaded audio file size must not exceed 20 mb; Note 4: The audio content must not involve copyright, otherwise it will be removed or terminated.</p>
     */
    public AigcAudioCloneInputFileInfo getAudioFileInfo() {
        return this.AudioFileInfo;
    }

    /**
     * Set <p>Original audio file (ensure it is accessible). The model will use the voice type of the audio passed in this parameter as an example to clone the voice type.  </p><p>Input limitations: Note 1: Supported audio formats: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be at least 10 seconds and no more than 5 minutes; Note 3: The uploaded audio file size must not exceed 20 mb; Note 4: The audio content must not involve copyright, otherwise it will be removed or terminated.</p>
     * @param AudioFileInfo <p>Original audio file (ensure it is accessible). The model will use the voice type of the audio passed in this parameter as an example to clone the voice type.  </p><p>Input limitations: Note 1: Supported audio formats: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be at least 10 seconds and no more than 5 minutes; Note 3: The uploaded audio file size must not exceed 20 mb; Note 4: The audio content must not involve copyright, otherwise it will be removed or terminated.</p>
     */
    public void setAudioFileInfo(AigcAudioCloneInputFileInfo AudioFileInfo) {
        this.AudioFileInfo = AudioFileInfo;
    }

    /**
     * Get <p>Custom voice ID, for example: "vidu01".</p><p>Input limitations:</p><ul><li>Length range of a custom voice_ID: [8,256];</li><li>The first character must be an English letter;</li><li>Numbers, letters, hyphens, and underscores are allowed;</li><li>The last character cannot be - or _</li><li>voice_ID cannot duplicate an existing ID, otherwise an error will occur.</li></ul> 
     * @return VoiceId <p>Custom voice ID, for example: "vidu01".</p><p>Input limitations:</p><ul><li>Length range of a custom voice_ID: [8,256];</li><li>The first character must be an English letter;</li><li>Numbers, letters, hyphens, and underscores are allowed;</li><li>The last character cannot be - or _</li><li>voice_ID cannot duplicate an existing ID, otherwise an error will occur.</li></ul>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Custom voice ID, for example: "vidu01".</p><p>Input limitations:</p><ul><li>Length range of a custom voice_ID: [8,256];</li><li>The first character must be an English letter;</li><li>Numbers, letters, hyphens, and underscores are allowed;</li><li>The last character cannot be - or _</li><li>voice_ID cannot duplicate an existing ID, otherwise an error will occur.</li></ul>
     * @param VoiceId <p>Custom voice ID, for example: "vidu01".</p><p>Input limitations:</p><ul><li>Length range of a custom voice_ID: [8,256];</li><li>The first character must be an English letter;</li><li>Numbers, letters, hyphens, and underscores are allowed;</li><li>The last character cannot be - or _</li><li>voice_ID cannot duplicate an existing ID, otherwise an error will occur.</li></ul>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Replicate audition parameters.</p><p>Parameter format: up to 1000 characters. The model will use the cloned voice type to read aloud the text content and return an audition audio link. Note: Audition will be charged based on the number of characters for text to speech.</p> 
     * @return Text <p>Replicate audition parameters.</p><p>Parameter format: up to 1000 characters. The model will use the cloned voice type to read aloud the text content and return an audition audio link. Note: Audition will be charged based on the number of characters for text to speech.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Replicate audition parameters.</p><p>Parameter format: up to 1000 characters. The model will use the cloned voice type to read aloud the text content and return an audition audio link. Note: Audition will be charged based on the number of characters for text to speech.</p>
     * @param Text <p>Replicate audition parameters.</p><p>Parameter format: up to 1000 characters. The model will use the cloned voice type to read aloud the text content and return an audition audio link. Note: Audition will be charged based on the number of characters for text to speech.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Sample audio for voice replication. Providing this parameter will help in enhancing the voice similarity and stability of text to speech. If you use this parameter, you need to upload a short sample audio at the same time.</p><p>Input limitations: Note 1: Audio formats supported: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be less than 8 seconds; Note 3: The uploaded audio file size should be no more than 20 mb.</p> 
     * @return PromptAudioFileInfo <p>Sample audio for voice replication. Providing this parameter will help in enhancing the voice similarity and stability of text to speech. If you use this parameter, you need to upload a short sample audio at the same time.</p><p>Input limitations: Note 1: Audio formats supported: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be less than 8 seconds; Note 3: The uploaded audio file size should be no more than 20 mb.</p>
     */
    public AigcAudioCloneInputFileInfo getPromptAudioFileInfo() {
        return this.PromptAudioFileInfo;
    }

    /**
     * Set <p>Sample audio for voice replication. Providing this parameter will help in enhancing the voice similarity and stability of text to speech. If you use this parameter, you need to upload a short sample audio at the same time.</p><p>Input limitations: Note 1: Audio formats supported: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be less than 8 seconds; Note 3: The uploaded audio file size should be no more than 20 mb.</p>
     * @param PromptAudioFileInfo <p>Sample audio for voice replication. Providing this parameter will help in enhancing the voice similarity and stability of text to speech. If you use this parameter, you need to upload a short sample audio at the same time.</p><p>Input limitations: Note 1: Audio formats supported: mp3, m4a, wav; Note 2: The duration of the uploaded audio file should be less than 8 seconds; Note 3: The uploaded audio file size should be no more than 20 mb.</p>
     */
    public void setPromptAudioFileInfo(AigcAudioCloneInputFileInfo PromptAudioFileInfo) {
        this.PromptAudioFileInfo = PromptAudioFileInfo;
    }

    /**
     * Get <p>The text content corresponding to the sample audio must match the audio content, and punctuation is required at the end of each sentence.</p> 
     * @return PromptText <p>The text content corresponding to the sample audio must match the audio content, and punctuation is required at the end of each sentence.</p>
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set <p>The text content corresponding to the sample audio must match the audio content, and punctuation is required at the end of each sentence.</p>
     * @param PromptText <p>The text content corresponding to the sample audio must match the audio content, and punctuation is required at the end of each sentence.</p>
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get <p>Pass-through parameter. Input parameter limit: without any processing, only data transmission. Note: up to 1048576 characters</p> 
     * @return Payload <p>Pass-through parameter. Input parameter limit: without any processing, only data transmission. Note: up to 1048576 characters</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>Pass-through parameter. Input parameter limit: without any processing, only data transmission. Note: up to 1048576 characters</p>
     * @param Payload <p>Pass-through parameter. Input parameter limit: without any processing, only data transmission. Note: up to 1048576 characters</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Source context. This is used to pass user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p> 
     * @return TasksPriority <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
     * @param TasksPriority <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>Reserved field, used for special purposes.</p> 
     * @return ExtInfo <p>Reserved field, used for special purposes.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used for special purposes.</p>
     * @param ExtInfo <p>Reserved field, used for special purposes.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcAudioCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneRequest(CreateAigcAudioCloneRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "AudioFileInfo.", this.AudioFileInfo);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "PromptAudioFileInfo.", this.PromptAudioFileInfo);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

