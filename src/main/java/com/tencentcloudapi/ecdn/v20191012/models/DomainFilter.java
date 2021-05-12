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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainFilter extends AbstractModel{

    /**
    * Filter field name, which can be:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name ID.
- status: domain name status. Valid values: online, offline, processing.
- disable: domain name blockage status. Valid values: normal, unlicensed.
- projectId: project ID.
- fullUrlCache: full path cache. Valid values: on, off.
- https: whether to configure HTTPS. Valid values: on, off, processing.
- originPullProtocol: origin-pull protocol type. Valid values: http, follow, https.
- area: acceleration region. Valid values: mainland, overseas, global.
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
     * Get Filter field name, which can be:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name ID.
- status: domain name status. Valid values: online, offline, processing.
- disable: domain name blockage status. Valid values: normal, unlicensed.
- projectId: project ID.
- fullUrlCache: full path cache. Valid values: on, off.
- https: whether to configure HTTPS. Valid values: on, off, processing.
- originPullProtocol: origin-pull protocol type. Valid values: http, follow, https.
- area: acceleration region. Valid values: mainland, overseas, global. 
     * @return Name Filter field name, which can be:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name ID.
- status: domain name status. Valid values: online, offline, processing.
- disable: domain name blockage status. Valid values: normal, unlicensed.
- projectId: project ID.
- fullUrlCache: full path cache. Valid values: on, off.
- https: whether to configure HTTPS. Valid values: on, off, processing.
- originPullProtocol: origin-pull protocol type. Valid values: http, follow, https.
- area: acceleration region. Valid values: mainland, overseas, global.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name, which can be:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name ID.
- status: domain name status. Valid values: online, offline, processing.
- disable: domain name blockage status. Valid values: normal, unlicensed.
- projectId: project ID.
- fullUrlCache: full path cache. Valid values: on, off.
- https: whether to configure HTTPS. Valid values: on, off, processing.
- originPullProtocol: origin-pull protocol type. Valid values: http, follow, https.
- area: acceleration region. Valid values: mainland, overseas, global.
     * @param Name Filter field name, which can be:
- origin: primary origin server.
- domain: domain name.
- resourceId: domain name ID.
- status: domain name status. Valid values: online, offline, processing.
- disable: domain name blockage status. Valid values: normal, unlicensed.
- projectId: project ID.
- fullUrlCache: full path cache. Valid values: on, off.
- https: whether to configure HTTPS. Valid values: on, off, processing.
- originPullProtocol: origin-pull protocol type. Valid values: http, follow, https.
- area: acceleration region. Valid values: mainland, overseas, global.
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

