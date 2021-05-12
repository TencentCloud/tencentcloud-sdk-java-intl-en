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

public class PurgePathCacheRequest extends AbstractModel{

    /**
    * List of directories. The protocol header such as "http://" or "https://" needs to be included.
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * Purge type:
`flush`: purges updated resources
`delete`: purges all resources
    */
    @SerializedName("FlushType")
    @Expose
    private String FlushType;

    /**
    * Whether to encode Chinese characters before purge.
    */
    @SerializedName("UrlEncode")
    @Expose
    private Boolean UrlEncode;

    /**
     * Get List of directories. The protocol header such as "http://" or "https://" needs to be included. 
     * @return Paths List of directories. The protocol header such as "http://" or "https://" needs to be included.
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set List of directories. The protocol header such as "http://" or "https://" needs to be included.
     * @param Paths List of directories. The protocol header such as "http://" or "https://" needs to be included.
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get Purge type:
`flush`: purges updated resources
`delete`: purges all resources 
     * @return FlushType Purge type:
`flush`: purges updated resources
`delete`: purges all resources
     */
    public String getFlushType() {
        return this.FlushType;
    }

    /**
     * Set Purge type:
`flush`: purges updated resources
`delete`: purges all resources
     * @param FlushType Purge type:
`flush`: purges updated resources
`delete`: purges all resources
     */
    public void setFlushType(String FlushType) {
        this.FlushType = FlushType;
    }

    /**
     * Get Whether to encode Chinese characters before purge. 
     * @return UrlEncode Whether to encode Chinese characters before purge.
     */
    public Boolean getUrlEncode() {
        return this.UrlEncode;
    }

    /**
     * Set Whether to encode Chinese characters before purge.
     * @param UrlEncode Whether to encode Chinese characters before purge.
     */
    public void setUrlEncode(Boolean UrlEncode) {
        this.UrlEncode = UrlEncode;
    }

    public PurgePathCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgePathCacheRequest(PurgePathCacheRequest source) {
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.FlushType != null) {
            this.FlushType = new String(source.FlushType);
        }
        if (source.UrlEncode != null) {
            this.UrlEncode = new Boolean(source.UrlEncode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamSimple(map, prefix + "FlushType", this.FlushType);
        this.setParamSimple(map, prefix + "UrlEncode", this.UrlEncode);

    }
}

