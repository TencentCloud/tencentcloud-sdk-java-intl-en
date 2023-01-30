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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunTimeRiskInfo extends AbstractModel{

    /**
    * Number
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
    * Risk level:
`CRITICAL`: Critical.
`HIGH`: High.
`MEDIUM`: Medium.
`LOW`: Low.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
     * Get Number 
     * @return Cnt Number
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set Number
     * @param Cnt Number
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    /**
     * Get Risk level:
`CRITICAL`: Critical.
`HIGH`: High.
`MEDIUM`: Medium.
`LOW`: Low. 
     * @return Level Risk level:
`CRITICAL`: Critical.
`HIGH`: High.
`MEDIUM`: Medium.
`LOW`: Low.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level:
`CRITICAL`: Critical.
`HIGH`: High.
`MEDIUM`: Medium.
`LOW`: Low.
     * @param Level Risk level:
`CRITICAL`: Critical.
`HIGH`: High.
`MEDIUM`: Medium.
`LOW`: Low.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    public RunTimeRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunTimeRiskInfo(RunTimeRiskInfo source) {
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

