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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterConfig extends AbstractModel{

    /**
    * Dead letter queue mode
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Dead letter queue name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag form of a dead letter queue topic mode
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
     * Get Dead letter queue mode 
     * @return Type Dead letter queue mode
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Dead letter queue mode
     * @param Type Dead letter queue mode
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Dead letter queue name 
     * @return Name Dead letter queue name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dead letter queue name
     * @param Name Dead letter queue name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag form of a dead letter queue topic mode 
     * @return FilterType Tag form of a dead letter queue topic mode
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Tag form of a dead letter queue topic mode
     * @param FilterType Tag form of a dead letter queue topic mode
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);

    }
}

