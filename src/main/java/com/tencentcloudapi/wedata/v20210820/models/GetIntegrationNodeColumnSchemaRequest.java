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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIntegrationNodeColumnSchemaRequest extends AbstractModel {

    /**
    * Field Example (JSON Format)
    */
    @SerializedName("ColumnContent")
    @Expose
    private String ColumnContent;

    /**
    * Data Source Type MYSQL|HIVE|KAFKA|ES|MONGODB|REST_API|SYBASE|TIDB|DORIS|DM|
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get Field Example (JSON Format) 
     * @return ColumnContent Field Example (JSON Format)
     */
    public String getColumnContent() {
        return this.ColumnContent;
    }

    /**
     * Set Field Example (JSON Format)
     * @param ColumnContent Field Example (JSON Format)
     */
    public void setColumnContent(String ColumnContent) {
        this.ColumnContent = ColumnContent;
    }

    /**
     * Get Data Source Type MYSQL|HIVE|KAFKA|ES|MONGODB|REST_API|SYBASE|TIDB|DORIS|DM| 
     * @return DatasourceType Data Source Type MYSQL|HIVE|KAFKA|ES|MONGODB|REST_API|SYBASE|TIDB|DORIS|DM|
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set Data Source Type MYSQL|HIVE|KAFKA|ES|MONGODB|REST_API|SYBASE|TIDB|DORIS|DM|
     * @param DatasourceType Data Source Type MYSQL|HIVE|KAFKA|ES|MONGODB|REST_API|SYBASE|TIDB|DORIS|DM|
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public GetIntegrationNodeColumnSchemaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIntegrationNodeColumnSchemaRequest(GetIntegrationNodeColumnSchemaRequest source) {
        if (source.ColumnContent != null) {
            this.ColumnContent = new String(source.ColumnContent);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnContent", this.ColumnContent);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

