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

public class SearchPersonsRequest extends AbstractModel {

    /**
    * <p>List of person libraries to query, with a capacity limit of 100. The value of an array element is the GroupId in the person library creation API.</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>Image base64 data.</p><ul><li>Size after base64 encoding must not exceed 5M.</li><li>Long side pixel of jpg images cannot exceed 4000, and that of other formats cannot exceed 2000.</li><li>Short side pixel of images in all formats must not be less than 64.</li><li>If an image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000.</li><li>The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Urls of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of Urls not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Maximum number of human faces to be recognized.</p><ul><li>Default value: 1 (only the face with the maximum area in the image is detected). Maximum value: 10.</li><li>MaxFaceNum is used to set the number of faces to search when the input image to be recognized contains several faces.</li><li>For example, if the image in the input Image or Url contains several faces and MaxFaceNum is set to 5, the 5 faces with the maximum area in the image will be recognized.</li></ul>
    */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
    * <p>Minimum length and width of a human face, unit: pixel.</p><ul><li>Default value: 34.</li><li>Less than 34 will affect search accuracy.</li><li>Set it to 80.</li></ul>
    */
    @SerializedName("MinFaceSize")
    @Expose
    private Long MinFaceSize;

    /**
    * <p>Number of most similar persons returned for a single recognized human face.</p><ul><li>Default value: 5. Maximum value: 100.</li><li>For example, if MaxFaceNum is 1 and MaxPersonNum is 8, the information of the Top 8 similar persons is returned.</li><li>A larger value means a longer time to process. It is advisable not to exceed 10.</li></ul>
    */
    @SerializedName("MaxPersonNum")
    @Expose
    private Long MaxPersonNum;

    /**
    * <p>Image quality control. </p><ul><li>Value range:<br>0: No control.<br>1: Low quality requirement. The image is super blurry, with at least one of the following: eye, nose, or mouth occlusion.<br>2: Normal quality requirement. The image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>3: High quality requirement. The image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>4: Very high quality requirement. Each dimension is optimal or at most one dimension has a minor problem.</li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * <p>In the output parameter Score, only results equal to or greater than the FaceMatchThreshold value will be returned.</p><ul><li>Default value: 0.</li><li>Value range: [0.0,100.0).</li></ul>
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * <p>Whether to return specific personnel information.</p><ul><li>Value range: 0 to disable, 1 to enable.</li><li>Default value: 0.</li><li>Other values other than 0 and 1 default to 0.</li></ul>
    */
    @SerializedName("NeedPersonInfo")
    @Expose
    private Long NeedPersonInfo;

    /**
    * <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for not enabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected and recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
    * <p>Whether full request body encryption is required. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}.</p>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get <p>List of person libraries to query, with a capacity limit of 100. The value of an array element is the GroupId in the person library creation API.</p> 
     * @return GroupIds <p>List of person libraries to query, with a capacity limit of 100. The value of an array element is the GroupId in the person library creation API.</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>List of person libraries to query, with a capacity limit of 100. The value of an array element is the GroupId in the person library creation API.</p>
     * @param GroupIds <p>List of person libraries to query, with a capacity limit of 100. The value of an array element is the GroupId in the person library creation API.</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>Image base64 data.</p><ul><li>Size after base64 encoding must not exceed 5M.</li><li>Long side pixel of jpg images cannot exceed 4000, and that of other formats cannot exceed 2000.</li><li>Short side pixel of images in all formats must not be less than 64.</li><li>If an image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul> 
     * @return Image <p>Image base64 data.</p><ul><li>Size after base64 encoding must not exceed 5M.</li><li>Long side pixel of jpg images cannot exceed 4000, and that of other formats cannot exceed 2000.</li><li>Short side pixel of images in all formats must not be less than 64.</li><li>If an image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>Image base64 data.</p><ul><li>Size after base64 encoding must not exceed 5M.</li><li>Long side pixel of jpg images cannot exceed 4000, and that of other formats cannot exceed 2000.</li><li>Short side pixel of images in all formats must not be less than 64.</li><li>If an image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     * @param Image <p>Image base64 data.</p><ul><li>Size after base64 encoding must not exceed 5M.</li><li>Long side pixel of jpg images cannot exceed 4000, and that of other formats cannot exceed 2000.</li><li>Short side pixel of images in all formats must not be less than 64.</li><li>If an image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000.</li><li>The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Urls of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of Urls not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul> 
     * @return Url <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000.</li><li>The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Urls of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of Urls not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000.</li><li>The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Urls of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of Urls not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     * @param Url <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000.</li><li>The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Urls of images stored in Tencent Cloud can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of Urls not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Maximum number of human faces to be recognized.</p><ul><li>Default value: 1 (only the face with the maximum area in the image is detected). Maximum value: 10.</li><li>MaxFaceNum is used to set the number of faces to search when the input image to be recognized contains several faces.</li><li>For example, if the image in the input Image or Url contains several faces and MaxFaceNum is set to 5, the 5 faces with the maximum area in the image will be recognized.</li></ul> 
     * @return MaxFaceNum <p>Maximum number of human faces to be recognized.</p><ul><li>Default value: 1 (only the face with the maximum area in the image is detected). Maximum value: 10.</li><li>MaxFaceNum is used to set the number of faces to search when the input image to be recognized contains several faces.</li><li>For example, if the image in the input Image or Url contains several faces and MaxFaceNum is set to 5, the 5 faces with the maximum area in the image will be recognized.</li></ul>
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set <p>Maximum number of human faces to be recognized.</p><ul><li>Default value: 1 (only the face with the maximum area in the image is detected). Maximum value: 10.</li><li>MaxFaceNum is used to set the number of faces to search when the input image to be recognized contains several faces.</li><li>For example, if the image in the input Image or Url contains several faces and MaxFaceNum is set to 5, the 5 faces with the maximum area in the image will be recognized.</li></ul>
     * @param MaxFaceNum <p>Maximum number of human faces to be recognized.</p><ul><li>Default value: 1 (only the face with the maximum area in the image is detected). Maximum value: 10.</li><li>MaxFaceNum is used to set the number of faces to search when the input image to be recognized contains several faces.</li><li>For example, if the image in the input Image or Url contains several faces and MaxFaceNum is set to 5, the 5 faces with the maximum area in the image will be recognized.</li></ul>
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get <p>Minimum length and width of a human face, unit: pixel.</p><ul><li>Default value: 34.</li><li>Less than 34 will affect search accuracy.</li><li>Set it to 80.</li></ul> 
     * @return MinFaceSize <p>Minimum length and width of a human face, unit: pixel.</p><ul><li>Default value: 34.</li><li>Less than 34 will affect search accuracy.</li><li>Set it to 80.</li></ul>
     */
    public Long getMinFaceSize() {
        return this.MinFaceSize;
    }

