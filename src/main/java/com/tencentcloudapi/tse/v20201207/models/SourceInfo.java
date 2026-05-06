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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInfo extends AbstractModel {

    /**
    * Microservice engine integration IP address information
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
    * VPC information of the microservice engine
    */
    @SerializedName("VpcInfo")
    @Expose
    private SourceInstanceVpcInfo VpcInfo;

    /**
    * Microservice engine authentication information
    */
    @SerializedName("Auth")
    @Expose
    private SourceInstanceAuth Auth;

    /**
     * Get Microservice engine integration IP address information 
     * @return Addresses Microservice engine integration IP address information
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set Microservice engine integration IP address information
     * @param Addresses Microservice engine integration IP address information
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get VPC information of the microservice engine 
     * @return VpcInfo VPC information of the microservice engine
     */
    public SourceInstanceVpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set VPC information of the microservice engine
     * @param VpcInfo VPC information of the microservice engine
     */
    public void setVpcInfo(SourceInstanceVpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get Microservice engine authentication information 
     * @return Auth Microservice engine authentication information
     */
    public SourceInstanceAuth getAuth() {
        return this.Auth;
    }

    /**
     * Set Microservice engine authentication information
     * @param Auth Microservice engine authentication information
     */
    public void setAuth(SourceInstanceAuth Auth) {
        this.Auth = Auth;
    }

    public SourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInfo(SourceInfo source) {
        if (source.Addresses != null) {
            this.Addresses = new String[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new String(source.Addresses[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new SourceInstanceVpcInfo(source.VpcInfo);
        }
        if (source.Auth != null) {
            this.Auth = new SourceInstanceAuth(source.Auth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamObj(map, prefix + "Auth.", this.Auth);

    }
}

