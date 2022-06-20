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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadL7LogsResponse extends AbstractModel{

    /**
    * Layer-7 offline log data
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private L7OfflineLog [] Data;

    /**
    * Page size
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Total number of pages
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * Total number of entries
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Layer-7 offline log data
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Data Layer-7 offline log data
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public L7OfflineLog [] getData() {
        return this.Data;
    }

    /**
     * Set Layer-7 offline log data
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Data Layer-7 offline log data
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setData(L7OfflineLog [] Data) {
        this.Data = Data;
    }

    /**
     * Get Page size
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PageSize Page size
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PageSize Page size
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PageNo Page number
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PageNo Page number
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Total number of pages
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Pages Total number of pages
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Total number of pages
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Pages Total number of pages
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get Total number of entries
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TotalSize Total number of entries
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total number of entries
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TotalSize Total number of entries
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
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

    public DownloadL7LogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadL7LogsResponse(DownloadL7LogsResponse source) {
        if (source.Data != null) {
            this.Data = new L7OfflineLog[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new L7OfflineLog(source.Data[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

