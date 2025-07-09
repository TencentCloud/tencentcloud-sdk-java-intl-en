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

public class CreateDeviceRequest extends AbstractModel {

    /**
    * Product ID, globally unique ID assigned by Tencent Cloud during product creation
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Device name. It is a string of 1 to 48 characters. Letters, digits, and :_- are allowed.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Device attribute
    */
    @SerializedName("Attribute")
    @Expose
    private Attribute Attribute;

    /**
    * Whether to use custom PSK, no by default
    */
    @SerializedName("DefinedPsk")
    @Expose
    private String DefinedPsk;

    /**
    * ISP, required for a NB-IoT product. `1`: China Telecom; `2`: China Mobile; `3`: China Unicom
    */
    @SerializedName("Isp")
    @Expose
    private Long Isp;

    /**
    * IMEI, required for a NB-IoT product
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * DevEUI of a LoRa device, required when you create a LoRa device
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
    * MoteType of a LoRa device
    */
    @SerializedName("LoraMoteType")
    @Expose
    private Long LoraMoteType;

    /**
    * Skey, required when you create a LoRa device
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * AppKey of a LoRa device
    */
    @SerializedName("LoraAppKey")
    @Expose
    private String LoraAppKey;

    /**
    * Private CA certificate
    */
    @SerializedName("TlsCrt")
    @Expose
    private String TlsCrt;

    /**
     * Get Product ID, globally unique ID assigned by Tencent Cloud during product creation 
     * @return ProductId Product ID, globally unique ID assigned by Tencent Cloud during product creation
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID, globally unique ID assigned by Tencent Cloud during product creation
     * @param ProductId Product ID, globally unique ID assigned by Tencent Cloud during product creation
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Device name. It is a string of 1 to 48 characters. Letters, digits, and :_- are allowed. 
     * @return DeviceName Device name. It is a string of 1 to 48 characters. Letters, digits, and :_- are allowed.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name. It is a string of 1 to 48 characters. Letters, digits, and :_- are allowed.
     * @param DeviceName Device name. It is a string of 1 to 48 characters. Letters, digits, and :_- are allowed.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Device attribute 
     * @return Attribute Device attribute
     */
    public Attribute getAttribute() {
        return this.Attribute;
    }

    /**
     * Set Device attribute
     * @param Attribute Device attribute
     */
    public void setAttribute(Attribute Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get Whether to use custom PSK, no by default 
     * @return DefinedPsk Whether to use custom PSK, no by default
     */
    public String getDefinedPsk() {
        return this.DefinedPsk;
    }

    /**
     * Set Whether to use custom PSK, no by default
     * @param DefinedPsk Whether to use custom PSK, no by default
     */
    public void setDefinedPsk(String DefinedPsk) {
        this.DefinedPsk = DefinedPsk;
    }

    /**
     * Get ISP, required for a NB-IoT product. `1`: China Telecom; `2`: China Mobile; `3`: China Unicom 
     * @return Isp ISP, required for a NB-IoT product. `1`: China Telecom; `2`: China Mobile; `3`: China Unicom
     */
    public Long getIsp() {
        return this.Isp;
    }

    /**
     * Set ISP, required for a NB-IoT product. `1`: China Telecom; `2`: China Mobile; `3`: China Unicom
     * @param Isp ISP, required for a NB-IoT product. `1`: China Telecom; `2`: China Mobile; `3`: China Unicom
     */
    public void setIsp(Long Isp) {
        this.Isp = Isp;
    }

    /**
     * Get IMEI, required for a NB-IoT product 
     * @return Imei IMEI, required for a NB-IoT product
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set IMEI, required for a NB-IoT product
     * @param Imei IMEI, required for a NB-IoT product
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get DevEUI of a LoRa device, required when you create a LoRa device 
     * @return LoraDevEui DevEUI of a LoRa device, required when you create a LoRa device
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * Set DevEUI of a LoRa device, required when you create a LoRa device
     * @param LoraDevEui DevEUI of a LoRa device, required when you create a LoRa device
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * Get MoteType of a LoRa device 
     * @return LoraMoteType MoteType of a LoRa device
     */
    public Long getLoraMoteType() {
        return this.LoraMoteType;
    }

    /**
     * Set MoteType of a LoRa device
     * @param LoraMoteType MoteType of a LoRa device
     */
    public void setLoraMoteType(Long LoraMoteType) {
        this.LoraMoteType = LoraMoteType;
    }

    /**
     * Get Skey, required when you create a LoRa device 
     * @return Skey Skey, required when you create a LoRa device
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set Skey, required when you create a LoRa device
     * @param Skey Skey, required when you create a LoRa device
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get AppKey of a LoRa device 
     * @return LoraAppKey AppKey of a LoRa device
     */
    public String getLoraAppKey() {
        return this.LoraAppKey;
    }

    /**
     * Set AppKey of a LoRa device
     * @param LoraAppKey AppKey of a LoRa device
     */
    public void setLoraAppKey(String LoraAppKey) {
        this.LoraAppKey = LoraAppKey;
    }

    /**
     * Get Private CA certificate 
     * @return TlsCrt Private CA certificate
     */
    public String getTlsCrt() {
        return this.TlsCrt;
    }

    /**
     * Set Private CA certificate
     * @param TlsCrt Private CA certificate
     */
    public void setTlsCrt(String TlsCrt) {
        this.TlsCrt = TlsCrt;
    }

    public CreateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceRequest(CreateDeviceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Attribute != null) {
            this.Attribute = new Attribute(source.Attribute);
        }
        if (source.DefinedPsk != null) {
            this.DefinedPsk = new String(source.DefinedPsk);
        }
        if (source.Isp != null) {
            this.Isp = new Long(source.Isp);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.LoraDevEui != null) {
            this.LoraDevEui = new String(source.LoraDevEui);
        }
        if (source.LoraMoteType != null) {
            this.LoraMoteType = new Long(source.LoraMoteType);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
        if (source.LoraAppKey != null) {
            this.LoraAppKey = new String(source.LoraAppKey);
        }
        if (source.TlsCrt != null) {
            this.TlsCrt = new String(source.TlsCrt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamObj(map, prefix + "Attribute.", this.Attribute);
        this.setParamSimple(map, prefix + "DefinedPsk", this.DefinedPsk);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);
        this.setParamSimple(map, prefix + "LoraMoteType", this.LoraMoteType);
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "LoraAppKey", this.LoraAppKey);
        this.setParamSimple(map, prefix + "TlsCrt", this.TlsCrt);

    }
}

