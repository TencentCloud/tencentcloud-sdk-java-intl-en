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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Revalidate extends AbstractModel{

    /**
    * Whether to always forward to the origin server for verification. Valid values: on, off
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Forwards to the origin server for verification only for specific request path
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Whether to always forward to the origin server for verification. Valid values: on, off
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Switch Whether to always forward to the origin server for verification. Valid values: on, off
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to always forward to the origin server for verification. Valid values: on, off
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Switch Whether to always forward to the origin server for verification. Valid values: on, off
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Forwards to the origin server for verification only for specific request path
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Path Forwards to the origin server for verification only for specific request path
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Forwards to the origin server for verification only for specific request path
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Path Forwards to the origin server for verification only for specific request path
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public Revalidate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Revalidate(Revalidate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

