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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyCardVerificationRequest extends AbstractModel {

    /**
    * Please select the country code of ID document.
IDN: Indonesia
HKG: Hong Kong
THA: Thailand
MYS: Malaysia
SGP: Singapore
JPN: Japan
TWN:Taiwan
AUTO: Automatic Identification
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Please select the type of ID document. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * Base64 value for the front of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding.
The image download takes no more than 3 seconds. Supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64 Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
    */
    @SerializedName("ImageBase64Front")
    @Expose
    private String ImageBase64Front;

    /**
    * Base64 value of the reverse side of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
    */
    @SerializedName("ImageBase64Back")
    @Expose
    private String ImageBase64Back;

    /**
    * The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
    */
    @SerializedName("ImageUrlFront")
    @Expose
    private String ImageUrlFront;

    /**
    * The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
    */
    @SerializedName("ImageUrlBack")
    @Expose
    private String ImageUrlBack;

    /**
     * Get Please select the country code of ID document.
IDN: Indonesia
HKG: Hong Kong
THA: Thailand
MYS: Malaysia
SGP: Singapore
JPN: Japan
TWN:Taiwan
AUTO: Automatic Identification 
     * @return Nationality Please select the country code of ID document.
IDN: Indonesia
HKG: Hong Kong
THA: Thailand
MYS: Malaysia
SGP: Singapore
JPN: Japan
TWN:Taiwan
AUTO: Automatic Identification
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Please select the country code of ID document.
IDN: Indonesia
HKG: Hong Kong
THA: Thailand
MYS: Malaysia
SGP: Singapore
JPN: Japan
TWN:Taiwan
AUTO: Automatic Identification
     * @param Nationality Please select the country code of ID document.
IDN: Indonesia
HKG: Hong Kong
THA: Thailand
MYS: Malaysia
SGP: Singapore
JPN: Japan
TWN:Taiwan
AUTO: Automatic Identification
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Please select the type of ID document. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO 
     * @return CardType Please select the type of ID document. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set Please select the type of ID document. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO
     * @param CardType Please select the type of ID document. The supported options are:
ID_CARD
PASSPORT
DRIVING_LICENSE
AUTO
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get Base64 value for the front of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding.
The image download takes no more than 3 seconds. Supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64 Front of the image must be provided. If both are provided, only ImageUrlFront will be used. 
     * @return ImageBase64Front Base64 value for the front of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding.
The image download takes no more than 3 seconds. Supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64 Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public String getImageBase64Front() {
        return this.ImageBase64Front;
    }

    /**
     * Set Base64 value for the front of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding.
The image download takes no more than 3 seconds. Supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64 Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
     * @param ImageBase64Front Base64 value for the front of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding.
The image download takes no more than 3 seconds. Supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64 Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public void setImageBase64Front(String ImageBase64Front) {
        this.ImageBase64Front = ImageBase64Front;
    }

    /**
     * Get Base64 value of the reverse side of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used. 
     * @return ImageBase64Back Base64 value of the reverse side of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
     */
    public String getImageBase64Back() {
        return this.ImageBase64Back;
    }

    /**
     * Set Base64 value of the reverse side of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
     * @param ImageBase64Back Base64 value of the reverse side of the document. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
     */
    public void setImageBase64Back(String ImageBase64Back) {
        this.ImageBase64Back = ImageBase64Back;
    }

    /**
     * Get The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64Front of the image must be provided. If both are provided, only ImageUrlFront will be used. 
     * @return ImageUrlFront The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public String getImageUrlFront() {
        return this.ImageUrlFront;
    }

    /**
     * Set The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
     * @param ImageUrlFront The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. One of ImageUrlFront and ImageBase64Front of the image must be provided. If both are provided, only ImageUrlFront will be used.
     */
    public void setImageUrlFront(String ImageUrlFront) {
        this.ImageUrlFront = ImageUrlFront;
    }

    /**
     * Get The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used. 
     * @return ImageUrlBack The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
     */
    public String getImageUrlBack() {
        return this.ImageUrlBack;
    }

    /**
     * Set The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
     * @param ImageUrlBack The URL value on the back of the certificate. Supported image formats: PNG, JPEG. GIF format is not supported yet. Supported image size: The downloaded image cannot exceed 5M after Base64 encoding. The image download takes no more than 3 seconds. Maximum supported image resolution: 8000*8000. For some certificates, one of ImageUrlBack and ImageBase64Back must be provided. If both are provided, only ImageUrlBack will be used.
     */
    public void setImageUrlBack(String ImageUrlBack) {
        this.ImageUrlBack = ImageUrlBack;
    }

    public ApplyCardVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCardVerificationRequest(ApplyCardVerificationRequest source) {
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

    }
}

