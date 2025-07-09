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

public class DescribeTopClientIpSumInfoListResponse extends AbstractModel {

    /**
    * Page number. Value range: [1,1000]. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page. Value range: [1,1000]. Default value: 20.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sorting metric. Valid values: "TotalRequest", "FailedRequest", "TotalFlux".
    */
    @SerializedName("OrderParam")
    @Expose
    private String OrderParam;

    /**
    * Total number of results.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Total number of result pages.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Data content.
    */
    @SerializedName("DataInfoList")
    @Expose
    private ClientIpPlaySumInfo [] DataInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Page number. Value range: [1,1000]. Default value: 1. 
     * @return PageNum Page number. Value range: [1,1000]. Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number. Value range: [1,1000]. Default value: 1.
     * @param PageNum Page number. Value range: [1,1000]. Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page. Value range: [1,1000]. Default value: 20. 
     * @return PageSize Number of entries per page. Value range: [1,1000]. Default value: 20.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: [1,1000]. Default value: 20.
     * @param PageSize Number of entries per page. Value range: [1,1000]. Default value: 20.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sorting metric. Valid values: "TotalRequest", "FailedRequest", "TotalFlux". 
     * @return OrderParam Sorting metric. Valid values: "TotalRequest", "FailedRequest", "TotalFlux".
     */
    public String getOrderParam() {
        return this.OrderParam;
    }

    /**
     * Set Sorting metric. Valid values: "TotalRequest", "FailedRequest", "TotalFlux".
     * @param OrderParam Sorting metric. Valid values: "TotalRequest", "FailedRequest", "TotalFlux".
     */
    public void setOrderParam(String OrderParam) {
        this.OrderParam = OrderParam;
    }

    /**
     * Get Total number of results. 
     * @return TotalNum Total number of results.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of results.
     * @param TotalNum Total number of results.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get Total number of result pages. 
     * @return TotalPage Total number of result pages.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total number of result pages.
     * @param TotalPage Total number of result pages.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Data content. 
     * @return DataInfoList Data content.
     */
    public ClientIpPlaySumInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Data content.
     * @param DataInfoList Data content.
     */
    public void setDataInfoList(ClientIpPlaySumInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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

    public DescribeTopClientIpSumInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopClientIpSumInfoListResponse(DescribeTopClientIpSumInfoListResponse source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderParam != null) {
            this.OrderParam = new String(source.OrderParam);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.DataInfoList != null) {
            this.DataInfoList = new ClientIpPlaySumInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new ClientIpPlaySumInfo(source.DataInfoList[i]);
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
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderParam", this.OrderParam);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

