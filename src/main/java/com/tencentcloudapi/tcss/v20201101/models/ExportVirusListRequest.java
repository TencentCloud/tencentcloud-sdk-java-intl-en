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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportVirusListRequest extends AbstractModel {

    /**
    * Filter
<li>FileName - String - Required: No - Filename</li>
<li>FilePath - String - Required: No - File path</li>
<li>VirusName - String - Required: No - Virus name</li>
<li>ContainerName- String - Required: Yes - Container name</li>
<li>ContainerId- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageId- string - Required: No - Image ID</li>
<li>IsRealTime- int - Required: No - Whether it is real-time monitoring data</li>
<li>TaskId- string - Required: No - Task ID</li>
<li>TimeRange - string - Required: No - Time range ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>ContainerNetStatus - String - Required: No - Container network status. Valid values: `NORMAL`, `ISOLATED`, `ISOLATING`, `RESTORING`, `RESTORE_FAILED`.</li>
<li>ContainerStatus - string - Required: No - Container status. Valid values: `RUNNING`, `PAUSED`, `STOPPED`, `CREATED`, `DESTROYED`, `RESTARTING`, `REMOVING`.</li>
<li>AutoIsolateMode - string - Required: No - Isolation method. Valid values: `MANUAL`, `AUTO`.</li>
<li>MD5 - string - Required: No - MD5</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Sorting order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get Filter
<li>FileName - String - Required: No - Filename</li>
<li>FilePath - String - Required: No - File path</li>
<li>VirusName - String - Required: No - Virus name</li>
<li>ContainerName- String - Required: Yes - Container name</li>
<li>ContainerId- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageId- string - Required: No - Image ID</li>
<li>IsRealTime- int - Required: No - Whether it is real-time monitoring data</li>
<li>TaskId- string - Required: No - Task ID</li>
<li>TimeRange - string - Required: No - Time range ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>ContainerNetStatus - String - Required: No - Container network status. Valid values: `NORMAL`, `ISOLATED`, `ISOLATING`, `RESTORING`, `RESTORE_FAILED`.</li>
<li>ContainerStatus - string - Required: No - Container status. Valid values: `RUNNING`, `PAUSED`, `STOPPED`, `CREATED`, `DESTROYED`, `RESTARTING`, `REMOVING`.</li>
<li>AutoIsolateMode - string - Required: No - Isolation method. Valid values: `MANUAL`, `AUTO`.</li>
<li>MD5 - string - Required: No - MD5</li> 
     * @return Filters Filter
<li>FileName - String - Required: No - Filename</li>
<li>FilePath - String - Required: No - File path</li>
<li>VirusName - String - Required: No - Virus name</li>
<li>ContainerName- String - Required: Yes - Container name</li>
<li>ContainerId- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageId- string - Required: No - Image ID</li>
<li>IsRealTime- int - Required: No - Whether it is real-time monitoring data</li>
<li>TaskId- string - Required: No - Task ID</li>
<li>TimeRange - string - Required: No - Time range ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>ContainerNetStatus - String - Required: No - Container network status. Valid values: `NORMAL`, `ISOLATED`, `ISOLATING`, `RESTORING`, `RESTORE_FAILED`.</li>
<li>ContainerStatus - string - Required: No - Container status. Valid values: `RUNNING`, `PAUSED`, `STOPPED`, `CREATED`, `DESTROYED`, `RESTARTING`, `REMOVING`.</li>
<li>AutoIsolateMode - string - Required: No - Isolation method. Valid values: `MANUAL`, `AUTO`.</li>
<li>MD5 - string - Required: No - MD5</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>FileName - String - Required: No - Filename</li>
<li>FilePath - String - Required: No - File path</li>
<li>VirusName - String - Required: No - Virus name</li>
<li>ContainerName- String - Required: Yes - Container name</li>
<li>ContainerId- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageId- string - Required: No - Image ID</li>
<li>IsRealTime- int - Required: No - Whether it is real-time monitoring data</li>
<li>TaskId- string - Required: No - Task ID</li>
<li>TimeRange - string - Required: No - Time range ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>ContainerNetStatus - String - Required: No - Container network status. Valid values: `NORMAL`, `ISOLATED`, `ISOLATING`, `RESTORING`, `RESTORE_FAILED`.</li>
<li>ContainerStatus - string - Required: No - Container status. Valid values: `RUNNING`, `PAUSED`, `STOPPED`, `CREATED`, `DESTROYED`, `RESTARTING`, `REMOVING`.</li>
<li>AutoIsolateMode - string - Required: No - Isolation method. Valid values: `MANUAL`, `AUTO`.</li>
<li>MD5 - string - Required: No - MD5</li>
     * @param Filters Filter
<li>FileName - String - Required: No - Filename</li>
<li>FilePath - String - Required: No - File path</li>
<li>VirusName - String - Required: No - Virus name</li>
<li>ContainerName- String - Required: Yes - Container name</li>
<li>ContainerId- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageId- string - Required: No - Image ID</li>
<li>IsRealTime- int - Required: No - Whether it is real-time monitoring data</li>
<li>TaskId- string - Required: No - Task ID</li>
<li>TimeRange - string - Required: No - Time range ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>ContainerNetStatus - String - Required: No - Container network status. Valid values: `NORMAL`, `ISOLATED`, `ISOLATING`, `RESTORING`, `RESTORE_FAILED`.</li>
<li>ContainerStatus - string - Required: No - Container status. Valid values: `RUNNING`, `PAUSED`, `STOPPED`, `CREATED`, `DESTROYED`, `RESTARTING`, `REMOVING`.</li>
<li>AutoIsolateMode - string - Required: No - Isolation method. Valid values: `MANUAL`, `AUTO`.</li>
<li>MD5 - string - Required: No - MD5</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting order 
     * @return Order Sorting order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order
     * @param Order Sorting order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Export field 
     * @return ExportField Export field
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set Export field
     * @param ExportField Export field
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public ExportVirusListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVirusListRequest(ExportVirusListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

