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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInternalTableRequest extends AbstractModel {

    /**
    * The basic table information.
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * The table fields.
    */
    @SerializedName("Columns")
    @Expose
    private TColumn [] Columns;

    /**
    * The table partitions.
    */
    @SerializedName("Partitions")
    @Expose
    private TPartition [] Partitions;

    /**
    * The table properties.
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
     * Get The basic table information. 
     * @return TableBaseInfo The basic table information.
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set The basic table information.
     * @param TableBaseInfo The basic table information.
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get The table fields. 
     * @return Columns The table fields.
     */
    public TColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set The table fields.
     * @param Columns The table fields.
     */
    public void setColumns(TColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get The table partitions. 
     * @return Partitions The table partitions.
     */
    public TPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set The table partitions.
     * @param Partitions The table partitions.
     */
    public void setPartitions(TPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get The table properties. 
     * @return Properties The table properties.
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set The table properties.
     * @param Properties The table properties.
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    public CreateInternalTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInternalTableRequest(CreateInternalTableRequest source) {
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.Columns != null) {
            this.Columns = new TColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new TColumn(source.Columns[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new TPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new TPartition(source.Partitions[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

