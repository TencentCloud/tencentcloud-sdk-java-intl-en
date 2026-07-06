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
    * URL of the image. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The downloaded image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. Images stored in Tencent Cloud offer higher download speed and stability. We recommend storing images in Tencent Cloud. The speed and stability of URLs from non-Tencent Cloud storage may be affected.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Base64-encoded image data. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. You must provide either ImageUrl or ImageBase64. If both are provided, ImageUrl will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get URL of the image. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The downloaded image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. Images stored in Tencent Cloud offer higher download speed and stability. We recommend storing images in Tencent Cloud. The speed and stability of URLs from non-Tencent Cloud storage may be affected. 
     * @return ImageUrl URL of the image. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The downloaded image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. Images stored in Tencent Cloud offer higher download speed and stability. We recommend storing images in Tencent Cloud. The speed and stability of URLs from non-Tencent Cloud storage may be affected.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL of the image. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The downloaded image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. Images stored in Tencent Cloud offer higher download speed and stability. We recommend storing images in Tencent Cloud. The speed and stability of URLs from non-Tencent Cloud storage may be affected.
     * @param ImageUrl URL of the image. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The downloaded image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. Images stored in Tencent Cloud offer higher download speed and stability. We recommend storing images in Tencent Cloud. The speed and stability of URLs from non-Tencent Cloud storage may be affected.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Base64-encoded image data. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. You must provide either ImageUrl or ImageBase64. If both are provided, ImageUrl will be used. 
     * @return ImageBase64 Base64-encoded image data. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. You must provide either ImageUrl or ImageBase64. If both are provided, ImageUrl will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64-encoded image data. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. You must provide either ImageUrl or ImageBase64. If both are provided, ImageUrl will be used.
     * @param ImageBase64 Base64-encoded image data. Supported image formats: PNG, JPG, JPEG. GIF is not supported. The image must be no larger than 7 MB after Base64 encoding. Image download must complete within 3 seconds. You must provide either ImageUrl or ImageBase64. If both are provided, ImageUrl will be used.
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

