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

public class DescribeTableInfoListRequest extends AbstractModel {

    /**
    * Table name
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * If it is hive write rpc, if it is other types do not transmit
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * Database source type
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
     * Get Table name 
     * @return Filters Table name
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Table name
     * @param Filters Table name
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get If it is hive write rpc, if it is other types do not transmit 
     * @return ConnectionType If it is hive write rpc, if it is other types do not transmit
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set If it is hive write rpc, if it is other types do not transmit
     * @param ConnectionType If it is hive write rpc, if it is other types do not transmit
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get Database source type 
     * @return Catalog Database source type
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Database source type
     * @param Catalog Database source type
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    public DescribeTableInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableInfoListRequest(DescribeTableInfoListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);

    }
}

