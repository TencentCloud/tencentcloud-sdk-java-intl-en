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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * AZ name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * AZ description
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * AZ status: AVAILABLE or UNAVAILABLE AVAILABLE means the AZ is available while UNAVAILABLE means the AZ is unavailable.
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

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
     * Get AZ description 
     * @return ZoneName AZ description
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ description
     * @param ZoneName AZ description
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ status: AVAILABLE or UNAVAILABLE AVAILABLE means the AZ is available while UNAVAILABLE means the AZ is unavailable. 
     * @return ZoneState AZ status: AVAILABLE or UNAVAILABLE AVAILABLE means the AZ is available while UNAVAILABLE means the AZ is unavailable.
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set AZ status: AVAILABLE or UNAVAILABLE AVAILABLE means the AZ is available while UNAVAILABLE means the AZ is unavailable.
     * @param ZoneState AZ status: AVAILABLE or UNAVAILABLE AVAILABLE means the AZ is available while UNAVAILABLE means the AZ is unavailable.
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
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

