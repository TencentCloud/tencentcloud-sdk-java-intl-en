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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePurgeTaskRequest extends AbstractModel {

    /**
    * ID of the site.
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
    * Configures how resources under the directory are purged when `Type = purge_prefix`. Values: <li>`invalidate`: Only resources updated under the directory are purged.</li><li>`delete`: All resources under the directory are purged regardless of whether they are updated. </li>Default value: `invalidate`.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * List of cached resources to purge. The format for input depends on the type of cache purging. See examples below for details. <li>By default, non-ASCII characters u200dare escaped based on RFC3986.</li><li>The maximum number of tasks per purging request is determined by the EdgeOne plan. See [Billing Overview (New)](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). </li>
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
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
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
     * Get Configures how resources under the directory are purged when `Type = purge_prefix`. Values: <li>`invalidate`: Only resources updated under the directory are purged.</li><li>`delete`: All resources under the directory are purged regardless of whether they are updated. </li>Default value: `invalidate`. 
     * @return Method Configures how resources under the directory are purged when `Type = purge_prefix`. Values: <li>`invalidate`: Only resources updated under the directory are purged.</li><li>`delete`: All resources under the directory are purged regardless of whether they are updated. </li>Default value: `invalidate`.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Configures how resources under the directory are purged when `Type = purge_prefix`. Values: <li>`invalidate`: Only resources updated under the directory are purged.</li><li>`delete`: All resources under the directory are purged regardless of whether they are updated. </li>Default value: `invalidate`.
     * @param Method Configures how resources under the directory are purged when `Type = purge_prefix`. Values: <li>`invalidate`: Only resources updated under the directory are purged.</li><li>`delete`: All resources under the directory are purged regardless of whether they are updated. </li>Default value: `invalidate`.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get List of cached resources to purge. The format for input depends on the type of cache purging. See examples below for details. <li>By default, non-ASCII characters u200dare escaped based on RFC3986.</li><li>The maximum number of tasks per purging request is determined by the EdgeOne plan. See [Billing Overview (New)](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). </li> 
     * @return Targets List of cached resources to purge. The format for input depends on the type of cache purging. See examples below for details. <li>By default, non-ASCII characters u200dare escaped based on RFC3986.</li><li>The maximum number of tasks per purging request is determined by the EdgeOne plan. See [Billing Overview (New)](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). </li>
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of cached resources to purge. The format for input depends on the type of cache purging. See examples below for details. <li>By default, non-ASCII characters u200dare escaped based on RFC3986.</li><li>The maximum number of tasks per purging request is determined by the EdgeOne plan. See [Billing Overview (New)](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). </li>
     * @param Targets List of cached resources to purge. The format for input depends on the type of cache purging. See examples below for details. <li>By default, non-ASCII characters u200dare escaped based on RFC3986.</li><li>The maximum number of tasks per purging request is determined by the EdgeOne plan. See [Billing Overview (New)](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). </li>
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

    }
}

