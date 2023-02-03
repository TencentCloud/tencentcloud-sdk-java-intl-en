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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLiveFaceAccurateRequest extends AbstractModel{

    /**
    * Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
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
     * Get Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported. 
     * @return Image Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
     * @param Image Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported. 
     * @return Url Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
     * @param Url Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
The recommended image aspect ratio is 3:4 (generally, the aspect ratio of images taken by mobile phones).
The face must be greater than 100*100 px in size.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
Supported image formats are PNG, JPG, JPEG, and BMP. GIF is currently not supported.
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

