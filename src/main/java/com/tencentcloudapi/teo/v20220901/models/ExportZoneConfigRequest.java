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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportZoneConfigRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Export the type list of configuration items. Leave it blank to export all types of configurations. Currently supported values include: <li>L7AccelerationConfig: means exporting the Layer-7 acceleration configuration, corresponding to the console "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li><li>WebSecurity: refers to exporting the Web protection configuration.</li> Note: Types supported for future export will increase with iterations. When exporting all types, pay attention to export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Export the type list of configuration items. Leave it blank to export all types of configurations. Currently supported values include: <li>L7AccelerationConfig: means exporting the Layer-7 acceleration configuration, corresponding to the console "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li><li>WebSecurity: refers to exporting the Web protection configuration.</li> Note: Types supported for future export will increase with iterations. When exporting all types, pay attention to export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size. 
     * @return Types Export the type list of configuration items. Leave it blank to export all types of configurations. Currently supported values include: <li>L7AccelerationConfig: means exporting the Layer-7 acceleration configuration, corresponding to the console "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li><li>WebSecurity: refers to exporting the Web protection configuration.</li> Note: Types supported for future export will increase with iterations. When exporting all types, pay attention to export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set Export the type list of configuration items. Leave it blank to export all types of configurations. Currently supported values include: <li>L7AccelerationConfig: means exporting the Layer-7 acceleration configuration, corresponding to the console "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li><li>WebSecurity: refers to exporting the Web protection configuration.</li> Note: Types supported for future export will increase with iterations. When exporting all types, pay attention to export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
     * @param Types Export the type list of configuration items. Leave it blank to export all types of configurations. Currently supported values include: <li>L7AccelerationConfig: means exporting the Layer-7 acceleration configuration, corresponding to the console "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li><li>WebSecurity: refers to exporting the Web protection configuration.</li> Note: Types supported for future export will increase with iterations. When exporting all types, pay attention to export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    public ExportZoneConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportZoneConfigRequest(ExportZoneConfigRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

