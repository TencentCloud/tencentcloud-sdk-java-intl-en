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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * Query field name Resource name: resourceName Resource ID: resourceId Resource type: resourceType Resource region: resourceRegion Deletion status: resourceDelete 0 not deleted, 1 deleted resourceregionandzone region/az
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value of the field to query
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Query field name Resource name: resourceName Resource ID: resourceId Resource type: resourceType Resource region: resourceRegion Deletion status: resourceDelete 0 not deleted, 1 deleted resourceregionandzone region/az 
     * @return Name Query field name Resource name: resourceName Resource ID: resourceId Resource type: resourceType Resource region: resourceRegion Deletion status: resourceDelete 0 not deleted, 1 deleted resourceregionandzone region/az
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Query field name Resource name: resourceName Resource ID: resourceId Resource type: resourceType Resource region: resourceRegion Deletion status: resourceDelete 0 not deleted, 1 deleted resourceregionandzone region/az
     * @param Name Query field name Resource name: resourceName Resource ID: resourceId Resource type: resourceType Resource region: resourceRegion Deletion status: resourceDelete 0 not deleted, 1 deleted resourceregionandzone region/az
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value of the field to query 
     * @return Values Value of the field to query
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Value of the field to query
     * @param Values Value of the field to query
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
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

