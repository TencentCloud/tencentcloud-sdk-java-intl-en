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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinSourceTable extends AbstractModel {

    /**
    * 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableNodeType")
    @Expose
    private Long TableNodeType;

    /**
    * Base Table Node Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableNodeId")
    @Expose
    private String TableNodeId;

    /**
    * Parent node ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Optional, the data source has no ID in the original table.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Required. Use the original table name for the data source. Use the logical table name for other types.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Field list to display in the base table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fields")
    @Expose
    private TableField [] Fields;

    /**
    * Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Optional, alias of the data source displayed on the front-end, excel table creation is required
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableAlias")
    @Expose
    private String TableAlias;

    /**
     * Get 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableNodeType 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTableNodeType() {
        return this.TableNodeType;
    }

    /**
     * Set 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableNodeType 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableNodeType(Long TableNodeType) {
        this.TableNodeType = TableNodeType;
    }

    /**
     * Get Base Table Node Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableNodeId Base Table Node Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableNodeId() {
        return this.TableNodeId;
    }

    /**
     * Set Base Table Node Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableNodeId Base Table Node Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableNodeId(String TableNodeId) {
        this.TableNodeId = TableNodeId;
    }

    /**
     * Get Parent node ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentId Parent node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent node ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentId Parent node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Optional, the data source has no ID in the original table.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableId Optional, the data source has no ID in the original table.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Optional, the data source has no ID in the original table.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableId Optional, the data source has no ID in the original table.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Required. Use the original table name for the data source. Use the logical table name for other types.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Required. Use the original table name for the data source. Use the logical table name for other types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Required. Use the original table name for the data source. Use the logical table name for other types.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Required. Use the original table name for the data source. Use the logical table name for other types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Field list to display in the base table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fields Field list to display in the base table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableField [] getFields() {
        return this.Fields;
    }

    /**
     * Set Field list to display in the base table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fields Field list to display in the base table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFields(TableField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get Data source ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceId Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceId Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Optional, alias of the data source displayed on the front-end, excel table creation is required
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableAlias Optional, alias of the data source displayed on the front-end, excel table creation is required
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableAlias() {
        return this.TableAlias;
    }

    /**
     * Set Optional, alias of the data source displayed on the front-end, excel table creation is required
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableAlias Optional, alias of the data source displayed on the front-end, excel table creation is required
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableAlias(String TableAlias) {
        this.TableAlias = TableAlias;
    }

    public JoinSourceTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinSourceTable(JoinSourceTable source) {
        if (source.TableNodeType != null) {
            this.TableNodeType = new Long(source.TableNodeType);
        }
        if (source.TableNodeId != null) {
            this.TableNodeId = new String(source.TableNodeId);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Fields != null) {
            this.Fields = new TableField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new TableField(source.Fields[i]);
            }
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.TableAlias != null) {
            this.TableAlias = new String(source.TableAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableNodeType", this.TableNodeType);
        this.setParamSimple(map, prefix + "TableNodeId", this.TableNodeId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableAlias", this.TableAlias);

    }
}

