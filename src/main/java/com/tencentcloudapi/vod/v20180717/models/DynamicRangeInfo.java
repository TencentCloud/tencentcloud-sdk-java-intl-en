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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicRangeInfo extends AbstractModel{

    /**
    * The dynamic range information. Valid values:
<li>`SDR`: Standard Dynamic Range</li>
<li>`HDR`: High Dynamic Range</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The HDR type. This parameter is valid only if `Type` is `HDR`. Valid values:
<li>`hdr10`</li>
<li>`hlg`</li>
    */
    @SerializedName("HDRType")
    @Expose
    private String HDRType;

    /**
     * Get The dynamic range information. Valid values:
<li>`SDR`: Standard Dynamic Range</li>
<li>`HDR`: High Dynamic Range</li> 
     * @return Type The dynamic range information. Valid values:
<li>`SDR`: Standard Dynamic Range</li>
<li>`HDR`: High Dynamic Range</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The dynamic range information. Valid values:
<li>`SDR`: Standard Dynamic Range</li>
<li>`HDR`: High Dynamic Range</li>
     * @param Type The dynamic range information. Valid values:
<li>`SDR`: Standard Dynamic Range</li>
<li>`HDR`: High Dynamic Range</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The HDR type. This parameter is valid only if `Type` is `HDR`. Valid values:
<li>`hdr10`</li>
<li>`hlg`</li> 
     * @return HDRType The HDR type. This parameter is valid only if `Type` is `HDR`. Valid values:
<li>`hdr10`</li>
<li>`hlg`</li>
     */
    public String getHDRType() {
        return this.HDRType;
    }

    /**
     * Set The HDR type. This parameter is valid only if `Type` is `HDR`. Valid values:
<li>`hdr10`</li>
<li>`hlg`</li>
     * @param HDRType The HDR type. This parameter is valid only if `Type` is `HDR`. Valid values:
<li>`hdr10`</li>
<li>`hlg`</li>
     */
    public void setHDRType(String HDRType) {
        this.HDRType = HDRType;
    }

    public DynamicRangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicRangeInfo(DynamicRangeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.HDRType != null) {
            this.HDRType = new String(source.HDRType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HDRType", this.HDRType);

    }
}

