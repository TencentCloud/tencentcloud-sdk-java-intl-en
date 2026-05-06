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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TSEGatewaySelector extends AbstractModel {

    /**
    * Gateway engine instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway service
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
     * Get Gateway engine instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GatewayId Gateway engine instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway engine instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GatewayId Gateway engine instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway service
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Services Gateway service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * Set Gateway service
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Services Gateway service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    public TSEGatewaySelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TSEGatewaySelector(TSEGatewaySelector source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Services != null) {
            this.Services = new String[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new String(source.Services[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);

    }
}

