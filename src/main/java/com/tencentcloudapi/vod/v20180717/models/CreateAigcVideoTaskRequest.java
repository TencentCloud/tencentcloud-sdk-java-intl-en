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
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Model name. Parameter values:<br>Kling: Kling;<br>Vidu;<br>Hailuo: Hailuo;<br>Hunyuan: Hunyuan;<br>Mingmou: Mingmou;<br>GV;<br>OS;<br>PixVerse;</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Model version. Value: <br>When ModelName is Hailuo, available values are 02, 2.3, 2.3-fast, H3, H3_regen, and H3-Max;<br>When ModelName is Kling, available values are 1.6, 2.0, 2.1, 2.5, 2.6, O1, 3.0, 3.0-Omni, 3.0-turbo, and scene;<br>When ModelName is Vidu, available values are q2, q2-pro, q2-turbo, q3, q3-pro, q3-turbo, q3-mix, q3-drama, q3-ad, scene, avatar-q2-pro, avatar-q2-turbo, and lip-sync;<br>When ModelName is GV, available values are 3.1, 3.1-fast, 3.1-lite, and omni;<br>When ModelName is OS, available values are 2.0;<br>When ModelName is Hunyuan, available values are 1.5 and 3d_2.0;<br>When ModelName is Mingmou, available values are 1.0;<br>When ModelName is PixVerse, available values are v5.6, v6, and c1;</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Describes the resource file to be used by the model for video generation, divided into <strong>first and last frame mode, reference image/video/sound generation, video editing, and other modes</strong>.</p><p><strong>First and last frame video generation</strong>: <strong>The Usage field of the first frame image is FirstFrame, and the Usage field of the last frame image is LastFrame</strong>. One image is supported for each. The first frame can be imported separately, but the last frame cannot be imported separately. <strong>First and last frame generation uses the image ratio for reference</strong>.<br><strong>Reference image/video/sound generation</strong>: You can import single or multiple images/videos/sounds as references, with the <strong>Usage field set to Reference</strong>. <strong>In reference mode, you can adjust the aspect ratio of the generated video</strong>.<br><strong>Video editing</strong>: Vidu and Kling can input a video for editing. You can also import images while importing a video, with the <strong>Usage field of the image set to Reference</strong>.</p><p>Note:</p><ol><li>Image size cannot exceed 10 MB.</li><li>Supported image formats: jpeg, jpg, png. x0b</li><li>For whether a specific model version supports reference image/video/sound, first and last frame, video editing, and other features, you can request documentation from us or refer to the original vendor's document information.</li></ol>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * <p>Subject input information.</p>
    */
    @SerializedName("SubjectInfos")
    @Expose
    private AigcVideoTaskInputSubjectInfo [] SubjectInfos;

    /**
    * <p>Media file ID used as the last frame image to generate a video. The globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p><ol><li>When you specify this parameter, you must also specify the first frame through FileInfos.</li><li>The image size must be less than 10M.</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * <p>URL of the media file used as the last frame to generate video. Note:</p><ol><li>When specifying this parameter, you must also specify the first frame through FileInfos.</li><li>Image size must be less than 5M.</li><li>Supported image formats: jpeg, jpg, png, webp.</li></ol>
    */
    @SerializedName("LastFrameUrl")
    @Expose
    private String LastFrameUrl;

    /**
    * <p>Prompt for video generation.<br>When no reference file is passed in, no usage scenario type is used, and ExtInfo is not null, Prompt is required.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Prompt to prevent the model from generating videos.</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * <p>Output media file configuration for a video task.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

    /**
    * <p>Region information of the input file. Values are as follows:</p><ul><li>If the input file is stored overseas: Oversea;</li><li>If the input file is stored in the western United States: OverseaUSWest;</li><li>If the input file is stored in the Chinese mainland: Mainland.</li></ul><p>Default value: Mainland</p>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * <p>Scenario type. Values are as follows:</p><li>When ModelName is Kling: motion_control means action control; avatar_i2v means digital human; lip_sync means lip-sync;</li><li>When ModelName is Vidu: template_effect means special effect template;</li><li>Other ModelName values are not currently supported.</li>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81">Task flow name</a>. Fill in when you need to execute a task flow on the generated new video.</p>
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

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
    * <p>Reserved field, used for special purposes.<br>Can be used to import special model parameters, storyboard prompts, etc.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Model name. Parameter values:<br>Kling: Kling;<br>Vidu;<br>Hailuo: Hailuo;<br>Hunyuan: Hunyuan;<br>Mingmou: Mingmou;<br>GV;<br>OS;<br>PixVerse;</p> 
     * @return ModelName <p>Model name. Parameter values:<br>Kling: Kling;<br>Vidu;<br>Hailuo: Hailuo;<br>Hunyuan: Hunyuan;<br>Mingmou: Mingmou;<br>GV;<br>OS;<br>PixVerse;</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name. Parameter values:<br>Kling: Kling;<br>Vidu;<br>Hailuo: Hailuo;<br>Hunyuan: Hunyuan;<br>Mingmou: Mingmou;<br>GV;<br>OS;<br>PixVerse;</p>
     * @param ModelName <p>Model name. Parameter values:<br>Kling: Kling;<br>Vidu;<br>Hailuo: Hailuo;<br>Hunyuan: Hunyuan;<br>Mingmou: Mingmou;<br>GV;<br>OS;<br>PixVerse;</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Model version. Value: <br>When ModelName is Hailuo, available values are 02, 2.3, 2.3-fast, H3, H3_regen, and H3-Max;<br>When ModelName is Kling, available values are 1.6, 2.0, 2.1, 2.5, 2.6, O1, 3.0, 3.0-Omni, 3.0-turbo, and scene;<br>When ModelName is Vidu, available values are q2, q2-pro, q2-turbo, q3, q3-pro, q3-turbo, q3-mix, q3-drama, q3-ad, scene, avatar-q2-pro, avatar-q2-turbo, and lip-sync;<br>When ModelName is GV, available values are 3.1, 3.1-fast, 3.1-lite, and omni;<br>When ModelName is OS, available values are 2.0;<br>When ModelName is Hunyuan, available values are 1.5 and 3d_2.0;<br>When ModelName is Mingmou, available values are 1.0;<br>When ModelName is PixVerse, available values are v5.6, v6, and c1;</p> 
     * @return ModelVersion <p>Model version. Value: <br>When ModelName is Hailuo, available values are 02, 2.3, 2.3-fast, H3, H3_regen, and H3-Max;<br>When ModelName is Kling, available values are 1.6, 2.0, 2.1, 2.5, 2.6, O1, 3.0, 3.0-Omni, 3.0-turbo, and scene;<br>When ModelName is Vidu, available values are q2, q2-pro, q2-turbo, q3, q3-pro, q3-turbo, q3-mix, q3-drama, q3-ad, scene, avatar-q2-pro, avatar-q2-turbo, and lip-sync;<br>When ModelName is GV, available values are 3.1, 3.1-fast, 3.1-lite, and omni;<br>When ModelName is OS, available values are 2.0;<br>When ModelName is Hunyuan, available values are 1.5 and 3d_2.0;<br>When ModelName is Mingmou, available values are 1.0;<br>When ModelName is PixVerse, available values are v5.6, v6, and c1;</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Model version. Value: <br>When ModelName is Hailuo, available values are 02, 2.3, 2.3-fast, H3, H3_regen, and H3-Max;<br>When ModelName is Kling, available values are 1.6, 2.0, 2.1, 2.5, 2.6, O1, 3.0, 3.0-Omni, 3.0-turbo, and scene;<br>When ModelName is Vidu, available values are q2, q2-pro, q2-turbo, q3, q3-pro, q3-turbo, q3-mix, q3-drama, q3-ad, scene, avatar-q2-pro, avatar-q2-turbo, and lip-sync;<br>When ModelName is GV, available values are 3.1, 3.1-fast, 3.1-lite, and omni;<br>When ModelName is OS, available values are 2.0;<br>When ModelName is Hunyuan, available values are 1.5 and 3d_2.0;<br>When ModelName is Mingmou, available values are 1.0;<br>When ModelName is PixVerse, available values are v5.6, v6, and c1;</p>
     * @param ModelVersion <p>Model version. Value: <br>When ModelName is Hailuo, available values are 02, 2.3, 2.3-fast, H3, H3_regen, and H3-Max;<br>When ModelName is Kling, available values are 1.6, 2.0, 2.1, 2.5, 2.6, O1, 3.0, 3.0-Omni, 3.0-turbo, and scene;<br>When ModelName is Vidu, available values are q2, q2-pro, q2-turbo, q3, q3-pro, q3-turbo, q3-mix, q3-drama, q3-ad, scene, avatar-q2-pro, avatar-q2-turbo, and lip-sync;<br>When ModelName is GV, available values are 3.1, 3.1-fast, 3.1-lite, and omni;<br>When ModelName is OS, available values are 2.0;<br>When ModelName is Hunyuan, available values are 1.5 and 3d_2.0;<br>When ModelName is Mingmou, available values are 1.0;<br>When ModelName is PixVerse, available values are v5.6, v6, and c1;</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Describes the resource file to be used by the model for video generation, divided into <strong>first and last frame mode, reference image/video/sound generation, video editing, and other modes</strong>.</p><p><strong>First and last frame video generation</strong>: <strong>The Usage field of the first frame image is FirstFrame, and the Usage field of the last frame image is LastFrame</strong>. One image is supported for each. The first frame can be imported separately, but the last frame cannot be imported separately. <strong>First and last frame generation uses the image ratio for reference</strong>.<br><strong>Reference image/video/sound generation</strong>: You can import single or multiple images/videos/sounds as references, with the <strong>Usage field set to Reference</strong>. <strong>In reference mode, you can adjust the aspect ratio of the generated video</strong>.<br><strong>Video editing</strong>: Vidu and Kling can input a video for editing. You can also import images while importing a video, with the <strong>Usage field of the image set to Reference</strong>.</p><p>Note:</p><ol><li>Image size cannot exceed 10 MB.</li><li>Supported image formats: jpeg, jpg, png. x0b</li><li>For whether a specific model version supports reference image/video/sound, first and last frame, video editing, and other features, you can request documentation from us or refer to the original vendor's document information.</li></ol> 
     * @return FileInfos <p>Describes the resource file to be used by the model for video generation, divided into <strong>first and last frame mode, reference image/video/sound generation, video editing, and other modes</strong>.</p><p><strong>First and last frame video generation</strong>: <strong>The Usage field of the first frame image is FirstFrame, and the Usage field of the last frame image is LastFrame</strong>. One image is supported for each. The first frame can be imported separately, but the last frame cannot be imported separately. <strong>First and last frame generation uses the image ratio for reference</strong>.<br><strong>Reference image/video/sound generation</strong>: You can import single or multiple images/videos/sounds as references, with the <strong>Usage field set to Reference</strong>. <strong>In reference mode, you can adjust the aspect ratio of the generated video</strong>.<br><strong>Video editing</strong>: Vidu and Kling can input a video for editing. You can also import images while importing a video, with the <strong>Usage field of the image set to Reference</strong>.</p><p>Note:</p><ol><li>Image size cannot exceed 10 MB.</li><li>Supported image formats: jpeg, jpg, png. x0b</li><li>For whether a specific model version supports reference image/video/sound, first and last frame, video editing, and other features, you can request documentation from us or refer to the original vendor's document information.</li></ol>
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>Describes the resource file to be used by the model for video generation, divided into <strong>first and last frame mode, reference image/video/sound generation, video editing, and other modes</strong>.</p><p><strong>First and last frame video generation</strong>: <strong>The Usage field of the first frame image is FirstFrame, and the Usage field of the last frame image is LastFrame</strong>. One image is supported for each. The first frame can be imported separately, but the last frame cannot be imported separately. <strong>First and last frame generation uses the image ratio for reference</strong>.<br><strong>Reference image/video/sound generation</strong>: You can import single or multiple images/videos/sounds as references, with the <strong>Usage field set to Reference</strong>. <strong>In reference mode, you can adjust the aspect ratio of the generated video</strong>.<br><strong>Video editing</strong>: Vidu and Kling can input a video for editing. You can also import images while importing a video, with the <strong>Usage field of the image set to Reference</strong>.</p><p>Note:</p><ol><li>Image size cannot exceed 10 MB.</li><li>Supported image formats: jpeg, jpg, png. x0b</li><li>For whether a specific model version supports reference image/video/sound, first and last frame, video editing, and other features, you can request documentation from us or refer to the original vendor's document information.</li></ol>
     * @param FileInfos <p>Describes the resource file to be used by the model for video generation, divided into <strong>first and last frame mode, reference image/video/sound generation, video editing, and other modes</strong>.</p><p><strong>First and last frame video generation</strong>: <strong>The Usage field of the first frame image is FirstFrame, and the Usage field of the last frame image is LastFrame</strong>. One image is supported for each. The first frame can be imported separately, but the last frame cannot be imported separately. <strong>First and last frame generation uses the image ratio for reference</strong>.<br><strong>Reference image/video/sound generation</strong>: You can import single or multiple images/videos/sounds as references, with the <strong>Usage field set to Reference</strong>. <strong>In reference mode, you can adjust the aspect ratio of the generated video</strong>.<br><strong>Video editing</strong>: Vidu and Kling can input a video for editing. You can also import images while importing a video, with the <strong>Usage field of the image set to Reference</strong>.</p><p>Note:</p><ol><li>Image size cannot exceed 10 MB.</li><li>Supported image formats: jpeg, jpg, png. x0b</li><li>For whether a specific model version supports reference image/video/sound, first and last frame, video editing, and other features, you can request documentation from us or refer to the original vendor's document information.</li></ol>
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>Subject input information.</p> 
     * @return SubjectInfos <p>Subject input information.</p>
     */
    public AigcVideoTaskInputSubjectInfo [] getSubjectInfos() {
        return this.SubjectInfos;
    }

    /**
     * Set <p>Subject input information.</p>
     * @param SubjectInfos <p>Subject input information.</p>
     */
    public void setSubjectInfos(AigcVideoTaskInputSubjectInfo [] SubjectInfos) {
        this.SubjectInfos = SubjectInfos;
    }

    /**
     * Get <p>Media file ID used as the last frame image to generate a video. The globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p><ol><li>When you specify this parameter, you must also specify the first frame through FileInfos.</li><li>The image size must be less than 10M.</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol> 
     * @return LastFrameFileId <p>Media file ID used as the last frame image to generate a video. The globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p><ol><li>When you specify this parameter, you must also specify the first frame through FileInfos.</li><li>The image size must be less than 10M.</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set <p>Media file ID used as the last frame image to generate a video. The globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p><ol><li>When you specify this parameter, you must also specify the first frame through FileInfos.</li><li>The image size must be less than 10M.</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
     * @param LastFrameFileId <p>Media file ID used as the last frame image to generate a video. The globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p><ol><li>When you specify this parameter, you must also specify the first frame through FileInfos.</li><li>The image size must be less than 10M.</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get <p>URL of the media file used as the last frame to generate video. Note:</p><ol><li>When specifying this parameter, you must also specify the first frame through FileInfos.</li><li>Image size must be less than 5M.</li><li>Supported image formats: jpeg, jpg, png, webp.</li></ol> 
     * @return LastFrameUrl <p>URL of the media file used as the last frame to generate video. Note:</p><ol><li>When specifying this parameter, you must also specify the first frame through FileInfos.</li><li>Image size must be less than 5M.</li><li>Supported image formats: jpeg, jpg, png, webp.</li></ol>
     */
    public String getLastFrameUrl() {
        return this.LastFrameUrl;
    }

    /**
     * Set <p>URL of the media file used as the last frame to generate video. Note:</p><ol><li>When specifying this parameter, you must also specify the first frame through FileInfos.</li><li>Image size must be less than 5M.</li><li>Supported image formats: jpeg, jpg, png, webp.</li></ol>
     * @param LastFrameUrl <p>URL of the media file used as the last frame to generate video. Note:</p><ol><li>When specifying this parameter, you must also specify the first frame through FileInfos.</li><li>Image size must be less than 5M.</li><li>Supported image formats: jpeg, jpg, png, webp.</li></ol>
     */
    public void setLastFrameUrl(String LastFrameUrl) {
        this.LastFrameUrl = LastFrameUrl;
    }

    /**
     * Get <p>Prompt for video generation.<br>When no reference file is passed in, no usage scenario type is used, and ExtInfo is not null, Prompt is required.</p> 
     * @return Prompt <p>Prompt for video generation.<br>When no reference file is passed in, no usage scenario type is used, and ExtInfo is not null, Prompt is required.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt for video generation.<br>When no reference file is passed in, no usage scenario type is used, and ExtInfo is not null, Prompt is required.</p>
     * @param Prompt <p>Prompt for video generation.<br>When no reference file is passed in, no usage scenario type is used, and ExtInfo is not null, Prompt is required.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Prompt to prevent the model from generating videos.</p> 
     * @return NegativePrompt <p>Prompt to prevent the model from generating videos.</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>Prompt to prevent the model from generating videos.</p>
     * @param NegativePrompt <p>Prompt to prevent the model from generating videos.</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return EnhancePrompt <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param EnhancePrompt <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>Output media file configuration for a video task.</p> 
     * @return OutputConfig <p>Output media file configuration for a video task.</p>
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output media file configuration for a video task.</p>
     * @param OutputConfig <p>Output media file configuration for a video task.</p>
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>Region information of the input file. Values are as follows:</p><ul><li>If the input file is stored overseas: Oversea;</li><li>If the input file is stored in the western United States: OverseaUSWest;</li><li>If the input file is stored in the Chinese mainland: Mainland.</li></ul><p>Default value: Mainland</p> 
     * @return InputRegion <p>Region information of the input file. Values are as follows:</p><ul><li>If the input file is stored overseas: Oversea;</li><li>If the input file is stored in the western United States: OverseaUSWest;</li><li>If the input file is stored in the Chinese mainland: Mainland.</li></ul><p>Default value: Mainland</p>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>Region information of the input file. Values are as follows:</p><ul><li>If the input file is stored overseas: Oversea;</li><li>If the input file is stored in the western United States: OverseaUSWest;</li><li>If the input file is stored in the Chinese mainland: Mainland.</li></ul><p>Default value: Mainland</p>
     * @param InputRegion <p>Region information of the input file. Values are as follows:</p><ul><li>If the input file is stored overseas: Oversea;</li><li>If the input file is stored in the western United States: OverseaUSWest;</li><li>If the input file is stored in the Chinese mainland: Mainland.</li></ul><p>Default value: Mainland</p>
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get <p>Scenario type. Values are as follows:</p><li>When ModelName is Kling: motion_control means action control; avatar_i2v means digital human; lip_sync means lip-sync;</li><li>When ModelName is Vidu: template_effect means special effect template;</li><li>Other ModelName values are not currently supported.</li> 
     * @return SceneType <p>Scenario type. Values are as follows:</p><li>When ModelName is Kling: motion_control means action control; avatar_i2v means digital human; lip_sync means lip-sync;</li><li>When ModelName is Vidu: template_effect means special effect template;</li><li>Other ModelName values are not currently supported.</li>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario type. Values are as follows:</p><li>When ModelName is Kling: motion_control means action control; avatar_i2v means digital human; lip_sync means lip-sync;</li><li>When ModelName is Vidu: template_effect means special effect template;</li><li>Other ModelName values are not currently supported.</li>
     * @param SceneType <p>Scenario type. Values are as follows:</p><li>When ModelName is Kling: motion_control means action control; avatar_i2v means digital human; lip_sync means lip-sync;</li><li>When ModelName is Vidu: template_effect means special effect template;</li><li>Other ModelName values are not currently supported.</li>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81">Task flow name</a>. Fill in when you need to execute a task flow on the generated new video.</p> 
     * @return Procedure <p><a href="https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81">Task flow name</a>. Fill in when you need to execute a task flow on the generated new video.</p>
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81">Task flow name</a>. Fill in when you need to execute a task flow on the generated new video.</p>
     * @param Procedure <p><a href="https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81">Task flow name</a>. Fill in when you need to execute a task flow on the generated new video.</p>
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
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
     * Get <p>Reserved field, used for special purposes.<br>Can be used to import special model parameters, storyboard prompts, etc.</p> 
     * @return ExtInfo <p>Reserved field, used for special purposes.<br>Can be used to import special model parameters, storyboard prompts, etc.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used for special purposes.<br>Can be used to import special model parameters, storyboard prompts, etc.</p>
     * @param ExtInfo <p>Reserved field, used for special purposes.<br>Can be used to import special model parameters, storyboard prompts, etc.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
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
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
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
        this.setParamArrayObj(map, prefix + "SubjectInfos.", this.SubjectInfos);
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "LastFrameUrl", this.LastFrameUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

