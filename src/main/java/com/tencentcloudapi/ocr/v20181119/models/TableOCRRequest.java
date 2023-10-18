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

public class TableOCRRequest extends AbstractModel {

    /**
    * Base64-encoded value of image.
Supported image formats: PNG, JPG, JPEG. GIF is not supported at present.
Supported image size: the downloaded image cannot exceed 3 MB in size after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 3 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get Base64-encoded value of image.
Supported image formats: PNG, JPG, JPEG. GIF is not supported at present.
Supported image size: the downloaded image cannot exceed 3 MB in size after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used. 
     * @return ImageBase64 Base64-encoded value of image.
Supported image formats: PNG, JPG, JPEG. GIF is not supported at present.
Supported image size: the downloaded image cannot exceed 3 MB in size after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64-encoded value of image.
Supported image formats: PNG, JPG, JPEG. GIF is not supported at present.
Supported image size: the downloaded image cannot exceed 3 MB in size after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     * @param ImageBase64 Base64-encoded value of image.
Supported image formats: PNG, JPG, JPEG. GIF is not supported at present.
Supported image size: the downloaded image cannot exceed 3 MB in size after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 3 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 3 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 3 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl URL address of image. (This field is not supported outside Chinese mainland)
Supported image formats: PNG, JPG, JPEG. GIF is currently not supported.
Supported image size: the downloaded image cannot exceed 3 MB after being Base64-encoded. The download time of the image cannot exceed 3 seconds.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public TableOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableOCRRequest(TableOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

