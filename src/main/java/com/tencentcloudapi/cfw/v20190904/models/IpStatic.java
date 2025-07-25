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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpStatic extends AbstractModel {

    /**
    * Value
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Time shown on the x-axis of the line graph
    */
    @SerializedName("StatTime")
    @Expose
    private String StatTime;

    /**
     * Get Value 
     * @return Num Value
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Value
     * @param Num Value
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get Time shown on the x-axis of the line graph 
     * @return StatTime Time shown on the x-axis of the line graph
     */
    public String getStatTime() {
        return this.StatTime;
    }

    /**
     * Set Time shown on the x-axis of the line graph
     * @param StatTime Time shown on the x-axis of the line graph
     */
    public void setStatTime(String StatTime) {
        this.StatTime = StatTime;
    }

    public IpStatic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpStatic(IpStatic source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.StatTime != null) {
            this.StatTime = new String(source.StatTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "StatTime", this.StatTime);

    }
}

