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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableBaseInfo extends AbstractModel{

    /**
    * The database name.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * The table name.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * The data source name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * The table remarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * The specific type: `table` or `view`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The data format type, such as `hive` and `iceberg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
    * The table creator name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * The table creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserSubUin")
    @Expose
    private String UserSubUin;

    /**
    * The data governance configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GovernPolicy")
    @Expose
    private DataGovernPolicy GovernPolicy;

    /**
     * Get The database name. 
     * @return DatabaseName The database name.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set The database name.
     * @param DatabaseName The database name.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get The table name. 
     * @return TableName The table name.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set The table name.
     * @param TableName The table name.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get The data source name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionName The data source name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set The data source name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionName The data source name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get The table remarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableComment The table remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set The table remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableComment The table remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get The specific type: `table` or `view`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type The specific type: `table` or `view`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The specific type: `table` or `view`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type The specific type: `table` or `view`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The data format type, such as `hive` and `iceberg`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableFormat The data format type, such as `hive` and `iceberg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set The data format type, such as `hive` and `iceberg`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableFormat The data format type, such as `hive` and `iceberg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    /**
     * Get The table creator name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAlias The table creator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set The table creator name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAlias The table creator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get The table creator ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserSubUin The table creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserSubUin() {
        return this.UserSubUin;
    }

    /**
     * Set The table creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserSubUin The table creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserSubUin(String UserSubUin) {
        this.UserSubUin = UserSubUin;
    }

    /**
     * Get The data governance configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GovernPolicy The data governance configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DataGovernPolicy getGovernPolicy() {
        return this.GovernPolicy;
    }

    /**
     * Set The data governance configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GovernPolicy The data governance configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGovernPolicy(DataGovernPolicy GovernPolicy) {
        this.GovernPolicy = GovernPolicy;
    }

    public TableBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableBaseInfo(TableBaseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.UserSubUin != null) {
            this.UserSubUin = new String(source.UserSubUin);
        }
        if (source.GovernPolicy != null) {
            this.GovernPolicy = new DataGovernPolicy(source.GovernPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamSimple(map, prefix + "UserSubUin", this.UserSubUin);
        this.setParamObj(map, prefix + "GovernPolicy.", this.GovernPolicy);

    }
}

