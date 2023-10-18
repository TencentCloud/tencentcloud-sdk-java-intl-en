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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageSummaryRequest extends AbstractModel {

    /**
    * Start time of the query period.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the query period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Subproducts whose usage you want to query.
    */
    @SerializedName("SubProducts")
    @Expose
    private String [] SubProducts;

    /**
    * true: Returns weighted data.
false: Returns raw data.
    */
    @SerializedName("IsWeighted")
    @Expose
    private Boolean IsWeighted;

    /**
     * Get Start time of the query period. 
     * @return BeginTime Start time of the query period.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the query period.
     * @param BeginTime Start time of the query period.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the query period. 
     * @return EndTime End time of the query period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query period.
     * @param EndTime End time of the query period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Subproducts whose usage you want to query. 
     * @return SubProducts Subproducts whose usage you want to query.
     */
    public String [] getSubProducts() {
        return this.SubProducts;
    }

    /**
     * Set Subproducts whose usage you want to query.
     * @param SubProducts Subproducts whose usage you want to query.
     */
    public void setSubProducts(String [] SubProducts) {
        this.SubProducts = SubProducts;
    }

    /**
     * Get true: Returns weighted data.
false: Returns raw data. 
     * @return IsWeighted true: Returns weighted data.
false: Returns raw data.
     */
    public Boolean getIsWeighted() {
        return this.IsWeighted;
    }

    /**
     * Set true: Returns weighted data.
false: Returns raw data.
     * @param IsWeighted true: Returns weighted data.
false: Returns raw data.
     */
    public void setIsWeighted(Boolean IsWeighted) {
        this.IsWeighted = IsWeighted;
    }

    public DescribeUsageSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageSummaryRequest(DescribeUsageSummaryRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubProducts != null) {
            this.SubProducts = new String[source.SubProducts.length];
            for (int i = 0; i < source.SubProducts.length; i++) {
                this.SubProducts[i] = new String(source.SubProducts[i]);
            }
        }
        if (source.IsWeighted != null) {
            this.IsWeighted = new Boolean(source.IsWeighted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "SubProducts.", this.SubProducts);
        this.setParamSimple(map, prefix + "IsWeighted", this.IsWeighted);

    }
}

