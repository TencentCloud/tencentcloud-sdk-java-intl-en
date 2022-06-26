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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGeneralResourceQuotasRequest extends AbstractModel{

    /**
    * List of resource names. Valid values: USER_KEY_PAIR, INSTANCE, SNAPSHOT.
    */
    @SerializedName("ResourceNames")
    @Expose
    private String [] ResourceNames;

    /**
     * Get List of resource names. Valid values: USER_KEY_PAIR, INSTANCE, SNAPSHOT. 
     * @return ResourceNames List of resource names. Valid values: USER_KEY_PAIR, INSTANCE, SNAPSHOT.
     */
    public String [] getResourceNames() {
        return this.ResourceNames;
    }

    /**
     * Set List of resource names. Valid values: USER_KEY_PAIR, INSTANCE, SNAPSHOT.
     * @param ResourceNames List of resource names. Valid values: USER_KEY_PAIR, INSTANCE, SNAPSHOT.
     */
    public void setResourceNames(String [] ResourceNames) {
        this.ResourceNames = ResourceNames;
    }

    public DescribeGeneralResourceQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralResourceQuotasRequest(DescribeGeneralResourceQuotasRequest source) {
        if (source.ResourceNames != null) {
            this.ResourceNames = new String[source.ResourceNames.length];
            for (int i = 0; i < source.ResourceNames.length; i++) {
                this.ResourceNames[i] = new String(source.ResourceNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceNames.", this.ResourceNames);

    }
}

