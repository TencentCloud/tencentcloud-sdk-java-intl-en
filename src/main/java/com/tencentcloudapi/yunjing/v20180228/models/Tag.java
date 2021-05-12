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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel{

    /**
    * Tag ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Tag name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of servers
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Tag ID 
     * @return Id Tag ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Tag ID
     * @param Id Tag ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Tag name 
     * @return Name Tag name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tag name
     * @param Name Tag name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of servers 
     * @return Count Number of servers
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of servers
     * @param Count Number of servers
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

