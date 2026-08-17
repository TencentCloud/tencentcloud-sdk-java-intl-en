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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogInstanceListRequest extends AbstractModel {

    /**
    * <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Size of the output task list per page.</p><ul><li>Value ranges from 1 to 100.</li><li>Default value: 20.</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pagination offset. Default value: 0. Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Set the log filtering field to filter and return logs that meet a specified condition.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write logs.</li><li>read: Read logs.</li><li>all: Read/write logs.</li></ul>
    */
    @SerializedName("LogSubType")
    @Expose
    private String LogSubType;

    /**
    * <p>Log switch.</p><p>Enumeration value:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
    */
    @SerializedName("LogSwitch")
    @Expose
    private String LogSwitch;

    /**
     * Get <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul> 
     * @return LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     * @param LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Size of the output task list per page.</p><ul><li>Value ranges from 1 to 100.</li><li>Default value: 20.</li></ul> 
     * @return Limit <p>Size of the output task list per page.</p><ul><li>Value ranges from 1 to 100.</li><li>Default value: 20.</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Size of the output task list per page.</p><ul><li>Value ranges from 1 to 100.</li><li>Default value: 20.</li></ul>
     * @param Limit <p>Size of the output task list per page.</p><ul><li>Value ranges from 1 to 100.</li><li>Default value: 20.</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pagination offset. Default value: 0. Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</p> 
     * @return Offset <p>Pagination offset. Default value: 0. Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset. Default value: 0. Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     * @param Offset <p>Pagination offset. Default value: 0. Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Set the log filtering field to filter and return logs that meet a specified condition.</p> 
     * @return Filters <p>Set the log filtering field to filter and return logs that meet a specified condition.</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Set the log filtering field to filter and return logs that meet a specified condition.</p>
     * @param Filters <p>Set the log filtering field to filter and return logs that meet a specified condition.</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write logs.</li><li>read: Read logs.</li><li>all: Read/write logs.</li></ul> 
     * @return LogSubType <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write logs.</li><li>read: Read logs.</li><li>all: Read/write logs.</li></ul>
     */
    public String getLogSubType() {
        return this.LogSubType;
    }

    /**
     * Set <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write logs.</li><li>read: Read logs.</li><li>all: Read/write logs.</li></ul>
     * @param LogSubType <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write logs.</li><li>read: Read logs.</li><li>all: Read/write logs.</li></ul>
     */
    public void setLogSubType(String LogSubType) {
        this.LogSubType = LogSubType;
    }

    /**
     * Get <p>Log switch.</p><p>Enumeration value:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p> 
     * @return LogSwitch <p>Log switch.</p><p>Enumeration value:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
     */
    public String getLogSwitch() {
        return this.LogSwitch;
    }

    /**
     * Set <p>Log switch.</p><p>Enumeration value:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
     * @param LogSwitch <p>Log switch.</p><p>Enumeration value:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
     */
    public void setLogSwitch(String LogSwitch) {
        this.LogSwitch = LogSwitch;
    }

    public DescribeLogInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogInstanceListRequest(DescribeLogInstanceListRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.LogSubType != null) {
            this.LogSubType = new String(source.LogSubType);
        }
        if (source.LogSwitch != null) {
            this.LogSwitch = new String(source.LogSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "LogSubType", this.LogSubType);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);

    }
}

