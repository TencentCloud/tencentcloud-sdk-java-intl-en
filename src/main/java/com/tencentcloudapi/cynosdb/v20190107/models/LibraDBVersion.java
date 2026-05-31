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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraDBVersion extends AbstractModel {

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version tag
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Can be used this version
    */
    @SerializedName("HasPermission")
    @Expose
    private Boolean HasPermission;

    /**
     * Get Version 
     * @return Version Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
     * @param Version Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version tag 
     * @return Tag Version tag
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Version tag
     * @param Tag Version tag
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Can be used this version 
     * @return HasPermission Can be used this version
     */
    public Boolean getHasPermission() {
        return this.HasPermission;
    }

    /**
     * Set Can be used this version
     * @param HasPermission Can be used this version
     */
    public void setHasPermission(Boolean HasPermission) {
        this.HasPermission = HasPermission;
    }

    public LibraDBVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBVersion(LibraDBVersion source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.HasPermission != null) {
            this.HasPermission = new Boolean(source.HasPermission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "HasPermission", this.HasPermission);

    }
}

