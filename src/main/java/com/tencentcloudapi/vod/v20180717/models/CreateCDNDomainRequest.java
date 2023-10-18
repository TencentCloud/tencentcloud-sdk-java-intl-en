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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCDNDomainRequest extends AbstractModel {

    /**
    * Domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain configuration.
    */
    @SerializedName("Config")
    @Expose
    private CDNDomainConfig Config;

    /**
    * VOD[Subapplication](/document/product/266/14574) ID。If you want to access resources in a Subapplication, fill this field with the Subapplication ID; otherwise, you don't need to fill in this field.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Domain. 
     * @return Domain Domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain.
     * @param Domain Domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain configuration. 
     * @return Config Domain configuration.
     */
    public CDNDomainConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Domain configuration.
     * @param Config Domain configuration.
     */
    public void setConfig(CDNDomainConfig Config) {
        this.Config = Config;
    }

    /**
     * Get VOD[Subapplication](/document/product/266/14574) ID。If you want to access resources in a Subapplication, fill this field with the Subapplication ID; otherwise, you don't need to fill in this field. 
     * @return SubAppId VOD[Subapplication](/document/product/266/14574) ID。If you want to access resources in a Subapplication, fill this field with the Subapplication ID; otherwise, you don't need to fill in this field.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD[Subapplication](/document/product/266/14574) ID。If you want to access resources in a Subapplication, fill this field with the Subapplication ID; otherwise, you don't need to fill in this field.
     * @param SubAppId VOD[Subapplication](/document/product/266/14574) ID。If you want to access resources in a Subapplication, fill this field with the Subapplication ID; otherwise, you don't need to fill in this field.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public CreateCDNDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCDNDomainRequest(CreateCDNDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Config != null) {
            this.Config = new CDNDomainConfig(source.Config);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

