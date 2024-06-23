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

public class RuleExecResultDetail extends AbstractModel {

    /**
    * Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Database GUID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Instance IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * table guid
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * rule execution record
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleExecResult")
    @Expose
    private RuleExecResult RuleExecResult;

    /**
    * table owner userId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerUserId")
    @Expose
    private Long TableOwnerUserId;

    /**
    * 2.HIVE 3.DLC
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
     * Get Data source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Data Source Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceName Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceName Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get Database GUID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database GUID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database GUID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database GUID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Instance IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get table guid
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId table guid
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set table guid
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId table guid
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Table nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get rule execution record
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleExecResult rule execution record
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleExecResult getRuleExecResult() {
        return this.RuleExecResult;
    }

    /**
     * Set rule execution record
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleExecResult rule execution record
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleExecResult(RuleExecResult RuleExecResult) {
        this.RuleExecResult = RuleExecResult;
    }

    /**
     * Get table owner userId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerUserId table owner userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTableOwnerUserId() {
        return this.TableOwnerUserId;
    }

    /**
     * Set table owner userId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerUserId table owner userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerUserId(Long TableOwnerUserId) {
        this.TableOwnerUserId = TableOwnerUserId;
    }

    /**
     * Get 2.HIVE 3.DLC
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceType 2.HIVE 3.DLC
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 2.HIVE 3.DLC
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceType 2.HIVE 3.DLC
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public RuleExecResultDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecResultDetail(RuleExecResultDetail source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.RuleExecResult != null) {
            this.RuleExecResult = new RuleExecResult(source.RuleExecResult);
        }
        if (source.TableOwnerUserId != null) {
            this.TableOwnerUserId = new Long(source.TableOwnerUserId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamObj(map, prefix + "RuleExecResult.", this.RuleExecResult);
        this.setParamSimple(map, prefix + "TableOwnerUserId", this.TableOwnerUserId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

