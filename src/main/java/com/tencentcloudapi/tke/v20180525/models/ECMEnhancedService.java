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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ECMEnhancedService extends AbstractModel {

    /**
    * Whether Cloud Monitoring is enabled
    */
    @SerializedName("SecurityService")
    @Expose
    private ECMRunMonitorServiceEnabled SecurityService;

    /**
    * Whether Cloud Workload Protection is enabled
    */
    @SerializedName("MonitorService")
    @Expose
    private ECMRunSecurityServiceEnabled MonitorService;

    /**
     * Get Whether Cloud Monitoring is enabled 
     * @return SecurityService Whether Cloud Monitoring is enabled
     */
    public ECMRunMonitorServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set Whether Cloud Monitoring is enabled
     * @param SecurityService Whether Cloud Monitoring is enabled
     */
    public void setSecurityService(ECMRunMonitorServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get Whether Cloud Workload Protection is enabled 
     * @return MonitorService Whether Cloud Workload Protection is enabled
     */
    public ECMRunSecurityServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set Whether Cloud Workload Protection is enabled
     * @param MonitorService Whether Cloud Workload Protection is enabled
     */
    public void setMonitorService(ECMRunSecurityServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    public ECMEnhancedService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ECMEnhancedService(ECMEnhancedService source) {
        if (source.SecurityService != null) {
            this.SecurityService = new ECMRunMonitorServiceEnabled(source.SecurityService);
        }
        if (source.MonitorService != null) {
            this.MonitorService = new ECMRunSecurityServiceEnabled(source.MonitorService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);

    }
}

