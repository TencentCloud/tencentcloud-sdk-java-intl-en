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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncSearchResultRequest extends AbstractModel{

    /**
    * Offline search task ID
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

    /**
    * Logset ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Number of logs returned in a single call. Default value: 20. Maximum value: 500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Offline search task ID 
     * @return AsyncSearchTaskId Offline search task ID
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set Offline search task ID
     * @param AsyncSearchTaskId Offline search task ID
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    /**
     * Get Logset ID 
     * @return TopicId Logset ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Logset ID
     * @param TopicId Logset ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get This field is used to load more logs. Pass through the last `Context` value returned to get more log content. 
     * @return Context This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
     * @param Context This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Number of logs returned in a single call. Default value: 20. Maximum value: 500 
     * @return Limit Number of logs returned in a single call. Default value: 20. Maximum value: 500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of logs returned in a single call. Default value: 20. Maximum value: 500
     * @param Limit Number of logs returned in a single call. Default value: 20. Maximum value: 500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAsyncSearchResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncSearchResultRequest(DescribeAsyncSearchResultRequest source) {
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

