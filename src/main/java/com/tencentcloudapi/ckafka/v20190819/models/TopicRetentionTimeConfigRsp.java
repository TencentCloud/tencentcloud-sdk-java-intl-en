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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicRetentionTimeConfigRsp extends AbstractModel {

    /**
    * Expected value, i.e., the topic message retention time (min) configured
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Expect")
    @Expose
    private Long Expect;

    /**
    * Current value (min), i.e., the retention time currently in effect, which may be dynamically adjusted
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
    * Last modified time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ModTimeStamp")
    @Expose
    private Long ModTimeStamp;

    /**
     * Get Expected value, i.e., the topic message retention time (min) configured
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Expect Expected value, i.e., the topic message retention time (min) configured
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getExpect() {
        return this.Expect;
    }

    /**
     * Set Expected value, i.e., the topic message retention time (min) configured
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Expect Expected value, i.e., the topic message retention time (min) configured
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setExpect(Long Expect) {
        this.Expect = Expect;
    }

    /**
     * Get Current value (min), i.e., the retention time currently in effect, which may be dynamically adjusted
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Current Current value (min), i.e., the retention time currently in effect, which may be dynamically adjusted
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set Current value (min), i.e., the retention time currently in effect, which may be dynamically adjusted
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Current Current value (min), i.e., the retention time currently in effect, which may be dynamically adjusted
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    /**
     * Get Last modified time
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ModTimeStamp Last modified time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getModTimeStamp() {
        return this.ModTimeStamp;
    }

    /**
     * Set Last modified time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ModTimeStamp Last modified time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
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

