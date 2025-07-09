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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachDisksRequest extends AbstractModel {

    /**
    * List of cloud disk IDs.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specify whether to renew an instance automatically when it expires. Values: 

`NOTIFY_AND_AUTO_RENEW`: Trigger expiration notification and renew automatically; `NOTIFY_AND_MANUAL_RENEW`: Trigger expiration notification but do not renew; `DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not trigger the notification and do not renew.

Default: `NOTIFY_AND_MANUAL_RENEW`. If `NOTIFY_AND_AUTO_RENEW` is specified, the instance is automatically renewed on a monthly basis when the account balance is sufficient.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get List of cloud disk IDs. 
     * @return DiskIds List of cloud disk IDs.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set List of cloud disk IDs.
     * @param DiskIds List of cloud disk IDs.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specify whether to renew an instance automatically when it expires. Values: 

`NOTIFY_AND_AUTO_RENEW`: Trigger expiration notification and renew automatically; `NOTIFY_AND_MANUAL_RENEW`: Trigger expiration notification but do not renew; `DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not trigger the notification and do not renew.

Default: `NOTIFY_AND_MANUAL_RENEW`. If `NOTIFY_AND_AUTO_RENEW` is specified, the instance is automatically renewed on a monthly basis when the account balance is sufficient. 
     * @return RenewFlag Specify whether to renew an instance automatically when it expires. Values: 

`NOTIFY_AND_AUTO_RENEW`: Trigger expiration notification and renew automatically; `NOTIFY_AND_MANUAL_RENEW`: Trigger expiration notification but do not renew; `DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not trigger the notification and do not renew.

Default: `NOTIFY_AND_MANUAL_RENEW`. If `NOTIFY_AND_AUTO_RENEW` is specified, the instance is automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Specify whether to renew an instance automatically when it expires. Values: 

`NOTIFY_AND_AUTO_RENEW`: Trigger expiration notification and renew automatically; `NOTIFY_AND_MANUAL_RENEW`: Trigger expiration notification but do not renew; `DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not trigger the notification and do not renew.

Default: `NOTIFY_AND_MANUAL_RENEW`. If `NOTIFY_AND_AUTO_RENEW` is specified, the instance is automatically renewed on a monthly basis when the account balance is sufficient.
     * @param RenewFlag Specify whether to renew an instance automatically when it expires. Values: 

`NOTIFY_AND_AUTO_RENEW`: Trigger expiration notification and renew automatically; `NOTIFY_AND_MANUAL_RENEW`: Trigger expiration notification but do not renew; `DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not trigger the notification and do not renew.

Default: `NOTIFY_AND_MANUAL_RENEW`. If `NOTIFY_AND_AUTO_RENEW` is specified, the instance is automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public AttachDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachDisksRequest(AttachDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

