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

public class DescribePlayErrorCodeSumInfoListResponse extends AbstractModel{

    /**
    * Information of 4xx or 5xx error codes by district and ISP.
    */
    @SerializedName("ProIspInfoList")
    @Expose
    private ProIspPlayCodeDataInfo [] ProIspInfoList;

    /**
    * Total occurrences of all status codes.
    */
    @SerializedName("TotalCodeAll")
    @Expose
    private Long TotalCodeAll;

    /**
    * Occurrences of 4xx status codes.
    */
    @SerializedName("TotalCode4xx")
    @Expose
    private Long TotalCode4xx;

    /**
    * Occurrences of 5xx status codes.
    */
    @SerializedName("TotalCode5xx")
    @Expose
    private Long TotalCode5xx;

    /**
    * Total occurrences of all status codes. Codes 400, 403, 404, 500, 502, 503, and 504 are supported for the time being.
    */
    @SerializedName("TotalCodeList")
    @Expose
    private PlayCodeTotalInfo [] TotalCodeList;

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
    * Total number of pages.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Total number of results.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 
    */
    @SerializedName("TotalCode2xx")
    @Expose
    private Long TotalCode2xx;

    /**
    * 
    */
    @SerializedName("TotalCode3xx")
    @Expose
    private Long TotalCode3xx;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of 4xx or 5xx error codes by district and ISP. 
     * @return ProIspInfoList Information of 4xx or 5xx error codes by district and ISP.
     */
    public ProIspPlayCodeDataInfo [] getProIspInfoList() {
        return this.ProIspInfoList;
    }

    /**
     * Set Information of 4xx or 5xx error codes by district and ISP.
     * @param ProIspInfoList Information of 4xx or 5xx error codes by district and ISP.
     */
    public void setProIspInfoList(ProIspPlayCodeDataInfo [] ProIspInfoList) {
        this.ProIspInfoList = ProIspInfoList;
    }

    /**
     * Get Total occurrences of all status codes. 
     * @return TotalCodeAll Total occurrences of all status codes.
     */
    public Long getTotalCodeAll() {
        return this.TotalCodeAll;
    }

    /**
     * Set Total occurrences of all status codes.
     * @param TotalCodeAll Total occurrences of all status codes.
     */
    public void setTotalCodeAll(Long TotalCodeAll) {
        this.TotalCodeAll = TotalCodeAll;
    }

    /**
     * Get Occurrences of 4xx status codes. 
     * @return TotalCode4xx Occurrences of 4xx status codes.
     */
    public Long getTotalCode4xx() {
        return this.TotalCode4xx;
    }

    /**
     * Set Occurrences of 4xx status codes.
     * @param TotalCode4xx Occurrences of 4xx status codes.
     */
    public void setTotalCode4xx(Long TotalCode4xx) {
        this.TotalCode4xx = TotalCode4xx;
    }

    /**
     * Get Occurrences of 5xx status codes. 
     * @return TotalCode5xx Occurrences of 5xx status codes.
     */
    public Long getTotalCode5xx() {
        return this.TotalCode5xx;
    }

    /**
     * Set Occurrences of 5xx status codes.
     * @param TotalCode5xx Occurrences of 5xx status codes.
     */
    public void setTotalCode5xx(Long TotalCode5xx) {
        this.TotalCode5xx = TotalCode5xx;
    }

    /**
     * Get Total occurrences of all status codes. Codes 400, 403, 404, 500, 502, 503, and 504 are supported for the time being. 
     * @return TotalCodeList Total occurrences of all status codes. Codes 400, 403, 404, 500, 502, 503, and 504 are supported for the time being.
     */
    public PlayCodeTotalInfo [] getTotalCodeList() {
        return this.TotalCodeList;
    }

    /**
     * Set Total occurrences of all status codes. Codes 400, 403, 404, 500, 502, 503, and 504 are supported for the time being.
     * @param TotalCodeList Total occurrences of all status codes. Codes 400, 403, 404, 500, 502, 503, and 504 are supported for the time being.
     */
    public void setTotalCodeList(PlayCodeTotalInfo [] TotalCodeList) {
        this.TotalCodeList = TotalCodeList;
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
     * Get  
     * @return TotalCode2xx 
     */
    public Long getTotalCode2xx() {
        return this.TotalCode2xx;
    }

    /**
     * Set 
     * @param TotalCode2xx 
     */
    public void setTotalCode2xx(Long TotalCode2xx) {
        this.TotalCode2xx = TotalCode2xx;
    }

    /**
     * Get  
     * @return TotalCode3xx 
     */
    public Long getTotalCode3xx() {
        return this.TotalCode3xx;
    }

    /**
     * Set 
     * @param TotalCode3xx 
     */
    public void setTotalCode3xx(Long TotalCode3xx) {
        this.TotalCode3xx = TotalCode3xx;
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
        this.setParamArrayObj(map, prefix + "ProIspInfoList.", this.ProIspInfoList);
        this.setParamSimple(map, prefix + "TotalCodeAll", this.TotalCodeAll);
        this.setParamSimple(map, prefix + "TotalCode4xx", this.TotalCode4xx);
        this.setParamSimple(map, prefix + "TotalCode5xx", this.TotalCode5xx);
        this.setParamArrayObj(map, prefix + "TotalCodeList.", this.TotalCodeList);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalCode2xx", this.TotalCode2xx);
        this.setParamSimple(map, prefix + "TotalCode3xx", this.TotalCode3xx);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

