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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanResultListRequest extends AbstractModel{

    /**
    * Application ID, which is obtained when you create an application in the [GME console](https://console.cloud.tencent.com/gamegme).
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * List of IDs of the tasks to be queried. Up to 100 entries can be added in the ID list.
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * Number of task results to be returned. Default value: 10. Maximum value: 500. This parameter will be ignored for large file tasks where all results will be returned.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Application ID, which is obtained when you create an application in the [GME console](https://console.cloud.tencent.com/gamegme). 
     * @return BizId Application ID, which is obtained when you create an application in the [GME console](https://console.cloud.tencent.com/gamegme).
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID, which is obtained when you create an application in the [GME console](https://console.cloud.tencent.com/gamegme).
     * @param BizId Application ID, which is obtained when you create an application in the [GME console](https://console.cloud.tencent.com/gamegme).
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get List of IDs of the tasks to be queried. Up to 100 entries can be added in the ID list. 
     * @return TaskIdList List of IDs of the tasks to be queried. Up to 100 entries can be added in the ID list.
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set List of IDs of the tasks to be queried. Up to 100 entries can be added in the ID list.
     * @param TaskIdList List of IDs of the tasks to be queried. Up to 100 entries can be added in the ID list.
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Number of task results to be returned. Default value: 10. Maximum value: 500. This parameter will be ignored for large file tasks where all results will be returned. 
     * @return Limit Number of task results to be returned. Default value: 10. Maximum value: 500. This parameter will be ignored for large file tasks where all results will be returned.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of task results to be returned. Default value: 10. Maximum value: 500. This parameter will be ignored for large file tasks where all results will be returned.
     * @param Limit Number of task results to be returned. Default value: 10. Maximum value: 500. This parameter will be ignored for large file tasks where all results will be returned.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeScanResultListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanResultListRequest(DescribeScanResultListRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

