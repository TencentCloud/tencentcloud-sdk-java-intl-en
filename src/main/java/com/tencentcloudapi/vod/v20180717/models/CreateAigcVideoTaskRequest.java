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

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Model name. valid values: <li>Hailuo: conch;</li><li>Kling: Kling;</li><li>Jimeng: Jimeng;</li><li>Vidu;</li><li>Hunyuan: Hunyuan;</li><li>Mingmou: bright eyes;</li>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Model version. parameter value: <li>when ModelName is Hailuo, optional values are 02, 2.3, 2.3-fast;</li><li>when ModelName is Kling, optional values are 1.6, 2.0, 2.1, 2.5, O1;</li><li>when ModelName is Jimeng, optional values are 3.0pro;</li><li>when ModelName is Vidu, optional values are q2, q2-pro, q2-turbo;</li><li>when ModelName is GV, optional values are 3.1, 3.1-fast;</li><li>when ModelName is OS, optional values are 2.0;</li><li>when ModelName is Hunyuan, optional values are 1.5;</li><li>when ModelName is Mingmou, optional values are 1.0;</li>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * List of up to three material resources for description of resource images to be used by the model in video generation.

Video generation with first and last frame: use the first table in FileInfos to represent the first frame (FileInfos contains at most one image at this point). LastFrameFileId or LastFrameUrl represents the last frame.

Model supporting multi-image input.
1. GV, when entering multiple images, LastFrameFileId and LastFrameUrl are unavailable.
2. Vidu supports multi-image reference for video generation. the q2 model accepts 1-7 images. use the ObjectId in FileInfos as the subject id for input.

