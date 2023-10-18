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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchemaSpaceData extends AbstractModel {

    /**
    * Database name.
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * Data space in MB.
    */
    @SerializedName("DataLength")
    @Expose
    private Float DataLength;

    /**
    * Index space in MB.
    */
    @SerializedName("IndexLength")
    @Expose
    private Float IndexLength;

    /**
    * Fragmented space in MB.
    */
    @SerializedName("DataFree")
    @Expose
    private Float DataFree;

    /**
    * Total space usage in MB.
    */
    @SerializedName("TotalLength")
    @Expose
    private Float TotalLength;

    /**
    * Fragmented rate (%).
    */
    @SerializedName("FragRatio")
    @Expose
    private Float FragRatio;

    /**
    * Number of rows.
    */
    @SerializedName("TableRows")
    @Expose
    private Long TableRows;

    /**
    * The total size of the independent physical files corresponding to all the database tables (MB).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("PhysicalFileSize")
    @Expose
    private Float PhysicalFileSize;

    /**
     * Get Database name. 
     * @return TableSchema Database name.
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set Database name.
     * @param TableSchema Database name.
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get Data space in MB. 
     * @return DataLength Data space in MB.
     */
    public Float getDataLength() {
        return this.DataLength;
    }

    /**
     * Set Data space in MB.
     * @param DataLength Data space in MB.
     */
    public void setDataLength(Float DataLength) {
        this.DataLength = DataLength;
    }

    /**
     * Get Index space in MB. 
     * @return IndexLength Index space in MB.
     */
    public Float getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set Index space in MB.
     * @param IndexLength Index space in MB.
     */
    public void setIndexLength(Float IndexLength) {
        this.IndexLength = IndexLength;
    }

    /**
     * Get Fragmented space in MB. 
     * @return DataFree Fragmented space in MB.
     */
    public Float getDataFree() {
        return this.DataFree;
    }

    /**
     * Set Fragmented space in MB.
     * @param DataFree Fragmented space in MB.
     */
    public void setDataFree(Float DataFree) {
        this.DataFree = DataFree;
    }

    /**
     * Get Total space usage in MB. 
     * @return TotalLength Total space usage in MB.
     */
    public Float getTotalLength() {
        return this.TotalLength;
    }

    /**
     * Set Total space usage in MB.
     * @param TotalLength Total space usage in MB.
     */
    public void setTotalLength(Float TotalLength) {
        this.TotalLength = TotalLength;
    }

    /**
     * Get Fragmented rate (%). 
     * @return FragRatio Fragmented rate (%).
     */
    public Float getFragRatio() {
        return this.FragRatio;
    }

    /**
     * Set Fragmented rate (%).
     * @param FragRatio Fragmented rate (%).
     */
    public void setFragRatio(Float FragRatio) {
        this.FragRatio = FragRatio;
    }

    /**
     * Get Number of rows. 
     * @return TableRows Number of rows.
     */
    public Long getTableRows() {
        return this.TableRows;
    }

    /**
     * Set Number of rows.
     * @param TableRows Number of rows.
     */
    public void setTableRows(Long TableRows) {
        this.TableRows = TableRows;
    }

    /**
     * Get The total size of the independent physical files corresponding to all the database tables (MB).
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return PhysicalFileSize The total size of the independent physical files corresponding to all the database tables (MB).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Float getPhysicalFileSize() {
        return this.PhysicalFileSize;
    }

    /**
     * Set The total size of the independent physical files corresponding to all the database tables (MB).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param PhysicalFileSize The total size of the independent physical files corresponding to all the database tables (MB).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setPhysicalFileSize(Float PhysicalFileSize) {
        this.PhysicalFileSize = PhysicalFileSize;
    }

    public SchemaSpaceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaSpaceData(SchemaSpaceData source) {
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.DataLength != null) {
            this.DataLength = new Float(source.DataLength);
        }
        if (source.IndexLength != null) {
            this.IndexLength = new Float(source.IndexLength);
        }
        if (source.DataFree != null) {
            this.DataFree = new Float(source.DataFree);
        }
        if (source.TotalLength != null) {
            this.TotalLength = new Float(source.TotalLength);
        }
        if (source.FragRatio != null) {
            this.FragRatio = new Float(source.FragRatio);
        }
        if (source.TableRows != null) {
            this.TableRows = new Long(source.TableRows);
        }
        if (source.PhysicalFileSize != null) {
            this.PhysicalFileSize = new Float(source.PhysicalFileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "DataLength", this.DataLength);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);
        this.setParamSimple(map, prefix + "DataFree", this.DataFree);
        this.setParamSimple(map, prefix + "TotalLength", this.TotalLength);
        this.setParamSimple(map, prefix + "FragRatio", this.FragRatio);
        this.setParamSimple(map, prefix + "TableRows", this.TableRows);
        this.setParamSimple(map, prefix + "PhysicalFileSize", this.PhysicalFileSize);

    }
}

