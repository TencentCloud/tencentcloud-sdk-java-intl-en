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
    * It indicates exporting the type list of configuration . If it is left blank, all types of configurations will be exported. Currently supported valid values:<li>L7AccelerationConfig: It indicates exporting the Layer-7 acceleration configuration, corresponding to the console's "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li>
Note: The types that will be supported for export in the future will increase with iterations. When exporting all types, pay attention to the export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
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
     * Get It indicates exporting the type list of configuration . If it is left blank, all types of configurations will be exported. Currently supported valid values:<li>L7AccelerationConfig: It indicates exporting the Layer-7 acceleration configuration, corresponding to the console's "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li>
Note: The types that will be supported for export in the future will increase with iterations. When exporting all types, pay attention to the export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size. 
     * @return Types It indicates exporting the type list of configuration . If it is left blank, all types of configurations will be exported. Currently supported valid values:<li>L7AccelerationConfig: It indicates exporting the Layer-7 acceleration configuration, corresponding to the console's "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li>
Note: The types that will be supported for export in the future will increase with iterations. When exporting all types, pay attention to the export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set It indicates exporting the type list of configuration . If it is left blank, all types of configurations will be exported. Currently supported valid values:<li>L7AccelerationConfig: It indicates exporting the Layer-7 acceleration configuration, corresponding to the console's "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li>
Note: The types that will be supported for export in the future will increase with iterations. When exporting all types, pay attention to the export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
     * @param Types It indicates exporting the type list of configuration . If it is left blank, all types of configurations will be exported. Currently supported valid values:<li>L7AccelerationConfig: It indicates exporting the Layer-7 acceleration configuration, corresponding to the console's "Site Acceleration - Global Acceleration Configuration" and "Site Acceleration - Rule Engine".</li>
Note: The types that will be supported for export in the future will increase with iterations. When exporting all types, pay attention to the export file size. It is recommended to specify the configuration types to be exported to control the request and response packet payload size.
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

