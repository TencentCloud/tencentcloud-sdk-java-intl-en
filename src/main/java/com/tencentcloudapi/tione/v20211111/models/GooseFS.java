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

public class GooseFS extends AbstractModel {

    /**
    * GooseFS instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * GooseFS type, including GooseFS and GooseFSx.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Path to mount the GooseFSx instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * GooseFS namespace.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
     * Get GooseFS instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id GooseFS instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set GooseFS instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id GooseFS instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get GooseFS type, including GooseFS and GooseFSx.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type GooseFS type, including GooseFS and GooseFSx.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set GooseFS type, including GooseFS and GooseFSx.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type GooseFS type, including GooseFS and GooseFSx.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Path to mount the GooseFSx instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Path to mount the GooseFSx instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path to mount the GooseFSx instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Path to mount the GooseFSx instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get GooseFS namespace.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NameSpace GooseFS namespace.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set GooseFS namespace.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NameSpace GooseFS namespace.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    public GooseFS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFS(GooseFS source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);

    }
}

