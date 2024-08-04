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

public class RecognizeMacaoIDCardOCRRequest extends AbstractModel {

    /**
    * The URL address of the image. 
Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M. The image download takes no more than 3 seconds.Storing images in Tencent Cloud URLs can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Base64 value of the image.Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M after Base64 encoding. The image download takes no more than 3 seconds.
One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The following optional fields are of string type and are empty by default: 
RetImage: whether to return the processed image (base64 encrypted string); the value and meaning of RetImage are as follows: 1.preprocess returns the preprocessed image data 2.portrait Return portrait image data 3."" Do not return image data SDK setting method reference: Config = Json.stringify({"RetImage":"preprocess"}) API 3.0 Explorer setting method reference: Config = {"RetImage":"portrait" }
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get The URL address of the image. 
Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M. The image download takes no more than 3 seconds.Storing images in Tencent Cloud URLs can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
     * @return ImageUrl The URL address of the image. 
Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M. The image download takes no more than 3 seconds.Storing images in Tencent Cloud URLs can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL address of the image. 
Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M. The image download takes no more than 3 seconds.Storing images in Tencent Cloud URLs can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent.
     * @param ImageUrl The URL address of the image. 
Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M. The image download takes no more than 3 seconds.Storing images in Tencent Cloud URLs can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Base64 value of the image.Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M after Base64 encoding. The image download takes no more than 3 seconds.
One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used. 
     * @return ImageBase64 Base64 value of the image.Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M after Base64 encoding. The image download takes no more than 3 seconds.
One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64 value of the image.Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M after Base64 encoding. The image download takes no more than 3 seconds.
One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     * @param ImageBase64 Base64 value of the image.Supported image formats: PNG, JPG, JPEG. Not support GIF yet.
Supported image size: The downloaded image should not exceed 7M after Base64 encoding. The image download takes no more than 3 seconds.
One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The following optional fields are of string type and are empty by default: 
RetImage: whether to return the processed image (base64 encrypted string); the value and meaning of RetImage are as follows: 1.preprocess returns the preprocessed image data 2.portrait Return portrait image data 3."" Do not return image data SDK setting method reference: Config = Json.stringify({"RetImage":"preprocess"}) API 3.0 Explorer setting method reference: Config = {"RetImage":"portrait" } 
     * @return Config The following optional fields are of string type and are empty by default: 
RetImage: whether to return the processed image (base64 encrypted string); the value and meaning of RetImage are as follows: 1.preprocess returns the preprocessed image data 2.portrait Return portrait image data 3."" Do not return image data SDK setting method reference: Config = Json.stringify({"RetImage":"preprocess"}) API 3.0 Explorer setting method reference: Config = {"RetImage":"portrait" }
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set The following optional fields are of string type and are empty by default: 
RetImage: whether to return the processed image (base64 encrypted string); the value and meaning of RetImage are as follows: 1.preprocess returns the preprocessed image data 2.portrait Return portrait image data 3."" Do not return image data SDK setting method reference: Config = Json.stringify({"RetImage":"preprocess"}) API 3.0 Explorer setting method reference: Config = {"RetImage":"portrait" }
     * @param Config The following optional fields are of string type and are empty by default: 
RetImage: whether to return the processed image (base64 encrypted string); the value and meaning of RetImage are as follows: 1.preprocess returns the preprocessed image data 2.portrait Return portrait image data 3."" Do not return image data SDK setting method reference: Config = Json.stringify({"RetImage":"preprocess"}) API 3.0 Explorer setting method reference: Config = {"RetImage":"portrait" }
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public RecognizeMacaoIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeMacaoIDCardOCRRequest(RecognizeMacaoIDCardOCRRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

