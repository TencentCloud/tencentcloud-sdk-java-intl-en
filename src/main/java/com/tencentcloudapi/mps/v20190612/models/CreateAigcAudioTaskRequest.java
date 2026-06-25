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
    * Model name. Currently supported models for music generation: GL, MinimaxMusic.Example value: MiniMaxMusic
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Specifies the model version. By default, the system uses the supported stable version of the model.Supported versions for GL: 2.0, 3.0-clip, 3.0-pro.Supported versions for MinimaxMusic: 2.0, 2.5, 2.6.Example value: 2.0
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * Specifies the audio generation scene. Music: music.Example value: music
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * Description of the generated audio. (Note: Supports up to 2000 characters.) This parameter is required when no reference image is passed in.Example value: generate a piece of music
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Reference video information. Only supported by certain models.
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioReferenceVideoInfo [] VideoInfos;

    /**
    * Reference audio information.For example, this parameter is required when generating music from a reference audio.
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioReferenceAudioInfo [] AudioInfos;

    /**
    * Output audio format. Empty by default. Supported values: mp3, wav.Example value: wav
    */
    @SerializedName("OutputAudioFormat")
    @Expose
    private String OutputAudioFormat;

    /**
    * COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * Additional parameters required for the model.
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcAudioExtraParam ExtraParameters;

    /**
    * Used to input some special scene parameters required by the model, serialized into a string in JSON format.Example: when passing lyrics to the MinimaxMusic model:{"lyric":{"The pony runs happily, flowers are blooming"}}Example value: {"sequential_image_generation":"auto"}
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * API operator name.Example value: admin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Model name. Currently supported models for music generation: GL, MinimaxMusic.Example value: MiniMaxMusic 
     * @return ModelName Model name. Currently supported models for music generation: GL, MinimaxMusic.Example value: MiniMaxMusic
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name. Currently supported models for music generation: GL, MinimaxMusic.Example value: MiniMaxMusic
     * @param ModelName Model name. Currently supported models for music generation: GL, MinimaxMusic.Example value: MiniMaxMusic
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Specifies the model version. By default, the system uses the supported stable version of the model.Supported versions for GL: 2.0, 3.0-clip, 3.0-pro.Supported versions for MinimaxMusic: 2.0, 2.5, 2.6.Example value: 2.0 
     * @return ModelVersion Specifies the model version. By default, the system uses the supported stable version of the model.Supported versions for GL: 2.0, 3.0-clip, 3.0-pro.Supported versions for MinimaxMusic: 2.0, 2.5, 2.6.Example value: 2.0
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Specifies the model version. By default, the system uses the supported stable version of the model.Supported versions for GL: 2.0, 3.0-clip, 3.0-pro.Supported versions for MinimaxMusic: 2.0, 2.5, 2.6.Example value: 2.0
     * @param ModelVersion Specifies the model version. By default, the system uses the supported stable version of the model.Supported versions for GL: 2.0, 3.0-clip, 3.0-pro.Supported versions for MinimaxMusic: 2.0, 2.5, 2.6.Example value: 2.0
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get Specifies the audio generation scene. Music: music.Example value: music 
     * @return SceneType Specifies the audio generation scene. Music: music.Example value: music
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set Specifies the audio generation scene. Music: music.Example value: music
     * @param SceneType Specifies the audio generation scene. Music: music.Example value: music
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Description of the generated audio. (Note: Supports up to 2000 characters.) This parameter is required when no reference image is passed in.Example value: generate a piece of music 
     * @return Prompt Description of the generated audio. (Note: Supports up to 2000 characters.) This parameter is required when no reference image is passed in.Example value: generate a piece of music
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Description of the generated audio. (Note: Supports up to 2000 characters.) This parameter is required when no reference image is passed in.Example value: generate a piece of music
     * @param Prompt Description of the generated audio. (Note: Supports up to 2000 characters.) This parameter is required when no reference image is passed in.Example value: generate a piece of music
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Reference video information. Only supported by certain models. 
     * @return VideoInfos Reference video information. Only supported by certain models.
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set Reference video information. Only supported by certain models.
     * @param VideoInfos Reference video information. Only supported by certain models.
     */
    public void setVideoInfos(AigcAudioReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get Reference audio information.For example, this parameter is required when generating music from a reference audio. 
     * @return AudioInfos Reference audio information.For example, this parameter is required when generating music from a reference audio.
     */
    public AigcAudioReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set Reference audio information.For example, this parameter is required when generating music from a reference audio.
     * @param AudioInfos Reference audio information.For example, this parameter is required when generating music from a reference audio.
     */
    public void setAudioInfos(AigcAudioReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get Output audio format. Empty by default. Supported values: mp3, wav.Example value: wav 
     * @return OutputAudioFormat Output audio format. Empty by default. Supported values: mp3, wav.Example value: wav
     */
    public String getOutputAudioFormat() {
        return this.OutputAudioFormat;
    }

    /**
     * Set Output audio format. Empty by default. Supported values: mp3, wav.Example value: wav
     * @param OutputAudioFormat Output audio format. Empty by default. Supported values: mp3, wav.Example value: wav
     */
    public void setOutputAudioFormat(String OutputAudioFormat) {
        this.OutputAudioFormat = OutputAudioFormat;
    }

    /**
     * Get COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized. 
     * @return StoreCosParam COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
     * @param StoreCosParam COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get Additional parameters required for the model. 
     * @return ExtraParameters Additional parameters required for the model.
     */
    public AigcAudioExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set Additional parameters required for the model.
     * @param ExtraParameters Additional parameters required for the model.
     */
    public void setExtraParameters(AigcAudioExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get Used to input some special scene parameters required by the model, serialized into a string in JSON format.Example: when passing lyrics to the MinimaxMusic model:{"lyric":{"The pony runs happily, flowers are blooming"}}Example value: {"sequential_image_generation":"auto"} 
     * @return AdditionalParameters Used to input some special scene parameters required by the model, serialized into a string in JSON format.Example: when passing lyrics to the MinimaxMusic model:{"lyric":{"The pony runs happily, flowers are blooming"}}Example value: {"sequential_image_generation":"auto"}
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set Used to input some special scene parameters required by the model, serialized into a string in JSON format.Example: when passing lyrics to the MinimaxMusic model:{"lyric":{"The pony runs happily, flowers are blooming"}}Example value: {"sequential_image_generation":"auto"}
     * @param AdditionalParameters Used to input some special scene parameters required by the model, serialized into a string in JSON format.Example: when passing lyrics to the MinimaxMusic model:{"lyric":{"The pony runs happily, flowers are blooming"}}Example value: {"sequential_image_generation":"auto"}
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get API operator name.Example value: admin 
     * @return Operator API operator name.Example value: admin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set API operator name.Example value: admin
     * @param Operator API operator name.Example value: admin
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
        if (source.OutputAudioFormat != null) {
            this.OutputAudioFormat = new String(source.OutputAudioFormat);
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
        this.setParamSimple(map, prefix + "OutputAudioFormat", this.OutputAudioFormat);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

