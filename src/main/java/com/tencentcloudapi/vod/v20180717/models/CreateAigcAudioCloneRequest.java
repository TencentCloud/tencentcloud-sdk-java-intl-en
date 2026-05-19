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
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>The original audio file (ensure it is accessible). The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p><p>Input parameter limits: Note 1: Supported formats for audio: mp3, m4a, wav; Note 2: The duration of the uploaded audio should be no less than 10 seconds and not more than 5 minutes; Note 3: The audio file size should be no more than 20 MB; Note 4: The audio content must not involve copyright issues, otherwise it will be taken down or terminated.</p>
    */
    @SerializedName("AudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo AudioFileInfo;

    /**
    * <p>Custom voice ID, for example: "vidu01".</p><p>Input parameter limits:</p><ul><li>Custom voice_ID length range [8,256];</li><li>The first character must be an English letter;</li><li>Allow numbers, letters, hyphens, underscores;</li><li>The last character cannot be - or _;</li><li>voice_ID cannot duplicate existing IDs, otherwise an error will occur.</li></ul>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Clone audition parameters.</p><p>Parameter format: Character limit up to 1000. The model will read aloud the segment text content using the cloned voice type and return the audition audio link. Note: The text to speech fee will be charged based on the number of characters.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Voice replication sample audio. Providing this parameter will help enhance the similarity and stability of text to speech voice type. If you use this parameter, upload a short sample audio at the same time.</p><p>Input parameter limitation: Note 1: Formats supported for audio: mp3, m4a, wav; Note 2: Duration of the uploaded audio should be less than 8 seconds; Note 3: Audio file size should be no more than 20mb.</p>
    */
    @SerializedName("PromptAudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo PromptAudioFileInfo;

    /**
    * <p>The text content corresponding to the sample audio must match the audio content. Punctuation is required at the end of sentence.</p>
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * <p>Pass-through parameter. Input parameter limit: Without any processing, only data transmission. Note: Up to 1048576 characters.</p>
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
    * <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
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
    * <p>Reserved field, used when special purpose.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>The original audio file (ensure it is accessible). The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p><p>Input parameter limits: Note 1: Supported formats for audio: mp3, m4a, wav; Note 2: The duration of the uploaded audio should be no less than 10 seconds and not more than 5 minutes; Note 3: The audio file size should be no more than 20 MB; Note 4: The audio content must not involve copyright issues, otherwise it will be taken down or terminated.</p> 
     * @return AudioFileInfo <p>The original audio file (ensure it is accessible). The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p><p>Input parameter limits: Note 1: Supported formats for audio: mp3, m4a, wav; Note 2: The duration of the uploaded audio should be no less than 10 seconds and not more than 5 minutes; Note 3: The audio file size should be no more than 20 MB; Note 4: The audio content must not involve copyright issues, otherwise it will be taken down or terminated.</p>
     */
    public AigcAudioCloneInputFileInfo getAudioFileInfo() {
        return this.AudioFileInfo;
    }

    /**
     * Set <p>The original audio file (ensure it is accessible). The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p><p>Input parameter limits: Note 1: Supported formats for audio: mp3, m4a, wav; Note 2: The duration of the uploaded audio should be no less than 10 seconds and not more than 5 minutes; Note 3: The audio file size should be no more than 20 MB; Note 4: The audio content must not involve copyright issues, otherwise it will be taken down or terminated.</p>
     * @param AudioFileInfo <p>The original audio file (ensure it is accessible). The model will clone the voice type based on the audio timbre passed in this parameter as an example.</p><p>Input parameter limits: Note 1: Supported formats for audio: mp3, m4a, wav; Note 2: The duration of the uploaded audio should be no less than 10 seconds and not more than 5 minutes; Note 3: The audio file size should be no more than 20 MB; Note 4: The audio content must not involve copyright issues, otherwise it will be taken down or terminated.</p>
     */
    public void setAudioFileInfo(AigcAudioCloneInputFileInfo AudioFileInfo) {
        this.AudioFileInfo = AudioFileInfo;
    }

    /**
     * Get <p>Custom voice ID, for example: "vidu01".</p><p>Input parameter limits:</p><ul><li>Custom voice_ID length range [8,256];</li><li>The first character must be an English letter;</li><li>Allow numbers, letters, hyphens, underscores;</li><li>The last character cannot be - or _;</li><li>voice_ID cannot duplicate existing IDs, otherwise an error will occur.</li></ul> 
     * @return VoiceId <p>Custom voice ID, for example: "vidu01".</p><p>Input parameter limits:</p><ul><li>Custom voice_ID length range [8,256];</li><li>The first character must be an English letter;</li><li>Allow numbers, letters, hyphens, underscores;</li><li>The last character cannot be - or _;</li><li>voice_ID cannot duplicate existing IDs, otherwise an error will occur.</li></ul>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Custom voice ID, for example: "vidu01".</p><p>Input parameter limits:</p><ul><li>Custom voice_ID length range [8,256];</li><li>The first character must be an English letter;</li><li>Allow numbers, letters, hyphens, underscores;</li><li>The last character cannot be - or _;</li><li>voice_ID cannot duplicate existing IDs, otherwise an error will occur.</li></ul>
     * @param VoiceId <p>Custom voice ID, for example: "vidu01".</p><p>Input parameter limits:</p><ul><li>Custom voice_ID length range [8,256];</li><li>The first character must be an English letter;</li><li>Allow numbers, letters, hyphens, underscores;</li><li>The last character cannot be - or _;</li><li>voice_ID cannot duplicate existing IDs, otherwise an error will occur.</li></ul>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Clone audition parameters.</p><p>Parameter format: Character limit up to 1000. The model will read aloud the segment text content using the cloned voice type and return the audition audio link. Note: The text to speech fee will be charged based on the number of characters.</p> 
     * @return Text <p>Clone audition parameters.</p><p>Parameter format: Character limit up to 1000. The model will read aloud the segment text content using the cloned voice type and return the audition audio link. Note: The text to speech fee will be charged based on the number of characters.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Clone audition parameters.</p><p>Parameter format: Character limit up to 1000. The model will read aloud the segment text content using the cloned voice type and return the audition audio link. Note: The text to speech fee will be charged based on the number of characters.</p>
     * @param Text <p>Clone audition parameters.</p><p>Parameter format: Character limit up to 1000. The model will read aloud the segment text content using the cloned voice type and return the audition audio link. Note: The text to speech fee will be charged based on the number of characters.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Voice replication sample audio. Providing this parameter will help enhance the similarity and stability of text to speech voice type. If you use this parameter, upload a short sample audio at the same time.</p><p>Input parameter limitation: Note 1: Formats supported for audio: mp3, m4a, wav; Note 2: Duration of the uploaded audio should be less than 8 seconds; Note 3: Audio file size should be no more than 20mb.</p> 
     * @return PromptAudioFileInfo <p>Voice replication sample audio. Providing this parameter will help enhance the similarity and stability of text to speech voice type. If you use this parameter, upload a short sample audio at the same time.</p><p>Input parameter limitation: Note 1: Formats supported for audio: mp3, m4a, wav; Note 2: Duration of the uploaded audio should be less than 8 seconds; Note 3: Audio file size should be no more than 20mb.</p>
     */
    public AigcAudioCloneInputFileInfo getPromptAudioFileInfo() {
        return this.PromptAudioFileInfo;
    }

    /**
     * Set <p>Voice replication sample audio. Providing this parameter will help enhance the similarity and stability of text to speech voice type. If you use this parameter, upload a short sample audio at the same time.</p><p>Input parameter limitation: Note 1: Formats supported for audio: mp3, m4a, wav; Note 2: Duration of the uploaded audio should be less than 8 seconds; Note 3: Audio file size should be no more than 20mb.</p>
     * @param PromptAudioFileInfo <p>Voice replication sample audio. Providing this parameter will help enhance the similarity and stability of text to speech voice type. If you use this parameter, upload a short sample audio at the same time.</p><p>Input parameter limitation: Note 1: Formats supported for audio: mp3, m4a, wav; Note 2: Duration of the uploaded audio should be less than 8 seconds; Note 3: Audio file size should be no more than 20mb.</p>
     */
    public void setPromptAudioFileInfo(AigcAudioCloneInputFileInfo PromptAudioFileInfo) {
        this.PromptAudioFileInfo = PromptAudioFileInfo;
    }

    /**
     * Get <p>The text content corresponding to the sample audio must match the audio content. Punctuation is required at the end of sentence.</p> 
     * @return PromptText <p>The text content corresponding to the sample audio must match the audio content. Punctuation is required at the end of sentence.</p>
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set <p>The text content corresponding to the sample audio must match the audio content. Punctuation is required at the end of sentence.</p>
     * @param PromptText <p>The text content corresponding to the sample audio must match the audio content. Punctuation is required at the end of sentence.</p>
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get <p>Pass-through parameter. Input parameter limit: Without any processing, only data transmission. Note: Up to 1048576 characters.</p> 
     * @return Payload <p>Pass-through parameter. Input parameter limit: Without any processing, only data transmission. Note: Up to 1048576 characters.</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>Pass-through parameter. Input parameter limit: Without any processing, only data transmission. Note: Up to 1048576 characters.</p>
     * @param Payload <p>Pass-through parameter. Input parameter limit: Without any processing, only data transmission. Note: Up to 1048576 characters.</p>
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
     * Get <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
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
     * Get <p>Reserved field, used when special purpose.</p> 
     * @return ExtInfo <p>Reserved field, used when special purpose.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used when special purpose.</p>
     * @param ExtInfo <p>Reserved field, used when special purpose.</p>
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

