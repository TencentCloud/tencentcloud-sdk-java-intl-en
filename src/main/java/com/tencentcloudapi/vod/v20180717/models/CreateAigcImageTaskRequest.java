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
    * <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Model name. Value:</p><li>Qwen: Qianwen.</li><li>Hunyuan: Hunyuan.</li><li>Vidu: Shengshu.</li><li>Kling: Keling.</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Model version. Parameter Value: <li>When ModelName is Qwen, optional values: 0925;</li><li>When ModelName is Hunyuan, optional values: 3.0;</li><li>When ModelName is Vidu, optional values: q2;</li><li>When ModelName is Kling, optional values: 2.1;</li></p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>File information of the input image for the AIGC image generation task. Only one is supported by default. The following models can accept multiple reference images: <li>GEM 2.5: 0 to 3 images;</li><li>Vidu q2: 0 to 7 images. Supported formats include png, jpeg, jpg, and webp. The image pixel size cannot be less than 128x128, and the ratio must be less than 1:4 or 4:1.</li></p>
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
    * <p>Region information of the input file. When the file url is an overseas address, selectable Oversea. Default Mainland.</p>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * 
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 
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
    * <p>Reserved field, used for special purpose.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Model name. Value:</p><li>Qwen: Qianwen.</li><li>Hunyuan: Hunyuan.</li><li>Vidu: Shengshu.</li><li>Kling: Keling.</li> 
     * @return ModelName <p>Model name. Value:</p><li>Qwen: Qianwen.</li><li>Hunyuan: Hunyuan.</li><li>Vidu: Shengshu.</li><li>Kling: Keling.</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name. Value:</p><li>Qwen: Qianwen.</li><li>Hunyuan: Hunyuan.</li><li>Vidu: Shengshu.</li><li>Kling: Keling.</li>
     * @param ModelName <p>Model name. Value:</p><li>Qwen: Qianwen.</li><li>Hunyuan: Hunyuan.</li><li>Vidu: Shengshu.</li><li>Kling: Keling.</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Model version. Parameter Value: <li>When ModelName is Qwen, optional values: 0925;</li><li>When ModelName is Hunyuan, optional values: 3.0;</li><li>When ModelName is Vidu, optional values: q2;</li><li>When ModelName is Kling, optional values: 2.1;</li></p> 
     * @return ModelVersion <p>Model version. Parameter Value: <li>When ModelName is Qwen, optional values: 0925;</li><li>When ModelName is Hunyuan, optional values: 3.0;</li><li>When ModelName is Vidu, optional values: q2;</li><li>When ModelName is Kling, optional values: 2.1;</li></p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Model version. Parameter Value: <li>When ModelName is Qwen, optional values: 0925;</li><li>When ModelName is Hunyuan, optional values: 3.0;</li><li>When ModelName is Vidu, optional values: q2;</li><li>When ModelName is Kling, optional values: 2.1;</li></p>
     * @param ModelVersion <p>Model version. Parameter Value: <li>When ModelName is Qwen, optional values: 0925;</li><li>When ModelName is Hunyuan, optional values: 3.0;</li><li>When ModelName is Vidu, optional values: q2;</li><li>When ModelName is Kling, optional values: 2.1;</li></p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>File information of the input image for the AIGC image generation task. Only one is supported by default. The following models can accept multiple reference images: <li>GEM 2.5: 0 to 3 images;</li><li>Vidu q2: 0 to 7 images. Supported formats include png, jpeg, jpg, and webp. The image pixel size cannot be less than 128x128, and the ratio must be less than 1:4 or 4:1.</li></p> 
     * @return FileInfos <p>File information of the input image for the AIGC image generation task. Only one is supported by default. The following models can accept multiple reference images: <li>GEM 2.5: 0 to 3 images;</li><li>Vidu q2: 0 to 7 images. Supported formats include png, jpeg, jpg, and webp. The image pixel size cannot be less than 128x128, and the ratio must be less than 1:4 or 4:1.</li></p>
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>File information of the input image for the AIGC image generation task. Only one is supported by default. The following models can accept multiple reference images: <li>GEM 2.5: 0 to 3 images;</li><li>Vidu q2: 0 to 7 images. Supported formats include png, jpeg, jpg, and webp. The image pixel size cannot be less than 128x128, and the ratio must be less than 1:4 or 4:1.</li></p>
     * @param FileInfos <p>File information of the input image for the AIGC image generation task. Only one is supported by default. The following models can accept multiple reference images: <li>GEM 2.5: 0 to 3 images;</li><li>Vidu q2: 0 to 7 images. Supported formats include png, jpeg, jpg, and webp. The image pixel size cannot be less than 128x128, and the ratio must be less than 1:4 or 4:1.</li></p>
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
     * Get  
     * @return Seed 
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set 
     * @param Seed 
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
     * Get <p>Reserved field, used for special purpose.</p> 
     * @return ExtInfo <p>Reserved field, used for special purpose.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used for special purpose.</p>
     * @param ExtInfo <p>Reserved field, used for special purpose.</p>
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

