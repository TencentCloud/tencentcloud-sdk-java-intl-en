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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogDownloadTaskRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Node name.
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * Log category.
    */
    @SerializedName("LogComponents")
    @Expose
    private String [] LogComponents;

    /**
    * Log level.
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * Log ID.
    */
    @SerializedName("LogIds")
    @Expose
    private String [] LogIds;

    /**
    * Log connection information.
    */
    @SerializedName("LogConnections")
    @Expose
    private String [] LogConnections;

    /**
    * Filtering fields for log details.
    */
    @SerializedName("LogDetailParams")
    @Expose
    private String [] LogDetailParams;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Node name. 
     * @return NodeNames Node name.
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set Node name.
     * @param NodeNames Node name.
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get Log category. 
     * @return LogComponents Log category.
     */
    public String [] getLogComponents() {
        return this.LogComponents;
    }

    /**
     * Set Log category.
     * @param LogComponents Log category.
     */
    public void setLogComponents(String [] LogComponents) {
        this.LogComponents = LogComponents;
    }

    /**
     * Get Log level. 
     * @return LogLevels Log level.
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set Log level.
     * @param LogLevels Log level.
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get Log ID. 
     * @return LogIds Log ID.
     */
    public String [] getLogIds() {
        return this.LogIds;
    }

    /**
     * Set Log ID.
     * @param LogIds Log ID.
     */
    public void setLogIds(String [] LogIds) {
        this.LogIds = LogIds;
    }

    /**
     * Get Log connection information. 
     * @return LogConnections Log connection information.
     */
    public String [] getLogConnections() {
        return this.LogConnections;
    }

    /**
     * Set Log connection information.
     * @param LogConnections Log connection information.
     */
    public void setLogConnections(String [] LogConnections) {
        this.LogConnections = LogConnections;
    }

    /**
     * Get Filtering fields for log details. 
     * @return LogDetailParams Filtering fields for log details.
     */
    public String [] getLogDetailParams() {
        return this.LogDetailParams;
    }

    /**
     * Set Filtering fields for log details.
     * @param LogDetailParams Filtering fields for log details.
     */
    public void setLogDetailParams(String [] LogDetailParams) {
        this.LogDetailParams = LogDetailParams;
    }

    public CreateLogDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogDownloadTaskRequest(CreateLogDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.LogComponents != null) {
            this.LogComponents = new String[source.LogComponents.length];
            for (int i = 0; i < source.LogComponents.length; i++) {
                this.LogComponents[i] = new String(source.LogComponents[i]);
            }
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.LogIds != null) {
            this.LogIds = new String[source.LogIds.length];
            for (int i = 0; i < source.LogIds.length; i++) {
                this.LogIds[i] = new String(source.LogIds[i]);
            }
        }
        if (source.LogConnections != null) {
            this.LogConnections = new String[source.LogConnections.length];
            for (int i = 0; i < source.LogConnections.length; i++) {
                this.LogConnections[i] = new String(source.LogConnections[i]);
            }
        }
        if (source.LogDetailParams != null) {
            this.LogDetailParams = new String[source.LogDetailParams.length];
            for (int i = 0; i < source.LogDetailParams.length; i++) {
                this.LogDetailParams[i] = new String(source.LogDetailParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamArraySimple(map, prefix + "LogComponents.", this.LogComponents);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "LogIds.", this.LogIds);
        this.setParamArraySimple(map, prefix + "LogConnections.", this.LogConnections);
        this.setParamArraySimple(map, prefix + "LogDetailParams.", this.LogDetailParams);

    }
}

