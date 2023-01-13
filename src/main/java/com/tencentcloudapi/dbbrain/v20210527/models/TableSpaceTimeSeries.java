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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableSpaceTimeSeries extends AbstractModel{

    /**
    * Table name.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Database name.
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * Database table storage engine.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Space metric value in a unit of time interval
    */
    @SerializedName("SeriesData")
    @Expose
    private MonitorFloatMetricSeriesData SeriesData;

    /**
     * Get Table name. 
     * @return TableName Table name.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name.
     * @param TableName Table name.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

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
     * Get Database table storage engine. 
     * @return Engine Database table storage engine.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Database table storage engine.
     * @param Engine Database table storage engine.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Space metric value in a unit of time interval 
     * @return SeriesData Space metric value in a unit of time interval
     */
    public MonitorFloatMetricSeriesData getSeriesData() {
        return this.SeriesData;
    }

    /**
     * Set Space metric value in a unit of time interval
     * @param SeriesData Space metric value in a unit of time interval
     */
    public void setSeriesData(MonitorFloatMetricSeriesData SeriesData) {
        this.SeriesData = SeriesData;
    }

    public TableSpaceTimeSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableSpaceTimeSeries(TableSpaceTimeSeries source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.SeriesData != null) {
            this.SeriesData = new MonitorFloatMetricSeriesData(source.SeriesData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamObj(map, prefix + "SeriesData.", this.SeriesData);

    }
}

