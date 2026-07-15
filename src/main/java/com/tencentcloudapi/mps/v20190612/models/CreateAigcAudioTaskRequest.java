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
    * <p>Model name. Supported models for music generation: GL and MiniMaxMusic.</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Specifies the model version. By default, the system uses the supported stable version of the model.<br>Supported versions for GL: 3.0-clip and 3.0-pro.<br>Supported versions for MinimaxMusic: 2.0, 2.5, and 2.6.</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Specifies the scenario for audio generation. Music: music.</p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Reference video information, which is supported by some models.</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioReferenceVideoInfo [] VideoInfos;

    /**
    * <p>Specify the reference audio information.</p><p>For example, this is required for music generation.</p>
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioReferenceAudioInfo [] AudioInfos;

    /**
    * <p>Output audio format. By default, this is not specified. Valid values: mp3 and wav.</p>
    */
    @SerializedName("OutputAudioFormat")
    @Expose
    private String OutputAudioFormat;

    /**
    * <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * <p>Additional parameters required.</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcAudioExtraParam ExtraParameters;

    /**
    * <p>This is used to specify special scenario parameters required by the model, in the format of a serialized JSON string.<br>Example to specify lyrics for the MinimaxMusic model:<br>{"lyric":{"The pony is running with joy. The flowers are blooming."}}</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>API operator name.</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>Model name. Supported models for music generation: GL and MiniMaxMusic.</p> 
     * @return ModelName <p>Model name. Supported models for music generation: GL and MiniMaxMusic.</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name. Supported models for music generation: GL and MiniMaxMusic.</p>
     * @param ModelName <p>Model name. Supported models for music generation: GL and MiniMaxMusic.</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Specifies the model version. By default, the system uses the supported stable version of the model.<br>Supported versions for GL: 3.0-clip and 3.0-pro.<br>Supported versions for MinimaxMusic: 2.0, 2.5, and 2.6.</p> 
     * @return ModelVersion <p>Specifies the model version. By default, the system uses the supported stable version of the model.<br>Supported versions for GL: 3.0-clip and 3.0-pro.<br>Supported versions for MinimaxMusic: 2.0, 2.5, and 2.6.</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Specifies the model version. By default, the system uses the supported stable version of the model.<br>Supported versions for GL: 3.0-clip and 3.0-pro.<br>Supported versions for MinimaxMusic: 2.0, 2.5, and 2.6.</p>
     * @param ModelVersion <p>Specifies the model version. By default, the system uses the supported stable version of the model.<br>Supported versions for GL: 3.0-clip and 3.0-pro.<br>Supported versions for MinimaxMusic: 2.0, 2.5, and 2.6.</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Specifies the scenario for audio generation. Music: music.</p> 
     * @return SceneType <p>Specifies the scenario for audio generation. Music: music.</p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Specifies the scenario for audio generation. Music: music.</p>
     * @param SceneType <p>Specifies the scenario for audio generation. Music: music.</p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p> 
     * @return Prompt <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
     * @param Prompt <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Reference video information, which is supported by some models.</p> 
     * @return VideoInfos <p>Reference video information, which is supported by some models.</p>
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>Reference video information, which is supported by some models.</p>
     * @param VideoInfos <p>Reference video information, which is supported by some models.</p>
     */
    public void setVideoInfos(AigcAudioReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>Specify the reference audio information.</p><p>For example, this is required for music generation.</p> 
     * @return AudioInfos <p>Specify the reference audio information.</p><p>For example, this is required for music generation.</p>
     */
    public AigcAudioReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set <p>Specify the reference audio information.</p><p>For example, this is required for music generation.</p>
     * @param AudioInfos <p>Specify the reference audio information.</p><p>For example, this is required for music generation.</p>
     */
    public void setAudioInfos(AigcAudioReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get <p>Output audio format. By default, this is not specified. Valid values: mp3 and wav.</p> 
     * @return OutputAudioFormat <p>Output audio format. By default, this is not specified. Valid values: mp3 and wav.</p>
     */
    public String getOutputAudioFormat() {
        return this.OutputAudioFormat;
    }

    /**
     * Set <p>Output audio format. By default, this is not specified. Valid values: mp3 and wav.</p>
     * @param OutputAudioFormat <p>Output audio format. By default, this is not specified. Valid values: mp3 and wav.</p>
     */
    public void setOutputAudioFormat(String OutputAudioFormat) {
        this.OutputAudioFormat = OutputAudioFormat;
    }

    /**
     * Get <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p> 
     * @return StoreCosParam <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
     * @param StoreCosParam <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>Additional parameters required.</p> 
     * @return ExtraParameters <p>Additional parameters required.</p>
     */
    public AigcAudioExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>Additional parameters required.</p>
     * @param ExtraParameters <p>Additional parameters required.</p>
     */
    public void setExtraParameters(AigcAudioExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>This is used to specify special scenario parameters required by the model, in the format of a serialized JSON string.<br>Example to specify lyrics for the MinimaxMusic model:<br>{"lyric":{"The pony is running with joy. The flowers are blooming."}}</p> 
     * @return AdditionalParameters <p>This is used to specify special scenario parameters required by the model, in the format of a serialized JSON string.<br>Example to specify lyrics for the MinimaxMusic model:<br>{"lyric":{"The pony is running with joy. The flowers are blooming."}}</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>This is used to specify special scenario parameters required by the model, in the format of a serialized JSON string.<br>Example to specify lyrics for the MinimaxMusic model:<br>{"lyric":{"The pony is running with joy. The flowers are blooming."}}</p>
     * @param AdditionalParameters <p>This is used to specify special scenario parameters required by the model, in the format of a serialized JSON string.<br>Example to specify lyrics for the MinimaxMusic model:<br>{"lyric":{"The pony is running with joy. The flowers are blooming."}}</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get <p>API operator name.</p> 
     * @return Operator <p>API operator name.</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>API operator name.</p>
     * @param Operator <p>API operator name.</p>
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

