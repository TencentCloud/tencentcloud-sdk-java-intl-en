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

public class DomainFilter extends AbstractModel{

    /**
    * Filter field name, the list supported is as follows:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name id.
- status: domain name status. Values include `online`, `offline`, or `processing`.
- serviceType: service type. Values include `web`, `download`, or `media`.
- projectId: project ID.
- domainType: primary origin server type, `cname` indicates external origin, `COS` indicates COS origin.
- fullUrlCache: full-path cache, which can be on or off.
- https: whether to configure HTTPS, which can be on, off or processing.
- originPullProtocol: origin-pull protocol type. HTTP, follow, or HTTPS are supported.
- tagKey: tag key.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter field value.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * Whether to enable fuzzy query. Only `origin` or `domain` is supported for the filter field name.
When fuzzy query is enabled, the maximum Value length is 1. When fuzzy query is disabled, the maximum Value length is 5.
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get Filter field name, the list supported is as follows:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name id.
- status: domain name status. Values include `online`, `offline`, or `processing`.
- serviceType: service type. Values include `web`, `download`, or `media`.
- projectId: project ID.
- domainType: primary origin server type, `cname` indicates external origin, `COS` indicates COS origin.
- fullUrlCache: full-path cache, which can be on or off.
- https: whether to configure HTTPS, which can be on, off or processing.
- originPullProtocol: origin-pull protocol type. HTTP, follow, or HTTPS are supported.
- tagKey: tag key. 
     * @return Name Filter field name, the list supported is as follows:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name id.
- status: domain name status. Values include `online`, `offline`, or `processing`.
- serviceType: service type. Values include `web`, `download`, or `media`.
- projectId: project ID.
- domainType: primary origin server type, `cname` indicates external origin, `COS` indicates COS origin.
- fullUrlCache: full-path cache, which can be on or off.
- https: whether to configure HTTPS, which can be on, off or processing.
- originPullProtocol: origin-pull protocol type. HTTP, follow, or HTTPS are supported.
- tagKey: tag key.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name, the list supported is as follows:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name id.
- status: domain name status. Values include `online`, `offline`, or `processing`.
- serviceType: service type. Values include `web`, `download`, or `media`.
- projectId: project ID.
- domainType: primary origin server type, `cname` indicates external origin, `COS` indicates COS origin.
- fullUrlCache: full-path cache, which can be on or off.
- https: whether to configure HTTPS, which can be on, off or processing.
- originPullProtocol: origin-pull protocol type. HTTP, follow, or HTTPS are supported.
- tagKey: tag key.
     * @param Name Filter field name, the list supported is as follows:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name id.
- status: domain name status. Values include `online`, `offline`, or `processing`.
- serviceType: service type. Values include `web`, `download`, or `media`.
- projectId: project ID.
- domainType: primary origin server type, `cname` indicates external origin, `COS` indicates COS origin.
- fullUrlCache: full-path cache, which can be on or off.
- https: whether to configure HTTPS, which can be on, off or processing.
- originPullProtocol: origin-pull protocol type. HTTP, follow, or HTTPS are supported.
- tagKey: tag key.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter field value. 
     * @return Value Filter field value.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Filter field value.
     * @param Value Filter field value.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get Whether to enable fuzzy query. Only `origin` or `domain` is supported for the filter field name.
When fuzzy query is enabled, the maximum Value length is 1. When fuzzy query is disabled, the maximum Value length is 5. 
     * @return Fuzzy Whether to enable fuzzy query. Only `origin` or `domain` is supported for the filter field name.
When fuzzy query is enabled, the maximum Value length is 1. When fuzzy query is disabled, the maximum Value length is 5.
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set Whether to enable fuzzy query. Only `origin` or `domain` is supported for the filter field name.
When fuzzy query is enabled, the maximum Value length is 1. When fuzzy query is disabled, the maximum Value length is 5.
     * @param Fuzzy Whether to enable fuzzy query. Only `origin` or `domain` is supported for the filter field name.
When fuzzy query is enabled, the maximum Value length is 1. When fuzzy query is disabled, the maximum Value length is 5.
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public DomainFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainFilter(DomainFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new Boolean(source.Fuzzy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

