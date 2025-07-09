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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetWebLocationPath extends AbstractModel {

    /**
    * Virtual path
    */
    @SerializedName("VirtualPath")
    @Expose
    private String VirtualPath;

    /**
    * Physical path
    */
    @SerializedName("RealPath")
    @Expose
    private String RealPath;

    /**
    * File owner
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * File group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * File permission
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get Virtual path 
     * @return VirtualPath Virtual path
     */
    public String getVirtualPath() {
        return this.VirtualPath;
    }

    /**
     * Set Virtual path
     * @param VirtualPath Virtual path
     */
    public void setVirtualPath(String VirtualPath) {
        this.VirtualPath = VirtualPath;
    }

    /**
     * Get Physical path 
     * @return RealPath Physical path
     */
    public String getRealPath() {
        return this.RealPath;
    }

    /**
     * Set Physical path
     * @param RealPath Physical path
     */
    public void setRealPath(String RealPath) {
        this.RealPath = RealPath;
    }

    /**
     * Get File owner 
     * @return User File owner
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set File owner
     * @param User File owner
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get File group 
     * @return Group File group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set File group
     * @param Group File group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get File permission 
     * @return Permission File permission
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set File permission
     * @param Permission File permission
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public AssetWebLocationPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebLocationPath(AssetWebLocationPath source) {
        if (source.VirtualPath != null) {
            this.VirtualPath = new String(source.VirtualPath);
        }
        if (source.RealPath != null) {
            this.RealPath = new String(source.RealPath);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VirtualPath", this.VirtualPath);
        this.setParamSimple(map, prefix + "RealPath", this.RealPath);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

