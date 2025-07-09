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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributeRule extends AbstractModel {

    /**
    * Rule type. Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key); cols (partitioned by column name). Valid values for mongo: collection (partitioned by collection name); collectionAndObjectId (partitioned by collection + primary key). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Database name matching rule, please fill in the regular expression.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbPattern")
    @Expose
    private String DbPattern;

    /**
    * Table name matching rule. If DatabaseType is mongodb, it matches the collection name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TablePattern")
    @Expose
    private String TablePattern;

    /**
    * Column name. This field is required if RuleType is cols. The subscription task will use the value of this column to calculate the partition. Mongo does not partition by column, so there is no need to pass this field.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
     * Get Rule type. Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key); cols (partitioned by column name). Valid values for mongo: collection (partitioned by collection name); collectionAndObjectId (partitioned by collection + primary key). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Rule type. Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key); cols (partitioned by column name). Valid values for mongo: collection (partitioned by collection name); collectionAndObjectId (partitioned by collection + primary key). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type. Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key); cols (partitioned by column name). Valid values for mongo: collection (partitioned by collection name); collectionAndObjectId (partitioned by collection + primary key). Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleType Rule type. Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key); cols (partitioned by column name). Valid values for mongo: collection (partitioned by collection name); collectionAndObjectId (partitioned by collection + primary key). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Database name matching rule, please fill in the regular expression.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbPattern Database name matching rule, please fill in the regular expression.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbPattern() {
        return this.DbPattern;
    }

    /**
     * Set Database name matching rule, please fill in the regular expression.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbPattern Database name matching rule, please fill in the regular expression.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbPattern(String DbPattern) {
        this.DbPattern = DbPattern;
    }

    /**
     * Get Table name matching rule. If DatabaseType is mongodb, it matches the collection name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TablePattern Table name matching rule. If DatabaseType is mongodb, it matches the collection name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTablePattern() {
        return this.TablePattern;
    }

    /**
     * Set Table name matching rule. If DatabaseType is mongodb, it matches the collection name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param TablePattern Table name matching rule. If DatabaseType is mongodb, it matches the collection name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTablePattern(String TablePattern) {
        this.TablePattern = TablePattern;
    }

    /**
     * Get Column name. This field is required if RuleType is cols. The subscription task will use the value of this column to calculate the partition. Mongo does not partition by column, so there is no need to pass this field.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Columns Column name. This field is required if RuleType is cols. The subscription task will use the value of this column to calculate the partition. Mongo does not partition by column, so there is no need to pass this field.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Column name. This field is required if RuleType is cols. The subscription task will use the value of this column to calculate the partition. Mongo does not partition by column, so there is no need to pass this field.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Columns Column name. This field is required if RuleType is cols. The subscription task will use the value of this column to calculate the partition. Mongo does not partition by column, so there is no need to pass this field.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    public DistributeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeRule(DistributeRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.DbPattern != null) {
            this.DbPattern = new String(source.DbPattern);
        }
        if (source.TablePattern != null) {
            this.TablePattern = new String(source.TablePattern);
        }
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "DbPattern", this.DbPattern);
        this.setParamSimple(map, prefix + "TablePattern", this.TablePattern);
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);

    }
}

