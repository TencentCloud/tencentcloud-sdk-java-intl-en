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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClustersRequest extends AbstractModel {

    /**
    * Query by one or more instance IDs. Example of instance ID: cluster-xxxxxxxx
    */
    @SerializedName("DedicatedClusterIds")
    @Expose
    private String [] DedicatedClusterIds;

    /**
    * Filter by AZ name.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Filter by site id.
    */
    @SerializedName("SiteIds")
    @Expose
    private String [] SiteIds;

    /**
    * Filter by CDC life cycle.
    */
    @SerializedName("LifecycleStatuses")
    @Expose
    private String [] LifecycleStatuses;

    /**
    * Name of fuzzy matching CDC
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Query by one or more instance IDs. Example of instance ID: cluster-xxxxxxxx 
     * @return DedicatedClusterIds Query by one or more instance IDs. Example of instance ID: cluster-xxxxxxxx
     */
    public String [] getDedicatedClusterIds() {
        return this.DedicatedClusterIds;
    }

    /**
     * Set Query by one or more instance IDs. Example of instance ID: cluster-xxxxxxxx
     * @param DedicatedClusterIds Query by one or more instance IDs. Example of instance ID: cluster-xxxxxxxx
     */
    public void setDedicatedClusterIds(String [] DedicatedClusterIds) {
        this.DedicatedClusterIds = DedicatedClusterIds;
    }

    /**
     * Get Filter by AZ name. 
     * @return Zones Filter by AZ name.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Filter by AZ name.
     * @param Zones Filter by AZ name.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Filter by site id. 
     * @return SiteIds Filter by site id.
     */
    public String [] getSiteIds() {
        return this.SiteIds;
    }

    /**
     * Set Filter by site id.
     * @param SiteIds Filter by site id.
     */
    public void setSiteIds(String [] SiteIds) {
        this.SiteIds = SiteIds;
    }

    /**
     * Get Filter by CDC life cycle. 
     * @return LifecycleStatuses Filter by CDC life cycle.
     */
    public String [] getLifecycleStatuses() {
        return this.LifecycleStatuses;
    }

    /**
     * Set Filter by CDC life cycle.
     * @param LifecycleStatuses Filter by CDC life cycle.
     */
    public void setLifecycleStatuses(String [] LifecycleStatuses) {
        this.LifecycleStatuses = LifecycleStatuses;
    }

    /**
     * Get Name of fuzzy matching CDC 
     * @return Name Name of fuzzy matching CDC
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of fuzzy matching CDC
     * @param Name Name of fuzzy matching CDC
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDedicatedClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClustersRequest(DescribeDedicatedClustersRequest source) {
        if (source.DedicatedClusterIds != null) {
            this.DedicatedClusterIds = new String[source.DedicatedClusterIds.length];
            for (int i = 0; i < source.DedicatedClusterIds.length; i++) {
                this.DedicatedClusterIds[i] = new String(source.DedicatedClusterIds[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SiteIds != null) {
            this.SiteIds = new String[source.SiteIds.length];
            for (int i = 0; i < source.SiteIds.length; i++) {
                this.SiteIds[i] = new String(source.SiteIds[i]);
            }
        }
        if (source.LifecycleStatuses != null) {
            this.LifecycleStatuses = new String[source.LifecycleStatuses.length];
            for (int i = 0; i < source.LifecycleStatuses.length; i++) {
                this.LifecycleStatuses[i] = new String(source.LifecycleStatuses[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DedicatedClusterIds.", this.DedicatedClusterIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "SiteIds.", this.SiteIds);
        this.setParamArraySimple(map, prefix + "LifecycleStatuses.", this.LifecycleStatuses);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

