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

public class SyncImageRegistryRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Whether to synchronize all repositories</p><p>Enumeration values:</p><ul><li>true: yes</li><li>false: no</li></ul>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>List of mirror repository IDs to be synchronized</p>
    */
    @SerializedName("RegistryIds")
    @Expose
    private Long [] RegistryIds;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Whether to synchronize all repositories</p><p>Enumeration values:</p><ul><li>true: yes</li><li>false: no</li></ul> 
     * @return All <p>Whether to synchronize all repositories</p><p>Enumeration values:</p><ul><li>true: yes</li><li>false: no</li></ul>
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>Whether to synchronize all repositories</p><p>Enumeration values:</p><ul><li>true: yes</li><li>false: no</li></ul>
     * @param All <p>Whether to synchronize all repositories</p><p>Enumeration values:</p><ul><li>true: yes</li><li>false: no</li></ul>
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>List of mirror repository IDs to be synchronized</p> 
     * @return RegistryIds <p>List of mirror repository IDs to be synchronized</p>
     */
    public Long [] getRegistryIds() {
        return this.RegistryIds;
    }

    /**
     * Set <p>List of mirror repository IDs to be synchronized</p>
     * @param RegistryIds <p>List of mirror repository IDs to be synchronized</p>
     */
    public void setRegistryIds(Long [] RegistryIds) {
        this.RegistryIds = RegistryIds;
    }

    public SyncImageRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncImageRegistryRequest(SyncImageRegistryRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.RegistryIds != null) {
            this.RegistryIds = new Long[source.RegistryIds.length];
            for (int i = 0; i < source.RegistryIds.length; i++) {
                this.RegistryIds[i] = new Long(source.RegistryIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "RegistryIds.", this.RegistryIds);

    }
}

