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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchGetVideoSnapshotImageUrlData extends AbstractModel {

    /**
    * <p>Image Url information</p>
    */
    @SerializedName("Images")
    @Expose
    private ImageUrlInfo [] Images;

    /**
    * <p>Valid period of the image Url</p><p>Unit: seconds</p><p>Default value: 600</p>
    */
    @SerializedName("ImageUrlExpires")
    @Expose
    private Long ImageUrlExpires;

    /**
     * Get <p>Image Url information</p> 
     * @return Images <p>Image Url information</p>
     */
    public ImageUrlInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>Image Url information</p>
     * @param Images <p>Image Url information</p>
     */
    public void setImages(ImageUrlInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Valid period of the image Url</p><p>Unit: seconds</p><p>Default value: 600</p> 
     * @return ImageUrlExpires <p>Valid period of the image Url</p><p>Unit: seconds</p><p>Default value: 600</p>
     */
    public Long getImageUrlExpires() {
        return this.ImageUrlExpires;
    }

    /**
     * Set <p>Valid period of the image Url</p><p>Unit: seconds</p><p>Default value: 600</p>
     * @param ImageUrlExpires <p>Valid period of the image Url</p><p>Unit: seconds</p><p>Default value: 600</p>
     */
    public void setImageUrlExpires(Long ImageUrlExpires) {
        this.ImageUrlExpires = ImageUrlExpires;
    }

    public BatchGetVideoSnapshotImageUrlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchGetVideoSnapshotImageUrlData(BatchGetVideoSnapshotImageUrlData source) {
        if (source.Images != null) {
            this.Images = new ImageUrlInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageUrlInfo(source.Images[i]);
            }
        }
        if (source.ImageUrlExpires != null) {
            this.ImageUrlExpires = new Long(source.ImageUrlExpires);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ImageUrlExpires", this.ImageUrlExpires);

    }
}

