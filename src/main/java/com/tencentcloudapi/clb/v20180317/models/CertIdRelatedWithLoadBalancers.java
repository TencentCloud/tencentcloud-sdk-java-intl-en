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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertIdRelatedWithLoadBalancers extends AbstractModel{

    /**
    * Certificate ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * List of CLB instances associated with certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancers")
    @Expose
    private LoadBalancer [] LoadBalancers;

    /**
     * Get Certificate ID 
     * @return CertId Certificate ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID
     * @param CertId Certificate ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get List of CLB instances associated with certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancers List of CLB instances associated with certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LoadBalancer [] getLoadBalancers() {
        return this.LoadBalancers;
    }

    /**
     * Set List of CLB instances associated with certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancers List of CLB instances associated with certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancers(LoadBalancer [] LoadBalancers) {
        this.LoadBalancers = LoadBalancers;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArrayObj(map, prefix + "LoadBalancers.", this.LoadBalancers);

    }
}

