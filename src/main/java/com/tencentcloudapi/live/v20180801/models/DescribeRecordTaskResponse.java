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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordTaskResponse extends AbstractModel {

    /**
    * Page token: When the request does not return all data, this field indicates the token of the next record. When this field is empty, it means there is no more data.
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * List of recording tasks. When this field is empty, it means all data has been returned.
    */
    @SerializedName("TaskList")
    @Expose
    private RecordTask [] TaskList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Page token: When the request does not return all data, this field indicates the token of the next record. When this field is empty, it means there is no more data. 
     * @return ScrollToken Page token: When the request does not return all data, this field indicates the token of the next record. When this field is empty, it means there is no more data.
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set Page token: When the request does not return all data, this field indicates the token of the next record. When this field is empty, it means there is no more data.
     * @param ScrollToken Page token: When the request does not return all data, this field indicates the token of the next record. When this field is empty, it means there is no more data.
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get List of recording tasks. When this field is empty, it means all data has been returned. 
     * @return TaskList List of recording tasks. When this field is empty, it means all data has been returned.
     */
    public RecordTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set List of recording tasks. When this field is empty, it means all data has been returned.
     * @param TaskList List of recording tasks. When this field is empty, it means all data has been returned.
     */
    public void setTaskList(RecordTask [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRecordTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordTaskResponse(DescribeRecordTaskResponse source) {
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.TaskList != null) {
            this.TaskList = new RecordTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new RecordTask(source.TaskList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

