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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisksRenewFlagRequest extends AbstractModel{

    /**
    * IDs of one or more cloud disks to be operated.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Cloud disk renewal flag. Value range: <br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically. <br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but do not renew automatically. <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get IDs of one or more cloud disks to be operated. 
     * @return DiskIds IDs of one or more cloud disks to be operated.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set IDs of one or more cloud disks to be operated.
     * @param DiskIds IDs of one or more cloud disks to be operated.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Cloud disk renewal flag. Value range: <br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically. <br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but do not renew automatically. <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically. 
     * @return RenewFlag Cloud disk renewal flag. Value range: <br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically. <br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but do not renew automatically. <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Cloud disk renewal flag. Value range: <br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically. <br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but do not renew automatically. <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
     * @param RenewFlag Cloud disk renewal flag. Value range: <br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically. <br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but do not renew automatically. <br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

