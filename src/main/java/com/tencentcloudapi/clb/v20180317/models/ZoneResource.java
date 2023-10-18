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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResource extends AbstractModel {

    /**
    * Primary AZ, such as "ap-guangzhou-1".
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * List of resources
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceSet")
    @Expose
    private Resource [] ResourceSet;

    /**
    * Secondary AZ, such as "ap-guangzhou-2". 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * IP version. Values: `IPv4`, `IPv6`, and `IPv6_Nat`.
    */
    @SerializedName("IPVersion")
    @Expose
    private String IPVersion;

    /**
    * Region of the AZ, such as `ap-guangzhou`.
    */
    @SerializedName("ZoneRegion")
    @Expose
    private String ZoneRegion;

    /**
    * Whether the AZ is a `LocalZone`. Values: `true`, `false`.
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * Type of resources in the zone. Values: `SHARED`, `EXCLUSIVE`
    */
    @SerializedName("ZoneResourceType")
    @Expose
    private String ZoneResourceType;

    /**
    * Whether the AZ is an edge zone. Values: `true`, `false`.
    */
    @SerializedName("EdgeZone")
    @Expose
    private Boolean EdgeZone;

    /**
     * Get Primary AZ, such as "ap-guangzhou-1". 
     * @return MasterZone Primary AZ, such as "ap-guangzhou-1".
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary AZ, such as "ap-guangzhou-1".
     * @param MasterZone Primary AZ, such as "ap-guangzhou-1".
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get List of resources
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceSet List of resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Resource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set List of resources
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceSet List of resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceSet(Resource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get Secondary AZ, such as "ap-guangzhou-2". 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveZone Secondary AZ, such as "ap-guangzhou-2". 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Secondary AZ, such as "ap-guangzhou-2". 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveZone Secondary AZ, such as "ap-guangzhou-2". 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get IP version. Values: `IPv4`, `IPv6`, and `IPv6_Nat`. 
     * @return IPVersion IP version. Values: `IPv4`, `IPv6`, and `IPv6_Nat`.
     */
    public String getIPVersion() {
        return this.IPVersion;
    }

    /**
     * Set IP version. Values: `IPv4`, `IPv6`, and `IPv6_Nat`.
     * @param IPVersion IP version. Values: `IPv4`, `IPv6`, and `IPv6_Nat`.
     */
    public void setIPVersion(String IPVersion) {
        this.IPVersion = IPVersion;
    }

    /**
     * Get Region of the AZ, such as `ap-guangzhou`. 
     * @return ZoneRegion Region of the AZ, such as `ap-guangzhou`.
     */
    public String getZoneRegion() {
        return this.ZoneRegion;
    }

    /**
     * Set Region of the AZ, such as `ap-guangzhou`.
     * @param ZoneRegion Region of the AZ, such as `ap-guangzhou`.
     */
    public void setZoneRegion(String ZoneRegion) {
        this.ZoneRegion = ZoneRegion;
    }

    /**
     * Get Whether the AZ is a `LocalZone`. Values: `true`, `false`. 
     * @return LocalZone Whether the AZ is a `LocalZone`. Values: `true`, `false`.
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set Whether the AZ is a `LocalZone`. Values: `true`, `false`.
     * @param LocalZone Whether the AZ is a `LocalZone`. Values: `true`, `false`.
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get Type of resources in the zone. Values: `SHARED`, `EXCLUSIVE` 
     * @return ZoneResourceType Type of resources in the zone. Values: `SHARED`, `EXCLUSIVE`
     */
    public String getZoneResourceType() {
        return this.ZoneResourceType;
    }

    /**
     * Set Type of resources in the zone. Values: `SHARED`, `EXCLUSIVE`
     * @param ZoneResourceType Type of resources in the zone. Values: `SHARED`, `EXCLUSIVE`
     */
    public void setZoneResourceType(String ZoneResourceType) {
        this.ZoneResourceType = ZoneResourceType;
    }

    /**
     * Get Whether the AZ is an edge zone. Values: `true`, `false`. 
     * @return EdgeZone Whether the AZ is an edge zone. Values: `true`, `false`.
     */
    public Boolean getEdgeZone() {
        return this.EdgeZone;
    }

    /**
     * Set Whether the AZ is an edge zone. Values: `true`, `false`.
     * @param EdgeZone Whether the AZ is an edge zone. Values: `true`, `false`.
     */
    public void setEdgeZone(Boolean EdgeZone) {
        this.EdgeZone = EdgeZone;
    }

    public ZoneResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneResource(ZoneResource source) {
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.ResourceSet != null) {
            this.ResourceSet = new Resource[source.ResourceSet.length];
            for (int i = 0; i < source.ResourceSet.length; i++) {
                this.ResourceSet[i] = new Resource(source.ResourceSet[i]);
            }
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.IPVersion != null) {
            this.IPVersion = new String(source.IPVersion);
        }
        if (source.ZoneRegion != null) {
            this.ZoneRegion = new String(source.ZoneRegion);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.ZoneResourceType != null) {
            this.ZoneResourceType = new String(source.ZoneResourceType);
        }
        if (source.EdgeZone != null) {
            this.EdgeZone = new Boolean(source.EdgeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "IPVersion", this.IPVersion);
        this.setParamSimple(map, prefix + "ZoneRegion", this.ZoneRegion);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "ZoneResourceType", this.ZoneResourceType);
        this.setParamSimple(map, prefix + "EdgeZone", this.EdgeZone);

    }
}

