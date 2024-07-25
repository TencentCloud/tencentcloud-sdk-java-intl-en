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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterOption extends AbstractModel {

    /**
    * Computing cluster availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Computing cluster type. Valid values:
- KUBERNETES
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Computing cluster Service CIDR. It must not overlap with the VPC IP range.
    */
    @SerializedName("ServiceCidr")
    @Expose
    private String ServiceCidr;

    /**
    * Resource quota
    */
    @SerializedName("ResourceQuota")
    @Expose
    private ResourceQuota ResourceQuota;

    /**
    * Limit scope
    */
    @SerializedName("LimitRange")
    @Expose
    private LimitRange LimitRange;

    /**
     * Get Computing cluster availability zone 
     * @return Zone Computing cluster availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Computing cluster availability zone
     * @param Zone Computing cluster availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Computing cluster type. Valid values:
- KUBERNETES 
     * @return Type Computing cluster type. Valid values:
- KUBERNETES
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Computing cluster type. Valid values:
- KUBERNETES
     * @param Type Computing cluster type. Valid values:
- KUBERNETES
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Computing cluster Service CIDR. It must not overlap with the VPC IP range. 
     * @return ServiceCidr Computing cluster Service CIDR. It must not overlap with the VPC IP range.
     */
    public String getServiceCidr() {
        return this.ServiceCidr;
    }

    /**
     * Set Computing cluster Service CIDR. It must not overlap with the VPC IP range.
     * @param ServiceCidr Computing cluster Service CIDR. It must not overlap with the VPC IP range.
     */
    public void setServiceCidr(String ServiceCidr) {
        this.ServiceCidr = ServiceCidr;
    }

    /**
     * Get Resource quota 
     * @return ResourceQuota Resource quota
     */
    public ResourceQuota getResourceQuota() {
        return this.ResourceQuota;
    }

    /**
     * Set Resource quota
     * @param ResourceQuota Resource quota
     */
    public void setResourceQuota(ResourceQuota ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

    /**
     * Get Limit scope 
     * @return LimitRange Limit scope
     */
    public LimitRange getLimitRange() {
        return this.LimitRange;
    }

    /**
     * Set Limit scope
     * @param LimitRange Limit scope
     */
    public void setLimitRange(LimitRange LimitRange) {
        this.LimitRange = LimitRange;
    }

    public ClusterOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterOption(ClusterOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceCidr != null) {
            this.ServiceCidr = new String(source.ServiceCidr);
        }
        if (source.ResourceQuota != null) {
            this.ResourceQuota = new ResourceQuota(source.ResourceQuota);
        }
        if (source.LimitRange != null) {
            this.LimitRange = new LimitRange(source.LimitRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceCidr", this.ServiceCidr);
        this.setParamObj(map, prefix + "ResourceQuota.", this.ResourceQuota);
        this.setParamObj(map, prefix + "LimitRange.", this.LimitRange);

    }
}

