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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerOwnCostExplorerSummaryRequest extends AbstractModel {

    /**
    * <p>Classification dimension</p><p>Enumeration value:</p><ul><li>Default: Default dimension</li><li>Business: Product</li><li>Product: Subproduct</li><li>Region: Region</li><li>Zone: Availability zone</li><li>ActionType: Transaction type</li><li>PayMode: Payment mode</li><li>Project: Project</li><li>PayerUin: Payer uin</li><li>OwnerUin: Owner uin</li><li>Tag: Tag</li></ul>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * <p>Fee type</p><p>Enumeration value:</p><ul><li>originalCost: Original Cost</li><li>totalCost: Total Cost</li></ul>
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * <p>Billing mode</p><p>Enumeration value:</p><ul><li>1: Billing statement</li></ul>
    */
    @SerializedName("BillType")
    @Expose
    private Long BillType;

    /**
    * <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months; when PeriodType is day, the time range is 2 calendar months;</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Time type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: By month</li></ul>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>Page number</p><p>Value range: [1, 10000]</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>Page size</p><p>Value range: [1, 200]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Tag key of the statistical dimension. When Dimension is Tag, TagKey is required.</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Filter

You can pass the data returned by [DescribeCustomerOwnCostExplorerFilter](https://www.tencentcloud.com/document/product/1085/80125) as a parameter to filter the data.
    */
    @SerializedName("Filter")
    @Expose
    private CostAnalyzeFilter Filter;

    /**
     * Get <p>Classification dimension</p><p>Enumeration value:</p><ul><li>Default: Default dimension</li><li>Business: Product</li><li>Product: Subproduct</li><li>Region: Region</li><li>Zone: Availability zone</li><li>ActionType: Transaction type</li><li>PayMode: Payment mode</li><li>Project: Project</li><li>PayerUin: Payer uin</li><li>OwnerUin: Owner uin</li><li>Tag: Tag</li></ul> 
     * @return Dimension <p>Classification dimension</p><p>Enumeration value:</p><ul><li>Default: Default dimension</li><li>Business: Product</li><li>Product: Subproduct</li><li>Region: Region</li><li>Zone: Availability zone</li><li>ActionType: Transaction type</li><li>PayMode: Payment mode</li><li>Project: Project</li><li>PayerUin: Payer uin</li><li>OwnerUin: Owner uin</li><li>Tag: Tag</li></ul>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>Classification dimension</p><p>Enumeration value:</p><ul><li>Default: Default dimension</li><li>Business: Product</li><li>Product: Subproduct</li><li>Region: Region</li><li>Zone: Availability zone</li><li>ActionType: Transaction type</li><li>PayMode: Payment mode</li><li>Project: Project</li><li>PayerUin: Payer uin</li><li>OwnerUin: Owner uin</li><li>Tag: Tag</li></ul>
     * @param Dimension <p>Classification dimension</p><p>Enumeration value:</p><ul><li>Default: Default dimension</li><li>Business: Product</li><li>Product: Subproduct</li><li>Region: Region</li><li>Zone: Availability zone</li><li>ActionType: Transaction type</li><li>PayMode: Payment mode</li><li>Project: Project</li><li>PayerUin: Payer uin</li><li>OwnerUin: Owner uin</li><li>Tag: Tag</li></ul>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get <p>Fee type</p><p>Enumeration value:</p><ul><li>originalCost: Original Cost</li><li>totalCost: Total Cost</li></ul> 
     * @return FeeType <p>Fee type</p><p>Enumeration value:</p><ul><li>originalCost: Original Cost</li><li>totalCost: Total Cost</li></ul>
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set <p>Fee type</p><p>Enumeration value:</p><ul><li>originalCost: Original Cost</li><li>totalCost: Total Cost</li></ul>
     * @param FeeType <p>Fee type</p><p>Enumeration value:</p><ul><li>originalCost: Original Cost</li><li>totalCost: Total Cost</li></ul>
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get <p>Billing mode</p><p>Enumeration value:</p><ul><li>1: Billing statement</li></ul> 
     * @return BillType <p>Billing mode</p><p>Enumeration value:</p><ul><li>1: Billing statement</li></ul>
     */
    public Long getBillType() {
        return this.BillType;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration value:</p><ul><li>1: Billing statement</li></ul>
     * @param BillType <p>Billing mode</p><p>Enumeration value:</p><ul><li>1: Billing statement</li></ul>
     */
    public void setBillType(Long BillType) {
        this.BillType = BillType;
    }

    /**
     * Get <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months; when PeriodType is day, the time range is 2 calendar months;</p> 
     * @return StartTime <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months; when PeriodType is day, the time range is 2 calendar months;</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months; when PeriodType is day, the time range is 2 calendar months;</p>
     * @param StartTime <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months; when PeriodType is day, the time range is 2 calendar months;</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p> 
     * @return EndTime <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
     * @param EndTime <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Time type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: By month</li></ul> 
     * @return PeriodType <p>Time type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: By month</li></ul>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>Time type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: By month</li></ul>
     * @param PeriodType <p>Time type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: By month</li></ul>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>Page number</p><p>Value range: [1, 10000]</p> 
     * @return Page <p>Page number</p><p>Value range: [1, 10000]</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>Page number</p><p>Value range: [1, 10000]</p>
     * @param Page <p>Page number</p><p>Value range: [1, 10000]</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>Page size</p><p>Value range: [1, 200]</p> 
     * @return PageSize <p>Page size</p><p>Value range: [1, 200]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Page size</p><p>Value range: [1, 200]</p>
     * @param PageSize <p>Page size</p><p>Value range: [1, 200]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Tag key of the statistical dimension. When Dimension is Tag, TagKey is required.</p> 
     * @return TagKey <p>Tag key of the statistical dimension. When Dimension is Tag, TagKey is required.</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>Tag key of the statistical dimension. When Dimension is Tag, TagKey is required.</p>
     * @param TagKey <p>Tag key of the statistical dimension. When Dimension is Tag, TagKey is required.</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Filter

You can pass the data returned by [DescribeCustomerOwnCostExplorerFilter](https://www.tencentcloud.com/document/product/1085/80125) as a parameter to filter the data. 
     * @return Filter Filter

You can pass the data returned by [DescribeCustomerOwnCostExplorerFilter](https://www.tencentcloud.com/document/product/1085/80125) as a parameter to filter the data.
     */
    public CostAnalyzeFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter

You can pass the data returned by [DescribeCustomerOwnCostExplorerFilter](https://www.tencentcloud.com/document/product/1085/80125) as a parameter to filter the data.
     * @param Filter Filter

You can pass the data returned by [DescribeCustomerOwnCostExplorerFilter](https://www.tencentcloud.com/document/product/1085/80125) as a parameter to filter the data.
     */
    public void setFilter(CostAnalyzeFilter Filter) {
        this.Filter = Filter;
    }

    public DescribeCustomerOwnCostExplorerSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerOwnCostExplorerSummaryRequest(DescribeCustomerOwnCostExplorerSummaryRequest source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.BillType != null) {
            this.BillType = new Long(source.BillType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Filter != null) {
            this.Filter = new CostAnalyzeFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

