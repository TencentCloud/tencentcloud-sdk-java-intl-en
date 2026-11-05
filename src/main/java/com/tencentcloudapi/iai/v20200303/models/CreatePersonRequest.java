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

public class CreatePersonRequest extends AbstractModel {

    /**
    * <p>ID of the personnel database to be added, which is the GroupId in the API for creating a personnel database.</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Person name. [1, 60] characters, modifiable, repeatable.</p>
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * <p>Person ID.</p><ul><li>Cannot be modified or repeated under a single Tencent Cloud account.</li><li>Supports English letters, digits, -%@#&amp;_, length limited to 64B.</li></ul>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>Gender.</p><ul><li>Value range: 0 represents empty, 1 represents man, 2 represents woman.</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * <p>Person description field content, key-value. [0, 60] characters, modifiable, repeatable.</p>
    */
    @SerializedName("PersonExDescriptionInfos")
    @Expose
    private PersonExDescriptionInfo [] PersonExDescriptionInfos;

    /**
    * <p>base64 image data.</p><ul><li>base64-encoded data must not exceed 5 MB.</li><li>For jpg images, the long edge must not exceed 4000 pixels. For other formats, the long edge must not exceed 2000 pixels. The short edge of images in all formats must be at least 64 pixels.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>Image Url.</p><ul><li>The corresponding Image size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>This parameter is used to control whether the human face contained in the image specified by Image or Url is determined to be a suspected duplicate person already existing in the person library. </p><ul><li>If determined to be the same person already in the person library, no new person will be created, and the personnel information of the suspected duplicate person will be returned. </li><li>If not, the person will be created. </li><li>Value range:<br>0: No judgment is performed, and the person will be stored regardless of whether there is a suspected duplicate person in the library;<br>1: Low duplicate person judgment requirement (1% false recognition rate);<br>2: Normal duplicate person judgment requirement (0.1% false recognition rate);<br>3: High duplicate person judgment requirement (0.01% false recognition rate);<br>4: Very high duplicate person judgment requirement (0.001% false recognition rate). </li><li>Default value: 0. </li><li>Note: The higher the requirement, the lower the probability of suspected duplicate persons. The false recognition rates for different requirements are for reference only and can be adjusted according to the actual situation.</li></ul>
    */
    @SerializedName("UniquePersonControl")
    @Expose
    private Long UniquePersonControl;

    /**
    * <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is very blurry, or at least one or more of the eyes, nose, or mouth are occluded; <br>2: general quality requirement, where the image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>3: high quality requirement, where the image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>4: very high quality requirement, where each dimension is optimal or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for disabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used to correctly detect and recognize human faces in an image when the faces are rotated and the image has no exif information. If image rotation recognition support is not enabled in this case, the faces cannot be detected or recognized.</li><li>If you confirm that the image contains exif information or that the human faces in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
    * <p>Whether to encrypt the entire request body. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
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
     * Get <p>ID of the personnel database to be added, which is the GroupId in the API for creating a personnel database.</p> 
     * @return GroupId <p>ID of the personnel database to be added, which is the GroupId in the API for creating a personnel database.</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>ID of the personnel database to be added, which is the GroupId in the API for creating a personnel database.</p>
     * @param GroupId <p>ID of the personnel database to be added, which is the GroupId in the API for creating a personnel database.</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Person name. [1, 60] characters, modifiable, repeatable.</p> 
     * @return PersonName <p>Person name. [1, 60] characters, modifiable, repeatable.</p>
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set <p>Person name. [1, 60] characters, modifiable, repeatable.</p>
     * @param PersonName <p>Person name. [1, 60] characters, modifiable, repeatable.</p>
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get <p>Person ID.</p><ul><li>Cannot be modified or repeated under a single Tencent Cloud account.</li><li>Supports English letters, digits, -%@#&amp;_, length limited to 64B.</li></ul> 
     * @return PersonId <p>Person ID.</p><ul><li>Cannot be modified or repeated under a single Tencent Cloud account.</li><li>Supports English letters, digits, -%@#&amp;_, length limited to 64B.</li></ul>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>Person ID.</p><ul><li>Cannot be modified or repeated under a single Tencent Cloud account.</li><li>Supports English letters, digits, -%@#&amp;_, length limited to 64B.</li></ul>
     * @param PersonId <p>Person ID.</p><ul><li>Cannot be modified or repeated under a single Tencent Cloud account.</li><li>Supports English letters, digits, -%@#&amp;_, length limited to 64B.</li></ul>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>Gender.</p><ul><li>Value range: 0 represents empty, 1 represents man, 2 represents woman.</li></ul> 
     * @return Gender <p>Gender.</p><ul><li>Value range: 0 represents empty, 1 represents man, 2 represents woman.</li></ul>
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender.</p><ul><li>Value range: 0 represents empty, 1 represents man, 2 represents woman.</li></ul>
     * @param Gender <p>Gender.</p><ul><li>Value range: 0 represents empty, 1 represents man, 2 represents woman.</li></ul>
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>Person description field content, key-value. [0, 60] characters, modifiable, repeatable.</p> 
     * @return PersonExDescriptionInfos <p>Person description field content, key-value. [0, 60] characters, modifiable, repeatable.</p>
     */
    public PersonExDescriptionInfo [] getPersonExDescriptionInfos() {
        return this.PersonExDescriptionInfos;
    }

