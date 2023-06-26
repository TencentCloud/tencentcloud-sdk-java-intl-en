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

public class IDCardOCRRequest extends AbstractModel{

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
    * `FRONT`: The side with the profile photo.
`BACK`: The side with the national emblem.
If this parameter is not specified, the system will automatically determine the ID card side.
    */
    @SerializedName("CardSide")
    @Expose
    private String CardSide;

    /**
    * The following parameters are all of `bool` type and default to `false`:
`CropIdCard`: Crops the ID card photo (by removing extra edges outside the ID card and automatically correcting the shooting angle).
`CropPortrait`: Crops the profile photo (by automatically cutting out the face area in the ID card).
`CopyWarn`: Warns about photocopied images.
`BorderCheckWarn`: Warns about border and frame occlusions.
`ReshootWarn`: Warns about spoofed images.
`DetectPsWarn`: Warns about photoshopped images.
`TempIdWarn`: Warns about temporary ID cards.
`InvalidDateWarn`: Warns about invalid ID card validity periods.
`Quality`: Gets the image quality score (by evaluating the blurriness of the image).
`MultiCardDetect`: Enables multi-card detection.
`ReflectWarn`: Enables glare detection.

Parameter setting method via SDK:
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
Parameter setting method via API 3.0 Explorer:
Config = {"CropIdCard":true,"CropPortrait":true}
    */
    @SerializedName("Config")
    @Expose
    private String Config;

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
     * Get `FRONT`: The side with the profile photo.
`BACK`: The side with the national emblem.
If this parameter is not specified, the system will automatically determine the ID card side. 
     * @return CardSide `FRONT`: The side with the profile photo.
`BACK`: The side with the national emblem.
If this parameter is not specified, the system will automatically determine the ID card side.
     */
    public String getCardSide() {
        return this.CardSide;
    }

    /**
     * Set `FRONT`: The side with the profile photo.
`BACK`: The side with the national emblem.
If this parameter is not specified, the system will automatically determine the ID card side.
     * @param CardSide `FRONT`: The side with the profile photo.
`BACK`: The side with the national emblem.
If this parameter is not specified, the system will automatically determine the ID card side.
     */
    public void setCardSide(String CardSide) {
        this.CardSide = CardSide;
    }

    /**
     * Get The following parameters are all of `bool` type and default to `false`:
`CropIdCard`: Crops the ID card photo (by removing extra edges outside the ID card and automatically correcting the shooting angle).
`CropPortrait`: Crops the profile photo (by automatically cutting out the face area in the ID card).
`CopyWarn`: Warns about photocopied images.
`BorderCheckWarn`: Warns about border and frame occlusions.
`ReshootWarn`: Warns about spoofed images.
`DetectPsWarn`: Warns about photoshopped images.
`TempIdWarn`: Warns about temporary ID cards.
`InvalidDateWarn`: Warns about invalid ID card validity periods.
`Quality`: Gets the image quality score (by evaluating the blurriness of the image).
`MultiCardDetect`: Enables multi-card detection.
`ReflectWarn`: Enables glare detection.

Parameter setting method via SDK:
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
Parameter setting method via API 3.0 Explorer:
Config = {"CropIdCard":true,"CropPortrait":true} 
     * @return Config The following parameters are all of `bool` type and default to `false`:
`CropIdCard`: Crops the ID card photo (by removing extra edges outside the ID card and automatically correcting the shooting angle).
`CropPortrait`: Crops the profile photo (by automatically cutting out the face area in the ID card).
`CopyWarn`: Warns about photocopied images.
`BorderCheckWarn`: Warns about border and frame occlusions.
`ReshootWarn`: Warns about spoofed images.
`DetectPsWarn`: Warns about photoshopped images.
`TempIdWarn`: Warns about temporary ID cards.
`InvalidDateWarn`: Warns about invalid ID card validity periods.
`Quality`: Gets the image quality score (by evaluating the blurriness of the image).
`MultiCardDetect`: Enables multi-card detection.
`ReflectWarn`: Enables glare detection.

Parameter setting method via SDK:
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
Parameter setting method via API 3.0 Explorer:
Config = {"CropIdCard":true,"CropPortrait":true}
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set The following parameters are all of `bool` type and default to `false`:
`CropIdCard`: Crops the ID card photo (by removing extra edges outside the ID card and automatically correcting the shooting angle).
`CropPortrait`: Crops the profile photo (by automatically cutting out the face area in the ID card).
`CopyWarn`: Warns about photocopied images.
`BorderCheckWarn`: Warns about border and frame occlusions.
`ReshootWarn`: Warns about spoofed images.
`DetectPsWarn`: Warns about photoshopped images.
`TempIdWarn`: Warns about temporary ID cards.
`InvalidDateWarn`: Warns about invalid ID card validity periods.
`Quality`: Gets the image quality score (by evaluating the blurriness of the image).
`MultiCardDetect`: Enables multi-card detection.
`ReflectWarn`: Enables glare detection.

Parameter setting method via SDK:
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
Parameter setting method via API 3.0 Explorer:
Config = {"CropIdCard":true,"CropPortrait":true}
     * @param Config The following parameters are all of `bool` type and default to `false`:
`CropIdCard`: Crops the ID card photo (by removing extra edges outside the ID card and automatically correcting the shooting angle).
`CropPortrait`: Crops the profile photo (by automatically cutting out the face area in the ID card).
`CopyWarn`: Warns about photocopied images.
`BorderCheckWarn`: Warns about border and frame occlusions.
`ReshootWarn`: Warns about spoofed images.
`DetectPsWarn`: Warns about photoshopped images.
`TempIdWarn`: Warns about temporary ID cards.
`InvalidDateWarn`: Warns about invalid ID card validity periods.
`Quality`: Gets the image quality score (by evaluating the blurriness of the image).
`MultiCardDetect`: Enables multi-card detection.
`ReflectWarn`: Enables glare detection.

Parameter setting method via SDK:
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
Parameter setting method via API 3.0 Explorer:
Config = {"CropIdCard":true,"CropPortrait":true}
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public IDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IDCardOCRRequest(IDCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CardSide != null) {
            this.CardSide = new String(source.CardSide);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CardSide", this.CardSide);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

