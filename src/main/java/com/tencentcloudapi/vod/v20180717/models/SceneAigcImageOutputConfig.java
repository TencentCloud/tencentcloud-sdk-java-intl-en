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

public class SceneAigcImageOutputConfig extends AbstractModel {

    /**
    * <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, valid for 7 days.</li><li>Permanent: retained permanently. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
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
    * <p>Category ID, used to categorize and manage media. You can create a category through the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Specify the aspect ratio of the generated image. Input format: W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9</li><li>AI image expansion. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>If only AspectRatio is specified, it is adaptively adjusted based on the original image.</li><li>If AspectRatio and ImageWidth are specified, ImageHeight is calculated from both, and vice versa.</li><li>If AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, ImageWidth and ImageHeight are prioritized.</li></ol></li></ul>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Output image encoding format parameters.</p>
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageSceneAigcEncodeConfig EncodeConfig;

    /**
    * <p>Output image width. <strong>Only valid for AI image expansion scenarios</strong>.</p>
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * <p>Output image height. <strong>Valid only in AI expansion scenarios</strong>.</p>
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * <p>Output resolution. Only valid for the <code>ai_try_on</code> scenario. Available values: 1K, 2K, 4K.</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, valid for 7 days.</li><li>Permanent: retained permanently. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p> 
     * @return StorageMode <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, valid for 7 days.</li><li>Permanent: retained permanently. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, valid for 7 days.</li><li>Permanent: retained permanently. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
     * @param StorageMode <p>Storage mode</p><p>Enumeration values:</p><ul><li>Temporary: temporary storage. The generated video file will not be stored in VOD. You can obtain a temporary access URL in the event notification, valid for 7 days.</li><li>Permanent: retained permanently. The generated video file will be stored in VOD. You can obtain the FileId in the event notification.</li></ul><p>Default value: Temporary</p>
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
     * Get <p>Category ID, used to categorize and manage media. You can create a category through the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li> 
     * @return ClassId <p>Category ID, used to categorize and manage media. You can create a category through the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Category ID, used to categorize and manage media. You can create a category through the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
     * @param ClassId <p>Category ID, used to categorize and manage media. You can create a category through the <a href="/document/product/266/7812">Create Category</a> API to obtain the category ID.</p><li>Default value: 0, indicating other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return ExpireTime <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param ExpireTime <p>Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Specify the aspect ratio of the generated image. Input format: W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9</li><li>AI image expansion. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>If only AspectRatio is specified, it is adaptively adjusted based on the original image.</li><li>If AspectRatio and ImageWidth are specified, ImageHeight is calculated from both, and vice versa.</li><li>If AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, ImageWidth and ImageHeight are prioritized.</li></ol></li></ul> 
     * @return AspectRatio <p>Specify the aspect ratio of the generated image. Input format: W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9</li><li>AI image expansion. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>If only AspectRatio is specified, it is adaptively adjusted based on the original image.</li><li>If AspectRatio and ImageWidth are specified, ImageHeight is calculated from both, and vice versa.</li><li>If AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, ImageWidth and ImageHeight are prioritized.</li></ol></li></ul>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Specify the aspect ratio of the generated image. Input format: W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9</li><li>AI image expansion. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>If only AspectRatio is specified, it is adaptively adjusted based on the original image.</li><li>If AspectRatio and ImageWidth are specified, ImageHeight is calculated from both, and vice versa.</li><li>If AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, ImageWidth and ImageHeight are prioritized.</li></ol></li></ul>
     * @param AspectRatio <p>Specify the aspect ratio of the generated image. Input format: W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9</li><li>AI image expansion. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>If only AspectRatio is specified, it is adaptively adjusted based on the original image.</li><li>If AspectRatio and ImageWidth are specified, ImageHeight is calculated from both, and vice versa.</li><li>If AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, ImageWidth and ImageHeight are prioritized.</li></ol></li></ul>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>Output image encoding format parameters.</p> 
     * @return EncodeConfig <p>Output image encoding format parameters.</p>
     */
    public ImageSceneAigcEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>Output image encoding format parameters.</p>
     * @param EncodeConfig <p>Output image encoding format parameters.</p>
     */
    public void setEncodeConfig(ImageSceneAigcEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>Output image width. <strong>Only valid for AI image expansion scenarios</strong>.</p> 
     * @return ImageWidth <p>Output image width. <strong>Only valid for AI image expansion scenarios</strong>.</p>
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set <p>Output image width. <strong>Only valid for AI image expansion scenarios</strong>.</p>
     * @param ImageWidth <p>Output image width. <strong>Only valid for AI image expansion scenarios</strong>.</p>
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get <p>Output image height. <strong>Valid only in AI expansion scenarios</strong>.</p> 
     * @return ImageHeight <p>Output image height. <strong>Valid only in AI expansion scenarios</strong>.</p>
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set <p>Output image height. <strong>Valid only in AI expansion scenarios</strong>.</p>
     * @param ImageHeight <p>Output image height. <strong>Valid only in AI expansion scenarios</strong>.</p>
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get <p>Output resolution. Only valid for the <code>ai_try_on</code> scenario. Available values: 1K, 2K, 4K.</p> 
     * @return Resolution <p>Output resolution. Only valid for the <code>ai_try_on</code> scenario. Available values: 1K, 2K, 4K.</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Output resolution. Only valid for the <code>ai_try_on</code> scenario. Available values: 1K, 2K, 4K.</p>
     * @param Resolution <p>Output resolution. Only valid for the <code>ai_try_on</code> scenario. Available values: 1K, 2K, 4K.</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public SceneAigcImageOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageOutputConfig(SceneAigcImageOutputConfig source) {
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
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageSceneAigcEncodeConfig(source.EncodeConfig);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
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
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

