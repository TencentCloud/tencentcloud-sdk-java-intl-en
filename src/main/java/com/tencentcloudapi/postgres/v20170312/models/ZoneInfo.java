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
    * Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

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
     * Get Availability status. UNAVAILABLE: unavailable, AVAILABLE: available 
     * @return ZoneState Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
     * @param ZoneState Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

