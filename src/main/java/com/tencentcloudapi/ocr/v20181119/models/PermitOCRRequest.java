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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermitOCRRequest extends AbstractModel {

    /**
    * The Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is not more than 3 seconds. Either ImageUrl or ImageBase64 must be provided. If both are provided, only use ImageUrl.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The URL of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time: no more than 3 seconds. We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Whether to return the avatar image. Default is false.
    */
    @SerializedName("CropPortrait")
    @Expose
    private Boolean CropPortrait;

    /**
     * Get The Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is not more than 3 seconds. Either ImageUrl or ImageBase64 must be provided. If both are provided, only use ImageUrl. 
     * @return ImageBase64 The Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is not more than 3 seconds. Either ImageUrl or ImageBase64 must be provided. If both are provided, only use ImageUrl.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is not more than 3 seconds. Either ImageUrl or ImageBase64 must be provided. If both are provided, only use ImageUrl.
     * @param ImageBase64 The Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is not more than 3 seconds. Either ImageUrl or ImageBase64 must be provided. If both are provided, only use ImageUrl.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The URL of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time: no more than 3 seconds. We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl The URL of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time: no more than 3 seconds. We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time: no more than 3 seconds. We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl The URL of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time: no more than 3 seconds. We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Whether to return the avatar image. Default is false. 
     * @return CropPortrait Whether to return the avatar image. Default is false.
     */
    public Boolean getCropPortrait() {
        return this.CropPortrait;
    }

    /**
     * Set Whether to return the avatar image. Default is false.
     * @param CropPortrait Whether to return the avatar image. Default is false.
     */
    public void setCropPortrait(Boolean CropPortrait) {
        this.CropPortrait = CropPortrait;
    }

    public PermitOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermitOCRRequest(PermitOCRRequest source) {
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

