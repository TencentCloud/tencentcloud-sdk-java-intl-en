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

public class CreatePrefetchTaskRequest extends AbstractModel {

    /**
    * Zone ID.

If you wish to quickly submit Targets urls under different sites, you can fill in * as the value. but the premise is that the account calling this API must have the permission to all site resources under the root account.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of resources to be preheated. Each element format is similar to the following:
http://www.example.com/example.txt. The parameter value is currently required.
Note: The number of tasks that can be submitted is limited by the quota of a billing package. For details, see [Billing Overview] (https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * Whether to encode a URL according to RFC3986. Enable this field when the URL contains non-ASCII characters.
    */
    @SerializedName("EncodeUrl")
    @Expose
    private Boolean EncodeUrl;

    /**
    * HTTP header information
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
    * Media fragment preheating control. valid values:.
<Li>On: enables shard preheating, preheats the description file, and performs recursive resolution of the description file shards for preheating.</li>.
<Li>Off: only preheat the submitted description file.</li>default value: off if left empty.

Notes:.
1. the supported description file is M3U8, and the corresponding shard is TS.
Describes the requirement that the description file can process normal requests and specify the sharding path as per industry standards.
Recursive resolution depth is no more than 3.
Parsed shards normally accumulate daily pre-warming amount. when usage exceeds the quota limit, silent processing is triggered and preheating is no longer executed.

This parameter specifies the allowlist feature. if necessary, contact tencent cloud engineers.
    */
    @SerializedName("PrefetchMediaSegments")
    @Expose
    private String PrefetchMediaSegments;

    /**
     * Get Zone ID.

If you wish to quickly submit Targets urls under different sites, you can fill in * as the value. but the premise is that the account calling this API must have the permission to all site resources under the root account. 
     * @return ZoneId Zone ID.

If you wish to quickly submit Targets urls under different sites, you can fill in * as the value. but the premise is that the account calling this API must have the permission to all site resources under the root account.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.

If you wish to quickly submit Targets urls under different sites, you can fill in * as the value. but the premise is that the account calling this API must have the permission to all site resources under the root account.
     * @param ZoneId Zone ID.

If you wish to quickly submit Targets urls under different sites, you can fill in * as the value. but the premise is that the account calling this API must have the permission to all site resources under the root account.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of resources to be preheated. Each element format is similar to the following:
http://www.example.com/example.txt. The parameter value is currently required.
Note: The number of tasks that can be submitted is limited by the quota of a billing package. For details, see [Billing Overview] (https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). 
     * @return Targets List of resources to be preheated. Each element format is similar to the following:
http://www.example.com/example.txt. The parameter value is currently required.
Note: The number of tasks that can be submitted is limited by the quota of a billing package. For details, see [Billing Overview] (https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of resources to be preheated. Each element format is similar to the following:
http://www.example.com/example.txt. The parameter value is currently required.
Note: The number of tasks that can be submitted is limited by the quota of a billing package. For details, see [Billing Overview] (https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
     * @param Targets List of resources to be preheated. Each element format is similar to the following:
http://www.example.com/example.txt. The parameter value is currently required.
Note: The number of tasks that can be submitted is limited by the quota of a billing package. For details, see [Billing Overview] (https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Whether to encode a URL according to RFC3986. Enable this field when the URL contains non-ASCII characters. 
     * @return EncodeUrl Whether to encode a URL according to RFC3986. Enable this field when the URL contains non-ASCII characters.
     * @deprecated
     */
    @Deprecated
    public Boolean getEncodeUrl() {
        return this.EncodeUrl;
    }

    /**
     * Set Whether to encode a URL according to RFC3986. Enable this field when the URL contains non-ASCII characters.
     * @param EncodeUrl Whether to encode a URL according to RFC3986. Enable this field when the URL contains non-ASCII characters.
     * @deprecated
     */
    @Deprecated
    public void setEncodeUrl(Boolean EncodeUrl) {
        this.EncodeUrl = EncodeUrl;
    }

    /**
     * Get HTTP header information 
     * @return Headers HTTP header information
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set HTTP header information
     * @param Headers HTTP header information
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Media fragment preheating control. valid values:.
<Li>On: enables shard preheating, preheats the description file, and performs recursive resolution of the description file shards for preheating.</li>.
<Li>Off: only preheat the submitted description file.</li>default value: off if left empty.

Notes:.
1. the supported description file is M3U8, and the corresponding shard is TS.
Describes the requirement that the description file can process normal requests and specify the sharding path as per industry standards.
Recursive resolution depth is no more than 3.
Parsed shards normally accumulate daily pre-warming amount. when usage exceeds the quota limit, silent processing is triggered and preheating is no longer executed.

This parameter specifies the allowlist feature. if necessary, contact tencent cloud engineers. 
     * @return PrefetchMediaSegments Media fragment preheating control. valid values:.
<Li>On: enables shard preheating, preheats the description file, and performs recursive resolution of the description file shards for preheating.</li>.
<Li>Off: only preheat the submitted description file.</li>default value: off if left empty.

Notes:.
1. the supported description file is M3U8, and the corresponding shard is TS.
Describes the requirement that the description file can process normal requests and specify the sharding path as per industry standards.
Recursive resolution depth is no more than 3.
Parsed shards normally accumulate daily pre-warming amount. when usage exceeds the quota limit, silent processing is triggered and preheating is no longer executed.

This parameter specifies the allowlist feature. if necessary, contact tencent cloud engineers.
     */
    public String getPrefetchMediaSegments() {
        return this.PrefetchMediaSegments;
    }

    /**
     * Set Media fragment preheating control. valid values:.
<Li>On: enables shard preheating, preheats the description file, and performs recursive resolution of the description file shards for preheating.</li>.
<Li>Off: only preheat the submitted description file.</li>default value: off if left empty.

Notes:.
1. the supported description file is M3U8, and the corresponding shard is TS.
Describes the requirement that the description file can process normal requests and specify the sharding path as per industry standards.
Recursive resolution depth is no more than 3.
Parsed shards normally accumulate daily pre-warming amount. when usage exceeds the quota limit, silent processing is triggered and preheating is no longer executed.

This parameter specifies the allowlist feature. if necessary, contact tencent cloud engineers.
     * @param PrefetchMediaSegments Media fragment preheating control. valid values:.
<Li>On: enables shard preheating, preheats the description file, and performs recursive resolution of the description file shards for preheating.</li>.
<Li>Off: only preheat the submitted description file.</li>default value: off if left empty.

Notes:.
1. the supported description file is M3U8, and the corresponding shard is TS.
Describes the requirement that the description file can process normal requests and specify the sharding path as per industry standards.
Recursive resolution depth is no more than 3.
Parsed shards normally accumulate daily pre-warming amount. when usage exceeds the quota limit, silent processing is triggered and preheating is no longer executed.

This parameter specifies the allowlist feature. if necessary, contact tencent cloud engineers.
     */
    public void setPrefetchMediaSegments(String PrefetchMediaSegments) {
        this.PrefetchMediaSegments = PrefetchMediaSegments;
    }

    public CreatePrefetchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrefetchTaskRequest(CreatePrefetchTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        if (source.Headers != null) {
            this.Headers = new Header[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new Header(source.Headers[i]);
            }
        }
        if (source.PrefetchMediaSegments != null) {
            this.PrefetchMediaSegments = new String(source.PrefetchMediaSegments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "EncodeUrl", this.EncodeUrl);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "PrefetchMediaSegments", this.PrefetchMediaSegments);

    }
}

