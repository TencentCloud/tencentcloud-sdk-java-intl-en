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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SelectedTableWithField extends AbstractModel{

    /**
    * ID of the table group where the table resides
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table ID
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * Table description language. Valid values: `PROTO`, `TDR`
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * Table data structure. Valid values: `GENERIC`, `LIST`
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * The list of fields on which indexes need to be created
    */
    @SerializedName("SelectedFields")
    @Expose
    private FieldInfo [] SelectedFields;

    /**
    * The number of index shards
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
     * Get ID of the table group where the table resides 
     * @return TableGroupId ID of the table group where the table resides
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set ID of the table group where the table resides
     * @param TableGroupId ID of the table group where the table resides
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
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
     * Get Table ID 
     * @return TableInstanceId Table ID
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set Table ID
     * @param TableInstanceId Table ID
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get Table description language. Valid values: `PROTO`, `TDR` 
     * @return TableIdlType Table description language. Valid values: `PROTO`, `TDR`
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set Table description language. Valid values: `PROTO`, `TDR`
     * @param TableIdlType Table description language. Valid values: `PROTO`, `TDR`
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get Table data structure. Valid values: `GENERIC`, `LIST` 
     * @return TableType Table data structure. Valid values: `GENERIC`, `LIST`
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table data structure. Valid values: `GENERIC`, `LIST`
     * @param TableType Table data structure. Valid values: `GENERIC`, `LIST`
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get The list of fields on which indexes need to be created 
     * @return SelectedFields The list of fields on which indexes need to be created
     */
    public FieldInfo [] getSelectedFields() {
        return this.SelectedFields;
    }

    /**
     * Set The list of fields on which indexes need to be created
     * @param SelectedFields The list of fields on which indexes need to be created
     */
    public void setSelectedFields(FieldInfo [] SelectedFields) {
        this.SelectedFields = SelectedFields;
    }

    /**
     * Get The number of index shards 
     * @return ShardNum The number of index shards
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set The number of index shards
     * @param ShardNum The number of index shards
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    public SelectedTableWithField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SelectedTableWithField(SelectedTableWithField source) {
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.SelectedFields != null) {
            this.SelectedFields = new FieldInfo[source.SelectedFields.length];
            for (int i = 0; i < source.SelectedFields.length; i++) {
                this.SelectedFields[i] = new FieldInfo(source.SelectedFields[i]);
            }
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamArrayObj(map, prefix + "SelectedFields.", this.SelectedFields);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);

    }
}

