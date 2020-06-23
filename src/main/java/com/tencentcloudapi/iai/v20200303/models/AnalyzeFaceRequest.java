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

public class AnalyzeFaceRequest extends AbstractModel{

    /**
    * Detection mode. 0: detect all faces that appear; 1: detect the largest face. Default value: 0. The facial feature localization information (facial keypoints) of up to 10 faces can be returned.
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Base64-encoded image data, which cannot exceed 5 MB.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Algorithm model version used by the Face Recognition service. Valid values: 2.0, 3.0.  
This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API previously, `2.0` will be used by default.  
Different algorithm model versions correspond to different face recognition algorithms. The new version has a better overall effect than the legacy version and is thus recommended.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get Detection mode. 0: detect all faces that appear; 1: detect the largest face. Default value: 0. The facial feature localization information (facial keypoints) of up to 10 faces can be returned. 
     * @return Mode Detection mode. 0: detect all faces that appear; 1: detect the largest face. Default value: 0. The facial feature localization information (facial keypoints) of up to 10 faces can be returned.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Detection mode. 0: detect all faces that appear; 1: detect the largest face. Default value: 0. The facial feature localization information (facial keypoints) of up to 10 faces can be returned.
     * @param Mode Detection mode. 0: detect all faces that appear; 1: detect the largest face. Default value: 0. The facial feature localization information (facial keypoints) of up to 10 faces can be returned.
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Base64-encoded image data, which cannot exceed 5 MB.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not. 
     * @return Image Base64-encoded image data, which cannot exceed 5 MB.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Base64-encoded image data, which cannot exceed 5 MB.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     * @param Image Base64-encoded image data, which cannot exceed 5 MB.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not. 
     * @return Url Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     * @param Url Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Algorithm model version used by the Face Recognition service. Valid values: 2.0, 3.0.  
This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API previously, `2.0` will be used by default.  
Different algorithm model versions correspond to different face recognition algorithms. The new version has a better overall effect than the legacy version and is thus recommended. 
     * @return FaceModelVersion Algorithm model version used by the Face Recognition service. Valid values: 2.0, 3.0.  
This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API previously, `2.0` will be used by default.  
Different algorithm model versions correspond to different face recognition algorithms. The new version has a better overall effect than the legacy version and is thus recommended.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used by the Face Recognition service. Valid values: 2.0, 3.0.  
This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API previously, `2.0` will be used by default.  
Different algorithm model versions correspond to different face recognition algorithms. The new version has a better overall effect than the legacy version and is thus recommended.
     * @param FaceModelVersion Algorithm model version used by the Face Recognition service. Valid values: 2.0, 3.0.  
This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API previously, `2.0` will be used by default.  
Different algorithm model versions correspond to different face recognition algorithms. The new version has a better overall effect than the legacy version and is thus recommended.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled. 
     * @return NeedRotateDetection Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
     * @param NeedRotateDetection Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

