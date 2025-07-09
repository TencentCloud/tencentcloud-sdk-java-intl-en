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
    * A image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
    */
    @SerializedName("ImageA")
    @Expose
    private String ImageA;

    /**
    * B image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
    */
    @SerializedName("ImageB")
    @Expose
    private String ImageB;

    /**
    * A URL for the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- A The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
    */
    @SerializedName("UrlA")
    @Expose
    private String UrlA;

    /**
    * B The URL of the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- B The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
    */
    @SerializedName("UrlB")
    @Expose
    private String UrlB;

    /**
    * Image quality control. 
- Value range: 0: No control; 1: Lower quality requirements, the image is very blurry, and the eyes, nose, and mouth cover at least one or more of them; 2: General quality requirements, the image is bright, Dark, blurry or generally blurred, eyebrows covered, cheeks covered, chin covered, at least three of them; 3: High quality requirements, the image may be brighter, darker, generally blurry, eyebrows blocked, cheeks blocked, chin blocked, one or two of them; 4: Very high quality requirements, all dimensions are the best or the most , there is a slight problem in one dimension; default is 0. 
- If the image quality does not meet the requirements, the returned result will prompt that the image quality test does not meet the requirements.
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
     * Get A image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images. 
     * @return ImageA A image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public String getImageA() {
        return this.ImageA;
    }

    /**
     * Set A image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     * @param ImageA A image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public void setImageA(String ImageA) {
        this.ImageA = ImageA;
    }

    /**
     * Get B image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images. 
     * @return ImageB B image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public String getImageB() {
        return this.ImageB;
    }

    /**
     * Set B image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     * @param ImageB B image base64 data.
 - The size after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- If the picture contains multiple faces, only the face with the highest confidence is selected. - Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public void setImageB(String ImageB) {
        this.ImageB = ImageB;
    }

    /**
     * Get A URL for the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- A The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images. 
     * @return UrlA A URL for the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- A The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public String getUrlA() {
        return this.UrlA;
    }

    /**
     * Set A URL for the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- A The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     * @param UrlA A URL for the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- A The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public void setUrlA(String UrlA) {
        this.UrlA = UrlA;
    }

    /**
     * Get B The URL of the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- B The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images. 
     * @return UrlB B The URL of the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- B The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public String getUrlB() {
        return this.UrlB;
    }

    /**
     * Set B The URL of the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- B The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     * @param UrlB B The URL of the image. 
- The size of the corresponding image after base64 encoding cannot exceed 5M. 
- The long side pixels of jpg format cannot exceed 4000, and the long side pixels of pictures in other formats cannot exceed 2000. The short side of images in all formats must be no less than 64 pixels. 
- B The URL and Image of the picture must be provided. If both are provided, only the Url will be used. 
- Images stored in Tencent Cloud's Url can ensure higher download speed and stability. It is recommended that images be stored in Tencent Cloud. 
- The URL speed and stability of non-Tencent cloud storage may be affected to a certain extent. 
- If the picture contains multiple faces, only the face with the largest face area is selected. 
- Supports PNG, JPG, JPEG, BMP, but does not support GIF images.
     */
    public void setUrlB(String UrlB) {
        this.UrlB = UrlB;
    }

    /**
     * Get Image quality control. 
- Value range: 0: No control; 1: Lower quality requirements, the image is very blurry, and the eyes, nose, and mouth cover at least one or more of them; 2: General quality requirements, the image is bright, Dark, blurry or generally blurred, eyebrows covered, cheeks covered, chin covered, at least three of them; 3: High quality requirements, the image may be brighter, darker, generally blurry, eyebrows blocked, cheeks blocked, chin blocked, one or two of them; 4: Very high quality requirements, all dimensions are the best or the most , there is a slight problem in one dimension; default is 0. 
- If the image quality does not meet the requirements, the returned result will prompt that the image quality test does not meet the requirements. 
     * @return QualityControl Image quality control. 
- Value range: 0: No control; 1: Lower quality requirements, the image is very blurry, and the eyes, nose, and mouth cover at least one or more of them; 2: General quality requirements, the image is bright, Dark, blurry or generally blurred, eyebrows covered, cheeks covered, chin covered, at least three of them; 3: High quality requirements, the image may be brighter, darker, generally blurry, eyebrows blocked, cheeks blocked, chin blocked, one or two of them; 4: Very high quality requirements, all dimensions are the best or the most , there is a slight problem in one dimension; default is 0. 
- If the image quality does not meet the requirements, the returned result will prompt that the image quality test does not meet the requirements.
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set Image quality control. 
- Value range: 0: No control; 1: Lower quality requirements, the image is very blurry, and the eyes, nose, and mouth cover at least one or more of them; 2: General quality requirements, the image is bright, Dark, blurry or generally blurred, eyebrows covered, cheeks covered, chin covered, at least three of them; 3: High quality requirements, the image may be brighter, darker, generally blurry, eyebrows blocked, cheeks blocked, chin blocked, one or two of them; 4: Very high quality requirements, all dimensions are the best or the most , there is a slight problem in one dimension; default is 0. 
- If the image quality does not meet the requirements, the returned result will prompt that the image quality test does not meet the requirements.
     * @param QualityControl Image quality control. 
- Value range: 0: No control; 1: Lower quality requirements, the image is very blurry, and the eyes, nose, and mouth cover at least one or more of them; 2: General quality requirements, the image is bright, Dark, blurry or generally blurred, eyebrows covered, cheeks covered, chin covered, at least three of them; 3: High quality requirements, the image may be brighter, darker, generally blurry, eyebrows blocked, cheeks blocked, chin blocked, one or two of them; 4: Very high quality requirements, all dimensions are the best or the most , there is a slight problem in one dimension; default is 0. 
- If the image quality does not meet the requirements, the returned result will prompt that the image quality test does not meet the requirements.
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

