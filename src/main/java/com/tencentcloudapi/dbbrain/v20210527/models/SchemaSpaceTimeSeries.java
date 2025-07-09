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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchemaSpaceTimeSeries extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * Space metric value in a unit of time interval
    */
    @SerializedName("SeriesData")
    @Expose
    private MonitorMetricSeriesData SeriesData;

    /**
     * Get Database name 
     * @return TableSchema Database name
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set Database name
     * @param TableSchema Database name
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get Space metric value in a unit of time interval 
     * @return SeriesData Space metric value in a unit of time interval
     */
    public MonitorMetricSeriesData getSeriesData() {
        return this.SeriesData;
    }

    /**
     * Set Space metric value in a unit of time interval
     * @param SeriesData Space metric value in a unit of time interval
     */
    public void setSeriesData(MonitorMetricSeriesData SeriesData) {
        this.SeriesData = SeriesData;
    }

    public SchemaSpaceTimeSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaSpaceTimeSeries(SchemaSpaceTimeSeries source) {
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.SeriesData != null) {
            this.SeriesData = new MonitorMetricSeriesData(source.SeriesData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamObj(map, prefix + "SeriesData.", this.SeriesData);

    }
}

