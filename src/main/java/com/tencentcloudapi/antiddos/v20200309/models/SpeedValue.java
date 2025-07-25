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

public class SpeedValue extends AbstractModel {

    /**
    * Rate limit value types:
`1`: packets per second (pps)
`2`: bits per second (bps)
]
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Value
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Rate limit value types:
`1`: packets per second (pps)
`2`: bits per second (bps)
] 
     * @return Type Rate limit value types:
`1`: packets per second (pps)
`2`: bits per second (bps)
]
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Rate limit value types:
`1`: packets per second (pps)
`2`: bits per second (bps)
]
     * @param Type Rate limit value types:
`1`: packets per second (pps)
`2`: bits per second (bps)
]
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Value 
     * @return Value Value
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Value
     * @param Value Value
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public SpeedValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedValue(SpeedValue source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

