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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointInfo extends AbstractModel{

    /**
    * Endpoint name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Endpoint URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Endpoint authentication information.
    */
    @SerializedName("AuthInfo")
    @Expose
    private EndpointAuthInfo AuthInfo;

    /**
     * Get Endpoint name. 
     * @return Name Endpoint name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Endpoint name.
     * @param Name Endpoint name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Endpoint URL. 
     * @return Url Endpoint URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Endpoint URL.
     * @param Url Endpoint URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Endpoint authentication information. 
     * @return AuthInfo Endpoint authentication information.
     */
    public EndpointAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set Endpoint authentication information.
     * @param AuthInfo Endpoint authentication information.
     */
    public void setAuthInfo(EndpointAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    public EndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointInfo(EndpointInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new EndpointAuthInfo(source.AuthInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);

    }
}

