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

public class CheckIdCardInformationRequest extends AbstractModel {

    /**
    * <p>Base64 value of the ID card portrait side.</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: the downloaded image should be no more than 7M after Base64 encoding.</li><li>Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for coding specification.</li><li>Either ImageBase64 or ImageUrl must be provided. If both are provided, proceed to use parameters according to the priority of ImageUrl > ImageBase64.</li></ul>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>Url address of the ID card portrait side</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: The downloaded image after Base64 encoding is no more than 3M. Image download time is no more than 3 seconds.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of non-Tencent Cloud Storage URLs may be impacted to a certain extent.</li></ul>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>Configuration.</p><ul><li><p>All the following optional fields are bool type, default false.<br>CopyWarn, alarm for photocopy.<br>BorderCheckWarn, border and frame block alarm.<br>ReshootWarn, alarm for rephotographing.<br>DetectPsWarn, PS detection alarm (suspected PS traces).<br>TempIdWarn, temporary ID card alarm.<br>Quality, image Quality alarm (evaluates blurriness).</p></li><li><p>SDK configuration method for reference:<br>Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true}).</p></li><li><p>API 3.0 Explorer setting method for reference:<br>Config = {"CopyWarn":true,"ReshootWarn":true}.</p></li></ul>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>Whether required to encrypt sensitive information in the response.</p><ul><li>Default false.</li><li>Sensitive information includes Response.IdNum and Response.Name.</li></ul>
    */
    @SerializedName("IsEncrypt")
    @Expose
    private Boolean IsEncrypt;

    /**
    * <p>Whether required to encrypt the response body.</p>
    */
    @SerializedName("IsEncryptResponse")
    @Expose
    private Boolean IsEncryptResponse;

    /**
    * <p>Whether required to encrypt sensitive information in the response, need to be specified encryption algorithm Algorithm, initial vector for CBC encryption, and encrypted symmetric key.</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get <p>Base64 value of the ID card portrait side.</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: the downloaded image should be no more than 7M after Base64 encoding.</li><li>Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for coding specification.</li><li>Either ImageBase64 or ImageUrl must be provided. If both are provided, proceed to use parameters according to the priority of ImageUrl > ImageBase64.</li></ul> 
     * @return ImageBase64 <p>Base64 value of the ID card portrait side.</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: the downloaded image should be no more than 7M after Base64 encoding.</li><li>Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for coding specification.</li><li>Either ImageBase64 or ImageUrl must be provided. If both are provided, proceed to use parameters according to the priority of ImageUrl > ImageBase64.</li></ul>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>Base64 value of the ID card portrait side.</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: the downloaded image should be no more than 7M after Base64 encoding.</li><li>Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for coding specification.</li><li>Either ImageBase64 or ImageUrl must be provided. If both are provided, proceed to use parameters according to the priority of ImageUrl > ImageBase64.</li></ul>
     * @param ImageBase64 <p>Base64 value of the ID card portrait side.</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: the downloaded image should be no more than 7M after Base64 encoding.</li><li>Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for coding specification.</li><li>Either ImageBase64 or ImageUrl must be provided. If both are provided, proceed to use parameters according to the priority of ImageUrl > ImageBase64.</li></ul>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>Url address of the ID card portrait side</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: The downloaded image after Base64 encoding is no more than 3M. Image download time is no more than 3 seconds.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of non-Tencent Cloud Storage URLs may be impacted to a certain extent.</li></ul> 
     * @return ImageUrl <p>Url address of the ID card portrait side</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: The downloaded image after Base64 encoding is no more than 3M. Image download time is no more than 3 seconds.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of non-Tencent Cloud Storage URLs may be impacted to a certain extent.</li></ul>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>Url address of the ID card portrait side</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: The downloaded image after Base64 encoding is no more than 3M. Image download time is no more than 3 seconds.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of non-Tencent Cloud Storage URLs may be impacted to a certain extent.</li></ul>
     * @param ImageUrl <p>Url address of the ID card portrait side</p><ul><li>Supported image formats: PNG, JPG, JPEG. GIF format is not currently supported.</li><li>Supported image size: The downloaded image after Base64 encoding is no more than 3M. Image download time is no more than 3 seconds.</li><li>Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud.</li><li>Speed and stability of non-Tencent Cloud Storage URLs may be impacted to a certain extent.</li></ul>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>Configuration.</p><ul><li><p>All the following optional fields are bool type, default false.<br>CopyWarn, alarm for photocopy.<br>BorderCheckWarn, border and frame block alarm.<br>ReshootWarn, alarm for rephotographing.<br>DetectPsWarn, PS detection alarm (suspected PS traces).<br>TempIdWarn, temporary ID card alarm.<br>Quality, image Quality alarm (evaluates blurriness).</p></li><li><p>SDK configuration method for reference:<br>Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true}).</p></li><li><p>API 3.0 Explorer setting method for reference:<br>Config = {"CopyWarn":true,"ReshootWarn":true}.</p></li></ul> 
     * @return Config <p>Configuration.</p><ul><li><p>All the following optional fields are bool type, default false.<br>CopyWarn, alarm for photocopy.<br>BorderCheckWarn, border and frame block alarm.<br>ReshootWarn, alarm for rephotographing.<br>DetectPsWarn, PS detection alarm (suspected PS traces).<br>TempIdWarn, temporary ID card alarm.<br>Quality, image Quality alarm (evaluates blurriness).</p></li><li><p>SDK configuration method for reference:<br>Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true}).</p></li><li><p>API 3.0 Explorer setting method for reference:<br>Config = {"CopyWarn":true,"ReshootWarn":true}.</p></li></ul>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Configuration.</p><ul><li><p>All the following optional fields are bool type, default false.<br>CopyWarn, alarm for photocopy.<br>BorderCheckWarn, border and frame block alarm.<br>ReshootWarn, alarm for rephotographing.<br>DetectPsWarn, PS detection alarm (suspected PS traces).<br>TempIdWarn, temporary ID card alarm.<br>Quality, image Quality alarm (evaluates blurriness).</p></li><li><p>SDK configuration method for reference:<br>Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true}).</p></li><li><p>API 3.0 Explorer setting method for reference:<br>Config = {"CopyWarn":true,"ReshootWarn":true}.</p></li></ul>
     * @param Config <p>Configuration.</p><ul><li><p>All the following optional fields are bool type, default false.<br>CopyWarn, alarm for photocopy.<br>BorderCheckWarn, border and frame block alarm.<br>ReshootWarn, alarm for rephotographing.<br>DetectPsWarn, PS detection alarm (suspected PS traces).<br>TempIdWarn, temporary ID card alarm.<br>Quality, image Quality alarm (evaluates blurriness).</p></li><li><p>SDK configuration method for reference:<br>Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true}).</p></li><li><p>API 3.0 Explorer setting method for reference:<br>Config = {"CopyWarn":true,"ReshootWarn":true}.</p></li></ul>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Whether required to encrypt sensitive information in the response.</p><ul><li>Default false.</li><li>Sensitive information includes Response.IdNum and Response.Name.</li></ul> 
     * @return IsEncrypt <p>Whether required to encrypt sensitive information in the response.</p><ul><li>Default false.</li><li>Sensitive information includes Response.IdNum and Response.Name.</li></ul>
     */
    public Boolean getIsEncrypt() {
        return this.IsEncrypt;
    }

