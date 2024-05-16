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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeMainlandIDCardOCRRequest extends AbstractModel {

    /**
    * The Base64 value of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The URL address of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * FRONT: The side of the ID card with the photo (portrait side), BACK: The side of the ID card with the national emblem (national emblem side). If this parameter is not filled in, the front and back of the ID card will be automatically determined for you.
    */
    @SerializedName("CardSide")
    @Expose
    private String CardSide;

    /**
    * Whether to return the ID card portrait, the default is false
    */
    @SerializedName("CropPortrait")
    @Expose
    private Boolean CropPortrait;

    /**
    * Whether to enable ID card photo cropping (removing excess edges outside the ID, automatically correcting the shooting angle), the default value is false
    */
    @SerializedName("CropIdCard")
    @Expose
    private Boolean CropIdCard;

    /**
     * Get The Base64 value of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used. 
     * @return ImageBase64 The Base64 value of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     * @param ImageBase64 The Base64 value of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. One of ImageUrl and ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The URL address of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability. 
     * @return ImageUrl The URL address of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL address of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     * @param ImageUrl The URL address of the image. The image is required to be no larger than 7M after Base64 encoding, and the resolution is recommended to be 500*800 or above. PNG, JPG, JPEG, and BMP formats are supported. It is recommended that the card part occupies at least 2/3 of the picture. It is recommended that images be stored in Tencent Cloud to ensure higher download speed and stability.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get FRONT: The side of the ID card with the photo (portrait side), BACK: The side of the ID card with the national emblem (national emblem side). If this parameter is not filled in, the front and back of the ID card will be automatically determined for you. 
     * @return CardSide FRONT: The side of the ID card with the photo (portrait side), BACK: The side of the ID card with the national emblem (national emblem side). If this parameter is not filled in, the front and back of the ID card will be automatically determined for you.
     */
    public String getCardSide() {
        return this.CardSide;
    }

    /**
     * Set FRONT: The side of the ID card with the photo (portrait side), BACK: The side of the ID card with the national emblem (national emblem side). If this parameter is not filled in, the front and back of the ID card will be automatically determined for you.
     * @param CardSide FRONT: The side of the ID card with the photo (portrait side), BACK: The side of the ID card with the national emblem (national emblem side). If this parameter is not filled in, the front and back of the ID card will be automatically determined for you.
     */
    public void setCardSide(String CardSide) {
        this.CardSide = CardSide;
    }

    /**
     * Get Whether to return the ID card portrait, the default is false 
     * @return CropPortrait Whether to return the ID card portrait, the default is false
     */
    public Boolean getCropPortrait() {
        return this.CropPortrait;
    }

    /**
     * Set Whether to return the ID card portrait, the default is false
     * @param CropPortrait Whether to return the ID card portrait, the default is false
     */
    public void setCropPortrait(Boolean CropPortrait) {
        this.CropPortrait = CropPortrait;
    }

    /**
     * Get Whether to enable ID card photo cropping (removing excess edges outside the ID, automatically correcting the shooting angle), the default value is false 
     * @return CropIdCard Whether to enable ID card photo cropping (removing excess edges outside the ID, automatically correcting the shooting angle), the default value is false
     */
    public Boolean getCropIdCard() {
        return this.CropIdCard;
    }

    /**
     * Set Whether to enable ID card photo cropping (removing excess edges outside the ID, automatically correcting the shooting angle), the default value is false
     * @param CropIdCard Whether to enable ID card photo cropping (removing excess edges outside the ID, automatically correcting the shooting angle), the default value is false
     */
    public void setCropIdCard(Boolean CropIdCard) {
        this.CropIdCard = CropIdCard;
    }

    public RecognizeMainlandIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeMainlandIDCardOCRRequest(RecognizeMainlandIDCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CardSide != null) {
            this.CardSide = new String(source.CardSide);
        }
        if (source.CropPortrait != null) {
            this.CropPortrait = new Boolean(source.CropPortrait);
        }
        if (source.CropIdCard != null) {
            this.CropIdCard = new Boolean(source.CropIdCard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CardSide", this.CardSide);
        this.setParamSimple(map, prefix + "CropPortrait", this.CropPortrait);
        this.setParamSimple(map, prefix + "CropIdCard", this.CropIdCard);

    }
}

