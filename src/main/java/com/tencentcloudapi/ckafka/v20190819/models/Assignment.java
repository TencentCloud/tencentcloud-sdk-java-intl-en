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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Assignment extends AbstractModel{

    /**
    * Assignment version information
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * Topic information list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Topics")
    @Expose
    private GroupInfoTopics [] Topics;

    /**
     * Get Assignment version information 
     * @return Version Assignment version information
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Assignment version information
     * @param Version Assignment version information
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get Topic information list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Topics Topic information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public GroupInfoTopics [] getTopics() {
        return this.Topics;
    }

    /**
     * Set Topic information list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Topics Topic information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopics(GroupInfoTopics [] Topics) {
        this.Topics = Topics;
    }

    public Assignment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Assignment(Assignment source) {
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Topics != null) {
            this.Topics = new GroupInfoTopics[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new GroupInfoTopics(source.Topics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);

    }
}

