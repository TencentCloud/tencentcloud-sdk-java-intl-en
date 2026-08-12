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

public class DetectFaceSimilarityRequest extends AbstractModel {

    /**
    * <p>A base64-encoded image.</p><ul><li>The size after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000. The short side pixel for all formats must be greater than or equal to 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP formats. GIF images are not supported.</li></ul>
    */
    @SerializedName("ImageA")
    @Expose
    private String ImageA;

    /**
    * <p>base64 data of image B.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
    */
    @SerializedName("ImageB")
    @Expose
    private String ImageB;

    /**
    * <p>Url of Image A.</p><ul><li>Size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel for all formats must be not less than 64.</li><li>Either the Url or the Image of picture A must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of URLs not stored in Tencent Cloud may be impacted.</li><li>If the Image contains several faces, only the human face with the maximum area is selected.</li><li>Supports PNG, jpg, jpg, JPEG, BMP. GIF images are not supported.</li></ul>
    */
    @SerializedName("UrlA")
    @Expose
    private String UrlA;

    /**
    * <p>Url of Image B.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. For all formats, the short side pixel must be not less than 64.</li><li>Either the Url or the Image of picture B must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain degree.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
    */
    @SerializedName("UrlB")
    @Expose
    private String UrlB;

    /**
    * <p>Image quality control. </p><ul><li><p>Value ranges from 0 to 4:<br>0: No control;<br>1: Low quality requirement. The image has at least one of the following: super blurry, eye occlusion, nose occlusion, or mouth occlusion;<br>2: Normal quality requirement. The image has at least three of the following: too bright, dark, blurry, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>3: Relatively high quality requirement. The image has one or two of the following: too bright, dark, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>4: High quality requirement. All dimensions are the best or most, with a minor problem in one dimension;<br>Default is 0. </p></li><li><p>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</p></li></ul>
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
     * Get <p>A base64-encoded image.</p><ul><li>The size after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000. The short side pixel for all formats must be greater than or equal to 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP formats. GIF images are not supported.</li></ul> 
     * @return ImageA <p>A base64-encoded image.</p><ul><li>The size after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000. The short side pixel for all formats must be greater than or equal to 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP formats. GIF images are not supported.</li></ul>
     */
    public String getImageA() {
        return this.ImageA;
    }

    /**
     * Set <p>A base64-encoded image.</p><ul><li>The size after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000. The short side pixel for all formats must be greater than or equal to 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP formats. GIF images are not supported.</li></ul>
     * @param ImageA <p>A base64-encoded image.</p><ul><li>The size after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000. The short side pixel for all formats must be greater than or equal to 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP formats. GIF images are not supported.</li></ul>
     */
    public void setImageA(String ImageA) {
        this.ImageA = ImageA;
    }

    /**
     * Get <p>base64 data of image B.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul> 
     * @return ImageB <p>base64 data of image B.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     */
    public String getImageB() {
        return this.ImageB;
    }

    /**
     * Set <p>base64 data of image B.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     * @param ImageB <p>base64 data of image B.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel of images in all formats must not be less than 64.</li><li>If the image contains several faces, only the face with the highest confidence degree is selected.</li><li>Supports PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     */
    public void setImageB(String ImageB) {
        this.ImageB = ImageB;
    }

    /**
     * Get <p>Url of Image A.</p><ul><li>Size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel for all formats must be not less than 64.</li><li>Either the Url or the Image of picture A must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of URLs not stored in Tencent Cloud may be impacted.</li><li>If the Image contains several faces, only the human face with the maximum area is selected.</li><li>Supports PNG, jpg, jpg, JPEG, BMP. GIF images are not supported.</li></ul> 
     * @return UrlA <p>Url of Image A.</p><ul><li>Size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel for all formats must be not less than 64.</li><li>Either the Url or the Image of picture A must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of URLs not stored in Tencent Cloud may be impacted.</li><li>If the Image contains several faces, only the human face with the maximum area is selected.</li><li>Supports PNG, jpg, jpg, JPEG, BMP. GIF images are not supported.</li></ul>
     */
    public String getUrlA() {
        return this.UrlA;
    }

