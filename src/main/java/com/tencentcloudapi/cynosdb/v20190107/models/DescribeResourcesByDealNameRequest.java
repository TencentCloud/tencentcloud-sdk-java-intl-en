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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesByDealNameRequest extends AbstractModel {

    /**
    * Billing order ID (if billing has not called back business delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, the business needs to retry the DescribeResourcesByDealName API until it succeeds).
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * List of billing order IDs. You can query the resource information for several order IDs in a single query. If billing has not yet called back the business for delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, retry the DescribeResourcesByDealName API until it succeeds.
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * Get Billing order ID (if billing has not called back business delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, the business needs to retry the DescribeResourcesByDealName API until it succeeds).
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence. 
     * @return DealName Billing order ID (if billing has not called back business delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, the business needs to retry the DescribeResourcesByDealName API until it succeeds).
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Billing order ID (if billing has not called back business delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, the business needs to retry the DescribeResourcesByDealName API until it succeeds).
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
     * @param DealName Billing order ID (if billing has not called back business delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, the business needs to retry the DescribeResourcesByDealName API until it succeeds).
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get List of billing order IDs. You can query the resource information for several order IDs in a single query. If billing has not yet called back the business for delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, retry the DescribeResourcesByDealName API until it succeeds.
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence. 
     * @return DealNames List of billing order IDs. You can query the resource information for several order IDs in a single query. If billing has not yet called back the business for delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, retry the DescribeResourcesByDealName API until it succeeds.
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set List of billing order IDs. You can query the resource information for several order IDs in a single query. If billing has not yet called back the business for delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, retry the DescribeResourcesByDealName API until it succeeds.
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
     * @param DealNames List of billing order IDs. You can query the resource information for several order IDs in a single query. If billing has not yet called back the business for delivery, the error code InvalidParameterValue.DealNameNotFound may occur. In this case, retry the DescribeResourcesByDealName API until it succeeds.
Enter at least one of DealName and DealNames. If both are entered, DealName takes precedence.
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    public DescribeResourcesByDealNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcesByDealNameRequest(DescribeResourcesByDealNameRequest source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

