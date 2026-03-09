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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceResult extends AbstractModel {

    /**
    * Whether the operation is successful
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSourceId")
    @Expose
    private Long DataSourceId;

    /**
     * Get Whether the operation is successful
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Whether the operation is successful
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the operation is successful
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Whether the operation is successful
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Data source ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSourceId Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSourceId Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSourceId(Long DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    public DataSourceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceResult(DataSourceResult source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new Long(source.DataSourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);

    }
}

