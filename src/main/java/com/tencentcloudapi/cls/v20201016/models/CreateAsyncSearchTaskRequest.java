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

public class CreateAsyncSearchTaskRequest extends AbstractModel{

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID. Currently, only log topics whose `StorageType` is `cold` are supported.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Query statement. Maximum length: 1024
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Start time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Log scan order. Valid values: `asc`: ascending; `desc`: descending. Default value: desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic ID. Currently, only log topics whose `StorageType` is `cold` are supported. 
     * @return TopicId Log topic ID. Currently, only log topics whose `StorageType` is `cold` are supported.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID. Currently, only log topics whose `StorageType` is `cold` are supported.
     * @param TopicId Log topic ID. Currently, only log topics whose `StorageType` is `cold` are supported.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Query statement. Maximum length: 1024 
     * @return Query Query statement. Maximum length: 1024
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement. Maximum length: 1024
     * @param Query Query statement. Maximum length: 1024
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Start time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Log scan order. Valid values: `asc`: ascending; `desc`: descending. Default value: desc 
     * @return Sort Log scan order. Valid values: `asc`: ascending; `desc`: descending. Default value: desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Log scan order. Valid values: `asc`: ascending; `desc`: descending. Default value: desc
     * @param Sort Log scan order. Valid values: `asc`: ascending; `desc`: descending. Default value: desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public CreateAsyncSearchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAsyncSearchTaskRequest(CreateAsyncSearchTaskRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

