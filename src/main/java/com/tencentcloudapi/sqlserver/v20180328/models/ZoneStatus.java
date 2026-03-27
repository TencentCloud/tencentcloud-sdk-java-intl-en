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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneStatus extends AbstractModel {

    /**
    * Specification AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Specification Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Specification Sale Status in the AZ: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Specification AZ 
     * @return Zone Specification AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Specification AZ
     * @param Zone Specification AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Specification Region 
     * @return Region Specification Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Specification Region
     * @param Region Specification Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Specification Sale Status in the AZ: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled. 
     * @return Status Specification Sale Status in the AZ: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specification Sale Status in the AZ: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
     * @param Status Specification Sale Status in the AZ: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ZoneStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStatus(ZoneStatus source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

