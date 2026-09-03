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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalDisk extends AbstractModel {

    /**
    * Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Local path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
     * Get Node ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Local path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocalPath Local path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Local path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocalPath Local path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    public LocalDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalDisk(LocalDisk source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);

    }
}

