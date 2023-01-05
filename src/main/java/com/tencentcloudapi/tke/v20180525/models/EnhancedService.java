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

public class EnhancedService extends AbstractModel{

    /**
    * Enables cloud security service. If this parameter is not specified, the cloud security service will be enabled by default.
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;

    /**
    * Enables cloud monitor service. If this parameter is not specified, the cloud monitor service will be enabled by default.
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;

    /**
    * Whether to enable the TAT service. If this parameter is not specified, the TAT service is enabled for public images and disabled for other images by default.
    */
    @SerializedName("AutomationService")
    @Expose
    private RunAutomationServiceEnabled AutomationService;

    /**
     * Get Enables cloud security service. If this parameter is not specified, the cloud security service will be enabled by default. 
     * @return SecurityService Enables cloud security service. If this parameter is not specified, the cloud security service will be enabled by default.
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set Enables cloud security service. If this parameter is not specified, the cloud security service will be enabled by default.
     * @param SecurityService Enables cloud security service. If this parameter is not specified, the cloud security service will be enabled by default.
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get Enables cloud monitor service. If this parameter is not specified, the cloud monitor service will be enabled by default. 
     * @return MonitorService Enables cloud monitor service. If this parameter is not specified, the cloud monitor service will be enabled by default.
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set Enables cloud monitor service. If this parameter is not specified, the cloud monitor service will be enabled by default.
     * @param MonitorService Enables cloud monitor service. If this parameter is not specified, the cloud monitor service will be enabled by default.
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * Get Whether to enable the TAT service. If this parameter is not specified, the TAT service is enabled for public images and disabled for other images by default. 
     * @return AutomationService Whether to enable the TAT service. If this parameter is not specified, the TAT service is enabled for public images and disabled for other images by default.
     */
    public RunAutomationServiceEnabled getAutomationService() {
        return this.AutomationService;
    }

    /**
     * Set Whether to enable the TAT service. If this parameter is not specified, the TAT service is enabled for public images and disabled for other images by default.
     * @param AutomationService Whether to enable the TAT service. If this parameter is not specified, the TAT service is enabled for public images and disabled for other images by default.
     */
    public void setAutomationService(RunAutomationServiceEnabled AutomationService) {
        this.AutomationService = AutomationService;
    }

    public EnhancedService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhancedService(EnhancedService source) {
        if (source.SecurityService != null) {
            this.SecurityService = new RunSecurityServiceEnabled(source.SecurityService);
        }
        if (source.MonitorService != null) {
            this.MonitorService = new RunMonitorServiceEnabled(source.MonitorService);
        }
        if (source.AutomationService != null) {
            this.AutomationService = new RunAutomationServiceEnabled(source.AutomationService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamObj(map, prefix + "AutomationService.", this.AutomationService);

    }
}

