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

public class AigcVideoOutputConfig extends AbstractModel {

    /**
    * Storage mode. valid values: <li>Permanent: Permanent storage. the generated video file will be stored in vod, and the FileId can be obtained from the event notification.</li> <li>Temporary: Temporary storage. the generated video file will not be stored in vod, and a Temporary access URL can be obtained from the event notification.</li>
Default value: Temporary.
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * Output media filename, longest 64 characters. default filename is specified by the system.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicate other categories.</li>.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiry date of the output file. files will be deleted longer than this time. default is never expire. format according to ISO 8601 standard. see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Video duration, unit: seconds. <li>when ModelName is Kling, optional values: 5, 10, defaults to 5;</li> <li>when ModelName is Hailuo, optional values: 6, 10, defaults to 6;</li> <li>when ModelName is Vidu, specify 1-10;</li> <li>when ModelName is GV, optional values: 8, defaults to 8;</li> <li>when ModelName is OS, optional values: 4, 8, 12, defaults to 8;</li>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Generated video resolution.
<li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P.</li>
<li>When ModelName is Hailuo, optional values are 768P and 1080P, with a default value of 768P.</li>
<li>When ModelName is Vidu, optional values are 720P, 1080P, defaults to 720P.</li>
<li>When ModelName is GV, optional values are 720P, 1080P, with a default value of 720P.</li>
<li>When ModelName is OS, the optional values are 720P.</li>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Specify the aspect ratio of the generated video.
<li>When ModelName is Kling, for text-to-video, the optional values are 16:9, 9:16, 1:1, default is 16:9.</li>
<li>When ModelName is Vidu, the optional values for video generation and image generation usage reference are 16:9, 9:16, 4:3, 3:4, and 1:1. among them, only version q2 supports 4:3 and 3:4.</li>
<li>When ModelName is GV, optional values are 16:9 and 9:16, with a default value of 16:9.</li>
<li>When ModelName is OS, for text-to-video, optional values are 16:9, 9:16, default is 16:9;</li>
<li>When ModelName is Hailuo, it is not currently supported.</li>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * Whether to generate audio. supported models include GV, OS, Vidu. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Default value: Disabled.
    */
    @SerializedName("AudioGeneration")
    @Expose
    private String AudioGeneration;

    /**
    * Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
    */
    @SerializedName("InputComplianceCheck")
    @Expose
    private String InputComplianceCheck;

    /**
    * Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
    */
    @SerializedName("OutputComplianceCheck")
    @Expose
    private String OutputComplianceCheck;

    /**
    * Whether to enable video enhancement. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Note:
1. when the selected resolution exceeds the resolution the model can generate, enhancement is enabled by default.
2. for resolutions that the model can directly output, you can also proactively select the model to directly output low-resolution images and use enhancement to obtain the specified resolution.
    */
    @SerializedName("EnhanceSwitch")
    @Expose
    private String EnhanceSwitch;

    /**
    * Whether to enable vidu intelligent frame interpolation. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
    */
    @SerializedName("FrameInterpolate")
    @Expose
    private String FrameInterpolate;

