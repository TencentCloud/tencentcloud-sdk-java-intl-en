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

public class AigcVideoTaskInput extends AbstractModel {

    /**
    * <p>Model name.</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Model version.</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Input file information of the AIGC video generation task.</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * <p>Fixed entity input information for AIGC tasks.</p>
    */
    @SerializedName("SubjectInfos")
    @Expose
    private AigcVideoTaskInputSubjectInfo [] SubjectInfos;

    /**
    * <p>Media file ID used as the end frame to generate video. This file has a globally unique ID on VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * <p>Media file URL used as the tail frame to generate video. Description:</p><ol><li>Only support models GV, Kling, and Vidu. Other models are not currently supported. When ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the head frame for video generation. When ModelName is Kling, ModelVersion is 2.1, and output resolution Resolution is specified as 1080P, you can specify this parameter. When ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.</li><li>Image size must be less than 5M.</li><li><ol start="3"><li>Image format value: jpeg, jpg, png, webp.</li></ol></li></ol>
    */
    @SerializedName("LastFrameUrl")
    @Expose
    private String LastFrameUrl;

    /**
    * <p>Prompt for video generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>To prevent the model from generating video prompts. Supports a maximum of 1000 characters.</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>Whether to optimize Prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * <p>Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li></p>
    */
    @SerializedName("GenerationMode")
    @Expose
    private String GenerationMode;

    /**
    * <p>Output the result file of the AIGC image generation.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

    /**
    * <p>Region information of the input file. When the file url is an overseas address, selectable Oversea. Default Mainland.</p>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * <p>Scenario type. Values as follows: <li>When ModelName is Kling, value motion_control means action control;</li><li>Other ModelName not currently supported.</li></p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>Random seed of the model.</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
     * Get <p>Model name.</p> 
     * @return ModelName <p>Model name.</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name.</p>
     * @param ModelName <p>Model name.</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Model version.</p> 
     * @return ModelVersion <p>Model version.</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Model version.</p>
     * @param ModelVersion <p>Model version.</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Input file information of the AIGC video generation task.</p> 
     * @return FileInfos <p>Input file information of the AIGC video generation task.</p>
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>Input file information of the AIGC video generation task.</p>
     * @param FileInfos <p>Input file information of the AIGC video generation task.</p>
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>Fixed entity input information for AIGC tasks.</p> 
     * @return SubjectInfos <p>Fixed entity input information for AIGC tasks.</p>
     */
    public AigcVideoTaskInputSubjectInfo [] getSubjectInfos() {
        return this.SubjectInfos;
    }

    /**
     * Set <p>Fixed entity input information for AIGC tasks.</p>
     * @param SubjectInfos <p>Fixed entity input information for AIGC tasks.</p>
     */
    public void setSubjectInfos(AigcVideoTaskInputSubjectInfo [] SubjectInfos) {
        this.SubjectInfos = SubjectInfos;
    }

    /**
     * Get <p>Media file ID used as the end frame to generate video. This file has a globally unique ID on VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p> 
     * @return LastFrameFileId <p>Media file ID used as the end frame to generate video. This file has a globally unique ID on VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set <p>Media file ID used as the end frame to generate video. This file has a globally unique ID on VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     * @param LastFrameFileId <p>Media file ID used as the end frame to generate video. This file has a globally unique ID on VOD, assigned by the VOD backend after successful upload. You can get this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get <p>Media file URL used as the tail frame to generate video. Description:</p><ol><li>Only support models GV, Kling, and Vidu. Other models are not currently supported. When ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the head frame for video generation. When ModelName is Kling, ModelVersion is 2.1, and output resolution Resolution is specified as 1080P, you can specify this parameter. When ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.</li><li>Image size must be less than 5M.</li><li><ol start="3"><li>Image format value: jpeg, jpg, png, webp.</li></ol></li></ol> 
     * @return LastFrameUrl <p>Media file URL used as the tail frame to generate video. Description:</p><ol><li>Only support models GV, Kling, and Vidu. Other models are not currently supported. When ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the head frame for video generation. When ModelName is Kling, ModelVersion is 2.1, and output resolution Resolution is specified as 1080P, you can specify this parameter. When ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.</li><li>Image size must be less than 5M.</li><li><ol start="3"><li>Image format value: jpeg, jpg, png, webp.</li></ol></li></ol>
     */
    public String getLastFrameUrl() {
        return this.LastFrameUrl;
    }

