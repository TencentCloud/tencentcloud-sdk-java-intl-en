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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * Unique ID of the AZ in numeric form, such as 100001
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Unique ID of the AZ in string format, such as ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * AZ name, such as Guangzhou 1
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Region of the availability zone, such as ap-guangzhou.
    */
    @SerializedName("ZoneRegion")
    @Expose
    private String ZoneRegion;

    /**
    * Whether the availability zone is a local availability zone. For example, false.
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * Whether the availability zone is an edge availability zone. For example, false.
    */
    @SerializedName("EdgeZone")
    @Expose
    private Boolean EdgeZone;

    /**
     * Get Unique ID of the AZ in numeric form, such as 100001 
     * @return ZoneId Unique ID of the AZ in numeric form, such as 100001
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Unique ID of the AZ in numeric form, such as 100001
     * @param ZoneId Unique ID of the AZ in numeric form, such as 100001
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Unique ID of the AZ in string format, such as ap-guangzhou-1 
     * @return Zone Unique ID of the AZ in string format, such as ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Unique ID of the AZ in string format, such as ap-guangzhou-1
     * @param Zone Unique ID of the AZ in string format, such as ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get AZ name, such as Guangzhou 1 
     * @return ZoneName AZ name, such as Guangzhou 1
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name, such as Guangzhou 1
     * @param ZoneName AZ name, such as Guangzhou 1
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Region of the availability zone, such as ap-guangzhou. 
     * @return ZoneRegion Region of the availability zone, such as ap-guangzhou.
     */
    public String getZoneRegion() {
        return this.ZoneRegion;
    }

    /**
     * Set Region of the availability zone, such as ap-guangzhou.
     * @param ZoneRegion Region of the availability zone, such as ap-guangzhou.
     */
    public void setZoneRegion(String ZoneRegion) {
        this.ZoneRegion = ZoneRegion;
    }

    /**
     * Get Whether the availability zone is a local availability zone. For example, false. 
     * @return LocalZone Whether the availability zone is a local availability zone. For example, false.
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set Whether the availability zone is a local availability zone. For example, false.
     * @param LocalZone Whether the availability zone is a local availability zone. For example, false.
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get Whether the availability zone is an edge availability zone. For example, false. 
     * @return EdgeZone Whether the availability zone is an edge availability zone. For example, false.
     */
    public Boolean getEdgeZone() {
        return this.EdgeZone;
    }

    /**
     * Set Whether the availability zone is an edge availability zone. For example, false.
     * @param EdgeZone Whether the availability zone is an edge availability zone. For example, false.
     */
    public void setEdgeZone(Boolean EdgeZone) {
        this.EdgeZone = EdgeZone;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneRegion != null) {
            this.ZoneRegion = new String(source.ZoneRegion);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.EdgeZone != null) {
            this.EdgeZone = new Boolean(source.EdgeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneRegion", this.ZoneRegion);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "EdgeZone", this.EdgeZone);

    }
}

