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

public class DescribeProIspPlaySumInfoListResponse extends AbstractModel{

    /**
    * Total traffic.
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
    * Total number of requests.
    */
    @SerializedName("TotalRequest")
    @Expose
    private Long TotalRequest;

    /**
    * Statistics type.
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * Number of results per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Total number of results.
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
    * Aggregated data list by district, ISP, or country/region.
    */
    @SerializedName("DataInfoList")
    @Expose
    private ProIspPlaySumInfo [] DataInfoList;

    /**
    * Download speed in MB/s. Calculation method: total traffic/total duration.
    */
    @SerializedName("AvgFluxPerSecond")
    @Expose
    private Float AvgFluxPerSecond;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total traffic. 
     * @return TotalFlux Total traffic.
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set Total traffic.
     * @param TotalFlux Total traffic.
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * Get Total number of requests. 
     * @return TotalRequest Total number of requests.
     */
    public Long getTotalRequest() {
        return this.TotalRequest;
    }

    /**
     * Set Total number of requests.
     * @param TotalRequest Total number of requests.
     */
    public void setTotalRequest(Long TotalRequest) {
        this.TotalRequest = TotalRequest;
    }

    /**
     * Get Statistics type. 
     * @return StatType Statistics type.
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set Statistics type.
     * @param StatType Statistics type.
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get Number of results per page. 
     * @return PageSize Number of results per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of results per page.
     * @param PageSize Number of results per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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
     * Get Aggregated data list by district, ISP, or country/region. 
     * @return DataInfoList Aggregated data list by district, ISP, or country/region.
     */
    public ProIspPlaySumInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Aggregated data list by district, ISP, or country/region.
     * @param DataInfoList Aggregated data list by district, ISP, or country/region.
     */
    public void setDataInfoList(ProIspPlaySumInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get Download speed in MB/s. Calculation method: total traffic/total duration. 
     * @return AvgFluxPerSecond Download speed in MB/s. Calculation method: total traffic/total duration.
     */
    public Float getAvgFluxPerSecond() {
        return this.AvgFluxPerSecond;
    }

    /**
     * Set Download speed in MB/s. Calculation method: total traffic/total duration.
     * @param AvgFluxPerSecond Download speed in MB/s. Calculation method: total traffic/total duration.
     */
    public void setAvgFluxPerSecond(Float AvgFluxPerSecond) {
        this.AvgFluxPerSecond = AvgFluxPerSecond;
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

    public DescribeProIspPlaySumInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProIspPlaySumInfoListResponse(DescribeProIspPlaySumInfoListResponse source) {
        if (source.TotalFlux != null) {
            this.TotalFlux = new Float(source.TotalFlux);
        }
        if (source.TotalRequest != null) {
            this.TotalRequest = new Long(source.TotalRequest);
        }
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.DataInfoList != null) {
            this.DataInfoList = new ProIspPlaySumInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new ProIspPlaySumInfo(source.DataInfoList[i]);
            }
        }
        if (source.AvgFluxPerSecond != null) {
            this.AvgFluxPerSecond = new Float(source.AvgFluxPerSecond);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "AvgFluxPerSecond", this.AvgFluxPerSecond);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

