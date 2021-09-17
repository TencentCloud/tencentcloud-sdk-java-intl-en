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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFileSystemRequest extends AbstractModel{

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * File system name
    */
    @SerializedName("FileSystemName")
    @Expose
    private String FileSystemName;

    /**
    * File system description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
Note: the file system capacity after change cannot be smaller than the currently used capacity
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * List of superuser names, which can be an empty array
    */
    @SerializedName("SuperUsers")
    @Expose
    private String [] SuperUsers;

    /**
    * Whether to verify POSIX ACL
    */
    @SerializedName("PosixAcl")
    @Expose
    private Boolean PosixAcl;

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

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
     * Get File system description 
     * @return Description File system description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set File system description
     * @param Description File system description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
Note: the file system capacity after change cannot be smaller than the currently used capacity 
     * @return CapacityQuota File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
Note: the file system capacity after change cannot be smaller than the currently used capacity
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
Note: the file system capacity after change cannot be smaller than the currently used capacity
     * @param CapacityQuota File system capacity (in bytes), which can range from 1 GB to 1 PB and must be an integer multiple of 1 GB
Note: the file system capacity after change cannot be smaller than the currently used capacity
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * Get List of superuser names, which can be an empty array 
     * @return SuperUsers List of superuser names, which can be an empty array
     */
    public String [] getSuperUsers() {
        return this.SuperUsers;
    }

    /**
     * Set List of superuser names, which can be an empty array
     * @param SuperUsers List of superuser names, which can be an empty array
     */
    public void setSuperUsers(String [] SuperUsers) {
        this.SuperUsers = SuperUsers;
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

    public ModifyFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileSystemRequest(ModifyFileSystemRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
        }
        if (source.SuperUsers != null) {
            this.SuperUsers = new String[source.SuperUsers.length];
            for (int i = 0; i < source.SuperUsers.length; i++) {
                this.SuperUsers[i] = new String(source.SuperUsers[i]);
            }
        }
        if (source.PosixAcl != null) {
            this.PosixAcl = new Boolean(source.PosixAcl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamArraySimple(map, prefix + "SuperUsers.", this.SuperUsers);
        this.setParamSimple(map, prefix + "PosixAcl", this.PosixAcl);

    }
}

