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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * AZ abbreviation
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * AZ name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * AZ number
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Availability status. Valid values:
`UNAVAILABLE`.
`AVAILABLE`.
`SELLOUT`.
`SUPPORTMODIFYONLY` (supports configuration adjustment).
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
    * Whether the AZ supports IPv6 address access
    */
    @SerializedName("ZoneSupportIpv6")
    @Expose
    private Long ZoneSupportIpv6;

    /**
    * AZs that can be used as standby when this AZ is primary
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StandbyZoneSet")
    @Expose
    private String [] StandbyZoneSet;

    /**
     * Get AZ abbreviation 
     * @return Zone AZ abbreviation
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ abbreviation
     * @param Zone AZ abbreviation
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get AZ name 
     * @return ZoneName AZ name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name
     * @param ZoneName AZ name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get AZ number 
     * @return ZoneId AZ number
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ number
     * @param ZoneId AZ number
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Availability status. Valid values:
`UNAVAILABLE`.
`AVAILABLE`.
`SELLOUT`.
`SUPPORTMODIFYONLY` (supports configuration adjustment). 
     * @return ZoneState Availability status. Valid values:
`UNAVAILABLE`.
`AVAILABLE`.
`SELLOUT`.
`SUPPORTMODIFYONLY` (supports configuration adjustment).
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set Availability status. Valid values:
`UNAVAILABLE`.
`AVAILABLE`.
`SELLOUT`.
`SUPPORTMODIFYONLY` (supports configuration adjustment).
     * @param ZoneState Availability status. Valid values:
`UNAVAILABLE`.
`AVAILABLE`.
`SELLOUT`.
`SUPPORTMODIFYONLY` (supports configuration adjustment).
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Get Whether the AZ supports IPv6 address access 
     * @return ZoneSupportIpv6 Whether the AZ supports IPv6 address access
     */
    public Long getZoneSupportIpv6() {
        return this.ZoneSupportIpv6;
    }

    /**
     * Set Whether the AZ supports IPv6 address access
     * @param ZoneSupportIpv6 Whether the AZ supports IPv6 address access
     */
    public void setZoneSupportIpv6(Long ZoneSupportIpv6) {
        this.ZoneSupportIpv6 = ZoneSupportIpv6;
    }

    /**
     * Get AZs that can be used as standby when this AZ is primary
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StandbyZoneSet AZs that can be used as standby when this AZ is primary
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getStandbyZoneSet() {
        return this.StandbyZoneSet;
    }

    /**
     * Set AZs that can be used as standby when this AZ is primary
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StandbyZoneSet AZs that can be used as standby when this AZ is primary
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStandbyZoneSet(String [] StandbyZoneSet) {
        this.StandbyZoneSet = StandbyZoneSet;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneState != null) {
            this.ZoneState = new String(source.ZoneState);
        }
        if (source.ZoneSupportIpv6 != null) {
            this.ZoneSupportIpv6 = new Long(source.ZoneSupportIpv6);
        }
        if (source.StandbyZoneSet != null) {
            this.StandbyZoneSet = new String[source.StandbyZoneSet.length];
            for (int i = 0; i < source.StandbyZoneSet.length; i++) {
                this.StandbyZoneSet[i] = new String(source.StandbyZoneSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);
        this.setParamSimple(map, prefix + "ZoneSupportIpv6", this.ZoneSupportIpv6);
        this.setParamArraySimple(map, prefix + "StandbyZoneSet.", this.StandbyZoneSet);

    }
}

