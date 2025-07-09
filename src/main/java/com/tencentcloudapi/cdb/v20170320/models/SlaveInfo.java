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
    * Information of secondary server 1
    */
    @SerializedName("First")
    @Expose
    private SlaveInstanceInfo First;

    /**
    * Information of secondary server 2
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Second")
    @Expose
    private SlaveInstanceInfo Second;

    /**
     * Get Information of secondary server 1 
     * @return First Information of secondary server 1
     */
    public SlaveInstanceInfo getFirst() {
        return this.First;
    }

    /**
     * Set Information of secondary server 1
     * @param First Information of secondary server 1
     */
    public void setFirst(SlaveInstanceInfo First) {
        this.First = First;
    }

    /**
     * Get Information of secondary server 2
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Second Information of secondary server 2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SlaveInstanceInfo getSecond() {
        return this.Second;
    }

    /**
     * Set Information of secondary server 2
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Second Information of secondary server 2
Note: This field may return null, indicating that no valid values can be obtained.
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

