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

public class BankCardOCRRequest extends AbstractModel {

    /**
    * Base64-encoded value of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 7 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Whether to return the bank card image data after preprocessing (precise cropping and alignment). Default value: `false`
    */
    @SerializedName("RetBorderCutImage")
    @Expose
    private Boolean RetBorderCutImage;

    /**
    * Whether to return the card number image data after slicing. Default value: `false`
    */
    @SerializedName("RetCardNoImage")
    @Expose
    private Boolean RetCardNoImage;

    /**
    * Whether to enable photocopy check. If the input image is a bank card photocopy, an alarm will be returned. Default value: `false`
    */
    @SerializedName("EnableCopyCheck")
    @Expose
    private Boolean EnableCopyCheck;

    /**
    * Whether to enable photograph check. If the input image is a bank card photograph, an alarm will be returned. Default value: `false`
    */
    @SerializedName("EnableReshootCheck")
    @Expose
    private Boolean EnableReshootCheck;

    /**
    * Whether to enable obscured border check. If the input image is a bank card with obscured border, an alarm will be returned. Default value: `false`
    */
    @SerializedName("EnableBorderCheck")
    @Expose
    private Boolean EnableBorderCheck;

    /**
    * Whether to return the image quality value, which measures how clear an image is. Default value: `false`
    */
    @SerializedName("EnableQualityValue")
    @Expose
    private Boolean EnableQualityValue;

    /**
     * Get Base64-encoded value of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` will be used. 
     * @return ImageBase64 Base64-encoded value of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64-encoded value of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` will be used.
     * @param ImageBase64 Base64-encoded value of the image. The image cannot exceed 7 MB after being Base64-encoded. A resolution above 500 x 800 is recommended. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupy more than 2/3 area of the image.
Either the `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 7 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 7 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 7 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 7 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Whether to return the bank card image data after preprocessing (precise cropping and alignment). Default value: `false` 
     * @return RetBorderCutImage Whether to return the bank card image data after preprocessing (precise cropping and alignment). Default value: `false`
     */
    public Boolean getRetBorderCutImage() {
        return this.RetBorderCutImage;
    }

    /**
     * Set Whether to return the bank card image data after preprocessing (precise cropping and alignment). Default value: `false`
     * @param RetBorderCutImage Whether to return the bank card image data after preprocessing (precise cropping and alignment). Default value: `false`
     */
    public void setRetBorderCutImage(Boolean RetBorderCutImage) {
        this.RetBorderCutImage = RetBorderCutImage;
    }

    /**
     * Get Whether to return the card number image data after slicing. Default value: `false` 
     * @return RetCardNoImage Whether to return the card number image data after slicing. Default value: `false`
     */
    public Boolean getRetCardNoImage() {
        return this.RetCardNoImage;
    }

    /**
     * Set Whether to return the card number image data after slicing. Default value: `false`
     * @param RetCardNoImage Whether to return the card number image data after slicing. Default value: `false`
     */
    public void setRetCardNoImage(Boolean RetCardNoImage) {
        this.RetCardNoImage = RetCardNoImage;
    }

    /**
     * Get Whether to enable photocopy check. If the input image is a bank card photocopy, an alarm will be returned. Default value: `false` 
     * @return EnableCopyCheck Whether to enable photocopy check. If the input image is a bank card photocopy, an alarm will be returned. Default value: `false`
     */
    public Boolean getEnableCopyCheck() {
        return this.EnableCopyCheck;
    }

    /**
     * Set Whether to enable photocopy check. If the input image is a bank card photocopy, an alarm will be returned. Default value: `false`
     * @param EnableCopyCheck Whether to enable photocopy check. If the input image is a bank card photocopy, an alarm will be returned. Default value: `false`
     */
    public void setEnableCopyCheck(Boolean EnableCopyCheck) {
        this.EnableCopyCheck = EnableCopyCheck;
    }

    /**
     * Get Whether to enable photograph check. If the input image is a bank card photograph, an alarm will be returned. Default value: `false` 
     * @return EnableReshootCheck Whether to enable photograph check. If the input image is a bank card photograph, an alarm will be returned. Default value: `false`
     */
    public Boolean getEnableReshootCheck() {
        return this.EnableReshootCheck;
    }

    /**
     * Set Whether to enable photograph check. If the input image is a bank card photograph, an alarm will be returned. Default value: `false`
     * @param EnableReshootCheck Whether to enable photograph check. If the input image is a bank card photograph, an alarm will be returned. Default value: `false`
     */
    public void setEnableReshootCheck(Boolean EnableReshootCheck) {
        this.EnableReshootCheck = EnableReshootCheck;
    }

    /**
     * Get Whether to enable obscured border check. If the input image is a bank card with obscured border, an alarm will be returned. Default value: `false` 
     * @return EnableBorderCheck Whether to enable obscured border check. If the input image is a bank card with obscured border, an alarm will be returned. Default value: `false`
     */
    public Boolean getEnableBorderCheck() {
        return this.EnableBorderCheck;
    }

    /**
     * Set Whether to enable obscured border check. If the input image is a bank card with obscured border, an alarm will be returned. Default value: `false`
     * @param EnableBorderCheck Whether to enable obscured border check. If the input image is a bank card with obscured border, an alarm will be returned. Default value: `false`
     */
    public void setEnableBorderCheck(Boolean EnableBorderCheck) {
        this.EnableBorderCheck = EnableBorderCheck;
    }

    /**
     * Get Whether to return the image quality value, which measures how clear an image is. Default value: `false` 
     * @return EnableQualityValue Whether to return the image quality value, which measures how clear an image is. Default value: `false`
     */
    public Boolean getEnableQualityValue() {
        return this.EnableQualityValue;
    }

    /**
     * Set Whether to return the image quality value, which measures how clear an image is. Default value: `false`
     * @param EnableQualityValue Whether to return the image quality value, which measures how clear an image is. Default value: `false`
     */
    public void setEnableQualityValue(Boolean EnableQualityValue) {
        this.EnableQualityValue = EnableQualityValue;
    }

    public BankCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankCardOCRRequest(BankCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.RetBorderCutImage != null) {
            this.RetBorderCutImage = new Boolean(source.RetBorderCutImage);
        }
        if (source.RetCardNoImage != null) {
            this.RetCardNoImage = new Boolean(source.RetCardNoImage);
        }
        if (source.EnableCopyCheck != null) {
            this.EnableCopyCheck = new Boolean(source.EnableCopyCheck);
        }
        if (source.EnableReshootCheck != null) {
            this.EnableReshootCheck = new Boolean(source.EnableReshootCheck);
        }
        if (source.EnableBorderCheck != null) {
            this.EnableBorderCheck = new Boolean(source.EnableBorderCheck);
        }
        if (source.EnableQualityValue != null) {
            this.EnableQualityValue = new Boolean(source.EnableQualityValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RetBorderCutImage", this.RetBorderCutImage);
        this.setParamSimple(map, prefix + "RetCardNoImage", this.RetCardNoImage);
        this.setParamSimple(map, prefix + "EnableCopyCheck", this.EnableCopyCheck);
        this.setParamSimple(map, prefix + "EnableReshootCheck", this.EnableReshootCheck);
        this.setParamSimple(map, prefix + "EnableBorderCheck", this.EnableBorderCheck);
        this.setParamSimple(map, prefix + "EnableQualityValue", this.EnableQualityValue);

    }
}

