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

public class TableBaseInfo extends AbstractModel {

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Table NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Data Table's Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * Table Remarks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Data Format Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
    * User Nickname
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * Table Creation User ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserSubUin")
    @Expose
    private String UserSubUin;

    /**
    * Data Governance Configuration ItemsNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("GovernPolicy")
    @Expose
    private DlcDataGovernPolicy GovernPolicy;

    /**
    * Is Database Data Governance disabled, true for disabled, false for enabled
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DbGovernPolicyIsDisable")
    @Expose
    private String DbGovernPolicyIsDisable;

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
     * Get Table NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Data Table's Data Source Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceConnectionName Data Table's Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set Data Table's Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceConnectionName Data Table's Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get Table Remarks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableComment Table Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set Table Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableComment Table Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Data Format Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableFormat Data Format Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set Data Format Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableFormat Data Format Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    /**
     * Get User Nickname
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserAlias User Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set User Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserAlias User Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get Table Creation User ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserSubUin Table Creation User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserSubUin() {
        return this.UserSubUin;
    }

    /**
     * Set Table Creation User ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserSubUin Table Creation User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserSubUin(String UserSubUin) {
        this.UserSubUin = UserSubUin;
    }

    /**
     * Get Data Governance Configuration ItemsNote: This field may return null, indicating that no valid value can be obtained. 
     * @return GovernPolicy Data Governance Configuration ItemsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public DlcDataGovernPolicy getGovernPolicy() {
        return this.GovernPolicy;
    }

    /**
     * Set Data Governance Configuration ItemsNote: This field may return null, indicating that no valid value can be obtained.
     * @param GovernPolicy Data Governance Configuration ItemsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setGovernPolicy(DlcDataGovernPolicy GovernPolicy) {
        this.GovernPolicy = GovernPolicy;
    }

    /**
     * Get Is Database Data Governance disabled, true for disabled, false for enabled
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DbGovernPolicyIsDisable Is Database Data Governance disabled, true for disabled, false for enabled
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDbGovernPolicyIsDisable() {
        return this.DbGovernPolicyIsDisable;
    }

    /**
     * Set Is Database Data Governance disabled, true for disabled, false for enabled
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DbGovernPolicyIsDisable Is Database Data Governance disabled, true for disabled, false for enabled
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDbGovernPolicyIsDisable(String DbGovernPolicyIsDisable) {
        this.DbGovernPolicyIsDisable = DbGovernPolicyIsDisable;
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
            this.GovernPolicy = new DlcDataGovernPolicy(source.GovernPolicy);
        }
        if (source.DbGovernPolicyIsDisable != null) {
            this.DbGovernPolicyIsDisable = new String(source.DbGovernPolicyIsDisable);
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
        this.setParamSimple(map, prefix + "DbGovernPolicyIsDisable", this.DbGovernPolicyIsDisable);

    }
}

