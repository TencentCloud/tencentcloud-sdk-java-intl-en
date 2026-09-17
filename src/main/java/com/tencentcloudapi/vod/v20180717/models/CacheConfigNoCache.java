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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfigNoCache extends AbstractModel {

    /**
    * Path cache no cache configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Always validate against the origin server. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("Revalidate")
    @Expose
    private String Revalidate;

    /**
     * Get Path cache no cache configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return Switch Path cache no cache configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Path cache no cache configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param Switch Path cache no cache configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Always validate against the origin server. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return Revalidate Always validate against the origin server. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getRevalidate() {
        return this.Revalidate;
    }

    /**
     * Set Always validate against the origin server. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param Revalidate Always validate against the origin server. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setRevalidate(String Revalidate) {
        this.Revalidate = Revalidate;
    }

    public CacheConfigNoCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigNoCache(CacheConfigNoCache source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Revalidate != null) {
            this.Revalidate = new String(source.Revalidate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Revalidate", this.Revalidate);

    }
}