    /**
     * Set <p>Minimum length and width of a human face, unit: pixel.</p><ul><li>Default value: 34.</li><li>Less than 34 will affect search accuracy.</li><li>Set it to 80.</li></ul>
     * @param MinFaceSize <p>Minimum length and width of a human face, unit: pixel.</p><ul><li>Default value: 34.</li><li>Less than 34 will affect search accuracy.</li><li>Set it to 80.</li></ul>
     */
    public void setMinFaceSize(Long MinFaceSize) {
        this.MinFaceSize = MinFaceSize;
    }

    /**
     * Get <p>Number of most similar persons returned for a single recognized human face.</p><ul><li>Default value: 5. Maximum value: 100.</li><li>For example, if MaxFaceNum is 1 and MaxPersonNum is 8, the information of the Top 8 similar persons is returned.</li><li>A larger value means a longer time to process. It is advisable not to exceed 10.</li></ul> 
     * @return MaxPersonNum <p>Number of most similar persons returned for a single recognized human face.</p><ul><li>Default value: 5. Maximum value: 100.</li><li>For example, if MaxFaceNum is 1 and MaxPersonNum is 8, the information of the Top 8 similar persons is returned.</li><li>A larger value means a longer time to process. It is advisable not to exceed 10.</li></ul>
     */
    public Long getMaxPersonNum() {
        return this.MaxPersonNum;
    }

    /**
     * Set <p>Number of most similar persons returned for a single recognized human face.</p><ul><li>Default value: 5. Maximum value: 100.</li><li>For example, if MaxFaceNum is 1 and MaxPersonNum is 8, the information of the Top 8 similar persons is returned.</li><li>A larger value means a longer time to process. It is advisable not to exceed 10.</li></ul>
     * @param MaxPersonNum <p>Number of most similar persons returned for a single recognized human face.</p><ul><li>Default value: 5. Maximum value: 100.</li><li>For example, if MaxFaceNum is 1 and MaxPersonNum is 8, the information of the Top 8 similar persons is returned.</li><li>A larger value means a longer time to process. It is advisable not to exceed 10.</li></ul>
     */
    public void setMaxPersonNum(Long MaxPersonNum) {
        this.MaxPersonNum = MaxPersonNum;
    }

