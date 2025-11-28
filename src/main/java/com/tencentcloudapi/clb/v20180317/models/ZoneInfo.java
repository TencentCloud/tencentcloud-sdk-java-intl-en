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
package com.tencentcloudapi.clb.v20180317.models;

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
    * Specifies the region of the availability zone, for example: ap-guangzhou.
    */
    @SerializedName("ZoneRegion")
    @Expose
    private String ZoneRegion;

    /**
    * Indicates whether the AZ is a LocalZone az, for example: false.
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * Indicates whether the AZ is an EdgeZone az, for example: false.
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
     * Get Specifies the region of the availability zone, for example: ap-guangzhou. 
     * @return ZoneRegion Specifies the region of the availability zone, for example: ap-guangzhou.
     */
    public String getZoneRegion() {
        return this.ZoneRegion;
    }

    /**
     * Set Specifies the region of the availability zone, for example: ap-guangzhou.
     * @param ZoneRegion Specifies the region of the availability zone, for example: ap-guangzhou.
     */
    public void setZoneRegion(String ZoneRegion) {
        this.ZoneRegion = ZoneRegion;
    }

    /**
     * Get Indicates whether the AZ is a LocalZone az, for example: false. 
     * @return LocalZone Indicates whether the AZ is a LocalZone az, for example: false.
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set Indicates whether the AZ is a LocalZone az, for example: false.
     * @param LocalZone Indicates whether the AZ is a LocalZone az, for example: false.
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get Indicates whether the AZ is an EdgeZone az, for example: false. 
     * @return EdgeZone Indicates whether the AZ is an EdgeZone az, for example: false.
     */
    public Boolean getEdgeZone() {
        return this.EdgeZone;
    }

    /**
     * Set Indicates whether the AZ is an EdgeZone az, for example: false.
     * @param EdgeZone Indicates whether the AZ is an EdgeZone az, for example: false.
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

