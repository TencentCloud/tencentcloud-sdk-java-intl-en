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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBInstanceList extends AbstractModel{

    /**
    * The region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The list of TCB environments.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Environments")
    @Expose
    private TCBEnvironments [] Environments;

    /**
     * Get The region. 
     * @return Region The region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region.
     * @param Region The region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The list of TCB environments.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Environments The list of TCB environments.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TCBEnvironments [] getEnvironments() {
        return this.Environments;
    }

    /**
     * Set The list of TCB environments.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Environments The list of TCB environments.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironments(TCBEnvironments [] Environments) {
        this.Environments = Environments;
    }

    public TCBInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBInstanceList(TCBInstanceList source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Environments != null) {
            this.Environments = new TCBEnvironments[source.Environments.length];
            for (int i = 0; i < source.Environments.length; i++) {
                this.Environments[i] = new TCBEnvironments(source.Environments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Environments.", this.Environments);

    }
}

