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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMNGDomainRequest extends AbstractModel {

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Platform ID</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Domain list</p>
    */
    @SerializedName("Domain")
    @Expose
    private CreateDomainParam [] Domain;

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Platform ID</p> 
     * @return PlatformId <p>Platform ID</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID</p>
     * @param PlatformId <p>Platform ID</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Domain list</p> 
     * @return Domain <p>Domain list</p>
     */
    public CreateDomainParam [] getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain list</p>
     * @param Domain <p>Domain list</p>
     */
    public void setDomain(CreateDomainParam [] Domain) {
        this.Domain = Domain;
    }

    public ModifyMNGDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMNGDomainRequest(ModifyMNGDomainRequest source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.Domain != null) {
            this.Domain = new CreateDomainParam[source.Domain.length];
            for (int i = 0; i < source.Domain.length; i++) {
                this.Domain[i] = new CreateDomainParam(source.Domain[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamArrayObj(map, prefix + "Domain.", this.Domain);

    }
}

