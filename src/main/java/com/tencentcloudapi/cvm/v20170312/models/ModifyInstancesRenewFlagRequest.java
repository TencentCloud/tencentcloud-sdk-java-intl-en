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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesRenewFlagRequest extends AbstractModel {

    /**
    * For one or more instance IDs to be operated, you can obtain the instance ID through the `instanceid` in the returned value from the API [describeinstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances that can be operated for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Auto-renewal flag. Valid values: <br><li>notify_and_auto_renew: Notifies of expiration and performs auto-renewal.</li><li>notify_and_manual_renew: Notifies of expiration but does not perform auto-renewal.</li><li>disable_notify_and_manual_renew: Not notifies of expiration nor perform auto-renewal.</li><br>If this parameter is specified to notify_and_auto_renew, the instance will be automatically renewed on a monthly basis after it expires when there is sufficient account balance.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get For one or more instance IDs to be operated, you can obtain the instance ID through the `instanceid` in the returned value from the API [describeinstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances that can be operated for each request is 100. 
     * @return InstanceIds For one or more instance IDs to be operated, you can obtain the instance ID through the `instanceid` in the returned value from the API [describeinstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances that can be operated for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set For one or more instance IDs to be operated, you can obtain the instance ID through the `instanceid` in the returned value from the API [describeinstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances that can be operated for each request is 100.
     * @param InstanceIds For one or more instance IDs to be operated, you can obtain the instance ID through the `instanceid` in the returned value from the API [describeinstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances that can be operated for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Auto-renewal flag. Valid values: <br><li>notify_and_auto_renew: Notifies of expiration and performs auto-renewal.</li><li>notify_and_manual_renew: Notifies of expiration but does not perform auto-renewal.</li><li>disable_notify_and_manual_renew: Not notifies of expiration nor perform auto-renewal.</li><br>If this parameter is specified to notify_and_auto_renew, the instance will be automatically renewed on a monthly basis after it expires when there is sufficient account balance. 
     * @return RenewFlag Auto-renewal flag. Valid values: <br><li>notify_and_auto_renew: Notifies of expiration and performs auto-renewal.</li><li>notify_and_manual_renew: Notifies of expiration but does not perform auto-renewal.</li><li>disable_notify_and_manual_renew: Not notifies of expiration nor perform auto-renewal.</li><br>If this parameter is specified to notify_and_auto_renew, the instance will be automatically renewed on a monthly basis after it expires when there is sufficient account balance.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values: <br><li>notify_and_auto_renew: Notifies of expiration and performs auto-renewal.</li><li>notify_and_manual_renew: Notifies of expiration but does not perform auto-renewal.</li><li>disable_notify_and_manual_renew: Not notifies of expiration nor perform auto-renewal.</li><br>If this parameter is specified to notify_and_auto_renew, the instance will be automatically renewed on a monthly basis after it expires when there is sufficient account balance.
     * @param RenewFlag Auto-renewal flag. Valid values: <br><li>notify_and_auto_renew: Notifies of expiration and performs auto-renewal.</li><li>notify_and_manual_renew: Notifies of expiration but does not perform auto-renewal.</li><li>disable_notify_and_manual_renew: Not notifies of expiration nor perform auto-renewal.</li><br>If this parameter is specified to notify_and_auto_renew, the instance will be automatically renewed on a monthly basis after it expires when there is sufficient account balance.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ModifyInstancesRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesRenewFlagRequest(ModifyInstancesRenewFlagRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

