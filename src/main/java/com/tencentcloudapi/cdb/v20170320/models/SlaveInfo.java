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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaveInfo extends AbstractModel {

    /**
    * <p>Secondary server information of the top spot</p>
    */
    @SerializedName("First")
    @Expose
    private SlaveInstanceInfo First;

    /**
    * <p>Second standby machine information</p>
    */
    @SerializedName("Second")
    @Expose
    private SlaveInstanceInfo Second;

    /**
     * Get <p>Secondary server information of the top spot</p> 
     * @return First <p>Secondary server information of the top spot</p>
     */
    public SlaveInstanceInfo getFirst() {
        return this.First;
    }

    /**
     * Set <p>Secondary server information of the top spot</p>
     * @param First <p>Secondary server information of the top spot</p>
     */
    public void setFirst(SlaveInstanceInfo First) {
        this.First = First;
    }

    /**
     * Get <p>Second standby machine information</p> 
     * @return Second <p>Second standby machine information</p>
     */
    public SlaveInstanceInfo getSecond() {
        return this.Second;
    }

    /**
     * Set <p>Second standby machine information</p>
     * @param Second <p>Second standby machine information</p>
     */
    public void setSecond(SlaveInstanceInfo Second) {
        this.Second = Second;
    }

    public SlaveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveInfo(SlaveInfo source) {
        if (source.First != null) {
            this.First = new SlaveInstanceInfo(source.First);
        }
        if (source.Second != null) {
            this.Second = new SlaveInstanceInfo(source.Second);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "First.", this.First);
        this.setParamObj(map, prefix + "Second.", this.Second);

    }
}

