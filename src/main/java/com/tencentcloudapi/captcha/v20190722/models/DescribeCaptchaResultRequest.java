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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaResultRequest extends AbstractModel {

    /**
    * <p>Fixed value: 9.</p>
    */
    @SerializedName("CaptchaType")
    @Expose
    private Long CaptchaType;

    /**
    * <p>User verification ticket returned by the frontend callback function</p>
    */
    @SerializedName("Ticket")
    @Expose
    private String Ticket;

    /**
    * <p>Public network IP of the verification</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>Random string returned by the frontend callback function</p>
    */
    @SerializedName("Randstr")
    @Expose
    private String Randstr;

    /**
    * <p>Captcha appId. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>. In the [Key] column of the verification list, you can see CaptchaAppId.</p>
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * <p>Captcha application key. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>, and view AppSecretKey in the [Key] column of the verification list. AppSecretKey is a key for server-side verification of verification code tickets. Keep it confidential and do not leak it to third parties.</p>
    */
    @SerializedName("AppSecretKey")
    @Expose
    private String AppSecretKey;

    /**
    * <p>Reserved field</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * <p>Reserved field</p>
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * <p>mac address or unique device identifier</p>
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * <p>Mobile device number</p>
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * <p>Whether to return the time when the frontend obtains the verification code. Value: 1: need to return</p>
    */
    @SerializedName("NeedGetCaptchaTime")
    @Expose
    private Long NeedGetCaptchaTime;

    /**
     * Get <p>Fixed value: 9.</p> 
     * @return CaptchaType <p>Fixed value: 9.</p>
     */
    public Long getCaptchaType() {
        return this.CaptchaType;
    }

    /**
     * Set <p>Fixed value: 9.</p>
     * @param CaptchaType <p>Fixed value: 9.</p>
     */
    public void setCaptchaType(Long CaptchaType) {
        this.CaptchaType = CaptchaType;
    }

    /**
     * Get <p>User verification ticket returned by the frontend callback function</p> 
     * @return Ticket <p>User verification ticket returned by the frontend callback function</p>
     */
    public String getTicket() {
        return this.Ticket;
    }

    /**
     * Set <p>User verification ticket returned by the frontend callback function</p>
     * @param Ticket <p>User verification ticket returned by the frontend callback function</p>
     */
    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    /**
     * Get <p>Public network IP of the verification</p> 
     * @return UserIp <p>Public network IP of the verification</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>Public network IP of the verification</p>
     * @param UserIp <p>Public network IP of the verification</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>Random string returned by the frontend callback function</p> 
     * @return Randstr <p>Random string returned by the frontend callback function</p>
     */
    public String getRandstr() {
        return this.Randstr;
    }

    /**
     * Set <p>Random string returned by the frontend callback function</p>
     * @param Randstr <p>Random string returned by the frontend callback function</p>
     */
    public void setRandstr(String Randstr) {
        this.Randstr = Randstr;
    }

    /**
     * Get <p>Captcha appId. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>. In the [Key] column of the verification list, you can see CaptchaAppId.</p> 
     * @return CaptchaAppId <p>Captcha appId. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>. In the [Key] column of the verification list, you can see CaptchaAppId.</p>
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set <p>Captcha appId. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>. In the [Key] column of the verification list, you can see CaptchaAppId.</p>
     * @param CaptchaAppId <p>Captcha appId. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>. In the [Key] column of the verification list, you can see CaptchaAppId.</p>
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get <p>Captcha application key. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>, and view AppSecretKey in the [Key] column of the verification list. AppSecretKey is a key for server-side verification of verification code tickets. Keep it confidential and do not leak it to third parties.</p> 
     * @return AppSecretKey <p>Captcha application key. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>, and view AppSecretKey in the [Key] column of the verification list. AppSecretKey is a key for server-side verification of verification code tickets. Keep it confidential and do not leak it to third parties.</p>
     */
    public String getAppSecretKey() {
        return this.AppSecretKey;
    }

    /**
     * Set <p>Captcha application key. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>, and view AppSecretKey in the [Key] column of the verification list. AppSecretKey is a key for server-side verification of verification code tickets. Keep it confidential and do not leak it to third parties.</p>
     * @param AppSecretKey <p>Captcha application key. Log in to the <a href="https://console.cloud.tencent.com/captcha/graphical">verification code console</a>, and view AppSecretKey in the [Key] column of the verification list. AppSecretKey is a key for server-side verification of verification code tickets. Keep it confidential and do not leak it to third parties.</p>
     */
    public void setAppSecretKey(String AppSecretKey) {
        this.AppSecretKey = AppSecretKey;
    }

    /**
     * Get <p>Reserved field</p> 
     * @return BusinessId <p>Reserved field</p>
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>Reserved field</p>
     * @param BusinessId <p>Reserved field</p>
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>Reserved field</p> 
     * @return SceneId <p>Reserved field</p>
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set <p>Reserved field</p>
     * @param SceneId <p>Reserved field</p>
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get <p>mac address or unique device identifier</p> 
     * @return MacAddress <p>mac address or unique device identifier</p>
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set <p>mac address or unique device identifier</p>
     * @param MacAddress <p>mac address or unique device identifier</p>
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get <p>Mobile device number</p> 
     * @return Imei <p>Mobile device number</p>
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set <p>Mobile device number</p>
     * @param Imei <p>Mobile device number</p>
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get <p>Whether to return the time when the frontend obtains the verification code. Value: 1: need to return</p> 
     * @return NeedGetCaptchaTime <p>Whether to return the time when the frontend obtains the verification code. Value: 1: need to return</p>
     */
    public Long getNeedGetCaptchaTime() {
        return this.NeedGetCaptchaTime;
    }

    /**
     * Set <p>Whether to return the time when the frontend obtains the verification code. Value: 1: need to return</p>
     * @param NeedGetCaptchaTime <p>Whether to return the time when the frontend obtains the verification code. Value: 1: need to return</p>
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

