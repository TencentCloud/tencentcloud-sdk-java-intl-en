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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskCenterStatusKey extends AbstractModel {

    /**
    * Risk ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * User AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Public IP/domain name
    */
    @SerializedName("PublicIPDomain")
    @Expose
    private String PublicIPDomain;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Risk ID 
     * @return Id Risk ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Risk ID
     * @param Id Risk ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get User AppId 
     * @return AppId User AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
     * @param AppId User AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Public IP/domain name 
     * @return PublicIPDomain Public IP/domain name
     */
    public String getPublicIPDomain() {
        return this.PublicIPDomain;
    }

    /**
     * Set Public IP/domain name
     * @param PublicIPDomain Public IP/domain name
     */
    public void setPublicIPDomain(String PublicIPDomain) {
        this.PublicIPDomain = PublicIPDomain;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public RiskCenterStatusKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCenterStatusKey(RiskCenterStatusKey source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.PublicIPDomain != null) {
            this.PublicIPDomain = new String(source.PublicIPDomain);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PublicIPDomain", this.PublicIPDomain);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

