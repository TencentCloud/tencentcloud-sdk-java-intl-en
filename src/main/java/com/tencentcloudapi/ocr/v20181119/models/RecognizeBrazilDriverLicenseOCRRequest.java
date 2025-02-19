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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeBrazilDriverLicenseOCRRequest extends AbstractModel {

    /**
    * The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
    */
    @SerializedName("BackImageBase64")
    @Expose
    private String BackImageBase64;

    /**
    * The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
    */
    @SerializedName("BackImageUrl")
    @Expose
    private String BackImageUrl;

    /**
    * Picture switch. The default is false, and the base64 encoding of the avatar photo is not returned. When set to true, the base64 encoding of the portrait photo is returned.
    */
    @SerializedName("CropPortrait")
    @Expose
    private Boolean CropPortrait;

    /**
     * Get The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used. 
     * @return ImageBase64 The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     * @param ImageBase64 The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used. 
     * @return BackImageBase64 The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public String getBackImageBase64() {
        return this.BackImageBase64;
    }

    /**
     * Set The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     * @param BackImageBase64 The Base64 value of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public void setBackImageBase64(String BackImageBase64) {
        this.BackImageBase64 = BackImageBase64;
    }

    /**
     * Get The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability. 
     * @return ImageUrl The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     * @param ImageUrl The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability. 
     * @return BackImageUrl The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     */
    public String getBackImageUrl() {
        return this.BackImageUrl;
    }

    /**
     * Set The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     * @param BackImageUrl The URL address of the image. It is required that the image after Base64 encoding should not exceed 7M, the resolution is recommended to be 500*800 or above, and PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     */
    public void setBackImageUrl(String BackImageUrl) {
        this.BackImageUrl = BackImageUrl;
    }

    /**
     * Get Picture switch. The default is false, and the base64 encoding of the avatar photo is not returned. When set to true, the base64 encoding of the portrait photo is returned. 
     * @return CropPortrait Picture switch. The default is false, and the base64 encoding of the avatar photo is not returned. When set to true, the base64 encoding of the portrait photo is returned.
     */
    public Boolean getCropPortrait() {
        return this.CropPortrait;
    }

    /**
     * Set Picture switch. The default is false, and the base64 encoding of the avatar photo is not returned. When set to true, the base64 encoding of the portrait photo is returned.
     * @param CropPortrait Picture switch. The default is false, and the base64 encoding of the avatar photo is not returned. When set to true, the base64 encoding of the portrait photo is returned.
     */
    public void setCropPortrait(Boolean CropPortrait) {
        this.CropPortrait = CropPortrait;
    }

    public RecognizeBrazilDriverLicenseOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeBrazilDriverLicenseOCRRequest(RecognizeBrazilDriverLicenseOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.BackImageBase64 != null) {
            this.BackImageBase64 = new String(source.BackImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.BackImageUrl != null) {
            this.BackImageUrl = new String(source.BackImageUrl);
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
        this.setParamSimple(map, prefix + "BackImageBase64", this.BackImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "BackImageUrl", this.BackImageUrl);
        this.setParamSimple(map, prefix + "CropPortrait", this.CropPortrait);

    }
}

