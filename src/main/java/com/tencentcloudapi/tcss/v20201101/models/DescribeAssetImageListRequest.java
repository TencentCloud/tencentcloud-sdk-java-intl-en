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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageListRequest extends AbstractModel {

    /**
    * <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Filter conditions.</p><li>ImageName - String - Required: No - Image name filter;</li><li>ScanStatus - String - Required: No - Image scan status: notScan, scanning, scanned, and scanErr</li><li>ImageID - String - Required: No - Image ID filter;</li><li>SecurityRisk - String - Required: No - Security risk: VirusCnt, RiskCnt, IsTrustImage, CriticalLevelVul, HighLevelVul, MediumLevelVul, and LowLevelVul.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>Sorting field.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>Sorting method. Valid values: asc and desc.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get <p>Number of items to return. The default number is 10, and the maximum number is 100.</p> 
     * @return Limit <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     * @param Limit <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Filter conditions.</p><li>ImageName - String - Required: No - Image name filter;</li><li>ScanStatus - String - Required: No - Image scan status: notScan, scanning, scanned, and scanErr</li><li>ImageID - String - Required: No - Image ID filter;</li><li>SecurityRisk - String - Required: No - Security risk: VirusCnt, RiskCnt, IsTrustImage, CriticalLevelVul, HighLevelVul, MediumLevelVul, and LowLevelVul.</li> 
     * @return Filters <p>Filter conditions.</p><li>ImageName - String - Required: No - Image name filter;</li><li>ScanStatus - String - Required: No - Image scan status: notScan, scanning, scanned, and scanErr</li><li>ImageID - String - Required: No - Image ID filter;</li><li>SecurityRisk - String - Required: No - Security risk: VirusCnt, RiskCnt, IsTrustImage, CriticalLevelVul, HighLevelVul, MediumLevelVul, and LowLevelVul.</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions.</p><li>ImageName - String - Required: No - Image name filter;</li><li>ScanStatus - String - Required: No - Image scan status: notScan, scanning, scanned, and scanErr</li><li>ImageID - String - Required: No - Image ID filter;</li><li>SecurityRisk - String - Required: No - Security risk: VirusCnt, RiskCnt, IsTrustImage, CriticalLevelVul, HighLevelVul, MediumLevelVul, and LowLevelVul.</li>
     * @param Filters <p>Filter conditions.</p><li>ImageName - String - Required: No - Image name filter;</li><li>ScanStatus - String - Required: No - Image scan status: notScan, scanning, scanned, and scanErr</li><li>ImageID - String - Required: No - Image ID filter;</li><li>SecurityRisk - String - Required: No - Security risk: VirusCnt, RiskCnt, IsTrustImage, CriticalLevelVul, HighLevelVul, MediumLevelVul, and LowLevelVul.</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
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
     * Get <p>Sorting method. Valid values: asc and desc.</p> 
     * @return Order <p>Sorting method. Valid values: asc and desc.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting method. Valid values: asc and desc.</p>
     * @param Order <p>Sorting method. Valid values: asc and desc.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAssetImageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageListRequest(DescribeAssetImageListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

