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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomFunctionRequest extends AbstractModel {

    /**
    * Enumerated values: HIVE, SPARK, DLC
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Enumerated values: ANALYSIS (function), ENCRYPTION (encryption function), AGGREGATE (aggregate function), LOGIC (logic function), DATE_AND_TIME (date and time function), MATH (math function), CONVERSION (conversion function), STRING (string function), IP_AND_DOMAIN (IP and domain function), WINDOW (window function), OTHER (other function)
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Function Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cluster Instance Engine ID
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Enumerated values: HIVE, SPARK, DLC 
     * @return Type Enumerated values: HIVE, SPARK, DLC
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Enumerated values: HIVE, SPARK, DLC
     * @param Type Enumerated values: HIVE, SPARK, DLC
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Enumerated values: ANALYSIS (function), ENCRYPTION (encryption function), AGGREGATE (aggregate function), LOGIC (logic function), DATE_AND_TIME (date and time function), MATH (math function), CONVERSION (conversion function), STRING (string function), IP_AND_DOMAIN (IP and domain function), WINDOW (window function), OTHER (other function) 
     * @return Kind Enumerated values: ANALYSIS (function), ENCRYPTION (encryption function), AGGREGATE (aggregate function), LOGIC (logic function), DATE_AND_TIME (date and time function), MATH (math function), CONVERSION (conversion function), STRING (string function), IP_AND_DOMAIN (IP and domain function), WINDOW (window function), OTHER (other function)
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Enumerated values: ANALYSIS (function), ENCRYPTION (encryption function), AGGREGATE (aggregate function), LOGIC (logic function), DATE_AND_TIME (date and time function), MATH (math function), CONVERSION (conversion function), STRING (string function), IP_AND_DOMAIN (IP and domain function), WINDOW (window function), OTHER (other function)
     * @param Kind Enumerated values: ANALYSIS (function), ENCRYPTION (encryption function), AGGREGATE (aggregate function), LOGIC (logic function), DATE_AND_TIME (date and time function), MATH (math function), CONVERSION (conversion function), STRING (string function), IP_AND_DOMAIN (IP and domain function), WINDOW (window function), OTHER (other function)
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Function Name 
     * @return Name Function Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Function Name
     * @param Name Function Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cluster Instance Engine ID 
     * @return ClusterIdentifier Cluster Instance Engine ID
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set Cluster Instance Engine ID
     * @param ClusterIdentifier Cluster Instance Engine ID
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public CreateCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomFunctionRequest(CreateCustomFunctionRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

