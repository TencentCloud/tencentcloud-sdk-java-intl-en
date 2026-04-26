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

public class ImageRecognitionRequest extends AbstractModel {

    /**
    * <p>Identity card number</p>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>Name. For Chinese, please use UTF-8 encode.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Image for face comparison, the Base64 value of the image.<br>The size of the Base64-encoded image data should be no more than 3M. Only jpg and png formats are supported.<br>Please use the standard Base64 encoding type (with = padding). Refer to RFC4648 for the coding specification.</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>This parameter is not required for this API.</p>
    */
    @SerializedName("Optional")
    @Expose
    private String Optional;

    /**
    * <p>Sensitive data encryption information. Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get <p>Identity card number</p> 
     * @return IdCard <p>Identity card number</p>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>Identity card number</p>
     * @param IdCard <p>Identity card number</p>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>Name. For Chinese, please use UTF-8 encode.</p> 
     * @return Name <p>Name. For Chinese, please use UTF-8 encode.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name. For Chinese, please use UTF-8 encode.</p>
     * @param Name <p>Name. For Chinese, please use UTF-8 encode.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Image for face comparison, the Base64 value of the image.<br>The size of the Base64-encoded image data should be no more than 3M. Only jpg and png formats are supported.<br>Please use the standard Base64 encoding type (with = padding). Refer to RFC4648 for the coding specification.</p> 
     * @return ImageBase64 <p>Image for face comparison, the Base64 value of the image.<br>The size of the Base64-encoded image data should be no more than 3M. Only jpg and png formats are supported.<br>Please use the standard Base64 encoding type (with = padding). Refer to RFC4648 for the coding specification.</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>Image for face comparison, the Base64 value of the image.<br>The size of the Base64-encoded image data should be no more than 3M. Only jpg and png formats are supported.<br>Please use the standard Base64 encoding type (with = padding). Refer to RFC4648 for the coding specification.</p>
     * @param ImageBase64 <p>Image for face comparison, the Base64 value of the image.<br>The size of the Base64-encoded image data should be no more than 3M. Only jpg and png formats are supported.<br>Please use the standard Base64 encoding type (with = padding). Refer to RFC4648 for the coding specification.</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>This parameter is not required for this API.</p> 
     * @return Optional <p>This parameter is not required for this API.</p>
     */
    public String getOptional() {
        return this.Optional;
    }

    /**
     * Set <p>This parameter is not required for this API.</p>
     * @param Optional <p>This parameter is not required for this API.</p>
     */
    public void setOptional(String Optional) {
        this.Optional = Optional;
    }

    /**
     * Get <p>Sensitive data encryption information. Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.</p> 
     * @return Encryption <p>Sensitive data encryption information. Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Sensitive data encryption information. Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.</p>
     * @param Encryption <p>Sensitive data encryption information. Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public ImageRecognitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRecognitionRequest(ImageRecognitionRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Optional != null) {
            this.Optional = new String(source.Optional);
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
        this.setParamSimple(map, prefix + "Optional", this.Optional);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

