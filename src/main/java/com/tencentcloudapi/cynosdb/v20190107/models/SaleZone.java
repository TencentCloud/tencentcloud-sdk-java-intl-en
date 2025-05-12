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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleZone extends AbstractModel {

    /**
    * AZ name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Numeric ID of an AZ
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * AZ name
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * Whether serverless cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Long IsSupportServerless;

    /**
    * Whether standard cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
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
    * Whether the user has AZ permission.
    */
    @SerializedName("HasPermission")
    @Expose
    private Boolean HasPermission;

    /**
    * Whether it is a full-linkage RDMA AZ.
    */
    @SerializedName("IsWholeRdmaZone")
    @Expose
    private String IsWholeRdmaZone;

    /**
    * Specifies whether a newly purchased cluster is allowed in the current availability zone. valid values: 1 (allowed), 0 (not allowed).
    */
    @SerializedName("IsSupportCreateCluster")
    @Expose
    private Long IsSupportCreateCluster;

    /**
     * Get AZ name 
     * @return Zone AZ name
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ name
     * @param Zone AZ name
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Numeric ID of an AZ 
     * @return ZoneId Numeric ID of an AZ
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Numeric ID of an AZ
     * @param ZoneId Numeric ID of an AZ
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ name 
     * @return ZoneZh AZ name
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set AZ name
     * @param ZoneZh AZ name
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get Whether serverless cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes 
     * @return IsSupportServerless Whether serverless cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
     */
    public Long getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set Whether serverless cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
     * @param IsSupportServerless Whether serverless cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
     */
    public void setIsSupportServerless(Long IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    /**
     * Get Whether standard cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes 
     * @return IsSupportNormal Whether standard cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
     */
    public Long getIsSupportNormal() {
        return this.IsSupportNormal;
    }

    /**
     * Set Whether standard cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
     * @param IsSupportNormal Whether standard cluster is supported. Valid values: <br>
`0`: No<br>
`1`: Yes
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
     * Get Whether the user has AZ permission. 
     * @return HasPermission Whether the user has AZ permission.
     */
    public Boolean getHasPermission() {
        return this.HasPermission;
    }

    /**
     * Set Whether the user has AZ permission.
     * @param HasPermission Whether the user has AZ permission.
     */
    public void setHasPermission(Boolean HasPermission) {
        this.HasPermission = HasPermission;
    }

    /**
     * Get Whether it is a full-linkage RDMA AZ. 
     * @return IsWholeRdmaZone Whether it is a full-linkage RDMA AZ.
     */
    public String getIsWholeRdmaZone() {
        return this.IsWholeRdmaZone;
    }

    /**
     * Set Whether it is a full-linkage RDMA AZ.
     * @param IsWholeRdmaZone Whether it is a full-linkage RDMA AZ.
     */
    public void setIsWholeRdmaZone(String IsWholeRdmaZone) {
        this.IsWholeRdmaZone = IsWholeRdmaZone;
    }

    /**
     * Get Specifies whether a newly purchased cluster is allowed in the current availability zone. valid values: 1 (allowed), 0 (not allowed). 
     * @return IsSupportCreateCluster Specifies whether a newly purchased cluster is allowed in the current availability zone. valid values: 1 (allowed), 0 (not allowed).
     */
    public Long getIsSupportCreateCluster() {
        return this.IsSupportCreateCluster;
    }

    /**
     * Set Specifies whether a newly purchased cluster is allowed in the current availability zone. valid values: 1 (allowed), 0 (not allowed).
     * @param IsSupportCreateCluster Specifies whether a newly purchased cluster is allowed in the current availability zone. valid values: 1 (allowed), 0 (not allowed).
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

