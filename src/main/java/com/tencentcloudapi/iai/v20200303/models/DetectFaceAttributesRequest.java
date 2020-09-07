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

public class DetectFaceAttributesRequest extends AbstractModel{

    /**
    * Maximum number of processable faces. 
Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 120. 
This parameter is used to control the number of faces in the image to be detected. The smaller the value, the faster the processing.
    */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
    * Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Image URL. 
The image cannot exceed 5 MB in size after being Base64-encoded. 
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Whether to return attributes such as age, gender, and emotion. 
Valid values (case-insensitive): None, Age, Beauty, Emotion, Eye, Eyebrow, 
Gender, Hair, Hat, Headpose, Mask, Mouth, Moustache, Nose, Shape, Skin, Smile. 
`None` indicates that no attributes need to be returned, which is the default value. 
You need to combine the attributes into a string and separate them with commas. The sequence of the attributes is not limited. 
For more information on the attributes, please see the output parameters as described below. 
The face attribute information of up to 5 largest faces in the image will be returned, and `AttributesInfo` of the 6th and rest faces is meaningless.
    */
    @SerializedName("FaceAttributesType")
    @Expose
    private String FaceAttributesType;

    /**
    * Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
    * Algorithm model version used by the Face Recognition service. You can enter only `3.0` for this API.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get Maximum number of processable faces. 
Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 120. 
This parameter is used to control the number of faces in the image to be detected. The smaller the value, the faster the processing. 
     * @return MaxFaceNum Maximum number of processable faces. 
Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 120. 
This parameter is used to control the number of faces in the image to be detected. The smaller the value, the faster the processing.
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set Maximum number of processable faces. 
Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 120. 
This parameter is used to control the number of faces in the image to be detected. The smaller the value, the faster the processing.
     * @param MaxFaceNum Maximum number of processable faces. 
Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 120. 
This parameter is used to control the number of faces in the image to be detected. The smaller the value, the faster the processing.
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not. 
     * @return Image Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     * @param Image Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Image URL. 
The image cannot exceed 5 MB in size after being Base64-encoded. 
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not. 
     * @return Url Image URL. 
The image cannot exceed 5 MB in size after being Base64-encoded. 
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Image URL. 
The image cannot exceed 5 MB in size after being Base64-encoded. 
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     * @param Url Image URL. 
The image cannot exceed 5 MB in size after being Base64-encoded. 
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used. 
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. 
The download speed and stability of non-Tencent Cloud URLs may be low. 
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Whether to return attributes such as age, gender, and emotion. 
Valid values (case-insensitive): None, Age, Beauty, Emotion, Eye, Eyebrow, 
Gender, Hair, Hat, Headpose, Mask, Mouth, Moustache, Nose, Shape, Skin, Smile. 
`None` indicates that no attributes need to be returned, which is the default value. 
You need to combine the attributes into a string and separate them with commas. The sequence of the attributes is not limited. 
For more information on the attributes, please see the output parameters as described below. 
The face attribute information of up to 5 largest faces in the image will be returned, and `AttributesInfo` of the 6th and rest faces is meaningless. 
     * @return FaceAttributesType Whether to return attributes such as age, gender, and emotion. 
Valid values (case-insensitive): None, Age, Beauty, Emotion, Eye, Eyebrow, 
Gender, Hair, Hat, Headpose, Mask, Mouth, Moustache, Nose, Shape, Skin, Smile. 
`None` indicates that no attributes need to be returned, which is the default value. 
You need to combine the attributes into a string and separate them with commas. The sequence of the attributes is not limited. 
For more information on the attributes, please see the output parameters as described below. 
The face attribute information of up to 5 largest faces in the image will be returned, and `AttributesInfo` of the 6th and rest faces is meaningless.
     */
    public String getFaceAttributesType() {
        return this.FaceAttributesType;
    }

    /**
     * Set Whether to return attributes such as age, gender, and emotion. 
Valid values (case-insensitive): None, Age, Beauty, Emotion, Eye, Eyebrow, 
Gender, Hair, Hat, Headpose, Mask, Mouth, Moustache, Nose, Shape, Skin, Smile. 
`None` indicates that no attributes need to be returned, which is the default value. 
You need to combine the attributes into a string and separate them with commas. The sequence of the attributes is not limited. 
For more information on the attributes, please see the output parameters as described below. 
The face attribute information of up to 5 largest faces in the image will be returned, and `AttributesInfo` of the 6th and rest faces is meaningless.
     * @param FaceAttributesType Whether to return attributes such as age, gender, and emotion. 
Valid values (case-insensitive): None, Age, Beauty, Emotion, Eye, Eyebrow, 
Gender, Hair, Hat, Headpose, Mask, Mouth, Moustache, Nose, Shape, Skin, Smile. 
`None` indicates that no attributes need to be returned, which is the default value. 
You need to combine the attributes into a string and separate them with commas. The sequence of the attributes is not limited. 
For more information on the attributes, please see the output parameters as described below. 
The face attribute information of up to 5 largest faces in the image will be returned, and `AttributesInfo` of the 6th and rest faces is meaningless.
     */
    public void setFaceAttributesType(String FaceAttributesType) {
        this.FaceAttributesType = FaceAttributesType;
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
     * Get Algorithm model version used by the Face Recognition service. You can enter only `3.0` for this API. 
     * @return FaceModelVersion Algorithm model version used by the Face Recognition service. You can enter only `3.0` for this API.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used by the Face Recognition service. You can enter only `3.0` for this API.
     * @param FaceModelVersion Algorithm model version used by the Face Recognition service. You can enter only `3.0` for this API.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxFaceNum", this.MaxFaceNum);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FaceAttributesType", this.FaceAttributesType);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);

    }
}

