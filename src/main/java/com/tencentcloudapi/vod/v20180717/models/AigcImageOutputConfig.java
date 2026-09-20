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

public class AigcImageOutputConfig extends AbstractModel {

    /**
    * <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>Output filename, up to 64 characters. By default, the system assigns the generated filename.</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>Category ID, used to categorize and manage media. You can create a category via the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format is according to the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Resolution of the generated image. Available values for each model:</p><ul><li>OG: 1K, 2K, 4K. Default: 1K.</li><li>GG 2.5: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.0: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.1: 720P, 1K, 2K, 4K. Default: 1K.</li><li>Kling 2.1: 1k, 2k. Default: 1k.</li><li>Kling 3.0: 1k, 2k. Default: 1k.</li><li>Kling 3.0-Omni: 1k, 2k, 4k. Default: 1k.</li><li>Kling O1: 1k, 2k, 4k. Default: 1k.</li><li>SI 4.0: 1K, 2K, 4K. Default: 1K.</li><li>SI 4.5: 2K, 4K. Default: 2K.</li><li>SI 5.0-lite: 2K, 3K. Default: 2K.</li><li>Vidu q2: 1080p, 2K, 4K. Default: 1080p.</li><li>Hunyuan 3.0: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li><li>Qwen 0925: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li></ul>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Specify the aspect ratio of the generated image.</p><ul><li>OG: 1:1, 3:2, 2:3, 3:4, 4:3, 16:9, 9:16, 21:9, 9:21;</li><li>GG 2.5: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.0: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.1: 1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9;</li><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, 3:2;</li><li>SI 4.0: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 4.5: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 5.0-lite: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>Hunyuan 3.0: not supported;</li><li>Qwen 2.0: not supported;</li><li>Qwen 0925: not supported;</li></ul>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Whether to allow generation of people or human faces. Valid values: <li>AllowAdult: allow generation of adults;</li> <li>Disallowed: forbid people or human faces in images;</li></p>
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * <p>Whether to enable compliance check on the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
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
    * <p>Number of images generated. Available values for each model:</p><ul><li>Kling: available value 1-9;</li><li>OG: available value 1-8;</li></ul><p><strong>Not effective for other models.</strong></p>
    */
    @SerializedName("OutputImageCount")
    @Expose
    private Long OutputImageCount;

    /**
    * <p>Specify the image file format for model output. If not specified, the model default value is followed. Available values:</p><ul><li>jpeg</li><li>png</li></ul>
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * <p>Indicates whether to enable a logo watermark. Disabled by default. Valid values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable;</li></ul>
    */
    @SerializedName("LogoAdd")
    @Expose
    private String LogoAdd;

