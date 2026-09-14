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

public class CreateAigcAudioTaskRequest extends AbstractModel {

    /**
    * <p>Model name. Supported models for music generation: GL, MiniMaxMusic, EL, and Mureka.</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Specifies the model version. By default, the system uses the supported stable version of the model. Supported versions for GL: 3.0-clip and 3.0-pro. Supported versions for MiniMaxMusic: 2.0, 2.5, 2.6, and 3.0. Supported versions for EL: compose_v2 and sound_t2s_v2. Supported versions for Mureka: song_8, song_9, song_9.5, instrumental_8, instrumental_9, and instrumental_9.5.</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>Description of the generated music. (Note: supports up to 2,000 characters).</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Reference video information. Only partially supported by some models.</p><ol><li>Kling generates sound effects for videos.</li><li>EL adds background music to videos.</li></ol>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioReferenceVideoInfo [] VideoInfos;

    /**
    * <p>Specify the reference audio information.</p><ol><li>Use of the cover feature in MiniMaxMusic.</li></ol><p>For example, this is required for music generation.</p>
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioReferenceAudioInfo [] AudioInfos;

    /**
    * 
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * 
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcAudioExtraParam ExtraParameters;

    /**
    * <p>Used to pass in some special scene parameters required by the model, serialized into strings in Json format. <br>Example MinimaxMusic model When lyrics are passed in:<br> {"lyric":{"ponies are running happily, flowers are blooming"}}</p><ol><li>MiniMaxMusic raw pure music parameters use example:&quot; AdditionalParameters&quot;:&quot; {"is_instrumental":true}&quot;. <br>Supported transparent transmission parameters are: lyrics, is_instrumental, aigc_watermark, sample_rate, bitrate. </li><li>EL Health Music supports transparent transmission parameters:<br> PromptInfluence, WithTimestamps, CompositionPlan, ForceInstrumental and other parameters. </li></ol>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * 
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>Model name. Supported models for music generation: GL, MiniMaxMusic, EL, and Mureka.</p> 
     * @return ModelName <p>Model name. Supported models for music generation: GL, MiniMaxMusic, EL, and Mureka.</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name. Supported models for music generation: GL, MiniMaxMusic, EL, and Mureka.</p>
     * @param ModelName <p>Model name. Supported models for music generation: GL, MiniMaxMusic, EL, and Mureka.</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Specifies the model version. By default, the system uses the supported stable version of the model. Supported versions for GL: 3.0-clip and 3.0-pro. Supported versions for MiniMaxMusic: 2.0, 2.5, 2.6, and 3.0. Supported versions for EL: compose_v2 and sound_t2s_v2. Supported versions for Mureka: song_8, song_9, song_9.5, instrumental_8, instrumental_9, and instrumental_9.5.</p> 
     * @return ModelVersion <p>Specifies the model version. By default, the system uses the supported stable version of the model. Supported versions for GL: 3.0-clip and 3.0-pro. Supported versions for MiniMaxMusic: 2.0, 2.5, 2.6, and 3.0. Supported versions for EL: compose_v2 and sound_t2s_v2. Supported versions for Mureka: song_8, song_9, song_9.5, instrumental_8, instrumental_9, and instrumental_9.5.</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Specifies the model version. By default, the system uses the supported stable version of the model. Supported versions for GL: 3.0-clip and 3.0-pro. Supported versions for MiniMaxMusic: 2.0, 2.5, 2.6, and 3.0. Supported versions for EL: compose_v2 and sound_t2s_v2. Supported versions for Mureka: song_8, song_9, song_9.5, instrumental_8, instrumental_9, and instrumental_9.5.</p>
     * @param ModelVersion <p>Specifies the model version. By default, the system uses the supported stable version of the model. Supported versions for GL: 3.0-clip and 3.0-pro. Supported versions for MiniMaxMusic: 2.0, 2.5, 2.6, and 3.0. Supported versions for EL: compose_v2 and sound_t2s_v2. Supported versions for Mureka: song_8, song_9, song_9.5, instrumental_8, instrumental_9, and instrumental_9.5.</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get  
     * @return SceneType 
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 
     * @param SceneType 
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Description of the generated music. (Note: supports up to 2,000 characters).</p> 
     * @return Prompt <p>Description of the generated music. (Note: supports up to 2,000 characters).</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Description of the generated music. (Note: supports up to 2,000 characters).</p>
     * @param Prompt <p>Description of the generated music. (Note: supports up to 2,000 characters).</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Reference video information. Only partially supported by some models.</p><ol><li>Kling generates sound effects for videos.</li><li>EL adds background music to videos.</li></ol> 
     * @return VideoInfos <p>Reference video information. Only partially supported by some models.</p><ol><li>Kling generates sound effects for videos.</li><li>EL adds background music to videos.</li></ol>
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>Reference video information. Only partially supported by some models.</p><ol><li>Kling generates sound effects for videos.</li><li>EL adds background music to videos.</li></ol>
     * @param VideoInfos <p>Reference video information. Only partially supported by some models.</p><ol><li>Kling generates sound effects for videos.</li><li>EL adds background music to videos.</li></ol>
     */
    public void setVideoInfos(AigcAudioReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>Specify the reference audio information.</p><ol><li>Use of the cover feature in MiniMaxMusic.</li></ol><p>For example, this is required for music generation.</p> 
     * @return AudioInfos <p>Specify the reference audio information.</p><ol><li>Use of the cover feature in MiniMaxMusic.</li></ol><p>For example, this is required for music generation.</p>
     */
    public AigcAudioReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set <p>Specify the reference audio information.</p><ol><li>Use of the cover feature in MiniMaxMusic.</li></ol><p>For example, this is required for music generation.</p>
     * @param AudioInfos <p>Specify the reference audio information.</p><ol><li>Use of the cover feature in MiniMaxMusic.</li></ol><p>For example, this is required for music generation.</p>
     */
    public void setAudioInfos(AigcAudioReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get  
     * @return StoreCosParam 
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set 
     * @param StoreCosParam 
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get  
     * @return ExtraParameters 
     */
    public AigcAudioExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set 
     * @param ExtraParameters 
     */
    public void setExtraParameters(AigcAudioExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>Used to pass in some special scene parameters required by the model, serialized into strings in Json format. <br>Example MinimaxMusic model When lyrics are passed in:<br> {"lyric":{"ponies are running happily, flowers are blooming"}}</p><ol><li>MiniMaxMusic raw pure music parameters use example:&quot; AdditionalParameters&quot;:&quot; {"is_instrumental":true}&quot;. <br>Supported transparent transmission parameters are: lyrics, is_instrumental, aigc_watermark, sample_rate, bitrate. </li><li>EL Health Music supports transparent transmission parameters:<br> PromptInfluence, WithTimestamps, CompositionPlan, ForceInstrumental and other parameters. </li></ol> 
     * @return AdditionalParameters <p>Used to pass in some special scene parameters required by the model, serialized into strings in Json format. <br>Example MinimaxMusic model When lyrics are passed in:<br> {"lyric":{"ponies are running happily, flowers are blooming"}}</p><ol><li>MiniMaxMusic raw pure music parameters use example:&quot; AdditionalParameters&quot;:&quot; {"is_instrumental":true}&quot;. <br>Supported transparent transmission parameters are: lyrics, is_instrumental, aigc_watermark, sample_rate, bitrate. </li><li>EL Health Music supports transparent transmission parameters:<br> PromptInfluence, WithTimestamps, CompositionPlan, ForceInstrumental and other parameters. </li></ol>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>Used to pass in some special scene parameters required by the model, serialized into strings in Json format. <br>Example MinimaxMusic model When lyrics are passed in:<br> {"lyric":{"ponies are running happily, flowers are blooming"}}</p><ol><li>MiniMaxMusic raw pure music parameters use example:&quot; AdditionalParameters&quot;:&quot; {"is_instrumental":true}&quot;. <br>Supported transparent transmission parameters are: lyrics, is_instrumental, aigc_watermark, sample_rate, bitrate. </li><li>EL Health Music supports transparent transmission parameters:<br> PromptInfluence, WithTimestamps, CompositionPlan, ForceInstrumental and other parameters. </li></ol>
     * @param AdditionalParameters <p>Used to pass in some special scene parameters required by the model, serialized into strings in Json format. <br>Example MinimaxMusic model When lyrics are passed in:<br> {"lyric":{"ponies are running happily, flowers are blooming"}}</p><ol><li>MiniMaxMusic raw pure music parameters use example:&quot; AdditionalParameters&quot;:&quot; {"is_instrumental":true}&quot;. <br>Supported transparent transmission parameters are: lyrics, is_instrumental, aigc_watermark, sample_rate, bitrate. </li><li>EL Health Music supports transparent transmission parameters:<br> PromptInfluence, WithTimestamps, CompositionPlan, ForceInstrumental and other parameters. </li></ol>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get  
     * @return Operator 
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 
     * @param Operator 
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateAigcAudioTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioTaskRequest(CreateAigcAudioTaskRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcAudioReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcAudioReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcAudioReferenceAudioInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcAudioReferenceAudioInfo(source.AudioInfos[i]);
            }
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcAudioExtraParam(source.ExtraParameters);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

