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
    * <p>Storage mode</p><p>Enumeration value:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain the temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>Output filename, up to 64 characters. Default filename is specified by the system.</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/7812">create category</a> API.</p><li>Default value: 0, indicating other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Specify the aspect ratio of the generated image. The input format is W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9.</li><li>AI image expansion scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>When only AspectRatio is specified, adaptively adjust based on the original image input.</li><li>When AspectRatio and ImageWidth are specified, ImageHeight is calculated based on both, and vice versa.</li><li>When AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, prioritize using ImageWidth and ImageHeight.</li></ol></li></ul>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Output image encoding format parameters. <strong>Valid only for AI clothing change scenarios.</strong></p>
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageSceneAigcEncodeConfig EncodeConfig;

    /**
    * <p>Output image width. <strong>Valid only for AI image expansion scenarios.</strong></p>
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * <p>Output image height, <strong>valid only for AI image expansion scenarios</strong>.</p>
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * <p>Output resolution. Only valid for change_clothes and change_clothes_under scenarios. Available values: 1K, 2K, 4K.</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>Storage mode</p><p>Enumeration value:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain the temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p> 
     * @return StorageMode <p>Storage mode</p><p>Enumeration value:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain the temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>Storage mode</p><p>Enumeration value:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain the temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
     * @param StorageMode <p>Storage mode</p><p>Enumeration value:</p><ul><li>Temporary: Temporary storage. The generated video file will not be stored in VOD. You can obtain the temporary access URL from the event notification, with a valid period of 7 days.</li><li>Permanent: Permanent storage. The generated video file will be stored in VOD. You can obtain the FileId from the event notification.</li></ul><p>Default value: Temporary</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>Output filename, up to 64 characters. Default filename is specified by the system.</p> 
     * @return MediaName <p>Output filename, up to 64 characters. Default filename is specified by the system.</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>Output filename, up to 64 characters. Default filename is specified by the system.</p>
     * @param MediaName <p>Output filename, up to 64 characters. Default filename is specified by the system.</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/7812">create category</a> API.</p><li>Default value: 0, indicating other categories.</li> 
     * @return ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/7812">create category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/7812">create category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     * @param ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/7812">create category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return ExpireTime <p>Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param ExpireTime <p>Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Specify the aspect ratio of the generated image. The input format is W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9.</li><li>AI image expansion scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>When only AspectRatio is specified, adaptively adjust based on the original image input.</li><li>When AspectRatio and ImageWidth are specified, ImageHeight is calculated based on both, and vice versa.</li><li>When AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, prioritize using ImageWidth and ImageHeight.</li></ol></li></ul> 
     * @return AspectRatio <p>Specify the aspect ratio of the generated image. The input format is W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9.</li><li>AI image expansion scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>When only AspectRatio is specified, adaptively adjust based on the original image input.</li><li>When AspectRatio and ImageWidth are specified, ImageHeight is calculated based on both, and vice versa.</li><li>When AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, prioritize using ImageWidth and ImageHeight.</li></ol></li></ul>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Specify the aspect ratio of the generated image. The input format is W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9.</li><li>AI image expansion scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>When only AspectRatio is specified, adaptively adjust based on the original image input.</li><li>When AspectRatio and ImageWidth are specified, ImageHeight is calculated based on both, and vice versa.</li><li>When AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, prioritize using ImageWidth and ImageHeight.</li></ol></li></ul>
     * @param AspectRatio <p>Specify the aspect ratio of the generated image. The input format is W:H.<br>This field is valid in the following scenarios:</p><ul><li>Product image generation scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 16:9, 9:16, 21:9.</li><li>AI image expansion scenario. Available values are: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, 21:9. It can be used in conjunction with ImageWidth and ImageHeight. The rules are as follows: <ol><li>When only AspectRatio is specified, adaptively adjust based on the original image input.</li><li>When AspectRatio and ImageWidth are specified, ImageHeight is calculated based on both, and vice versa.</li><li>When AspectRatio, ImageWidth, and ImageHeight are specified simultaneously, prioritize using ImageWidth and ImageHeight.</li></ol></li></ul>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>Output image encoding format parameters. <strong>Valid only for AI clothing change scenarios.</strong></p> 
     * @return EncodeConfig <p>Output image encoding format parameters. <strong>Valid only for AI clothing change scenarios.</strong></p>
     */
    public ImageSceneAigcEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>Output image encoding format parameters. <strong>Valid only for AI clothing change scenarios.</strong></p>
     * @param EncodeConfig <p>Output image encoding format parameters. <strong>Valid only for AI clothing change scenarios.</strong></p>
     */
    public void setEncodeConfig(ImageSceneAigcEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>Output image width. <strong>Valid only for AI image expansion scenarios.</strong></p> 
     * @return ImageWidth <p>Output image width. <strong>Valid only for AI image expansion scenarios.</strong></p>
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set <p>Output image width. <strong>Valid only for AI image expansion scenarios.</strong></p>
     * @param ImageWidth <p>Output image width. <strong>Valid only for AI image expansion scenarios.</strong></p>
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get <p>Output image height, <strong>valid only for AI image expansion scenarios</strong>.</p> 
     * @return ImageHeight <p>Output image height, <strong>valid only for AI image expansion scenarios</strong>.</p>
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set <p>Output image height, <strong>valid only for AI image expansion scenarios</strong>.</p>
     * @param ImageHeight <p>Output image height, <strong>valid only for AI image expansion scenarios</strong>.</p>
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get <p>Output resolution. Only valid for change_clothes and change_clothes_under scenarios. Available values: 1K, 2K, 4K.</p> 
     * @return Resolution <p>Output resolution. Only valid for change_clothes and change_clothes_under scenarios. Available values: 1K, 2K, 4K.</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Output resolution. Only valid for change_clothes and change_clothes_under scenarios. Available values: 1K, 2K, 4K.</p>
     * @param Resolution <p>Output resolution. Only valid for change_clothes and change_clothes_under scenarios. Available values: 1K, 2K, 4K.</p>
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

