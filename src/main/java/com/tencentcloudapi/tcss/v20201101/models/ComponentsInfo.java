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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentsInfo extends AbstractModel {

    /**
    * Component name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Component version information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get Component name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Component Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Component Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Component version information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Component version information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Component version information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public ComponentsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentsInfo(ComponentsInfo source) {
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

