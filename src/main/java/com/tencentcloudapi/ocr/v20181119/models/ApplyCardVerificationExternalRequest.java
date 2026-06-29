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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyCardVerificationExternalRequest extends AbstractModel {

    /**
    * Country/Region of the document. For the full list of supported countries/regions, refer to the API description.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Document type. Supported values: ID_CARD, PASSPORT, DRIVING_LICENSE, RESIDENCE_PERMIT (only supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * Base64-encoded image of the document front.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
    */
    @SerializedName("ImageBase64Front")
    @Expose
    private String ImageBase64Front;

    /**
    * The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. Image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
    */
    @SerializedName("ImageBase64Back")
    @Expose
    private String ImageBase64Back;

    /**
    * URL of the document front image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
    */
    @SerializedName("ImageUrlFront")
    @Expose
    private String ImageUrlFront;

    /**
    * URL of the document back image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: For some documents, you must provide either ImageUrlBack or ImageBase64Back. If both are provided, only ImageUrlBack is used.
    */
    @SerializedName("ImageUrlBack")
    @Expose
    private String ImageUrlBack;

    /**
    * Whether to crop and return the face image from the document. Default: false.
If set to true, the image constraints are:
- Size after Base64 encoding must not exceed 5 MB.
- Maximum pixel width/height: 4000 for JPG, 2000 for other formats.
- Minimum pixel width/height: 64.
- Supported formats: PNG, JPG, JPEG, BMP (GIF not supported).
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
     * Get Country/Region of the document. For the full list of supported countries/regions, refer to the API description. 
     * @return Nationality Country/Region of the document. For the full list of supported countries/regions, refer to the API description.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Country/Region of the document. For the full list of supported countries/regions, refer to the API description.
     * @param Nationality Country/Region of the document. For the full list of supported countries/regions, refer to the API description.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Document type. Supported values: ID_CARD, PASSPORT, DRIVING_LICENSE, RESIDENCE_PERMIT (only supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore). 
     * @return CardType Document type. Supported values: ID_CARD, PASSPORT, DRIVING_LICENSE, RESIDENCE_PERMIT (only supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set Document type. Supported values: ID_CARD, PASSPORT, DRIVING_LICENSE, RESIDENCE_PERMIT (only supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
     * @param CardType Document type. Supported values: ID_CARD, PASSPORT, DRIVING_LICENSE, RESIDENCE_PERMIT (only supported in certain countries/regions, including Australia, Canada, Germany, New Zealand, Nigeria, Singapore).
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get Base64-encoded image of the document front.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used. 
     * @return ImageBase64Front Base64-encoded image of the document front.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
     */
    public String getImageBase64Front() {
        return this.ImageBase64Front;
    }

    /**
     * Set Base64-encoded image of the document front.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
     * @param ImageBase64Front Base64-encoded image of the document front.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
     */
    public void setImageBase64Front(String ImageBase64Front) {
        this.ImageBase64Front = ImageBase64Front;
    }

    /**
     * Get The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. Image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used. 
     * @return ImageBase64Back The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. Image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
     */
    public String getImageBase64Back() {
        return this.ImageBase64Back;
    }

    /**
     * Set The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. Image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
     * @param ImageBase64Back The Base64 value of the reverse side of the document. Supported image formats: PNG, JPG/JPEG. 
Supported image size: the downloaded image after Base64 encoding must be no more than 2M. Image download time must be no more than 5 seconds. 
Supported image resolution: between 256 \* 256 and 4096 \* 4096. For some documents, either ImageUrlBack or ImageBase64Back must be provided. If both are provided, only ImageUrlBack is used.
     */
    public void setImageBase64Back(String ImageBase64Back) {
        this.ImageBase64Back = ImageBase64Back;
    }

    /**
     * Get URL of the document front image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used. 
     * @return ImageUrlFront URL of the document front image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
     */
    public String getImageUrlFront() {
        return this.ImageUrlFront;
    }

    /**
     * Set URL of the document front image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
     * @param ImageUrlFront URL of the document front image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: You must provide either ImageUrlFront or ImageBase64Front. If both are provided, only ImageUrlFront is used.
     */
    public void setImageUrlFront(String ImageUrlFront) {
        this.ImageUrlFront = ImageUrlFront;
    }

    /**
     * Get URL of the document back image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: For some documents, you must provide either ImageUrlBack or ImageBase64Back. If both are provided, only ImageUrlBack is used. 
     * @return ImageUrlBack URL of the document back image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: For some documents, you must provide either ImageUrlBack or ImageBase64Back. If both are provided, only ImageUrlBack is used.
     */
    public String getImageUrlBack() {
        return this.ImageUrlBack;
    }

    /**
     * Set URL of the document back image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: For some documents, you must provide either ImageUrlBack or ImageBase64Back. If both are provided, only ImageUrlBack is used.
     * @param ImageUrlBack URL of the document back image.
Supported image formats: PNG, JPG/JPEG (GIF not supported).
Supported image size: The downloaded image after Base64 encoding must not exceed 2 MB. Image download time must not exceed 5 seconds.
Supported image resolution: Between 256*256 and 4096*4096 pixels.
Note: For some documents, you must provide either ImageUrlBack or ImageBase64Back. If both are provided, only ImageUrlBack is used.
     */
    public void setImageUrlBack(String ImageUrlBack) {
        this.ImageUrlBack = ImageUrlBack;
    }

    /**
     * Get Whether to crop and return the face image from the document. Default: false.
If set to true, the image constraints are:
- Size after Base64 encoding must not exceed 5 MB.
- Maximum pixel width/height: 4000 for JPG, 2000 for other formats.
- Minimum pixel width/height: 64.
- Supported formats: PNG, JPG, JPEG, BMP (GIF not supported). 
     * @return ReturnHeadImage Whether to crop and return the face image from the document. Default: false.
If set to true, the image constraints are:
- Size after Base64 encoding must not exceed 5 MB.
- Maximum pixel width/height: 4000 for JPG, 2000 for other formats.
- Minimum pixel width/height: 64.
- Supported formats: PNG, JPG, JPEG, BMP (GIF not supported).
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set Whether to crop and return the face image from the document. Default: false.
If set to true, the image constraints are:
- Size after Base64 encoding must not exceed 5 MB.
- Maximum pixel width/height: 4000 for JPG, 2000 for other formats.
- Minimum pixel width/height: 64.
- Supported formats: PNG, JPG, JPEG, BMP (GIF not supported).
     * @param ReturnHeadImage Whether to crop and return the face image from the document. Default: false.
If set to true, the image constraints are:
- Size after Base64 encoding must not exceed 5 MB.
- Maximum pixel width/height: 4000 for JPG, 2000 for other formats.
- Minimum pixel width/height: 64.
- Supported formats: PNG, JPG, JPEG, BMP (GIF not supported).
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    public ApplyCardVerificationExternalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCardVerificationExternalRequest(ApplyCardVerificationExternalRequest source) {
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.ImageBase64Front != null) {
            this.ImageBase64Front = new String(source.ImageBase64Front);
        }
        if (source.ImageBase64Back != null) {
            this.ImageBase64Back = new String(source.ImageBase64Back);
        }
        if (source.ImageUrlFront != null) {
            this.ImageUrlFront = new String(source.ImageUrlFront);
        }
        if (source.ImageUrlBack != null) {
            this.ImageUrlBack = new String(source.ImageUrlBack);
        }
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "ImageBase64Front", this.ImageBase64Front);
        this.setParamSimple(map, prefix + "ImageBase64Back", this.ImageBase64Back);
        this.setParamSimple(map, prefix + "ImageUrlFront", this.ImageUrlFront);
        this.setParamSimple(map, prefix + "ImageUrlBack", this.ImageUrlBack);
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);

    }
}

