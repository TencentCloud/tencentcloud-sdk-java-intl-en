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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Explain extends AbstractModel {

    /**
    * <p>Identifier</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>Query type</p><p>Enumeration value:</p><ul><li>SIMPLE: A regular query with no subquery and UNION. Single table or ordinary JOIN is SIMPLE.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SelectType")
    @Expose
    private String SelectType;

    /**
    * <p>Table name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>Partition</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private String Partitions;

    /**
    * <p>Access type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Possibly used indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PossibleKeys")
    @Expose
    private String PossibleKeys;

    /**
    * <p>Used Indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Used Indexes length</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyLen")
    @Expose
    private String KeyLen;

    /**
    * <p>Column or constant to compare with the index</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * <p>Estimate the number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rows")
    @Expose
    private String Rows;

    /**
    * <p>Estimated percentage of remaining rows after conditional filtering</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Filtered")
    @Expose
    private String Filtered;

    /**
    * <p>Additional information, such as Using index, Using filesort</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get <p>Identifier</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID <p>Identifier</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>Identifier</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID <p>Identifier</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Query type</p><p>Enumeration value:</p><ul><li>SIMPLE: A regular query with no subquery and UNION. Single table or ordinary JOIN is SIMPLE.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SelectType <p>Query type</p><p>Enumeration value:</p><ul><li>SIMPLE: A regular query with no subquery and UNION. Single table or ordinary JOIN is SIMPLE.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSelectType() {
        return this.SelectType;
    }

    /**
     * Set <p>Query type</p><p>Enumeration value:</p><ul><li>SIMPLE: A regular query with no subquery and UNION. Single table or ordinary JOIN is SIMPLE.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SelectType <p>Query type</p><p>Enumeration value:</p><ul><li>SIMPLE: A regular query with no subquery and UNION. Single table or ordinary JOIN is SIMPLE.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSelectType(String SelectType) {
        this.SelectType = SelectType;
    }

    /**
     * Get <p>Table name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Table <p>Table name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>Table name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Table <p>Table name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>Partition</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partitions <p>Partition</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPartitions() {
        return this.Partitions;
    }

    /**
     * Set <p>Partition</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partitions <p>Partition</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(String Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get <p>Access type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Access type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Access type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Access type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Possibly used indexes</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PossibleKeys <p>Possibly used indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPossibleKeys() {
        return this.PossibleKeys;
    }

    /**
     * Set <p>Possibly used indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PossibleKeys <p>Possibly used indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPossibleKeys(String PossibleKeys) {
        this.PossibleKeys = PossibleKeys;
    }

    /**
     * Get <p>Used Indexes</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key <p>Used Indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Used Indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key <p>Used Indexes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Used Indexes length</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyLen <p>Used Indexes length</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyLen() {
        return this.KeyLen;
    }

    /**
     * Set <p>Used Indexes length</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyLen <p>Used Indexes length</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyLen(String KeyLen) {
        this.KeyLen = KeyLen;
    }

    /**
     * Get <p>Column or constant to compare with the index</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ref <p>Column or constant to compare with the index</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set <p>Column or constant to compare with the index</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ref <p>Column or constant to compare with the index</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get <p>Estimate the number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rows <p>Estimate the number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRows() {
        return this.Rows;
    }

    /**
     * Set <p>Estimate the number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rows <p>Estimate the number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRows(String Rows) {
        this.Rows = Rows;
    }

    /**
     * Get <p>Estimated percentage of remaining rows after conditional filtering</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Filtered <p>Estimated percentage of remaining rows after conditional filtering</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFiltered() {
        return this.Filtered;
    }

    /**
     * Set <p>Estimated percentage of remaining rows after conditional filtering</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Filtered <p>Estimated percentage of remaining rows after conditional filtering</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFiltered(String Filtered) {
        this.Filtered = Filtered;
    }

    /**
     * Get <p>Additional information, such as Using index, Using filesort</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extra <p>Additional information, such as Using index, Using filesort</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>Additional information, such as Using index, Using filesort</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extra <p>Additional information, such as Using index, Using filesort</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public Explain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Explain(Explain source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.SelectType != null) {
            this.SelectType = new String(source.SelectType);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Partitions != null) {
            this.Partitions = new String(source.Partitions);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PossibleKeys != null) {
            this.PossibleKeys = new String(source.PossibleKeys);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.KeyLen != null) {
            this.KeyLen = new String(source.KeyLen);
        }
        if (source.Ref != null) {
            this.Ref = new String(source.Ref);
        }
        if (source.Rows != null) {
            this.Rows = new String(source.Rows);
        }
        if (source.Filtered != null) {
            this.Filtered = new String(source.Filtered);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "SelectType", this.SelectType);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PossibleKeys", this.PossibleKeys);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyLen", this.KeyLen);
        this.setParamSimple(map, prefix + "Ref", this.Ref);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "Filtered", this.Filtered);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

