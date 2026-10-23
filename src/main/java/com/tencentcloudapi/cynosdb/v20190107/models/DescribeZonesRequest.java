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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel {

    /**
    * Whether the virtual zone is contained
    */
    @SerializedName("IncludeVirtualZones")
    @Expose
    private Boolean IncludeVirtualZones;

    /**
    * Whether to display all AZs in the region and show user permissions for each availability zone
    */
    @SerializedName("ShowPermission")
    @Expose
    private Boolean ShowPermission;

    /**
     * Get Whether the virtual zone is contained 
     * @return IncludeVirtualZones Whether the virtual zone is contained
     */
    public Boolean getIncludeVirtualZones() {
        return this.IncludeVirtualZones;
    }

    /**
     * Set Whether the virtual zone is contained
     * @param IncludeVirtualZones Whether the virtual zone is contained
     */
    public void setIncludeVirtualZones(Boolean IncludeVirtualZones) {
        this.IncludeVirtualZones = IncludeVirtualZones;
    }

    /**
     * Get Whether to display all AZs in the region and show user permissions for each availability zone 
     * @return ShowPermission Whether to display all AZs in the region and show user permissions for each availability zone
     */
    public Boolean getShowPermission() {
        return this.ShowPermission;
    }

    /**
     * Set Whether to display all AZs in the region and show user permissions for each availability zone
     * @param ShowPermission Whether to display all AZs in the region and show user permissions for each availability zone
     */
    public void setShowPermission(Boolean ShowPermission) {
        this.ShowPermission = ShowPermission;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.IncludeVirtualZones != null) {
            this.IncludeVirtualZones = new Boolean(source.IncludeVirtualZones);
        }
        if (source.ShowPermission != null) {
            this.ShowPermission = new Boolean(source.ShowPermission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncludeVirtualZones", this.IncludeVirtualZones);
        this.setParamSimple(map, prefix + "ShowPermission", this.ShowPermission);

    }
}

