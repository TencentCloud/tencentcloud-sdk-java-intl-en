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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileSystemRequest extends AbstractModel {

    /**
    * File system name
    */
    @SerializedName("FileSystemName")
    @Expose
    private String FileSystemName;

    /**
    * File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * Whether to verify POSIX ACL
    */
    @SerializedName("PosixAcl")
    @Expose
    private Boolean PosixAcl;

    /**
    * File system description, which is an empty string by default
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * List of superuser names, which is an empty array by default
    */
    @SerializedName("SuperUsers")
    @Expose
    private String [] SuperUsers;

    /**
    * Username of the root directory Inode, which is `hadoop` by default
    */
    @SerializedName("RootInodeUser")
    @Expose
    private String RootInodeUser;

    /**
    * Group name of the root directory Inode, which is `supergroup` by default
    */
    @SerializedName("RootInodeGroup")
    @Expose
    private String RootInodeGroup;

    /**
    * Whether to enable verification of Ranger service addresses
    */
    @SerializedName("EnableRanger")
    @Expose
    private Boolean EnableRanger;

    /**
    * List of Ranger service addresses (empty array by default)
    */
    @SerializedName("RangerServiceAddresses")
    @Expose
    private String [] RangerServiceAddresses;

    /**
    * Multiple resource tags, which can be an empty array
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get File system name 
     * @return FileSystemName File system name
     */
    public String getFileSystemName() {
        return this.FileSystemName;
    }

    /**
     * Set File system name
     * @param FileSystemName File system name
     */
    public void setFileSystemName(String FileSystemName) {
        this.FileSystemName = FileSystemName;
    }

    /**
     * Get File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB 
     * @return CapacityQuota File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
     * @param CapacityQuota File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * Get Whether to verify POSIX ACL 
     * @return PosixAcl Whether to verify POSIX ACL
     */
    public Boolean getPosixAcl() {
        return this.PosixAcl;
    }

    /**
     * Set Whether to verify POSIX ACL
     * @param PosixAcl Whether to verify POSIX ACL
     */
    public void setPosixAcl(Boolean PosixAcl) {
        this.PosixAcl = PosixAcl;
    }

    /**
     * Get File system description, which is an empty string by default 
     * @return Description File system description, which is an empty string by default
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set File system description, which is an empty string by default
     * @param Description File system description, which is an empty string by default
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get List of superuser names, which is an empty array by default 
     * @return SuperUsers List of superuser names, which is an empty array by default
     */
    public String [] getSuperUsers() {
        return this.SuperUsers;
    }

    /**
     * Set List of superuser names, which is an empty array by default
     * @param SuperUsers List of superuser names, which is an empty array by default
     */
    public void setSuperUsers(String [] SuperUsers) {
        this.SuperUsers = SuperUsers;
    }

    /**
     * Get Username of the root directory Inode, which is `hadoop` by default 
     * @return RootInodeUser Username of the root directory Inode, which is `hadoop` by default
     */
    public String getRootInodeUser() {
        return this.RootInodeUser;
    }

    /**
     * Set Username of the root directory Inode, which is `hadoop` by default
     * @param RootInodeUser Username of the root directory Inode, which is `hadoop` by default
     */
    public void setRootInodeUser(String RootInodeUser) {
        this.RootInodeUser = RootInodeUser;
    }

    /**
     * Get Group name of the root directory Inode, which is `supergroup` by default 
     * @return RootInodeGroup Group name of the root directory Inode, which is `supergroup` by default
     */
    public String getRootInodeGroup() {
        return this.RootInodeGroup;
    }

    /**
     * Set Group name of the root directory Inode, which is `supergroup` by default
     * @param RootInodeGroup Group name of the root directory Inode, which is `supergroup` by default
     */
    public void setRootInodeGroup(String RootInodeGroup) {
        this.RootInodeGroup = RootInodeGroup;
    }

    /**
     * Get Whether to enable verification of Ranger service addresses 
     * @return EnableRanger Whether to enable verification of Ranger service addresses
     */
    public Boolean getEnableRanger() {
        return this.EnableRanger;
    }

    /**
     * Set Whether to enable verification of Ranger service addresses
     * @param EnableRanger Whether to enable verification of Ranger service addresses
     */
    public void setEnableRanger(Boolean EnableRanger) {
        this.EnableRanger = EnableRanger;
    }

    /**
     * Get List of Ranger service addresses (empty array by default) 
     * @return RangerServiceAddresses List of Ranger service addresses (empty array by default)
     */
    public String [] getRangerServiceAddresses() {
        return this.RangerServiceAddresses;
    }

    /**
     * Set List of Ranger service addresses (empty array by default)
     * @param RangerServiceAddresses List of Ranger service addresses (empty array by default)
     */
    public void setRangerServiceAddresses(String [] RangerServiceAddresses) {
        this.RangerServiceAddresses = RangerServiceAddresses;
    }

    /**
     * Get Multiple resource tags, which can be an empty array 
     * @return Tags Multiple resource tags, which can be an empty array
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Multiple resource tags, which can be an empty array
     * @param Tags Multiple resource tags, which can be an empty array
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileSystemRequest(CreateFileSystemRequest source) {
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
        }
        if (source.PosixAcl != null) {
            this.PosixAcl = new Boolean(source.PosixAcl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SuperUsers != null) {
            this.SuperUsers = new String[source.SuperUsers.length];
            for (int i = 0; i < source.SuperUsers.length; i++) {
                this.SuperUsers[i] = new String(source.SuperUsers[i]);
            }
        }
        if (source.RootInodeUser != null) {
            this.RootInodeUser = new String(source.RootInodeUser);
        }
        if (source.RootInodeGroup != null) {
            this.RootInodeGroup = new String(source.RootInodeGroup);
        }
        if (source.EnableRanger != null) {
            this.EnableRanger = new Boolean(source.EnableRanger);
        }
        if (source.RangerServiceAddresses != null) {
            this.RangerServiceAddresses = new String[source.RangerServiceAddresses.length];
            for (int i = 0; i < source.RangerServiceAddresses.length; i++) {
                this.RangerServiceAddresses[i] = new String(source.RangerServiceAddresses[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamSimple(map, prefix + "PosixAcl", this.PosixAcl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "SuperUsers.", this.SuperUsers);
        this.setParamSimple(map, prefix + "RootInodeUser", this.RootInodeUser);
        this.setParamSimple(map, prefix + "RootInodeGroup", this.RootInodeGroup);
        this.setParamSimple(map, prefix + "EnableRanger", this.EnableRanger);
        this.setParamArraySimple(map, prefix + "RangerServiceAddresses.", this.RangerServiceAddresses);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

