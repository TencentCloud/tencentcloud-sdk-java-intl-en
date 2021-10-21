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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterAuthenticationOptionsRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ServiceAccount authentication configuration
    */
    @SerializedName("ServiceAccounts")
    @Expose
    private ServiceAccountAuthenticationOptions ServiceAccounts;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ServiceAccount authentication configuration 
     * @return ServiceAccounts ServiceAccount authentication configuration
     */
    public ServiceAccountAuthenticationOptions getServiceAccounts() {
        return this.ServiceAccounts;
    }

    /**
     * Set ServiceAccount authentication configuration
     * @param ServiceAccounts ServiceAccount authentication configuration
     */
    public void setServiceAccounts(ServiceAccountAuthenticationOptions ServiceAccounts) {
        this.ServiceAccounts = ServiceAccounts;
    }

    public ModifyClusterAuthenticationOptionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAuthenticationOptionsRequest(ModifyClusterAuthenticationOptionsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ServiceAccounts != null) {
            this.ServiceAccounts = new ServiceAccountAuthenticationOptions(source.ServiceAccounts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "ServiceAccounts.", this.ServiceAccounts);

    }
}

