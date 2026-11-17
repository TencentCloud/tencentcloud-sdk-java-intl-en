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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewFilter extends AbstractModel {

    /**
    * View name for rule effectiveness
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * View-level DDL/DML Filter Rule
    */
    @SerializedName("OpFilter")
    @Expose
    private OpFilter OpFilter;

    /**
     * Get View name for rule effectiveness 
     * @return ViewName View name for rule effectiveness
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set View name for rule effectiveness
     * @param ViewName View name for rule effectiveness
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get View-level DDL/DML Filter Rule 
     * @return OpFilter View-level DDL/DML Filter Rule
     */
    public OpFilter getOpFilter() {
        return this.OpFilter;
    }

    /**
     * Set View-level DDL/DML Filter Rule
     * @param OpFilter View-level DDL/DML Filter Rule
     */
    public void setOpFilter(OpFilter OpFilter) {
        this.OpFilter = OpFilter;
    }

    public ViewFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewFilter(ViewFilter source) {
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.OpFilter != null) {
            this.OpFilter = new OpFilter(source.OpFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamObj(map, prefix + "OpFilter.", this.OpFilter);

    }
}

