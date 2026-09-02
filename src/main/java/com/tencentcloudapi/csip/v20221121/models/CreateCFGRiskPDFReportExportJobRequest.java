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

public class CreateCFGRiskPDFReportExportJobRequest extends AbstractModel {

    /**
    * <p>Compliance standard ID</p>
    */
    @SerializedName("StandardID")
    @Expose
    private Long StandardID;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter content.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Page size.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting type</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>Asset tag ID</p>
    */
    @SerializedName("AssetTagIDs")
    @Expose
    private Long [] AssetTagIDs;

    /**
     * Get <p>Compliance standard ID</p> 
     * @return StandardID <p>Compliance standard ID</p>
     */
    public Long getStandardID() {
        return this.StandardID;
    }

    /**
     * Set <p>Compliance standard ID</p>
     * @param StandardID <p>Compliance standard ID</p>
     */
    public void setStandardID(Long StandardID) {
        this.StandardID = StandardID;
    }

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
     * Get <p>Filter content.</p> 
     * @return Filters <p>Filter content.</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter content.</p>
     * @param Filters <p>Filter content.</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Page size.</p> 
     * @return Limit <p>Page size.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Page size.</p>
     * @param Limit <p>Page size.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting type</p> 
     * @return Order <p>Sorting type</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting type</p>
     * @param Order <p>Sorting type</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field.</p> 
     * @return By <p>Sorting field.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field.</p>
     * @param By <p>Sorting field.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>Asset tag ID</p> 
     * @return AssetTagIDs <p>Asset tag ID</p>
     */
    public Long [] getAssetTagIDs() {
        return this.AssetTagIDs;
    }

    /**
     * Set <p>Asset tag ID</p>
     * @param AssetTagIDs <p>Asset tag ID</p>
     */
    public void setAssetTagIDs(Long [] AssetTagIDs) {
        this.AssetTagIDs = AssetTagIDs;
    }

    public CreateCFGRiskPDFReportExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCFGRiskPDFReportExportJobRequest(CreateCFGRiskPDFReportExportJobRequest source) {
        if (source.StandardID != null) {
            this.StandardID = new Long(source.StandardID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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
        if (source.AssetTagIDs != null) {
            this.AssetTagIDs = new Long[source.AssetTagIDs.length];
            for (int i = 0; i < source.AssetTagIDs.length; i++) {
                this.AssetTagIDs[i] = new Long(source.AssetTagIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StandardID", this.StandardID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "AssetTagIDs.", this.AssetTagIDs);

    }
}

