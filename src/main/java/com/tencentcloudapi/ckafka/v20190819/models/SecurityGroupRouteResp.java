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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupRouteResp extends AbstractModel {

    /**
    * Total number of eligible security group routes.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Eligible security group route information list.
    */
    @SerializedName("SecurityGroupRoutes")
    @Expose
    private SecurityGroupRoute [] SecurityGroupRoutes;

    /**
     * Get Total number of eligible security group routes. 
     * @return TotalCount Total number of eligible security group routes.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of eligible security group routes.
     * @param TotalCount Total number of eligible security group routes.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Eligible security group route information list. 
     * @return SecurityGroupRoutes Eligible security group route information list.
     */
    public SecurityGroupRoute [] getSecurityGroupRoutes() {
        return this.SecurityGroupRoutes;
    }

    /**
     * Set Eligible security group route information list.
     * @param SecurityGroupRoutes Eligible security group route information list.
     */
    public void setSecurityGroupRoutes(SecurityGroupRoute [] SecurityGroupRoutes) {
        this.SecurityGroupRoutes = SecurityGroupRoutes;
    }

    public SecurityGroupRouteResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRouteResp(SecurityGroupRouteResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SecurityGroupRoutes != null) {
            this.SecurityGroupRoutes = new SecurityGroupRoute[source.SecurityGroupRoutes.length];
            for (int i = 0; i < source.SecurityGroupRoutes.length; i++) {
                this.SecurityGroupRoutes[i] = new SecurityGroupRoute(source.SecurityGroupRoutes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SecurityGroupRoutes.", this.SecurityGroupRoutes);

    }
}

