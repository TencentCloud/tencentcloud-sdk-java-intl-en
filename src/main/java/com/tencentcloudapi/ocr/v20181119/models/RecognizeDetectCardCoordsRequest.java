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

public class RecognizeDetectCardCoordsRequest extends AbstractModel {

    /**
    * The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: the downloaded image should be no more than 7M after Base64 encoding. image download time should be no more than 3 seconds. images stored in tencent cloud's urls guarantee higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after the downloaded image is encoded in Base64. image download time is not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: the downloaded image should be no more than 7M after Base64 encoding. image download time should be no more than 3 seconds. images stored in tencent cloud's urls guarantee higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted. 
     * @return ImageUrl The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: the downloaded image should be no more than 7M after Base64 encoding. image download time should be no more than 3 seconds. images stored in tencent cloud's urls guarantee higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: the downloaded image should be no more than 7M after Base64 encoding. image download time should be no more than 3 seconds. images stored in tencent cloud's urls guarantee higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
     * @param ImageUrl The Url of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: the downloaded image should be no more than 7M after Base64 encoding. image download time should be no more than 3 seconds. images stored in tencent cloud's urls guarantee higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after the downloaded image is encoded in Base64. image download time is not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl. 
     * @return ImageBase64 The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after the downloaded image is encoded in Base64. image download time is not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after the downloaded image is encoded in Base64. image download time is not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     * @param ImageBase64 The Base64 value of the image. supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. supported image size: no more than 7M after the downloaded image is encoded in Base64. image download time is not more than 3 seconds. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    public RecognizeDetectCardCoordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeDetectCardCoordsRequest(RecognizeDetectCardCoordsRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

