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
    * Zone id.
.
If you want to quickly submit targets urls under different sites, you can set it to *, but the account calling this api must have permission for all site resources under the main account.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Type of cache purging. Values:
<li>`purge_url`: Purge by the URL</li>
<li>`purge_prefix`: Purge by the directory</li>
<li>`purge_host`: Purge by the hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by the cache-tag </li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Node cache clearing method is valid for directory refresh, Hostname refresh, and refresh all cache types. valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li> <li> delete: refresh node resources regardless of whether resources under the directory are updated.</li> default value: invalidate.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * The list of resources to purge cache, such as https://www.example.com/example.jpg, must carry protocol information. the format for multi-elements depends on the type of cache purging. refer to the following API call example.  <li>the number of tasks that can be submitted at a time is limited by the billing package quota. check [EO billing package](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).</li>.
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * Specifies whether to transcode non-ASCII URLs according to RFC3986.
Note that if it’s enabled, the purging is based on the converted URLs.
    */
    @SerializedName("EncodeUrl")
    @Expose
    private Boolean EncodeUrl;

    /**
    * The information attached when the node cache purge type is set to purge_cache_tag.
    */
    @SerializedName("CacheTag")
    @Expose
    private CacheTag CacheTag;

    /**
     * Get Zone id.
.
If you want to quickly submit targets urls under different sites, you can set it to *, but the account calling this api must have permission for all site resources under the main account. 
     * @return ZoneId Zone id.
.
If you want to quickly submit targets urls under different sites, you can set it to *, but the account calling this api must have permission for all site resources under the main account.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.
.
If you want to quickly submit targets urls under different sites, you can set it to *, but the account calling this api must have permission for all site resources under the main account.
     * @param ZoneId Zone id.
.
If you want to quickly submit targets urls under different sites, you can set it to *, but the account calling this api must have permission for all site resources under the main account.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Type of cache purging. Values:
<li>`purge_url`: Purge by the URL</li>
<li>`purge_prefix`: Purge by the directory</li>
<li>`purge_host`: Purge by the hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by the cache-tag </li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1). 
     * @return Type Type of cache purging. Values:
<li>`purge_url`: Purge by the URL</li>
<li>`purge_prefix`: Purge by the directory</li>
<li>`purge_host`: Purge by the hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by the cache-tag </li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of cache purging. Values:
<li>`purge_url`: Purge by the URL</li>
<li>`purge_prefix`: Purge by the directory</li>
<li>`purge_host`: Purge by the hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by the cache-tag </li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1).
     * @param Type Type of cache purging. Values:
<li>`purge_url`: Purge by the URL</li>
<li>`purge_prefix`: Purge by the directory</li>
<li>`purge_host`: Purge by the hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by the cache-tag </li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Node cache clearing method is valid for directory refresh, Hostname refresh, and refresh all cache types. valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li> <li> delete: refresh node resources regardless of whether resources under the directory are updated.</li> default value: invalidate. 
     * @return Method Node cache clearing method is valid for directory refresh, Hostname refresh, and refresh all cache types. valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li> <li> delete: refresh node resources regardless of whether resources under the directory are updated.</li> default value: invalidate.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Node cache clearing method is valid for directory refresh, Hostname refresh, and refresh all cache types. valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li> <li> delete: refresh node resources regardless of whether resources under the directory are updated.</li> default value: invalidate.
     * @param Method Node cache clearing method is valid for directory refresh, Hostname refresh, and refresh all cache types. valid values: <li> invalidate: refresh only resources that have been updated under the directory;</li> <li> delete: refresh node resources regardless of whether resources under the directory are updated.</li> default value: invalidate.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get The list of resources to purge cache, such as https://www.example.com/example.jpg, must carry protocol information. the format for multi-elements depends on the type of cache purging. refer to the following API call example.  <li>the number of tasks that can be submitted at a time is limited by the billing package quota. check [EO billing package](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).</li>. 
     * @return Targets The list of resources to purge cache, such as https://www.example.com/example.jpg, must carry protocol information. the format for multi-elements depends on the type of cache purging. refer to the following API call example.  <li>the number of tasks that can be submitted at a time is limited by the billing package quota. check [EO billing package](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).</li>.
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set The list of resources to purge cache, such as https://www.example.com/example.jpg, must carry protocol information. the format for multi-elements depends on the type of cache purging. refer to the following API call example.  <li>the number of tasks that can be submitted at a time is limited by the billing package quota. check [EO billing package](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).</li>.
     * @param Targets The list of resources to purge cache, such as https://www.example.com/example.jpg, must carry protocol information. the format for multi-elements depends on the type of cache purging. refer to the following API call example.  <li>the number of tasks that can be submitted at a time is limited by the billing package quota. check [EO billing package](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).</li>.
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Specifies whether to transcode non-ASCII URLs according to RFC3986.
Note that if it’s enabled, the purging is based on the converted URLs. 
     * @return EncodeUrl Specifies whether to transcode non-ASCII URLs according to RFC3986.
Note that if it’s enabled, the purging is based on the converted URLs.
     * @deprecated
     */
    @Deprecated
    public Boolean getEncodeUrl() {
        return this.EncodeUrl;
    }

    /**
     * Set Specifies whether to transcode non-ASCII URLs according to RFC3986.
Note that if it’s enabled, the purging is based on the converted URLs.
     * @param EncodeUrl Specifies whether to transcode non-ASCII URLs according to RFC3986.
Note that if it’s enabled, the purging is based on the converted URLs.
     * @deprecated
     */
    @Deprecated
    public void setEncodeUrl(Boolean EncodeUrl) {
        this.EncodeUrl = EncodeUrl;
    }

    /**
     * Get The information attached when the node cache purge type is set to purge_cache_tag. 
     * @return CacheTag The information attached when the node cache purge type is set to purge_cache_tag.
     */
    public CacheTag getCacheTag() {
        return this.CacheTag;
    }

    /**
     * Set The information attached when the node cache purge type is set to purge_cache_tag.
     * @param CacheTag The information attached when the node cache purge type is set to purge_cache_tag.
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

