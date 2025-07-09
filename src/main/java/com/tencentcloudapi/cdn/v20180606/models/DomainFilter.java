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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainFilter extends AbstractModel {

    /**
    * Filter filter. Values:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Values: `online`, `offline`, and `processing`.
- `serviceType`: Service type. Values: `web`, `download`, `media`, `hybrid` and `dynamic`.
- `projectId`: Project ID.
- `domainType`: Primary origin type. Values: `cname` (customer origin), `COS` (COS origin), `third_party` (third-party object storage origin), and `igtm` (IGTM origin).
- `fullUrlCache`: Whether to enable path cache. Values: `on`, `off`.
- `https`: Whether to configure HTTPS. Values: `on`, `off` and `processing`.
- `originPullProtocol`: Origin-pull protocol type. Value: `http`, `follow`, and `https`.
- `tagKey`: Tag key.
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
     * Get Filter filter. Values:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Values: `online`, `offline`, and `processing`.
- `serviceType`: Service type. Values: `web`, `download`, `media`, `hybrid` and `dynamic`.
- `projectId`: Project ID.
- `domainType`: Primary origin type. Values: `cname` (customer origin), `COS` (COS origin), `third_party` (third-party object storage origin), and `igtm` (IGTM origin).
- `fullUrlCache`: Whether to enable path cache. Values: `on`, `off`.
- `https`: Whether to configure HTTPS. Values: `on`, `off` and `processing`.
- `originPullProtocol`: Origin-pull protocol type. Value: `http`, `follow`, and `https`.
- `tagKey`: Tag key. 
     * @return Name Filter filter. Values:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Values: `online`, `offline`, and `processing`.
- `serviceType`: Service type. Values: `web`, `download`, `media`, `hybrid` and `dynamic`.
- `projectId`: Project ID.
- `domainType`: Primary origin type. Values: `cname` (customer origin), `COS` (COS origin), `third_party` (third-party object storage origin), and `igtm` (IGTM origin).
- `fullUrlCache`: Whether to enable path cache. Values: `on`, `off`.
- `https`: Whether to configure HTTPS. Values: `on`, `off` and `processing`.
- `originPullProtocol`: Origin-pull protocol type. Value: `http`, `follow`, and `https`.
- `tagKey`: Tag key.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter filter. Values:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Values: `online`, `offline`, and `processing`.
- `serviceType`: Service type. Values: `web`, `download`, `media`, `hybrid` and `dynamic`.
- `projectId`: Project ID.
- `domainType`: Primary origin type. Values: `cname` (customer origin), `COS` (COS origin), `third_party` (third-party object storage origin), and `igtm` (IGTM origin).
- `fullUrlCache`: Whether to enable path cache. Values: `on`, `off`.
- `https`: Whether to configure HTTPS. Values: `on`, `off` and `processing`.
- `originPullProtocol`: Origin-pull protocol type. Value: `http`, `follow`, and `https`.
- `tagKey`: Tag key.
     * @param Name Filter filter. Values:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Values: `online`, `offline`, and `processing`.
- `serviceType`: Service type. Values: `web`, `download`, `media`, `hybrid` and `dynamic`.
- `projectId`: Project ID.
- `domainType`: Primary origin type. Values: `cname` (customer origin), `COS` (COS origin), `third_party` (third-party object storage origin), and `igtm` (IGTM origin).
- `fullUrlCache`: Whether to enable path cache. Values: `on`, `off`.
- `https`: Whether to configure HTTPS. Values: `on`, `off` and `processing`.
- `originPullProtocol`: Origin-pull protocol type. Value: `http`, `follow`, and `https`.
- `tagKey`: Tag key.
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

