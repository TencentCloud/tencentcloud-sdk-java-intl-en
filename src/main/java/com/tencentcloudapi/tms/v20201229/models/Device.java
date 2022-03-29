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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel{

    /**
    * This field indicates the IP address of the device used by the service subscriber. <br>
Note: Currently, only IPv4 addresses can be recorded.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * This field indicates the MAC address used by the service subscriber to facilitate device identification and management. Its format and value are consistent with those of the standard MAC address.
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * * In beta test. Available soon.*
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * * In beta test. Available soon.*
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * This field represents the **IMEI** (International Mobile Equipment Identity) number of the device used by the service subscriber. IMEI can be used to identify each independent mobile communication device, such as a mobile phone, which is convenient for device identification and management. <br>Note: IMEI is formatted with **15 to 17 numbers only**.
    */
    @SerializedName("IMEI")
    @Expose
    private String IMEI;

    /**
    * **Dedicated for iOS device**. This field indicates the **IDFA** (Identifier for Advertising) corresponding to the service subscriber. IDFA, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the user.<br>
Note: Since the iOS14 update in 2021, Apple Inc. has allowed users to manually activate or deactivate IDFA, so the validity of the string identifier may be reduced.
    */
    @SerializedName("IDFA")
    @Expose
    private String IDFA;

    /**
    * **Dedicated for iOS device**. This field indicates the **IDFV** (Identifier for Vendor) corresponding to the service subscriber. IDFV, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the vendor. IDFV can also be used as a unique device identifier.
    */
    @SerializedName("IDFV")
    @Expose
    private String IDFV;

    /**
     * Get This field indicates the IP address of the device used by the service subscriber. <br>
Note: Currently, only IPv4 addresses can be recorded. 
     * @return IP This field indicates the IP address of the device used by the service subscriber. <br>
Note: Currently, only IPv4 addresses can be recorded.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set This field indicates the IP address of the device used by the service subscriber. <br>
Note: Currently, only IPv4 addresses can be recorded.
     * @param IP This field indicates the IP address of the device used by the service subscriber. <br>
Note: Currently, only IPv4 addresses can be recorded.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get This field indicates the MAC address used by the service subscriber to facilitate device identification and management. Its format and value are consistent with those of the standard MAC address. 
     * @return Mac This field indicates the MAC address used by the service subscriber to facilitate device identification and management. Its format and value are consistent with those of the standard MAC address.
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set This field indicates the MAC address used by the service subscriber to facilitate device identification and management. Its format and value are consistent with those of the standard MAC address.
     * @param Mac This field indicates the MAC address used by the service subscriber to facilitate device identification and management. Its format and value are consistent with those of the standard MAC address.
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get * In beta test. Available soon.* 
     * @return TokenId * In beta test. Available soon.*
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set * In beta test. Available soon.*
     * @param TokenId * In beta test. Available soon.*
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get * In beta test. Available soon.* 
     * @return DeviceId * In beta test. Available soon.*
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set * In beta test. Available soon.*
     * @param DeviceId * In beta test. Available soon.*
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get This field represents the **IMEI** (International Mobile Equipment Identity) number of the device used by the service subscriber. IMEI can be used to identify each independent mobile communication device, such as a mobile phone, which is convenient for device identification and management. <br>Note: IMEI is formatted with **15 to 17 numbers only**. 
     * @return IMEI This field represents the **IMEI** (International Mobile Equipment Identity) number of the device used by the service subscriber. IMEI can be used to identify each independent mobile communication device, such as a mobile phone, which is convenient for device identification and management. <br>Note: IMEI is formatted with **15 to 17 numbers only**.
     */
    public String getIMEI() {
        return this.IMEI;
    }

    /**
     * Set This field represents the **IMEI** (International Mobile Equipment Identity) number of the device used by the service subscriber. IMEI can be used to identify each independent mobile communication device, such as a mobile phone, which is convenient for device identification and management. <br>Note: IMEI is formatted with **15 to 17 numbers only**.
     * @param IMEI This field represents the **IMEI** (International Mobile Equipment Identity) number of the device used by the service subscriber. IMEI can be used to identify each independent mobile communication device, such as a mobile phone, which is convenient for device identification and management. <br>Note: IMEI is formatted with **15 to 17 numbers only**.
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * Get **Dedicated for iOS device**. This field indicates the **IDFA** (Identifier for Advertising) corresponding to the service subscriber. IDFA, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the user.<br>
Note: Since the iOS14 update in 2021, Apple Inc. has allowed users to manually activate or deactivate IDFA, so the validity of the string identifier may be reduced. 
     * @return IDFA **Dedicated for iOS device**. This field indicates the **IDFA** (Identifier for Advertising) corresponding to the service subscriber. IDFA, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the user.<br>
Note: Since the iOS14 update in 2021, Apple Inc. has allowed users to manually activate or deactivate IDFA, so the validity of the string identifier may be reduced.
     */
    public String getIDFA() {
        return this.IDFA;
    }

    /**
     * Set **Dedicated for iOS device**. This field indicates the **IDFA** (Identifier for Advertising) corresponding to the service subscriber. IDFA, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the user.<br>
Note: Since the iOS14 update in 2021, Apple Inc. has allowed users to manually activate or deactivate IDFA, so the validity of the string identifier may be reduced.
     * @param IDFA **Dedicated for iOS device**. This field indicates the **IDFA** (Identifier for Advertising) corresponding to the service subscriber. IDFA, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the user.<br>
Note: Since the iOS14 update in 2021, Apple Inc. has allowed users to manually activate or deactivate IDFA, so the validity of the string identifier may be reduced.
     */
    public void setIDFA(String IDFA) {
        this.IDFA = IDFA;
    }

    /**
     * Get **Dedicated for iOS device**. This field indicates the **IDFV** (Identifier for Vendor) corresponding to the service subscriber. IDFV, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the vendor. IDFV can also be used as a unique device identifier. 
     * @return IDFV **Dedicated for iOS device**. This field indicates the **IDFV** (Identifier for Vendor) corresponding to the service subscriber. IDFV, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the vendor. IDFV can also be used as a unique device identifier.
     */
    public String getIDFV() {
        return this.IDFV;
    }

    /**
     * Set **Dedicated for iOS device**. This field indicates the **IDFV** (Identifier for Vendor) corresponding to the service subscriber. IDFV, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the vendor. IDFV can also be used as a unique device identifier.
     * @param IDFV **Dedicated for iOS device**. This field indicates the **IDFV** (Identifier for Vendor) corresponding to the service subscriber. IDFV, a string of hexadecimal 32 characters including numbers and letters, is provided by Apple Inc. to identify the vendor. IDFV can also be used as a unique device identifier.
     */
    public void setIDFV(String IDFV) {
        this.IDFV = IDFV;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.IMEI != null) {
            this.IMEI = new String(source.IMEI);
        }
        if (source.IDFA != null) {
            this.IDFA = new String(source.IDFA);
        }
        if (source.IDFV != null) {
            this.IDFV = new String(source.IDFV);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "IMEI", this.IMEI);
        this.setParamSimple(map, prefix + "IDFA", this.IDFA);
        this.setParamSimple(map, prefix + "IDFV", this.IDFV);

    }
}

