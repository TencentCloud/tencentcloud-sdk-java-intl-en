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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * <p>Employee sub-account id</p>
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * <p>Employee nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>Employee avatar</p>
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get <p>Employee sub-account id</p> 
     * @return AccountUin <p>Employee sub-account id</p>
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set <p>Employee sub-account id</p>
     * @param AccountUin <p>Employee sub-account id</p>
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get <p>Employee nickname</p> 
     * @return NickName <p>Employee nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Employee nickname</p>
     * @param NickName <p>Employee nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>Employee avatar</p> 
     * @return Avatar <p>Employee avatar</p>
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set <p>Employee avatar</p>
     * @param Avatar <p>Employee avatar</p>
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

