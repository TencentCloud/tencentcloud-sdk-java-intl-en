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

public class TopicRule extends AbstractModel {

    /**
    * Topic name. For single-topic scenarios, all TopicNames should be the same.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic partition policy. When a topic is customized, the valid value is Random (random shipping); when centralizing shipping to a single topic is adopted, the valid values are AllInPartitionZero (ship all to partition 0), PartitionByTable (partition by table name), PartitionByTableAndKey (partition by table name and primary key), and PartitionByCols (partition by column).
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * Database name matching rule. For example: Regular (regular expression matching) and Default (remaining databases that do not meet any rule). The last item in the array should be Default.
    */
    @SerializedName("DbMatchMode")
    @Expose
    private String DbMatchMode;

    /**
    * Database name. It is valid when DbMatchMode=Regular.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name matching rule. For example: Regular (regular expression matching) and Default (remaining tables that do not meet any rule). The last item in the array should be Default.
    */
    @SerializedName("TableMatchMode")
    @Expose
    private String TableMatchMode;

    /**
    * Table name. It is valid when TableMatchMode is Regular.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * When partitioning by column, you need to select and configure column names. Multi-column selection is supported.
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
     * Get Topic name. For single-topic scenarios, all TopicNames should be the same. 
     * @return TopicName Topic name. For single-topic scenarios, all TopicNames should be the same.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name. For single-topic scenarios, all TopicNames should be the same.
     * @param TopicName Topic name. For single-topic scenarios, all TopicNames should be the same.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic partition policy. When a topic is customized, the valid value is Random (random shipping); when centralizing shipping to a single topic is adopted, the valid values are AllInPartitionZero (ship all to partition 0), PartitionByTable (partition by table name), PartitionByTableAndKey (partition by table name and primary key), and PartitionByCols (partition by column). 
     * @return PartitionType Topic partition policy. When a topic is customized, the valid value is Random (random shipping); when centralizing shipping to a single topic is adopted, the valid values are AllInPartitionZero (ship all to partition 0), PartitionByTable (partition by table name), PartitionByTableAndKey (partition by table name and primary key), and PartitionByCols (partition by column).
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set Topic partition policy. When a topic is customized, the valid value is Random (random shipping); when centralizing shipping to a single topic is adopted, the valid values are AllInPartitionZero (ship all to partition 0), PartitionByTable (partition by table name), PartitionByTableAndKey (partition by table name and primary key), and PartitionByCols (partition by column).
     * @param PartitionType Topic partition policy. When a topic is customized, the valid value is Random (random shipping); when centralizing shipping to a single topic is adopted, the valid values are AllInPartitionZero (ship all to partition 0), PartitionByTable (partition by table name), PartitionByTableAndKey (partition by table name and primary key), and PartitionByCols (partition by column).
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get Database name matching rule. For example: Regular (regular expression matching) and Default (remaining databases that do not meet any rule). The last item in the array should be Default. 
     * @return DbMatchMode Database name matching rule. For example: Regular (regular expression matching) and Default (remaining databases that do not meet any rule). The last item in the array should be Default.
     */
    public String getDbMatchMode() {
        return this.DbMatchMode;
    }

    /**
     * Set Database name matching rule. For example: Regular (regular expression matching) and Default (remaining databases that do not meet any rule). The last item in the array should be Default.
     * @param DbMatchMode Database name matching rule. For example: Regular (regular expression matching) and Default (remaining databases that do not meet any rule). The last item in the array should be Default.
     */
    public void setDbMatchMode(String DbMatchMode) {
        this.DbMatchMode = DbMatchMode;
    }

    /**
     * Get Database name. It is valid when DbMatchMode=Regular. 
     * @return DbName Database name. It is valid when DbMatchMode=Regular.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name. It is valid when DbMatchMode=Regular.
     * @param DbName Database name. It is valid when DbMatchMode=Regular.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name matching rule. For example: Regular (regular expression matching) and Default (remaining tables that do not meet any rule). The last item in the array should be Default. 
     * @return TableMatchMode Table name matching rule. For example: Regular (regular expression matching) and Default (remaining tables that do not meet any rule). The last item in the array should be Default.
     */
    public String getTableMatchMode() {
        return this.TableMatchMode;
    }

    /**
     * Set Table name matching rule. For example: Regular (regular expression matching) and Default (remaining tables that do not meet any rule). The last item in the array should be Default.
     * @param TableMatchMode Table name matching rule. For example: Regular (regular expression matching) and Default (remaining tables that do not meet any rule). The last item in the array should be Default.
     */
    public void setTableMatchMode(String TableMatchMode) {
        this.TableMatchMode = TableMatchMode;
    }

    /**
     * Get Table name. It is valid when TableMatchMode is Regular. 
     * @return TableName Table name. It is valid when TableMatchMode is Regular.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name. It is valid when TableMatchMode is Regular.
     * @param TableName Table name. It is valid when TableMatchMode is Regular.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get When partitioning by column, you need to select and configure column names. Multi-column selection is supported. 
     * @return Columns When partitioning by column, you need to select and configure column names. Multi-column selection is supported.
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set When partitioning by column, you need to select and configure column names. Multi-column selection is supported.
     * @param Columns When partitioning by column, you need to select and configure column names. Multi-column selection is supported.
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    public TopicRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicRule(TopicRule source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionType != null) {
            this.PartitionType = new String(source.PartitionType);
        }
        if (source.DbMatchMode != null) {
            this.DbMatchMode = new String(source.DbMatchMode);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableMatchMode != null) {
            this.TableMatchMode = new String(source.TableMatchMode);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
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
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "DbMatchMode", this.DbMatchMode);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableMatchMode", this.TableMatchMode);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);

    }
}

