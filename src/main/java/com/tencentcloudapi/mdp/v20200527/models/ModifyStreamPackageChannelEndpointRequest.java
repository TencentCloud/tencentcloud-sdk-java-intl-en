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

public class ModifyStreamPackageChannelEndpointRequest extends AbstractModel{

    /**
    * Channel ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel endpoint URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * New endpoint name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * New channel authentication information
    */
    @SerializedName("AuthInfo")
    @Expose
    private EndpointAuthInfo AuthInfo;

    /**
     * Get Channel ID 
     * @return Id Channel ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID
     * @param Id Channel ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Channel endpoint URL 
     * @return Url Channel endpoint URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Channel endpoint URL
     * @param Url Channel endpoint URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get New endpoint name 
     * @return Name New endpoint name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set New endpoint name
     * @param Name New endpoint name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get New channel authentication information 
     * @return AuthInfo New channel authentication information
     */
    public EndpointAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set New channel authentication information
     * @param AuthInfo New channel authentication information
     */
    public void setAuthInfo(EndpointAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    public ModifyStreamPackageChannelEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageChannelEndpointRequest(ModifyStreamPackageChannelEndpointRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new EndpointAuthInfo(source.AuthInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);

    }
}

