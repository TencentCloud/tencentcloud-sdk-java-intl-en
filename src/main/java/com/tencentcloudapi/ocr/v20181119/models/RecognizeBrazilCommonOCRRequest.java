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

public class RecognizeBrazilCommonOCRRequest extends AbstractModel {

    /**
    * The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: no more than 3 seconds.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is advisable to store images in tencent cloud. urls not stored in tencent cloud may possibly be impacted in speed and stability.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The Base64 value of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
    */
    @SerializedName("BackImageBase64")
    @Expose
    private String BackImageBase64;

    /**
    * The Url address of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is recommended to store images in tencent cloud. speed and stability of non-tencent cloud storage urls may be impacted.
    */
    @SerializedName("BackImageUrl")
    @Expose
    private String BackImageUrl;

    /**
    * Specifies whether to return the portrait photo.
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
     * Get The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: no more than 3 seconds. 
     * @return ImageBase64 The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: no more than 3 seconds.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: no more than 3 seconds.
     * @param ImageBase64 The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: no more than 3 seconds.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is advisable to store images in tencent cloud. urls not stored in tencent cloud may possibly be impacted in speed and stability. 
     * @return ImageUrl The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is advisable to store images in tencent cloud. urls not stored in tencent cloud may possibly be impacted in speed and stability.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is advisable to store images in tencent cloud. urls not stored in tencent cloud may possibly be impacted in speed and stability.
     * @param ImageUrl The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is advisable to store images in tencent cloud. urls not stored in tencent cloud may possibly be impacted in speed and stability.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The Base64 value of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl. 
     * @return BackImageBase64 The Base64 value of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     */
    public String getBackImageBase64() {
        return this.BackImageBase64;
    }

    /**
     * Set The Base64 value of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     * @param BackImageBase64 The Base64 value of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after encoding. image download time: not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     */
    public void setBackImageBase64(String BackImageBase64) {
        this.BackImageBase64 = BackImageBase64;
    }

    /**
     * Get The Url address of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is recommended to store images in tencent cloud. speed and stability of non-tencent cloud storage urls may be impacted. 
     * @return BackImageUrl The Url address of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is recommended to store images in tencent cloud. speed and stability of non-tencent cloud storage urls may be impacted.
     */
    public String getBackImageUrl() {
        return this.BackImageUrl;
    }

    /**
     * Set The Url address of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is recommended to store images in tencent cloud. speed and stability of non-tencent cloud storage urls may be impacted.
     * @param BackImageUrl The Url address of the back side of the card. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after Base64 encoding. image download time is no more than 3 seconds. urls stored in tencent cloud guarantee higher download speed and stability. it is recommended to store images in tencent cloud. speed and stability of non-tencent cloud storage urls may be impacted.
     */
    public void setBackImageUrl(String BackImageUrl) {
        this.BackImageUrl = BackImageUrl;
    }

    /**
     * Get Specifies whether to return the portrait photo. 
     * @return ReturnHeadImage Specifies whether to return the portrait photo.
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set Specifies whether to return the portrait photo.
     * @param ReturnHeadImage Specifies whether to return the portrait photo.
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    public RecognizeBrazilCommonOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeBrazilCommonOCRRequest(RecognizeBrazilCommonOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.BackImageBase64 != null) {
            this.BackImageBase64 = new String(source.BackImageBase64);
        }
        if (source.BackImageUrl != null) {
            this.BackImageUrl = new String(source.BackImageUrl);
        }
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "BackImageBase64", this.BackImageBase64);
        this.setParamSimple(map, prefix + "BackImageUrl", this.BackImageUrl);
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);

    }
}

