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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdCardOCRVerificationRequest extends AbstractModel {

    /**
    * Identity card number.
-Name, identity card number, ImageBase64, or ImageUrl must provide one of the three.
-If both are provided, proceed to use parameters according to the priority of name and identity card number > ImageBase64 > ImageUrl.
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Base64 value of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image after Base64 encoding is no more than 3M. Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Url of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image is no more than 3M after Base64 encoding. Image download time is no more than 3 seconds.
-Images stored on Tencent Cloud's Url guarantee higher download speed and stability. It is advisable to store images on Tencent Cloud.
-The speed and stability of non-Tencent Cloud Storage URLs may be impacted.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get Identity card number.
-Name, identity card number, ImageBase64, or ImageUrl must provide one of the three.
-If both are provided, proceed to use parameters according to the priority of name and identity card number > ImageBase64 > ImageUrl. 
     * @return IdCard Identity card number.
-Name, identity card number, ImageBase64, or ImageUrl must provide one of the three.
-If both are provided, proceed to use parameters according to the priority of name and identity card number > ImageBase64 > ImageUrl.
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set Identity card number.
-Name, identity card number, ImageBase64, or ImageUrl must provide one of the three.
-If both are provided, proceed to use parameters according to the priority of name and identity card number > ImageBase64 > ImageUrl.
     * @param IdCard Identity card number.
-Name, identity card number, ImageBase64, or ImageUrl must provide one of the three.
-If both are provided, proceed to use parameters according to the priority of name and identity card number > ImageBase64 > ImageUrl.
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Base64 value of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image after Base64 encoding is no more than 3M. Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the coding specification. 
     * @return ImageBase64 Base64 value of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image after Base64 encoding is no more than 3M. Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64 value of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image after Base64 encoding is no more than 3M. Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.
     * @param ImageBase64 Base64 value of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image after Base64 encoding is no more than 3M. Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Url of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image is no more than 3M after Base64 encoding. Image download time is no more than 3 seconds.
-Images stored on Tencent Cloud's Url guarantee higher download speed and stability. It is advisable to store images on Tencent Cloud.
-The speed and stability of non-Tencent Cloud Storage URLs may be impacted. 
     * @return ImageUrl Url of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image is no more than 3M after Base64 encoding. Image download time is no more than 3 seconds.
-Images stored on Tencent Cloud's Url guarantee higher download speed and stability. It is advisable to store images on Tencent Cloud.
-The speed and stability of non-Tencent Cloud Storage URLs may be impacted.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Url of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image is no more than 3M after Base64 encoding. Image download time is no more than 3 seconds.
-Images stored on Tencent Cloud's Url guarantee higher download speed and stability. It is advisable to store images on Tencent Cloud.
-The speed and stability of non-Tencent Cloud Storage URLs may be impacted.
     * @param ImageUrl Url of the ID card portrait side.
-Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.
-Supported image size: The downloaded image is no more than 3M after Base64 encoding. Image download time is no more than 3 seconds.
-Images stored on Tencent Cloud's Url guarantee higher download speed and stability. It is advisable to store images on Tencent Cloud.
-The speed and stability of non-Tencent Cloud Storage URLs may be impacted.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link. 
     * @return Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
     * @param Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public IdCardOCRVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdCardOCRVerificationRequest(IdCardOCRVerificationRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

