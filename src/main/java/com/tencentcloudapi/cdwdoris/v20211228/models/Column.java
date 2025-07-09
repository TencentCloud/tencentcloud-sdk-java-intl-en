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

public class Column extends AbstractModel {

    /**
    * Column name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Column type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Aggregation type: When the table is an aggregation model (AGG_KEY), the column with the aggregation type is set as the metric column, and other columns are dimension columns. Aggregation type: ●SUM: sum; the values of multiple rows are accumulated. ●REPLACE: replacement; the values in the next batch of data will replace the values in the previously imported rows. ●MAX: retain the maximum value.
 ●MIN: retain the minimum value. ●REPLACE_IF_NOT_NULL: non-null values replacement. The difference from REPLACE is that null values are not replaced. ●HLL_UNION: aggregation method for HLL type columns, which is aggregated by HyperLogLog algorithm. ●BITMAP_UNION: aggregation method for BIMTAP type columns; bitmap union aggregation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AggType")
    @Expose
    private String AggType;

    /**
    * Whether the column value is allowed to be Null
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNull")
    @Expose
    private Boolean IsNull;

    /**
    * Whether it is a Key column. The meaning of different data models:
●DUP_KEY: The column specified afterwards is the sorting column.
●AGG_KEY: The column specified afterwards is the dimension column.
●UNI_KEY: The column specified afterward is the primary key column.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsKey")
    @Expose
    private Boolean IsKey;

    /**
    * Column's default value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Whether it is a partition column. The partition column must be a Key column.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * Whether it is a bucket column. The bucket column of the aggregation model and primary key model must be Key columns, while the bucket column of the detail model can be any column.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDistribution")
    @Expose
    private Boolean IsDistribution;

    /**
    * Whether it is an auto-increment column. Supported by TCHouse-D 2.1 version and later.
Limit:
1. Only DUP_KEY and UNI_KEY model tables can contain auto-increment columns.
2. A table can contain at most one auto-increment column.
3. The type of the auto-increment column must be BIGINT type and cannot be null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoInc")
    @Expose
    private Boolean AutoInc;

    /**
    * Column description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Column name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Column name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Column type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Column type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Column type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Column type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Aggregation type: When the table is an aggregation model (AGG_KEY), the column with the aggregation type is set as the metric column, and other columns are dimension columns. Aggregation type: ●SUM: sum; the values of multiple rows are accumulated. ●REPLACE: replacement; the values in the next batch of data will replace the values in the previously imported rows. ●MAX: retain the maximum value.
 ●MIN: retain the minimum value. ●REPLACE_IF_NOT_NULL: non-null values replacement. The difference from REPLACE is that null values are not replaced. ●HLL_UNION: aggregation method for HLL type columns, which is aggregated by HyperLogLog algorithm. ●BITMAP_UNION: aggregation method for BIMTAP type columns; bitmap union aggregation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AggType Aggregation type: When the table is an aggregation model (AGG_KEY), the column with the aggregation type is set as the metric column, and other columns are dimension columns. Aggregation type: ●SUM: sum; the values of multiple rows are accumulated. ●REPLACE: replacement; the values in the next batch of data will replace the values in the previously imported rows. ●MAX: retain the maximum value.
 ●MIN: retain the minimum value. ●REPLACE_IF_NOT_NULL: non-null values replacement. The difference from REPLACE is that null values are not replaced. ●HLL_UNION: aggregation method for HLL type columns, which is aggregated by HyperLogLog algorithm. ●BITMAP_UNION: aggregation method for BIMTAP type columns; bitmap union aggregation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAggType() {
        return this.AggType;
    }

    /**
     * Set Aggregation type: When the table is an aggregation model (AGG_KEY), the column with the aggregation type is set as the metric column, and other columns are dimension columns. Aggregation type: ●SUM: sum; the values of multiple rows are accumulated. ●REPLACE: replacement; the values in the next batch of data will replace the values in the previously imported rows. ●MAX: retain the maximum value.
 ●MIN: retain the minimum value. ●REPLACE_IF_NOT_NULL: non-null values replacement. The difference from REPLACE is that null values are not replaced. ●HLL_UNION: aggregation method for HLL type columns, which is aggregated by HyperLogLog algorithm. ●BITMAP_UNION: aggregation method for BIMTAP type columns; bitmap union aggregation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AggType Aggregation type: When the table is an aggregation model (AGG_KEY), the column with the aggregation type is set as the metric column, and other columns are dimension columns. Aggregation type: ●SUM: sum; the values of multiple rows are accumulated. ●REPLACE: replacement; the values in the next batch of data will replace the values in the previously imported rows. ●MAX: retain the maximum value.
 ●MIN: retain the minimum value. ●REPLACE_IF_NOT_NULL: non-null values replacement. The difference from REPLACE is that null values are not replaced. ●HLL_UNION: aggregation method for HLL type columns, which is aggregated by HyperLogLog algorithm. ●BITMAP_UNION: aggregation method for BIMTAP type columns; bitmap union aggregation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAggType(String AggType) {
        this.AggType = AggType;
    }

    /**
     * Get Whether the column value is allowed to be Null
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsNull Whether the column value is allowed to be Null
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsNull() {
        return this.IsNull;
    }

    /**
     * Set Whether the column value is allowed to be Null
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsNull Whether the column value is allowed to be Null
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsNull(Boolean IsNull) {
        this.IsNull = IsNull;
    }

    /**
     * Get Whether it is a Key column. The meaning of different data models:
●DUP_KEY: The column specified afterwards is the sorting column.
●AGG_KEY: The column specified afterwards is the dimension column.
●UNI_KEY: The column specified afterward is the primary key column.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsKey Whether it is a Key column. The meaning of different data models:
●DUP_KEY: The column specified afterwards is the sorting column.
●AGG_KEY: The column specified afterwards is the dimension column.
●UNI_KEY: The column specified afterward is the primary key column.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsKey() {
        return this.IsKey;
    }

    /**
     * Set Whether it is a Key column. The meaning of different data models:
●DUP_KEY: The column specified afterwards is the sorting column.
●AGG_KEY: The column specified afterwards is the dimension column.
●UNI_KEY: The column specified afterward is the primary key column.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsKey Whether it is a Key column. The meaning of different data models:
●DUP_KEY: The column specified afterwards is the sorting column.
●AGG_KEY: The column specified afterwards is the dimension column.
●UNI_KEY: The column specified afterward is the primary key column.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsKey(Boolean IsKey) {
        this.IsKey = IsKey;
    }

    /**
     * Get Column's default value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultValue Column's default value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Column's default value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultValue Column's default value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Whether it is a partition column. The partition column must be a Key column.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPartition Whether it is a partition column. The partition column must be a Key column.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Whether it is a partition column. The partition column must be a Key column.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPartition Whether it is a partition column. The partition column must be a Key column.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get Whether it is a bucket column. The bucket column of the aggregation model and primary key model must be Key columns, while the bucket column of the detail model can be any column.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDistribution Whether it is a bucket column. The bucket column of the aggregation model and primary key model must be Key columns, while the bucket column of the detail model can be any column.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDistribution() {
        return this.IsDistribution;
    }

    /**
     * Set Whether it is a bucket column. The bucket column of the aggregation model and primary key model must be Key columns, while the bucket column of the detail model can be any column.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDistribution Whether it is a bucket column. The bucket column of the aggregation model and primary key model must be Key columns, while the bucket column of the detail model can be any column.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDistribution(Boolean IsDistribution) {
        this.IsDistribution = IsDistribution;
    }

    /**
     * Get Whether it is an auto-increment column. Supported by TCHouse-D 2.1 version and later.
Limit:
1. Only DUP_KEY and UNI_KEY model tables can contain auto-increment columns.
2. A table can contain at most one auto-increment column.
3. The type of the auto-increment column must be BIGINT type and cannot be null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoInc Whether it is an auto-increment column. Supported by TCHouse-D 2.1 version and later.
Limit:
1. Only DUP_KEY and UNI_KEY model tables can contain auto-increment columns.
2. A table can contain at most one auto-increment column.
3. The type of the auto-increment column must be BIGINT type and cannot be null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAutoInc() {
        return this.AutoInc;
    }

    /**
     * Set Whether it is an auto-increment column. Supported by TCHouse-D 2.1 version and later.
Limit:
1. Only DUP_KEY and UNI_KEY model tables can contain auto-increment columns.
2. A table can contain at most one auto-increment column.
3. The type of the auto-increment column must be BIGINT type and cannot be null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoInc Whether it is an auto-increment column. Supported by TCHouse-D 2.1 version and later.
Limit:
1. Only DUP_KEY and UNI_KEY model tables can contain auto-increment columns.
2. A table can contain at most one auto-increment column.
3. The type of the auto-increment column must be BIGINT type and cannot be null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoInc(Boolean AutoInc) {
        this.AutoInc = AutoInc;
    }

    /**
     * Get Column description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Column description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Column description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Column description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public Column() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Column(Column source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AggType != null) {
            this.AggType = new String(source.AggType);
        }
        if (source.IsNull != null) {
            this.IsNull = new Boolean(source.IsNull);
        }
        if (source.IsKey != null) {
            this.IsKey = new Boolean(source.IsKey);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
        if (source.IsDistribution != null) {
            this.IsDistribution = new Boolean(source.IsDistribution);
        }
        if (source.AutoInc != null) {
            this.AutoInc = new Boolean(source.AutoInc);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AggType", this.AggType);
        this.setParamSimple(map, prefix + "IsNull", this.IsNull);
        this.setParamSimple(map, prefix + "IsKey", this.IsKey);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamSimple(map, prefix + "IsDistribution", this.IsDistribution);
        this.setParamSimple(map, prefix + "AutoInc", this.AutoInc);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