    /**
     * Set <p>Person description field content, key-value. [0, 60] characters, modifiable, repeatable.</p>
     * @param PersonExDescriptionInfos <p>Person description field content, key-value. [0, 60] characters, modifiable, repeatable.</p>
     */
    public void setPersonExDescriptionInfos(PersonExDescriptionInfo [] PersonExDescriptionInfos) {
        this.PersonExDescriptionInfos = PersonExDescriptionInfos;
    }

    /**
     * Get <p>base64 image data.</p><ul><li>base64-encoded data must not exceed 5 MB.</li><li>For jpg images, the long edge must not exceed 4000 pixels. For other formats, the long edge must not exceed 2000 pixels. The short edge of images in all formats must be at least 64 pixels.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul> 
     * @return Image <p>base64 image data.</p><ul><li>base64-encoded data must not exceed 5 MB.</li><li>For jpg images, the long edge must not exceed 4000 pixels. For other formats, the long edge must not exceed 2000 pixels. The short edge of images in all formats must be at least 64 pixels.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>base64 image data.</p><ul><li>base64-encoded data must not exceed 5 MB.</li><li>For jpg images, the long edge must not exceed 4000 pixels. For other formats, the long edge must not exceed 2000 pixels. The short edge of images in all formats must be at least 64 pixels.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     * @param Image <p>base64 image data.</p><ul><li>base64-encoded data must not exceed 5 MB.</li><li>For jpg images, the long edge must not exceed 4000 pixels. For other formats, the long edge must not exceed 2000 pixels. The short edge of images in all formats must be at least 64 pixels.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>Image Url.</p><ul><li>The corresponding Image size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul> 
     * @return Url <p>Image Url.</p><ul><li>The corresponding Image size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Image Url.</p><ul><li>The corresponding Image size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     * @param Url <p>Image Url.</p><ul><li>The corresponding Image size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>This parameter is used to control whether the human face contained in the image specified by Image or Url is determined to be a suspected duplicate person already existing in the person library. </p><ul><li>If determined to be the same person already in the person library, no new person will be created, and the personnel information of the suspected duplicate person will be returned. </li><li>If not, the person will be created. </li><li>Value range:<br>0: No judgment is performed, and the person will be stored regardless of whether there is a suspected duplicate person in the library;<br>1: Low duplicate person judgment requirement (1% false recognition rate);<br>2: Normal duplicate person judgment requirement (0.1% false recognition rate);<br>3: High duplicate person judgment requirement (0.01% false recognition rate);<br>4: Very high duplicate person judgment requirement (0.001% false recognition rate). </li><li>Default value: 0. </li><li>Note: The higher the requirement, the lower the probability of suspected duplicate persons. The false recognition rates for different requirements are for reference only and can be adjusted according to the actual situation.</li></ul> 
     * @return UniquePersonControl <p>This parameter is used to control whether the human face contained in the image specified by Image or Url is determined to be a suspected duplicate person already existing in the person library. </p><ul><li>If determined to be the same person already in the person library, no new person will be created, and the personnel information of the suspected duplicate person will be returned. </li><li>If not, the person will be created. </li><li>Value range:<br>0: No judgment is performed, and the person will be stored regardless of whether there is a suspected duplicate person in the library;<br>1: Low duplicate person judgment requirement (1% false recognition rate);<br>2: Normal duplicate person judgment requirement (0.1% false recognition rate);<br>3: High duplicate person judgment requirement (0.01% false recognition rate);<br>4: Very high duplicate person judgment requirement (0.001% false recognition rate). </li><li>Default value: 0. </li><li>Note: The higher the requirement, the lower the probability of suspected duplicate persons. The false recognition rates for different requirements are for reference only and can be adjusted according to the actual situation.</li></ul>
     */
    public Long getUniquePersonControl() {
        return this.UniquePersonControl;
    }

