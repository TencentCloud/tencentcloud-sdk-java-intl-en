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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebSecurityTemplatesRequest extends AbstractModel {

    /**
    * List of zone IDs. A maximum of 100 zones can be queried in a single request.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
     * Get List of zone IDs. A maximum of 100 zones can be queried in a single request. 
     * @return ZoneIds List of zone IDs. A maximum of 100 zones can be queried in a single request.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of zone IDs. A maximum of 100 zones can be queried in a single request.
     * @param ZoneIds List of zone IDs. A maximum of 100 zones can be queried in a single request.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public DescribeWebSecurityTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebSecurityTemplatesRequest(DescribeWebSecurityTemplatesRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

