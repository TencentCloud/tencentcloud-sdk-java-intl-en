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

public class RecognizeBrazilIDCardOCRRequest extends AbstractModel {

    /**
    * Base64 value of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. Image download time does not exceed 3 seconds.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. URLs of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Base64 value of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. An ImageUrl and ImageBase64 must be provided. If both are provided, only ImageUrl will be used.
    */
    @SerializedName("BackImageBase64")
    @Expose
    private String BackImageBase64;

    /**
    * The URL address of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. The image download time does not exceed 3 seconds. The URL of the image stored in Tencent Cloud can ensure higher download speed and stability. It is recommended to store the image in Tencent Cloud. The speed and stability of the URL stored outside Tencent Cloud may be affected to a certain extent.
    */
    @SerializedName("BackImageUrl")
    @Expose
    private String BackImageUrl;

    /**
    * Whether to return portrait photos.
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
     * Get Base64 value of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. Image download time does not exceed 3 seconds. 
     * @return ImageBase64 Base64 value of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. Image download time does not exceed 3 seconds.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64 value of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. Image download time does not exceed 3 seconds.
     * @param ImageBase64 Base64 value of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. Image download time does not exceed 3 seconds.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. URLs of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent. 
     * @return ImageUrl URL address of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. URLs of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. URLs of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.
     * @param ImageUrl URL address of the image. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. URLs of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Base64 value of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. An ImageUrl and ImageBase64 must be provided. If both are provided, only ImageUrl will be used. 
     * @return BackImageBase64 Base64 value of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. An ImageUrl and ImageBase64 must be provided. If both are provided, only ImageUrl will be used.
     */
    public String getBackImageBase64() {
        return this.BackImageBase64;
    }

    /**
     * Set Base64 value of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. An ImageUrl and ImageBase64 must be provided. If both are provided, only ImageUrl will be used.
     * @param BackImageBase64 Base64 value of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image should not exceed 7M after Base64 encoding. Image download time should not exceed 3 seconds. An ImageUrl and ImageBase64 must be provided. If both are provided, only ImageUrl will be used.
     */
    public void setBackImageBase64(String BackImageBase64) {
        this.BackImageBase64 = BackImageBase64;
    }

    /**
     * Get The URL address of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. The image download time does not exceed 3 seconds. The URL of the image stored in Tencent Cloud can ensure higher download speed and stability. It is recommended to store the image in Tencent Cloud. The speed and stability of the URL stored outside Tencent Cloud may be affected to a certain extent. 
     * @return BackImageUrl The URL address of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. The image download time does not exceed 3 seconds. The URL of the image stored in Tencent Cloud can ensure higher download speed and stability. It is recommended to store the image in Tencent Cloud. The speed and stability of the URL stored outside Tencent Cloud may be affected to a certain extent.
     */
    public String getBackImageUrl() {
        return this.BackImageUrl;
    }

    /**
     * Set The URL address of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. The image download time does not exceed 3 seconds. The URL of the image stored in Tencent Cloud can ensure higher download speed and stability. It is recommended to store the image in Tencent Cloud. The speed and stability of the URL stored outside Tencent Cloud may be affected to a certain extent.
     * @param BackImageUrl The URL address of the image on the back of the card. Supported image formats: PNG, JPG, JPEG, GIF format is not supported yet. Supported image size: The downloaded image does not exceed 7M after Base64 encoding. The image download time does not exceed 3 seconds. The URL of the image stored in Tencent Cloud can ensure higher download speed and stability. It is recommended to store the image in Tencent Cloud. The speed and stability of the URL stored outside Tencent Cloud may be affected to a certain extent.
     */
    public void setBackImageUrl(String BackImageUrl) {
        this.BackImageUrl = BackImageUrl;
    }

    /**
     * Get Whether to return portrait photos. 
     * @return ReturnHeadImage Whether to return portrait photos.
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set Whether to return portrait photos.
     * @param ReturnHeadImage Whether to return portrait photos.
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    public RecognizeBrazilIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeBrazilIDCardOCRRequest(RecognizeBrazilIDCardOCRRequest source) {
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

