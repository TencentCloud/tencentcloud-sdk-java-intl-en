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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMWafDLPRulesRequest extends AbstractModel {

    /**
    * <p>In SDK mode, pass in ServiceId (either ServiceId or Domain)</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Sorting field. Currently, only UpdateTime is supported. If this parameter is left empty, rules are returned in the default order.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>Sorting order: asc (ascending) or desc (descending). Default value: desc.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>In domain mode, pass in Domain (either Domain or ServiceId)</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get <p>In SDK mode, pass in ServiceId (either ServiceId or Domain)</p> 
     * @return ServiceId <p>In SDK mode, pass in ServiceId (either ServiceId or Domain)</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>In SDK mode, pass in ServiceId (either ServiceId or Domain)</p>
     * @param ServiceId <p>In SDK mode, pass in ServiceId (either ServiceId or Domain)</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Sorting field. Currently, only UpdateTime is supported. If this parameter is left empty, rules are returned in the default order.</p> 
     * @return By <p>Sorting field. Currently, only UpdateTime is supported. If this parameter is left empty, rules are returned in the default order.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field. Currently, only UpdateTime is supported. If this parameter is left empty, rules are returned in the default order.</p>
     * @param By <p>Sorting field. Currently, only UpdateTime is supported. If this parameter is left empty, rules are returned in the default order.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>Sorting order: asc (ascending) or desc (descending). Default value: desc.</p> 
     * @return Order <p>Sorting order: asc (ascending) or desc (descending). Default value: desc.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order: asc (ascending) or desc (descending). Default value: desc.</p>
     * @param Order <p>Sorting order: asc (ascending) or desc (descending). Default value: desc.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>In domain mode, pass in Domain (either Domain or ServiceId)</p> 
     * @return Domain <p>In domain mode, pass in Domain (either Domain or ServiceId)</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>In domain mode, pass in Domain (either Domain or ServiceId)</p>
     * @param Domain <p>In domain mode, pass in Domain (either Domain or ServiceId)</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeLLMWafDLPRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMWafDLPRulesRequest(DescribeLLMWafDLPRulesRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

