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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleZone extends AbstractModel {

    /**
    * Availability zone name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Availability zone numeric ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * AZ Chinese name
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * Whether serverless cluster is supported<br>
0: not supported
1: Support
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Long IsSupportServerless;

    /**
    * Whether a general cluster is supported
0: not supported
1: Support
    */
    @SerializedName("IsSupportNormal")
    @Expose
    private Long IsSupportNormal;

    /**
    * Physical zone
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * Whether the user has AZ permissions
    */
    @SerializedName("HasPermission")
    @Expose
    private Boolean HasPermission;

    /**
    * Whether it is an all-link RDMA availability zone
    */
    @SerializedName("IsWholeRdmaZone")
    @Expose
    private String IsWholeRdmaZone;

    /**
    * Whether new cluster purchase is allowed in the current AZ. 1: allowed, 0: not allowed
    */
    @SerializedName("IsSupportCreateCluster")
    @Expose
    private Long IsSupportCreateCluster;

    /**
     * Get Availability zone name 
     * @return Zone Availability zone name
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone name
     * @param Zone Availability zone name
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Availability zone numeric ID 
     * @return ZoneId Availability zone numeric ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone numeric ID
     * @param ZoneId Availability zone numeric ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ Chinese name 
     * @return ZoneZh AZ Chinese name
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set AZ Chinese name
     * @param ZoneZh AZ Chinese name
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get Whether serverless cluster is supported<br>
0: not supported
1: Support 
     * @return IsSupportServerless Whether serverless cluster is supported<br>
0: not supported
1: Support
     */
    public Long getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set Whether serverless cluster is supported<br>
0: not supported
1: Support
     * @param IsSupportServerless Whether serverless cluster is supported<br>
0: not supported
1: Support
     */
    public void setIsSupportServerless(Long IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    /**
     * Get Whether a general cluster is supported
0: not supported
1: Support 
     * @return IsSupportNormal Whether a general cluster is supported
0: not supported
1: Support
     */
    public Long getIsSupportNormal() {
        return this.IsSupportNormal;
    }

    /**
     * Set Whether a general cluster is supported
0: not supported
1: Support
     * @param IsSupportNormal Whether a general cluster is supported
0: not supported
1: Support
     */
    public void setIsSupportNormal(Long IsSupportNormal) {
        this.IsSupportNormal = IsSupportNormal;
    }

    /**
     * Get Physical zone 
     * @return PhysicalZone Physical zone
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set Physical zone
     * @param PhysicalZone Physical zone
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get Whether the user has AZ permissions 
     * @return HasPermission Whether the user has AZ permissions
     */
    public Boolean getHasPermission() {
        return this.HasPermission;
    }

    /**
     * Set Whether the user has AZ permissions
     * @param HasPermission Whether the user has AZ permissions
     */
    public void setHasPermission(Boolean HasPermission) {
        this.HasPermission = HasPermission;
    }

    /**
     * Get Whether it is an all-link RDMA availability zone 
     * @return IsWholeRdmaZone Whether it is an all-link RDMA availability zone
     */
    public String getIsWholeRdmaZone() {
        return this.IsWholeRdmaZone;
    }

    /**
     * Set Whether it is an all-link RDMA availability zone
     * @param IsWholeRdmaZone Whether it is an all-link RDMA availability zone
     */
    public void setIsWholeRdmaZone(String IsWholeRdmaZone) {
        this.IsWholeRdmaZone = IsWholeRdmaZone;
    }

    /**
     * Get Whether new cluster purchase is allowed in the current AZ. 1: allowed, 0: not allowed 
     * @return IsSupportCreateCluster Whether new cluster purchase is allowed in the current AZ. 1: allowed, 0: not allowed
     */
    public Long getIsSupportCreateCluster() {
        return this.IsSupportCreateCluster;
    }

    /**
     * Set Whether new cluster purchase is allowed in the current AZ. 1: allowed, 0: not allowed
     * @param IsSupportCreateCluster Whether new cluster purchase is allowed in the current AZ. 1: allowed, 0: not allowed
     */
    public void setIsSupportCreateCluster(Long IsSupportCreateCluster) {
        this.IsSupportCreateCluster = IsSupportCreateCluster;
    }

    public SaleZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleZone(SaleZone source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneZh != null) {
            this.ZoneZh = new String(source.ZoneZh);
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Long(source.IsSupportServerless);
        }
        if (source.IsSupportNormal != null) {
            this.IsSupportNormal = new Long(source.IsSupportNormal);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.HasPermission != null) {
            this.HasPermission = new Boolean(source.HasPermission);
        }
        if (source.IsWholeRdmaZone != null) {
            this.IsWholeRdmaZone = new String(source.IsWholeRdmaZone);
        }
        if (source.IsSupportCreateCluster != null) {
            this.IsSupportCreateCluster = new Long(source.IsSupportCreateCluster);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneZh", this.ZoneZh);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);
        this.setParamSimple(map, prefix + "IsSupportNormal", this.IsSupportNormal);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "HasPermission", this.HasPermission);
        this.setParamSimple(map, prefix + "IsWholeRdmaZone", this.IsWholeRdmaZone);
        this.setParamSimple(map, prefix + "IsSupportCreateCluster", this.IsSupportCreateCluster);

    }
}

