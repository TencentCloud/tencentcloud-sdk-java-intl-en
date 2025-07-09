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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupLimitVpcItem extends AbstractModel {

    /**
    * The region of the VPC that corresponds to the download address of the backup file
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The list of VPCs that correspond to the download addresses of the backup files
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
     * Get The region of the VPC that corresponds to the download address of the backup file 
     * @return Region The region of the VPC that corresponds to the download address of the backup file
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of the VPC that corresponds to the download address of the backup file
     * @param Region The region of the VPC that corresponds to the download address of the backup file
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The list of VPCs that correspond to the download addresses of the backup files 
     * @return VpcList The list of VPCs that correspond to the download addresses of the backup files
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set The list of VPCs that correspond to the download addresses of the backup files
     * @param VpcList The list of VPCs that correspond to the download addresses of the backup files
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
    }

    public BackupLimitVpcItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupLimitVpcItem(BackupLimitVpcItem source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);

    }
}

