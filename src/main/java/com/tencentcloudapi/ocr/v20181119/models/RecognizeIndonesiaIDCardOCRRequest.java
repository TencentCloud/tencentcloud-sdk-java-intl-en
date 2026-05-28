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

public class RecognizeIndonesiaIDCardOCRRequest extends AbstractModel {

    /**
    * The Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is not more than 3 seconds. Either ImageUrl or ImageBase64 must be provided. If both are provided, only use ImageUrl.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The Url address of the image. 
Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. 
Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is no more than 3 seconds. 
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
For a non-Tencent Cloud URL, the download speed and stability may be affected.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Whether to return the portrait photo.
If selected true, image restrictions are: Image size after encoding must not exceed 5M, jpg format long side pixel cannot exceed 4000, other formats image long edge pixel maximum of 2000. Short side pixel of all format images not less than 64.
Support PNG, jpg, JPEG, BMP, no support for GIF images.
If portrait matting fails, return an empty string.
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
    * Scene parameter, default value is V1
Available values:
V1
V2
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

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
     * Get The Url address of the image. 
Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. 
Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is no more than 3 seconds. 
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
For a non-Tencent Cloud URL, the download speed and stability may be affected. 
     * @return ImageUrl The Url address of the image. 
Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. 
Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is no more than 3 seconds. 
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
For a non-Tencent Cloud URL, the download speed and stability may be affected.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The Url address of the image. 
Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. 
Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is no more than 3 seconds. 
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
For a non-Tencent Cloud URL, the download speed and stability may be affected.
     * @param ImageUrl The Url address of the image. 
Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. 
Supported image size: the downloaded image after Base64 encoding is no more than 7M. Image download time is no more than 3 seconds. 
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
For a non-Tencent Cloud URL, the download speed and stability may be affected.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Whether to return the portrait photo.
If selected true, image restrictions are: Image size after encoding must not exceed 5M, jpg format long side pixel cannot exceed 4000, other formats image long edge pixel maximum of 2000. Short side pixel of all format images not less than 64.
Support PNG, jpg, JPEG, BMP, no support for GIF images.
If portrait matting fails, return an empty string. 
     * @return ReturnHeadImage Whether to return the portrait photo.
If selected true, image restrictions are: Image size after encoding must not exceed 5M, jpg format long side pixel cannot exceed 4000, other formats image long edge pixel maximum of 2000. Short side pixel of all format images not less than 64.
Support PNG, jpg, JPEG, BMP, no support for GIF images.
If portrait matting fails, return an empty string.
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set Whether to return the portrait photo.
If selected true, image restrictions are: Image size after encoding must not exceed 5M, jpg format long side pixel cannot exceed 4000, other formats image long edge pixel maximum of 2000. Short side pixel of all format images not less than 64.
Support PNG, jpg, JPEG, BMP, no support for GIF images.
If portrait matting fails, return an empty string.
     * @param ReturnHeadImage Whether to return the portrait photo.
If selected true, image restrictions are: Image size after encoding must not exceed 5M, jpg format long side pixel cannot exceed 4000, other formats image long edge pixel maximum of 2000. Short side pixel of all format images not less than 64.
Support PNG, jpg, JPEG, BMP, no support for GIF images.
If portrait matting fails, return an empty string.
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    /**
     * Get Scene parameter, default value is V1
Available values:
V1
V2 
     * @return Scene Scene parameter, default value is V1
Available values:
V1
V2
     * @deprecated
     */
    @Deprecated
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Scene parameter, default value is V1
Available values:
V1
V2
     * @param Scene Scene parameter, default value is V1
Available values:
V1
V2
     * @deprecated
     */
    @Deprecated
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    public RecognizeIndonesiaIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeIndonesiaIDCardOCRRequest(RecognizeIndonesiaIDCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

