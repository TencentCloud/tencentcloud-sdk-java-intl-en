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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicRetentionTimeConfigRsp extends AbstractModel {

    /**
    * Expected value, the message retention period (in minutes) set by user configuration.
    */
    @SerializedName("Expect")
    @Expose
    private Long Expect;

    /**
    * Current value, which is the current effective value (may contain dynamic adjustment in minutes).
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
    * Last modified time.
    */
    @SerializedName("ModTimeStamp")
    @Expose
    private Long ModTimeStamp;

    /**
     * Get Expected value, the message retention period (in minutes) set by user configuration. 
     * @return Expect Expected value, the message retention period (in minutes) set by user configuration.
     */
    public Long getExpect() {
        return this.Expect;
    }

    /**
     * Set Expected value, the message retention period (in minutes) set by user configuration.
     * @param Expect Expected value, the message retention period (in minutes) set by user configuration.
     */
    public void setExpect(Long Expect) {
        this.Expect = Expect;
    }

    /**
     * Get Current value, which is the current effective value (may contain dynamic adjustment in minutes). 
     * @return Current Current value, which is the current effective value (may contain dynamic adjustment in minutes).
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set Current value, which is the current effective value (may contain dynamic adjustment in minutes).
     * @param Current Current value, which is the current effective value (may contain dynamic adjustment in minutes).
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    /**
     * Get Last modified time. 
     * @return ModTimeStamp Last modified time.
     */
    public Long getModTimeStamp() {
        return this.ModTimeStamp;
    }

    /**
     * Set Last modified time.
     * @param ModTimeStamp Last modified time.
     */
    public void setModTimeStamp(Long ModTimeStamp) {
        this.ModTimeStamp = ModTimeStamp;
    }

    public TopicRetentionTimeConfigRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicRetentionTimeConfigRsp(TopicRetentionTimeConfigRsp source) {
        if (source.Expect != null) {
            this.Expect = new Long(source.Expect);
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
        if (source.ModTimeStamp != null) {
            this.ModTimeStamp = new Long(source.ModTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Expect", this.Expect);
        this.setParamSimple(map, prefix + "Current", this.Current);
        this.setParamSimple(map, prefix + "ModTimeStamp", this.ModTimeStamp);

    }
}

