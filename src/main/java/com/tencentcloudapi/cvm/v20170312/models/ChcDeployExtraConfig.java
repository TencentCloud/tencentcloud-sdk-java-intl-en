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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChcDeployExtraConfig extends AbstractModel {

    /**
    * MinIO type: whether to use Tencent Cloud's minios or the customer's own minios.
    */
    @SerializedName("MiniOsType")
    @Expose
    private String MiniOsType;

    /**
    * Server architecture and boot mode. Value: x86_legacy, arm_uefi.
    */
    @SerializedName("BootType")
    @Expose
    private String BootType;

    /**
    * The boot file used by PXE. Default: pxelinux.0.
    */
    @SerializedName("BootFile")
    @Expose
    private String BootFile;

    /**
    * tftp server ip address.
    */
    @SerializedName("NextServerAddress")
    @Expose
    private String NextServerAddress;

    /**
     * Get MinIO type: whether to use Tencent Cloud's minios or the customer's own minios. 
     * @return MiniOsType MinIO type: whether to use Tencent Cloud's minios or the customer's own minios.
     */
    public String getMiniOsType() {
        return this.MiniOsType;
    }

    /**
     * Set MinIO type: whether to use Tencent Cloud's minios or the customer's own minios.
     * @param MiniOsType MinIO type: whether to use Tencent Cloud's minios or the customer's own minios.
     */
    public void setMiniOsType(String MiniOsType) {
        this.MiniOsType = MiniOsType;
    }

    /**
     * Get Server architecture and boot mode. Value: x86_legacy, arm_uefi. 
     * @return BootType Server architecture and boot mode. Value: x86_legacy, arm_uefi.
     */
    public String getBootType() {
        return this.BootType;
    }

    /**
     * Set Server architecture and boot mode. Value: x86_legacy, arm_uefi.
     * @param BootType Server architecture and boot mode. Value: x86_legacy, arm_uefi.
     */
    public void setBootType(String BootType) {
        this.BootType = BootType;
    }

    /**
     * Get The boot file used by PXE. Default: pxelinux.0. 
     * @return BootFile The boot file used by PXE. Default: pxelinux.0.
     */
    public String getBootFile() {
        return this.BootFile;
    }

    /**
     * Set The boot file used by PXE. Default: pxelinux.0.
     * @param BootFile The boot file used by PXE. Default: pxelinux.0.
     */
    public void setBootFile(String BootFile) {
        this.BootFile = BootFile;
    }

    /**
     * Get tftp server ip address. 
     * @return NextServerAddress tftp server ip address.
     */
    public String getNextServerAddress() {
        return this.NextServerAddress;
    }

    /**
     * Set tftp server ip address.
     * @param NextServerAddress tftp server ip address.
     */
    public void setNextServerAddress(String NextServerAddress) {
        this.NextServerAddress = NextServerAddress;
    }

    public ChcDeployExtraConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcDeployExtraConfig(ChcDeployExtraConfig source) {
        if (source.MiniOsType != null) {
            this.MiniOsType = new String(source.MiniOsType);
        }
        if (source.BootType != null) {
            this.BootType = new String(source.BootType);
        }
        if (source.BootFile != null) {
            this.BootFile = new String(source.BootFile);
        }
        if (source.NextServerAddress != null) {
            this.NextServerAddress = new String(source.NextServerAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniOsType", this.MiniOsType);
        this.setParamSimple(map, prefix + "BootType", this.BootType);
        this.setParamSimple(map, prefix + "BootFile", this.BootFile);
        this.setParamSimple(map, prefix + "NextServerAddress", this.NextServerAddress);

    }
}

