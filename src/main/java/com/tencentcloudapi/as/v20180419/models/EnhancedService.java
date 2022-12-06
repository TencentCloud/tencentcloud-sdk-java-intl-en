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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnhancedService extends AbstractModel{

    /**
    * Enables the Cloud Security service. If this parameter is not specified, the Cloud Security service will be enabled by default.
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;

    /**
    * Enables the Cloud Monitor service. If this parameter is not specified, the Cloud Monitor service will be enabled by default.
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;

    /**
    * Deprecated parameter.
    */
    @SerializedName("AutomationService")
    @Expose
    private RunAutomationServiceEnabled [] AutomationService;

    /**
    * 
    */
    @SerializedName("AutomationToolsService")
    @Expose
    private RunAutomationServiceEnabled AutomationToolsService;

    /**
     * Get Enables the Cloud Security service. If this parameter is not specified, the Cloud Security service will be enabled by default. 
     * @return SecurityService Enables the Cloud Security service. If this parameter is not specified, the Cloud Security service will be enabled by default.
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set Enables the Cloud Security service. If this parameter is not specified, the Cloud Security service will be enabled by default.
     * @param SecurityService Enables the Cloud Security service. If this parameter is not specified, the Cloud Security service will be enabled by default.
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get Enables the Cloud Monitor service. If this parameter is not specified, the Cloud Monitor service will be enabled by default. 
     * @return MonitorService Enables the Cloud Monitor service. If this parameter is not specified, the Cloud Monitor service will be enabled by default.
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set Enables the Cloud Monitor service. If this parameter is not specified, the Cloud Monitor service will be enabled by default.
     * @param MonitorService Enables the Cloud Monitor service. If this parameter is not specified, the Cloud Monitor service will be enabled by default.
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * Get Deprecated parameter. 
     * @return AutomationService Deprecated parameter.
     */
    public RunAutomationServiceEnabled [] getAutomationService() {
        return this.AutomationService;
    }

    /**
     * Set Deprecated parameter.
     * @param AutomationService Deprecated parameter.
     */
    public void setAutomationService(RunAutomationServiceEnabled [] AutomationService) {
        this.AutomationService = AutomationService;
    }

    /**
     * Get  
     * @return AutomationToolsService 
     */
    public RunAutomationServiceEnabled getAutomationToolsService() {
        return this.AutomationToolsService;
    }

    /**
     * Set 
     * @param AutomationToolsService 
     */
    public void setAutomationToolsService(RunAutomationServiceEnabled AutomationToolsService) {
        this.AutomationToolsService = AutomationToolsService;
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
            this.AutomationService = new RunAutomationServiceEnabled[source.AutomationService.length];
            for (int i = 0; i < source.AutomationService.length; i++) {
                this.AutomationService[i] = new RunAutomationServiceEnabled(source.AutomationService[i]);
            }
        }
        if (source.AutomationToolsService != null) {
            this.AutomationToolsService = new RunAutomationServiceEnabled(source.AutomationToolsService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamArrayObj(map, prefix + "AutomationService.", this.AutomationService);
        this.setParamObj(map, prefix + "AutomationToolsService.", this.AutomationToolsService);

    }
}

