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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBNode extends AbstractModel {

    /**
    * Node type. Valid values:
`Primary`;
`Standby`.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * AZ where the node resides, such as ap-guangzhou-1.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Node type. Valid values:
`Primary`;
`Standby`. 
     * @return Role Node type. Valid values:
`Primary`;
`Standby`.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node type. Valid values:
`Primary`;
`Standby`.
     * @param Role Node type. Valid values:
`Primary`;
`Standby`.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get AZ where the node resides, such as ap-guangzhou-1. 
     * @return Zone AZ where the node resides, such as ap-guangzhou-1.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ where the node resides, such as ap-guangzhou-1.
     * @param Zone AZ where the node resides, such as ap-guangzhou-1.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DBNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBNode(DBNode source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

