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

public class DescribeLiveTranscodeDetailInfoResponse extends AbstractModel {

    /**
    * Statistics list.
    */
    @SerializedName("DataInfoList")
    @Expose
    private TranscodeDetailInfo [] DataInfoList;

    /**
    * Page number.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number.
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
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Statistics list. 
     * @return DataInfoList Statistics list.
     */
    public TranscodeDetailInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Statistics list.
     * @param DataInfoList Statistics list.
     */
    public void setDataInfoList(TranscodeDetailInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get Page number. 
     * @return PageNum Page number.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number.
     * @param PageNum Page number.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. 
     * @return PageSize Number of entries per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page.
     * @param PageSize Number of entries per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number. 
     * @return TotalNum Total number.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number.
     * @param TotalNum Total number.
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
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLiveTranscodeDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeDetailInfoResponse(DescribeLiveTranscodeDetailInfoResponse source) {
        if (source.DataInfoList != null) {
            this.DataInfoList = new TranscodeDetailInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new TranscodeDetailInfo(source.DataInfoList[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

