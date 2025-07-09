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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterObject extends AbstractModel {

    /**
    * The attribute name. If more than one Filter exists, the logical relation between these Filters is `AND`.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The attribute value. If there are multiple Values for one Filter, the logical relation between these Values under the same Filter is `OR`.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get The attribute name. If more than one Filter exists, the logical relation between these Filters is `AND`. 
     * @return Name The attribute name. If more than one Filter exists, the logical relation between these Filters is `AND`.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The attribute name. If more than one Filter exists, the logical relation between these Filters is `AND`.
     * @param Name The attribute name. If more than one Filter exists, the logical relation between these Filters is `AND`.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The attribute value. If there are multiple Values for one Filter, the logical relation between these Values under the same Filter is `OR`. 
     * @return Values The attribute value. If there are multiple Values for one Filter, the logical relation between these Values under the same Filter is `OR`.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set The attribute value. If there are multiple Values for one Filter, the logical relation between these Values under the same Filter is `OR`.
     * @param Values The attribute value. If there are multiple Values for one Filter, the logical relation between these Values under the same Filter is `OR`.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public FilterObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterObject(FilterObject source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

