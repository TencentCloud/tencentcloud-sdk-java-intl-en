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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginActionFlag extends AbstractModel {

    /**
    * Phone
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * Hard token
    */
    @SerializedName("Token")
    @Expose
    private Long Token;

    /**
    * Soft token
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * WeChat
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * Custom
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
    * Mail
    */
    @SerializedName("Mail")
    @Expose
    private Long Mail;

    /**
    * U2F token
    */
    @SerializedName("U2FToken")
    @Expose
    private Long U2FToken;

    /**
     * Get Phone 
     * @return Phone Phone
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * Set Phone
     * @param Phone Phone
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Hard token 
     * @return Token Hard token
     */
    public Long getToken() {
        return this.Token;
    }

    /**
     * Set Hard token
     * @param Token Hard token
     */
    public void setToken(Long Token) {
        this.Token = Token;
    }

    /**
     * Get Soft token 
     * @return Stoken Soft token
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * Set Soft token
     * @param Stoken Soft token
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * Get WeChat 
     * @return Wechat WeChat
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set WeChat
     * @param Wechat WeChat
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get Custom 
     * @return Custom Custom
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * Set Custom
     * @param Custom Custom
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    /**
     * Get Mail 
     * @return Mail Mail
     */
    public Long getMail() {
        return this.Mail;
    }

    /**
     * Set Mail
     * @param Mail Mail
     */
    public void setMail(Long Mail) {
        this.Mail = Mail;
    }

    /**
     * Get U2F token 
     * @return U2FToken U2F token
     */
    public Long getU2FToken() {
        return this.U2FToken;
    }

    /**
     * Set U2F token
     * @param U2FToken U2F token
     */
    public void setU2FToken(Long U2FToken) {
        this.U2FToken = U2FToken;
    }

    public LoginActionFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginActionFlag(LoginActionFlag source) {
        if (source.Phone != null) {
            this.Phone = new Long(source.Phone);
        }
        if (source.Token != null) {
            this.Token = new Long(source.Token);
        }
        if (source.Stoken != null) {
            this.Stoken = new Long(source.Stoken);
        }
        if (source.Wechat != null) {
            this.Wechat = new Long(source.Wechat);
        }
        if (source.Custom != null) {
            this.Custom = new Long(source.Custom);
        }
        if (source.Mail != null) {
            this.Mail = new Long(source.Mail);
        }
        if (source.U2FToken != null) {
            this.U2FToken = new Long(source.U2FToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Stoken", this.Stoken);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "Custom", this.Custom);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "U2FToken", this.U2FToken);

    }
}

