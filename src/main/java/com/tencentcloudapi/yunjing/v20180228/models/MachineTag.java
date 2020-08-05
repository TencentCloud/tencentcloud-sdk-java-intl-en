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

public class MachineTag extends AbstractModel{

    /**
    * Associated tag ID
    */
    @SerializedName("Rid")
    @Expose
    private Long Rid;

    /**
    * Tag name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
     * Get Associated tag ID 
     * @return Rid Associated tag ID
     */
    public Long getRid() {
        return this.Rid;
    }

    /**
     * Set Associated tag ID
     * @param Rid Associated tag ID
     */
    public void setRid(Long Rid) {
        this.Rid = Rid;
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
     * Get  
     * @return TagId 
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set 
     * @param TagId 
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rid", this.Rid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TagId", this.TagId);

    }
}

