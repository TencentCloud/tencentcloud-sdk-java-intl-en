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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RobLockState extends AbstractModel {

    /**
    * Whether to Grab the Lock
    */
    @SerializedName("IsRob")
    @Expose
    private Boolean IsRob;

    /**
    * Current Lock Holder
    */
    @SerializedName("Locker")
    @Expose
    private String Locker;

    /**
     * Get Whether to Grab the Lock 
     * @return IsRob Whether to Grab the Lock
     */
    public Boolean getIsRob() {
        return this.IsRob;
    }

    /**
     * Set Whether to Grab the Lock
     * @param IsRob Whether to Grab the Lock
     */
    public void setIsRob(Boolean IsRob) {
        this.IsRob = IsRob;
    }

    /**
     * Get Current Lock Holder 
     * @return Locker Current Lock Holder
     */
    public String getLocker() {
        return this.Locker;
    }

    /**
     * Set Current Lock Holder
     * @param Locker Current Lock Holder
     */
    public void setLocker(String Locker) {
        this.Locker = Locker;
    }

    public RobLockState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RobLockState(RobLockState source) {
        if (source.IsRob != null) {
            this.IsRob = new Boolean(source.IsRob);
        }
        if (source.Locker != null) {
            this.Locker = new String(source.Locker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsRob", this.IsRob);
        this.setParamSimple(map, prefix + "Locker", this.Locker);

    }
}

