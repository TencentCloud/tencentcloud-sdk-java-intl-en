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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCustomFunctionRequest extends AbstractModel {

    /**
    * Cluster Instance ID
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * Function ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Project ID, required
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Function Name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function Type, HIVE, SPARK, DLC, CDW_POSTGRESQL
    */
    @SerializedName("FunctionType")
    @Expose
    private String FunctionType;

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Pattern name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Function Command Format
    */
    @SerializedName("CommandFormat")
    @Expose
    private String CommandFormat;

    /**
     * Get Cluster Instance ID 
     * @return ClusterIdentifier Cluster Instance ID
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set Cluster Instance ID
     * @param ClusterIdentifier Cluster Instance ID
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get Function ID 
     * @return FunctionId Function ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID
     * @param FunctionId Function ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Project ID, required 
     * @return ProjectId Project ID, required
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, required
     * @param ProjectId Project ID, required
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Function Name 
     * @return FunctionName Function Name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function Name
     * @param FunctionName Function Name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function Type, HIVE, SPARK, DLC, CDW_POSTGRESQL 
     * @return FunctionType Function Type, HIVE, SPARK, DLC, CDW_POSTGRESQL
     */
    public String getFunctionType() {
        return this.FunctionType;
    }

    /**
     * Set Function Type, HIVE, SPARK, DLC, CDW_POSTGRESQL
     * @param FunctionType Function Type, HIVE, SPARK, DLC, CDW_POSTGRESQL
     */
    public void setFunctionType(String FunctionType) {
        this.FunctionType = FunctionType;
    }

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Pattern name 
     * @return SchemaName Pattern name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Pattern name
     * @param SchemaName Pattern name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Function Command Format 
     * @return CommandFormat Function Command Format
     */
    public String getCommandFormat() {
        return this.CommandFormat;
    }

    /**
     * Set Function Command Format
     * @param CommandFormat Function Command Format
     */
    public void setCommandFormat(String CommandFormat) {
        this.CommandFormat = CommandFormat;
    }

    public DeleteCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomFunctionRequest(DeleteCustomFunctionRequest source) {
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionType != null) {
            this.FunctionType = new String(source.FunctionType);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.CommandFormat != null) {
            this.CommandFormat = new String(source.CommandFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionType", this.FunctionType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "CommandFormat", this.CommandFormat);

    }
}

