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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardUserInfo extends AbstractModel {

    /**
    * User UIN.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 0: general user; 1: Entra ID user.
    */
    @SerializedName("UserTag")
    @Expose
    private String UserTag;

    /**
     * Get User UIN. 
     * @return UserUin User UIN.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set User UIN.
     * @param UserUin User UIN.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Nickname 
     * @return Nickname Nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname
     * @param Nickname Nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 0: general user; 1: Entra ID user. 
     * @return UserTag 0: general user; 1: Entra ID user.
     */
    public String getUserTag() {
        return this.UserTag;
    }

    /**
     * Set 0: general user; 1: Entra ID user.
     * @param UserTag 0: general user; 1: Entra ID user.
     */
    public void setUserTag(String UserTag) {
        this.UserTag = UserTag;
    }

    public StandardUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardUserInfo(StandardUserInfo source) {
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.UserTag != null) {
            this.UserTag = new String(source.UserTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "UserTag", this.UserTag);

    }
}

