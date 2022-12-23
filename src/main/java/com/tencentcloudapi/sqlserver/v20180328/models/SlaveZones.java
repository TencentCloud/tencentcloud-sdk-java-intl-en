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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaveZones extends AbstractModel{

    /**
    * Replica AZ region code
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Replica AZ
    */
    @SerializedName("SlaveZoneName")
    @Expose
    private String SlaveZoneName;

    /**
     * Get Replica AZ region code 
     * @return SlaveZone Replica AZ region code
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Replica AZ region code
     * @param SlaveZone Replica AZ region code
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Replica AZ 
     * @return SlaveZoneName Replica AZ
     */
    public String getSlaveZoneName() {
        return this.SlaveZoneName;
    }

    /**
     * Set Replica AZ
     * @param SlaveZoneName Replica AZ
     */
    public void setSlaveZoneName(String SlaveZoneName) {
        this.SlaveZoneName = SlaveZoneName;
    }

    public SlaveZones() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveZones(SlaveZones source) {
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.SlaveZoneName != null) {
            this.SlaveZoneName = new String(source.SlaveZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "SlaveZoneName", this.SlaveZoneName);

    }
}

