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
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic partitioning policy. If the topic sync policy is delivering data to multiple custom topics (`TopicType` = `Multi`), the value of this parameter is `Random` (deliver to a random partition). If the topic sync policy is delivering all data to a single topic (`TopicType` = `Single`), this parameter has three valid values: `AllInPartitionZero` (deliver all data to partition0), `PartitionByTable` (partition by table name), `PartitionByTableAndKey` (partition by table name and primary key).
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * Database name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
    */
    @SerializedName("DbMatchMode")
    @Expose
    private String DbMatchMode;

    /**
    * Database name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
    */
    @SerializedName("TableMatchMode")
    @Expose
    private String TableMatchMode;

    /**
    * Table name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic partitioning policy. If the topic sync policy is delivering data to multiple custom topics (`TopicType` = `Multi`), the value of this parameter is `Random` (deliver to a random partition). If the topic sync policy is delivering all data to a single topic (`TopicType` = `Single`), this parameter has three valid values: `AllInPartitionZero` (deliver all data to partition0), `PartitionByTable` (partition by table name), `PartitionByTableAndKey` (partition by table name and primary key). 
     * @return PartitionType Topic partitioning policy. If the topic sync policy is delivering data to multiple custom topics (`TopicType` = `Multi`), the value of this parameter is `Random` (deliver to a random partition). If the topic sync policy is delivering all data to a single topic (`TopicType` = `Single`), this parameter has three valid values: `AllInPartitionZero` (deliver all data to partition0), `PartitionByTable` (partition by table name), `PartitionByTableAndKey` (partition by table name and primary key).
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set Topic partitioning policy. If the topic sync policy is delivering data to multiple custom topics (`TopicType` = `Multi`), the value of this parameter is `Random` (deliver to a random partition). If the topic sync policy is delivering all data to a single topic (`TopicType` = `Single`), this parameter has three valid values: `AllInPartitionZero` (deliver all data to partition0), `PartitionByTable` (partition by table name), `PartitionByTableAndKey` (partition by table name and primary key).
     * @param PartitionType Topic partitioning policy. If the topic sync policy is delivering data to multiple custom topics (`TopicType` = `Multi`), the value of this parameter is `Random` (deliver to a random partition). If the topic sync policy is delivering all data to a single topic (`TopicType` = `Single`), this parameter has three valid values: `AllInPartitionZero` (deliver all data to partition0), `PartitionByTable` (partition by table name), `PartitionByTableAndKey` (partition by table name and primary key).
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get Database name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules. 
     * @return DbMatchMode Database name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
     */
    public String getDbMatchMode() {
        return this.DbMatchMode;
    }

    /**
     * Set Database name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
     * @param DbMatchMode Database name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
     */
    public void setDbMatchMode(String DbMatchMode) {
        this.DbMatchMode = DbMatchMode;
    }

    /**
     * Get Database name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`. 
     * @return DbName Database name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
     * @param DbName Database name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules. 
     * @return TableMatchMode Table name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
     */
    public String getTableMatchMode() {
        return this.TableMatchMode;
    }

    /**
     * Set Table name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
     * @param TableMatchMode Table name matching rule. This parameter takes effect only when `TopicType` is `Multi`. Valid values: `Regular` (match by regex), `Default` (default rule for the remaining databases that cannot be matched by regex). The default rule must be included in the array of matching rules.
     */
    public void setTableMatchMode(String TableMatchMode) {
        this.TableMatchMode = TableMatchMode;
    }

    /**
     * Get Table name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`. 
     * @return TableName Table name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
     * @param TableName Table name, which can only be matched by regex when `TopicType` is `Multi` and `DbMatchMode` is `Regular`.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
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

    }
}

