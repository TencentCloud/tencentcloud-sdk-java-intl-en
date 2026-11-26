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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePurgeTaskRequest extends AbstractModel {

    /**
    * Zone ID.
If you wish to quickly submit Targets Url under different sites, you can fill in *, but the account calling the API must have permission for all site resources under the root account.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Node cache clearing type, with values:
<li>purge_url: URL refresh;</li>
<li>purge_prefix: directory refresh;</li>
<li>purge_host: Hostname refresh;</li>
<li>purge_all: cache purge for all under the site (when this value is used, ZoneId input parameter * is not supported);</li>
<li>purge_cache_tag: cache-tag refresh.</li>For cache purge types, see [Purge Cache](https://www.tencentcloud.com/document/product/1552/70759?from_cn_redirect=1).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Node cache purge method, valid for directory refresh, Hostname refresh, and refresh all cache types. Valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li><li> delete: refresh node resources regardless of whether resources under the directory are updated.</li>Default value: invalidate.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * List of resources for cache purging, for example, https://www.example.com/example.jpg. Protocol information must be included. The format of additional elements depends on the type of cache purging. Refer to the API call example below.<li>The number of tasks that can be submitted at a time is limited by the billing package quota. Check [EO billing packages](https://www.tencentcloud.com/document/product/1552/77380?from_cn_redirect=1).</li>
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * If transcoding exists, only delete the resources that match after transcoding.
If the content contains characters in a non-ASCII character set, enable this switch for encoding conversion (the encoding rule adheres to RFC3986).
    */
    @SerializedName("EncodeUrl")
    @Expose
    private Boolean EncodeUrl;

    /**
    * This parameter is required when the node cache purge type is set to purge_cache_tag. The input value is a domain name.
    */
    @SerializedName("CacheTag")
    @Expose
    private CacheTag CacheTag;

    /**
     * Get Zone ID.
If you wish to quickly submit Targets Url under different sites, you can fill in *, but the account calling the API must have permission for all site resources under the root account. 
     * @return ZoneId Zone ID.
If you wish to quickly submit Targets Url under different sites, you can fill in *, but the account calling the API must have permission for all site resources under the root account.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
If you wish to quickly submit Targets Url under different sites, you can fill in *, but the account calling the API must have permission for all site resources under the root account.
     * @param ZoneId Zone ID.
If you wish to quickly submit Targets Url under different sites, you can fill in *, but the account calling the API must have permission for all site resources under the root account.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Node cache clearing type, with values:
<li>purge_url: URL refresh;</li>
<li>purge_prefix: directory refresh;</li>
<li>purge_host: Hostname refresh;</li>
<li>purge_all: cache purge for all under the site (when this value is used, ZoneId input parameter * is not supported);</li>
<li>purge_cache_tag: cache-tag refresh.</li>For cache purge types, see [Purge Cache](https://www.tencentcloud.com/document/product/1552/70759?from_cn_redirect=1). 
     * @return Type Node cache clearing type, with values:
<li>purge_url: URL refresh;</li>
<li>purge_prefix: directory refresh;</li>
<li>purge_host: Hostname refresh;</li>
<li>purge_all: cache purge for all under the site (when this value is used, ZoneId input parameter * is not supported);</li>
<li>purge_cache_tag: cache-tag refresh.</li>For cache purge types, see [Purge Cache](https://www.tencentcloud.com/document/product/1552/70759?from_cn_redirect=1).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Node cache clearing type, with values:
<li>purge_url: URL refresh;</li>
<li>purge_prefix: directory refresh;</li>
<li>purge_host: Hostname refresh;</li>
<li>purge_all: cache purge for all under the site (when this value is used, ZoneId input parameter * is not supported);</li>
<li>purge_cache_tag: cache-tag refresh.</li>For cache purge types, see [Purge Cache](https://www.tencentcloud.com/document/product/1552/70759?from_cn_redirect=1).
     * @param Type Node cache clearing type, with values:
<li>purge_url: URL refresh;</li>
<li>purge_prefix: directory refresh;</li>
<li>purge_host: Hostname refresh;</li>
<li>purge_all: cache purge for all under the site (when this value is used, ZoneId input parameter * is not supported);</li>
<li>purge_cache_tag: cache-tag refresh.</li>For cache purge types, see [Purge Cache](https://www.tencentcloud.com/document/product/1552/70759?from_cn_redirect=1).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Node cache purge method, valid for directory refresh, Hostname refresh, and refresh all cache types. Valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li><li> delete: refresh node resources regardless of whether resources under the directory are updated.</li>Default value: invalidate. 
     * @return Method Node cache purge method, valid for directory refresh, Hostname refresh, and refresh all cache types. Valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li><li> delete: refresh node resources regardless of whether resources under the directory are updated.</li>Default value: invalidate.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Node cache purge method, valid for directory refresh, Hostname refresh, and refresh all cache types. Valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li><li> delete: refresh node resources regardless of whether resources under the directory are updated.</li>Default value: invalidate.
     * @param Method Node cache purge method, valid for directory refresh, Hostname refresh, and refresh all cache types. Valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li><li> delete: refresh node resources regardless of whether resources under the directory are updated.</li>Default value: invalidate.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get List of resources for cache purging, for example, https://www.example.com/example.jpg. Protocol information must be included. The format of additional elements depends on the type of cache purging. Refer to the API call example below.<li>The number of tasks that can be submitted at a time is limited by the billing package quota. Check [EO billing packages](https://www.tencentcloud.com/document/product/1552/77380?from_cn_redirect=1).</li> 
     * @return Targets List of resources for cache purging, for example, https://www.example.com/example.jpg. Protocol information must be included. The format of additional elements depends on the type of cache purging. Refer to the API call example below.<li>The number of tasks that can be submitted at a time is limited by the billing package quota. Check [EO billing packages](https://www.tencentcloud.com/document/product/1552/77380?from_cn_redirect=1).</li>
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of resources for cache purging, for example, https://www.example.com/example.jpg. Protocol information must be included. The format of additional elements depends on the type of cache purging. Refer to the API call example below.<li>The number of tasks that can be submitted at a time is limited by the billing package quota. Check [EO billing packages](https://www.tencentcloud.com/document/product/1552/77380?from_cn_redirect=1).</li>
     * @param Targets List of resources for cache purging, for example, https://www.example.com/example.jpg. Protocol information must be included. The format of additional elements depends on the type of cache purging. Refer to the API call example below.<li>The number of tasks that can be submitted at a time is limited by the billing package quota. Check [EO billing packages](https://www.tencentcloud.com/document/product/1552/77380?from_cn_redirect=1).</li>
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get If transcoding exists, only delete the resources that match after transcoding.
If the content contains characters in a non-ASCII character set, enable this switch for encoding conversion (the encoding rule adheres to RFC3986). 
     * @return EncodeUrl If transcoding exists, only delete the resources that match after transcoding.
If the content contains characters in a non-ASCII character set, enable this switch for encoding conversion (the encoding rule adheres to RFC3986).
     * @deprecated
     */
    @Deprecated
    public Boolean getEncodeUrl() {
        return this.EncodeUrl;
    }

    /**
     * Set If transcoding exists, only delete the resources that match after transcoding.
If the content contains characters in a non-ASCII character set, enable this switch for encoding conversion (the encoding rule adheres to RFC3986).
     * @param EncodeUrl If transcoding exists, only delete the resources that match after transcoding.
If the content contains characters in a non-ASCII character set, enable this switch for encoding conversion (the encoding rule adheres to RFC3986).
     * @deprecated
     */
    @Deprecated
    public void setEncodeUrl(Boolean EncodeUrl) {
        this.EncodeUrl = EncodeUrl;
    }

    /**
     * Get This parameter is required when the node cache purge type is set to purge_cache_tag. The input value is a domain name. 
     * @return CacheTag This parameter is required when the node cache purge type is set to purge_cache_tag. The input value is a domain name.
     */
    public CacheTag getCacheTag() {
        return this.CacheTag;
    }

    /**
     * Set This parameter is required when the node cache purge type is set to purge_cache_tag. The input value is a domain name.
     * @param CacheTag This parameter is required when the node cache purge type is set to purge_cache_tag. The input value is a domain name.
     */
    public void setCacheTag(CacheTag CacheTag) {
        this.CacheTag = CacheTag;
    }

    public CreatePurgeTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePurgeTaskRequest(CreatePurgeTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
        if (source.EncodeUrl != null) {
            this.EncodeUrl = new Boolean(source.EncodeUrl);
        }
        if (source.CacheTag != null) {
            this.CacheTag = new CacheTag(source.CacheTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "EncodeUrl", this.EncodeUrl);
        this.setParamObj(map, prefix + "CacheTag.", this.CacheTag);

    }
}

