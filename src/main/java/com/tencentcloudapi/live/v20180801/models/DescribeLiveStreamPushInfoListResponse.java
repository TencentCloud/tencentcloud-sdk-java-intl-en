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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamPushInfoListResponse extends AbstractModel{

    /**
    * Live stream statistics list.
    */
    @SerializedName("DataInfoList")
    @Expose
    private PushDataInfo [] DataInfoList;

    /**
    * Total number of live streams.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Total number of pages.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Page number where the current data resides.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of live streams per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Live stream statistics list. 
     * @return DataInfoList Live stream statistics list.
     */
    public PushDataInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Live stream statistics list.
     * @param DataInfoList Live stream statistics list.
     */
    public void setDataInfoList(PushDataInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get Total number of live streams. 
     * @return TotalNum Total number of live streams.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of live streams.
     * @param TotalNum Total number of live streams.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get Total number of pages. 
     * @return TotalPage Total number of pages.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total number of pages.
     * @param TotalPage Total number of pages.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Page number where the current data resides. 
     * @return PageNum Page number where the current data resides.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number where the current data resides.
     * @param PageNum Page number where the current data resides.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of live streams per page. 
     * @return PageSize Number of live streams per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of live streams per page.
     * @param PageSize Number of live streams per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