    /**
     * Get Storage mode. valid values: <li>Permanent: Permanent storage. the generated video file will be stored in vod, and the FileId can be obtained from the event notification.</li> <li>Temporary: Temporary storage. the generated video file will not be stored in vod, and a Temporary access URL can be obtained from the event notification.</li>
Default value: Temporary. 
     * @return StorageMode Storage mode. valid values: <li>Permanent: Permanent storage. the generated video file will be stored in vod, and the FileId can be obtained from the event notification.</li> <li>Temporary: Temporary storage. the generated video file will not be stored in vod, and a Temporary access URL can be obtained from the event notification.</li>
Default value: Temporary.
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Storage mode. valid values: <li>Permanent: Permanent storage. the generated video file will be stored in vod, and the FileId can be obtained from the event notification.</li> <li>Temporary: Temporary storage. the generated video file will not be stored in vod, and a Temporary access URL can be obtained from the event notification.</li>
Default value: Temporary.
     * @param StorageMode Storage mode. valid values: <li>Permanent: Permanent storage. the generated video file will be stored in vod, and the FileId can be obtained from the event notification.</li> <li>Temporary: Temporary storage. the generated video file will not be stored in vod, and a Temporary access URL can be obtained from the event notification.</li>
Default value: Temporary.
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get Output media filename, longest 64 characters. default filename is specified by the system. 
     * @return MediaName Output media filename, longest 64 characters. default filename is specified by the system.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output media filename, longest 64 characters. default filename is specified by the system.
     * @param MediaName Output media filename, longest 64 characters. default filename is specified by the system.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicate other categories.</li>. 
     * @return ClassId Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicate other categories.</li>.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicate other categories.</li>.
     * @param ClassId Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicate other categories.</li>.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiry date of the output file. files will be deleted longer than this time. default is never expire. format according to ISO 8601 standard. see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime The expiry date of the output file. files will be deleted longer than this time. default is never expire. format according to ISO 8601 standard. see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiry date of the output file. files will be deleted longer than this time. default is never expire. format according to ISO 8601 standard. see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime The expiry date of the output file. files will be deleted longer than this time. default is never expire. format according to ISO 8601 standard. see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Video duration, unit: seconds. <li>when ModelName is Kling, optional values: 5, 10, defaults to 5;</li> <li>when ModelName is Hailuo, optional values: 6, 10, defaults to 6;</li> <li>when ModelName is Vidu, specify 1-10;</li> <li>when ModelName is GV, optional values: 8, defaults to 8;</li> <li>when ModelName is OS, optional values: 4, 8, 12, defaults to 8;</li> 
     * @return Duration Video duration, unit: seconds. <li>when ModelName is Kling, optional values: 5, 10, defaults to 5;</li> <li>when ModelName is Hailuo, optional values: 6, 10, defaults to 6;</li> <li>when ModelName is Vidu, specify 1-10;</li> <li>when ModelName is GV, optional values: 8, defaults to 8;</li> <li>when ModelName is OS, optional values: 4, 8, 12, defaults to 8;</li>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration, unit: seconds. <li>when ModelName is Kling, optional values: 5, 10, defaults to 5;</li> <li>when ModelName is Hailuo, optional values: 6, 10, defaults to 6;</li> <li>when ModelName is Vidu, specify 1-10;</li> <li>when ModelName is GV, optional values: 8, defaults to 8;</li> <li>when ModelName is OS, optional values: 4, 8, 12, defaults to 8;</li>
     * @param Duration Video duration, unit: seconds. <li>when ModelName is Kling, optional values: 5, 10, defaults to 5;</li> <li>when ModelName is Hailuo, optional values: 6, 10, defaults to 6;</li> <li>when ModelName is Vidu, specify 1-10;</li> <li>when ModelName is GV, optional values: 8, defaults to 8;</li> <li>when ModelName is OS, optional values: 4, 8, 12, defaults to 8;</li>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Generated video resolution.
<li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P.</li>
<li>When ModelName is Hailuo, optional values are 768P and 1080P, with a default value of 768P.</li>
<li>When ModelName is Vidu, optional values are 720P, 1080P, defaults to 720P.</li>
<li>When ModelName is GV, optional values are 720P, 1080P, with a default value of 720P.</li>
<li>When ModelName is OS, the optional values are 720P.</li> 
     * @return Resolution Generated video resolution.
<li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P.</li>
<li>When ModelName is Hailuo, optional values are 768P and 1080P, with a default value of 768P.</li>
<li>When ModelName is Vidu, optional values are 720P, 1080P, defaults to 720P.</li>
<li>When ModelName is GV, optional values are 720P, 1080P, with a default value of 720P.</li>
<li>When ModelName is OS, the optional values are 720P.</li>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Generated video resolution.
<li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P.</li>
<li>When ModelName is Hailuo, optional values are 768P and 1080P, with a default value of 768P.</li>
<li>When ModelName is Vidu, optional values are 720P, 1080P, defaults to 720P.</li>
<li>When ModelName is GV, optional values are 720P, 1080P, with a default value of 720P.</li>
<li>When ModelName is OS, the optional values are 720P.</li>
     * @param Resolution Generated video resolution.
<li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P.</li>
<li>When ModelName is Hailuo, optional values are 768P and 1080P, with a default value of 768P.</li>
<li>When ModelName is Vidu, optional values are 720P, 1080P, defaults to 720P.</li>
<li>When ModelName is GV, optional values are 720P, 1080P, with a default value of 720P.</li>
<li>When ModelName is OS, the optional values are 720P.</li>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Specify the aspect ratio of the generated video.
<li>When ModelName is Kling, for text-to-video, the optional values are 16:9, 9:16, 1:1, default is 16:9.</li>
<li>When ModelName is Vidu, the optional values for video generation and image generation usage reference are 16:9, 9:16, 4:3, 3:4, and 1:1. among them, only version q2 supports 4:3 and 3:4.</li>
<li>When ModelName is GV, optional values are 16:9 and 9:16, with a default value of 16:9.</li>
<li>When ModelName is OS, for text-to-video, optional values are 16:9, 9:16, default is 16:9;</li>
<li>When ModelName is Hailuo, it is not currently supported.</li> 
     * @return AspectRatio Specify the aspect ratio of the generated video.
<li>When ModelName is Kling, for text-to-video, the optional values are 16:9, 9:16, 1:1, default is 16:9.</li>
<li>When ModelName is Vidu, the optional values for video generation and image generation usage reference are 16:9, 9:16, 4:3, 3:4, and 1:1. among them, only version q2 supports 4:3 and 3:4.</li>
<li>When ModelName is GV, optional values are 16:9 and 9:16, with a default value of 16:9.</li>
<li>When ModelName is OS, for text-to-video, optional values are 16:9, 9:16, default is 16:9;</li>
<li>When ModelName is Hailuo, it is not currently supported.</li>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set Specify the aspect ratio of the generated video.
<li>When ModelName is Kling, for text-to-video, the optional values are 16:9, 9:16, 1:1, default is 16:9.</li>
<li>When ModelName is Vidu, the optional values for video generation and image generation usage reference are 16:9, 9:16, 4:3, 3:4, and 1:1. among them, only version q2 supports 4:3 and 3:4.</li>
<li>When ModelName is GV, optional values are 16:9 and 9:16, with a default value of 16:9.</li>
<li>When ModelName is OS, for text-to-video, optional values are 16:9, 9:16, default is 16:9;</li>
<li>When ModelName is Hailuo, it is not currently supported.</li>
     * @param AspectRatio Specify the aspect ratio of the generated video.
<li>When ModelName is Kling, for text-to-video, the optional values are 16:9, 9:16, 1:1, default is 16:9.</li>
<li>When ModelName is Vidu, the optional values for video generation and image generation usage reference are 16:9, 9:16, 4:3, 3:4, and 1:1. among them, only version q2 supports 4:3 and 3:4.</li>
<li>When ModelName is GV, optional values are 16:9 and 9:16, with a default value of 16:9.</li>
<li>When ModelName is OS, for text-to-video, optional values are 16:9, 9:16, default is 16:9;</li>
<li>When ModelName is Hailuo, it is not currently supported.</li>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get Whether to generate audio. supported models include GV, OS, Vidu. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Default value: Disabled. 
     * @return AudioGeneration Whether to generate audio. supported models include GV, OS, Vidu. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Default value: Disabled.
     */
    public String getAudioGeneration() {
        return this.AudioGeneration;
    }

