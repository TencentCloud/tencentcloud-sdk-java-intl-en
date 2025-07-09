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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenCoolDownPolicyRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * DB name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Operation type
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Separate with commas. The DB name is required, for example, db1.tb1,db1.tb2,db2.tb1.
    */
    @SerializedName("BatchOpenCoolDownTables")
    @Expose
    private String BatchOpenCoolDownTables;

    /**
    * Policy name required for binding
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Separate with commas, for example, p1,p2,p3.
    */
    @SerializedName("BatchOpenCoolDownPartitions")
    @Expose
    private String BatchOpenCoolDownPartitions;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get DB name 
     * @return DatabaseName DB name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set DB name
     * @param DatabaseName DB name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Operation type 
     * @return OperationType Operation type
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type
     * @param OperationType Operation type
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Separate with commas. The DB name is required, for example, db1.tb1,db1.tb2,db2.tb1. 
     * @return BatchOpenCoolDownTables Separate with commas. The DB name is required, for example, db1.tb1,db1.tb2,db2.tb1.
     */
    public String getBatchOpenCoolDownTables() {
        return this.BatchOpenCoolDownTables;
    }

    /**
     * Set Separate with commas. The DB name is required, for example, db1.tb1,db1.tb2,db2.tb1.
     * @param BatchOpenCoolDownTables Separate with commas. The DB name is required, for example, db1.tb1,db1.tb2,db2.tb1.
     */
    public void setBatchOpenCoolDownTables(String BatchOpenCoolDownTables) {
        this.BatchOpenCoolDownTables = BatchOpenCoolDownTables;
    }

    /**
     * Get Policy name required for binding 
     * @return PolicyName Policy name required for binding
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name required for binding
     * @param PolicyName Policy name required for binding
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Separate with commas, for example, p1,p2,p3. 
     * @return BatchOpenCoolDownPartitions Separate with commas, for example, p1,p2,p3.
     */
    public String getBatchOpenCoolDownPartitions() {
        return this.BatchOpenCoolDownPartitions;
    }

    /**
     * Set Separate with commas, for example, p1,p2,p3.
     * @param BatchOpenCoolDownPartitions Separate with commas, for example, p1,p2,p3.
     */
    public void setBatchOpenCoolDownPartitions(String BatchOpenCoolDownPartitions) {
        this.BatchOpenCoolDownPartitions = BatchOpenCoolDownPartitions;
    }

    public OpenCoolDownPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenCoolDownPolicyRequest(OpenCoolDownPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.BatchOpenCoolDownTables != null) {
            this.BatchOpenCoolDownTables = new String(source.BatchOpenCoolDownTables);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.BatchOpenCoolDownPartitions != null) {
            this.BatchOpenCoolDownPartitions = new String(source.BatchOpenCoolDownPartitions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "BatchOpenCoolDownTables", this.BatchOpenCoolDownTables);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "BatchOpenCoolDownPartitions", this.BatchOpenCoolDownPartitions);

    }
}

