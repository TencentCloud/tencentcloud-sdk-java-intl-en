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

public class ParsedTableInfoNew extends AbstractModel{

    /**
    * Table description language type. Valid values: PROTO, TDR
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * Table name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table data structure type. Valid values: GENERIC, LIST
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyFields")
    @Expose
    private String KeyFields;

    /**
    * Old primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldKeyFields")
    @Expose
    private String OldKeyFields;

    /**
    * Non-primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValueFields")
    @Expose
    private String ValueFields;

    /**
    * Old non-primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldValueFields")
    @Expose
    private String OldValueFields;

    /**
    * Table group ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Total size of primary key field
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SumKeyFieldSize")
    @Expose
    private Long SumKeyFieldSize;

    /**
    * Total size of non-primary key fields
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SumValueFieldSize")
    @Expose
    private Long SumValueFieldSize;

    /**
    * Index key set
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexKeySet")
    @Expose
    private String IndexKeySet;

    /**
    * Shardkey set
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * TDR version number
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TdrVersion")
    @Expose
    private Long TdrVersion;

    /**
    * Error message
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SortFieldNum")
    @Expose
    private Long SortFieldNum;

    /**
    * Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SortRule")
    @Expose
    private Long SortRule;

    /**
     * Get Table description language type. Valid values: PROTO, TDR
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableIdlType Table description language type. Valid values: PROTO, TDR
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set Table description language type. Valid values: PROTO, TDR
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableIdlType Table description language type. Valid values: PROTO, TDR
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get Table instance ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableInstanceId Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableInstanceId Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get Table name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableName Table name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableName Table name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table data structure type. Valid values: GENERIC, LIST
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableType Table data structure type. Valid values: GENERIC, LIST
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table data structure type. Valid values: GENERIC, LIST
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableType Table data structure type. Valid values: GENERIC, LIST
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Primary key field information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyFields Primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyFields() {
        return this.KeyFields;
    }

    /**
     * Set Primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyFields Primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyFields(String KeyFields) {
        this.KeyFields = KeyFields;
    }

    /**
     * Get Old primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OldKeyFields Old primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOldKeyFields() {
        return this.OldKeyFields;
    }

    /**
     * Set Old primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OldKeyFields Old primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOldKeyFields(String OldKeyFields) {
        this.OldKeyFields = OldKeyFields;
    }

    /**
     * Get Non-primary key field information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ValueFields Non-primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValueFields() {
        return this.ValueFields;
    }

    /**
     * Set Non-primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ValueFields Non-primary key field information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValueFields(String ValueFields) {
        this.ValueFields = ValueFields;
    }

    /**
     * Get Old non-primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OldValueFields Old non-primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOldValueFields() {
        return this.OldValueFields;
    }

    /**
     * Set Old non-primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OldValueFields Old non-primary key field information, which is valid during verification of table modification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOldValueFields(String OldValueFields) {
        this.OldValueFields = OldValueFields;
    }

    /**
     * Get Table group ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableGroupId Table group ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableGroupId Table group ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Total size of primary key field
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SumKeyFieldSize Total size of primary key field
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSumKeyFieldSize() {
        return this.SumKeyFieldSize;
    }

    /**
     * Set Total size of primary key field
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SumKeyFieldSize Total size of primary key field
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSumKeyFieldSize(Long SumKeyFieldSize) {
        this.SumKeyFieldSize = SumKeyFieldSize;
    }

    /**
     * Get Total size of non-primary key fields
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SumValueFieldSize Total size of non-primary key fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSumValueFieldSize() {
        return this.SumValueFieldSize;
    }

    /**
     * Set Total size of non-primary key fields
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SumValueFieldSize Total size of non-primary key fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSumValueFieldSize(Long SumValueFieldSize) {
        this.SumValueFieldSize = SumValueFieldSize;
    }

    /**
     * Get Index key set
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexKeySet Index key set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexKeySet() {
        return this.IndexKeySet;
    }

    /**
     * Set Index key set
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexKeySet Index key set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexKeySet(String IndexKeySet) {
        this.IndexKeySet = IndexKeySet;
    }

    /**
     * Get Shardkey set
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ShardingKeySet Shardkey set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set Shardkey set
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ShardingKeySet Shardkey set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get TDR version number
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TdrVersion TDR version number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTdrVersion() {
        return this.TdrVersion;
    }

    /**
     * Set TDR version number
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TdrVersion TDR version number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTdrVersion(Long TdrVersion) {
        this.TdrVersion = TdrVersion;
    }

    /**
     * Get Error message
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error message
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListElementNum Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListElementNum Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SortFieldNum Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSortFieldNum() {
        return this.SortFieldNum;
    }

    /**
     * Set Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SortFieldNum Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSortFieldNum(Long SortFieldNum) {
        this.SortFieldNum = SortFieldNum;
    }

    /**
     * Get Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SortRule Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSortRule() {
        return this.SortRule;
    }

    /**
     * Set Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SortRule Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSortRule(Long SortRule) {
        this.SortRule = SortRule;
    }

    public ParsedTableInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParsedTableInfoNew(ParsedTableInfoNew source) {
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.KeyFields != null) {
            this.KeyFields = new String(source.KeyFields);
        }
        if (source.OldKeyFields != null) {
            this.OldKeyFields = new String(source.OldKeyFields);
        }
        if (source.ValueFields != null) {
            this.ValueFields = new String(source.ValueFields);
        }
        if (source.OldValueFields != null) {
            this.OldValueFields = new String(source.OldValueFields);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.SumKeyFieldSize != null) {
            this.SumKeyFieldSize = new Long(source.SumKeyFieldSize);
        }
        if (source.SumValueFieldSize != null) {
            this.SumValueFieldSize = new Long(source.SumValueFieldSize);
        }
        if (source.IndexKeySet != null) {
            this.IndexKeySet = new String(source.IndexKeySet);
        }
        if (source.ShardingKeySet != null) {
            this.ShardingKeySet = new String(source.ShardingKeySet);
        }
        if (source.TdrVersion != null) {
            this.TdrVersion = new Long(source.TdrVersion);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.ListElementNum != null) {
            this.ListElementNum = new Long(source.ListElementNum);
        }
        if (source.SortFieldNum != null) {
            this.SortFieldNum = new Long(source.SortFieldNum);
        }
        if (source.SortRule != null) {
            this.SortRule = new Long(source.SortRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "KeyFields", this.KeyFields);
        this.setParamSimple(map, prefix + "OldKeyFields", this.OldKeyFields);
        this.setParamSimple(map, prefix + "ValueFields", this.ValueFields);
        this.setParamSimple(map, prefix + "OldValueFields", this.OldValueFields);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "SumKeyFieldSize", this.SumKeyFieldSize);
        this.setParamSimple(map, prefix + "SumValueFieldSize", this.SumValueFieldSize);
        this.setParamSimple(map, prefix + "IndexKeySet", this.IndexKeySet);
        this.setParamSimple(map, prefix + "ShardingKeySet", this.ShardingKeySet);
        this.setParamSimple(map, prefix + "TdrVersion", this.TdrVersion);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "ListElementNum", this.ListElementNum);
        this.setParamSimple(map, prefix + "SortFieldNum", this.SortFieldNum);
        this.setParamSimple(map, prefix + "SortRule", this.SortRule);

    }
}