Note:.
1. Image size: the size should not exceed 10 mb.
2. supported image formats: jpeg, png.
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * The media file ID used as the end frame to generate video. this file has a globally unique ID on vod, assigned by the vod backend after successful upload. you can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * Media file URL used as frames to generate video. description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
    */
    @SerializedName("LastFrameUrl")
    @Expose
    private String LastFrameUrl;

    /**
    * Prompt content for video generation. this parameter is required when FileInfos is empty.
Example value: move the picture.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Prevent the model from generating video prompts.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * Specifies the output media file configuration for the video task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

    /**
    * An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Reserved field, used for special purpose.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * Specifies the region information of the input image. when the image url is a foreign address, selectable Oversea. default Mainland.
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

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
     * Get Model name. valid values: <li>Hailuo: conch;</li><li>Kling: Kling;</li><li>Jimeng: Jimeng;</li><li>Vidu;</li><li>Hunyuan: Hunyuan;</li><li>Mingmou: bright eyes;</li> 
     * @return ModelName Model name. valid values: <li>Hailuo: conch;</li><li>Kling: Kling;</li><li>Jimeng: Jimeng;</li><li>Vidu;</li><li>Hunyuan: Hunyuan;</li><li>Mingmou: bright eyes;</li>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name. valid values: <li>Hailuo: conch;</li><li>Kling: Kling;</li><li>Jimeng: Jimeng;</li><li>Vidu;</li><li>Hunyuan: Hunyuan;</li><li>Mingmou: bright eyes;</li>
     * @param ModelName Model name. valid values: <li>Hailuo: conch;</li><li>Kling: Kling;</li><li>Jimeng: Jimeng;</li><li>Vidu;</li><li>Hunyuan: Hunyuan;</li><li>Mingmou: bright eyes;</li>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Model version. parameter value: <li>when ModelName is Hailuo, optional values are 02, 2.3, 2.3-fast;</li><li>when ModelName is Kling, optional values are 1.6, 2.0, 2.1, 2.5, O1;</li><li>when ModelName is Jimeng, optional values are 3.0pro;</li><li>when ModelName is Vidu, optional values are q2, q2-pro, q2-turbo;</li><li>when ModelName is GV, optional values are 3.1, 3.1-fast;</li><li>when ModelName is OS, optional values are 2.0;</li><li>when ModelName is Hunyuan, optional values are 1.5;</li><li>when ModelName is Mingmou, optional values are 1.0;</li> 
     * @return ModelVersion Model version. parameter value: <li>when ModelName is Hailuo, optional values are 02, 2.3, 2.3-fast;</li><li>when ModelName is Kling, optional values are 1.6, 2.0, 2.1, 2.5, O1;</li><li>when ModelName is Jimeng, optional values are 3.0pro;</li><li>when ModelName is Vidu, optional values are q2, q2-pro, q2-turbo;</li><li>when ModelName is GV, optional values are 3.1, 3.1-fast;</li><li>when ModelName is OS, optional values are 2.0;</li><li>when ModelName is Hunyuan, optional values are 1.5;</li><li>when ModelName is Mingmou, optional values are 1.0;</li>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Model version. parameter value: <li>when ModelName is Hailuo, optional values are 02, 2.3, 2.3-fast;</li><li>when ModelName is Kling, optional values are 1.6, 2.0, 2.1, 2.5, O1;</li><li>when ModelName is Jimeng, optional values are 3.0pro;</li><li>when ModelName is Vidu, optional values are q2, q2-pro, q2-turbo;</li><li>when ModelName is GV, optional values are 3.1, 3.1-fast;</li><li>when ModelName is OS, optional values are 2.0;</li><li>when ModelName is Hunyuan, optional values are 1.5;</li><li>when ModelName is Mingmou, optional values are 1.0;</li>
     * @param ModelVersion Model version. parameter value: <li>when ModelName is Hailuo, optional values are 02, 2.3, 2.3-fast;</li><li>when ModelName is Kling, optional values are 1.6, 2.0, 2.1, 2.5, O1;</li><li>when ModelName is Jimeng, optional values are 3.0pro;</li><li>when ModelName is Vidu, optional values are q2, q2-pro, q2-turbo;</li><li>when ModelName is GV, optional values are 3.1, 3.1-fast;</li><li>when ModelName is OS, optional values are 2.0;</li><li>when ModelName is Hunyuan, optional values are 1.5;</li><li>when ModelName is Mingmou, optional values are 1.0;</li>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get List of up to three material resources for description of resource images to be used by the model in video generation.

Video generation with first and last frame: use the first table in FileInfos to represent the first frame (FileInfos contains at most one image at this point). LastFrameFileId or LastFrameUrl represents the last frame.

Model supporting multi-image input.
1. GV, when entering multiple images, LastFrameFileId and LastFrameUrl are unavailable.
2. Vidu supports multi-image reference for video generation. the q2 model accepts 1-7 images. use the ObjectId in FileInfos as the subject id for input.

Note:.
1. Image size: the size should not exceed 10 mb.
2. supported image formats: jpeg, png. 
     * @return FileInfos List of up to three material resources for description of resource images to be used by the model in video generation.

Video generation with first and last frame: use the first table in FileInfos to represent the first frame (FileInfos contains at most one image at this point). LastFrameFileId or LastFrameUrl represents the last frame.

Model supporting multi-image input.
1. GV, when entering multiple images, LastFrameFileId and LastFrameUrl are unavailable.
2. Vidu supports multi-image reference for video generation. the q2 model accepts 1-7 images. use the ObjectId in FileInfos as the subject id for input.

Note:.
1. Image size: the size should not exceed 10 mb.
2. supported image formats: jpeg, png.
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set List of up to three material resources for description of resource images to be used by the model in video generation.

Video generation with first and last frame: use the first table in FileInfos to represent the first frame (FileInfos contains at most one image at this point). LastFrameFileId or LastFrameUrl represents the last frame.

Model supporting multi-image input.
1. GV, when entering multiple images, LastFrameFileId and LastFrameUrl are unavailable.
2. Vidu supports multi-image reference for video generation. the q2 model accepts 1-7 images. use the ObjectId in FileInfos as the subject id for input.

Note:.
1. Image size: the size should not exceed 10 mb.
2. supported image formats: jpeg, png.
     * @param FileInfos List of up to three material resources for description of resource images to be used by the model in video generation.

Video generation with first and last frame: use the first table in FileInfos to represent the first frame (FileInfos contains at most one image at this point). LastFrameFileId or LastFrameUrl represents the last frame.

Model supporting multi-image input.
1. GV, when entering multiple images, LastFrameFileId and LastFrameUrl are unavailable.
2. Vidu supports multi-image reference for video generation. the q2 model accepts 1-7 images. use the ObjectId in FileInfos as the subject id for input.

Note:.
1. Image size: the size should not exceed 10 mb.
2. supported image formats: jpeg, png.
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get The media file ID used as the end frame to generate video. this file has a globally unique ID on vod, assigned by the vod backend after successful upload. you can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp. 
     * @return LastFrameFileId The media file ID used as the end frame to generate video. this file has a globally unique ID on vod, assigned by the vod backend after successful upload. you can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set The media file ID used as the end frame to generate video. this file has a globally unique ID on vod, assigned by the vod backend after successful upload. you can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
     * @param LastFrameFileId The media file ID used as the end frame to generate video. this file has a globally unique ID on vod, assigned by the vod backend after successful upload. you can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get Media file URL used as frames to generate video. description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp. 
     * @return LastFrameUrl Media file URL used as frames to generate video. description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
     */
    public String getLastFrameUrl() {
        return this.LastFrameUrl;
    }

    /**
     * Set Media file URL used as frames to generate video. description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
     * @param LastFrameUrl Media file URL used as frames to generate video. description:.
1. only models GV, Kling, and Vidu are supported. other models are not currently supported. when ModelName is GV, if you specify this parameter, you must simultaneously specify FileInfos as the first frame of the video to be generated. when ModelName is Kling and ModelVersion is 2.1 and specify output Resolution Resolution as 1080P, you can specify this parameter. when ModelName is Vidu and ModelVersion is q2-pro or q2-turbo, you can specify this parameter.
2. Image size: the size should be less than 5 mb.
3. image format value is jpeg, jpg, png, webp.
     */
    public void setLastFrameUrl(String LastFrameUrl) {
        this.LastFrameUrl = LastFrameUrl;
    }

    /**
     * Get Prompt content for video generation. this parameter is required when FileInfos is empty.
Example value: move the picture. 
     * @return Prompt Prompt content for video generation. this parameter is required when FileInfos is empty.
Example value: move the picture.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Prompt content for video generation. this parameter is required when FileInfos is empty.
Example value: move the picture.
     * @param Prompt Prompt content for video generation. this parameter is required when FileInfos is empty.
Example value: move the picture.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Prevent the model from generating video prompts. 
     * @return NegativePrompt Prevent the model from generating video prompts.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Prevent the model from generating video prompts.
     * @param NegativePrompt Prevent the model from generating video prompts.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>. 
     * @return EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     * @param EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get Specifies the output media file configuration for the video task. 
     * @return OutputConfig Specifies the output media file configuration for the video task.
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Specifies the output media file configuration for the video task.
     * @param OutputConfig Specifies the output media file configuration for the video task.
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
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
     * Get Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0. 
     * @return TasksPriority Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
     * @param TasksPriority Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Reserved field, used for special purpose. 
     * @return ExtInfo Reserved field, used for special purpose.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used for special purpose.
     * @param ExtInfo Reserved field, used for special purpose.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get Specifies the region information of the input image. when the image url is a foreign address, selectable Oversea. default Mainland. 
     * @return InputRegion Specifies the region information of the input image. when the image url is a foreign address, selectable Oversea. default Mainland.
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set Specifies the region information of the input image. when the image url is a foreign address, selectable Oversea. default Mainland.
     * @param InputRegion Specifies the region information of the input image. when the image url is a foreign address, selectable Oversea. default Mainland.
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
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
            this.FileInfos = new AigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskInputFileInfo(source.FileInfos[i]);
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
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
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
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
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
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "LastFrameUrl", this.LastFrameUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);

    }
}

