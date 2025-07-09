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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystem extends AbstractModel {

    /**
    * Resource owner `AppId`
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

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
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * File system block size (in bytes)
    */
    @SerializedName("BlockSize")
    @Expose
    private Long BlockSize;

    /**
    * File system capacity (in bytes)
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * File system status (1: creating; 2: created successfully; 3: failed to create)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * List of superuser names
    */
    @SerializedName("SuperUsers")
    @Expose
    private String [] SuperUsers;

    /**
    * POSIX permission control
    */
    @SerializedName("PosixAcl")
    @Expose
    private Boolean PosixAcl;

    /**
    * Whether to enable verification of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EnableRanger")
    @Expose
    private Boolean EnableRanger;

    /**
    * List of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RangerServiceAddresses")
    @Expose
    private String [] RangerServiceAddresses;

    /**
     * Get Resource owner `AppId` 
     * @return AppId Resource owner `AppId`
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Resource owner `AppId`
     * @param AppId Resource owner `AppId`
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

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
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get File system block size (in bytes) 
     * @return BlockSize File system block size (in bytes)
     */
    public Long getBlockSize() {
        return this.BlockSize;
    }

    /**
     * Set File system block size (in bytes)
     * @param BlockSize File system block size (in bytes)
     */
    public void setBlockSize(Long BlockSize) {
        this.BlockSize = BlockSize;
    }

    /**
     * Get File system capacity (in bytes) 
     * @return CapacityQuota File system capacity (in bytes)
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set File system capacity (in bytes)
     * @param CapacityQuota File system capacity (in bytes)
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * Get File system status (1: creating; 2: created successfully; 3: failed to create) 
     * @return Status File system status (1: creating; 2: created successfully; 3: failed to create)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set File system status (1: creating; 2: created successfully; 3: failed to create)
     * @param Status File system status (1: creating; 2: created successfully; 3: failed to create)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get List of superuser names 
     * @return SuperUsers List of superuser names
     */
    public String [] getSuperUsers() {
        return this.SuperUsers;
    }

    /**
     * Set List of superuser names
     * @param SuperUsers List of superuser names
     */
    public void setSuperUsers(String [] SuperUsers) {
        this.SuperUsers = SuperUsers;
    }

    /**
     * Get POSIX permission control 
     * @return PosixAcl POSIX permission control
     */
    public Boolean getPosixAcl() {
        return this.PosixAcl;
    }

    /**
     * Set POSIX permission control
     * @param PosixAcl POSIX permission control
     */
    public void setPosixAcl(Boolean PosixAcl) {
        this.PosixAcl = PosixAcl;
    }

    /**
     * Get Whether to enable verification of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found. 
     * @return EnableRanger Whether to enable verification of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Boolean getEnableRanger() {
        return this.EnableRanger;
    }

    /**
     * Set Whether to enable verification of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
     * @param EnableRanger Whether to enable verification of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setEnableRanger(Boolean EnableRanger) {
        this.EnableRanger = EnableRanger;
    }

    /**
     * Get List of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found. 
     * @return RangerServiceAddresses List of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String [] getRangerServiceAddresses() {
        return this.RangerServiceAddresses;
    }

    /**
     * Set List of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
     * @param RangerServiceAddresses List of Ranger service addresses
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setRangerServiceAddresses(String [] RangerServiceAddresses) {
        this.RangerServiceAddresses = RangerServiceAddresses;
    }

    public FileSystem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystem(FileSystem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BlockSize != null) {
            this.BlockSize = new Long(source.BlockSize);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.EnableRanger != null) {
            this.EnableRanger = new Boolean(source.EnableRanger);
        }
        if (source.RangerServiceAddresses != null) {
            this.RangerServiceAddresses = new String[source.RangerServiceAddresses.length];
            for (int i = 0; i < source.RangerServiceAddresses.length; i++) {
                this.RangerServiceAddresses[i] = new String(source.RangerServiceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BlockSize", this.BlockSize);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SuperUsers.", this.SuperUsers);
        this.setParamSimple(map, prefix + "PosixAcl", this.PosixAcl);
        this.setParamSimple(map, prefix + "EnableRanger", this.EnableRanger);
        this.setParamArraySimple(map, prefix + "RangerServiceAddresses.", this.RangerServiceAddresses);

    }
}