    /**
     * Get <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p> 
     * @return StorageMode <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
     * @param StorageMode <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>Output filename, up to 64 characters. By default, the system assigns the generated filename.</p> 
     * @return MediaName <p>Output filename, up to 64 characters. By default, the system assigns the generated filename.</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>Output filename, up to 64 characters. By default, the system assigns the generated filename.</p>
     * @param MediaName <p>Output filename, up to 64 characters. By default, the system assigns the generated filename.</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>Category ID, used to categorize and manage media. You can create a category via the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li> 
     * @return ClassId <p>Category ID, used to categorize and manage media. You can create a category via the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Category ID, used to categorize and manage media. You can create a category via the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
     * @param ClassId <p>Category ID, used to categorize and manage media. You can create a category via the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format is according to the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return ExpireTime <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format is according to the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format is according to the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param ExpireTime <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format is according to the ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Resolution of the generated image. Available values for each model:</p><ul><li>OG: 1K, 2K, 4K. Default: 1K.</li><li>GG 2.5: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.0: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.1: 720P, 1K, 2K, 4K. Default: 1K.</li><li>Kling 2.1: 1k, 2k. Default: 1k.</li><li>Kling 3.0: 1k, 2k. Default: 1k.</li><li>Kling 3.0-Omni: 1k, 2k, 4k. Default: 1k.</li><li>Kling O1: 1k, 2k, 4k. Default: 1k.</li><li>SI 4.0: 1K, 2K, 4K. Default: 1K.</li><li>SI 4.5: 2K, 4K. Default: 2K.</li><li>SI 5.0-lite: 2K, 3K. Default: 2K.</li><li>Vidu q2: 1080p, 2K, 4K. Default: 1080p.</li><li>Hunyuan 3.0: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li><li>Qwen 0925: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li></ul> 
     * @return Resolution <p>Resolution of the generated image. Available values for each model:</p><ul><li>OG: 1K, 2K, 4K. Default: 1K.</li><li>GG 2.5: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.0: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.1: 720P, 1K, 2K, 4K. Default: 1K.</li><li>Kling 2.1: 1k, 2k. Default: 1k.</li><li>Kling 3.0: 1k, 2k. Default: 1k.</li><li>Kling 3.0-Omni: 1k, 2k, 4k. Default: 1k.</li><li>Kling O1: 1k, 2k, 4k. Default: 1k.</li><li>SI 4.0: 1K, 2K, 4K. Default: 1K.</li><li>SI 4.5: 2K, 4K. Default: 2K.</li><li>SI 5.0-lite: 2K, 3K. Default: 2K.</li><li>Vidu q2: 1080p, 2K, 4K. Default: 1080p.</li><li>Hunyuan 3.0: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li><li>Qwen 0925: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li></ul>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Resolution of the generated image. Available values for each model:</p><ul><li>OG: 1K, 2K, 4K. Default: 1K.</li><li>GG 2.5: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.0: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.1: 720P, 1K, 2K, 4K. Default: 1K.</li><li>Kling 2.1: 1k, 2k. Default: 1k.</li><li>Kling 3.0: 1k, 2k. Default: 1k.</li><li>Kling 3.0-Omni: 1k, 2k, 4k. Default: 1k.</li><li>Kling O1: 1k, 2k, 4k. Default: 1k.</li><li>SI 4.0: 1K, 2K, 4K. Default: 1K.</li><li>SI 4.5: 2K, 4K. Default: 2K.</li><li>SI 5.0-lite: 2K, 3K. Default: 2K.</li><li>Vidu q2: 1080p, 2K, 4K. Default: 1080p.</li><li>Hunyuan 3.0: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li><li>Qwen 0925: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li></ul>
     * @param Resolution <p>Resolution of the generated image. Available values for each model:</p><ul><li>OG: 1K, 2K, 4K. Default: 1K.</li><li>GG 2.5: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.0: 1K, 2K, 4K. Default: 1K.</li><li>GG 3.1: 720P, 1K, 2K, 4K. Default: 1K.</li><li>Kling 2.1: 1k, 2k. Default: 1k.</li><li>Kling 3.0: 1k, 2k. Default: 1k.</li><li>Kling 3.0-Omni: 1k, 2k, 4k. Default: 1k.</li><li>Kling O1: 1k, 2k, 4k. Default: 1k.</li><li>SI 4.0: 1K, 2K, 4K. Default: 1K.</li><li>SI 4.5: 2K, 4K. Default: 2K.</li><li>SI 5.0-lite: 2K, 3K. Default: 2K.</li><li>Vidu q2: 1080p, 2K, 4K. Default: 1080p.</li><li>Hunyuan 3.0: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li><li>Qwen 0925: This field is not currently supported. You can set the resolution via the <code>ExtInfo</code> field.</li></ul>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Specify the aspect ratio of the generated image.</p><ul><li>OG: 1:1, 3:2, 2:3, 3:4, 4:3, 16:9, 9:16, 21:9, 9:21;</li><li>GG 2.5: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.0: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.1: 1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9;</li><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, 3:2;</li><li>SI 4.0: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 4.5: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 5.0-lite: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>Hunyuan 3.0: not supported;</li><li>Qwen 2.0: not supported;</li><li>Qwen 0925: not supported;</li></ul> 
     * @return AspectRatio <p>Specify the aspect ratio of the generated image.</p><ul><li>OG: 1:1, 3:2, 2:3, 3:4, 4:3, 16:9, 9:16, 21:9, 9:21;</li><li>GG 2.5: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.0: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.1: 1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9;</li><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, 3:2;</li><li>SI 4.0: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 4.5: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 5.0-lite: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>Hunyuan 3.0: not supported;</li><li>Qwen 2.0: not supported;</li><li>Qwen 0925: not supported;</li></ul>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Specify the aspect ratio of the generated image.</p><ul><li>OG: 1:1, 3:2, 2:3, 3:4, 4:3, 16:9, 9:16, 21:9, 9:21;</li><li>GG 2.5: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.0: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.1: 1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9;</li><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, 3:2;</li><li>SI 4.0: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 4.5: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 5.0-lite: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>Hunyuan 3.0: not supported;</li><li>Qwen 2.0: not supported;</li><li>Qwen 0925: not supported;</li></ul>
     * @param AspectRatio <p>Specify the aspect ratio of the generated image.</p><ul><li>OG: 1:1, 3:2, 2:3, 3:4, 4:3, 16:9, 9:16, 21:9, 9:21;</li><li>GG 2.5: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.0: 1:1, 2:3, 3:2, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9;</li><li>GG 3.1: 1:1, 1:4, 1:8, 2:3, 3:2, 3:4, 4:1, 4:3, 4:5, 5:4, 8:1, 9:16, 16:9, 21:9;</li><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9;</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9, auto;</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, 3:2;</li><li>SI 4.0: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 4.5: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>SI 5.0-lite: <strong>does not support</strong> this parameter. You can specify 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, 21:9 via prompt;</li><li>Hunyuan 3.0: not supported;</li><li>Qwen 2.0: not supported;</li><li>Qwen 0925: not supported;</li></ul>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
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
     * Get <p>Whether to enable compliance check on the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return InputComplianceCheck <p>Whether to enable compliance check on the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set <p>Whether to enable compliance check on the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param InputComplianceCheck <p>Whether to enable compliance check on the input content. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
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
     * Get <p>Number of images generated. Available values for each model:</p><ul><li>Kling: available value 1-9;</li><li>OG: available value 1-8;</li></ul><p><strong>Not effective for other models.</strong></p> 
     * @return OutputImageCount <p>Number of images generated. Available values for each model:</p><ul><li>Kling: available value 1-9;</li><li>OG: available value 1-8;</li></ul><p><strong>Not effective for other models.</strong></p>
     */
    public Long getOutputImageCount() {
        return this.OutputImageCount;
    }