    /**
     * Set Whether to generate audio. supported models include GV, OS, Vidu. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Default value: Disabled.
     * @param AudioGeneration Whether to generate audio. supported models include GV, OS, Vidu. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Default value: Disabled.
     */
    public void setAudioGeneration(String AudioGeneration) {
        this.AudioGeneration = AudioGeneration;
    }

    /**
     * Get Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li> 
     * @return PersonGeneration Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>
     */
    public String getPersonGeneration() {
        return this.PersonGeneration;
    }

    /**
     * Set Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>
     * @param PersonGeneration Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>
     */
    public void setPersonGeneration(String PersonGeneration) {
        this.PersonGeneration = PersonGeneration;
    }

    /**
     * Get Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li> 
     * @return InputComplianceCheck Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     * @param InputComplianceCheck Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     */
    public void setInputComplianceCheck(String InputComplianceCheck) {
        this.InputComplianceCheck = InputComplianceCheck;
    }

    /**
     * Get Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li> 
     * @return OutputComplianceCheck Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     */
    public String getOutputComplianceCheck() {
        return this.OutputComplianceCheck;
    }

    /**
     * Set Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     * @param OutputComplianceCheck Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     */
    public void setOutputComplianceCheck(String OutputComplianceCheck) {
        this.OutputComplianceCheck = OutputComplianceCheck;
    }

