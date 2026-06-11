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

public class CreateAigcImageTaskRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Model name. Value:</p><li>OG</li><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Model version. Parameter:</p><li>When ModelName is OG, available values are image2_low, image2_medium, image2_high;</li><li>When ModelName is GG, available values are 2.5, 3.0, 3.1;</li><li>When ModelName is Jimeng, available values are 4.0;</li><li>When ModelName is SI, available values are 4.0, 4.5, 5.0-lite;</li><li>When ModelName is Qwen, available values are 0925;</li><li>When ModelName is Hunyuan, available values are 3.0;</li><li>When ModelName is Vidu, available values are q2;</li><li>When ModelName is Kling, available values are 2.1, 3.0, 3.0-Omni, O1, scene;</li>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>File information of the input image for the AIGC image generation task. Maximum number of reference images supported by each model:</p><ul><li>GG 2.5: 3;</li><li>GG 3.0: 14;</li><li>GG 3.1: 14;</li><li>Kling 2.1: 4;</li><li>Kling 3.0: 1;</li><li>Kling 3.0-Omni: 10;</li><li>Kling O1: 10;</li><li>SI 4.0: 14;</li><li>SI 4.5: 14;</li><li>SI 5.0-lite: 14;</li><li>Vidu q2: 7;</li><li>Hunyuan 3.0: 3;</li><li>Qwen 0925: 1;</li><li>MJ v7: 3.</li></ul>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

    /**
    * <p>Prompt for image generation. This parameter is required when FileInfos is empty.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>To prevent the model from generating image prompts.</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>Whether to optimize Prompt content automatically. When Enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * <p>Output media file configuration for the image generation task.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcImageOutputConfig OutputConfig;

    /**
    * <p>Input region information. Available values:</p><ul><li>Mainland: Chinese mainland;</li><li>Oversea: overseas;</li><li>OverseaUSWest: overseas - western United States;</li></ul>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * <p>Scenario type. Values are as follows:</p><li>When ModelName is Hunyuan: 3d_panorama means panoramic view;</li><li>When ModelName is Kling: image_expand means image expansion;</li><li>Other ModelNames are not currently supported.</li>
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
    * <p>Reserved field, used for special purpose.</p><ul><li><p>Hunyuan 3.0</p><ul><li>Supports freely setting resolution width and height, both within [512, 2048] pixels, with the product of width and height ≤ 1024x1024 pixels. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1024\"}"}</code></li></ul></li><li><p>SI series</p><ul><li>Supports freely setting resolution width and height:<ul><li>SI 4.0: Valid total pixel range [1280x720=921600, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1356\"}"}</code></li><li>SI 4.5: Valid total pixel range [2560x1440=3686400, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li><li>SI 5.0-lite: Valid total pixel range [2560x1440=3686400, 3072x3072x1.1025=10404496]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li></ul></li><li>Can be used to enable output of multiple images. Example: <code>{"AdditionalParameters": "{\"sequential_image_generation\":\"auto\"}"}</code>. Besides, the number of images to output must be specified in the <code>Prompt</code>, such as "output 3 images".</li></ul></li><li><p>Qwen 0925</p><ul><li>Supports freely setting resolution width and height, with valid total pixel range [512x512=261632, 2048x2048=4194304]. Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li><p>OG</p><ul><li>Supports freely setting resolution width and height:<ul><li>Pixel size must be divisible by 16.</li><li>Total pixels must be at least 655,360 and should not exceed 8,294,400.</li><li>Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li>Supports setting transparent layer:<ul><li>Example: <code>{"AdditionalParameters": "{\"background\":\"transparent\"}"}</code></li></ul></li></ul></li><li><p>Kling</p><ul><li>Supports setting image expansion parameters. Example: <code>{AdditionalParameters":"{\"down_expansion_ratio\":0.2,\"left_expansion_ratio\":0.3,\"right_expansion_ratio\":0.4,\"up_expansion_ratio\":0.1}}</code><ul><li>Common constraints:<ul><li>Value range: [0, 2].</li><li>The overall area of the new image should not exceed 3 times that of the original image.</li><li>Forward prompts can be input through the <code>Prompt</code> field.</li><li>Example description:<ul><li>up_expansion_ratio: Upward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.1, the distance from the top edge of the original image to the top edge of the new image is 20 × 0.1 = 2, which is the expansion range.</li><li>down_expansion_ratio: Downward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.2, the distance from the bottom edge of the original image to the bottom edge of the new image is 20 × 0.2 = 4, which is the expansion range.</li><li>left_expansion_ratio: Leftward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.3, the distance from the left edge of the original image to the left edge of the new image is 30 × 0.3 = 9, which is the expansion range.</li><li>right_expansion_ratio: Rightward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.4, the distance from the right edge of the original image to the right edge of the new image is 30 × 0.4 = 12, which is the expansion range.</li></ul></li></ul></li></ul></li></ul></li></ul>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Model name. Value:</p><li>OG</li><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li> 
     * @return ModelName <p>Model name. Value:</p><li>OG</li><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name. Value:</p><li>OG</li><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
     * @param ModelName <p>Model name. Value:</p><li>OG</li><li>GG</li><li>SI</li><li>Qwen</li><li>Hunyuan</li><li>Vidu</li><li>Kling</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Model version. Parameter:</p><li>When ModelName is OG, available values are image2_low, image2_medium, image2_high;</li><li>When ModelName is GG, available values are 2.5, 3.0, 3.1;</li><li>When ModelName is Jimeng, available values are 4.0;</li><li>When ModelName is SI, available values are 4.0, 4.5, 5.0-lite;</li><li>When ModelName is Qwen, available values are 0925;</li><li>When ModelName is Hunyuan, available values are 3.0;</li><li>When ModelName is Vidu, available values are q2;</li><li>When ModelName is Kling, available values are 2.1, 3.0, 3.0-Omni, O1, scene;</li> 
     * @return ModelVersion <p>Model version. Parameter:</p><li>When ModelName is OG, available values are image2_low, image2_medium, image2_high;</li><li>When ModelName is GG, available values are 2.5, 3.0, 3.1;</li><li>When ModelName is Jimeng, available values are 4.0;</li><li>When ModelName is SI, available values are 4.0, 4.5, 5.0-lite;</li><li>When ModelName is Qwen, available values are 0925;</li><li>When ModelName is Hunyuan, available values are 3.0;</li><li>When ModelName is Vidu, available values are q2;</li><li>When ModelName is Kling, available values are 2.1, 3.0, 3.0-Omni, O1, scene;</li>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Model version. Parameter:</p><li>When ModelName is OG, available values are image2_low, image2_medium, image2_high;</li><li>When ModelName is GG, available values are 2.5, 3.0, 3.1;</li><li>When ModelName is Jimeng, available values are 4.0;</li><li>When ModelName is SI, available values are 4.0, 4.5, 5.0-lite;</li><li>When ModelName is Qwen, available values are 0925;</li><li>When ModelName is Hunyuan, available values are 3.0;</li><li>When ModelName is Vidu, available values are q2;</li><li>When ModelName is Kling, available values are 2.1, 3.0, 3.0-Omni, O1, scene;</li>
     * @param ModelVersion <p>Model version. Parameter:</p><li>When ModelName is OG, available values are image2_low, image2_medium, image2_high;</li><li>When ModelName is GG, available values are 2.5, 3.0, 3.1;</li><li>When ModelName is Jimeng, available values are 4.0;</li><li>When ModelName is SI, available values are 4.0, 4.5, 5.0-lite;</li><li>When ModelName is Qwen, available values are 0925;</li><li>When ModelName is Hunyuan, available values are 3.0;</li><li>When ModelName is Vidu, available values are q2;</li><li>When ModelName is Kling, available values are 2.1, 3.0, 3.0-Omni, O1, scene;</li>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>File information of the input image for the AIGC image generation task. Maximum number of reference images supported by each model:</p><ul><li>GG 2.5: 3;</li><li>GG 3.0: 14;</li><li>GG 3.1: 14;</li><li>Kling 2.1: 4;</li><li>Kling 3.0: 1;</li><li>Kling 3.0-Omni: 10;</li><li>Kling O1: 10;</li><li>SI 4.0: 14;</li><li>SI 4.5: 14;</li><li>SI 5.0-lite: 14;</li><li>Vidu q2: 7;</li><li>Hunyuan 3.0: 3;</li><li>Qwen 0925: 1;</li><li>MJ v7: 3.</li></ul> 
     * @return FileInfos <p>File information of the input image for the AIGC image generation task. Maximum number of reference images supported by each model:</p><ul><li>GG 2.5: 3;</li><li>GG 3.0: 14;</li><li>GG 3.1: 14;</li><li>Kling 2.1: 4;</li><li>Kling 3.0: 1;</li><li>Kling 3.0-Omni: 10;</li><li>Kling O1: 10;</li><li>SI 4.0: 14;</li><li>SI 4.5: 14;</li><li>SI 5.0-lite: 14;</li><li>Vidu q2: 7;</li><li>Hunyuan 3.0: 3;</li><li>Qwen 0925: 1;</li><li>MJ v7: 3.</li></ul>
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>File information of the input image for the AIGC image generation task. Maximum number of reference images supported by each model:</p><ul><li>GG 2.5: 3;</li><li>GG 3.0: 14;</li><li>GG 3.1: 14;</li><li>Kling 2.1: 4;</li><li>Kling 3.0: 1;</li><li>Kling 3.0-Omni: 10;</li><li>Kling O1: 10;</li><li>SI 4.0: 14;</li><li>SI 4.5: 14;</li><li>SI 5.0-lite: 14;</li><li>Vidu q2: 7;</li><li>Hunyuan 3.0: 3;</li><li>Qwen 0925: 1;</li><li>MJ v7: 3.</li></ul>
     * @param FileInfos <p>File information of the input image for the AIGC image generation task. Maximum number of reference images supported by each model:</p><ul><li>GG 2.5: 3;</li><li>GG 3.0: 14;</li><li>GG 3.1: 14;</li><li>Kling 2.1: 4;</li><li>Kling 3.0: 1;</li><li>Kling 3.0-Omni: 10;</li><li>Kling O1: 10;</li><li>SI 4.0: 14;</li><li>SI 4.5: 14;</li><li>SI 5.0-lite: 14;</li><li>Vidu q2: 7;</li><li>Hunyuan 3.0: 3;</li><li>Qwen 0925: 1;</li><li>MJ v7: 3.</li></ul>
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>Prompt for image generation. This parameter is required when FileInfos is empty.</p> 
     * @return Prompt <p>Prompt for image generation. This parameter is required when FileInfos is empty.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt for image generation. This parameter is required when FileInfos is empty.</p>
     * @param Prompt <p>Prompt for image generation. This parameter is required when FileInfos is empty.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>To prevent the model from generating image prompts.</p> 
     * @return NegativePrompt <p>To prevent the model from generating image prompts.</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>To prevent the model from generating image prompts.</p>
     * @param NegativePrompt <p>To prevent the model from generating image prompts.</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>Whether to optimize Prompt content automatically. When Enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p> 
     * @return EnhancePrompt <p>Whether to optimize Prompt content automatically. When Enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>Whether to optimize Prompt content automatically. When Enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
     * @param EnhancePrompt <p>Whether to optimize Prompt content automatically. When Enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li></p>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>Output media file configuration for the image generation task.</p> 
     * @return OutputConfig <p>Output media file configuration for the image generation task.</p>
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output media file configuration for the image generation task.</p>
     * @param OutputConfig <p>Output media file configuration for the image generation task.</p>
     */
    public void setOutputConfig(AigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>Input region information. Available values:</p><ul><li>Mainland: Chinese mainland;</li><li>Oversea: overseas;</li><li>OverseaUSWest: overseas - western United States;</li></ul> 
     * @return InputRegion <p>Input region information. Available values:</p><ul><li>Mainland: Chinese mainland;</li><li>Oversea: overseas;</li><li>OverseaUSWest: overseas - western United States;</li></ul>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>Input region information. Available values:</p><ul><li>Mainland: Chinese mainland;</li><li>Oversea: overseas;</li><li>OverseaUSWest: overseas - western United States;</li></ul>
     * @param InputRegion <p>Input region information. Available values:</p><ul><li>Mainland: Chinese mainland;</li><li>Oversea: overseas;</li><li>OverseaUSWest: overseas - western United States;</li></ul>
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get <p>Scenario type. Values are as follows:</p><li>When ModelName is Hunyuan: 3d_panorama means panoramic view;</li><li>When ModelName is Kling: image_expand means image expansion;</li><li>Other ModelNames are not currently supported.</li> 
     * @return SceneType <p>Scenario type. Values are as follows:</p><li>When ModelName is Hunyuan: 3d_panorama means panoramic view;</li><li>When ModelName is Kling: image_expand means image expansion;</li><li>Other ModelNames are not currently supported.</li>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario type. Values are as follows:</p><li>When ModelName is Hunyuan: 3d_panorama means panoramic view;</li><li>When ModelName is Kling: image_expand means image expansion;</li><li>Other ModelNames are not currently supported.</li>
     * @param SceneType <p>Scenario type. Values are as follows:</p><li>When ModelName is Hunyuan: 3d_panorama means panoramic view;</li><li>When ModelName is Kling: image_expand means image expansion;</li><li>Other ModelNames are not currently supported.</li>
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
     * Get <p>Reserved field, used for special purpose.</p><ul><li><p>Hunyuan 3.0</p><ul><li>Supports freely setting resolution width and height, both within [512, 2048] pixels, with the product of width and height ≤ 1024x1024 pixels. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1024\"}"}</code></li></ul></li><li><p>SI series</p><ul><li>Supports freely setting resolution width and height:<ul><li>SI 4.0: Valid total pixel range [1280x720=921600, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1356\"}"}</code></li><li>SI 4.5: Valid total pixel range [2560x1440=3686400, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li><li>SI 5.0-lite: Valid total pixel range [2560x1440=3686400, 3072x3072x1.1025=10404496]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li></ul></li><li>Can be used to enable output of multiple images. Example: <code>{"AdditionalParameters": "{\"sequential_image_generation\":\"auto\"}"}</code>. Besides, the number of images to output must be specified in the <code>Prompt</code>, such as "output 3 images".</li></ul></li><li><p>Qwen 0925</p><ul><li>Supports freely setting resolution width and height, with valid total pixel range [512x512=261632, 2048x2048=4194304]. Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li><p>OG</p><ul><li>Supports freely setting resolution width and height:<ul><li>Pixel size must be divisible by 16.</li><li>Total pixels must be at least 655,360 and should not exceed 8,294,400.</li><li>Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li>Supports setting transparent layer:<ul><li>Example: <code>{"AdditionalParameters": "{\"background\":\"transparent\"}"}</code></li></ul></li></ul></li><li><p>Kling</p><ul><li>Supports setting image expansion parameters. Example: <code>{AdditionalParameters":"{\"down_expansion_ratio\":0.2,\"left_expansion_ratio\":0.3,\"right_expansion_ratio\":0.4,\"up_expansion_ratio\":0.1}}</code><ul><li>Common constraints:<ul><li>Value range: [0, 2].</li><li>The overall area of the new image should not exceed 3 times that of the original image.</li><li>Forward prompts can be input through the <code>Prompt</code> field.</li><li>Example description:<ul><li>up_expansion_ratio: Upward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.1, the distance from the top edge of the original image to the top edge of the new image is 20 × 0.1 = 2, which is the expansion range.</li><li>down_expansion_ratio: Downward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.2, the distance from the bottom edge of the original image to the bottom edge of the new image is 20 × 0.2 = 4, which is the expansion range.</li><li>left_expansion_ratio: Leftward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.3, the distance from the left edge of the original image to the left edge of the new image is 30 × 0.3 = 9, which is the expansion range.</li><li>right_expansion_ratio: Rightward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.4, the distance from the right edge of the original image to the right edge of the new image is 30 × 0.4 = 12, which is the expansion range.</li></ul></li></ul></li></ul></li></ul></li></ul> 
     * @return ExtInfo <p>Reserved field, used for special purpose.</p><ul><li><p>Hunyuan 3.0</p><ul><li>Supports freely setting resolution width and height, both within [512, 2048] pixels, with the product of width and height ≤ 1024x1024 pixels. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1024\"}"}</code></li></ul></li><li><p>SI series</p><ul><li>Supports freely setting resolution width and height:<ul><li>SI 4.0: Valid total pixel range [1280x720=921600, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1356\"}"}</code></li><li>SI 4.5: Valid total pixel range [2560x1440=3686400, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li><li>SI 5.0-lite: Valid total pixel range [2560x1440=3686400, 3072x3072x1.1025=10404496]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li></ul></li><li>Can be used to enable output of multiple images. Example: <code>{"AdditionalParameters": "{\"sequential_image_generation\":\"auto\"}"}</code>. Besides, the number of images to output must be specified in the <code>Prompt</code>, such as "output 3 images".</li></ul></li><li><p>Qwen 0925</p><ul><li>Supports freely setting resolution width and height, with valid total pixel range [512x512=261632, 2048x2048=4194304]. Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li><p>OG</p><ul><li>Supports freely setting resolution width and height:<ul><li>Pixel size must be divisible by 16.</li><li>Total pixels must be at least 655,360 and should not exceed 8,294,400.</li><li>Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li>Supports setting transparent layer:<ul><li>Example: <code>{"AdditionalParameters": "{\"background\":\"transparent\"}"}</code></li></ul></li></ul></li><li><p>Kling</p><ul><li>Supports setting image expansion parameters. Example: <code>{AdditionalParameters":"{\"down_expansion_ratio\":0.2,\"left_expansion_ratio\":0.3,\"right_expansion_ratio\":0.4,\"up_expansion_ratio\":0.1}}</code><ul><li>Common constraints:<ul><li>Value range: [0, 2].</li><li>The overall area of the new image should not exceed 3 times that of the original image.</li><li>Forward prompts can be input through the <code>Prompt</code> field.</li><li>Example description:<ul><li>up_expansion_ratio: Upward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.1, the distance from the top edge of the original image to the top edge of the new image is 20 × 0.1 = 2, which is the expansion range.</li><li>down_expansion_ratio: Downward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.2, the distance from the bottom edge of the original image to the bottom edge of the new image is 20 × 0.2 = 4, which is the expansion range.</li><li>left_expansion_ratio: Leftward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.3, the distance from the left edge of the original image to the left edge of the new image is 30 × 0.3 = 9, which is the expansion range.</li><li>right_expansion_ratio: Rightward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.4, the distance from the right edge of the original image to the right edge of the new image is 30 × 0.4 = 12, which is the expansion range.</li></ul></li></ul></li></ul></li></ul></li></ul>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used for special purpose.</p><ul><li><p>Hunyuan 3.0</p><ul><li>Supports freely setting resolution width and height, both within [512, 2048] pixels, with the product of width and height ≤ 1024x1024 pixels. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1024\"}"}</code></li></ul></li><li><p>SI series</p><ul><li>Supports freely setting resolution width and height:<ul><li>SI 4.0: Valid total pixel range [1280x720=921600, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1356\"}"}</code></li><li>SI 4.5: Valid total pixel range [2560x1440=3686400, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li><li>SI 5.0-lite: Valid total pixel range [2560x1440=3686400, 3072x3072x1.1025=10404496]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li></ul></li><li>Can be used to enable output of multiple images. Example: <code>{"AdditionalParameters": "{\"sequential_image_generation\":\"auto\"}"}</code>. Besides, the number of images to output must be specified in the <code>Prompt</code>, such as "output 3 images".</li></ul></li><li><p>Qwen 0925</p><ul><li>Supports freely setting resolution width and height, with valid total pixel range [512x512=261632, 2048x2048=4194304]. Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li><p>OG</p><ul><li>Supports freely setting resolution width and height:<ul><li>Pixel size must be divisible by 16.</li><li>Total pixels must be at least 655,360 and should not exceed 8,294,400.</li><li>Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li>Supports setting transparent layer:<ul><li>Example: <code>{"AdditionalParameters": "{\"background\":\"transparent\"}"}</code></li></ul></li></ul></li><li><p>Kling</p><ul><li>Supports setting image expansion parameters. Example: <code>{AdditionalParameters":"{\"down_expansion_ratio\":0.2,\"left_expansion_ratio\":0.3,\"right_expansion_ratio\":0.4,\"up_expansion_ratio\":0.1}}</code><ul><li>Common constraints:<ul><li>Value range: [0, 2].</li><li>The overall area of the new image should not exceed 3 times that of the original image.</li><li>Forward prompts can be input through the <code>Prompt</code> field.</li><li>Example description:<ul><li>up_expansion_ratio: Upward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.1, the distance from the top edge of the original image to the top edge of the new image is 20 × 0.1 = 2, which is the expansion range.</li><li>down_expansion_ratio: Downward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.2, the distance from the bottom edge of the original image to the bottom edge of the new image is 20 × 0.2 = 4, which is the expansion range.</li><li>left_expansion_ratio: Leftward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.3, the distance from the left edge of the original image to the left edge of the new image is 30 × 0.3 = 9, which is the expansion range.</li><li>right_expansion_ratio: Rightward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.4, the distance from the right edge of the original image to the right edge of the new image is 30 × 0.4 = 12, which is the expansion range.</li></ul></li></ul></li></ul></li></ul></li></ul>
     * @param ExtInfo <p>Reserved field, used for special purpose.</p><ul><li><p>Hunyuan 3.0</p><ul><li>Supports freely setting resolution width and height, both within [512, 2048] pixels, with the product of width and height ≤ 1024x1024 pixels. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1024\"}"}</code></li></ul></li><li><p>SI series</p><ul><li>Supports freely setting resolution width and height:<ul><li>SI 4.0: Valid total pixel range [1280x720=921600, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"728x1356\"}"}</code></li><li>SI 4.5: Valid total pixel range [2560x1440=3686400, 4096x4096=16777216]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li><li>SI 5.0-lite: Valid total pixel range [2560x1440=3686400, 3072x3072x1.1025=10404496]. Example: <code>{"AdditionalParameters": "{\"size\":\"2560x1440\"}"}</code></li></ul></li><li>Can be used to enable output of multiple images. Example: <code>{"AdditionalParameters": "{\"sequential_image_generation\":\"auto\"}"}</code>. Besides, the number of images to output must be specified in the <code>Prompt</code>, such as "output 3 images".</li></ul></li><li><p>Qwen 0925</p><ul><li>Supports freely setting resolution width and height, with valid total pixel range [512x512=261632, 2048x2048=4194304]. Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li><p>OG</p><ul><li>Supports freely setting resolution width and height:<ul><li>Pixel size must be divisible by 16.</li><li>Total pixels must be at least 655,360 and should not exceed 8,294,400.</li><li>Example: <code>{"AdditionalParameters": "{\"size\":\"728*1024\"}"}</code></li></ul></li><li>Supports setting transparent layer:<ul><li>Example: <code>{"AdditionalParameters": "{\"background\":\"transparent\"}"}</code></li></ul></li></ul></li><li><p>Kling</p><ul><li>Supports setting image expansion parameters. Example: <code>{AdditionalParameters":"{\"down_expansion_ratio\":0.2,\"left_expansion_ratio\":0.3,\"right_expansion_ratio\":0.4,\"up_expansion_ratio\":0.1}}</code><ul><li>Common constraints:<ul><li>Value range: [0, 2].</li><li>The overall area of the new image should not exceed 3 times that of the original image.</li><li>Forward prompts can be input through the <code>Prompt</code> field.</li><li>Example description:<ul><li>up_expansion_ratio: Upward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.1, the distance from the top edge of the original image to the top edge of the new image is 20 × 0.1 = 2, which is the expansion range.</li><li>down_expansion_ratio: Downward expansion range, calculated based on a multiple of the original image height. If the original image height is 20 and the parameter value is 0.2, the distance from the bottom edge of the original image to the bottom edge of the new image is 20 × 0.2 = 4, which is the expansion range.</li><li>left_expansion_ratio: Leftward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.3, the distance from the left edge of the original image to the left edge of the new image is 30 × 0.3 = 9, which is the expansion range.</li><li>right_expansion_ratio: Rightward expansion range, calculated based on a multiple of the original image width. If the original image width is 30 and the parameter value is 0.4, the distance from the right edge of the original image to the right edge of the new image is 30 × 0.4 = 12, which is the expansion range.</li></ul></li></ul></li></ul></li></ul></li></ul>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcImageTaskRequest(CreateAigcImageTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
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
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcImageOutputConfig(source.OutputConfig);
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
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

