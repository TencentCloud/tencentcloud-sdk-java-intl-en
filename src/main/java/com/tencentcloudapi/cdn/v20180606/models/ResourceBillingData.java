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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceBillingData extends AbstractModel{

    /**
    * Resource name, which is classified as follows based on different query filters:
When a domain name is specified: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
A specific project ID: ID of the specifically queried project
`all`: Details at the account level
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Billing data details
    */
    @SerializedName("BillingData")
    @Expose
    private CdnData [] BillingData;

    /**
     * Get Resource name, which is classified as follows based on different query filters:
When a domain name is specified: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
A specific project ID: ID of the specifically queried project
`all`: Details at the account level 
     * @return Resource Resource name, which is classified as follows based on different query filters:
When a domain name is specified: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
A specific project ID: ID of the specifically queried project
`all`: Details at the account level
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource name, which is classified as follows based on different query filters:
When a domain name is specified: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
A specific project ID: ID of the specifically queried project
`all`: Details at the account level
     * @param Resource Resource name, which is classified as follows based on different query filters:
When a domain name is specified: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
A specific project ID: ID of the specifically queried project
`all`: Details at the account level
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Billing data details 
     * @return BillingData Billing data details
     */
    public CdnData [] getBillingData() {
        return this.BillingData;
    }

    /**
     * Set Billing data details
     * @param BillingData Billing data details
     */
    public void setBillingData(CdnData [] BillingData) {
        this.BillingData = BillingData;
    }

    public ResourceBillingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceBillingData(ResourceBillingData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.BillingData != null) {
            this.BillingData = new CdnData[source.BillingData.length];
            for (int i = 0; i < source.BillingData.length; i++) {
                this.BillingData[i] = new CdnData(source.BillingData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "BillingData.", this.BillingData);

    }
}

