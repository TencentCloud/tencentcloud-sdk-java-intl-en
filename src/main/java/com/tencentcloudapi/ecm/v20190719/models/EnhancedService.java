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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnhancedService extends AbstractModel {

    /**
    * Whether to enable CWP.
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;

    /**
    * Whether to enable CM.
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;

    /**
    * Whether to enable IP direct access. If this parameter is not specified, IP direct access will be enabled by default for Linux images and is currently not supported for Windows images.
    */
    @SerializedName("EIPDirectService")
    @Expose
    private RunEIPDirectServiceEnabled EIPDirectService;

    /**
     * Get Whether to enable CWP. 
     * @return SecurityService Whether to enable CWP.
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set Whether to enable CWP.
     * @param SecurityService Whether to enable CWP.
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get Whether to enable CM. 
     * @return MonitorService Whether to enable CM.
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set Whether to enable CM.
     * @param MonitorService Whether to enable CM.
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * Get Whether to enable IP direct access. If this parameter is not specified, IP direct access will be enabled by default for Linux images and is currently not supported for Windows images. 
     * @return EIPDirectService Whether to enable IP direct access. If this parameter is not specified, IP direct access will be enabled by default for Linux images and is currently not supported for Windows images.
     */
    public RunEIPDirectServiceEnabled getEIPDirectService() {
        return this.EIPDirectService;
    }

    /**
     * Set Whether to enable IP direct access. If this parameter is not specified, IP direct access will be enabled by default for Linux images and is currently not supported for Windows images.
     * @param EIPDirectService Whether to enable IP direct access. If this parameter is not specified, IP direct access will be enabled by default for Linux images and is currently not supported for Windows images.
     */
    public void setEIPDirectService(RunEIPDirectServiceEnabled EIPDirectService) {
        this.EIPDirectService = EIPDirectService;
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
        if (source.EIPDirectService != null) {
            this.EIPDirectService = new RunEIPDirectServiceEnabled(source.EIPDirectService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamObj(map, prefix + "EIPDirectService.", this.EIPDirectService);

    }
}

