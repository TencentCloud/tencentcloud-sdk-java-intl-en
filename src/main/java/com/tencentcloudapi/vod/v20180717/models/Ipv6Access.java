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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ipv6Access extends AbstractModel {

    /**
    * Domain name enables ipv6 access configuration switch. The value is: <li>on: on; </li> <li>off: off. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Domain name enables ipv6 access configuration switch. The value is: <li>on: on; </li> <li>off: off. </li> 
     * @return Switch Domain name enables ipv6 access configuration switch. The value is: <li>on: on; </li> <li>off: off. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Domain name enables ipv6 access configuration switch. The value is: <li>on: on; </li> <li>off: off. </li>
     * @param Switch Domain name enables ipv6 access configuration switch. The value is: <li>on: on; </li> <li>off: off. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public Ipv6Access() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ipv6Access(Ipv6Access source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

