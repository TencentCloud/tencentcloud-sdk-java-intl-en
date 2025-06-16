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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Credentials extends AbstractModel {

    /**
    * Token.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Temporary license key ID.
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary license key.
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * Temporary license appid.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get Token. 
     * @return Token Token.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token.
     * @param Token Token.
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Temporary license key ID. 
     * @return TmpSecretId Temporary license key ID.
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary license key ID.
     * @param TmpSecretId Temporary license key ID.
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary license key. 
     * @return TmpSecretKey Temporary license key.
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary license key.
     * @param TmpSecretKey Temporary license key.
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get Temporary license appid. 
     * @return AppId Temporary license appid.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Temporary license appid.
     * @param AppId Temporary license appid.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public Credentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Credentials(Credentials source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

