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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamPackageChannelEndpointRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Authentication information
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
     * Get Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores 
     * @return Name Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
     * @param Name Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Authentication information 
     * @return AuthInfo Authentication information
     */
    public EndpointAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set Authentication information
     * @param AuthInfo Authentication information
     */
    public void setAuthInfo(EndpointAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    public CreateStreamPackageChannelEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageChannelEndpointRequest(CreateStreamPackageChannelEndpointRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);

    }
}

