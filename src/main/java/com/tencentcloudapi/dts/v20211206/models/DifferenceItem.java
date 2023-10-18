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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DifferenceItem extends AbstractModel {

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Chunk ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Chunk")
    @Expose
    private Long Chunk;

    /**
    * Source database value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * Target database value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
    * Index name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * First index key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LowerBoundary")
    @Expose
    private String LowerBoundary;

    /**
    * Last index key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpperBoundary")
    @Expose
    private String UpperBoundary;

    /**
    * Comparison time in ms
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * Completion time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Db Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Db Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Table Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Table Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Chunk ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Chunk Chunk ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getChunk() {
        return this.Chunk;
    }

    /**
     * Set Chunk ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Chunk Chunk ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChunk(Long Chunk) {
        this.Chunk = Chunk;
    }

    /**
     * Get Source database value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcItem Source database value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set Source database value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcItem Source database value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get Target database value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstItem Target database value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set Target database value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstItem Target database value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstItem(String DstItem) {
        this.DstItem = DstItem;
    }

    /**
     * Get Index name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndexName Index name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Index name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndexName Index name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get First index key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LowerBoundary First index key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLowerBoundary() {
        return this.LowerBoundary;
    }

    /**
     * Set First index key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LowerBoundary First index key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLowerBoundary(String LowerBoundary) {
        this.LowerBoundary = LowerBoundary;
    }

    /**
     * Get Last index key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpperBoundary Last index key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpperBoundary() {
        return this.UpperBoundary;
    }

    /**
     * Set Last index key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpperBoundary Last index key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpperBoundary(String UpperBoundary) {
        this.UpperBoundary = UpperBoundary;
    }

    /**
     * Get Comparison time in ms
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CostTime Comparison time in ms
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Comparison time in ms
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CostTime Comparison time in ms
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Completion time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FinishedAt Completion time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set Completion time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FinishedAt Completion time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    public DifferenceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceItem(DifferenceItem source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Chunk != null) {
            this.Chunk = new Long(source.Chunk);
        }
        if (source.SrcItem != null) {
            this.SrcItem = new String(source.SrcItem);
        }
        if (source.DstItem != null) {
            this.DstItem = new String(source.DstItem);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.LowerBoundary != null) {
            this.LowerBoundary = new String(source.LowerBoundary);
        }
        if (source.UpperBoundary != null) {
            this.UpperBoundary = new String(source.UpperBoundary);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Chunk", this.Chunk);
        this.setParamSimple(map, prefix + "SrcItem", this.SrcItem);
        this.setParamSimple(map, prefix + "DstItem", this.DstItem);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "LowerBoundary", this.LowerBoundary);
        this.setParamSimple(map, prefix + "UpperBoundary", this.UpperBoundary);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);

    }
}

