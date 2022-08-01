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

public class Cache extends AbstractModel{

    /**
    * Basic cache expiration time configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SimpleCache")
    @Expose
    private SimpleCache SimpleCache;

    /**
    * (Disused) Advanced cache validity configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AdvancedCache")
    @Expose
    private AdvancedCache AdvancedCache;

    /**
    * Advanced path cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleCache")
    @Expose
    private RuleCache [] RuleCache;

    /**
     * Get Basic cache expiration time configuration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SimpleCache Basic cache expiration time configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public SimpleCache getSimpleCache() {
        return this.SimpleCache;
    }

    /**
     * Set Basic cache expiration time configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SimpleCache Basic cache expiration time configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSimpleCache(SimpleCache SimpleCache) {
        this.SimpleCache = SimpleCache;
    }

    /**
     * Get (Disused) Advanced cache validity configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AdvancedCache (Disused) Advanced cache validity configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AdvancedCache getAdvancedCache() {
        return this.AdvancedCache;
    }

    /**
     * Set (Disused) Advanced cache validity configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AdvancedCache (Disused) Advanced cache validity configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAdvancedCache(AdvancedCache AdvancedCache) {
        this.AdvancedCache = AdvancedCache;
    }

    /**
     * Get Advanced path cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleCache Advanced path cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RuleCache [] getRuleCache() {
        return this.RuleCache;
    }

    /**
     * Set Advanced path cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleCache Advanced path cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleCache(RuleCache [] RuleCache) {
        this.RuleCache = RuleCache;
    }

    public Cache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cache(Cache source) {
        if (source.SimpleCache != null) {
            this.SimpleCache = new SimpleCache(source.SimpleCache);
        }
        if (source.AdvancedCache != null) {
            this.AdvancedCache = new AdvancedCache(source.AdvancedCache);
        }
        if (source.RuleCache != null) {
            this.RuleCache = new RuleCache[source.RuleCache.length];
            for (int i = 0; i < source.RuleCache.length; i++) {
                this.RuleCache[i] = new RuleCache(source.RuleCache[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SimpleCache.", this.SimpleCache);
        this.setParamObj(map, prefix + "AdvancedCache.", this.AdvancedCache);
        this.setParamArrayObj(map, prefix + "RuleCache.", this.RuleCache);

    }
}

