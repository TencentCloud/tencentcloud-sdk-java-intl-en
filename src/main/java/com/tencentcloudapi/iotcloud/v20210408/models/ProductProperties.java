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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductProperties extends AbstractModel {

    /**
    * Product description
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * Authentication type. `1` (default): certificate; `2`: signature
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * Product region. Valid value: `gz` (Guangzhou)
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Product type. Valid values:
`0` (default): general; `2`: NB-IoT; `3`: LoRa gateway; `4`: LoRa; `5`: general gateway
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * Data format. Valid values: `json` (default), `custom`
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Platform of the product. Default value: `0`
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * AppEUI at the LoRa product operator, required only for LoRa products
    */
    @SerializedName("Appeui")
    @Expose
    private String Appeui;

    /**
    * ID of the Thing Specification Language (TSL) model bound to the product. `-1` means no models are bound.
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Name of the TSL model bound to the product
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Product key, which is specific to suite products
    */
    @SerializedName("ProductKey")
    @Expose
    private String ProductKey;

    /**
    * Dynamic registration type. `0`: disable; `1`: preset device names; `2`: generate device names dynamically
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
    * Dynamic registration product key
    */
    @SerializedName("ProductSecret")
    @Expose
    private String ProductSecret;

    /**
    * The maximum number of devices that can be dynamically created when `RegisterType` is set to `2`
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * Original product ID of a transferred product. This parameter is empty for products that are not transferred.
    */
    @SerializedName("OriginProductId")
    @Expose
    private String OriginProductId;

    /**
    * Private CA certificate name
    */
    @SerializedName("PrivateCAName")
    @Expose
    private String PrivateCAName;

    /**
    * Original user ID of a transferred product. This parameter is empty for products that are not transferred.
    */
    @SerializedName("OriginUserId")
    @Expose
    private Long OriginUserId;

    /**
     * Get Product description 
     * @return ProductDescription Product description
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set Product description
     * @param ProductDescription Product description
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get Authentication type. `1` (default): certificate; `2`: signature 
     * @return EncryptionType Authentication type. `1` (default): certificate; `2`: signature
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set Authentication type. `1` (default): certificate; `2`: signature
     * @param EncryptionType Authentication type. `1` (default): certificate; `2`: signature
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get Product region. Valid value: `gz` (Guangzhou) 
     * @return Region Product region. Valid value: `gz` (Guangzhou)
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Product region. Valid value: `gz` (Guangzhou)
     * @param Region Product region. Valid value: `gz` (Guangzhou)
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Product type. Valid values:
`0` (default): general; `2`: NB-IoT; `3`: LoRa gateway; `4`: LoRa; `5`: general gateway 
     * @return ProductType Product type. Valid values:
`0` (default): general; `2`: NB-IoT; `3`: LoRa gateway; `4`: LoRa; `5`: general gateway
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set Product type. Valid values:
`0` (default): general; `2`: NB-IoT; `3`: LoRa gateway; `4`: LoRa; `5`: general gateway
     * @param ProductType Product type. Valid values:
`0` (default): general; `2`: NB-IoT; `3`: LoRa gateway; `4`: LoRa; `5`: general gateway
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get Data format. Valid values: `json` (default), `custom` 
     * @return Format Data format. Valid values: `json` (default), `custom`
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Data format. Valid values: `json` (default), `custom`
     * @param Format Data format. Valid values: `json` (default), `custom`
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Platform of the product. Default value: `0` 
     * @return Platform Platform of the product. Default value: `0`
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Platform of the product. Default value: `0`
     * @param Platform Platform of the product. Default value: `0`
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get AppEUI at the LoRa product operator, required only for LoRa products 
     * @return Appeui AppEUI at the LoRa product operator, required only for LoRa products
     */
    public String getAppeui() {
        return this.Appeui;
    }

    /**
     * Set AppEUI at the LoRa product operator, required only for LoRa products
     * @param Appeui AppEUI at the LoRa product operator, required only for LoRa products
     */
    public void setAppeui(String Appeui) {
        this.Appeui = Appeui;
    }

    /**
     * Get ID of the Thing Specification Language (TSL) model bound to the product. `-1` means no models are bound. 
     * @return ModelId ID of the Thing Specification Language (TSL) model bound to the product. `-1` means no models are bound.
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set ID of the Thing Specification Language (TSL) model bound to the product. `-1` means no models are bound.
     * @param ModelId ID of the Thing Specification Language (TSL) model bound to the product. `-1` means no models are bound.
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Name of the TSL model bound to the product 
     * @return ModelName Name of the TSL model bound to the product
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Name of the TSL model bound to the product
     * @param ModelName Name of the TSL model bound to the product
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Product key, which is specific to suite products 
     * @return ProductKey Product key, which is specific to suite products
     */
    public String getProductKey() {
        return this.ProductKey;
    }

    /**
     * Set Product key, which is specific to suite products
     * @param ProductKey Product key, which is specific to suite products
     */
    public void setProductKey(String ProductKey) {
        this.ProductKey = ProductKey;
    }

    /**
     * Get Dynamic registration type. `0`: disable; `1`: preset device names; `2`: generate device names dynamically 
     * @return RegisterType Dynamic registration type. `0`: disable; `1`: preset device names; `2`: generate device names dynamically
     */
    public Long getRegisterType() {
        return this.RegisterType;
    }

    /**
     * Set Dynamic registration type. `0`: disable; `1`: preset device names; `2`: generate device names dynamically
     * @param RegisterType Dynamic registration type. `0`: disable; `1`: preset device names; `2`: generate device names dynamically
     */
    public void setRegisterType(Long RegisterType) {
        this.RegisterType = RegisterType;
    }

    /**
     * Get Dynamic registration product key 
     * @return ProductSecret Dynamic registration product key
     */
    public String getProductSecret() {
        return this.ProductSecret;
    }

    /**
     * Set Dynamic registration product key
     * @param ProductSecret Dynamic registration product key
     */
    public void setProductSecret(String ProductSecret) {
        this.ProductSecret = ProductSecret;
    }

    /**
     * Get The maximum number of devices that can be dynamically created when `RegisterType` is set to `2` 
     * @return RegisterLimit The maximum number of devices that can be dynamically created when `RegisterType` is set to `2`
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set The maximum number of devices that can be dynamically created when `RegisterType` is set to `2`
     * @param RegisterLimit The maximum number of devices that can be dynamically created when `RegisterType` is set to `2`
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get Original product ID of a transferred product. This parameter is empty for products that are not transferred. 
     * @return OriginProductId Original product ID of a transferred product. This parameter is empty for products that are not transferred.
     */
    public String getOriginProductId() {
        return this.OriginProductId;
    }

    /**
     * Set Original product ID of a transferred product. This parameter is empty for products that are not transferred.
     * @param OriginProductId Original product ID of a transferred product. This parameter is empty for products that are not transferred.
     */
    public void setOriginProductId(String OriginProductId) {
        this.OriginProductId = OriginProductId;
    }

    /**
     * Get Private CA certificate name 
     * @return PrivateCAName Private CA certificate name
     */
    public String getPrivateCAName() {
        return this.PrivateCAName;
    }

    /**
     * Set Private CA certificate name
     * @param PrivateCAName Private CA certificate name
     */
    public void setPrivateCAName(String PrivateCAName) {
        this.PrivateCAName = PrivateCAName;
    }

    /**
     * Get Original user ID of a transferred product. This parameter is empty for products that are not transferred. 
     * @return OriginUserId Original user ID of a transferred product. This parameter is empty for products that are not transferred.
     */
    public Long getOriginUserId() {
        return this.OriginUserId;
    }

    /**
     * Set Original user ID of a transferred product. This parameter is empty for products that are not transferred.
     * @param OriginUserId Original user ID of a transferred product. This parameter is empty for products that are not transferred.
     */
    public void setOriginUserId(Long OriginUserId) {
        this.OriginUserId = OriginUserId;
    }

    public ProductProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductProperties(ProductProperties source) {
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new String(source.EncryptionType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Appeui != null) {
            this.Appeui = new String(source.Appeui);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ProductKey != null) {
            this.ProductKey = new String(source.ProductKey);
        }
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
        if (source.ProductSecret != null) {
            this.ProductSecret = new String(source.ProductSecret);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.OriginProductId != null) {
            this.OriginProductId = new String(source.OriginProductId);
        }
        if (source.PrivateCAName != null) {
            this.PrivateCAName = new String(source.PrivateCAName);
        }
        if (source.OriginUserId != null) {
            this.OriginUserId = new Long(source.OriginUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Appeui", this.Appeui);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);
        this.setParamSimple(map, prefix + "ProductSecret", this.ProductSecret);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "OriginProductId", this.OriginProductId);
        this.setParamSimple(map, prefix + "PrivateCAName", this.PrivateCAName);
        this.setParamSimple(map, prefix + "OriginUserId", this.OriginUserId);

    }
}

