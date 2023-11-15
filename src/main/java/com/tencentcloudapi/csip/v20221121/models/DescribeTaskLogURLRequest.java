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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLogURLRequest extends AbstractModel {

    /**
    * Type of the task. `0`: Preview; `1`: Download
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * List of task report IDs
    */
    @SerializedName("ReportItemKeyList")
    @Expose
    private ReportItemKey [] ReportItemKeyList;

    /**
    * List of task IDs in the report
    */
    @SerializedName("ReportTaskIdList")
    @Expose
    private ReportTaskIdList [] ReportTaskIdList;

    /**
     * Get Type of the task. `0`: Preview; `1`: Download 
     * @return Type Type of the task. `0`: Preview; `1`: Download
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type of the task. `0`: Preview; `1`: Download
     * @param Type Type of the task. `0`: Preview; `1`: Download
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get List of task report IDs 
     * @return ReportItemKeyList List of task report IDs
     */
    public ReportItemKey [] getReportItemKeyList() {
        return this.ReportItemKeyList;
    }

    /**
     * Set List of task report IDs
     * @param ReportItemKeyList List of task report IDs
     */
    public void setReportItemKeyList(ReportItemKey [] ReportItemKeyList) {
        this.ReportItemKeyList = ReportItemKeyList;
    }

    /**
     * Get List of task IDs in the report 
     * @return ReportTaskIdList List of task IDs in the report
     */
    public ReportTaskIdList [] getReportTaskIdList() {
        return this.ReportTaskIdList;
    }

    /**
     * Set List of task IDs in the report
     * @param ReportTaskIdList List of task IDs in the report
     */
    public void setReportTaskIdList(ReportTaskIdList [] ReportTaskIdList) {
        this.ReportTaskIdList = ReportTaskIdList;
    }

    public DescribeTaskLogURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLogURLRequest(DescribeTaskLogURLRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ReportItemKeyList != null) {
            this.ReportItemKeyList = new ReportItemKey[source.ReportItemKeyList.length];
            for (int i = 0; i < source.ReportItemKeyList.length; i++) {
                this.ReportItemKeyList[i] = new ReportItemKey(source.ReportItemKeyList[i]);
            }
        }
        if (source.ReportTaskIdList != null) {
            this.ReportTaskIdList = new ReportTaskIdList[source.ReportTaskIdList.length];
            for (int i = 0; i < source.ReportTaskIdList.length; i++) {
                this.ReportTaskIdList[i] = new ReportTaskIdList(source.ReportTaskIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "ReportItemKeyList.", this.ReportItemKeyList);
        this.setParamArrayObj(map, prefix + "ReportTaskIdList.", this.ReportTaskIdList);

    }
}

