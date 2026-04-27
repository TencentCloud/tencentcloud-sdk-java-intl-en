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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * AZ ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Availability zone code.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Chinese Name of Availability Zone.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Availability zone English name.
    */
    @SerializedName("ZoneNameEn")
    @Expose
    private String ZoneNameEn;

    /**
    * Region code.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Area code
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Zone Name
    */
    @SerializedName("LocationName")
    @Expose
    private String LocationName;

    /**
     * Get AZ ID. 
     * @return ZoneId AZ ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID.
     * @param ZoneId AZ ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Availability zone code. 
     * @return Zone Availability zone code.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone code.
     * @param Zone Availability zone code.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Chinese Name of Availability Zone. 
     * @return ZoneName Chinese Name of Availability Zone.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Chinese Name of Availability Zone.
     * @param ZoneName Chinese Name of Availability Zone.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Availability zone English name. 
     * @return ZoneNameEn Availability zone English name.
     */
    public String getZoneNameEn() {
        return this.ZoneNameEn;
    }

    /**
     * Set Availability zone English name.
     * @param ZoneNameEn Availability zone English name.
     */
    public void setZoneNameEn(String ZoneNameEn) {
        this.ZoneNameEn = ZoneNameEn;
    }

    /**
     * Get Region code. 
     * @return Region Region code.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region code.
     * @param Region Region code.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Area code 
     * @return Location Area code
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Area code
     * @param Location Area code
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Zone Name 
     * @return LocationName Zone Name
     */
    public String getLocationName() {
        return this.LocationName;
    }

    /**
     * Set Zone Name
     * @param LocationName Zone Name
     */
    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
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
        if (source.ZoneNameEn != null) {
            this.ZoneNameEn = new String(source.ZoneNameEn);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.LocationName != null) {
            this.LocationName = new String(source.LocationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneNameEn", this.ZoneNameEn);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "LocationName", this.LocationName);

    }
}

