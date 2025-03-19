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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneConfigParameters extends AbstractModel {

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Site configuration information.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ZoneConfig")
    @Expose
    private ZoneConfig ZoneConfig;

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Site configuration information.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ZoneConfig Site configuration information.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ZoneConfig getZoneConfig() {
        return this.ZoneConfig;
    }

    /**
     * Set Site configuration information.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ZoneConfig Site configuration information.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setZoneConfig(ZoneConfig ZoneConfig) {
        this.ZoneConfig = ZoneConfig;
    }

    public ZoneConfigParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneConfigParameters(ZoneConfigParameters source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneConfig != null) {
            this.ZoneConfig = new ZoneConfig(source.ZoneConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamObj(map, prefix + "ZoneConfig.", this.ZoneConfig);

    }
}

