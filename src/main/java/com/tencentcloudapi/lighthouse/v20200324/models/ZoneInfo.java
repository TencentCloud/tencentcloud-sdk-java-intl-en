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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Chinese name of AZ
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * AZ tags on instance purchase page
    */
    @SerializedName("InstanceDisplayLabel")
    @Expose
    private String InstanceDisplayLabel;

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Chinese name of AZ 
     * @return ZoneName Chinese name of AZ
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Chinese name of AZ
     * @param ZoneName Chinese name of AZ
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get AZ tags on instance purchase page 
     * @return InstanceDisplayLabel AZ tags on instance purchase page
     */
    public String getInstanceDisplayLabel() {
        return this.InstanceDisplayLabel;
    }

    /**
     * Set AZ tags on instance purchase page
     * @param InstanceDisplayLabel AZ tags on instance purchase page
     */
    public void setInstanceDisplayLabel(String InstanceDisplayLabel) {
        this.InstanceDisplayLabel = InstanceDisplayLabel;
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
        if (source.InstanceDisplayLabel != null) {
            this.InstanceDisplayLabel = new String(source.InstanceDisplayLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "InstanceDisplayLabel", this.InstanceDisplayLabel);

    }
}

