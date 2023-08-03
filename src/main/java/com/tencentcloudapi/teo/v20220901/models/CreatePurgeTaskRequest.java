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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePurgeTaskRequest extends AbstractModel{

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Purging mode. Valid values: 
<li>`purge_url`: Purge by URL;</li>
<li>`purge_prefix`: Purge by directory;</li>
<li>`purge_host`: Purge by hostname;</li>
<li>`purge_all`: Puege all cache;</li>
<li>`purge_cache_tag`: Purge by cache tag.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Resource to be purged, which depends on the `Type` field. 
1. When `Type = purge_host`: 
Enter the hostname, such as www.example.com and foo.bar.example.com. 
2. When `Type = purge_prefix`: 
Enter the prefix, such as http://www.example.com/example/. 
3. When `Type = purge_url`: 
Enter the URL, such as https://www.example.com/example.jpg. 
4. When `Type = purge_all`: 
`Targets` can be left empty. 
5. When `Type = purge_cache_tag`: 
Enter the cache tag, such as tag1. 
Note: The number of submitted tasks is limited by the quota of the plan. For details, see [Billing Overview](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
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
     * Get Purging mode. Valid values: 
<li>`purge_url`: Purge by URL;</li>
<li>`purge_prefix`: Purge by directory;</li>
<li>`purge_host`: Purge by hostname;</li>
<li>`purge_all`: Puege all cache;</li>
<li>`purge_cache_tag`: Purge by cache tag.</li> 
     * @return Type Purging mode. Valid values: 
<li>`purge_url`: Purge by URL;</li>
<li>`purge_prefix`: Purge by directory;</li>
<li>`purge_host`: Purge by hostname;</li>
<li>`purge_all`: Puege all cache;</li>
<li>`purge_cache_tag`: Purge by cache tag.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Purging mode. Valid values: 
<li>`purge_url`: Purge by URL;</li>
<li>`purge_prefix`: Purge by directory;</li>
<li>`purge_host`: Purge by hostname;</li>
<li>`purge_all`: Puege all cache;</li>
<li>`purge_cache_tag`: Purge by cache tag.</li>
     * @param Type Purging mode. Valid values: 
<li>`purge_url`: Purge by URL;</li>
<li>`purge_prefix`: Purge by directory;</li>
<li>`purge_host`: Purge by hostname;</li>
<li>`purge_all`: Puege all cache;</li>
<li>`purge_cache_tag`: Purge by cache tag.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Method 
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 
     * @param Method 
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Resource to be purged, which depends on the `Type` field. 
1. When `Type = purge_host`: 
Enter the hostname, such as www.example.com and foo.bar.example.com. 
2. When `Type = purge_prefix`: 
Enter the prefix, such as http://www.example.com/example/. 
3. When `Type = purge_url`: 
Enter the URL, such as https://www.example.com/example.jpg. 
4. When `Type = purge_all`: 
`Targets` can be left empty. 
5. When `Type = purge_cache_tag`: 
Enter the cache tag, such as tag1. 
Note: The number of submitted tasks is limited by the quota of the plan. For details, see [Billing Overview](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1). 
     * @return Targets Resource to be purged, which depends on the `Type` field. 
1. When `Type = purge_host`: 
Enter the hostname, such as www.example.com and foo.bar.example.com. 
2. When `Type = purge_prefix`: 
Enter the prefix, such as http://www.example.com/example/. 
3. When `Type = purge_url`: 
Enter the URL, such as https://www.example.com/example.jpg. 
4. When `Type = purge_all`: 
`Targets` can be left empty. 
5. When `Type = purge_cache_tag`: 
Enter the cache tag, such as tag1. 
Note: The number of submitted tasks is limited by the quota of the plan. For details, see [Billing Overview](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Resource to be purged, which depends on the `Type` field. 
1. When `Type = purge_host`: 
Enter the hostname, such as www.example.com and foo.bar.example.com. 
2. When `Type = purge_prefix`: 
Enter the prefix, such as http://www.example.com/example/. 
3. When `Type = purge_url`: 
Enter the URL, such as https://www.example.com/example.jpg. 
4. When `Type = purge_all`: 
`Targets` can be left empty. 
5. When `Type = purge_cache_tag`: 
Enter the cache tag, such as tag1. 
Note: The number of submitted tasks is limited by the quota of the plan. For details, see [Billing Overview](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
     * @param Targets Resource to be purged, which depends on the `Type` field. 
1. When `Type = purge_host`: 
Enter the hostname, such as www.example.com and foo.bar.example.com. 
2. When `Type = purge_prefix`: 
Enter the prefix, such as http://www.example.com/example/. 
3. When `Type = purge_url`: 
Enter the URL, such as https://www.example.com/example.jpg. 
4. When `Type = purge_all`: 
`Targets` can be left empty. 
5. When `Type = purge_cache_tag`: 
Enter the cache tag, such as tag1. 
Note: The number of submitted tasks is limited by the quota of the plan. For details, see [Billing Overview](https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1).
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

