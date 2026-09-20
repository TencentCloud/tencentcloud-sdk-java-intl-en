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

public class ElementReferInfo extends AbstractModel {

    /**
    * Reference image URLs of the subject from different perspectives.
Image format: .jpg, .jpeg, and .png are supported.
Image file size must not exceed 10 MB. Image width and height must not be less than 300 px. Image aspect ratio must be between 1:2.5 and 2.5:1.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get Reference image URLs of the subject from different perspectives.
Image format: .jpg, .jpeg, and .png are supported.
Image file size must not exceed 10 MB. Image width and height must not be less than 300 px. Image aspect ratio must be between 1:2.5 and 2.5:1. 
     * @return ImageUrl Reference image URLs of the subject from different perspectives.
Image format: .jpg, .jpeg, and .png are supported.
Image file size must not exceed 10 MB. Image width and height must not be less than 300 px. Image aspect ratio must be between 1:2.5 and 2.5:1.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Reference image URLs of the subject from different perspectives.
Image format: .jpg, .jpeg, and .png are supported.
Image file size must not exceed 10 MB. Image width and height must not be less than 300 px. Image aspect ratio must be between 1:2.5 and 2.5:1.
     * @param ImageUrl Reference image URLs of the subject from different perspectives.
Image format: .jpg, .jpeg, and .png are supported.
Image file size must not exceed 10 MB. Image width and height must not be less than 300 px. Image aspect ratio must be between 1:2.5 and 2.5:1.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public ElementReferInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementReferInfo(ElementReferInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

