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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVideoDownloadTaskRequest extends AbstractModel {

    /**
    * Device name. Fuzzy search supported.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Channel name, used for fuzzy search
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Task status (0: preparing, 1: executing, 2: completed, 3: failure)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Sorting rule (only StartTime is supported. A hyphen (-) indicates descending order, e.g., -StartTime)
    */
    @SerializedName("SortRule")
    @Expose
    private String SortRule;

    /**
    * Whether the response carries the preview address (0: without; 1: carry)
    */
    @SerializedName("WithPreviewUrl")
    @Expose
    private Long WithPreviewUrl;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Download task ID
    */
    @SerializedName("DownloadTaskId")
    @Expose
    private String DownloadTaskId;

    /**
    * URL expiration time (in seconds), with a maximum value of 86400 seconds (1 day).
    */
    @SerializedName("UrlExpires")
    @Expose
    private Long UrlExpires;

    /**
    * Task date. Defaults to the current day.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get Device name. Fuzzy search supported. 
     * @return DeviceName Device name. Fuzzy search supported.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name. Fuzzy search supported.
     * @param DeviceName Device name. Fuzzy search supported.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Channel name, used for fuzzy search 
     * @return ChannelName Channel name, used for fuzzy search
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Channel name, used for fuzzy search
     * @param ChannelName Channel name, used for fuzzy search
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Task status (0: preparing, 1: executing, 2: completed, 3: failure) 
     * @return Status Task status (0: preparing, 1: executing, 2: completed, 3: failure)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status (0: preparing, 1: executing, 2: completed, 3: failure)
     * @param Status Task status (0: preparing, 1: executing, 2: completed, 3: failure)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Sorting rule (only StartTime is supported. A hyphen (-) indicates descending order, e.g., -StartTime) 
     * @return SortRule Sorting rule (only StartTime is supported. A hyphen (-) indicates descending order, e.g., -StartTime)
     */
    public String getSortRule() {
        return this.SortRule;
    }

    /**
     * Set Sorting rule (only StartTime is supported. A hyphen (-) indicates descending order, e.g., -StartTime)
     * @param SortRule Sorting rule (only StartTime is supported. A hyphen (-) indicates descending order, e.g., -StartTime)
     */
    public void setSortRule(String SortRule) {
        this.SortRule = SortRule;
    }

    /**
     * Get Whether the response carries the preview address (0: without; 1: carry) 
     * @return WithPreviewUrl Whether the response carries the preview address (0: without; 1: carry)
     */
    public Long getWithPreviewUrl() {
        return this.WithPreviewUrl;
    }

    /**
     * Set Whether the response carries the preview address (0: without; 1: carry)
     * @param WithPreviewUrl Whether the response carries the preview address (0: without; 1: carry)
     */
    public void setWithPreviewUrl(Long WithPreviewUrl) {
        this.WithPreviewUrl = WithPreviewUrl;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Download task ID 
     * @return DownloadTaskId Download task ID
     */
    public String getDownloadTaskId() {
        return this.DownloadTaskId;
    }

    /**
     * Set Download task ID
     * @param DownloadTaskId Download task ID
     */
    public void setDownloadTaskId(String DownloadTaskId) {
        this.DownloadTaskId = DownloadTaskId;
    }

    /**
     * Get URL expiration time (in seconds), with a maximum value of 86400 seconds (1 day). 
     * @return UrlExpires URL expiration time (in seconds), with a maximum value of 86400 seconds (1 day).
     */
    public Long getUrlExpires() {
        return this.UrlExpires;
    }

    /**
     * Set URL expiration time (in seconds), with a maximum value of 86400 seconds (1 day).
     * @param UrlExpires URL expiration time (in seconds), with a maximum value of 86400 seconds (1 day).
     */
    public void setUrlExpires(Long UrlExpires) {
        this.UrlExpires = UrlExpires;
    }

    /**
     * Get Task date. Defaults to the current day. 
     * @return Date Task date. Defaults to the current day.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Task date. Defaults to the current day.
     * @param Date Task date. Defaults to the current day.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public ListVideoDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoDownloadTaskRequest(ListVideoDownloadTaskRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SortRule != null) {
            this.SortRule = new String(source.SortRule);
        }
        if (source.WithPreviewUrl != null) {
            this.WithPreviewUrl = new Long(source.WithPreviewUrl);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DownloadTaskId != null) {
            this.DownloadTaskId = new String(source.DownloadTaskId);
        }
        if (source.UrlExpires != null) {
            this.UrlExpires = new Long(source.UrlExpires);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SortRule", this.SortRule);
        this.setParamSimple(map, prefix + "WithPreviewUrl", this.WithPreviewUrl);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DownloadTaskId", this.DownloadTaskId);
        this.setParamSimple(map, prefix + "UrlExpires", this.UrlExpires);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

