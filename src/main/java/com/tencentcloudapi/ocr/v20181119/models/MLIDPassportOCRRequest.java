/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MLIDPassportOCRRequest extends AbstractModel{

    /**
    * Base64-encoded value of the image. The image cannot exceed 7 MB in size after being Base64-encoded. A resolution of 500x800 or above is recommended. Supported formats include PNG, JPG, JPEG, and BMP. It is recommended that the card part occupies more than 2/3 of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Whether to return an image
    */
    @SerializedName("RetImage")
    @Expose
    private Boolean RetImage;

    /**
     * Get Base64-encoded value of the image. The image cannot exceed 7 MB in size after being Base64-encoded. A resolution of 500x800 or above is recommended. Supported formats include PNG, JPG, JPEG, and BMP. It is recommended that the card part occupies more than 2/3 of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used. 
     * @return ImageBase64 Base64-encoded value of the image. The image cannot exceed 7 MB in size after being Base64-encoded. A resolution of 500x800 or above is recommended. Supported formats include PNG, JPG, JPEG, and BMP. It is recommended that the card part occupies more than 2/3 of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64-encoded value of the image. The image cannot exceed 7 MB in size after being Base64-encoded. A resolution of 500x800 or above is recommended. Supported formats include PNG, JPG, JPEG, and BMP. It is recommended that the card part occupies more than 2/3 of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     * @param ImageBase64 Base64-encoded value of the image. The image cannot exceed 7 MB in size after being Base64-encoded. A resolution of 500x800 or above is recommended. Supported formats include PNG, JPG, JPEG, and BMP. It is recommended that the card part occupies more than 2/3 of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Whether to return an image 
     * @return RetImage Whether to return an image
     */
    public Boolean getRetImage() {
        return this.RetImage;
    }

    /**
     * Set Whether to return an image
     * @param RetImage Whether to return an image
     */
    public void setRetImage(Boolean RetImage) {
        this.RetImage = RetImage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "RetImage", this.RetImage);

    }
}
