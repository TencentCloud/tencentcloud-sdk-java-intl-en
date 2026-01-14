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
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Model name. valid values:.
<li>GEM:Gemini;</li>
<Li>Qwen: qianwen.</li>
<Li>Hunyuan: hunyuan.</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Model version. valid values:.
<li>When ModelName is GEM, optional values are 2.5, 3.0;</li>
<li>When ModelName is Qwen, optional values are 0925.</li>
<li>When ModelName is Hunyuan, the optional values are 3.0.</li>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * File information of the input image for the AIGC image generation task. By default only one image can be specified; when using the GEM model, version 2.5 supports up to 3 images and version 3.0 supports up to 14 images.
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

    /**
    * The prompt content for image generation. this parameter is required when FileInfos is empty.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Prevent the model from generating image generation prompts.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * Output media file configuration for the task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcImageOutputConfig OutputConfig;

    /**
    * An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field. longest 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Task priority. the higher the value, the higher the priority. value range is from -10 to 10. if left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Reserved field, used when special purpose.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Model name. valid values:.
<li>GEM:Gemini;</li>
<Li>Qwen: qianwen.</li>
<Li>Hunyuan: hunyuan.</li> 
     * @return ModelName Model name. valid values:.
<li>GEM:Gemini;</li>
<Li>Qwen: qianwen.</li>
<Li>Hunyuan: hunyuan.</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name. valid values:.
<li>GEM:Gemini;</li>
<Li>Qwen: qianwen.</li>
<Li>Hunyuan: hunyuan.</li>
     * @param ModelName Model name. valid values:.
<li>GEM:Gemini;</li>
<Li>Qwen: qianwen.</li>
<Li>Hunyuan: hunyuan.</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Model version. valid values:.
<li>When ModelName is GEM, optional values are 2.5, 3.0;</li>
<li>When ModelName is Qwen, optional values are 0925.</li>
<li>When ModelName is Hunyuan, the optional values are 3.0.</li> 
     * @return ModelVersion Model version. valid values:.
<li>When ModelName is GEM, optional values are 2.5, 3.0;</li>
<li>When ModelName is Qwen, optional values are 0925.</li>
<li>When ModelName is Hunyuan, the optional values are 3.0.</li>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Model version. valid values:.
<li>When ModelName is GEM, optional values are 2.5, 3.0;</li>
<li>When ModelName is Qwen, optional values are 0925.</li>
<li>When ModelName is Hunyuan, the optional values are 3.0.</li>
     * @param ModelVersion Model version. valid values:.
<li>When ModelName is GEM, optional values are 2.5, 3.0;</li>
<li>When ModelName is Qwen, optional values are 0925.</li>
<li>When ModelName is Hunyuan, the optional values are 3.0.</li>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get File information of the input image for the AIGC image generation task. By default only one image can be specified; when using the GEM model, version 2.5 supports up to 3 images and version 3.0 supports up to 14 images. 
     * @return FileInfos File information of the input image for the AIGC image generation task. By default only one image can be specified; when using the GEM model, version 2.5 supports up to 3 images and version 3.0 supports up to 14 images.
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set File information of the input image for the AIGC image generation task. By default only one image can be specified; when using the GEM model, version 2.5 supports up to 3 images and version 3.0 supports up to 14 images.
     * @param FileInfos File information of the input image for the AIGC image generation task. By default only one image can be specified; when using the GEM model, version 2.5 supports up to 3 images and version 3.0 supports up to 14 images.
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get The prompt content for image generation. this parameter is required when FileInfos is empty. 
     * @return Prompt The prompt content for image generation. this parameter is required when FileInfos is empty.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set The prompt content for image generation. this parameter is required when FileInfos is empty.
     * @param Prompt The prompt content for image generation. this parameter is required when FileInfos is empty.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Prevent the model from generating image generation prompts. 
     * @return NegativePrompt Prevent the model from generating image generation prompts.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Prevent the model from generating image generation prompts.
     * @param NegativePrompt Prevent the model from generating image generation prompts.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li> 
     * @return EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
     * @param EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get Output media file configuration for the task. 
     * @return OutputConfig Output media file configuration for the task.
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Output media file configuration for the task.
     * @param OutputConfig Output media file configuration for the task.
     */
    public void setOutputConfig(AigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication. 
     * @return SessionId An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
     * @param SessionId An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field. longest 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field. longest 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field. longest 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field. longest 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Task priority. the higher the value, the higher the priority. value range is from -10 to 10. if left blank, the default value is 0. 
     * @return TasksPriority Task priority. the higher the value, the higher the priority. value range is from -10 to 10. if left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task priority. the higher the value, the higher the priority. value range is from -10 to 10. if left blank, the default value is 0.
     * @param TasksPriority Task priority. the higher the value, the higher the priority. value range is from -10 to 10. if left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Reserved field, used when special purpose. 
     * @return ExtInfo Reserved field, used when special purpose.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used when special purpose.
     * @param ExtInfo Reserved field, used when special purpose.
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

