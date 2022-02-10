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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceTokenRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Access credential type. Values: `longterm` and `temp` (default, valid for one hour)
    */
    @SerializedName("TokenType")
    @Expose
    private String TokenType;

    /**
    * Description of the long-term access credential
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Access credential type. Values: `longterm` and `temp` (default, valid for one hour) 
     * @return TokenType Access credential type. Values: `longterm` and `temp` (default, valid for one hour)
     */
    public String getTokenType() {
        return this.TokenType;
    }

    /**
     * Set Access credential type. Values: `longterm` and `temp` (default, valid for one hour)
     * @param TokenType Access credential type. Values: `longterm` and `temp` (default, valid for one hour)
     */
    public void setTokenType(String TokenType) {
        this.TokenType = TokenType;
    }

    /**
     * Get Description of the long-term access credential 
     * @return Desc Description of the long-term access credential
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description of the long-term access credential
     * @param Desc Description of the long-term access credential
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public CreateInstanceTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceTokenRequest(CreateInstanceTokenRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.TokenType != null) {
            this.TokenType = new String(source.TokenType);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "TokenType", this.TokenType);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

