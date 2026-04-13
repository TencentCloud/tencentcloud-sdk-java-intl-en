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

public class TCRCEOption extends AbstractModel {

    /**
    * Channel information.
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * Enabled regions for RCE Channel. currently optional value ranges from: <li>ap-beijing: north china (beijing);</li><li>ap-jakarta: southeast asia pacific (jakarta);</li><li>ap-singapore: southeast asia pacific (singapore);</li><li>eu-frankfurt: Europe (frankfurt);</li><li>na-siliconvalley: west us (silicon valley).</li>.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Channel information. 
     * @return Channel Channel information.
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Channel information.
     * @param Channel Channel information.
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Enabled regions for RCE Channel. currently optional value ranges from: <li>ap-beijing: north china (beijing);</li><li>ap-jakarta: southeast asia pacific (jakarta);</li><li>ap-singapore: southeast asia pacific (singapore);</li><li>eu-frankfurt: Europe (frankfurt);</li><li>na-siliconvalley: west us (silicon valley).</li>. 
     * @return Region Enabled regions for RCE Channel. currently optional value ranges from: <li>ap-beijing: north china (beijing);</li><li>ap-jakarta: southeast asia pacific (jakarta);</li><li>ap-singapore: southeast asia pacific (singapore);</li><li>eu-frankfurt: Europe (frankfurt);</li><li>na-siliconvalley: west us (silicon valley).</li>.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Enabled regions for RCE Channel. currently optional value ranges from: <li>ap-beijing: north china (beijing);</li><li>ap-jakarta: southeast asia pacific (jakarta);</li><li>ap-singapore: southeast asia pacific (singapore);</li><li>eu-frankfurt: Europe (frankfurt);</li><li>na-siliconvalley: west us (silicon valley).</li>.
     * @param Region Enabled regions for RCE Channel. currently optional value ranges from: <li>ap-beijing: north china (beijing);</li><li>ap-jakarta: southeast asia pacific (jakarta);</li><li>ap-singapore: southeast asia pacific (singapore);</li><li>eu-frankfurt: Europe (frankfurt);</li><li>na-siliconvalley: west us (silicon valley).</li>.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public TCRCEOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCRCEOption(TCRCEOption source) {
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

