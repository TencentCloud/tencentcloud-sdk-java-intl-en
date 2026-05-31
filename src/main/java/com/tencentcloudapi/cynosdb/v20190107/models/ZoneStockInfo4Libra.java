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

public class ZoneStockInfo4Libra extends AbstractModel {

    /**
    * Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
     * Get Availability zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasStock whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasStock whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    public ZoneStockInfo4Libra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStockInfo4Libra(ZoneStockInfo4Libra source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);

    }
}

