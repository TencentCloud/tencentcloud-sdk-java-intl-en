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

public class CompareFaceRequest extends AbstractModel{

    /**
    * Base64-encoded data of image A, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
    */
    @SerializedName("ImageA")
    @Expose
    private String ImageA;

    /**
    * Base64-encoded data of image B, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
    */
    @SerializedName("ImageB")
    @Expose
    private String ImageB;

    /**
    * URL of image A. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image A must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
    */
    @SerializedName("UrlA")
    @Expose
    private String UrlA;

    /**
    * URL of image B. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image B must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
    */
    @SerializedName("UrlB")
    @Expose
    private String UrlB;

    /**
    * Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of the following problems: excessive brightness, excessive dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high-quality requirement. The image has one to two of the following problems: excessive brightness, excessive dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high-quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory.
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get Base64-encoded data of image A, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not. 
     * @return ImageA Base64-encoded data of image A, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public String getImageA() {
        return this.ImageA;
    }

    /**
     * Set Base64-encoded data of image A, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     * @param ImageA Base64-encoded data of image A, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public void setImageA(String ImageA) {
        this.ImageA = ImageA;
    }

    /**
     * Get Base64-encoded data of image B, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not. 
     * @return ImageB Base64-encoded data of image B, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public String getImageB() {
        return this.ImageB;
    }

    /**
     * Set Base64-encoded data of image B, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     * @param ImageB Base64-encoded data of image B, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public void setImageB(String ImageB) {
        this.ImageB = ImageB;
    }

    /**
     * Get URL of image A. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image A must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not. 
     * @return UrlA URL of image A. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image A must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public String getUrlA() {
        return this.UrlA;
    }

    /**
     * Set URL of image A. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image A must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     * @param UrlA URL of image A. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image A must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public void setUrlA(String UrlA) {
        this.UrlA = UrlA;
    }

    /**
     * Get URL of image B. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image B must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not. 
     * @return UrlB URL of image B. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image B must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public String getUrlB() {
        return this.UrlB;
    }

    /**
     * Set URL of image B. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image B must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     * @param UrlB URL of image B. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in JPG format or 2,000 px for images in other formats.
Either `Url` or `Image` of image B must be provided; if both are provided, only `Url` will be used. 
We recommend storing the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
If there are multiple faces in the image, only the face with the largest size will be selected.
PNG, JPG, JPEG, and BMP images are supported, while GIF images are not.
     */
    public void setUrlB(String UrlB) {
        this.UrlB = UrlB;
    }

    /**
     * Get Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended. 
     * @return FaceModelVersion Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
     * @param FaceModelVersion Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of the following problems: excessive brightness, excessive dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high-quality requirement. The image has one to two of the following problems: excessive brightness, excessive dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high-quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory. 
     * @return QualityControl Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of the following problems: excessive brightness, excessive dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high-quality requirement. The image has one to two of the following problems: excessive brightness, excessive dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high-quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory.
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of the following problems: excessive brightness, excessive dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high-quality requirement. The image has one to two of the following problems: excessive brightness, excessive dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high-quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory.
     * @param QualityControl Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of the following problems: excessive brightness, excessive dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high-quality requirement. The image has one to two of the following problems: excessive brightness, excessive dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high-quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory.
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
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

    public CompareFaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareFaceRequest(CompareFaceRequest source) {
        if (source.ImageA != null) {
            this.ImageA = new String(source.ImageA);
        }
        if (source.ImageB != null) {
            this.ImageB = new String(source.ImageB);
        }
        if (source.UrlA != null) {
            this.UrlA = new String(source.UrlA);
        }
        if (source.UrlB != null) {
            this.UrlB = new String(source.UrlB);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
        }
        if (source.NeedRotateDetection != null) {
            this.NeedRotateDetection = new Long(source.NeedRotateDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageA", this.ImageA);
        this.setParamSimple(map, prefix + "ImageB", this.ImageB);
        this.setParamSimple(map, prefix + "UrlA", this.UrlA);
        this.setParamSimple(map, prefix + "UrlB", this.UrlB);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

