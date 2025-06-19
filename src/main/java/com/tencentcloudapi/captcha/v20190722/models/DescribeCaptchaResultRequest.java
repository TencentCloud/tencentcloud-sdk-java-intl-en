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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaResultRequest extends AbstractModel {

    /**
    * Fill with fixed value: 9.
    */
    @SerializedName("CaptchaType")
    @Expose
    private Long CaptchaType;

    /**
    * The user verification ticket returned by the frontend callback function
    */
    @SerializedName("Ticket")
    @Expose
    private String Ticket;

    /**
    * The user public IP obtained from the customer backend server
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * A random string returned by the frontend callback function
    */
    @SerializedName("Randstr")
    @Expose
    private String Randstr;

    /**
    * CAPTCHA's app ID. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the CaptchaAppId in the "Key" column of the CAPTCHA list.
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * CAPTCHA's app key. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the AppSecretKey in the "Key" column of the CAPTCHA list. AppSecretKey is the key for CAPTCHA ticket verification performed by the server. Please keep it confidential and do not disclose it to any third parties.
    */
    @SerializedName("AppSecretKey")
    @Expose
    private String AppSecretKey;

    /**
    * Reserved field.
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * Reserved field.
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * MAC address or unique identifier of a device
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * Mobile equipment identity number
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * Indicates whether to return the time when the frontend obtains the CAPTCHA. Valid values: 1 (return the time) and others.
    */
    @SerializedName("NeedGetCaptchaTime")
    @Expose
    private Long NeedGetCaptchaTime;

    /**
     * Get Fill with fixed value: 9. 
     * @return CaptchaType Fill with fixed value: 9.
     */
    public Long getCaptchaType() {
        return this.CaptchaType;
    }

    /**
     * Set Fill with fixed value: 9.
     * @param CaptchaType Fill with fixed value: 9.
     */
    public void setCaptchaType(Long CaptchaType) {
        this.CaptchaType = CaptchaType;
    }

    /**
     * Get The user verification ticket returned by the frontend callback function 
     * @return Ticket The user verification ticket returned by the frontend callback function
     */
    public String getTicket() {
        return this.Ticket;
    }

    /**
     * Set The user verification ticket returned by the frontend callback function
     * @param Ticket The user verification ticket returned by the frontend callback function
     */
    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    /**
     * Get The user public IP obtained from the customer backend server 
     * @return UserIp The user public IP obtained from the customer backend server
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set The user public IP obtained from the customer backend server
     * @param UserIp The user public IP obtained from the customer backend server
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get A random string returned by the frontend callback function 
     * @return Randstr A random string returned by the frontend callback function
     */
    public String getRandstr() {
        return this.Randstr;
    }

    /**
     * Set A random string returned by the frontend callback function
     * @param Randstr A random string returned by the frontend callback function
     */
    public void setRandstr(String Randstr) {
        this.Randstr = Randstr;
    }

    /**
     * Get CAPTCHA's app ID. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the CaptchaAppId in the "Key" column of the CAPTCHA list. 
     * @return CaptchaAppId CAPTCHA's app ID. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the CaptchaAppId in the "Key" column of the CAPTCHA list.
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set CAPTCHA's app ID. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the CaptchaAppId in the "Key" column of the CAPTCHA list.
     * @param CaptchaAppId CAPTCHA's app ID. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the CaptchaAppId in the "Key" column of the CAPTCHA list.
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get CAPTCHA's app key. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the AppSecretKey in the "Key" column of the CAPTCHA list. AppSecretKey is the key for CAPTCHA ticket verification performed by the server. Please keep it confidential and do not disclose it to any third parties. 
     * @return AppSecretKey CAPTCHA's app key. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the AppSecretKey in the "Key" column of the CAPTCHA list. AppSecretKey is the key for CAPTCHA ticket verification performed by the server. Please keep it confidential and do not disclose it to any third parties.
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * Set CAPTCHA's app key. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the AppSecretKey in the "Key" column of the CAPTCHA list. AppSecretKey is the key for CAPTCHA ticket verification performed by the server. Please keep it confidential and do not disclose it to any third parties.
     * @param AppSecretKey CAPTCHA's app key. Log in to the [Captcha console](https://console.cloud.tencent.com/captcha/graphical) and you can view the AppSecretKey in the "Key" column of the CAPTCHA list. AppSecretKey is the key for CAPTCHA ticket verification performed by the server. Please keep it confidential and do not disclose it to any third parties.
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    /**
     * Get Reserved field. 
     * @return BusinessId Reserved field.
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set Reserved field.
     * @param BusinessId Reserved field.
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get Reserved field. 
     * @return SceneId Reserved field.
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set Reserved field.
     * @param SceneId Reserved field.
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get MAC address or unique identifier of a device 
     * @return MacAddress MAC address or unique identifier of a device
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC address or unique identifier of a device
     * @param MacAddress MAC address or unique identifier of a device
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get Mobile equipment identity number 
     * @return Imei Mobile equipment identity number
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set Mobile equipment identity number
     * @param Imei Mobile equipment identity number
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get Indicates whether to return the time when the frontend obtains the CAPTCHA. Valid values: 1 (return the time) and others. 
     * @return NeedGetCaptchaTime Indicates whether to return the time when the frontend obtains the CAPTCHA. Valid values: 1 (return the time) and others.
     */
    public Long getNeedGetCaptchaTime() {
        return this.NeedGetCaptchaTime;
    }

    /**
     * Set Indicates whether to return the time when the frontend obtains the CAPTCHA. Valid values: 1 (return the time) and others.
     * @param NeedGetCaptchaTime Indicates whether to return the time when the frontend obtains the CAPTCHA. Valid values: 1 (return the time) and others.
     */
    public void setNeedGetCaptchaTime(Long NeedGetCaptchaTime) {
        this.NeedGetCaptchaTime = NeedGetCaptchaTime;
    }

    public DescribeCaptchaResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaResultRequest(DescribeCaptchaResultRequest source) {
        if (source.CaptchaType != null) {
            this.CaptchaType = new Long(source.CaptchaType);
        }
        if (source.Ticket != null) {
            this.Ticket = new String(source.Ticket);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Randstr != null) {
            this.Randstr = new String(source.Randstr);
        }
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new Long(source.CaptchaAppId);
        }
        if (source.AppSecretKey != null) {
            this.AppSecretKey = new String(source.AppSecretKey);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new Long(source.BusinessId);
        }
        if (source.SceneId != null) {
            this.SceneId = new Long(source.SceneId);
        }
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.NeedGetCaptchaTime != null) {
            this.NeedGetCaptchaTime = new Long(source.NeedGetCaptchaTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaType", this.CaptchaType);
        this.setParamSimple(map, prefix + "Ticket", this.Ticket);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Randstr", this.Randstr);
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppSecretKey", this.AppSecretKey);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "NeedGetCaptchaTime", this.NeedGetCaptchaTime);

    }
}