    /**
     * Set <p>Url of Image A.</p><ul><li>Size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel for all formats must be not less than 64.</li><li>Either the Url or the Image of picture A must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of URLs not stored in Tencent Cloud may be impacted.</li><li>If the Image contains several faces, only the human face with the maximum area is selected.</li><li>Supports PNG, jpg, jpg, JPEG, BMP. GIF images are not supported.</li></ul>
     * @param UrlA <p>Url of Image A.</p><ul><li>Size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel cannot exceed 2000. The short side pixel for all formats must be not less than 64.</li><li>Either the Url or the Image of picture A must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of URLs not stored in Tencent Cloud may be impacted.</li><li>If the Image contains several faces, only the human face with the maximum area is selected.</li><li>Supports PNG, jpg, jpg, JPEG, BMP. GIF images are not supported.</li></ul>
     */
    public void setUrlA(String UrlA) {
        this.UrlA = UrlA;
    }

    /**
     * Get <p>Url of Image B.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. For all formats, the short side pixel must be not less than 64.</li><li>Either the Url or the Image of picture B must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain degree.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul> 
     * @return UrlB <p>Url of Image B.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. For all formats, the short side pixel must be not less than 64.</li><li>Either the Url or the Image of picture B must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain degree.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public String getUrlB() {
        return this.UrlB;
    }

    /**
     * Set <p>Url of Image B.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. For all formats, the short side pixel must be not less than 64.</li><li>Either the Url or the Image of picture B must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain degree.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     * @param UrlB <p>Url of Image B.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5 MB.</li><li>For jpg format, the long side pixel cannot exceed 4000. For other formats, the long side pixel cannot exceed 2000. For all formats, the short side pixel must be not less than 64.</li><li>Either the Url or the Image of picture B must be provided. If both are provided, only the Url is used.</li><li>URLs of images stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>The speed and stability of URLs not stored in Tencent Cloud may be affected to a certain degree.</li><li>If the Image contains several faces, only the face with the maximum area is selected.</li><li>PNG, jpg, JPEG, and BMP are supported. GIF images are not supported.</li></ul>
     */
    public void setUrlB(String UrlB) {
        this.UrlB = UrlB;
    }

    /**
     * Get <p>Image quality control. </p><ul><li><p>Value ranges from 0 to 4:<br>0: No control;<br>1: Low quality requirement. The image has at least one of the following: super blurry, eye occlusion, nose occlusion, or mouth occlusion;<br>2: Normal quality requirement. The image has at least three of the following: too bright, dark, blurry, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>3: Relatively high quality requirement. The image has one or two of the following: too bright, dark, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>4: High quality requirement. All dimensions are the best or most, with a minor problem in one dimension;<br>Default is 0. </p></li><li><p>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</p></li></ul> 
     * @return QualityControl <p>Image quality control. </p><ul><li><p>Value ranges from 0 to 4:<br>0: No control;<br>1: Low quality requirement. The image has at least one of the following: super blurry, eye occlusion, nose occlusion, or mouth occlusion;<br>2: Normal quality requirement. The image has at least three of the following: too bright, dark, blurry, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>3: Relatively high quality requirement. The image has one or two of the following: too bright, dark, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>4: High quality requirement. All dimensions are the best or most, with a minor problem in one dimension;<br>Default is 0. </p></li><li><p>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</p></li></ul>
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set <p>Image quality control. </p><ul><li><p>Value ranges from 0 to 4:<br>0: No control;<br>1: Low quality requirement. The image has at least one of the following: super blurry, eye occlusion, nose occlusion, or mouth occlusion;<br>2: Normal quality requirement. The image has at least three of the following: too bright, dark, blurry, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>3: Relatively high quality requirement. The image has one or two of the following: too bright, dark, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>4: High quality requirement. All dimensions are the best or most, with a minor problem in one dimension;<br>Default is 0. </p></li><li><p>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</p></li></ul>
     * @param QualityControl <p>Image quality control. </p><ul><li><p>Value ranges from 0 to 4:<br>0: No control;<br>1: Low quality requirement. The image has at least one of the following: super blurry, eye occlusion, nose occlusion, or mouth occlusion;<br>2: Normal quality requirement. The image has at least three of the following: too bright, dark, blurry, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>3: Relatively high quality requirement. The image has one or two of the following: too bright, dark, normal blur, eyebrow obstruction, cheek obstruction, or chin obstruction;<br>4: High quality requirement. All dimensions are the best or most, with a minor problem in one dimension;<br>Default is 0. </p></li><li><p>If the image quality fails to satisfy the requirement, the returned result will prompt that the image quality detection does not meet the requirement.</p></li></ul>
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    public DetectFaceSimilarityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectFaceSimilarityRequest(DetectFaceSimilarityRequest source) {
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
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
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
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);

    }
}

