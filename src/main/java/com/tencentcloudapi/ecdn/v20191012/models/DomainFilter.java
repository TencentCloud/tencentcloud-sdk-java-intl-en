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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainFilter extends AbstractModel {

    /**
    * Filters by the field name, which includes:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Valid values: `online`, `offline`, and `processing`.
- `disable`: Whether the domain name is blocked. Valid values: `normal`, `unlicensed`.
- `projectId`: Project ID.
- `fullUrlCache`: Whether to enable full-path cache, which can be `on` or `off`.
- `https`: Whether to configure HTTPS, which can be `on`, `off` or `processing`.
- `originPullProtocol`: Origin-pull protocol type, which can be `http`, `follow`, or `https`.
- `area`: Acceleration region, which can be `mainland`，`overseas` or `global`.
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
    * Whether to enable fuzzy query, which is supported only for filter fields `origin` and `domain`.
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get Filters by the field name, which includes:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Valid values: `online`, `offline`, and `processing`.
- `disable`: Whether the domain name is blocked. Valid values: `normal`, `unlicensed`.
- `projectId`: Project ID.
- `fullUrlCache`: Whether to enable full-path cache, which can be `on` or `off`.
- `https`: Whether to configure HTTPS, which can be `on`, `off` or `processing`.
- `originPullProtocol`: Origin-pull protocol type, which can be `http`, `follow`, or `https`.
- `area`: Acceleration region, which can be `mainland`，`overseas` or `global`.
- `tagKey`: Tag key. 
     * @return Name Filters by the field name, which includes:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Valid values: `online`, `offline`, and `processing`.
- `disable`: Whether the domain name is blocked. Valid values: `normal`, `unlicensed`.
- `projectId`: Project ID.
- `fullUrlCache`: Whether to enable full-path cache, which can be `on` or `off`.
- `https`: Whether to configure HTTPS, which can be `on`, `off` or `processing`.
- `originPullProtocol`: Origin-pull protocol type, which can be `http`, `follow`, or `https`.
- `area`: Acceleration region, which can be `mainland`，`overseas` or `global`.
- `tagKey`: Tag key.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filters by the field name, which includes:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Valid values: `online`, `offline`, and `processing`.
- `disable`: Whether the domain name is blocked. Valid values: `normal`, `unlicensed`.
- `projectId`: Project ID.
- `fullUrlCache`: Whether to enable full-path cache, which can be `on` or `off`.
- `https`: Whether to configure HTTPS, which can be `on`, `off` or `processing`.
- `originPullProtocol`: Origin-pull protocol type, which can be `http`, `follow`, or `https`.
- `area`: Acceleration region, which can be `mainland`，`overseas` or `global`.
- `tagKey`: Tag key.
     * @param Name Filters by the field name, which includes:
- `origin`: Primary origin server.
- `domain`: Domain name.
- `resourceId`: Domain name ID.
- `status`: Domain name status. Valid values: `online`, `offline`, and `processing`.
- `disable`: Whether the domain name is blocked. Valid values: `normal`, `unlicensed`.
- `projectId`: Project ID.
- `fullUrlCache`: Whether to enable full-path cache, which can be `on` or `off`.
- `https`: Whether to configure HTTPS, which can be `on`, `off` or `processing`.
- `originPullProtocol`: Origin-pull protocol type, which can be `http`, `follow`, or `https`.
- `area`: Acceleration region, which can be `mainland`，`overseas` or `global`.
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
     * Get Whether to enable fuzzy query, which is supported only for filter fields `origin` and `domain`. 
     * @return Fuzzy Whether to enable fuzzy query, which is supported only for filter fields `origin` and `domain`.
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set Whether to enable fuzzy query, which is supported only for filter fields `origin` and `domain`.
     * @param Fuzzy Whether to enable fuzzy query, which is supported only for filter fields `origin` and `domain`.
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