    /**
     * Set <p>Whether required to encrypt sensitive information in the response.</p><ul><li>Default false.</li><li>Sensitive information includes Response.IdNum and Response.Name.</li></ul>
     * @param IsEncrypt <p>Whether required to encrypt sensitive information in the response.</p><ul><li>Default false.</li><li>Sensitive information includes Response.IdNum and Response.Name.</li></ul>
     */
    public void setIsEncrypt(Boolean IsEncrypt) {
        this.IsEncrypt = IsEncrypt;
    }

    /**
     * Get <p>Whether required to encrypt the response body.</p> 
     * @return IsEncryptResponse <p>Whether required to encrypt the response body.</p>
     */
    public Boolean getIsEncryptResponse() {
        return this.IsEncryptResponse;
    }

    /**
     * Set <p>Whether required to encrypt the response body.</p>
     * @param IsEncryptResponse <p>Whether required to encrypt the response body.</p>
     */
    public void setIsEncryptResponse(Boolean IsEncryptResponse) {
        this.IsEncryptResponse = IsEncryptResponse;
    }

    /**
     * Get <p>Whether required to encrypt sensitive information in the response, need to be specified encryption algorithm Algorithm, initial vector for CBC encryption, and encrypted symmetric key.</p> 
     * @return Encryption <p>Whether required to encrypt sensitive information in the response, need to be specified encryption algorithm Algorithm, initial vector for CBC encryption, and encrypted symmetric key.</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Whether required to encrypt sensitive information in the response, need to be specified encryption algorithm Algorithm, initial vector for CBC encryption, and encrypted symmetric key.</p>
     * @param Encryption <p>Whether required to encrypt sensitive information in the response, need to be specified encryption algorithm Algorithm, initial vector for CBC encryption, and encrypted symmetric key.</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public CheckIdCardInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdCardInformationRequest(CheckIdCardInformationRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.IsEncrypt != null) {
            this.IsEncrypt = new Boolean(source.IsEncrypt);
        }
        if (source.IsEncryptResponse != null) {
            this.IsEncryptResponse = new Boolean(source.IsEncryptResponse);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "IsEncrypt", this.IsEncrypt);
        this.setParamSimple(map, prefix + "IsEncryptResponse", this.IsEncryptResponse);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