    /**
     * Set <p>Media file URL used as the tail frame to generate video. Description:</p><ol><li>Only support models GV, Kling, and Vidu. Other models are not currently supported. When ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the head frame for video generation. When ModelName is Kling, ModelVersion is 2.1, and output resolution Resolution is specified as 1080P, you can specify this parameter. When ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.</li><li>Image size must be less than 5M.</li><li><ol start="3"><li>Image format value: jpeg, jpg, png, webp.</li></ol></li></ol>
     * @param LastFrameUrl <p>Media file URL used as the tail frame to generate video. Description:</p><ol><li>Only support models GV, Kling, and Vidu. Other models are not currently supported. When ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the head frame for video generation. When ModelName is Kling, ModelVersion is 2.1, and output resolution Resolution is specified as 1080P, you can specify this parameter. When ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.</li><li>Image size must be less than 5M.</li><li><ol start="3"><li>Image format value: jpeg, jpg, png, webp.</li></ol></li></ol>
     */
    public void setLastFrameUrl(String LastFrameUrl) {
        this.LastFrameUrl = LastFrameUrl;
    }

    /**
     * Get <p>Prompt for video generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.</p> 
     * @return Prompt <p>Prompt for video generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt for video generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.</p>
     * @param Prompt <p>Prompt for video generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>To prevent the model from generating video prompts. Supports a maximum of 1000 characters.</p> 
     * @return NegativePrompt <p>To prevent the model from generating video prompts. Supports a maximum of 1000 characters.</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>To prevent the model from generating video prompts. Supports a maximum of 1000 characters.</p>
     * @param NegativePrompt <p>To prevent the model from generating video prompts. Supports a maximum of 1000 characters.</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>Whether to optimize Prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p> 
     * @return EnhancePrompt <p>Whether to optimize Prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>Whether to optimize Prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
     * @param EnhancePrompt <p>Whether to optimize Prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li></p> 
     * @return GenerationMode <p>Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li></p>
     */
    public String getGenerationMode() {
        return this.GenerationMode;
    }

    /**
     * Set <p>Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li></p>
     * @param GenerationMode <p>Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li></p>
     */
    public void setGenerationMode(String GenerationMode) {
        this.GenerationMode = GenerationMode;
    }

    /**
     * Get <p>Output the result file of the AIGC image generation.</p> 
     * @return OutputConfig <p>Output the result file of the AIGC image generation.</p>
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output the result file of the AIGC image generation.</p>
     * @param OutputConfig <p>Output the result file of the AIGC image generation.</p>
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>Region information of the input file. When the file url is an overseas address, selectable Oversea. Default Mainland.</p> 
     * @return InputRegion <p>Region information of the input file. When the file url is an overseas address, selectable Oversea. Default Mainland.</p>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>Region information of the input file. When the file url is an overseas address, selectable Oversea. Default Mainland.</p>
     * @param InputRegion <p>Region information of the input file. When the file url is an overseas address, selectable Oversea. Default Mainland.</p>
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get <p>Scenario type. Values as follows: <li>When ModelName is Kling, value motion_control means action control;</li><li>Other ModelName not currently supported.</li></p> 
     * @return SceneType <p>Scenario type. Values as follows: <li>When ModelName is Kling, value motion_control means action control;</li><li>Other ModelName not currently supported.</li></p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario type. Values as follows: <li>When ModelName is Kling, value motion_control means action control;</li><li>Other ModelName not currently supported.</li></p>
     * @param SceneType <p>Scenario type. Values as follows: <li>When ModelName is Kling, value motion_control means action control;</li><li>Other ModelName not currently supported.</li></p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Random seed of the model.</p> 
     * @return Seed <p>Random seed of the model.</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>Random seed of the model.</p>
     * @param Seed <p>Random seed of the model.</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    public AigcVideoTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInput(AigcVideoTaskInput source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.SubjectInfos != null) {
            this.SubjectInfos = new AigcVideoTaskInputSubjectInfo[source.SubjectInfos.length];
            for (int i = 0; i < source.SubjectInfos.length; i++) {
                this.SubjectInfos[i] = new AigcVideoTaskInputSubjectInfo(source.SubjectInfos[i]);
            }
        }
        if (source.LastFrameFileId != null) {
            this.LastFrameFileId = new String(source.LastFrameFileId);
        }
        if (source.LastFrameUrl != null) {
            this.LastFrameUrl = new String(source.LastFrameUrl);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new String(source.EnhancePrompt);
        }
        if (source.GenerationMode != null) {
            this.GenerationMode = new String(source.GenerationMode);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "SubjectInfos.", this.SubjectInfos);
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "LastFrameUrl", this.LastFrameUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "GenerationMode", this.GenerationMode);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Seed", this.Seed);

    }
}

