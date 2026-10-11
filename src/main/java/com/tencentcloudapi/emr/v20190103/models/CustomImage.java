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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomImage extends AbstractModel {

    /**
    * Image source. Valid values: tcr (public image), ccrPersonal (custom image), and ccrAllPersonal (shared image).
    */
    @SerializedName("ImageSourceType")
    @Expose
    private String ImageSourceType;

    /**
    * Image information.
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * Key used for obtaining an image.
    */
    @SerializedName("ImagePullSecret")
    @Expose
    private ImagePullSecret ImagePullSecret;

    /**
     * Get Image source. Valid values: tcr (public image), ccrPersonal (custom image), and ccrAllPersonal (shared image). 
     * @return ImageSourceType Image source. Valid values: tcr (public image), ccrPersonal (custom image), and ccrAllPersonal (shared image).
     */
    public String getImageSourceType() {
        return this.ImageSourceType;
    }

    /**
     * Set Image source. Valid values: tcr (public image), ccrPersonal (custom image), and ccrAllPersonal (shared image).
     * @param ImageSourceType Image source. Valid values: tcr (public image), ccrPersonal (custom image), and ccrAllPersonal (shared image).
     */
    public void setImageSourceType(String ImageSourceType) {
        this.ImageSourceType = ImageSourceType;
    }

    /**
     * Get Image information. 
     * @return ImageInfo Image information.
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set Image information.
     * @param ImageInfo Image information.
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get Key used for obtaining an image. 
     * @return ImagePullSecret Key used for obtaining an image.
     */
    public ImagePullSecret getImagePullSecret() {
        return this.ImagePullSecret;
    }

    /**
     * Set Key used for obtaining an image.
     * @param ImagePullSecret Key used for obtaining an image.
     */
    public void setImagePullSecret(ImagePullSecret ImagePullSecret) {
        this.ImagePullSecret = ImagePullSecret;
    }

    public CustomImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomImage(CustomImage source) {
        if (source.ImageSourceType != null) {
            this.ImageSourceType = new String(source.ImageSourceType);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.ImagePullSecret != null) {
            this.ImagePullSecret = new ImagePullSecret(source.ImagePullSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageSourceType", this.ImageSourceType);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "ImagePullSecret.", this.ImagePullSecret);

    }
}

