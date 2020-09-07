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

public class SearchPersonsReturnsByGroupRequest extends AbstractModel{

    /**
    * List of groups to be searched for (up to 60). The array element value is the `GroupId` in the `CreateGroup` API.
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * Base64-encoded image data, which cannot exceed 5 MB.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
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
    * Maximum number of recognizable faces. Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 10.
`MaxFaceNum` is used to control the number of faces to be searched for if there are multiple faces in the input image to be recognized.
For example, if the input image in `Image` or `Url` contains multiple faces and `MaxFaceNum` is 5, top 5 faces with the largest size in the image will be recognized.
    */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
    * Minimum height and width of face in px. Default value: 34. A value below 34 will affect the search accuracy. You are recommended to set this parameter to 80.
    */
    @SerializedName("MinFaceSize")
    @Expose
    private Long MinFaceSize;

    /**
    * Detected faces, which is corresponding to the maximum number of returned most matching persons. Default value: 5. Maximum value: 10.  
For example, if `MaxFaceNum` is 3, `MaxPersonNumPerGroup` is 3, and the `GroupIds` length is 3, up to 45 (3 * 5 * 3) persons will be returned.
    */
    @SerializedName("MaxPersonNumPerGroup")
    @Expose
    private Long MaxPersonNumPerGroup;

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
    * In the output parameter `Score`, the result will be returned only if the result value is above the `FaceMatchThreshold` value. Default value: 0.
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * Whether to return person details. 0: no; 1: yes. Default value: 0. Other values will be considered as 0 by default
    */
    @SerializedName("NeedPersonInfo")
    @Expose
    private Long NeedPersonInfo;

    /**
    * Whether to enable the support for rotated image recognition. 0: no; 1: yes. Default value: 0. When the face in the image is rotated and the image has no EXIF information, if this parameter is not enabled, the face in the image cannot be correctly detected and recognized. If you are sure that the input image contains EXIF information or the face in the image will not be rotated, do not enable this parameter, as the overall time consumption may increase by hundreds of milliseconds after it is enabled.
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get List of groups to be searched for (up to 60). The array element value is the `GroupId` in the `CreateGroup` API. 
     * @return GroupIds List of groups to be searched for (up to 60). The array element value is the `GroupId` in the `CreateGroup` API.
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set List of groups to be searched for (up to 60). The array element value is the `GroupId` in the `CreateGroup` API.
     * @param GroupIds List of groups to be searched for (up to 60). The array element value is the `GroupId` in the `CreateGroup` API.
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
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
     * Get Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not. 
     * @return Url Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
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
     * Set Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
The long side cannot exceed 4,000 px for images in .jpg format or 2,000 px for images in other formats.
Either `Url` or `Image` must be provided; if both are provided, only `Url` will be used.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
.png, .jpg, .jpeg, and .bmp images are supported, while .gif images are not.
     * @param Url Image URL. The image cannot exceed 5 MB in size after being Base64-encoded.
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
     * Get Maximum number of recognizable faces. Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 10.
`MaxFaceNum` is used to control the number of faces to be searched for if there are multiple faces in the input image to be recognized.
For example, if the input image in `Image` or `Url` contains multiple faces and `MaxFaceNum` is 5, top 5 faces with the largest size in the image will be recognized. 
     * @return MaxFaceNum Maximum number of recognizable faces. Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 10.
`MaxFaceNum` is used to control the number of faces to be searched for if there are multiple faces in the input image to be recognized.
For example, if the input image in `Image` or `Url` contains multiple faces and `MaxFaceNum` is 5, top 5 faces with the largest size in the image will be recognized.
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set Maximum number of recognizable faces. Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 10.
`MaxFaceNum` is used to control the number of faces to be searched for if there are multiple faces in the input image to be recognized.
For example, if the input image in `Image` or `Url` contains multiple faces and `MaxFaceNum` is 5, top 5 faces with the largest size in the image will be recognized.
     * @param MaxFaceNum Maximum number of recognizable faces. Default value: 1 (i.e., detecting only the face with the largest size in the image). Maximum value: 10.
`MaxFaceNum` is used to control the number of faces to be searched for if there are multiple faces in the input image to be recognized.
For example, if the input image in `Image` or `Url` contains multiple faces and `MaxFaceNum` is 5, top 5 faces with the largest size in the image will be recognized.
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get Minimum height and width of face in px. Default value: 34. A value below 34 will affect the search accuracy. You are recommended to set this parameter to 80. 
     * @return MinFaceSize Minimum height and width of face in px. Default value: 34. A value below 34 will affect the search accuracy. You are recommended to set this parameter to 80.
     */
    public Long getMinFaceSize() {
        return this.MinFaceSize;
    }

