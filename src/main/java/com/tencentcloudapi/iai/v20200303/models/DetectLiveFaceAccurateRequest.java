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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLiveFaceAccurateRequest extends AbstractModel {

    /**
    * Specifies the base64 code of the image.
-base64-Encoded size cannot exceed 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image cannot exceed 2000. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Specifies the Url of the image.
-Specifies the maximum size of the corresponding image after base64 encoding is 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image must not exceed 2000.
-Url or Image must be provided. if both are provided, only use Url. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Image storage Url on tencent cloud guarantees higher download speed and stability. it is recommended to store images on tencent cloud. non-tencent cloud storage urls may be impacted in speed and stability.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Algorithm model version used for face recognition. Valid value: `3.0`.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get Specifies the base64 code of the image.
-base64-Encoded size cannot exceed 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image cannot exceed 2000. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported. 
     * @return Image Specifies the base64 code of the image.
-base64-Encoded size cannot exceed 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image cannot exceed 2000. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Specifies the base64 code of the image.
-base64-Encoded size cannot exceed 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image cannot exceed 2000. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
     * @param Image Specifies the base64 code of the image.
-base64-Encoded size cannot exceed 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image cannot exceed 2000. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Specifies the Url of the image.
-Specifies the maximum size of the corresponding image after base64 encoding is 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image must not exceed 2000.
-Url or Image must be provided. if both are provided, only use Url. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Image storage Url on tencent cloud guarantees higher download speed and stability. it is recommended to store images on tencent cloud. non-tencent cloud storage urls may be impacted in speed and stability.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported. 
     * @return Url Specifies the Url of the image.
-Specifies the maximum size of the corresponding image after base64 encoding is 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image must not exceed 2000.
-Url or Image must be provided. if both are provided, only use Url. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Image storage Url on tencent cloud guarantees higher download speed and stability. it is recommended to store images on tencent cloud. non-tencent cloud storage urls may be impacted in speed and stability.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Specifies the Url of the image.
-Specifies the maximum size of the corresponding image after base64 encoding is 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image must not exceed 2000.
-Url or Image must be provided. if both are provided, only use Url. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Image storage Url on tencent cloud guarantees higher download speed and stability. it is recommended to store images on tencent cloud. non-tencent cloud storage urls may be impacted in speed and stability.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
     * @param Url Specifies the Url of the image.
-Specifies the maximum size of the corresponding image after base64 encoding is 5M.
-The long side pixel of a jpg image must not exceed 4000. the long side pixel of another format image must not exceed 2000.
-Url or Image must be provided. if both are provided, only use Url. 
-Specifies the image aspect ratio should be close to 3:4. mobile phone shooting proportion is best.
-Specifies the human face dimension is greater than 100X100 pixels.
-Image storage Url on tencent cloud guarantees higher download speed and stability. it is recommended to store images on tencent cloud. non-tencent cloud storage urls may be impacted in speed and stability.
-Supported image formats include PNG, JPG, JPEG, and BMP. GIF is not supported.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Algorithm model version used for face recognition. Valid value: `3.0`. 
     * @return FaceModelVersion Algorithm model version used for face recognition. Valid value: `3.0`.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used for face recognition. Valid value: `3.0`.
     * @param FaceModelVersion Algorithm model version used for face recognition. Valid value: `3.0`.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public DetectLiveFaceAccurateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLiveFaceAccurateRequest(DetectLiveFaceAccurateRequest source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);

    }
}

