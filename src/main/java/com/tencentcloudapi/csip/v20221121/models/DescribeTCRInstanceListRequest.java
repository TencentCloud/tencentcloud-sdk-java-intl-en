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

public class DescribeTCRInstanceListRequest extends AbstractModel {

    /**
    * <p>Access key Id</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>Access Key</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>region where the mirror repository is located</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String [] RegistryRegion;

    /**
    * <p>Mirror repository id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Filter item</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get <p>Access key Id</p> 
     * @return AccessKey <p>Access key Id</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>Access key Id</p>
     * @param AccessKey <p>Access key Id</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>Access Key</p> 
     * @return SecretKey <p>Access Key</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>Access Key</p>
     * @param SecretKey <p>Access Key</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

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
     * Get <p>region where the mirror repository is located</p> 
     * @return RegistryRegion <p>region where the mirror repository is located</p>
     */
    public String [] getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>region where the mirror repository is located</p>
     * @param RegistryRegion <p>region where the mirror repository is located</p>
     */
    public void setRegistryRegion(String [] RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Mirror repository id</p> 
     * @return RegistryId <p>Mirror repository id</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>Mirror repository id</p>
     * @param RegistryId <p>Mirror repository id</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Filter item</p> 
     * @return Filter <p>Filter item</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Filter item</p>
     * @param Filter <p>Filter item</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeTCRInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTCRInstanceListRequest(DescribeTCRInstanceListRequest source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String[source.RegistryRegion.length];
            for (int i = 0; i < source.RegistryRegion.length; i++) {
                this.RegistryRegion[i] = new String(source.RegistryRegion[i]);
            }
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "RegistryRegion.", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