    /**
     * Get Whether to enable video enhancement. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Note:
1. when the selected resolution exceeds the resolution the model can generate, enhancement is enabled by default.
2. for resolutions that the model can directly output, you can also proactively select the model to directly output low-resolution images and use enhancement to obtain the specified resolution. 
     * @return EnhanceSwitch Whether to enable video enhancement. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Note:
1. when the selected resolution exceeds the resolution the model can generate, enhancement is enabled by default.
2. for resolutions that the model can directly output, you can also proactively select the model to directly output low-resolution images and use enhancement to obtain the specified resolution.
     */
    public String getEnhanceSwitch() {
        return this.EnhanceSwitch;
    }

    /**
     * Set Whether to enable video enhancement. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Note:
1. when the selected resolution exceeds the resolution the model can generate, enhancement is enabled by default.
2. for resolutions that the model can directly output, you can also proactively select the model to directly output low-resolution images and use enhancement to obtain the specified resolution.
     * @param EnhanceSwitch Whether to enable video enhancement. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
Note:
1. when the selected resolution exceeds the resolution the model can generate, enhancement is enabled by default.
2. for resolutions that the model can directly output, you can also proactively select the model to directly output low-resolution images and use enhancement to obtain the specified resolution.
     */
    public void setEnhanceSwitch(String EnhanceSwitch) {
        this.EnhanceSwitch = EnhanceSwitch;
    }

    /**
     * Get Whether to enable vidu intelligent frame interpolation. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li> 
     * @return FrameInterpolate Whether to enable vidu intelligent frame interpolation. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     */
    public String getFrameInterpolate() {
        return this.FrameInterpolate;
    }

    /**
     * Set Whether to enable vidu intelligent frame interpolation. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     * @param FrameInterpolate Whether to enable vidu intelligent frame interpolation. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>
     */
    public void setFrameInterpolate(String FrameInterpolate) {
        this.FrameInterpolate = FrameInterpolate;
    }

    public AigcVideoOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoOutputConfig(AigcVideoOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.AudioGeneration != null) {
            this.AudioGeneration = new String(source.AudioGeneration);
        }
        if (source.PersonGeneration != null) {
            this.PersonGeneration = new String(source.PersonGeneration);
        }
        if (source.InputComplianceCheck != null) {
            this.InputComplianceCheck = new String(source.InputComplianceCheck);
        }
        if (source.OutputComplianceCheck != null) {
            this.OutputComplianceCheck = new String(source.OutputComplianceCheck);
        }
        if (source.EnhanceSwitch != null) {
            this.EnhanceSwitch = new String(source.EnhanceSwitch);
        }
        if (source.FrameInterpolate != null) {
            this.FrameInterpolate = new String(source.FrameInterpolate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "AudioGeneration", this.AudioGeneration);
        this.setParamSimple(map, prefix + "PersonGeneration", this.PersonGeneration);
        this.setParamSimple(map, prefix + "InputComplianceCheck", this.InputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputComplianceCheck", this.OutputComplianceCheck);
        this.setParamSimple(map, prefix + "EnhanceSwitch", this.EnhanceSwitch);
        this.setParamSimple(map, prefix + "FrameInterpolate", this.FrameInterpolate);

    }
}

