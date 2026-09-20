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
    * <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>Output media file name, up to 64 characters. By default, the system specifies the generated file name.</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="/document/product/266/7812">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Duration of the generated video, in seconds.</p><li>When ModelName is Kling, available values are 3-15, with a default value of 5;</li><li>When ModelName is Hailuo, available values are 6 and 10, with a default value of 6; when the version is H3, available values are 4-15 seconds (integer)</li><li>When ModelName is Vidu, you can specify 1-10;</li><li>When ModelName is GV, the available value is 8, with a default value of 8;</li><li>When ModelName is OS, available values are 4, 8, and 12, with a default value of 8;</li><li>When ModelName is PixVerse, you can specify 1-15, with a default value of 5;</li>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>Resolution of the generated video.</p><li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is Hailuo, available values are 768P and 1080P, with a default value of 768P; when the version is H3, available values are 768P, 1080P, 2K, and 4K;</li><li>When ModelName is Vidu, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is GV, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is OS, the available value is 720P;</li><li>When ModelName is PixVerse, available values are 540p, 720p, 1080p, 2k, and 4k, with a default value of 720p;</li>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Aspect ratio of the generated video.</p><li>When ModelName is Kling, for text-to-video, the available values are 16:9, 9:16, and 1:1, with a default of 16:9.</li><li>When ModelName is Vidu, for text-to-video and reference image-to-video, the available values are 16:9, 9:16, 4:3, 3:4, and 1:1. Only version q2 supports 4:3 and 3:4.</li><li>When ModelName is GV, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is OS, for text-to-video, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is Hailuo and the version is H3, for text-to-video and reference image-to-video, the available values are 21:9, 16:9, 4:3, 1:1, 3:4, and 9:16. For image-to-video (first and last frame video), the resolution matches the image.</li><li>When ModelName is PixVerse, the available values are 16:9, 4:3, 1:1, 3:4, 9:16, 2:3, 3:2, and 21:9.</li>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Whether to generate audio. Supported models include GV, OS, Vidu, Jimeng, and Kling.</p><p>Enumeration values:</p><ul><li>Enabled: Enable</li><li>Disabled: Disable</li></ul><p>Default value: Disabled</p>
    */
    @SerializedName("AudioGeneration")
    @Expose
    private String AudioGeneration;

    /**
    * <p>Whether to allow generation of people or human faces. Valid values: <li>AllowAdult: allow generation of adults;</li> <li>Disallowed: forbid people or human faces in images;</li></p>
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * <p>Whether compliance check is enabled for the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("InputComplianceCheck")
    @Expose
    private String InputComplianceCheck;

    /**
    * <p>Whether to enable compliance check on output content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("OutputComplianceCheck")
    @Expose
    private String OutputComplianceCheck;

    /**
    * <p>Whether to enable video enhancement. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li><br>Description:</p><ol><li>For the selected resolution exceeding the model's generation resolution, enhancement is enabled by default.</li><li>For resolutions the model can directly generate, you can also choose direct low-resolution generation and use enhancement to obtain the specified resolution.</li></ol>
    */
    @SerializedName("EnhanceSwitch")
    @Expose
    private String EnhanceSwitch;

    /**
    * <p>Whether to enable off-peak. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("OffPeak")
    @Expose
    private String OffPeak;

    /**
    * <p>Whether to enable vidu intelligent frame interpolation. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("FrameInterpolate")
    @Expose
    private String FrameInterpolate;

    /**
    * <p>Indicates whether to enable the logo watermark. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private String LogoAdd;

    /**
    * <p>Whether to add background music to the generated video.</p><p>Enumeration values:</p><ul><li>Enabled: The system will automatically select suitable music from the preset BGM library and add it.</li><li>Disabled: Do not add BGM.</li></ul><p>Default value: Disabled</p>
    */
    @SerializedName("EnableBGM")
    @Expose
    private String EnableBGM;

    /**
     * Get <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p> 
     * @return StorageMode <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
     * @param StorageMode <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>Output media file name, up to 64 characters. By default, the system specifies the generated file name.</p> 
     * @return MediaName <p>Output media file name, up to 64 characters. By default, the system specifies the generated file name.</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>Output media file name, up to 64 characters. By default, the system specifies the generated file name.</p>
     * @param MediaName <p>Output media file name, up to 64 characters. By default, the system specifies the generated file name.</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="/document/product/266/7812">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li> 
     * @return ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="/document/product/266/7812">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="/document/product/266/7812">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     * @param ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="/document/product/266/7812">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return ExpireTime <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param ExpireTime <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Duration of the generated video, in seconds.</p><li>When ModelName is Kling, available values are 3-15, with a default value of 5;</li><li>When ModelName is Hailuo, available values are 6 and 10, with a default value of 6; when the version is H3, available values are 4-15 seconds (integer)</li><li>When ModelName is Vidu, you can specify 1-10;</li><li>When ModelName is GV, the available value is 8, with a default value of 8;</li><li>When ModelName is OS, available values are 4, 8, and 12, with a default value of 8;</li><li>When ModelName is PixVerse, you can specify 1-15, with a default value of 5;</li> 
     * @return Duration <p>Duration of the generated video, in seconds.</p><li>When ModelName is Kling, available values are 3-15, with a default value of 5;</li><li>When ModelName is Hailuo, available values are 6 and 10, with a default value of 6; when the version is H3, available values are 4-15 seconds (integer)</li><li>When ModelName is Vidu, you can specify 1-10;</li><li>When ModelName is GV, the available value is 8, with a default value of 8;</li><li>When ModelName is OS, available values are 4, 8, and 12, with a default value of 8;</li><li>When ModelName is PixVerse, you can specify 1-15, with a default value of 5;</li>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Duration of the generated video, in seconds.</p><li>When ModelName is Kling, available values are 3-15, with a default value of 5;</li><li>When ModelName is Hailuo, available values are 6 and 10, with a default value of 6; when the version is H3, available values are 4-15 seconds (integer)</li><li>When ModelName is Vidu, you can specify 1-10;</li><li>When ModelName is GV, the available value is 8, with a default value of 8;</li><li>When ModelName is OS, available values are 4, 8, and 12, with a default value of 8;</li><li>When ModelName is PixVerse, you can specify 1-15, with a default value of 5;</li>
     * @param Duration <p>Duration of the generated video, in seconds.</p><li>When ModelName is Kling, available values are 3-15, with a default value of 5;</li><li>When ModelName is Hailuo, available values are 6 and 10, with a default value of 6; when the version is H3, available values are 4-15 seconds (integer)</li><li>When ModelName is Vidu, you can specify 1-10;</li><li>When ModelName is GV, the available value is 8, with a default value of 8;</li><li>When ModelName is OS, available values are 4, 8, and 12, with a default value of 8;</li><li>When ModelName is PixVerse, you can specify 1-15, with a default value of 5;</li>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Resolution of the generated video.</p><li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is Hailuo, available values are 768P and 1080P, with a default value of 768P; when the version is H3, available values are 768P, 1080P, 2K, and 4K;</li><li>When ModelName is Vidu, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is GV, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is OS, the available value is 720P;</li><li>When ModelName is PixVerse, available values are 540p, 720p, 1080p, 2k, and 4k, with a default value of 720p;</li> 
     * @return Resolution <p>Resolution of the generated video.</p><li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is Hailuo, available values are 768P and 1080P, with a default value of 768P; when the version is H3, available values are 768P, 1080P, 2K, and 4K;</li><li>When ModelName is Vidu, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is GV, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is OS, the available value is 720P;</li><li>When ModelName is PixVerse, available values are 540p, 720p, 1080p, 2k, and 4k, with a default value of 720p;</li>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Resolution of the generated video.</p><li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is Hailuo, available values are 768P and 1080P, with a default value of 768P; when the version is H3, available values are 768P, 1080P, 2K, and 4K;</li><li>When ModelName is Vidu, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is GV, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is OS, the available value is 720P;</li><li>When ModelName is PixVerse, available values are 540p, 720p, 1080p, 2k, and 4k, with a default value of 720p;</li>
     * @param Resolution <p>Resolution of the generated video.</p><li>When ModelName is Kling, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is Hailuo, available values are 768P and 1080P, with a default value of 768P; when the version is H3, available values are 768P, 1080P, 2K, and 4K;</li><li>When ModelName is Vidu, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is GV, available values are 720P and 1080P, with a default value of 720P;</li><li>When ModelName is OS, the available value is 720P;</li><li>When ModelName is PixVerse, available values are 540p, 720p, 1080p, 2k, and 4k, with a default value of 720p;</li>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Aspect ratio of the generated video.</p><li>When ModelName is Kling, for text-to-video, the available values are 16:9, 9:16, and 1:1, with a default of 16:9.</li><li>When ModelName is Vidu, for text-to-video and reference image-to-video, the available values are 16:9, 9:16, 4:3, 3:4, and 1:1. Only version q2 supports 4:3 and 3:4.</li><li>When ModelName is GV, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is OS, for text-to-video, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is Hailuo and the version is H3, for text-to-video and reference image-to-video, the available values are 21:9, 16:9, 4:3, 1:1, 3:4, and 9:16. For image-to-video (first and last frame video), the resolution matches the image.</li><li>When ModelName is PixVerse, the available values are 16:9, 4:3, 1:1, 3:4, 9:16, 2:3, 3:2, and 21:9.</li> 
     * @return AspectRatio <p>Aspect ratio of the generated video.</p><li>When ModelName is Kling, for text-to-video, the available values are 16:9, 9:16, and 1:1, with a default of 16:9.</li><li>When ModelName is Vidu, for text-to-video and reference image-to-video, the available values are 16:9, 9:16, 4:3, 3:4, and 1:1. Only version q2 supports 4:3 and 3:4.</li><li>When ModelName is GV, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is OS, for text-to-video, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is Hailuo and the version is H3, for text-to-video and reference image-to-video, the available values are 21:9, 16:9, 4:3, 1:1, 3:4, and 9:16. For image-to-video (first and last frame video), the resolution matches the image.</li><li>When ModelName is PixVerse, the available values are 16:9, 4:3, 1:1, 3:4, 9:16, 2:3, 3:2, and 21:9.</li>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Aspect ratio of the generated video.</p><li>When ModelName is Kling, for text-to-video, the available values are 16:9, 9:16, and 1:1, with a default of 16:9.</li><li>When ModelName is Vidu, for text-to-video and reference image-to-video, the available values are 16:9, 9:16, 4:3, 3:4, and 1:1. Only version q2 supports 4:3 and 3:4.</li><li>When ModelName is GV, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is OS, for text-to-video, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is Hailuo and the version is H3, for text-to-video and reference image-to-video, the available values are 21:9, 16:9, 4:3, 1:1, 3:4, and 9:16. For image-to-video (first and last frame video), the resolution matches the image.</li><li>When ModelName is PixVerse, the available values are 16:9, 4:3, 1:1, 3:4, 9:16, 2:3, 3:2, and 21:9.</li>
     * @param AspectRatio <p>Aspect ratio of the generated video.</p><li>When ModelName is Kling, for text-to-video, the available values are 16:9, 9:16, and 1:1, with a default of 16:9.</li><li>When ModelName is Vidu, for text-to-video and reference image-to-video, the available values are 16:9, 9:16, 4:3, 3:4, and 1:1. Only version q2 supports 4:3 and 3:4.</li><li>When ModelName is GV, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is OS, for text-to-video, the available values are 16:9 and 9:16, with a default of 16:9.</li><li>When ModelName is Hailuo and the version is H3, for text-to-video and reference image-to-video, the available values are 21:9, 16:9, 4:3, 1:1, 3:4, and 9:16. For image-to-video (first and last frame video), the resolution matches the image.</li><li>When ModelName is PixVerse, the available values are 16:9, 4:3, 1:1, 3:4, 9:16, 2:3, 3:2, and 21:9.</li>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>Whether to generate audio. Supported models include GV, OS, Vidu, Jimeng, and Kling.</p><p>Enumeration values:</p><ul><li>Enabled: Enable</li><li>Disabled: Disable</li></ul><p>Default value: Disabled</p> 
     * @return AudioGeneration <p>Whether to generate audio. Supported models include GV, OS, Vidu, Jimeng, and Kling.</p><p>Enumeration values:</p><ul><li>Enabled: Enable</li><li>Disabled: Disable</li></ul><p>Default value: Disabled</p>
     */
    public String getAudioGeneration() {
        return this.AudioGeneration;
    }

    /**
     * Set <p>Whether to generate audio. Supported models include GV, OS, Vidu, Jimeng, and Kling.</p><p>Enumeration values:</p><ul><li>Enabled: Enable</li><li>Disabled: Disable</li></ul><p>Default value: Disabled</p>
     * @param AudioGeneration <p>Whether to generate audio. Supported models include GV, OS, Vidu, Jimeng, and Kling.</p><p>Enumeration values:</p><ul><li>Enabled: Enable</li><li>Disabled: Disable</li></ul><p>Default value: Disabled</p>
     */
    public void setAudioGeneration(String AudioGeneration) {
        this.AudioGeneration = AudioGeneration;
    }

    /**
     * Get <p>Whether to allow generation of people or human faces. Valid values: <li>AllowAdult: allow generation of adults;</li> <li>Disallowed: forbid people or human faces in images;</li></p> 
     * @return PersonGeneration <p>Whether to allow generation of people or human faces. Valid values: <li>AllowAdult: allow generation of adults;</li> <li>Disallowed: forbid people or human faces in images;</li></p>
     */
    public String getPersonGeneration() {
        return this.PersonGeneration;
    }

    /**
     * Set <p>Whether to allow generation of people or human faces. Valid values: <li>AllowAdult: allow generation of adults;</li> <li>Disallowed: forbid people or human faces in images;</li></p>
     * @param PersonGeneration <p>Whether to allow generation of people or human faces. Valid values: <li>AllowAdult: allow generation of adults;</li> <li>Disallowed: forbid people or human faces in images;</li></p>
     */
    public void setPersonGeneration(String PersonGeneration) {
        this.PersonGeneration = PersonGeneration;
    }

    /**
     * Get <p>Whether compliance check is enabled for the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return InputComplianceCheck <p>Whether compliance check is enabled for the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set <p>Whether compliance check is enabled for the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param InputComplianceCheck <p>Whether compliance check is enabled for the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setInputComplianceCheck(String InputComplianceCheck) {
        this.InputComplianceCheck = InputComplianceCheck;
    }

    /**
     * Get <p>Whether to enable compliance check on output content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return OutputComplianceCheck <p>Whether to enable compliance check on output content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getOutputComplianceCheck() {
        return this.OutputComplianceCheck;
    }

    /**
     * Set <p>Whether to enable compliance check on output content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param OutputComplianceCheck <p>Whether to enable compliance check on output content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setOutputComplianceCheck(String OutputComplianceCheck) {
        this.OutputComplianceCheck = OutputComplianceCheck;
    }

    /**
     * Get <p>Whether to enable video enhancement. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li><br>Description:</p><ol><li>For the selected resolution exceeding the model's generation resolution, enhancement is enabled by default.</li><li>For resolutions the model can directly generate, you can also choose direct low-resolution generation and use enhancement to obtain the specified resolution.</li></ol> 
     * @return EnhanceSwitch <p>Whether to enable video enhancement. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li><br>Description:</p><ol><li>For the selected resolution exceeding the model's generation resolution, enhancement is enabled by default.</li><li>For resolutions the model can directly generate, you can also choose direct low-resolution generation and use enhancement to obtain the specified resolution.</li></ol>
     */
    public String getEnhanceSwitch() {
        return this.EnhanceSwitch;
    }

    /**
     * Set <p>Whether to enable video enhancement. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li><br>Description:</p><ol><li>For the selected resolution exceeding the model's generation resolution, enhancement is enabled by default.</li><li>For resolutions the model can directly generate, you can also choose direct low-resolution generation and use enhancement to obtain the specified resolution.</li></ol>
     * @param EnhanceSwitch <p>Whether to enable video enhancement. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li><br>Description:</p><ol><li>For the selected resolution exceeding the model's generation resolution, enhancement is enabled by default.</li><li>For resolutions the model can directly generate, you can also choose direct low-resolution generation and use enhancement to obtain the specified resolution.</li></ol>
     */
    public void setEnhanceSwitch(String EnhanceSwitch) {
        this.EnhanceSwitch = EnhanceSwitch;
    }

    /**
     * Get <p>Whether to enable off-peak. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return OffPeak <p>Whether to enable off-peak. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set <p>Whether to enable off-peak. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param OffPeak <p>Whether to enable off-peak. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setOffPeak(String OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get <p>Whether to enable vidu intelligent frame interpolation. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return FrameInterpolate <p>Whether to enable vidu intelligent frame interpolation. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getFrameInterpolate() {
        return this.FrameInterpolate;
    }

    /**
     * Set <p>Whether to enable vidu intelligent frame interpolation. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param FrameInterpolate <p>Whether to enable vidu intelligent frame interpolation. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setFrameInterpolate(String FrameInterpolate) {
        this.FrameInterpolate = FrameInterpolate;
    }

    /**
     * Get <p>Indicates whether to enable the logo watermark. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return LogoAdd <p>Indicates whether to enable the logo watermark. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>Indicates whether to enable the logo watermark. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param LogoAdd <p>Indicates whether to enable the logo watermark. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setLogoAdd(String LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>Whether to add background music to the generated video.</p><p>Enumeration values:</p><ul><li>Enabled: The system will automatically select suitable music from the preset BGM library and add it.</li><li>Disabled: Do not add BGM.</li></ul><p>Default value: Disabled</p> 
     * @return EnableBGM <p>Whether to add background music to the generated video.</p><p>Enumeration values:</p><ul><li>Enabled: The system will automatically select suitable music from the preset BGM library and add it.</li><li>Disabled: Do not add BGM.</li></ul><p>Default value: Disabled</p>
     */
    public String getEnableBGM() {
        return this.EnableBGM;
    }

    /**
     * Set <p>Whether to add background music to the generated video.</p><p>Enumeration values:</p><ul><li>Enabled: The system will automatically select suitable music from the preset BGM library and add it.</li><li>Disabled: Do not add BGM.</li></ul><p>Default value: Disabled</p>
     * @param EnableBGM <p>Whether to add background music to the generated video.</p><p>Enumeration values:</p><ul><li>Enabled: The system will automatically select suitable music from the preset BGM library and add it.</li><li>Disabled: Do not add BGM.</li></ul><p>Default value: Disabled</p>
     */
    public void setEnableBGM(String EnableBGM) {
        this.EnableBGM = EnableBGM;
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
        if (source.OffPeak != null) {
            this.OffPeak = new String(source.OffPeak);
        }
        if (source.FrameInterpolate != null) {
            this.FrameInterpolate = new String(source.FrameInterpolate);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new String(source.LogoAdd);
        }
        if (source.EnableBGM != null) {
            this.EnableBGM = new String(source.EnableBGM);
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
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "FrameInterpolate", this.FrameInterpolate);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamSimple(map, prefix + "EnableBGM", this.EnableBGM);

    }
}

