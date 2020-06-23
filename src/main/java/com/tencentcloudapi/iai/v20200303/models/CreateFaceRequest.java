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

public class CreateFaceRequest extends AbstractModel{

    /**
    * Person ID.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Base64-encoded image data, which cannot exceed 5 MB.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * Only faces whose similarity to an existing face of the person is above the value of `FaceMatchThreshold` can be added successfully. 
Default value: 60. Value range: [0,100].
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of following problems: extreme brightness, extreme dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high quality requirement. The image has one to two of following problems: extreme brightness, extreme dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
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
     * Get Person ID. 
     * @return PersonId Person ID.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID.
     * @param PersonId Person ID.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Base64-encoded image data, which cannot exceed 5 MB.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not. 
     * @return Images Base64-encoded image data, which cannot exceed 5 MB.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set Base64-encoded image data, which cannot exceed 5 MB.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     * @param Images Base64-encoded image data, which cannot exceed 5 MB.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected. 
     * @return Urls Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
     * @param Urls Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.  
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
There can be up to 5 faces in one image.
If there are multiple faces in the image, only the face with the largest size will be selected.
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get Only faces whose similarity to an existing face of the person is above the value of `FaceMatchThreshold` can be added successfully. 
Default value: 60. Value range: [0,100]. 
     * @return FaceMatchThreshold Only faces whose similarity to an existing face of the person is above the value of `FaceMatchThreshold` can be added successfully. 
Default value: 60. Value range: [0,100].
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set Only faces whose similarity to an existing face of the person is above the value of `FaceMatchThreshold` can be added successfully. 
Default value: 60. Value range: [0,100].
     * @param FaceMatchThreshold Only faces whose similarity to an existing face of the person is above the value of `FaceMatchThreshold` can be added successfully. 
Default value: 60. Value range: [0,100].
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of following problems: extreme brightness, extreme dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high quality requirement. The image has one to two of following problems: extreme brightness, extreme dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory. 
     * @return QualityControl Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of following problems: extreme brightness, extreme dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high quality requirement. The image has one to two of following problems: extreme brightness, extreme dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
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
2: average quality requirement. The image has at least three of following problems: extreme brightness, extreme dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high quality requirement. The image has one to two of following problems: extreme brightness, extreme dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
Default value: 0. 
If the image quality does not meet the requirement, the returned result will prompt that the detected image quality is unsatisfactory.
     * @param QualityControl Image quality control. 
0: no control. 
1: low quality requirement. The image has one or more of the following problems: extreme blurriness, covered eyes, covered nose, and covered mouth. 
2: average quality requirement. The image has at least three of following problems: extreme brightness, extreme dimness, blurriness or average blurriness, covered eyebrows, covered cheeks, and covered chin. 
3: high quality requirement. The image has one to two of following problems: extreme brightness, extreme dimness, average blurriness, covered eyebrows, covered cheeks, and covered chin. 
4: very high quality requirement. The image is optimal in all dimensions or only has a slight problem in one dimension. 
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

