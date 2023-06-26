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

public class RecognizeThaiIDCardOCRRequest extends AbstractModel{

    /**
    * The Base64-encoded value of an image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, `ImageUrl` is used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The URL of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Whether to crop the profile photo. The default value is `false`, meaning not to return the Base64-encoded value of the profile photo on the Thai identity card.
When this parameter is set to `true`, the Base64-encoded value of the profile photo on the Thai identity card after rotation correction is returned.
    */
    @SerializedName("CropPortrait")
    @Expose
    private Boolean CropPortrait;

    /**
     * Get The Base64-encoded value of an image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, `ImageUrl` is used. 
     * @return ImageBase64 The Base64-encoded value of an image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, `ImageUrl` is used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64-encoded value of an image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, `ImageUrl` is used.
     * @param ImageBase64 The Base64-encoded value of an image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, `ImageUrl` is used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The URL of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
We recommend that you store the image in Tencent Cloud for higher download speed and stability. 
     * @return ImageUrl The URL of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
     * @param ImageUrl The URL of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Whether to crop the profile photo. The default value is `false`, meaning not to return the Base64-encoded value of the profile photo on the Thai identity card.
When this parameter is set to `true`, the Base64-encoded value of the profile photo on the Thai identity card after rotation correction is returned. 
     * @return CropPortrait Whether to crop the profile photo. The default value is `false`, meaning not to return the Base64-encoded value of the profile photo on the Thai identity card.
When this parameter is set to `true`, the Base64-encoded value of the profile photo on the Thai identity card after rotation correction is returned.
     */
    public Boolean getCropPortrait() {
        return this.CropPortrait;
    }

    /**
     * Set Whether to crop the profile photo. The default value is `false`, meaning not to return the Base64-encoded value of the profile photo on the Thai identity card.
When this parameter is set to `true`, the Base64-encoded value of the profile photo on the Thai identity card after rotation correction is returned.
     * @param CropPortrait Whether to crop the profile photo. The default value is `false`, meaning not to return the Base64-encoded value of the profile photo on the Thai identity card.
When this parameter is set to `true`, the Base64-encoded value of the profile photo on the Thai identity card after rotation correction is returned.
     */
    public void setCropPortrait(Boolean CropPortrait) {
        this.CropPortrait = CropPortrait;
    }

    public RecognizeThaiIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeThaiIDCardOCRRequest(RecognizeThaiIDCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CropPortrait != null) {
            this.CropPortrait = new Boolean(source.CropPortrait);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CropPortrait", this.CropPortrait);

    }
}

