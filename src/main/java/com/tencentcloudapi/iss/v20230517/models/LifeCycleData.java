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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycleData extends AbstractModel {

    /**
    * Hot storage duration of cloud files in days. Minimum value: 1. Maximum value: 3650.
    */
    @SerializedName("Transition")
    @Expose
    private Long Transition;

    /**
    * Cold storage duration of cloud files in days. 0 means leave unset. The minimum is 60 days when set. The sum of the Expiration and Transition fields is no more than 3650 days.
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
     * Get Hot storage duration of cloud files in days. Minimum value: 1. Maximum value: 3650. 
     * @return Transition Hot storage duration of cloud files in days. Minimum value: 1. Maximum value: 3650.
     */
    public Long getTransition() {
        return this.Transition;
    }

    /**
     * Set Hot storage duration of cloud files in days. Minimum value: 1. Maximum value: 3650.
     * @param Transition Hot storage duration of cloud files in days. Minimum value: 1. Maximum value: 3650.
     */
    public void setTransition(Long Transition) {
        this.Transition = Transition;
    }

    /**
     * Get Cold storage duration of cloud files in days. 0 means leave unset. The minimum is 60 days when set. The sum of the Expiration and Transition fields is no more than 3650 days. 
     * @return Expiration Cold storage duration of cloud files in days. 0 means leave unset. The minimum is 60 days when set. The sum of the Expiration and Transition fields is no more than 3650 days.
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Cold storage duration of cloud files in days. 0 means leave unset. The minimum is 60 days when set. The sum of the Expiration and Transition fields is no more than 3650 days.
     * @param Expiration Cold storage duration of cloud files in days. 0 means leave unset. The minimum is 60 days when set. The sum of the Expiration and Transition fields is no more than 3650 days.
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    public LifeCycleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycleData(LifeCycleData source) {
        if (source.Transition != null) {
            this.Transition = new Long(source.Transition);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Transition", this.Transition);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