    /**
     * Set <p>This parameter is used to control whether the human face contained in the image specified by Image or Url is determined to be a suspected duplicate person already existing in the person library. </p><ul><li>If determined to be the same person already in the person library, no new person will be created, and the personnel information of the suspected duplicate person will be returned. </li><li>If not, the person will be created. </li><li>Value range:<br>0: No judgment is performed, and the person will be stored regardless of whether there is a suspected duplicate person in the library;<br>1: Low duplicate person judgment requirement (1% false recognition rate);<br>2: Normal duplicate person judgment requirement (0.1% false recognition rate);<br>3: High duplicate person judgment requirement (0.01% false recognition rate);<br>4: Very high duplicate person judgment requirement (0.001% false recognition rate). </li><li>Default value: 0. </li><li>Note: The higher the requirement, the lower the probability of suspected duplicate persons. The false recognition rates for different requirements are for reference only and can be adjusted according to the actual situation.</li></ul>
     * @param UniquePersonControl <p>This parameter is used to control whether the human face contained in the image specified by Image or Url is determined to be a suspected duplicate person already existing in the person library. </p><ul><li>If determined to be the same person already in the person library, no new person will be created, and the personnel information of the suspected duplicate person will be returned. </li><li>If not, the person will be created. </li><li>Value range:<br>0: No judgment is performed, and the person will be stored regardless of whether there is a suspected duplicate person in the library;<br>1: Low duplicate person judgment requirement (1% false recognition rate);<br>2: Normal duplicate person judgment requirement (0.1% false recognition rate);<br>3: High duplicate person judgment requirement (0.01% false recognition rate);<br>4: Very high duplicate person judgment requirement (0.001% false recognition rate). </li><li>Default value: 0. </li><li>Note: The higher the requirement, the lower the probability of suspected duplicate persons. The false recognition rates for different requirements are for reference only and can be adjusted according to the actual situation.</li></ul>
     */
    public void setUniquePersonControl(Long UniquePersonControl) {
        this.UniquePersonControl = UniquePersonControl;
    }

    /**
     * Get <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is very blurry, or at least one or more of the eyes, nose, or mouth are occluded; <br>2: general quality requirement, where the image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>3: high quality requirement, where the image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>4: very high quality requirement, where each dimension is optimal or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul> 
     * @return QualityControl <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is very blurry, or at least one or more of the eyes, nose, or mouth are occluded; <br>2: general quality requirement, where the image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>3: high quality requirement, where the image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>4: very high quality requirement, where each dimension is optimal or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is very blurry, or at least one or more of the eyes, nose, or mouth are occluded; <br>2: general quality requirement, where the image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>3: high quality requirement, where the image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>4: very high quality requirement, where each dimension is optimal or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     * @param QualityControl <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is very blurry, or at least one or more of the eyes, nose, or mouth are occluded; <br>2: general quality requirement, where the image is bright, dark, blurry or generally blurry, with at least three of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>3: high quality requirement, where the image is bright, dark, generally blurry, with one or two of the following: eyebrow occlusion, cheek occlusion, or chin occlusion; <br>4: very high quality requirement, where each dimension is optimal or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    /**
     * Get <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for disabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used to correctly detect and recognize human faces in an image when the faces are rotated and the image has no exif information. If image rotation recognition support is not enabled in this case, the faces cannot be detected or recognized.</li><li>If you confirm that the image contains exif information or that the human faces in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul> 
     * @return NeedRotateDetection <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for disabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used to correctly detect and recognize human faces in an image when the faces are rotated and the image has no exif information. If image rotation recognition support is not enabled in this case, the faces cannot be detected or recognized.</li><li>If you confirm that the image contains exif information or that the human faces in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for disabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used to correctly detect and recognize human faces in an image when the faces are rotated and the image has no exif information. If image rotation recognition support is not enabled in this case, the faces cannot be detected or recognized.</li><li>If you confirm that the image contains exif information or that the human faces in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     * @param NeedRotateDetection <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 for disabled, 1 for enabled.</li><li>Default value: 0.</li><li>This parameter is used to correctly detect and recognize human faces in an image when the faces are rotated and the image has no exif information. If image rotation recognition support is not enabled in this case, the faces cannot be detected or recognized.</li><li>If you confirm that the image contains exif information or that the human faces in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Get <p>Whether to encrypt the entire request body. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p> 
     * @return Encryption <p>Whether to encrypt the entire request body. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Whether to encrypt the entire request body. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     * @param Encryption <p>Whether to encrypt the entire request body. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
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

    public CreatePersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonRequest(CreatePersonRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.PersonExDescriptionInfos != null) {
            this.PersonExDescriptionInfos = new PersonExDescriptionInfo[source.PersonExDescriptionInfos.length];
            for (int i = 0; i < source.PersonExDescriptionInfos.length; i++) {
                this.PersonExDescriptionInfos[i] = new PersonExDescriptionInfo(source.PersonExDescriptionInfos[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UniquePersonControl != null) {
            this.UniquePersonControl = new Long(source.UniquePersonControl);
        }
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArrayObj(map, prefix + "PersonExDescriptionInfos.", this.PersonExDescriptionInfos);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UniquePersonControl", this.UniquePersonControl);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

