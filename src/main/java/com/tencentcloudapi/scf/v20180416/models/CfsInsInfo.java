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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfsInsInfo extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User group id.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * File system instance id
    */
    @SerializedName("CfsId")
    @Expose
    private String CfsId;

    /**
    * File system mount point id
    */
    @SerializedName("MountInsId")
    @Expose
    private String MountInsId;

    /**
    * Local mount point
    */
    @SerializedName("LocalMountDir")
    @Expose
    private String LocalMountDir;

    /**
    * Remote mount point.
    */
    @SerializedName("RemoteMountDir")
    @Expose
    private String RemoteMountDir;

    /**
    * File system ip. No need to specify when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * VPC id where the file system is located. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MountVpcId")
    @Expose
    private String MountVpcId;

    /**
    * Subnet id of the private network where the file system resides. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MountSubnetId")
    @Expose
    private String MountSubnetId;

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User group id. 
     * @return UserGroupId User group id.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User group id.
     * @param UserGroupId User group id.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get File system instance id 
     * @return CfsId File system instance id
     */
    public String getCfsId() {
        return this.CfsId;
    }

    /**
     * Set File system instance id
     * @param CfsId File system instance id
     */
    public void setCfsId(String CfsId) {
        this.CfsId = CfsId;
    }

    /**
     * Get File system mount point id 
     * @return MountInsId File system mount point id
     */
    public String getMountInsId() {
        return this.MountInsId;
    }

    /**
     * Set File system mount point id
     * @param MountInsId File system mount point id
     */
    public void setMountInsId(String MountInsId) {
        this.MountInsId = MountInsId;
    }

    /**
     * Get Local mount point 
     * @return LocalMountDir Local mount point
     */
    public String getLocalMountDir() {
        return this.LocalMountDir;
    }

    /**
     * Set Local mount point
     * @param LocalMountDir Local mount point
     */
    public void setLocalMountDir(String LocalMountDir) {
        this.LocalMountDir = LocalMountDir;
    }

    /**
     * Get Remote mount point. 
     * @return RemoteMountDir Remote mount point.
     */
    public String getRemoteMountDir() {
        return this.RemoteMountDir;
    }

    /**
     * Set Remote mount point.
     * @param RemoteMountDir Remote mount point.
     */
    public void setRemoteMountDir(String RemoteMountDir) {
        this.RemoteMountDir = RemoteMountDir;
    }

    /**
     * Get File system ip. No need to specify when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpAddress File system ip. No need to specify when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set File system ip. No need to specify when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpAddress File system ip. No need to specify when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get VPC id where the file system is located. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MountVpcId VPC id where the file system is located. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMountVpcId() {
        return this.MountVpcId;
    }

    /**
     * Set VPC id where the file system is located. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MountVpcId VPC id where the file system is located. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMountVpcId(String MountVpcId) {
        this.MountVpcId = MountVpcId;
    }

    /**
     * Get Subnet id of the private network where the file system resides. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MountSubnetId Subnet id of the private network where the file system resides. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMountSubnetId() {
        return this.MountSubnetId;
    }

    /**
     * Set Subnet id of the private network where the file system resides. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MountSubnetId Subnet id of the private network where the file system resides. Not required when configuring cfs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMountSubnetId(String MountSubnetId) {
        this.MountSubnetId = MountSubnetId;
    }

    public CfsInsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CfsInsInfo(CfsInsInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.CfsId != null) {
            this.CfsId = new String(source.CfsId);
        }
        if (source.MountInsId != null) {
            this.MountInsId = new String(source.MountInsId);
        }
        if (source.LocalMountDir != null) {
            this.LocalMountDir = new String(source.LocalMountDir);
        }
        if (source.RemoteMountDir != null) {
            this.RemoteMountDir = new String(source.RemoteMountDir);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.MountVpcId != null) {
            this.MountVpcId = new String(source.MountVpcId);
        }
        if (source.MountSubnetId != null) {
            this.MountSubnetId = new String(source.MountSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "CfsId", this.CfsId);
        this.setParamSimple(map, prefix + "MountInsId", this.MountInsId);
        this.setParamSimple(map, prefix + "LocalMountDir", this.LocalMountDir);
        this.setParamSimple(map, prefix + "RemoteMountDir", this.RemoteMountDir);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "MountVpcId", this.MountVpcId);
        this.setParamSimple(map, prefix + "MountSubnetId", this.MountSubnetId);

    }
}

