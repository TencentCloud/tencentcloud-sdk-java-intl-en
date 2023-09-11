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

public class TCBHostService extends AbstractModel{

    /**
    * The list of instances.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceList")
    @Expose
    private TCBHostInstance [] InstanceList;

    /**
    * The instance count.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get The list of instances.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceList The list of instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TCBHostInstance [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set The list of instances.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceList The list of instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceList(TCBHostInstance [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get The instance count.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount The instance count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The instance count.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount The instance count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public TCBHostService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBHostService(TCBHostService source) {
        if (source.InstanceList != null) {
            this.InstanceList = new TCBHostInstance[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new TCBHostInstance(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

