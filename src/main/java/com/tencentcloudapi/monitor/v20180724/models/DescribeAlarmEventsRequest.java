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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmEventsRequest extends AbstractModel {

    /**
    * Module name, which is fixed at "monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Alarm policy type such as cvm_device, which is obtained through the `DescribeAllNamespaces` API
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Monitoring type, such as `MT_QCE`, which is set to default.
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
     * Get Module name, which is fixed at "monitor" 
     * @return Module Module name, which is fixed at "monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name, which is fixed at "monitor"
     * @param Module Module name, which is fixed at "monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
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
     * Get Monitoring type, such as `MT_QCE`, which is set to default. 
     * @return MonitorType Monitoring type, such as `MT_QCE`, which is set to default.
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitoring type, such as `MT_QCE`, which is set to default.
     * @param MonitorType Monitoring type, such as `MT_QCE`, which is set to default.
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    public DescribeAlarmEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmEventsRequest(DescribeAlarmEventsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);

    }
}

