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

public class CreateFaceRequest extends AbstractModel {

    /**
    * <p>Person ID, which is the PersonId in the person creation API.</p>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>base64 data of the image.</p><ul><li>base64 encoded size must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the image long edge must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>The total number of faces must not exceed 5.</li><li>If the image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other Image formats, the long side pixel must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud URLs can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of non-Tencent Cloud Storage URLs may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li><li>The total number of human faces must not exceed 5.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li></ul>
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * <p>Only faces with a similarity to the person's existing faces exceeding the FaceMatchThreshold can be added successfully. </p><ul><li>Default value: 60. </li><li>Value range: [0,100]. </li></ul>
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is super blurry, or at least one or more of the following exist: eye occlusion, nose occlusion, or mouth occlusion; <br>2: normal quality requirement, where the image is bright, dark, blurry or generally blurry, or at least three of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>3: high quality requirement, where the image is bright, dark, generally blurry, or one to two of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>4: super high quality requirement, where each dimension is at its best or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 means not enabled, 1 means enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected or recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
    * <p>Whether full-body encryption is required for the request information. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get <p>Person ID, which is the PersonId in the person creation API.</p> 
     * @return PersonId <p>Person ID, which is the PersonId in the person creation API.</p>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>Person ID, which is the PersonId in the person creation API.</p>
     * @param PersonId <p>Person ID, which is the PersonId in the person creation API.</p>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>base64 data of the image.</p><ul><li>base64 encoded size must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the image long edge must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>The total number of faces must not exceed 5.</li><li>If the image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul> 
     * @return Images <p>base64 data of the image.</p><ul><li>base64 encoded size must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the image long edge must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>The total number of faces must not exceed 5.</li><li>If the image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>base64 data of the image.</p><ul><li>base64 encoded size must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the image long edge must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>The total number of faces must not exceed 5.</li><li>If the image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     * @param Images <p>base64 data of the image.</p><ul><li>base64 encoded size must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the image long edge must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>The total number of faces must not exceed 5.</li><li>If the image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other Image formats, the long side pixel must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud URLs can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of non-Tencent Cloud Storage URLs may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li><li>The total number of human faces must not exceed 5.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li></ul> 
     * @return Urls <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other Image formats, the long side pixel must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud URLs can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of non-Tencent Cloud Storage URLs may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li><li>The total number of human faces must not exceed 5.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li></ul>
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other Image formats, the long side pixel must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud URLs can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of non-Tencent Cloud Storage URLs may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li><li>The total number of human faces must not exceed 5.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li></ul>
     * @param Urls <p>Image Url.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other Image formats, the long side pixel must not exceed 2000. The short side pixel of images in all formats must be not less than 64.</li><li>Either Url or Image must be provided. If both are provided, only Url is used.</li><li>Images stored in Tencent Cloud URLs can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of non-Tencent Cloud Storage URLs may be affected to a certain extent.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li><li>The total number of human faces must not exceed 5.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li></ul>
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get <p>Only faces with a similarity to the person's existing faces exceeding the FaceMatchThreshold can be added successfully. </p><ul><li>Default value: 60. </li><li>Value range: [0,100]. </li></ul> 
     * @return FaceMatchThreshold <p>Only faces with a similarity to the person's existing faces exceeding the FaceMatchThreshold can be added successfully. </p><ul><li>Default value: 60. </li><li>Value range: [0,100]. </li></ul>
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set <p>Only faces with a similarity to the person's existing faces exceeding the FaceMatchThreshold can be added successfully. </p><ul><li>Default value: 60. </li><li>Value range: [0,100]. </li></ul>
     * @param FaceMatchThreshold <p>Only faces with a similarity to the person's existing faces exceeding the FaceMatchThreshold can be added successfully. </p><ul><li>Default value: 60. </li><li>Value range: [0,100]. </li></ul>
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is super blurry, or at least one or more of the following exist: eye occlusion, nose occlusion, or mouth occlusion; <br>2: normal quality requirement, where the image is bright, dark, blurry or generally blurry, or at least three of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>3: high quality requirement, where the image is bright, dark, generally blurry, or one to two of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>4: super high quality requirement, where each dimension is at its best or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul> 
     * @return QualityControl <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is super blurry, or at least one or more of the following exist: eye occlusion, nose occlusion, or mouth occlusion; <br>2: normal quality requirement, where the image is bright, dark, blurry or generally blurry, or at least three of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>3: high quality requirement, where the image is bright, dark, generally blurry, or one to two of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>4: super high quality requirement, where each dimension is at its best or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is super blurry, or at least one or more of the following exist: eye occlusion, nose occlusion, or mouth occlusion; <br>2: normal quality requirement, where the image is bright, dark, blurry or generally blurry, or at least three of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>3: high quality requirement, where the image is bright, dark, generally blurry, or one to two of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>4: super high quality requirement, where each dimension is at its best or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     * @param QualityControl <p>Image quality control. </p><ul><li>Value range: <br>0: no control; <br>1: low quality requirement, where the image is super blurry, or at least one or more of the following exist: eye occlusion, nose occlusion, or mouth occlusion; <br>2: normal quality requirement, where the image is bright, dark, blurry or generally blurry, or at least three of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>3: high quality requirement, where the image is bright, dark, generally blurry, or one to two of the following exist: eyebrow obstruction, cheek obstruction, or chin obstruction; <br>4: super high quality requirement, where each dimension is at its best or at most one dimension has a minor problem; </li><li>Default: 0. </li><li>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</li></ul>
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    /**
     * Get <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 means not enabled, 1 means enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected or recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul> 
     * @return NeedRotateDetection <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 means not enabled, 1 means enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected or recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 means not enabled, 1 means enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected or recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     * @param NeedRotateDetection <p>Whether to enable image rotation recognition support.</p><ul><li>Value range: 0 means not enabled, 1 means enabled.</li><li>Default value: 0.</li><li>This parameter is used when the human face in the image is rotated and the image has no exif information. If image rotation recognition support is not enabled, the human face in the image cannot be correctly detected or recognized.</li><li>If you confirm that the image contains exif information or that the human face in the input image will not be rotated, do not enable this parameter. Once enabled, the overall duration may increase by several hundred milliseconds.</li></ul>
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Get <p>Whether full-body encryption is required for the request information. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p> 
     * @return Encryption <p>Whether full-body encryption is required for the request information. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Whether full-body encryption is required for the request information. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     * @param Encryption <p>Whether full-body encryption is required for the request information. Supported encryption algorithm: AES-256-CBC. Users with encryption requirements can use this parameter.</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p> 
     * @return EncryptedBody <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
     * @param EncryptedBody <p>Encrypted ciphertext. The data format before encryption is as follows: {&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    public CreateFaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFaceRequest(CreateFaceRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.FaceMatchThreshold != null) {
            this.FaceMatchThreshold = new Float(source.FaceMatchThreshold);
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
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

