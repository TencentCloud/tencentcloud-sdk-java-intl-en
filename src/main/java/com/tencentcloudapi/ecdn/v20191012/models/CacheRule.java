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

public class CacheRule extends AbstractModel{

    /**
    * Cache type. Valid values: all (all files), file (extension type), directory (directory), path (full path), index (homepage).
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * Cached content list.
    */
    @SerializedName("CacheContents")
    @Expose
    private String [] CacheContents;

    /**
    * Cache time in seconds.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Cache type. Valid values: all (all files), file (extension type), directory (directory), path (full path), index (homepage). 
     * @return CacheType Cache type. Valid values: all (all files), file (extension type), directory (directory), path (full path), index (homepage).
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set Cache type. Valid values: all (all files), file (extension type), directory (directory), path (full path), index (homepage).
     * @param CacheType Cache type. Valid values: all (all files), file (extension type), directory (directory), path (full path), index (homepage).
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get Cached content list. 
     * @return CacheContents Cached content list.
     */
    public String [] getCacheContents() {
        return this.CacheContents;
    }

    /**
     * Set Cached content list.
     * @param CacheContents Cached content list.
     */
    public void setCacheContents(String [] CacheContents) {
        this.CacheContents = CacheContents;
    }

    /**
     * Get Cache time in seconds. 
     * @return CacheTime Cache time in seconds.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache time in seconds.
     * @param CacheTime Cache time in seconds.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public CacheRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheRule(CacheRule source) {
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.CacheContents != null) {
            this.CacheContents = new String[source.CacheContents.length];
            for (int i = 0; i < source.CacheContents.length; i++) {
                this.CacheContents[i] = new String(source.CacheContents[i]);
            }
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamArraySimple(map, prefix + "CacheContents.", this.CacheContents);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

