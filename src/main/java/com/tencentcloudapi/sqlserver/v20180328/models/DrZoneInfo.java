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

public class DrZoneInfo extends AbstractModel {

    /**
    * Resource ID of the secondary node.
    */
    @SerializedName("DrInstanceId")
    @Expose
    private String DrInstanceId;

    /**
    * AZ of the secondary node.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Resource ID of the secondary node. 
     * @return DrInstanceId Resource ID of the secondary node.
     */
    public String getDrInstanceId() {
        return this.DrInstanceId;
    }

    /**
     * Set Resource ID of the secondary node.
     * @param DrInstanceId Resource ID of the secondary node.
     */
    public void setDrInstanceId(String DrInstanceId) {
        this.DrInstanceId = DrInstanceId;
    }

    /**
     * Get AZ of the secondary node. 
     * @return Zone AZ of the secondary node.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ of the secondary node.
     * @param Zone AZ of the secondary node.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DrZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrZoneInfo(DrZoneInfo source) {
        if (source.DrInstanceId != null) {
            this.DrInstanceId = new String(source.DrInstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrInstanceId", this.DrInstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

