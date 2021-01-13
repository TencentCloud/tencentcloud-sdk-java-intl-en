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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmMetricsRequest extends AbstractModel{

    /**
    * Value fixed at "monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Monitor type filter. Valid values: MT_QCE (Tencent Cloud service monitoring)
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Alarm policy type such as cvm_device, which is obtained through the `DescribeAllNamespaces` API
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get Value fixed at "monitor" 
     * @return Module Value fixed at "monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Value fixed at "monitor"
     * @param Module Value fixed at "monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Monitor type filter. Valid values: MT_QCE (Tencent Cloud service monitoring) 
     * @return MonitorType Monitor type filter. Valid values: MT_QCE (Tencent Cloud service monitoring)
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitor type filter. Valid values: MT_QCE (Tencent Cloud service monitoring)
     * @param MonitorType Monitor type filter. Valid values: MT_QCE (Tencent Cloud service monitoring)
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Alarm policy type such as cvm_device, which is obtained through the `DescribeAllNamespaces` API 
     * @return Namespace Alarm policy type such as cvm_device, which is obtained through the `DescribeAllNamespaces` API
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Alarm policy type such as cvm_device, which is obtained through the `DescribeAllNamespaces` API
     * @param Namespace Alarm policy type such as cvm_device, which is obtained through the `DescribeAllNamespaces` API
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

