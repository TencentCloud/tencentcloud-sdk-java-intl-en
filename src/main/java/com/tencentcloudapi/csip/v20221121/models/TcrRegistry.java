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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrRegistry extends AbstractModel {

    /**
    * <p>Repository instance id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Warehouse name</p>
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * <p>Repository domain.</p>
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * <p>region where the repository is located</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>Repository id</p>
    */
    @SerializedName("RegistryRegionId")
    @Expose
    private Long RegistryRegionId;

    /**
     * Get <p>Repository instance id</p> 
     * @return RegistryId <p>Repository instance id</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>Repository instance id</p>
     * @param RegistryId <p>Repository instance id</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Warehouse name</p> 
     * @return RegistryName <p>Warehouse name</p>
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set <p>Warehouse name</p>
     * @param RegistryName <p>Warehouse name</p>
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get <p>Repository domain.</p> 
     * @return PublicDomain <p>Repository domain.</p>
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set <p>Repository domain.</p>
     * @param PublicDomain <p>Repository domain.</p>
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get <p>region where the repository is located</p> 
     * @return RegistryRegion <p>region where the repository is located</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>region where the repository is located</p>
     * @param RegistryRegion <p>region where the repository is located</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Repository id</p> 
     * @return RegistryRegionId <p>Repository id</p>
     */
    public Long getRegistryRegionId() {
        return this.RegistryRegionId;
    }

    /**
     * Set <p>Repository id</p>
     * @param RegistryRegionId <p>Repository id</p>
     */
    public void setRegistryRegionId(Long RegistryRegionId) {
        this.RegistryRegionId = RegistryRegionId;
    }

    public TcrRegistry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrRegistry(TcrRegistry source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryRegionId != null) {
            this.RegistryRegionId = new Long(source.RegistryRegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryRegionId", this.RegistryRegionId);

    }
}

