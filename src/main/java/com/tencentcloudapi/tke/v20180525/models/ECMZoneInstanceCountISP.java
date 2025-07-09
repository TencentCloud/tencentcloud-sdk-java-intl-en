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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ECMZoneInstanceCountISP extends AbstractModel {

    /**
    * Instance AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of instances to be created in the current AZ
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * ISP
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
     * Get Instance AZ 
     * @return Zone Instance AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ
     * @param Zone Instance AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Number of instances to be created in the current AZ 
     * @return InstanceCount Number of instances to be created in the current AZ
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances to be created in the current AZ
     * @param InstanceCount Number of instances to be created in the current AZ
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get ISP 
     * @return ISP ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set ISP
     * @param ISP ISP
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public ECMZoneInstanceCountISP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ECMZoneInstanceCountISP(ECMZoneInstanceCountISP source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ISP", this.ISP);

    }
}

