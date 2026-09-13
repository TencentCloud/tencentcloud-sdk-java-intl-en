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

public class HmtResidentPermitOCRRequest extends AbstractModel {

    /**
    * <p>Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after the downloaded image is Base64-encoded. The image download must complete within 3 seconds.Either ImageUrl or ImageBase64 must be provided. If both are provided, only ImageUrl is used.</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>Image URL.Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time no more than 3 seconds. URLs stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. Speed and stability may be impacted for URLs not stored in Tencent Cloud.</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>FRONT: the side with a photo (portrait side),<br>BACK: the side without a photo (national emblem side),<br>if this parameter is left empty or incorrect, the front or back side is automatically determined for you.</p>
    */
    @SerializedName("CardSide")
    @Expose
    private String CardSide;

    /**
    * Whether to return the portrait image and position coordinates
    */
    @SerializedName("CropPortrait")
    @Expose
    private Boolean CropPortrait;

    /**
     * Get <p>Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after the downloaded image is Base64-encoded. The image download must complete within 3 seconds.Either ImageUrl or ImageBase64 must be provided. If both are provided, only ImageUrl is used.</p> 
     * @return ImageBase64 <p>Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after the downloaded image is Base64-encoded. The image download must complete within 3 seconds.Either ImageUrl or ImageBase64 must be provided. If both are provided, only ImageUrl is used.</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after the downloaded image is Base64-encoded. The image download must complete within 3 seconds.Either ImageUrl or ImageBase64 must be provided. If both are provided, only ImageUrl is used.</p>
     * @param ImageBase64 <p>Base64 value of the image. Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after the downloaded image is Base64-encoded. The image download must complete within 3 seconds.Either ImageUrl or ImageBase64 must be provided. If both are provided, only ImageUrl is used.</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>Image URL.Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time no more than 3 seconds. URLs stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. Speed and stability may be impacted for URLs not stored in Tencent Cloud.</p> 
     * @return ImageUrl <p>Image URL.Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time no more than 3 seconds. URLs stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. Speed and stability may be impacted for URLs not stored in Tencent Cloud.</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>Image URL.Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time no more than 3 seconds. URLs stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. Speed and stability may be impacted for URLs not stored in Tencent Cloud.</p>
     * @param ImageUrl <p>Image URL.Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported. Supported image size: no more than 7M after Base64 encoding. Image download time no more than 3 seconds. URLs stored in Tencent Cloud guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. Speed and stability may be impacted for URLs not stored in Tencent Cloud.</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>FRONT: the side with a photo (portrait side),<br>BACK: the side without a photo (national emblem side),<br>if this parameter is left empty or incorrect, the front or back side is automatically determined for you.</p> 
     * @return CardSide <p>FRONT: the side with a photo (portrait side),<br>BACK: the side without a photo (national emblem side),<br>if this parameter is left empty or incorrect, the front or back side is automatically determined for you.</p>
     */
    public String getCardSide() {
        return this.CardSide;
    }

    /**
     * Set <p>FRONT: the side with a photo (portrait side),<br>BACK: the side without a photo (national emblem side),<br>if this parameter is left empty or incorrect, the front or back side is automatically determined for you.</p>
     * @param CardSide <p>FRONT: the side with a photo (portrait side),<br>BACK: the side without a photo (national emblem side),<br>if this parameter is left empty or incorrect, the front or back side is automatically determined for you.</p>
     */
    public void setCardSide(String CardSide) {
        this.CardSide = CardSide;
    }

    /**
     * Get Whether to return the portrait image and position coordinates 
     * @return CropPortrait Whether to return the portrait image and position coordinates
     */
    public Boolean getCropPortrait() {
        return this.CropPortrait;
    }

    /**
     * Set Whether to return the portrait image and position coordinates
     * @param CropPortrait Whether to return the portrait image and position coordinates
     */
    public void setCropPortrait(Boolean CropPortrait) {
        this.CropPortrait = CropPortrait;
    }

    public HmtResidentPermitOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HmtResidentPermitOCRRequest(HmtResidentPermitOCRRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CardSide", this.CardSide);
        this.setParamSimple(map, prefix + "CropPortrait", this.CropPortrait);

    }
}

