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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OsName extends AbstractModel {

    /**
    * System name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Operating system type enumeration value
    */
    @SerializedName("MachineOSType")
    @Expose
    private Long MachineOSType;

    /**
     * Get System name 
     * @return Name System name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set System name
     * @param Name System name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Operating system type enumeration value 
     * @return MachineOSType Operating system type enumeration value
     */
    public Long getMachineOSType() {
        return this.MachineOSType;
    }

    /**
     * Set Operating system type enumeration value
     * @param MachineOSType Operating system type enumeration value
     */
    public void setMachineOSType(Long MachineOSType) {
        this.MachineOSType = MachineOSType;
    }

    public OsName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OsName(OsName source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MachineOSType != null) {
            this.MachineOSType = new Long(source.MachineOSType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MachineOSType", this.MachineOSType);

    }
}

