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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageProcess extends AbstractModel {

    /**
    * Original unique ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * Task type
Schedule task execution.
    SCHEDULE_TASK,
Integration task.
    INTEGRATION_TASK,
Third-Party reporting.
    THIRD_REPORT,
Data modeling.
    TABLE_MODEL,
Create metrics for the model.
    MODEL_METRIC,
Create a derived metric from atomic metrics.
    METRIC_METRIC,
Data service.
    DATA_SERVICE
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * WEDATA, THIRD;
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Task Subtype
 SQL_TASK,
Integrate real-time tasks lineage.
    INTEGRATED_STREAM,
Integration of offline tasks lineage.
    INTEGRATED_OFFLINE;
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessSubType")
    @Expose
    private String ProcessSubType;

    /**
    * Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessProperties")
    @Expose
    private LineageProperty [] ProcessProperties;

    /**
    * Unique node ID of the lineage task.
    */
    @SerializedName("LineageNodeId")
    @Expose
    private String LineageNodeId;

    /**
     * Get Original unique ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessId Original unique ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set Original unique ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessId Original unique ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get Task type
Schedule task execution.
    SCHEDULE_TASK,
Integration task.
    INTEGRATION_TASK,
Third-Party reporting.
    THIRD_REPORT,
Data modeling.
    TABLE_MODEL,
Create metrics for the model.
    MODEL_METRIC,
Create a derived metric from atomic metrics.
    METRIC_METRIC,
Data service.
    DATA_SERVICE
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessType Task type
Schedule task execution.
    SCHEDULE_TASK,
Integration task.
    INTEGRATION_TASK,
Third-Party reporting.
    THIRD_REPORT,
Data modeling.
    TABLE_MODEL,
Create metrics for the model.
    MODEL_METRIC,
Create a derived metric from atomic metrics.
    METRIC_METRIC,
Data service.
    DATA_SERVICE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set Task type
Schedule task execution.
    SCHEDULE_TASK,
Integration task.
    INTEGRATION_TASK,
Third-Party reporting.
    THIRD_REPORT,
Data modeling.
    TABLE_MODEL,
Create metrics for the model.
    MODEL_METRIC,
Create a derived metric from atomic metrics.
    METRIC_METRIC,
Data service.
    DATA_SERVICE
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessType Task type
Schedule task execution.
    SCHEDULE_TASK,
Integration task.
    INTEGRATION_TASK,
Third-Party reporting.
    THIRD_REPORT,
Data modeling.
    TABLE_MODEL,
Create metrics for the model.
    MODEL_METRIC,
Create a derived metric from atomic metrics.
    METRIC_METRIC,
Data service.
    DATA_SERVICE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get WEDATA, THIRD;
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Platform WEDATA, THIRD;
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set WEDATA, THIRD;
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Platform WEDATA, THIRD;
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Task Subtype
 SQL_TASK,
Integrate real-time tasks lineage.
    INTEGRATED_STREAM,
Integration of offline tasks lineage.
    INTEGRATED_OFFLINE;
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessSubType Task Subtype
 SQL_TASK,
Integrate real-time tasks lineage.
    INTEGRATED_STREAM,
Integration of offline tasks lineage.
    INTEGRATED_OFFLINE;
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessSubType() {
        return this.ProcessSubType;
    }

    /**
     * Set Task Subtype
 SQL_TASK,
Integrate real-time tasks lineage.
    INTEGRATED_STREAM,
Integration of offline tasks lineage.
    INTEGRATED_OFFLINE;
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessSubType Task Subtype
 SQL_TASK,
Integrate real-time tasks lineage.
    INTEGRATED_STREAM,
Integration of offline tasks lineage.
    INTEGRATED_OFFLINE;
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessSubType(String ProcessSubType) {
        this.ProcessSubType = ProcessSubType;
    }

    /**
     * Get Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessProperties Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LineageProperty [] getProcessProperties() {
        return this.ProcessProperties;
    }

    /**
     * Set Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessProperties Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessProperties(LineageProperty [] ProcessProperties) {
        this.ProcessProperties = ProcessProperties;
    }

    /**
     * Get Unique node ID of the lineage task. 
     * @return LineageNodeId Unique node ID of the lineage task.
     */
    public String getLineageNodeId() {
        return this.LineageNodeId;
    }

    /**
     * Set Unique node ID of the lineage task.
     * @param LineageNodeId Unique node ID of the lineage task.
     */
    public void setLineageNodeId(String LineageNodeId) {
        this.LineageNodeId = LineageNodeId;
    }

    public LineageProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageProcess(LineageProcess source) {
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProcessSubType != null) {
            this.ProcessSubType = new String(source.ProcessSubType);
        }
        if (source.ProcessProperties != null) {
            this.ProcessProperties = new LineageProperty[source.ProcessProperties.length];
            for (int i = 0; i < source.ProcessProperties.length; i++) {
                this.ProcessProperties[i] = new LineageProperty(source.ProcessProperties[i]);
            }
        }
        if (source.LineageNodeId != null) {
            this.LineageNodeId = new String(source.LineageNodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProcessSubType", this.ProcessSubType);
        this.setParamArrayObj(map, prefix + "ProcessProperties.", this.ProcessProperties);
        this.setParamSimple(map, prefix + "LineageNodeId", this.LineageNodeId);

    }
}

