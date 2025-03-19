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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageLinearAssemblyChannelsResponse extends AbstractModel {

    /**
    * Channel list.
    */
    @SerializedName("Infos")
    @Expose
    private LinearAssemblyChannelInfo [] Infos;

    /**
    * Number of pages.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Size per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The total amount.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * total pages.
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
     * Get Channel list. 
     * @return Infos Channel list.
     */
    public LinearAssemblyChannelInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set Channel list.
     * @param Infos Channel list.
     */
    public void setInfos(LinearAssemblyChannelInfo [] Infos) {
        this.Infos = Infos;
    }

    /**
     * Get Number of pages. 
     * @return PageNum Number of pages.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Number of pages.
     * @param PageNum Number of pages.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Size per page. 
     * @return PageSize Size per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Size per page.
     * @param PageSize Size per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get The total amount. 
     * @return TotalNum The total amount.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set The total amount.
     * @param TotalNum The total amount.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get total pages. 
     * @return TotalPage total pages.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set total pages.
     * @param TotalPage total pages.
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

    public DescribeStreamPackageLinearAssemblyChannelsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageLinearAssemblyChannelsResponse(DescribeStreamPackageLinearAssemblyChannelsResponse source) {
        if (source.Infos != null) {
            this.Infos = new LinearAssemblyChannelInfo[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new LinearAssemblyChannelInfo(source.Infos[i]);
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
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

