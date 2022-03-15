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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEventBusRequest extends AbstractModel{

    /**
    * Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * Event bus description, which can contain up to 200 characters of any type
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter 
     * @return EventBusName Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     * @param EventBusName Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get Event bus description, which can contain up to 200 characters of any type 
     * @return Description Event bus description, which can contain up to 200 characters of any type
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event bus description, which can contain up to 200 characters of any type
     * @param Description Event bus description, which can contain up to 200 characters of any type
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateEventBusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEventBusRequest(CreateEventBusRequest source) {
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

