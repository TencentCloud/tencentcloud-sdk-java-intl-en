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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMsgRecordListRequest extends AbstractModel {

    /**
    * <p>Application ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <ul><li><strong>ChannelType</strong> : 0-all 2-experience page (Tencent Cloud) 3-web debugging page (Tencent Cloud) 4-experience page (phone number) 5-dialogue API connection 6-application evaluation 7-debug API 10000-WeChat service account 10001-WeChat Subscription Account 10002-WeCom app 10004-WeChat Customer Service 10005-WeChat mini program 10006-Tencent Yuanqi 10007-App Treasure 10009-WeCom intelligent bot 10014-WeCom intelligent bot 10011-LINE 10012-Telegram 10013-DingTalk chatbot 10016-Lark chatbot 30000-scheduled task 30001-trigger </li><li><strong>FeedbackType</strong> : feedback type, -1-all 0-not rated 1-like 2-dislike </li><li><strong>QueryType</strong> : retrieval type (take value as agreed by the platform), SessionId-sessionID Question-question Answer-reply Intent-intent User-user </li><li><strong>Query</strong> : filter criteria corresponding to QueryType </li><li><strong>CategoryId</strong> : category ID </li><li><strong>ReplyMethod</strong> : reply type 0-all reply types 1-reply to rejected questions 2-direct QA reply 3-review failure reply 4-knowledge polish reply 6-workflow reply 8-image understanding reply 9-search engine reply 10-large model direct reply 11-fallback response </li><li><strong>StartTime</strong> : start time, unix second-level timestamp </li><li><strong>EndTime</strong> : end time, unix second-level timestamp </li><li><strong>Cursor</strong> : cursor. For the previous page, take PrevCursor from the response; for the next page, take NextCursor from the response. </li><li><strong>Direction</strong> : direction. next: next page, prev: previous page</li><li><strong>CallResult</strong> : call result: 0-all / 1-success / 2-failure / 3-canceled by the user </li><li><strong>FailReason</strong> : failure reason 0-all 1-review failure 2-QPM limit reached 3-TPM limit reached 4-concurrency limit reached 5-system exception </li><li><strong>Intent</strong> : intent</li></ul>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Page number, starting from 0. If not passed, it is processed as 0.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page. Maximum value: 100. If not specified or set to 0, the default pagination size is used.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Sort condition. Supports sorting by CreateTime only</p>
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get <p>Application ID</p> 
     * @return AppId <p>Application ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID</p>
     * @param AppId <p>Application ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <ul><li><strong>ChannelType</strong> : 0-all 2-experience page (Tencent Cloud) 3-web debugging page (Tencent Cloud) 4-experience page (phone number) 5-dialogue API connection 6-application evaluation 7-debug API 10000-WeChat service account 10001-WeChat Subscription Account 10002-WeCom app 10004-WeChat Customer Service 10005-WeChat mini program 10006-Tencent Yuanqi 10007-App Treasure 10009-WeCom intelligent bot 10014-WeCom intelligent bot 10011-LINE 10012-Telegram 10013-DingTalk chatbot 10016-Lark chatbot 30000-scheduled task 30001-trigger </li><li><strong>FeedbackType</strong> : feedback type, -1-all 0-not rated 1-like 2-dislike </li><li><strong>QueryType</strong> : retrieval type (take value as agreed by the platform), SessionId-sessionID Question-question Answer-reply Intent-intent User-user </li><li><strong>Query</strong> : filter criteria corresponding to QueryType </li><li><strong>CategoryId</strong> : category ID </li><li><strong>ReplyMethod</strong> : reply type 0-all reply types 1-reply to rejected questions 2-direct QA reply 3-review failure reply 4-knowledge polish reply 6-workflow reply 8-image understanding reply 9-search engine reply 10-large model direct reply 11-fallback response </li><li><strong>StartTime</strong> : start time, unix second-level timestamp </li><li><strong>EndTime</strong> : end time, unix second-level timestamp </li><li><strong>Cursor</strong> : cursor. For the previous page, take PrevCursor from the response; for the next page, take NextCursor from the response. </li><li><strong>Direction</strong> : direction. next: next page, prev: previous page</li><li><strong>CallResult</strong> : call result: 0-all / 1-success / 2-failure / 3-canceled by the user </li><li><strong>FailReason</strong> : failure reason 0-all 1-review failure 2-QPM limit reached 3-TPM limit reached 4-concurrency limit reached 5-system exception </li><li><strong>Intent</strong> : intent</li></ul> 
     * @return FilterList <ul><li><strong>ChannelType</strong> : 0-all 2-experience page (Tencent Cloud) 3-web debugging page (Tencent Cloud) 4-experience page (phone number) 5-dialogue API connection 6-application evaluation 7-debug API 10000-WeChat service account 10001-WeChat Subscription Account 10002-WeCom app 10004-WeChat Customer Service 10005-WeChat mini program 10006-Tencent Yuanqi 10007-App Treasure 10009-WeCom intelligent bot 10014-WeCom intelligent bot 10011-LINE 10012-Telegram 10013-DingTalk chatbot 10016-Lark chatbot 30000-scheduled task 30001-trigger </li><li><strong>FeedbackType</strong> : feedback type, -1-all 0-not rated 1-like 2-dislike </li><li><strong>QueryType</strong> : retrieval type (take value as agreed by the platform), SessionId-sessionID Question-question Answer-reply Intent-intent User-user </li><li><strong>Query</strong> : filter criteria corresponding to QueryType </li><li><strong>CategoryId</strong> : category ID </li><li><strong>ReplyMethod</strong> : reply type 0-all reply types 1-reply to rejected questions 2-direct QA reply 3-review failure reply 4-knowledge polish reply 6-workflow reply 8-image understanding reply 9-search engine reply 10-large model direct reply 11-fallback response </li><li><strong>StartTime</strong> : start time, unix second-level timestamp </li><li><strong>EndTime</strong> : end time, unix second-level timestamp </li><li><strong>Cursor</strong> : cursor. For the previous page, take PrevCursor from the response; for the next page, take NextCursor from the response. </li><li><strong>Direction</strong> : direction. next: next page, prev: previous page</li><li><strong>CallResult</strong> : call result: 0-all / 1-success / 2-failure / 3-canceled by the user </li><li><strong>FailReason</strong> : failure reason 0-all 1-review failure 2-QPM limit reached 3-TPM limit reached 4-concurrency limit reached 5-system exception </li><li><strong>Intent</strong> : intent</li></ul>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <ul><li><strong>ChannelType</strong> : 0-all 2-experience page (Tencent Cloud) 3-web debugging page (Tencent Cloud) 4-experience page (phone number) 5-dialogue API connection 6-application evaluation 7-debug API 10000-WeChat service account 10001-WeChat Subscription Account 10002-WeCom app 10004-WeChat Customer Service 10005-WeChat mini program 10006-Tencent Yuanqi 10007-App Treasure 10009-WeCom intelligent bot 10014-WeCom intelligent bot 10011-LINE 10012-Telegram 10013-DingTalk chatbot 10016-Lark chatbot 30000-scheduled task 30001-trigger </li><li><strong>FeedbackType</strong> : feedback type, -1-all 0-not rated 1-like 2-dislike </li><li><strong>QueryType</strong> : retrieval type (take value as agreed by the platform), SessionId-sessionID Question-question Answer-reply Intent-intent User-user </li><li><strong>Query</strong> : filter criteria corresponding to QueryType </li><li><strong>CategoryId</strong> : category ID </li><li><strong>ReplyMethod</strong> : reply type 0-all reply types 1-reply to rejected questions 2-direct QA reply 3-review failure reply 4-knowledge polish reply 6-workflow reply 8-image understanding reply 9-search engine reply 10-large model direct reply 11-fallback response </li><li><strong>StartTime</strong> : start time, unix second-level timestamp </li><li><strong>EndTime</strong> : end time, unix second-level timestamp </li><li><strong>Cursor</strong> : cursor. For the previous page, take PrevCursor from the response; for the next page, take NextCursor from the response. </li><li><strong>Direction</strong> : direction. next: next page, prev: previous page</li><li><strong>CallResult</strong> : call result: 0-all / 1-success / 2-failure / 3-canceled by the user </li><li><strong>FailReason</strong> : failure reason 0-all 1-review failure 2-QPM limit reached 3-TPM limit reached 4-concurrency limit reached 5-system exception </li><li><strong>Intent</strong> : intent</li></ul>
     * @param FilterList <ul><li><strong>ChannelType</strong> : 0-all 2-experience page (Tencent Cloud) 3-web debugging page (Tencent Cloud) 4-experience page (phone number) 5-dialogue API connection 6-application evaluation 7-debug API 10000-WeChat service account 10001-WeChat Subscription Account 10002-WeCom app 10004-WeChat Customer Service 10005-WeChat mini program 10006-Tencent Yuanqi 10007-App Treasure 10009-WeCom intelligent bot 10014-WeCom intelligent bot 10011-LINE 10012-Telegram 10013-DingTalk chatbot 10016-Lark chatbot 30000-scheduled task 30001-trigger </li><li><strong>FeedbackType</strong> : feedback type, -1-all 0-not rated 1-like 2-dislike </li><li><strong>QueryType</strong> : retrieval type (take value as agreed by the platform), SessionId-sessionID Question-question Answer-reply Intent-intent User-user </li><li><strong>Query</strong> : filter criteria corresponding to QueryType </li><li><strong>CategoryId</strong> : category ID </li><li><strong>ReplyMethod</strong> : reply type 0-all reply types 1-reply to rejected questions 2-direct QA reply 3-review failure reply 4-knowledge polish reply 6-workflow reply 8-image understanding reply 9-search engine reply 10-large model direct reply 11-fallback response </li><li><strong>StartTime</strong> : start time, unix second-level timestamp </li><li><strong>EndTime</strong> : end time, unix second-level timestamp </li><li><strong>Cursor</strong> : cursor. For the previous page, take PrevCursor from the response; for the next page, take NextCursor from the response. </li><li><strong>Direction</strong> : direction. next: next page, prev: previous page</li><li><strong>CallResult</strong> : call result: 0-all / 1-success / 2-failure / 3-canceled by the user </li><li><strong>FailReason</strong> : failure reason 0-all 1-review failure 2-QPM limit reached 3-TPM limit reached 4-concurrency limit reached 5-system exception </li><li><strong>Intent</strong> : intent</li></ul>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Page number, starting from 0. If not passed, it is processed as 0.</p> 
     * @return PageNumber <p>Page number, starting from 0. If not passed, it is processed as 0.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number, starting from 0. If not passed, it is processed as 0.</p>
     * @param PageNumber <p>Page number, starting from 0. If not passed, it is processed as 0.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page. Maximum value: 100. If not specified or set to 0, the default pagination size is used.</p> 
     * @return PageSize <p>Number of items per page. Maximum value: 100. If not specified or set to 0, the default pagination size is used.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page. Maximum value: 100. If not specified or set to 0, the default pagination size is used.</p>
     * @param PageSize <p>Number of items per page. Maximum value: 100. If not specified or set to 0, the default pagination size is used.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Sort condition. Supports sorting by CreateTime only</p> 
     * @return Sort <p>Sort condition. Supports sorting by CreateTime only</p>
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Sort condition. Supports sorting by CreateTime only</p>
     * @param Sort <p>Sort condition. Supports sorting by CreateTime only</p>
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    public DescribeMsgRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgRecordListRequest(DescribeMsgRecordListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

