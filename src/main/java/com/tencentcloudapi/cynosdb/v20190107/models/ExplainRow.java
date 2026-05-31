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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExplainRow extends AbstractModel {

    /**
    * <p>Serial number of the query</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Query type. Common values: SIMPLE (simple query, excluding subqueries or UNION), PRIMARY (outermost query), SUBQUERY (first SELECT in a subquery), DERIVED (derivative table/subquery in FROM clause), UNION (second and subsequent SELECTs in UNION), UNION RESULT (result set of UNION).</p>
    */
    @SerializedName("SelectType")
    @Expose
    private String SelectType;

    /**
    * <p>Data table name</p>
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>Query matching partition</p>
    */
    @SerializedName("Partitions")
    @Expose
    private String Partitions;

    /**
    * <p>Access type (very important, a key metric for measuring query efficiency), ranked from best to worst: system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL. Common value descriptions: • system: The table has only one row (system table). • const: Matches one row through primary key or unique index, commonly seen in WHERE pk = 1. • eq_ref: Uses primary key or unique index when connecting, each index value matches only one row. • ref: Uses non-unique index to search, may match multiple rows. • range: Index range scan, such as BETWEEN, &gt;, &lt;, IN. • index: Full index scan (traversal of the entire index tree). • ALL: Full-table scan (worst, requires optimization).</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Indexes that may be used in querying. NULL means no available index.</p>
    */
    @SerializedName("PossibleKeys")
    @Expose
    private String PossibleKeys;

    /**
    * <p>Indexes actually used. NULL means no index is used.</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>The length of the actual used index (number of bytes). It can be used to determine which columns are actually used in the composite index. A shorter value indicates fewer index columns are used.</p>
    */
    @SerializedName("KeyLen")
    @Expose
    private String KeyLen;

    /**
    * <p>Display which columns or constants are compared with indexes in the key column. Common values: const (constant), certain column name, func (function result).</p>
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * <p>Estimate the number of rows to scan</p>
    */
    @SerializedName("Rows")
    @Expose
    private Long Rows;

    /**
    * <p>Indicates the estimation of the percentage of rows remaining after table conditional filtering. 100% means no additional filtering. The higher the value, the better.</p>
    */
    @SerializedName("Filtered")
    @Expose
    private Float Filtered;

    /**
    * <p>Additional information (very important), common values: • Using index: covering index, no need to return to the table (good) • Using where: filter with WHERE after the storage engine returns rows • Using temporary: used a temporary table (commonly used in GROUP BY/ORDER BY, needs optimization) • Using filesort: used file sort instead of index sorting (needs optimization) • Using index condition: used pushdown of index (ICP)</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get <p>Serial number of the query</p> 
     * @return Id <p>Serial number of the query</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Serial number of the query</p>
     * @param Id <p>Serial number of the query</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Query type. Common values: SIMPLE (simple query, excluding subqueries or UNION), PRIMARY (outermost query), SUBQUERY (first SELECT in a subquery), DERIVED (derivative table/subquery in FROM clause), UNION (second and subsequent SELECTs in UNION), UNION RESULT (result set of UNION).</p> 
     * @return SelectType <p>Query type. Common values: SIMPLE (simple query, excluding subqueries or UNION), PRIMARY (outermost query), SUBQUERY (first SELECT in a subquery), DERIVED (derivative table/subquery in FROM clause), UNION (second and subsequent SELECTs in UNION), UNION RESULT (result set of UNION).</p>
     */
    public String getSelectType() {
        return this.SelectType;
    }

    /**
     * Set <p>Query type. Common values: SIMPLE (simple query, excluding subqueries or UNION), PRIMARY (outermost query), SUBQUERY (first SELECT in a subquery), DERIVED (derivative table/subquery in FROM clause), UNION (second and subsequent SELECTs in UNION), UNION RESULT (result set of UNION).</p>
     * @param SelectType <p>Query type. Common values: SIMPLE (simple query, excluding subqueries or UNION), PRIMARY (outermost query), SUBQUERY (first SELECT in a subquery), DERIVED (derivative table/subquery in FROM clause), UNION (second and subsequent SELECTs in UNION), UNION RESULT (result set of UNION).</p>
     */
    public void setSelectType(String SelectType) {
        this.SelectType = SelectType;
    }

    /**
     * Get <p>Data table name</p> 
     * @return Table <p>Data table name</p>
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>Data table name</p>
     * @param Table <p>Data table name</p>
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>Query matching partition</p> 
     * @return Partitions <p>Query matching partition</p>
     */
    public String getPartitions() {
        return this.Partitions;
    }

    /**
     * Set <p>Query matching partition</p>
     * @param Partitions <p>Query matching partition</p>
     */
    public void setPartitions(String Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get <p>Access type (very important, a key metric for measuring query efficiency), ranked from best to worst: system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL. Common value descriptions: • system: The table has only one row (system table). • const: Matches one row through primary key or unique index, commonly seen in WHERE pk = 1. • eq_ref: Uses primary key or unique index when connecting, each index value matches only one row. • ref: Uses non-unique index to search, may match multiple rows. • range: Index range scan, such as BETWEEN, &gt;, &lt;, IN. • index: Full index scan (traversal of the entire index tree). • ALL: Full-table scan (worst, requires optimization).</p> 
     * @return Type <p>Access type (very important, a key metric for measuring query efficiency), ranked from best to worst: system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL. Common value descriptions: • system: The table has only one row (system table). • const: Matches one row through primary key or unique index, commonly seen in WHERE pk = 1. • eq_ref: Uses primary key or unique index when connecting, each index value matches only one row. • ref: Uses non-unique index to search, may match multiple rows. • range: Index range scan, such as BETWEEN, &gt;, &lt;, IN. • index: Full index scan (traversal of the entire index tree). • ALL: Full-table scan (worst, requires optimization).</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Access type (very important, a key metric for measuring query efficiency), ranked from best to worst: system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL. Common value descriptions: • system: The table has only one row (system table). • const: Matches one row through primary key or unique index, commonly seen in WHERE pk = 1. • eq_ref: Uses primary key or unique index when connecting, each index value matches only one row. • ref: Uses non-unique index to search, may match multiple rows. • range: Index range scan, such as BETWEEN, &gt;, &lt;, IN. • index: Full index scan (traversal of the entire index tree). • ALL: Full-table scan (worst, requires optimization).</p>
     * @param Type <p>Access type (very important, a key metric for measuring query efficiency), ranked from best to worst: system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL. Common value descriptions: • system: The table has only one row (system table). • const: Matches one row through primary key or unique index, commonly seen in WHERE pk = 1. • eq_ref: Uses primary key or unique index when connecting, each index value matches only one row. • ref: Uses non-unique index to search, may match multiple rows. • range: Index range scan, such as BETWEEN, &gt;, &lt;, IN. • index: Full index scan (traversal of the entire index tree). • ALL: Full-table scan (worst, requires optimization).</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Indexes that may be used in querying. NULL means no available index.</p> 
     * @return PossibleKeys <p>Indexes that may be used in querying. NULL means no available index.</p>
     */
    public String getPossibleKeys() {
        return this.PossibleKeys;
    }

    /**
     * Set <p>Indexes that may be used in querying. NULL means no available index.</p>
     * @param PossibleKeys <p>Indexes that may be used in querying. NULL means no available index.</p>
     */
    public void setPossibleKeys(String PossibleKeys) {
        this.PossibleKeys = PossibleKeys;
    }

    /**
     * Get <p>Indexes actually used. NULL means no index is used.</p> 
     * @return Key <p>Indexes actually used. NULL means no index is used.</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Indexes actually used. NULL means no index is used.</p>
     * @param Key <p>Indexes actually used. NULL means no index is used.</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>The length of the actual used index (number of bytes). It can be used to determine which columns are actually used in the composite index. A shorter value indicates fewer index columns are used.</p> 
     * @return KeyLen <p>The length of the actual used index (number of bytes). It can be used to determine which columns are actually used in the composite index. A shorter value indicates fewer index columns are used.</p>
     */
    public String getKeyLen() {
        return this.KeyLen;
    }

    /**
     * Set <p>The length of the actual used index (number of bytes). It can be used to determine which columns are actually used in the composite index. A shorter value indicates fewer index columns are used.</p>
     * @param KeyLen <p>The length of the actual used index (number of bytes). It can be used to determine which columns are actually used in the composite index. A shorter value indicates fewer index columns are used.</p>
     */
    public void setKeyLen(String KeyLen) {
        this.KeyLen = KeyLen;
    }

    /**
     * Get <p>Display which columns or constants are compared with indexes in the key column. Common values: const (constant), certain column name, func (function result).</p> 
     * @return Ref <p>Display which columns or constants are compared with indexes in the key column. Common values: const (constant), certain column name, func (function result).</p>
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set <p>Display which columns or constants are compared with indexes in the key column. Common values: const (constant), certain column name, func (function result).</p>
     * @param Ref <p>Display which columns or constants are compared with indexes in the key column. Common values: const (constant), certain column name, func (function result).</p>
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get <p>Estimate the number of rows to scan</p> 
     * @return Rows <p>Estimate the number of rows to scan</p>
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set <p>Estimate the number of rows to scan</p>
     * @param Rows <p>Estimate the number of rows to scan</p>
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get <p>Indicates the estimation of the percentage of rows remaining after table conditional filtering. 100% means no additional filtering. The higher the value, the better.</p> 
     * @return Filtered <p>Indicates the estimation of the percentage of rows remaining after table conditional filtering. 100% means no additional filtering. The higher the value, the better.</p>
     */
    public Float getFiltered() {
        return this.Filtered;
    }

    /**
     * Set <p>Indicates the estimation of the percentage of rows remaining after table conditional filtering. 100% means no additional filtering. The higher the value, the better.</p>
     * @param Filtered <p>Indicates the estimation of the percentage of rows remaining after table conditional filtering. 100% means no additional filtering. The higher the value, the better.</p>
     */
    public void setFiltered(Float Filtered) {
        this.Filtered = Filtered;
    }

    /**
     * Get <p>Additional information (very important), common values: • Using index: covering index, no need to return to the table (good) • Using where: filter with WHERE after the storage engine returns rows • Using temporary: used a temporary table (commonly used in GROUP BY/ORDER BY, needs optimization) • Using filesort: used file sort instead of index sorting (needs optimization) • Using index condition: used pushdown of index (ICP)</p> 
     * @return Extra <p>Additional information (very important), common values: • Using index: covering index, no need to return to the table (good) • Using where: filter with WHERE after the storage engine returns rows • Using temporary: used a temporary table (commonly used in GROUP BY/ORDER BY, needs optimization) • Using filesort: used file sort instead of index sorting (needs optimization) • Using index condition: used pushdown of index (ICP)</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>Additional information (very important), common values: • Using index: covering index, no need to return to the table (good) • Using where: filter with WHERE after the storage engine returns rows • Using temporary: used a temporary table (commonly used in GROUP BY/ORDER BY, needs optimization) • Using filesort: used file sort instead of index sorting (needs optimization) • Using index condition: used pushdown of index (ICP)</p>
     * @param Extra <p>Additional information (very important), common values: • Using index: covering index, no need to return to the table (good) • Using where: filter with WHERE after the storage engine returns rows • Using temporary: used a temporary table (commonly used in GROUP BY/ORDER BY, needs optimization) • Using filesort: used file sort instead of index sorting (needs optimization) • Using index condition: used pushdown of index (ICP)</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public ExplainRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExplainRow(ExplainRow source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
            this.Rows = new Long(source.Rows);
        }
        if (source.Filtered != null) {
            this.Filtered = new Float(source.Filtered);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
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

