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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsertDatasToTableRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table name
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Whether to use the strict mode
    */
    @SerializedName("Strict")
    @Expose
    private Boolean Strict;

    /**
    * Maximum filtration ratio, ranging from 0 to 1.0
    */
    @SerializedName("MaxFilterRatio")
    @Expose
    private Float MaxFilterRatio;

    /**
    * Array of column names
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
    * Data line
    */
    @SerializedName("Rows")
    @Expose
    private Rows [] Rows;

    /**
    * Tags for inserting data
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * Column type, this field has been deprecated, please use Types
    */
    @SerializedName("ColumnTypes")
    @Expose
    private String ColumnTypes;

    /**
    * Array of column types

    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * Catalog name, defaults to 'internal' if not specified.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * InstanceId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Table name 
     * @return Table Table name
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
     * @param Table Table name
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Whether to use the strict mode 
     * @return Strict Whether to use the strict mode
     */
    public Boolean getStrict() {
        return this.Strict;
    }

    /**
     * Set Whether to use the strict mode
     * @param Strict Whether to use the strict mode
     */
    public void setStrict(Boolean Strict) {
        this.Strict = Strict;
    }

    /**
     * Get Maximum filtration ratio, ranging from 0 to 1.0 
     * @return MaxFilterRatio Maximum filtration ratio, ranging from 0 to 1.0
     */
    public Float getMaxFilterRatio() {
        return this.MaxFilterRatio;
    }

    /**
     * Set Maximum filtration ratio, ranging from 0 to 1.0
     * @param MaxFilterRatio Maximum filtration ratio, ranging from 0 to 1.0
     */
    public void setMaxFilterRatio(Float MaxFilterRatio) {
        this.MaxFilterRatio = MaxFilterRatio;
    }

    /**
     * Get Array of column names 
     * @return Columns Array of column names
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Array of column names
     * @param Columns Array of column names
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Data line 
     * @return Rows Data line
     */
    public Rows [] getRows() {
        return this.Rows;
    }

    /**
     * Set Data line
     * @param Rows Data line
     */
    public void setRows(Rows [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Tags for inserting data 
     * @return Label Tags for inserting data
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tags for inserting data
     * @param Label Tags for inserting data
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get Column type, this field has been deprecated, please use Types 
     * @return ColumnTypes Column type, this field has been deprecated, please use Types
     * @deprecated
     */
    @Deprecated
    public String getColumnTypes() {
        return this.ColumnTypes;
    }

    /**
     * Set Column type, this field has been deprecated, please use Types
     * @param ColumnTypes Column type, this field has been deprecated, please use Types
     * @deprecated
     */
    @Deprecated
    public void setColumnTypes(String ColumnTypes) {
        this.ColumnTypes = ColumnTypes;
    }

    /**
     * Get Array of column types
 
     * @return Types Array of column types

     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set Array of column types

     * @param Types Array of column types

     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get Catalog name, defaults to 'internal' if not specified. 
     * @return CatalogName Catalog name, defaults to 'internal' if not specified.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Catalog name, defaults to 'internal' if not specified.
     * @param CatalogName Catalog name, defaults to 'internal' if not specified.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get InstanceId 
     * @return InstanceId InstanceId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId
     * @param InstanceId InstanceId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public InsertDatasToTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsertDatasToTableRequest(InsertDatasToTableRequest source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Strict != null) {
            this.Strict = new Boolean(source.Strict);
        }
        if (source.MaxFilterRatio != null) {
            this.MaxFilterRatio = new Float(source.MaxFilterRatio);
        }
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
        if (source.Rows != null) {
            this.Rows = new Rows[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new Rows(source.Rows[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.ColumnTypes != null) {
            this.ColumnTypes = new String(source.ColumnTypes);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Strict", this.Strict);
        this.setParamSimple(map, prefix + "MaxFilterRatio", this.MaxFilterRatio);
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "ColumnTypes", this.ColumnTypes);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