    /**
     * Set Minimum height and width of face in px. Default value: 34. A value below 34 will affect the search accuracy. You are recommended to set this parameter to 80.
     * @param MinFaceSize Minimum height and width of face in px. Default value: 34. A value below 34 will affect the search accuracy. You are recommended to set this parameter to 80.
     */
    public void setMinFaceSize(Long MinFaceSize) {
        this.MinFaceSize = MinFaceSize;
    }

    /**
     * Get Detected faces, which is corresponding to the maximum number of returned most matching persons. Default value: 5. Maximum value: 10.  
For example, if `MaxFaceNum` is 3, `MaxPersonNumPerGroup` is 3, and the `GroupIds` length is 3, up to 45 (3 * 5 * 3) persons will be returned. 
     * @return MaxPersonNumPerGroup Detected faces, which is corresponding to the maximum number of returned most matching persons. Default value: 5. Maximum value: 10.  
For example, if `MaxFaceNum` is 3, `MaxPersonNumPerGroup` is 3, and the `GroupIds` length is 3, up to 45 (3 * 5 * 3) persons will be returned.
     */
    public Long getMaxPersonNumPerGroup() {
        return this.MaxPersonNumPerGroup;
    }

    /**
     * Set Detected faces, which is corresponding to the maximum number of returned most matching persons. Default value: 5. Maximum value: 10.  
For example, if `MaxFaceNum` is 3, `MaxPersonNumPerGroup` is 3, and the `GroupIds` length is 3, up to 45 (3 * 5 * 3) persons will be returned.
     * @param MaxPersonNumPerGroup Detected faces, which is corresponding to the maximum number of returned most matching persons. Default value: 5. Maximum value: 10.  
For example, if `MaxFaceNum` is 3, `MaxPersonNumPerGroup` is 3, and the `GroupIds` length is 3, up to 45 (3 * 5 * 3) persons will be returned.
     */
    public void setMaxPersonNumPerGroup(Long MaxPersonNumPerGroup) {
        this.MaxPersonNumPerGroup = MaxPersonNumPerGroup;
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
     * Get In the output parameter `Score`, the result will be returned only if the result value is above the `FaceMatchThreshold` value. Default value: 0. 
     * @return FaceMatchThreshold In the output parameter `Score`, the result will be returned only if the result value is above the `FaceMatchThreshold` value. Default value: 0.
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set In the output parameter `Score`, the result will be returned only if the result value is above the `FaceMatchThreshold` value. Default value: 0.
     * @param FaceMatchThreshold In the output parameter `Score`, the result will be returned only if the result value is above the `FaceMatchThreshold` value. Default value: 0.
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get Whether to return person details. 0: no; 1: yes. Default value: 0. Other values will be considered as 0 by default 
     * @return NeedPersonInfo Whether to return person details. 0: no; 1: yes. Default value: 0. Other values will be considered as 0 by default
     */
    public Long getNeedPersonInfo() {
        return this.NeedPersonInfo;
    }

    /**
     * Set Whether to return person details. 0: no; 1: yes. Default value: 0. Other values will be considered as 0 by default
     * @param NeedPersonInfo Whether to return person details. 0: no; 1: yes. Default value: 0. Other values will be considered as 0 by default
     */
    public void setNeedPersonInfo(Long NeedPersonInfo) {
        this.NeedPersonInfo = NeedPersonInfo;
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
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MaxFaceNum", this.MaxFaceNum);
        this.setParamSimple(map, prefix + "MinFaceSize", this.MinFaceSize);
        this.setParamSimple(map, prefix + "MaxPersonNumPerGroup", this.MaxPersonNumPerGroup);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "NeedPersonInfo", this.NeedPersonInfo);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

