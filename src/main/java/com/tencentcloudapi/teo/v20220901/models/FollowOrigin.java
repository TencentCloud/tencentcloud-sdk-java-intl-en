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

public class FollowOrigin extends AbstractModel {

    /**
    * Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Sets the default cache time when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DefaultCacheTime")
    @Expose
    private Long DefaultCacheTime;

    /**
    * Specifies whether to enable cache when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DefaultCache")
    @Expose
    private String DefaultCache;

    /**
    * Specifies whether to use the default caching policy when Cache-Control is not returned from the origin
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DefaultCacheStrategy")
    @Expose
    private String DefaultCacheStrategy;

    /**
     * Get Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Sets the default cache time when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DefaultCacheTime Sets the default cache time when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getDefaultCacheTime() {
        return this.DefaultCacheTime;
    }

    /**
     * Set Sets the default cache time when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DefaultCacheTime Sets the default cache time when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDefaultCacheTime(Long DefaultCacheTime) {
        this.DefaultCacheTime = DefaultCacheTime;
    }

    /**
     * Get Specifies whether to enable cache when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DefaultCache Specifies whether to enable cache when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDefaultCache() {
        return this.DefaultCache;
    }

    /**
     * Set Specifies whether to enable cache when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DefaultCache Specifies whether to enable cache when the origin server does not return the Cache-Control header.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDefaultCache(String DefaultCache) {
        this.DefaultCache = DefaultCache;
    }

    /**
     * Get Specifies whether to use the default caching policy when Cache-Control is not returned from the origin
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DefaultCacheStrategy Specifies whether to use the default caching policy when Cache-Control is not returned from the origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDefaultCacheStrategy() {
        return this.DefaultCacheStrategy;
    }

    /**
     * Set Specifies whether to use the default caching policy when Cache-Control is not returned from the origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DefaultCacheStrategy Specifies whether to use the default caching policy when Cache-Control is not returned from the origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDefaultCacheStrategy(String DefaultCacheStrategy) {
        this.DefaultCacheStrategy = DefaultCacheStrategy;
    }

    public FollowOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FollowOrigin(FollowOrigin source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.DefaultCacheTime != null) {
            this.DefaultCacheTime = new Long(source.DefaultCacheTime);
        }
        if (source.DefaultCache != null) {
            this.DefaultCache = new String(source.DefaultCache);
        }
        if (source.DefaultCacheStrategy != null) {
            this.DefaultCacheStrategy = new String(source.DefaultCacheStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "DefaultCacheTime", this.DefaultCacheTime);
        this.setParamSimple(map, prefix + "DefaultCache", this.DefaultCache);
        this.setParamSimple(map, prefix + "DefaultCacheStrategy", this.DefaultCacheStrategy);

    }
}

