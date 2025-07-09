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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentBasicRestartInfo extends AbstractModel {

    /**
    * The process name (required), such as NameNode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * The target IP list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get The process name (required), such as NameNode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentName The process name (required), such as NameNode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set The process name (required), such as NameNode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentName The process name (required), such as NameNode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get The target IP list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpList The target IP list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set The target IP list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpList The target IP list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public ComponentBasicRestartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentBasicRestartInfo(ComponentBasicRestartInfo source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

