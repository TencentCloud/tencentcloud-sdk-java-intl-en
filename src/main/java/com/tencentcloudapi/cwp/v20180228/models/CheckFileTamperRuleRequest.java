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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckFileTamperRuleRequest extends AbstractModel {

    /**
    * Name of rule to be entered
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule ID passed during editing
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Name of rule to be entered 
     * @return Name Name of rule to be entered
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of rule to be entered
     * @param Name Name of rule to be entered
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule ID passed during editing 
     * @return Id Rule ID passed during editing
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID passed during editing
     * @param Id Rule ID passed during editing
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public CheckFileTamperRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckFileTamperRuleRequest(CheckFileTamperRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

