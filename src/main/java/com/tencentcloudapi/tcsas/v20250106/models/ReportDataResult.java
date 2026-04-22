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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportDataResult extends AbstractModel {

    /**
    * Base64-encoded result data
    */
    @SerializedName("DataResult")
    @Expose
    private String DataResult;

    /**
    * Executed SQL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecSql")
    @Expose
    private String ExecSql;

    /**
    * Execution time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Query index ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
     * Get Base64-encoded result data 
     * @return DataResult Base64-encoded result data
     */
    public String getDataResult() {
        return this.DataResult;
    }

    /**
     * Set Base64-encoded result data
     * @param DataResult Base64-encoded result data
     */
    public void setDataResult(String DataResult) {
        this.DataResult = DataResult;
    }

    /**
     * Get Executed SQL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecSql Executed SQL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecSql() {
        return this.ExecSql;
    }

    /**
     * Set Executed SQL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecSql Executed SQL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecSql(String ExecSql) {
        this.ExecSql = ExecSql;
    }

    /**
     * Get Execution time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecTime Execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecTime Execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Query index ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndexId Query index ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set Query index ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndexId Query index ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    public ReportDataResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportDataResult(ReportDataResult source) {
        if (source.DataResult != null) {
            this.DataResult = new String(source.DataResult);
        }
        if (source.ExecSql != null) {
            this.ExecSql = new String(source.ExecSql);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.IndexId != null) {
            this.IndexId = new String(source.IndexId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataResult", this.DataResult);
        this.setParamSimple(map, prefix + "ExecSql", this.ExecSql);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);

    }
}

