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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentConfig extends AbstractModel {

    /**
    * VPC configuration
    */
    @SerializedName("VPCOption")
    @Expose
    private VPCOption VPCOption;

    /**
    * Computing cluster configuration
    */
    @SerializedName("ClusterOption")
    @Expose
    private ClusterOption ClusterOption;

    /**
    * Database configuration
    */
    @SerializedName("DatabaseOption")
    @Expose
    private DatabaseOption DatabaseOption;

    /**
    * Storage configuration
    */
    @SerializedName("StorageOption")
    @Expose
    private StorageOption StorageOption;

    /**
    * CVM configuration
    */
    @SerializedName("CVMOption")
    @Expose
    private CVMOption CVMOption;

    /**
    * Security group configuration
    */
    @SerializedName("SecurityGroupOption")
    @Expose
    private SecurityGroupOption SecurityGroupOption;

    /**
     * Get VPC configuration 
     * @return VPCOption VPC configuration
     */
    public VPCOption getVPCOption() {
        return this.VPCOption;
    }

    /**
     * Set VPC configuration
     * @param VPCOption VPC configuration
     */
    public void setVPCOption(VPCOption VPCOption) {
        this.VPCOption = VPCOption;
    }

    /**
     * Get Computing cluster configuration 
     * @return ClusterOption Computing cluster configuration
     */
    public ClusterOption getClusterOption() {
        return this.ClusterOption;
    }

    /**
     * Set Computing cluster configuration
     * @param ClusterOption Computing cluster configuration
     */
    public void setClusterOption(ClusterOption ClusterOption) {
        this.ClusterOption = ClusterOption;
    }

    /**
     * Get Database configuration 
     * @return DatabaseOption Database configuration
     */
    public DatabaseOption getDatabaseOption() {
        return this.DatabaseOption;
    }

    /**
     * Set Database configuration
     * @param DatabaseOption Database configuration
     */
    public void setDatabaseOption(DatabaseOption DatabaseOption) {
        this.DatabaseOption = DatabaseOption;
    }

    /**
     * Get Storage configuration 
     * @return StorageOption Storage configuration
     */
    public StorageOption getStorageOption() {
        return this.StorageOption;
    }

    /**
     * Set Storage configuration
     * @param StorageOption Storage configuration
     */
    public void setStorageOption(StorageOption StorageOption) {
        this.StorageOption = StorageOption;
    }

    /**
     * Get CVM configuration 
     * @return CVMOption CVM configuration
     */
    public CVMOption getCVMOption() {
        return this.CVMOption;
    }

    /**
     * Set CVM configuration
     * @param CVMOption CVM configuration
     */
    public void setCVMOption(CVMOption CVMOption) {
        this.CVMOption = CVMOption;
    }

    /**
     * Get Security group configuration 
     * @return SecurityGroupOption Security group configuration
     */
    public SecurityGroupOption getSecurityGroupOption() {
        return this.SecurityGroupOption;
    }

    /**
     * Set Security group configuration
     * @param SecurityGroupOption Security group configuration
     */
    public void setSecurityGroupOption(SecurityGroupOption SecurityGroupOption) {
        this.SecurityGroupOption = SecurityGroupOption;
    }

    public EnvironmentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentConfig(EnvironmentConfig source) {
        if (source.VPCOption != null) {
            this.VPCOption = new VPCOption(source.VPCOption);
        }
        if (source.ClusterOption != null) {
            this.ClusterOption = new ClusterOption(source.ClusterOption);
        }
        if (source.DatabaseOption != null) {
            this.DatabaseOption = new DatabaseOption(source.DatabaseOption);
        }
        if (source.StorageOption != null) {
            this.StorageOption = new StorageOption(source.StorageOption);
        }
        if (source.CVMOption != null) {
            this.CVMOption = new CVMOption(source.CVMOption);
        }
        if (source.SecurityGroupOption != null) {
            this.SecurityGroupOption = new SecurityGroupOption(source.SecurityGroupOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VPCOption.", this.VPCOption);
        this.setParamObj(map, prefix + "ClusterOption.", this.ClusterOption);
        this.setParamObj(map, prefix + "DatabaseOption.", this.DatabaseOption);
        this.setParamObj(map, prefix + "StorageOption.", this.StorageOption);
        this.setParamObj(map, prefix + "CVMOption.", this.CVMOption);
        this.setParamObj(map, prefix + "SecurityGroupOption.", this.SecurityGroupOption);

    }
}

