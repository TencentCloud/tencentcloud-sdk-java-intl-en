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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginWhiteLearnListEDRRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter condition array (multiple Filters have an AND relationship). Supports Name: Keyword or Location (common login location blurry), Remark, ModifyBeginTime, ModifyEndTime (time format 2006-01-02 15:04:05); unknown Name is ignored with no error reported</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>Page size. Default: 10. Upper limit: 100. If 0 or more than 100 is passed, the default or upper limit is used.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pagination offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order: ASC - ascending, DESC - descending (not case-sensitive). Default: DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field: CreateTime-creation time, ModifyTime-last modified. Default: ModifyTime. If an illegal value is passed, InvalidParameter is returned.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Filter condition array (multiple Filters have an AND relationship). Supports Name: Keyword or Location (common login location blurry), Remark, ModifyBeginTime, ModifyEndTime (time format 2006-01-02 15:04:05); unknown Name is ignored with no error reported</p> 
     * @return Filters <p>Filter condition array (multiple Filters have an AND relationship). Supports Name: Keyword or Location (common login location blurry), Remark, ModifyBeginTime, ModifyEndTime (time format 2006-01-02 15:04:05); unknown Name is ignored with no error reported</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter condition array (multiple Filters have an AND relationship). Supports Name: Keyword or Location (common login location blurry), Remark, ModifyBeginTime, ModifyEndTime (time format 2006-01-02 15:04:05); unknown Name is ignored with no error reported</p>
     * @param Filters <p>Filter condition array (multiple Filters have an AND relationship). Supports Name: Keyword or Location (common login location blurry), Remark, ModifyBeginTime, ModifyEndTime (time format 2006-01-02 15:04:05); unknown Name is ignored with no error reported</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Page size. Default: 10. Upper limit: 100. If 0 or more than 100 is passed, the default or upper limit is used.</p> 
     * @return Limit <p>Page size. Default: 10. Upper limit: 100. If 0 or more than 100 is passed, the default or upper limit is used.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Page size. Default: 10. Upper limit: 100. If 0 or more than 100 is passed, the default or upper limit is used.</p>
     * @param Limit <p>Page size. Default: 10. Upper limit: 100. If 0 or more than 100 is passed, the default or upper limit is used.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pagination offset. Default value: 0.</p> 
     * @return Offset <p>Pagination offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset. Default value: 0.</p>
     * @param Offset <p>Pagination offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order: ASC - ascending, DESC - descending (not case-sensitive). Default: DESC</p> 
     * @return Order <p>Sorting order: ASC - ascending, DESC - descending (not case-sensitive). Default: DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order: ASC - ascending, DESC - descending (not case-sensitive). Default: DESC</p>
     * @param Order <p>Sorting order: ASC - ascending, DESC - descending (not case-sensitive). Default: DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field: CreateTime-creation time, ModifyTime-last modified. Default: ModifyTime. If an illegal value is passed, InvalidParameter is returned.</p> 
     * @return By <p>Sorting field: CreateTime-creation time, ModifyTime-last modified. Default: ModifyTime. If an illegal value is passed, InvalidParameter is returned.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field: CreateTime-creation time, ModifyTime-last modified. Default: ModifyTime. If an illegal value is passed, InvalidParameter is returned.</p>
     * @param By <p>Sorting field: CreateTime-creation time, ModifyTime-last modified. Default: ModifyTime. If an illegal value is passed, InvalidParameter is returned.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeLoginWhiteLearnListEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginWhiteLearnListEDRRequest(DescribeLoginWhiteLearnListEDRRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