    /**
     * Get <p>Image quality control. </p><ul><li>Value range:<br>0: No control.<br>1: Low quality requirement. The image is super blurry, with at least one of the following: eye, nose, or mouth occlusion.<br>2: Normal quality requirement. The image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>3: High quality requirement. The image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>4: Very high quality requirement. Each dimension is optimal or at most one dimension has a minor problem.</li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul> 
     * @return QualityControl <p>Image quality control. </p><ul><li>Value range:<br>0: No control.<br>1: Low quality requirement. The image is super blurry, with at least one of the following: eye, nose, or mouth occlusion.<br>2: Normal quality requirement. The image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>3: High quality requirement. The image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>4: Very high quality requirement. Each dimension is optimal or at most one dimension has a minor problem.</li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set <p>Image quality control. </p><ul><li>Value range:<br>0: No control.<br>1: Low quality requirement. The image is super blurry, with at least one of the following: eye, nose, or mouth occlusion.<br>2: Normal quality requirement. The image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>3: High quality requirement. The image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>4: Very high quality requirement. Each dimension is optimal or at most one dimension has a minor problem.</li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     * @param QualityControl <p>Image quality control. </p><ul><li>Value range:<br>0: No control.<br>1: Low quality requirement. The image is super blurry, with at least one of the following: eye, nose, or mouth occlusion.<br>2: Normal quality requirement. The image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>3: High quality requirement. The image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion.<br>4: Very high quality requirement. Each dimension is optimal or at most one dimension has a minor problem.</li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    /**
     * Get <p>In the output parameter Score, only results equal to or greater than the FaceMatchThreshold value will be returned.</p><ul><li>Default value: 0.</li><li>Value range: [0.0,100.0).</li></ul> 
     * @return FaceMatchThreshold <p>In the output parameter Score, only results equal to or greater than the FaceMatchThreshold value will be returned.</p><ul><li>Default value: 0.</li><li>Value range: [0.0,100.0).</li></ul>
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set <p>In the output parameter Score, only results equal to or greater than the FaceMatchThreshold value will be returned.</p><ul><li>Default value: 0.</li><li>Value range: [0.0,100.0).</li></ul>
     * @param FaceMatchThreshold <p>In the output parameter Score, only results equal to or greater than the FaceMatchThreshold value will be returned.</p><ul><li>Default value: 0.</li><li>Value range: [0.0,100.0).</li></ul>
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get <p>Whether to return specific personnel information.</p><ul><li>Value range: 0 to disable, 1 to enable.</li><li>Default value: 0.</li><li>Other values other than 0 and 1 default to 0.</li></ul> 
     * @return NeedPersonInfo <p>Whether to return specific personnel information.</p><ul><li>Value range: 0 to disable, 1 to enable.</li><li>Default value: 0.</li><li>Other values other than 0 and 1 default to 0.</li></ul>
     */
    public Long getNeedPersonInfo() {
        return this.NeedPersonInfo;
    }

    /**
     * Set <p>Whether to return specific personnel information.</p><ul><li>Value range: 0 to disable, 1 to enable.</li><li>Default value: 0.</li><li>Other values other than 0 and 1 default to 0.</li></ul>
     * @param NeedPersonInfo <p>Whether to return specific personnel information.</p><ul><li>Value range: 0 to disable, 1 to enable.</li><li>Default value: 0.</li><li>Other values other than 0 and 1 default to 0.</li></ul>
     */
    public void setNeedPersonInfo(Long NeedPersonInfo) {
        this.NeedPersonInfo = NeedPersonInfo;
    }

    /**
     * Get <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for not enabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected and recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul> 
     * @return NeedRotateDetection <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for not enabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected and recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for not enabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected and recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     * @param NeedRotateDetection <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for not enabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected and recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Get <p>Whether full request body encryption is required. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p> 
     * @return Encryption <p>Whether full request body encryption is required. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Whether full request body encryption is required. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     * @param Encryption <p>Whether full request body encryption is required. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}.</p> 
     * @return EncryptedBody <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}.</p>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}.</p>
     * @param EncryptedBody <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}.</p>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    public SearchPersonsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchPersonsRequest(SearchPersonsRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MaxFaceNum != null) {
            this.MaxFaceNum = new Long(source.MaxFaceNum);
        }
        if (source.MinFaceSize != null) {
            this.MinFaceSize = new Long(source.MinFaceSize);
        }
        if (source.MaxPersonNum != null) {
            this.MaxPersonNum = new Long(source.MaxPersonNum);
        }
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
        }
        if (source.FaceMatchThreshold != null) {
            this.FaceMatchThreshold = new Float(source.FaceMatchThreshold);
        }
        if (source.NeedPersonInfo != null) {
            this.NeedPersonInfo = new Long(source.NeedPersonInfo);
        }
        if (source.NeedRotateDetection != null) {
            this.NeedRotateDetection = new Long(source.NeedRotateDetection);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
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
        this.setParamSimple(map, prefix + "MaxPersonNum", this.MaxPersonNum);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "NeedPersonInfo", this.NeedPersonInfo);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

