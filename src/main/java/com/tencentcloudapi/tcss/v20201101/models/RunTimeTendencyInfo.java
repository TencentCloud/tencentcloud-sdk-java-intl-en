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

public class RunTimeTendencyInfo extends AbstractModel{

    /**
    * The time of the day
    */
    @SerializedName("CurTime")
    @Expose
    private String CurTime;

    /**
    * Current quantity
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
     * Get The time of the day 
     * @return CurTime The time of the day
     */
    public String getCurTime() {
        return this.CurTime;
    }

    /**
     * Set The time of the day
     * @param CurTime The time of the day
     */
    public void setCurTime(String CurTime) {
        this.CurTime = CurTime;
    }

    /**
     * Get Current quantity 
     * @return Cnt Current quantity
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set Current quantity
     * @param Cnt Current quantity
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    public RunTimeTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunTimeTendencyInfo(RunTimeTendencyInfo source) {
        if (source.CurTime != null) {
            this.CurTime = new String(source.CurTime);
        }
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurTime", this.CurTime);
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);

    }
}