    /**
     * Set <p>Number of images generated. Available values for each model:</p><ul><li>Kling: available value 1-9;</li><li>OG: available value 1-8;</li></ul><p><strong>Not effective for other models.</strong></p>
     * @param OutputImageCount <p>Number of images generated. Available values for each model:</p><ul><li>Kling: available value 1-9;</li><li>OG: available value 1-8;</li></ul><p><strong>Not effective for other models.</strong></p>
     */
    public void setOutputImageCount(Long OutputImageCount) {
        this.OutputImageCount = OutputImageCount;
    }

    /**
     * Get <p>Specify the image file format for model output. If not specified, the model default value is followed. Available values:</p><ul><li>jpeg</li><li>png</li></ul> 
     * @return OutputFormat <p>Specify the image file format for model output. If not specified, the model default value is followed. Available values:</p><ul><li>jpeg</li><li>png</li></ul>
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>Specify the image file format for model output. If not specified, the model default value is followed. Available values:</p><ul><li>jpeg</li><li>png</li></ul>
     * @param OutputFormat <p>Specify the image file format for model output. If not specified, the model default value is followed. Available values:</p><ul><li>jpeg</li><li>png</li></ul>
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get <p>Indicates whether to enable a logo watermark. Disabled by default. Valid values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable;</li></ul> 
     * @return LogoAdd <p>Indicates whether to enable a logo watermark. Disabled by default. Valid values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable;</li></ul>
     */
    public String getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>Indicates whether to enable a logo watermark. Disabled by default. Valid values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable;</li></ul>
     * @param LogoAdd <p>Indicates whether to enable a logo watermark. Disabled by default. Valid values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable;</li></ul>
     */
    public void setLogoAdd(String LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    public AigcImageOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageOutputConfig(AigcImageOutputConfig source) {
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
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
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
        if (source.OutputImageCount != null) {
            this.OutputImageCount = new Long(source.OutputImageCount);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new String(source.LogoAdd);
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
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "PersonGeneration", this.PersonGeneration);
        this.setParamSimple(map, prefix + "InputComplianceCheck", this.InputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputComplianceCheck", this.OutputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputImageCount", this.OutputImageCount);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);

    }
}

