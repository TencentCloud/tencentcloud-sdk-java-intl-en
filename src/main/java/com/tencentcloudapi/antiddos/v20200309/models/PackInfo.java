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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackInfo extends AbstractModel {

    /**
    * Package type. Valid values:
`staticpack`: non-BGP package
`insurance`: guarantee package
]
    */
    @SerializedName("PackType")
    @Expose
    private String PackType;

    /**
    * Package ID
    */
    @SerializedName("PackId")
    @Expose
    private String PackId;

    /**
     * Get Package type. Valid values:
`staticpack`: non-BGP package
`insurance`: guarantee package
] 
     * @return PackType Package type. Valid values:
`staticpack`: non-BGP package
`insurance`: guarantee package
]
     */
    public String getPackType() {
        return this.PackType;
    }

    /**
     * Set Package type. Valid values:
`staticpack`: non-BGP package
`insurance`: guarantee package
]
     * @param PackType Package type. Valid values:
`staticpack`: non-BGP package
`insurance`: guarantee package
]
     */
    public void setPackType(String PackType) {
        this.PackType = PackType;
    }

    /**
     * Get Package ID 
     * @return PackId Package ID
     */
    public String getPackId() {
        return this.PackId;
    }

    /**
     * Set Package ID
     * @param PackId Package ID
     */
    public void setPackId(String PackId) {
        this.PackId = PackId;
    }

    public PackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackInfo(PackInfo source) {
        if (source.PackType != null) {
            this.PackType = new String(source.PackType);
        }
        if (source.PackId != null) {
            this.PackId = new String(source.PackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackType", this.PackType);
        this.setParamSimple(map, prefix + "PackId", this.PackId);

    }
}

