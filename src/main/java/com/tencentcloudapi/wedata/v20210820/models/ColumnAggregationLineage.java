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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnAggregationLineage extends AbstractModel {

    /**
    * Table nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Parent Node ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * String Type Parent Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentSet")
    @Expose
    private String ParentSet;

    /**
    * String Type Child Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChildSet")
    @Expose
    private String ChildSet;

    /**
    * Column Information Collection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnInfoSet")
    @Expose
    private SimpleColumnInfo [] ColumnInfoSet;

    /**
     * Get Table nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Parent Node ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentId Parent Node ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent Node ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentId Parent Node ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Metadata Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetastoreType Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetastoreType Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
    }

    /**
     * Get String Type Parent Node Collection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentSet String Type Parent Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set String Type Parent Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentSet String Type Parent Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentSet(String ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get String Type Child Node Collection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChildSet String Type Child Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set String Type Child Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChildSet String Type Child Node Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChildSet(String ChildSet) {
        this.ChildSet = ChildSet;
    }

    /**
     * Get Column Information Collection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnInfoSet Column Information Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SimpleColumnInfo [] getColumnInfoSet() {
        return this.ColumnInfoSet;
    }

    /**
     * Set Column Information Collection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnInfoSet Column Information Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnInfoSet(SimpleColumnInfo [] ColumnInfoSet) {
        this.ColumnInfoSet = ColumnInfoSet;
    }

    public ColumnAggregationLineage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnAggregationLineage(ColumnAggregationLineage source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.ParentSet != null) {
            this.ParentSet = new String(source.ParentSet);
        }
        if (source.ChildSet != null) {
            this.ChildSet = new String(source.ChildSet);
        }
        if (source.ColumnInfoSet != null) {
            this.ColumnInfoSet = new SimpleColumnInfo[source.ColumnInfoSet.length];
            for (int i = 0; i < source.ColumnInfoSet.length; i++) {
                this.ColumnInfoSet[i] = new SimpleColumnInfo(source.ColumnInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "ParentSet", this.ParentSet);
        this.setParamSimple(map, prefix + "ChildSet", this.ChildSet);
        this.setParamArrayObj(map, prefix + "ColumnInfoSet.", this.ColumnInfoSet);

    }
}

