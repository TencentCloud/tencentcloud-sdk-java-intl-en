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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfsInsInfo extends AbstractModel{

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User group ID
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * CFS instance ID
    */
    @SerializedName("CfsId")
    @Expose
    private String CfsId;

    /**
    * File system mount target ID
    */
    @SerializedName("MountInsId")
    @Expose
    private String MountInsId;

    /**
    * Local mount target
    */
    @SerializedName("LocalMountDir")
    @Expose
    private String LocalMountDir;

    /**
    * Remote mount target
    */
    @SerializedName("RemoteMountDir")
    @Expose
    private String RemoteMountDir;

    /**
    * File system IP, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * VPC ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MountVpcId")
    @Expose
    private String MountVpcId;

    /**
    * VPC subnet ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get User group ID 
     * @return UserGroupId User group ID
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User group ID
     * @param UserGroupId User group ID
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get CFS instance ID 
     * @return CfsId CFS instance ID
     */
    public String getCfsId() {
        return this.CfsId;
    }

    /**
     * Set CFS instance ID
     * @param CfsId CFS instance ID
     */
    public void setCfsId(String CfsId) {
        this.CfsId = CfsId;
    }

    /**
     * Get File system mount target ID 
     * @return MountInsId File system mount target ID
     */
    public String getMountInsId() {
        return this.MountInsId;
    }

    /**
     * Set File system mount target ID
     * @param MountInsId File system mount target ID
     */
    public void setMountInsId(String MountInsId) {
        this.MountInsId = MountInsId;
    }

    /**
     * Get Local mount target 
     * @return LocalMountDir Local mount target
     */
    public String getLocalMountDir() {
        return this.LocalMountDir;
    }

    /**
     * Set Local mount target
     * @param LocalMountDir Local mount target
     */
    public void setLocalMountDir(String LocalMountDir) {
        this.LocalMountDir = LocalMountDir;
    }

    /**
     * Get Remote mount target 
     * @return RemoteMountDir Remote mount target
     */
    public String getRemoteMountDir() {
        return this.RemoteMountDir;
    }

    /**
     * Set Remote mount target
     * @param RemoteMountDir Remote mount target
     */
    public void setRemoteMountDir(String RemoteMountDir) {
        this.RemoteMountDir = RemoteMountDir;
    }

    /**
     * Get File system IP, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpAddress File system IP, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set File system IP, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpAddress File system IP, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get VPC ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MountVpcId VPC ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMountVpcId() {
        return this.MountVpcId;
    }

    /**
     * Set VPC ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MountVpcId VPC ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMountVpcId(String MountVpcId) {
        this.MountVpcId = MountVpcId;
    }

    /**
     * Get VPC subnet ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MountSubnetId VPC subnet ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMountSubnetId() {
        return this.MountSubnetId;
    }

    /**
     * Set VPC subnet ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MountSubnetId VPC subnet ID of file system, which is not required when you configure CFS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMountSubnetId(String MountSubnetId) {
        this.MountSubnetId = MountSubnetId;
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

