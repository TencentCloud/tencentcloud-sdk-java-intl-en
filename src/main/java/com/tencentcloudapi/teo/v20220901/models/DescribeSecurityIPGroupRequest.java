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

public class DescribeSecurityIPGroupRequest extends AbstractModel {

    /**
    * Site ID, used to specify the scope of the queried site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Specifies the security ip group id. <li>when this parameter is provided, only the configuration of the specified security ip group id is queried;</li> <li>when this parameter is not provided, information of all security ip groups under the site is returned.</li>.
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
     * Get Site ID, used to specify the scope of the queried site. 
     * @return ZoneId Site ID, used to specify the scope of the queried site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID, used to specify the scope of the queried site.
     * @param ZoneId Site ID, used to specify the scope of the queried site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Specifies the security ip group id. <li>when this parameter is provided, only the configuration of the specified security ip group id is queried;</li> <li>when this parameter is not provided, information of all security ip groups under the site is returned.</li>. 
     * @return GroupIds Specifies the security ip group id. <li>when this parameter is provided, only the configuration of the specified security ip group id is queried;</li> <li>when this parameter is not provided, information of all security ip groups under the site is returned.</li>.
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set Specifies the security ip group id. <li>when this parameter is provided, only the configuration of the specified security ip group id is queried;</li> <li>when this parameter is not provided, information of all security ip groups under the site is returned.</li>.
     * @param GroupIds Specifies the security ip group id. <li>when this parameter is provided, only the configuration of the specified security ip group id is queried;</li> <li>when this parameter is not provided, information of all security ip groups under the site is returned.</li>.
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public DescribeSecurityIPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityIPGroupRequest(DescribeSecurityIPGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

